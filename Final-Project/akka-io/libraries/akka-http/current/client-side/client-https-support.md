---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/client-https-support.html
title: Client-Side HTTPS Support • Akka HTTP
---

# Client-Side HTTPS Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Client\-Side HTTPS Support

Akka HTTP supports TLS encryption on the client\-side as well as on the [server\-side](../server-side/server-https-support.html).

The central vehicle for configuring encryption is the [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext"), which can be created using the static methods on [`ConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html "akka.http.javadsl.ConnectionContext")[`ConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html "akka.http.scaladsl.ConnectionContext"):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ConnectionContext.scala#L43-L46 "Go to snippet source")/**
 *  Creates an HttpsConnectionContext for client-side use from the given SSLContext.
 */
def httpsClient(context: SSLContext): HttpsConnectionContext = // ...
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ConnectionContext.scala#L29-L32 "Go to snippet source")/**
 * Creates an HttpsConnectionContext for client-side use from the given SSLContext.
 */
def httpsClient(sslContext: SSLContext): HttpsConnectionContext = // ...
```

In addition to the `outgoingConnection`, `newHostConnectionPool` and `cachedHostConnectionPool` methods the [`akka.http.scaladsl.Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http")[`akka.http.javadsl.Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http") extension also defines `outgoingConnectionHttps`, `newHostConnectionPoolHttps` and `cachedHostConnectionPoolHttps`. These methods work identically to their counterparts without the `-Https` suffix, with the exception that all connections will always be encrypted.

The `singleRequest` and `superPool` methods determine the encryption state via the scheme of the incoming request, i.e. requests to an “https” URI will be encrypted, while requests to an “http” URI won’t.

The encryption configuration for all HTTPS connections, i.e. the `HttpsContext` is determined according to the following logic:

