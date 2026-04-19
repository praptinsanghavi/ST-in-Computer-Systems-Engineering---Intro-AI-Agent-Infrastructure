---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:42:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
title: Implications of the streaming nature of Request/Response Entities • Akka HTTP
---

# Implications of the streaming nature of Request/Response Entities • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Implications of the streaming nature of Request/Response Entities

Akka HTTP is streaming *all the way through*, which means that the back\-pressure mechanisms enabled by Akka Streams are exposed through all layers–from the TCP layer, through the HTTP server, all the way up to the user\-facing [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") and [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") and their [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") APIs.

This has surprising implications if you are used to non\-streaming / not\-reactive HTTP clients. Specifically it means that: “*lack of consumption of the HTTP Entity, is signaled as back\-pressure to the other side of the connection*”. This is a feature, as it allows one only to consume the entity, and back\-pressure servers/clients from overwhelming our application, possibly causing unnecessary buffering of the entity in memory.

Put another way: Streaming *all the way through* is a feature of Akka HTTP that allows consuming entities (and pulling them through the network) in a streaming fashion, and only *on demand* when the client is ready to consume the bytes. Therefore, you have to explicitly consume or discard the entity. 

On a client, for example, if the application doesn’t subscribe to the response entity within `akka.http.host-connection-pool.response-entity-subscription-timeout`, the stream will fail with a `TimeoutException: Response entity was not subscribed after ...`.

Warning
Consuming (or discarding) the Entity of a request is mandatory! If *accidentally* left neither consumed or discarded Akka HTTP will assume the incoming data should remain back\-pressured, and will stall the incoming data via TCP back\-pressure mechanisms. A client should consume the Entity regardless of the status of the [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

## Client\-Side handling of streaming HTTP Entities

### Consuming the HTTP Response Entity (Client)

There are two use\-cases to consume the entity of a response:

1. process the bytes as the response arrives from the network buffer
2. load all the bytes in memory first, and process them afterwards

The most common use\-case, and recommended, of course, is consuming the response entity as a stream, which can be done via running the underlying `dataBytes` Source.

It is encouraged to use various streaming techniques to utilise the underlying infrastructure to its fullest, for example by framing the incoming chunks, parsing them line\-by\-line and then connecting the flow into another destination Sink, such as a File or other Akka Streams connector:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L23-L40 "Go to snippet source")import java.io.File

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.stream.scaladsl.{ FileIO, Framing }
import akka.util.ByteString

implicit val system: ActorSystem = ActorSystem()

val response: HttpResponse = ???

response.entity.dataBytes
  .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256))
  .map(transformEachLine)
  .runWith(FileIO.toPath(new File("/tmp/example.out").toPath))

def transformEachLine(line: ByteString): ByteString = ???

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L30-L69 "Go to snippet source")import java.io.File;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import akka.stream.javadsl.Framing;
import akka.http.javadsl.model.*;
import scala.concurrent.duration.FiniteDuration;

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final Function<ByteString, ByteString> transformEachLine = line -> line /* some transformation here */;

final int maximumFrameLength = 256;

response.entity().getDataBytes()
  .via(Framing.delimiter(ByteString.fromString("\n"), maximumFrameLength, FramingTruncation.ALLOW))
  .map(transformEachLine::apply)
  .runWith(FileIO.toPath(new File("/tmp/example.out").toPath()), system);
