---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/graceful-termination.html
title: Graceful termination • Akka HTTP
---

# Graceful termination • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Graceful termination

## Akka Coordinated Shutdown

[Coordinated shutdown](https://doc.akka.io/libraries/akka-core/2.10/coordinated-shutdown.html) is Akka’s managed way of shutting down multiple modules / sub\-systems (persistence, cluster, http etc) in a predictable and ordered fashion. For example, in a typical Akka application you will want to stop accepting new HTTP connections, and then shut down the cluster etc.

The recommended Akka HTTP server shutdown consists of three steps:

1. stop accepting new connections ([`ServerBinding.unbind`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html "akka.http.scaladsl.Http.ServerBinding")[`ServerBinding.unbind`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html "akka.http.javadsl.ServerBinding"))
2. try to finish handling of ongoing requests until the `hardTerminationDeadline` hits (see below for details)
3. close open connections ([`ServerBinding.terminate`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html "akka.http.scaladsl.Http.ServerBinding")[`ServerBinding.terminate`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html "akka.http.javadsl.ServerBinding"))

This recommended sequence can be added to Akka’s coordinated shutdown via [`ServerBinding.addToCoordinatedShutdown`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html "akka.http.scaladsl.Http.ServerBinding")[`ServerBinding.addToCoordinatedShutdown`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html "akka.http.javadsl.ServerBinding") like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ServerShutdownExampleSpec.scala#L30-L31 "Go to snippet source")val bindingFuture = Http().newServerAt("localhost", 8080).bind(routes)
  .map(_.addToCoordinatedShutdown(hardTerminationDeadline = 10.seconds))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/ServerShutdownExampleTest.java#L25-L29 "Go to snippet source")CompletionStage<ServerBinding> bindingFuture = Http
    .get(system)
    .newServerAt("localhost", 8080)
    .bind(routes)
    .thenApply(binding -> binding.addToCoordinatedShutdown(Duration.ofSeconds(10), system));
```

You may initiate the Akka shutdown via `ActorSystem.terminate()`, or `run` `runAll` on the `CoordinatedShutdown` extension and pass it a class implementing [`CoordinatedShutdown.Reason`](https://doc.akka.io/api/akka/2.10/akka/actor/CoordinatedShutdown$$Reason.html "akka.actor.CoordinatedShutdown.Reason")[`CoordinatedShutdown.Reason`](https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.Reason.html "akka.actor.CoordinatedShutdown.Reason") for informational purposes

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/ServerShutdownExampleSpec.scala#L35-L41 "Go to snippet source")// shut down with `ActorSystemTerminateReason`
system.terminate()

// or define a specific reason
case object UserInitiatedShutdown extends CoordinatedShutdown.Reason

CoordinatedShutdown(system).run(UserInitiatedShutdown)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/ServerShutdownExampleTest.java#L38-L49 "Go to snippet source")// shut down with `ActorSystemTerminateReason`
system.terminate();

// or define a specific reason
final class UserInitiatedShutdown implements CoordinatedShutdown.Reason {
    @Override
    public String toString() {
        return "UserInitiatedShutdown";
    }
}

CoordinatedShutdown.get(system).run(new UserInitiatedShutdown());
```

## Graceful termination using `ServerTerminator`

Akka HTTP provides two APIs to “stop” the server, either of them are available via the [`ServerBinding`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html "akka.http.javadsl.ServerBinding") [`ServerBinding`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html "akka.http.scaladsl.Http.ServerBinding") obtained from starting the server (by using any of the `bind...` methods on the [`Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http")[`Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html "akka.http.scaladsl.HttpExt") extension).

The first method, called `unbind()` causes the server to *stop accepting new connections*, however any existing connections that are still being used will remain active until the client chooses to close them. It only unbinds the port on which the http server has been listening. This allows HTTP server to finish streaming any responses that might be still in flight and eventually terminate the entire system. If your application uses long\-lived connections, this does mean that these can delay the termination of your system indefinitely.

A better and more graceful solution to terminate an Akka HTTP server is to use the [`ServerBinding.terminate(Duration)`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html#terminate-java.time.Duration- "akka.http.javadsl.ServerBinding") [`ServerBinding.terminate(FiniteDuration)`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html#terminate(FiniteDuration):Future[HttpTerminated] "akka.http.scaladsl.Http.ServerBinding") method, which not only performs the unbinding, but also handles replying to new incoming requests with (configurable) “terminating” HTTP responses. It also allows setting a deadline after which any connections that are still alive will be shut down forcefully. More precisely, termination works by following these steps:

First, the server port is unbound and no new connections will be accepted (same as invoking `unbind()`). Immediately the [`ServerBinding#whenTerminationSignalIssued`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html#whenTerminationSignalIssued-- "akka.http.javadsl.ServerBinding") `CompletionStage` [`ServerBinding#whenTerminationSignalIssued`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html#whenTerminationSignalIssued:Future[Deadline] "akka.http.scaladsl.Http.ServerBinding") `Future` is completed. This can be used to signal parts of the application that the HTTP server is shutting down and they should clean up as well. Note also that for more advanced shut down scenarios you may want to use the [Coordinated Shutdown](https://doc.akka.io/libraries/akka-core/2.10/actors.html#coordinated-shutdown) capabilities of Akka.

Next, all in flight requests will be handled. If a request is “in\-flight” (being handled by user code), it is given `hardDeadline` time to complete.

- if a connection has no “in\-flight” request, it is terminated immediately
- if user code emits a response within the timeout, then this response is sent to the client with a `Connection: close` header and connection is closed.
- if it is a streaming response, it is also mandated that it shall complete within the deadline, and if it does not the connection will be terminated regardless of status of the streaming response. This is because such response could be infinite, which could trap the server in a situation where it could not terminate if it were to wait for a response to “finish”.
	- existing streaming responses must complete before the deadline as well. When the deadline is reached the connection will be terminated regardless of status of the streaming responses.
- if user code does not reply with a response within the deadline we produce a special `akka.http.javadsl.settings.ServerSettings.getTerminationDeadlineExceededResponse``akka.http.scaladsl.settings.ServerSettings.terminationDeadlineExceededResponse` HTTP response (e.g. `503 Service Unavailable`) with a `Connection: close` header and close connection.

During that time incoming requests continue to be served. The existing connections will remain alive until the `hardDeadline` is exceeded, yet no new requests will be delivered to the user handler. All such drained responses will be replied to with an termination response (as explained in step 2\).

Finally, all remaining alive connections are forcefully terminated once the `hardDeadline` is exceeded. The `whenTerminated` (exposed by `ServerBinding`) CompletionStagefuture is completed as well, so the graceful termination (of the `ActorSystem` or entire JVM itself can be safely performed, as by then it is known that no connections remain alive to this server).

Note that the termination response is configurable in `ServerSettings`, and by default is an `503 Service Unavailable`, with an empty response entity.

Starting a graceful termination is as simple as invoking the terminate() method on the server binding:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L468-L494 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import scala.concurrent.duration._

implicit val system = ActorSystem()
implicit val dispatcher = system.dispatcher

val routes = get {
  complete("Hello world!")
}

val binding: Future[Http.ServerBinding] =
  Http().newServerAt("127.0.0.1", 8080).bind(routes)

// ...
// once ready to terminate the server, invoke terminate:
val onceAllConnectionsTerminated: Future[Http.HttpTerminated] =
  Await.result(binding, 10.seconds)
    .terminate(hardDeadline = 3.seconds)

// once all connections are terminated,
// - you can invoke coordinated shutdown to tear down the rest of the system:
onceAllConnectionsTerminated.flatMap { _ =>
  system.terminate()
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L327-L343 "Go to snippet source")ActorSystem system = ActorSystem.create();

CompletionStage<ServerBinding> binding = Http.get(system).newServerAt("localhost", 8080)
    .bindFlow(Directives.complete("Hello world!").flow(system));

ServerBinding serverBinding = binding.toCompletableFuture().get(3, TimeUnit.SECONDS);

// ...
// once ready to terminate the server, invoke terminate:
CompletionStage<HttpTerminated> onceAllConnectionsTerminated =
    serverBinding.terminate(Duration.ofSeconds(3));

// once all connections are terminated,
onceAllConnectionsTerminated.toCompletableFuture().
    thenAccept(terminated -> system.terminate());

```

## Code Examples

### Example 1: Akka Coordinated Shutdown

```scala
val bindingFuture = Http().newServerAt("localhost", 8080).bind(routes)
  .map(_.addToCoordinatedShutdown(hardTerminationDeadline = 10.seconds))
```

### Example 2: Akka Coordinated Shutdown

```java
CompletionStage<ServerBinding> bindingFuture = Http
    .get(system)
    .newServerAt("localhost", 8080)
    .bind(routes)
    .thenApply(binding -> binding.addToCoordinatedShutdown(Duration.ofSeconds(10), system));
```

### Example 3: Akka Coordinated Shutdown

```scala
// shut down with `ActorSystemTerminateReason`
system.terminate()

// or define a specific reason
case object UserInitiatedShutdown extends CoordinatedShutdown.Reason

CoordinatedShutdown(system).run(UserInitiatedShutdown)
```

### Example 4: Akka Coordinated Shutdown

```java
// shut down with `ActorSystemTerminateReason`
system.terminate();

// or define a specific reason
final class UserInitiatedShutdown implements CoordinatedShutdown.Reason {
    @Override
    public String toString() {
        return "UserInitiatedShutdown";
    }
}

CoordinatedShutdown.get(system).run(new UserInitiatedShutdown());
```

### Example 5: Graceful termination usingServerTerminator

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import scala.concurrent.duration._

implicit val system = ActorSystem()
implicit val dispatcher = system.dispatcher

val routes = get {
  complete("Hello world!")
}

val binding: Future[Http.ServerBinding] =
  Http().newServerAt("127.0.0.1", 8080).bind(routes)

// ...
// once ready to terminate the server, invoke terminate:
val onceAllConnectionsTerminated: Future[Http.HttpTerminated] =
  Await.result(binding, 10.seconds)
    .terminate(hardDeadline = 3.seconds)

// once all connections are terminated,
// - you can invoke coordinated shutdown to tear down the rest of the system:
onceAllConnectionsTerminated.flatMap { _ =>
  system.terminate()
}
```

### Example 6: Graceful termination usingServerTerminator

```java
ActorSystem system = ActorSystem.create();


CompletionStage<ServerBinding> binding = Http.get(system).newServerAt("localhost", 8080)
    .bindFlow(Directives.complete("Hello world!").flow(system));

ServerBinding serverBinding = binding.toCompletableFuture().get(3, TimeUnit.SECONDS);

// ...
// once ready to terminate the server, invoke terminate:
CompletionStage<HttpTerminated> onceAllConnectionsTerminated =
    serverBinding.terminate(Duration.ofSeconds(3));

// once all connections are terminated,
onceAllConnectionsTerminated.toCompletableFuture().
    thenAccept(terminated -> system.terminate());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka/2.10/akka/actor/CoordinatedShutdown$$Reason.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/CoordinatedShutdown.Reason.html
- https://doc.akka.io/libraries/akka-core/2.10/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/http2.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/server-side/graceful-termination.html](https://doc.akka.io/libraries/akka-http/10.7/server-side/graceful-termination.html)*