1. If the optional `httpsContext` method parameter is defined it contains the configuration to be used (and thus takes precedence over any potentially set default client\-side `HttpsContext`).
2. If the optional `httpsContext` method parameter is undefined (which is the default) the default client\-side `HttpsContext` is used, which can be set via the `setDefaultClientHttpsContext` on the [`Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http")[`Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http") extension.
3. If no default client\-side `HttpsContext` has been set via the `setDefaultClientHttpsContext` on the [`Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http")[`Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http") extension the default system configuration is used.

Usually the process is, if the default system TLS configuration is not good enough for your application’s needs, that you configure a custom `HttpsContext` instance and set it via `Http().setDefaultClientHttpsContext``Http.get(system).setDefaultClientHttpsContext`. Afterwards you simply use `outgoingConnectionHttps`, `newHostConnectionPoolHttps`, `cachedHostConnectionPoolHttps`, `superPool` or `singleRequest` without a specific `httpsContext` argument, which causes encrypted connections to rely on the configured default client\-side [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext").

If no custom `HttpsContext` is defined the default context uses Java’s default TLS settings. Customizing the `HttpsContext` can make the Https client less secure. Understand what you are doing!

## Detailed configuration and workarounds

Warning
While it is possible to disable certain checks, we **strongly recommend** to instead attempt to solve these issues by properly configuring TLS–for example by adding trusted keys to the keystore.

If however certain checks really need to be disabled because of misconfigured (or legacy) servers that your application has to speak to, instead of disabling the checks globally (by using `setDefaultClientHttpsContext`) we suggest configuring the loose settings for *specific connections* that are known to need them disabled (and trusted for some other reason). The pattern of doing so is documented in the following sub\-sections.

### Convenient loading of key and certificate

For mTLS (mutual TLS) the client needs to provide a certificate that the server trusts to be allowed to connect to the server. 

[`SSLContextFactory`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory.html "akka.http.javadsl.common.SSLContextFactory")[`SSLContextFactory`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html "akka.http.scaladsl.common.SSLContextFactory") provides convenience factories for loading certificate, key and trusted CA certificate files in PEM format as well as a certificate rotation.

### Disabling hostname verification

Hostname verification proves that the Akka HTTP client is actually communicating with the server it intended to communicate with. Without this check a man\-in\-the\-middle attack is possible. In the attack scenario, an alternative certificate would be presented which was issued for another host name. Checking the host name in the certificate against the host name the connection was opened against is therefore vital.

When you create your [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext") with [`ConnectionContext.httpsClient`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html "akka.http.javadsl.ConnectionContext")[`ConnectionContext.httpsClient`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html "akka.http.scaladsl.ConnectionContext") enables hostname verification. The following shows an example of disabling hostname verification for a given connection:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpsExamplesSpec.scala#L19-L37 "Go to snippet source")implicit val system = ActorSystem()

def createInsecureSslEngine(host: String, port: Int): SSLEngine = {
  val engine = SSLContext.getDefault.createSSLEngine(host, port)
  engine.setUseClientMode(true)

  // WARNING: this creates an SSL Engine without enabling endpoint identification/verification procedures
  // Disabling host name verification is a very bad idea, please don't unless you have a very good reason to.
  // When in doubt, use the `ConnectionContext.httpsClient` that takes an `SSLContext` instead, or enable with:
  // engine.setSSLParameters({
  //  val params = engine.getSSLParameters
  //  params.setEndpointIdentificationAlgorithm("https")
  //  params
  // )

  engine
}
val badCtx = ConnectionContext.httpsClient(createInsecureSslEngine _)
Http().outgoingConnectionHttps(unsafeHost, connectionContext = badCtx)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpsExamplesDocTest.java#L24-L42 "Go to snippet source")final ActorSystem system = ActorSystem.create();
final Http http = Http.get(system);

final HttpsConnectionContext badCtx = ConnectionContext.httpsClient((host, port) -> {
  SSLEngine engine = SSLContext.getDefault().createSSLEngine(host, port);
  engine.setUseClientMode(true);

  // WARNING: this creates an SSL Engine without enabling endpoint identification/verification procedures
  // Disabling host name verification is a very bad idea, please don't unless you have a very good reason to.
  // When in doubt, use the `ConnectionContext.httpsClient` that takes an `SSLContext` instead, or enable
  // with:
  // SSLParameters params = engine.getSSLParameters();
  // params.setEndpointIdentificationAlgorithm("https");
  // engine.setSSLParameters(params);

  return engine;
});

http.connectionTo(unsafeHost).withCustomHttpsConnectionContext(badCtx).https();
```

## Code Examples

### Example 1: Client-Side HTTPS Support

```scala
/**
 *  Creates an HttpsConnectionContext for client-side use from the given SSLContext.
 */
def httpsClient(context: SSLContext): HttpsConnectionContext = // ...
```

### Example 2: Client-Side HTTPS Support

```scala
/**
 * Creates an HttpsConnectionContext for client-side use from the given SSLContext.
 */
def httpsClient(sslContext: SSLContext): HttpsConnectionContext = // ...
```

### Example 3: Disabling hostname verification

```scala
implicit val system = ActorSystem()

def createInsecureSslEngine(host: String, port: Int): SSLEngine = {
  val engine = SSLContext.getDefault.createSSLEngine(host, port)
  engine.setUseClientMode(true)

  // WARNING: this creates an SSL Engine without enabling endpoint identification/verification procedures
  // Disabling host name verification is a very bad idea, please don't unless you have a very good reason to.
  // When in doubt, use the `ConnectionContext.httpsClient` that takes an `SSLContext` instead, or enable with:
  // engine.setSSLParameters({
  //  val params = engine.getSSLParameters
  //  params.setEndpointIdentificationAlgorithm("https")
  //  params
  // )

  engine
}
val badCtx = ConnectionContext.httpsClient(createInsecureSslEngine _)
Http().outgoingConnectionHttps(unsafeHost, connectionContext = badCtx)
```

### Example 4: Disabling hostname verification

```java
final ActorSystem system = ActorSystem.create();
final Http http = Http.get(system);

final HttpsConnectionContext badCtx = ConnectionContext.httpsClient((host, port) -> {
  SSLEngine engine = SSLContext.getDefault().createSSLEngine(host, port);
  engine.setUseClientMode(true);

  // WARNING: this creates an SSL Engine without enabling endpoint identification/verification procedures
  // Disabling host name verification is a very bad idea, please don't unless you have a very good reason to.
  // When in doubt, use the `ConnectionContext.httpsClient` that takes an `SSLContext` instead, or enable
  // with:
  // SSLParameters params = engine.getSSLParameters();
  // params.setEndpointIdentificationAlgorithm("https");
  // engine.setSSLParameters(params);

  return engine;
});

http.connectionTo(unsafeHost).withCustomHttpsConnectionContext(badCtx).https();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory.html
- https://doc.akka.io/libraries/akka-http/current/client-side/client-transport.html
- https://doc.akka.io/libraries/akka-http/current/client-side/pool-overflow.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/client-https-support.html](https://doc.akka.io/libraries/akka-http/current/client-side/client-https-support.html)*