```

However, sometimes the need may arise to consume the entire entity as `Strict` entity (which means that it is completely loaded into memory). Akka HTTP provides a special `toStrict(timeout)``toStrict(timeout, materializer)` method which can be used to eagerly consume the entity and make it available in memory. Once in memory, data can be consumed as a `ByteString` or as a `Source`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L46-L76 "Go to snippet source")import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.util.ByteString

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

case class ExamplePerson(name: String)
def parse(line: ByteString): ExamplePerson = ???

val response: HttpResponse = ???

// toStrict to enforce all data be loaded into memory from the connection
val strictEntity: Future[HttpEntity.Strict] = response.entity.toStrict(3.seconds)

// You can now use the `data` directly...
val person1: Future[ExamplePerson] = strictEntity.map(e => parse(e.data))

// Though it is also still possible to use the streaming API to consume dataBytes,
// even though now they're in memory:
val person2: Future[ExamplePerson] =
  strictEntity flatMap { e =>
    e.dataBytes
      .runFold(ByteString.empty) { case (acc, b) => acc ++ b }
      .map(parse)
  }

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L76-L106 "Go to snippet source")final class ExamplePerson {
  final String name;
  public ExamplePerson(String name) { this.name = name; }
}

public ExamplePerson parse(ByteString line) {
  return new ExamplePerson(line.utf8String());
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

// toStrict to enforce all data be loaded into memory from the connection
final CompletionStage<HttpEntity.Strict> strictEntity = response.entity()
    .toStrict(FiniteDuration.create(3, TimeUnit.SECONDS).toMillis(), system);

// You can now use `getData` to get the data directly...
final CompletionStage<ExamplePerson> person1 =
  strictEntity.thenApply(strict -> parse(strict.getData()));

// Though it is also still possible to use the streaming API to consume dataBytes,
// even though now they're in memory:
final CompletionStage<ExamplePerson> person2 =
  strictEntity
    .thenCompose(strict ->
      strict.getDataBytes()
        .runFold(emptyByteString(), (acc, b) -> acc.concat(b), system)
        .thenApply(this::parse)
    );
```

### Integrating with Akka Streams

In some cases, it is necessary to process the results of a series of Akka HTTP calls as Akka Streams. In order to ensure that the HTTP Response Entity is consumed in a timely manner, the Akka HTTP stream for each request must be executed and completely consumed, then sent along for further processing.

Failing to account for this behavior can result in seemingly non\-deterministic failures due to complex interactions between http and stream buffering. This manifests as errors such as the following:

```
Response entity was not subscribed after 1 second. Make sure to read the response `entity` body or call `entity.discardBytes()` on it -- in case you deal with `HttpResponse`, use the shortcut `response.discardEntityBytes()`.

```

This error indicates that the http response has been available for too long without being consumed. It can be partially worked around by increasing the subscription timeout, but you will still run the risk of running into network level timeouts and could still exceed the timeout under load so it’s best to resolve the issue properly such as in the examples below: 

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L82-L125 "Go to snippet source")import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.NotUsed
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.util.ByteString
import akka.stream.scaladsl.{ Flow, Sink, Source }

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

case class ExamplePerson(name: String)

def parse(line: ByteString): Option[ExamplePerson] =
  line.utf8String.split(" ").headOption.map(ExamplePerson.apply)

val requests: Source[HttpRequest, NotUsed] = Source
  .fromIterator(() =>
    Range(0, 10).map(i => HttpRequest(uri = Uri(s"https://localhost/people/$i"))).iterator
  )

val processorFlow: Flow[Option[ExamplePerson], Int, NotUsed] =
  Flow[Option[ExamplePerson]].map(_.map(_.name.length).getOrElse(0))

// Run and completely consume a single akka http request
def runRequest(req: HttpRequest): Future[Option[ExamplePerson]] =
  Http()
    .singleRequest(req)
    .flatMap { response =>
      response.entity.dataBytes
        .runReduce(_ ++ _)
        .map(parse)
    }

// Run each akka http flow to completion, then continue processing. You'll want to tune the `parallelism`
// parameter to mapAsync -- higher values will create more cpu and memory load which may or may not positively
// impact performance.
requests
  .mapAsync(2)(runRequest)
  .via(processorFlow)
  .runWith(Sink.ignore)

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L112-L145 "Go to snippet source")final class ExamplePerson {
  final String name;
  public ExamplePerson(String name) { this.name = name; }
}

