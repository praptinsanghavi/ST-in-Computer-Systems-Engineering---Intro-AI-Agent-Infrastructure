---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:50:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/client-transport.html
title: Pluggable Client Transports / HTTP(S) proxy Support • Akka HTTP
---

# Pluggable Client Transports / HTTP(S) proxy Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Pluggable Client Transports / HTTP(S) proxy Support

The client side infrastructure has support to plug different transport mechanisms underneath. A client side transport is represented by an instance of [`akka.http.scaladsl.ClientTransport`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html "akka.http.scaladsl.ClientTransport")[`akka.http.javadsl.ClientTransport`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html "akka.http.javadsl.ClientTransport"):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ClientTransport.scala#L26-L28 "Go to snippet source")trait ClientTransport {
  def connectTo(host: String, port: Int, settings: ClientConnectionSettings)(implicit system: ActorSystem): Flow[ByteString, ByteString, Future[OutgoingConnection]]
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ClientTransport.scala#L26-L28 "Go to snippet source")abstract class ClientTransport {
  def connectTo(host: String, port: Int, settings: ClientConnectionSettings, system: ActorSystem): Flow[ByteString, ByteString, CompletionStage[OutgoingConnection]]
}
```

A transport implementation defines how the client infrastructure should communicate with a given host.

Note
In our model, SSL/TLS runs on top of the client transport, even if you could theoretically see it as part of the transport layer itself.

## Configuring Client Transports

A [`ClientTransport`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html "akka.http.javadsl.ClientTransport")[`ClientTransport`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html "akka.http.scaladsl.ClientTransport") can be configured in the [`ClientConnectionSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html "akka.http.javadsl.settings.ClientConnectionSettings")[`ClientConnectionSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html "akka.http.scaladsl.settings.ClientConnectionSettings"). Right now, this is not possible through config files but only by code. First, use `ClientConnectionSettings.withTransport` to configure a transport, then use `ConnectionPoolSettings.withConnectionSettings`. [`ClientConnectionSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html "akka.http.javadsl.settings.ClientConnectionSettings")[`ClientConnectionSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html "akka.http.scaladsl.settings.ClientConnectionSettings") can be passed to all client\-side entry points in [`Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http")[`Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http").

## Predefined Transports

### TCP

The default transport is `ClientTransport.TCP` which simply opens a TCP connection to the target host.

### HTTP(S) Proxy

A transport that connects to target servers via an HTTP(S) proxy. An HTTP(S) proxy uses the HTTP `CONNECT` method (as specified in [RFC 7231 Section 4\.3\.6](https://datatracker.ietf.org/doc/html/rfc7231#section-4.3.6)) to create tunnels to target servers. The proxy itself should transparently forward data to the target servers so that end\-to\-end encryption should still work (if TLS breaks, then the proxy might be fussing with your data).

This approach is commonly used to securely proxy requests to HTTPS endpoints. In theory it could also be used to proxy requests targeting HTTP endpoints, but we have not yet found a proxy that in fact allows this.

Instantiate the HTTP(S) proxy transport using `ClientTransport.httpsProxy(proxyAddress)`.

The proxy transport can also be setup using `ClientTransport.httpsProxy()` or `ClientTransport.httpsProxy(basicHttpCredentials)` In order to define the transport as such, you will need to set the proxy host / port in your `conf` file like the following.

```
akka.http.client.proxy {
 https {
   host = ""
   port = 443
 }
}

```

If host is left as `""` and you attempt to setup an httpsProxy transport, an exception will be thrown.

### Use HTTP(S) proxy with `Http().singleRequest``Http.get(...).singleRequest`

To make use of an HTTP proxy when using the `singleRequest` API you simply need to configure the proxy and pass the appropriate settings object when calling the single request method.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L357-L372 "Go to snippet source")import java.net.InetSocketAddress

import akka.actor.ActorSystem
import akka.http.scaladsl.{ ClientTransport, Http }

implicit val system = ActorSystem()

val proxyHost = "localhost"
val proxyPort = 8888

val httpsProxyTransport = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved(proxyHost, proxyPort))

val settings = ConnectionPoolSettings(system)
  .withConnectionSettings(ClientConnectionSettings(system)
    .withTransport(httpsProxyTransport))
Http().singleRequest(HttpRequest(uri = "https://google.com"), settings = settings)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L245-L259 "Go to snippet source")  
final ActorSystem system = ActorSystem.create();

ClientTransport proxy = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved("192.168.2.5", 8080));
ConnectionPoolSettings poolSettingsWithHttpsProxy = ConnectionPoolSettings.create(system)
    .withConnectionSettings(ClientConnectionSettings.create(system).withTransport(proxy));