public ExamplePerson parse(ByteString line) {
  return new ExamplePerson(line.utf8String());
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

// run a single request, consuming it completely in a single stream
public CompletionStage<ExamplePerson> runRequest(HttpRequest request) {
  return Http.get(system)
    .singleRequest(request)
    .thenCompose(response ->
      response.entity().getDataBytes()
        .runReduce((a, b) -> a.concat(b), system)
        .thenApply(this::parse)
    );
}

final List<HttpRequest> requests = new ArrayList<>();

final Flow<ExamplePerson, Integer, NotUsed> exampleProcessingFlow = Flow
        .fromFunction(person -> person.toString().length());

final CompletionStage<Done> stream = Source
        .from(requests)
        .mapAsync(1, this::runRequest)
        .via(exampleProcessingFlow)
        .runWith(Sink.ignore(), system);

```

### Discarding the HTTP Response Entity (Client)

Sometimes when calling HTTP services we do not care about their response payload (e.g. all we care about is the response code), yet as explained above entity still has to be consumed in some way, otherwise we’ll be exerting back\-pressure on the underlying TCP connection.

The `discardEntityBytes` convenience method serves the purpose of easily discarding the entity if it has no purpose for us. It does so by piping the incoming bytes directly into an `Sink.ignore`.

The two snippets below are equivalent, and work the same way on the server\-side for incoming HTTP Requests:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L131-L144 "Go to snippet source")import scala.concurrent.ExecutionContext

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMessage.DiscardedEntity
import akka.http.scaladsl.model._

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

val response1: HttpResponse = ??? // obtained from an HTTP call (see examples below)

val discarded: DiscardedEntity = response1.discardEntityBytes()
discarded.future.onComplete { done => println("Entity discarded completely!") }

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L151-L160 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final HttpMessage.DiscardedEntity discarded = response.discardEntityBytes(system);

discarded.completionStage().whenComplete((done, ex) -> {
  System.out.println("Entity discarded completely!");
});
```

Or the equivalent low\-level code achieving the same result:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L160-L163 "Go to snippet source")val response1: HttpResponse = ??? // obtained from an HTTP call (see examples below)

val discardingComplete: Future[Done] = response1.entity.dataBytes.runWith(Sink.ignore)
discardingComplete.onComplete(done => println("Entity discarded completely!"))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L167-L176 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final CompletionStage<Done> discardingComplete = response.entity().getDataBytes().runWith(Sink.ignore(), system);

discardingComplete.whenComplete((done, ex) -> {
  System.out.println("Entity discarded completely!");
});
```

## Server\-Side handling of streaming HTTP Entities

HTTP Entities of a request are directly linked to Streams fed by the underlying TCP connection. Thus, if request entities remain not consumed, the server will back\-pressure the connection, expecting the user\-code to eventually decide what to do with the incoming data.

The most common use\-case is to consume the request entity using directives such as `BasicDirectives.extractDataBytes`. Some directives force an implicit `toStrict` operation, such as `entity(as[String])``entity(exampleUnmarshaller, example -> {})`.

### Consuming the HTTP Request Entity (Server)

The simplest way of consuming the incoming request entity is to transform it into an actual domain object, for example by using the [entity](routing-dsl/directives/marshalling-directives/entity.html) directive:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L310-L333 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._
import spray.json.RootJsonFormat

implicit val system: ActorSystem = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext: ExecutionContext = system.dispatcher

final case class Bid(userId: String, bid: Int)

// these are from spray-json
implicit val bidFormat: RootJsonFormat[Bid] = jsonFormat2(Bid.apply)

val route =
  path("bid") {
    put {
      entity(as[Bid]) { (bid: Bid) =>
        // incoming entity is fully consumed and converted into a Bid
        complete("The bid was: " + bid)
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L224-L247 "Go to snippet source")class Bid {
  final String userId;
  final int bid;

  Bid(String userId, int bid) {
    this.userId = userId;
    this.bid = bid;
  }
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Unmarshaller<HttpEntity, Bid> asBid = Jackson.unmarshaller(Bid.class);

final Route s = path("bid", () ->
  put(() ->
    entity(asBid, bid ->
      // incoming entity is fully consumed and converted into a Bid
      complete("The bid was: " + bid)
    )
  )
);
```

You can also access the raw `dataBytes` and run the underlying stream. For example, you could pipe the raw `dataBytes` into a FileIO `Sink`. The FileIO `Sink` signals completion via a `Future[IoResult]``CompletionStage<IoResult>` once all the data has been written into the file:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L339-L360 "Go to snippet source")import akka.actor.ActorSystem
import akka.stream.scaladsl.FileIO
import akka.http.scaladsl.server.Directives._
import java.io.File

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractDataBytes { bytes =>
        val finishedWriting = bytes.runWith(FileIO.toPath(new File("/tmp/example.out").toPath))

        // we only want to respond once the incoming data has been handled:
        onComplete(finishedWriting) { ioResult =>
          complete("Finished writing data: " + ioResult)
        }
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L253-L271 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractDataBytes(bytes -> {
          final CompletionStage<IOResult> res = bytes.runWith(FileIO.toPath(new File("/tmp/example.out").toPath()), materializer);

          return onComplete(() -> res, ioResult ->
            // we only want to respond once the incoming data has been handled:
            complete("Finished writing data :" + ioResult));
        })
      )
    )
  );

```

### Discarding the HTTP Request Entity (Server)

You may want to discard the uploaded entity. For example, depending on some validation (e.g. “is user authorized to upload files?”).

Please note that “discarding the HTTP Request Entity” means that the entire upload will proceed, even though you are not interested in the data being streamed to the server. This is useful if you are simply not interested in the entity. 

In order to discard the `dataBytes` explicitly you can invoke the `discardEntityBytes` bytes of the incoming `HttpRequest`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L366-L386 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.HttpRequest

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractRequest { (r: HttpRequest) =>
        val finishedWriting = r.discardEntityBytes().future

        // we only want to respond once the incoming data has been handled:
        onComplete(finishedWriting) { done =>
          complete("Drained all data from connection... (" + done + ")")
        }
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L277-L293 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractRequest(r -> {
          final CompletionStage<Done> res = r.discardEntityBytes(system).completionStage();

          return onComplete(() -> res, done ->
            // we only want to respond once the incoming data has been handled:
            complete("Finished writing data :" + done));
        })
      )
    )
  );
```

A related concept is *cancelling* the incoming `entity.dataBytes``entity.getDataBytes()` stream. Cancellation results in Akka HTTP *abruptly closing the connection from the Client*. This may be useful when you detect that the given user should not be allowed to make any uploads at all, and you want to drop the connection (instead of reading and ignoring the incoming data). This can be done by attaching the incoming `entity.dataBytes``entity.getDataBytes()` to a `Sink.cancelled()` which will cancel the entity stream, which in turn will cause the underlying connection to be shut\-down by the server – effectively hard\-aborting the incoming request:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L392-L416 "Go to snippet source")import akka.actor.ActorSystem
import akka.stream.scaladsl.Sink
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.headers.Connection

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractDataBytes { data =>
        // Closing connections, method 1 (eager):
        // we deem this request as illegal, and close the connection right away:
        data.runWith(Sink.cancelled) // "brutally" closes the connection

        // Closing connections, method 2 (graceful):
        // consider draining connection and replying with `Connection: Close` header
        // if you want the client to close after this request/reply cycle instead:
        respondWithHeader(Connection("close"))
        complete(StatusCodes.Forbidden -> "Not allowed!")
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L299-L321 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractDataBytes(bytes -> {
          // Closing connections, method 1 (eager):
          // we deem this request as illegal, and close the connection right away:
          bytes.runWith(Sink.cancelled(), materializer);  // "brutally" closes the connection

          // Closing connections, method 2 (graceful):
          // consider draining connection and replying with `Connection: Close` header
          // if you want the client to close after this request/reply cycle instead:
          return respondWithHeader(Connection.create("close"), () ->
            complete(StatusCodes.FORBIDDEN, "Not allowed!")
          );
        })
      )
    )
  );