final CompletionStage<HttpResponse> responseFuture =
    Http.get(system)
        .singleRequest(
              HttpRequest.create("https://github.com"),
              Http.get(system).defaultClientHttpsContext(),
              poolSettingsWithHttpsProxy, // <- pass in the custom settings here
              system.log());

```

### Use HTTP(S) proxy that requires authentication

In order to use an HTTP(S) proxy that requires authentication, you need to provide [`HttpCredentials`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html "akka.http.javadsl.model.headers.HttpCredentials")[`HttpCredentials`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html "akka.http.scaladsl.model.headers.HttpCredentials") that will be used when making the CONNECT request to the proxy:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L388-L398 "Go to snippet source")import akka.http.scaladsl.model.headers

val proxyAddress = InetSocketAddress.createUnresolved(proxyHost, proxyPort)
val auth = headers.BasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone")

val httpsProxyTransport = ClientTransport.httpsProxy(proxyAddress, auth)

val settings = ConnectionPoolSettings(system)
  .withConnectionSettings(ClientConnectionSettings(system)
    .withTransport(httpsProxyTransport))
Http().singleRequest(HttpRequest(uri = "http://akka.io"), settings = settings)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L270-L286 "Go to snippet source")InetSocketAddress proxyAddress =
  InetSocketAddress.createUnresolved("192.168.2.5", 8080);
HttpCredentials credentials =
  HttpCredentials.createBasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone");

ClientTransport proxy = ClientTransport.httpsProxy(proxyAddress, credentials); // include credentials
ConnectionPoolSettings poolSettingsWithHttpsProxy = ConnectionPoolSettings.create(system)
    .withConnectionSettings(ClientConnectionSettings.create(system).withTransport(proxy));

final CompletionStage<HttpResponse> responseFuture =
    Http.get(system)
        .singleRequest(
              HttpRequest.create("https://github.com"),
              Http.get(system).defaultClientHttpsContext(),
              poolSettingsWithHttpsProxy, // <- pass in the custom settings here
              system.log());

```

### Use HTTP(S) proxy with Http().singleWebSocketRequestHttp.get(…).singleWebSocketRequest

Making use of an HTTP proxy when using the `singleWebSocketRequest` is done like using `singleRequest`, except you set `ClientConnectionSettings` instead of `ConnectionPoolSettings`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/WebSocketClientExampleSpec.scala#L125-L147 "Go to snippet source")import java.net.InetSocketAddress

import akka.actor.ActorSystem
import akka.NotUsed
import akka.http.scaladsl.{ ClientTransport, Http }
import akka.http.scaladsl.settings.ClientConnectionSettings
import akka.http.scaladsl.model.ws._
import akka.stream.scaladsl._

implicit val system = ActorSystem()

val flow: Flow[Message, Message, NotUsed] =
  Flow.fromSinkAndSource(
    Sink.foreach(println),
    Source.single(TextMessage("hello world!")))

val proxyHost = "localhost"
val proxyPort = 8888

val httpsProxyTransport = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved(proxyHost, proxyPort))

val settings = ClientConnectionSettings(system).withTransport(httpsProxyTransport)
Http().singleWebSocketRequest(WebSocketRequest(uri = "wss://example.com:8080/some/path"), clientFlow = flow, settings = settings)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/WebSocketClientExampleTest.java#L247-L269 "Go to snippet source")  
final ActorSystem system = ActorSystem.create();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Flow<Message, Message, NotUsed> flow =
  Flow.fromSinkAndSource(
    Sink.foreach(System.out::println),
    Source.single(TextMessage.create("hello world")));

ClientTransport proxy = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved("192.168.2.5", 8080));
ClientConnectionSettings clientSettingsWithHttpsProxy = ClientConnectionSettings.create(system)
  .withTransport(proxy);

Http.get(system)
  .singleWebSocketRequest(
    WebSocketRequest.create("wss://example.com:8080/some/path"),
    flow,
    Http.get(system).defaultClientHttpsContext(),
    null,
    clientSettingsWithHttpsProxy, // <- pass in the custom settings here
    system.log(),
    materializer);