```

See also the [Closing a connection](server-side/low-level-api.html#http-closing-connection-low-level) section for an in\-depth explanation on closing connection.

### Pending: Automatic discarding of not used entities

Under certain conditions it is possible to detect an entity is very unlikely to be used by the user for a given request, and issue warnings or discard the entity automatically. This advanced feature has not been implemented yet, see the below note and issues for further discussion and ideas.

Note
An advanced feature code named “auto draining” has been discussed and proposed for Akka HTTP, and we’re hoping to implement or help the community implement it.

You can read more about it in [issue \#183](https://github.com/akka/akka-http/issues/183) as well as [issue \#117](https://github.com/akka/akka-http/issues/117) ; as always, contributions are very welcome!

## Code Examples

### Example 1: Consuming the HTTP Response Entity (Client)

```scala
import java.io.File

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.stream.scaladsl.{ FileIO, Framing }
import akka.util.ByteString

implicit val system: ActorSystem = ActorSystem()

val response: HttpResponse = ???

response.entity.dataBytes
  .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256))
  .map(transformEachLine)
  .runWith(FileIO.toPath(new File("/tmp/example.out").toPath))

def transformEachLine(line: ByteString): ByteString = ???
```

### Example 2: Consuming the HTTP Response Entity (Client)

```java
import java.io.File;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import akka.stream.javadsl.Framing;
import akka.http.javadsl.model.*;
import scala.concurrent.duration.FiniteDuration;

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final Function<ByteString, ByteString> transformEachLine = line -> line /* some transformation here */;

final int maximumFrameLength = 256;

response.entity().getDataBytes()
  .via(Framing.delimiter(ByteString.fromString("\n"), maximumFrameLength, FramingTruncation.ALLOW))
  .map(transformEachLine::apply)
  .runWith(FileIO.toPath(new File("/tmp/example.out").toPath()), system);
```

### Example 3: Consuming the HTTP Response Entity (Client)

```scala
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.util.ByteString

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

case class ExamplePerson(name: String)
def parse(line: ByteString): ExamplePerson = ???

val response: HttpResponse = ???

// toStrict to enforce all data be loaded into memory from the connection
val strictEntity: Future[HttpEntity.Strict] = response.entity.toStrict(3.seconds)

// You can now use the `data` directly...
val person1: Future[ExamplePerson] = strictEntity.map(e => parse(e.data))

// Though it is also still possible to use the streaming API to consume dataBytes,
// even though now they're in memory:
val person2: Future[ExamplePerson] =
  strictEntity flatMap { e =>
    e.dataBytes
      .runFold(ByteString.empty) { case (acc, b) => acc ++ b }
      .map(parse)
  }
```

### Example 4: Consuming the HTTP Response Entity (Client)

```java
final class ExamplePerson {
  final String name;
  public ExamplePerson(String name) { this.name = name; }
}