```

### Use HTTP(S) proxy that requires authentication for Web Sockets

Here is an example for Web Socket:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/WebSocketClientExampleSpec.scala#L172-L180 "Go to snippet source")import akka.http.scaladsl.model.headers

val proxyAddress = InetSocketAddress.createUnresolved(proxyHost, proxyPort)
val auth = headers.BasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone")

val httpsProxyTransport = ClientTransport.httpsProxy(proxyAddress, auth)

val settings = ClientConnectionSettings(system).withTransport(httpsProxyTransport)
Http().singleWebSocketRequest(WebSocketRequest(uri = "wss://example.com:8080/some/path"), clientFlow = flow, settings = settings)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/WebSocketClientExampleTest.java#L285-L303 "Go to snippet source")InetSocketAddress proxyAddress =
  InetSocketAddress.createUnresolved("192.168.2.5", 8080);
HttpCredentials credentials =
  HttpCredentials.createBasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone");

ClientTransport proxy = ClientTransport.httpsProxy(proxyAddress, credentials); // include credentials
ClientConnectionSettings clientSettingsWithHttpsProxy = ClientConnectionSettings.create(system)
  .withTransport(proxy);

Http.get(system)
  .singleWebSocketRequest(
    WebSocketRequest.create("wss://example.com:8080/some/path"),
    flow,
    Http.get(system).defaultClientHttpsContext(),
    null,
    clientSettingsWithHttpsProxy, // <- pass in the custom settings here
    system.log(),
    materializer);

```

## Custom Host Name Resolution Transport

You can use [`ClientTransport.withCustomResolver`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html "akka.http.javadsl.ClientTransport")[`ClientTransport.withCustomResolver`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html "akka.http.scaladsl.ClientTransport") to customize host name resolution. The given resolution function will be called for every connection attempt to resolve a hostname / port combination (potentially asynchronously) to an `InetSocketAddress`.

As a backend to implement the resolution function you can use Akka’s [Async DNS Resolution](https://doc.akka.io/libraries/akka-core/current/io-dns.html#dns-extension).

Potential use cases:

- in a managed setting this can be used to query for `SRV` DNS records that contain both address and port for a service.
- if the DNS server returns multiple addresses, you can implement a load balancing algorithm to select a different target address for each connection

## Implementing Custom Transports

Implement `ClientTransport.connectTo` to implement a custom client transport.

Here are some ideas for custom (or future predefined) transports:

- SSH tunnel transport: connects to the target host through an SSH tunnel
- Per\-host configurable transport: allows choosing transports per target host

## Code Examples

### Example 1: Pluggable Client Transports / HTTP(S) proxy Support

```scala
trait ClientTransport {
  def connectTo(host: String, port: Int, settings: ClientConnectionSettings)(implicit system: ActorSystem): Flow[ByteString, ByteString, Future[OutgoingConnection]]
}
```

### Example 2: Pluggable Client Transports / HTTP(S) proxy Support

```scala
abstract class ClientTransport {
  def connectTo(host: String, port: Int, settings: ClientConnectionSettings, system: ActorSystem): Flow[ByteString, ByteString, CompletionStage[OutgoingConnection]]
}
```

### Example 3: HTTP(S) Proxy

```text
akka.http.client.proxy {
 https {
   host = ""
   port = 443
 }
}
```

### Example 4: Use HTTP(S) proxy withHttp().singleRequestHttp.get(...).singleRequest

```scala
import java.net.InetSocketAddress

import akka.actor.ActorSystem
import akka.http.scaladsl.{ ClientTransport, Http }

implicit val system = ActorSystem()

val proxyHost = "localhost"
val proxyPort = 8888

val httpsProxyTransport = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved(proxyHost, proxyPort))

val settings = ConnectionPoolSettings(system)
  .withConnectionSettings(ClientConnectionSettings(system)
    .withTransport(httpsProxyTransport))
Http().singleRequest(HttpRequest(uri = "https://google.com"), settings = settings)
```

### Example 5: Use HTTP(S) proxy withHttp().singleRequestHttp.get(...).singleRequest

```java
final ActorSystem system = ActorSystem.create();

ClientTransport proxy = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved("192.168.2.5", 8080));
ConnectionPoolSettings poolSettingsWithHttpsProxy = ConnectionPoolSettings.create(system)
    .withConnectionSettings(ClientConnectionSettings.create(system).withTransport(proxy));

final CompletionStage<HttpResponse> responseFuture =
    Http.get(system)
        .singleRequest(
              HttpRequest.create("https://github.com"),
              Http.get(system).defaultClientHttpsContext(),
              poolSettingsWithHttpsProxy, // <- pass in the custom settings here
              system.log());
```

### Example 6: Use HTTP(S) proxy that requires authentication

```scala
import akka.http.scaladsl.model.headers

val proxyAddress = InetSocketAddress.createUnresolved(proxyHost, proxyPort)
val auth = headers.BasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone")

val httpsProxyTransport = ClientTransport.httpsProxy(proxyAddress, auth)

val settings = ConnectionPoolSettings(system)
  .withConnectionSettings(ClientConnectionSettings(system)
    .withTransport(httpsProxyTransport))
Http().singleRequest(HttpRequest(uri = "http://akka.io"), settings = settings)
```

### Example 7: Use HTTP(S) proxy that requires authentication

```java
InetSocketAddress proxyAddress =
  InetSocketAddress.createUnresolved("192.168.2.5", 8080);
HttpCredentials credentials =
  HttpCredentials.createBasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone");

ClientTransport proxy = ClientTransport.httpsProxy(proxyAddress, credentials); // include credentials
ConnectionPoolSettings poolSettingsWithHttpsProxy = ConnectionPoolSettings.create(system)
    .withConnectionSettings(ClientConnectionSettings.create(system).withTransport(proxy));

final CompletionStage<HttpResponse> responseFuture =
    Http.get(system)
        .singleRequest(
              HttpRequest.create("https://github.com"),
              Http.get(system).defaultClientHttpsContext(),
              poolSettingsWithHttpsProxy, // <- pass in the custom settings here
              system.log());
```

### Example 8: Use HTTP(S) proxy withHttp().singleWebSocketRequestHttp.get(…).singleWebSocketRequest

```scala
import java.net.InetSocketAddress

import akka.actor.ActorSystem
import akka.NotUsed
import akka.http.scaladsl.{ ClientTransport, Http }
import akka.http.scaladsl.settings.ClientConnectionSettings
import akka.http.scaladsl.model.ws._
import akka.stream.scaladsl._

implicit val system = ActorSystem()

val flow: Flow[Message, Message, NotUsed] =
  Flow.fromSinkAndSource(
    Sink.foreach(println),
    Source.single(TextMessage("hello world!")))

val proxyHost = "localhost"
val proxyPort = 8888

val httpsProxyTransport = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved(proxyHost, proxyPort))

val settings = ClientConnectionSettings(system).withTransport(httpsProxyTransport)
Http().singleWebSocketRequest(WebSocketRequest(uri = "wss://example.com:8080/some/path"), clientFlow = flow, settings = settings)
```

### Example 9: Use HTTP(S) proxy withHttp().singleWebSocketRequestHttp.get(…).singleWebSocketRequest

```java
final ActorSystem system = ActorSystem.create();
final Materializer materializer = SystemMaterializer.get(system).materializer();

final Flow<Message, Message, NotUsed> flow =
  Flow.fromSinkAndSource(
    Sink.foreach(System.out::println),
    Source.single(TextMessage.create("hello world")));

ClientTransport proxy = ClientTransport.httpsProxy(InetSocketAddress.createUnresolved("192.168.2.5", 8080));
ClientConnectionSettings clientSettingsWithHttpsProxy = ClientConnectionSettings.create(system)
  .withTransport(proxy);

Http.get(system)
  .singleWebSocketRequest(
    WebSocketRequest.create("wss://example.com:8080/some/path"),
    flow,
    Http.get(system).defaultClientHttpsContext(),
    null,
    clientSettingsWithHttpsProxy, // <- pass in the custom settings here
    system.log(),
    materializer);
```

### Example 10: Use HTTP(S) proxy that requires authentication for Web Sockets

```scala
import akka.http.scaladsl.model.headers

val proxyAddress = InetSocketAddress.createUnresolved(proxyHost, proxyPort)
val auth = headers.BasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone")

val httpsProxyTransport = ClientTransport.httpsProxy(proxyAddress, auth)

val settings = ClientConnectionSettings(system).withTransport(httpsProxyTransport)
Http().singleWebSocketRequest(WebSocketRequest(uri = "wss://example.com:8080/some/path"), clientFlow = flow, settings = settings)
```

### Example 11: Use HTTP(S) proxy that requires authentication for Web Sockets

```java
InetSocketAddress proxyAddress =
  InetSocketAddress.createUnresolved("192.168.2.5", 8080);
HttpCredentials credentials =
  HttpCredentials.createBasicHttpCredentials("proxy-user", "secret-proxy-pass-dont-tell-anyone");

ClientTransport proxy = ClientTransport.httpsProxy(proxyAddress, credentials); // include credentials
ClientConnectionSettings clientSettingsWithHttpsProxy = ClientConnectionSettings.create(system)
  .withTransport(proxy);

Http.get(system)
  .singleWebSocketRequest(
    WebSocketRequest.create("wss://example.com:8080/some/path"),
    flow,
    Http.get(system).defaultClientHttpsContext(),
    null,
    clientSettingsWithHttpsProxy, // <- pass in the custom settings here
    system.log(),
    materializer);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/libraries/akka-core/current/io-dns.html
- https://doc.akka.io/libraries/akka-http/10.7/client-side/client-https-support.html
- https://doc.akka.io/libraries/akka-http/10.7/client-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/client-side/client-transport.html](https://doc.akka.io/libraries/akka-http/10.7/client-side/client-transport.html)*