public ExamplePerson parse(ByteString line) {
  return new ExamplePerson(line.utf8String());
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

// toStrict to enforce all data be loaded into memory from the connection
final CompletionStage<HttpEntity.Strict> strictEntity = response.entity()
    .toStrict(FiniteDuration.create(3, TimeUnit.SECONDS).toMillis(), system);

// You can now use `getData` to get the data directly...
final CompletionStage<ExamplePerson> person1 =
  strictEntity.thenApply(strict -> parse(strict.getData()));

// Though it is also still possible to use the streaming API to consume dataBytes,
// even though now they're in memory:
final CompletionStage<ExamplePerson> person2 =
  strictEntity
    .thenCompose(strict ->
      strict.getDataBytes()
        .runFold(emptyByteString(), (acc, b) -> acc.concat(b), system)
        .thenApply(this::parse)
    );
```

### Example 5: Integrating with Akka Streams

```text
Response entity was not subscribed after 1 second. Make sure to read the response `entity` body or call `entity.discardBytes()` on it -- in case you deal with `HttpResponse`, use the shortcut `response.discardEntityBytes()`.
```

### Example 6: Integrating with Akka Streams

```scala
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.NotUsed
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.util.ByteString
import akka.stream.scaladsl.{ Flow, Sink, Source }

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

case class ExamplePerson(name: String)

def parse(line: ByteString): Option[ExamplePerson] =
  line.utf8String.split(" ").headOption.map(ExamplePerson.apply)

val requests: Source[HttpRequest, NotUsed] = Source
  .fromIterator(() =>
    Range(0, 10).map(i => HttpRequest(uri = Uri(s"https://localhost/people/$i"))).iterator
  )

val processorFlow: Flow[Option[ExamplePerson], Int, NotUsed] =
  Flow[Option[ExamplePerson]].map(_.map(_.name.length).getOrElse(0))

// Run and completely consume a single akka http request
def runRequest(req: HttpRequest): Future[Option[ExamplePerson]] =
  Http()
    .singleRequest(req)
    .flatMap { response =>
      response.entity.dataBytes
        .runReduce(_ ++ _)
        .map(parse)
    }

// Run each akka http flow to completion, then continue processing. You'll want to tune the `parallelism`
// parameter to mapAsync -- higher values will create more cpu and memory load which may or may not positively
// impact performance.
requests
  .mapAsync(2)(runRequest)
  .via(processorFlow)
  .runWith(Sink.ignore)
```

### Example 7: Integrating with Akka Streams

```java
final class ExamplePerson {
  final String name;
  public ExamplePerson(String name) { this.name = name; }
}

public ExamplePerson parse(ByteString line) {
  return new ExamplePerson(line.utf8String());
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

// run a single request, consuming it completely in a single stream
public CompletionStage<ExamplePerson> runRequest(HttpRequest request) {
  return Http.get(system)
    .singleRequest(request)
    .thenCompose(response ->
      response.entity().getDataBytes()
        .runReduce((a, b) -> a.concat(b), system)
        .thenApply(this::parse)
    );
}

final List<HttpRequest> requests = new ArrayList<>();

final Flow<ExamplePerson, Integer, NotUsed> exampleProcessingFlow = Flow
        .fromFunction(person -> person.toString().length());

final CompletionStage<Done> stream = Source
        .from(requests)
        .mapAsync(1, this::runRequest)
        .via(exampleProcessingFlow)
        .runWith(Sink.ignore(), system);
```

### Example 8: Discarding the HTTP Response Entity (Client)

```scala
import scala.concurrent.ExecutionContext

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMessage.DiscardedEntity
import akka.http.scaladsl.model._

implicit val system: ActorSystem = ActorSystem()
implicit val dispatcher: ExecutionContext = system.dispatcher

val response1: HttpResponse = ??? // obtained from an HTTP call (see examples below)

val discarded: DiscardedEntity = response1.discardEntityBytes()
discarded.future.onComplete { done => println("Entity discarded completely!") }
```

### Example 9: Discarding the HTTP Response Entity (Client)

```java
final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final HttpMessage.DiscardedEntity discarded = response.discardEntityBytes(system);

discarded.completionStage().whenComplete((done, ex) -> {
  System.out.println("Entity discarded completely!");
});
```

### Example 10: Discarding the HTTP Response Entity (Client)

```scala
val response1: HttpResponse = ??? // obtained from an HTTP call (see examples below)

val discardingComplete: Future[Done] = response1.entity.dataBytes.runWith(Sink.ignore)
discardingComplete.onComplete(done => println("Entity discarded completely!"))
```

### Example 11: Discarding the HTTP Response Entity (Client)

```java
final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final HttpResponse response = responseFromSomewhere();

final CompletionStage<Done> discardingComplete = response.entity().getDataBytes().runWith(Sink.ignore(), system);

discardingComplete.whenComplete((done, ex) -> {
  System.out.println("Entity discarded completely!");
});
```

### Example 12: Consuming the HTTP Request Entity (Server)

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._
import spray.json.RootJsonFormat

implicit val system: ActorSystem = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext: ExecutionContext = system.dispatcher

final case class Bid(userId: String, bid: Int)

// these are from spray-json
implicit val bidFormat: RootJsonFormat[Bid] = jsonFormat2(Bid.apply)

val route =
  path("bid") {
    put {
      entity(as[Bid]) { (bid: Bid) =>
        // incoming entity is fully consumed and converted into a Bid
        complete("The bid was: " + bid)
      }
    }
  }
```

### Example 13: Consuming the HTTP Request Entity (Server)

```java
class Bid {
  final String userId;
  final int bid;

  Bid(String userId, int bid) {
    this.userId = userId;
    this.bid = bid;
  }
}

final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Unmarshaller<HttpEntity, Bid> asBid = Jackson.unmarshaller(Bid.class);

final Route s = path("bid", () ->
  put(() ->
    entity(asBid, bid ->
      // incoming entity is fully consumed and converted into a Bid
      complete("The bid was: " + bid)
    )
  )
);
```

### Example 14: Consuming the HTTP Request Entity (Server)

```scala
import akka.actor.ActorSystem
import akka.stream.scaladsl.FileIO
import akka.http.scaladsl.server.Directives._
import java.io.File

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractDataBytes { bytes =>
        val finishedWriting = bytes.runWith(FileIO.toPath(new File("/tmp/example.out").toPath))

        // we only want to respond once the incoming data has been handled:
        onComplete(finishedWriting) { ioResult =>
          complete("Finished writing data: " + ioResult)
        }
      }
    }
  }
```

### Example 15: Consuming the HTTP Request Entity (Server)

```java
final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractDataBytes(bytes -> {
          final CompletionStage<IOResult> res = bytes.runWith(FileIO.toPath(new File("/tmp/example.out").toPath()), materializer);

          return onComplete(() -> res, ioResult ->
            // we only want to respond once the incoming data has been handled:
            complete("Finished writing data :" + ioResult));
        })
      )
    )
  );
```

### Example 16: Discarding the HTTP Request Entity (Server)

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.HttpRequest

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractRequest { (r: HttpRequest) =>
        val finishedWriting = r.discardEntityBytes().future

        // we only want to respond once the incoming data has been handled:
        onComplete(finishedWriting) { done =>
          complete("Drained all data from connection... (" + done + ")")
        }
      }
    }
  }
```

### Example 17: Discarding the HTTP Request Entity (Server)

```java
final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractRequest(r -> {
          final CompletionStage<Done> res = r.discardEntityBytes(system).completionStage();

          return onComplete(() -> res, done ->
            // we only want to respond once the incoming data has been handled:
            complete("Finished writing data :" + done));
        })
      )
    )
  );
```

### Example 18: Discarding the HTTP Request Entity (Server)

```scala
import akka.actor.ActorSystem
import akka.stream.scaladsl.Sink
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.headers.Connection

implicit val system = ActorSystem()
// needed for the future flatMap/onComplete in the end
implicit val executionContext = system.dispatcher

val route =
  (put & path("lines")) {
    withoutSizeLimit {
      extractDataBytes { data =>
        // Closing connections, method 1 (eager):
        // we deem this request as illegal, and close the connection right away:
        data.runWith(Sink.cancelled) // "brutally" closes the connection

        // Closing connections, method 2 (graceful):
        // consider draining connection and replying with `Connection: Close` header
        // if you want the client to close after this request/reply cycle instead:
        respondWithHeader(Connection("close"))
        complete(StatusCodes.Forbidden -> "Not allowed!")
      }
    }
  }
```

### Example 19: Discarding the HTTP Request Entity (Server)

```java
final ActorSystem system = ActorSystem.create();
final ExecutionContextExecutor dispatcher = system.dispatcher();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Route s =
  put(() ->
    path("lines", () ->
      withoutSizeLimit(() ->
        extractDataBytes(bytes -> {
          // Closing connections, method 1 (eager):
          // we deem this request as illegal, and close the connection right away:
          bytes.runWith(Sink.cancelled(), materializer);  // "brutally" closes the connection

          // Closing connections, method 2 (graceful):
          // consider draining connection and replying with `Connection: Close` header
          // if you want the client to close after this request/reply cycle instead:
          return respondWithHeader(Connection.create("close"), () ->
            complete(StatusCodes.FORBIDDEN, "Not allowed!")
          );
        })
      )
    )
  );
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/libraries/akka-http/10.7/handling-blocking-operations-in-akka-http-routes.html
- https://doc.akka.io/libraries/akka-http/10.7/native-image.html
- https://doc.akka.io/libraries/akka-http/10.7/routing-dsl/directives/marshalling-directives/entity.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/low-level-api.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/implications-of-streaming-http-entity.html](https://doc.akka.io/libraries/akka-http/10.7/implications-of-streaming-http-entity.html)*