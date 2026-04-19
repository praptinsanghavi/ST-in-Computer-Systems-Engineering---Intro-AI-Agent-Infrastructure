---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html
title: Server HTTPS Support • Akka HTTP
---

# Server HTTPS Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Server HTTPS Support

Akka HTTP supports TLS encryption on the server\-side as well as on the [client\-side](../client-side/client-https-support.html).

The central vehicle for configuring encryption is the [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext"), which can be created using the static method `ConnectionContext.httpsServer` which is defined like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ConnectionContext.scala#L18-L21 "Go to snippet source")/**
 *  Creates an HttpsConnectionContext for server-side use from the given SSLContext.
 */
def httpsServer(sslContext: SSLContext): HttpsConnectionContext = // ...
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ConnectionContext.scala#L14-L17 "Go to snippet source")/**
 * Creates an HttpsConnectionContext for server-side use from the given SSLContext.
 */
def httpsServer(sslContext: SSLContext): HttpsConnectionContext = // ...
```

On the server\-side, the [`ServerBuilder`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html "akka.http.javadsl.ServerBuilder")[`ServerBuilder`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html "akka.http.scaladsl.ServerBuilder") defines a method `enableHttps` with an `httpsContext` parameter, which can receive the HTTPS configuration in the form of an `HttpsConnectionContext` instance.

For detailed documentation for client\-side HTTPS support refer to [Client\-Side HTTPS Support](../client-side/client-https-support.html).

## Obtaining SSL/TLS Certificates

In order to run an HTTPS server a certificate has to be provided, which usually is either obtained from a signing authority or created by yourself for local or staging environment purposes. You can either use PEM\-files or Java keystores with certificate and private key.

Signing authorities often provide instructions on how to create a Java keystore (typically with reference to Tomcat configuration). If you want to generate your own certificates, the official Oracle documentation on how to generate a keystore using the JDK keytool utility can be found [here](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/keytool.html).

## Using HTTPS

Once you have obtained the server certificate, using it is as simple as preparing an [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext") and passing it to `enableHttps` when binding the server.

The below example shows how setting up HTTPS works. First, you create and configure an instance of [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext").

If you have certificate files in PEM\-files (often with extensions `.pem`, `.key` and `.crt`), you can use the convenience factories in [`SSLContextFactory`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory.html "akka.http.javadsl.common.SSLContextFactory")[`SSLContextFactory`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html "akka.http.scaladsl.common.SSLContextFactory") for loading them:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L87-L101 "Go to snippet source")val https: HttpsConnectionContext = ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(
  certificatePath = Paths.get("/some/path/server.crt"),
  privateKeyPath = Paths.get("/some/path/server.key"),
  trustedCaCertificatePaths = Seq(Paths.get("/some/path/serverCA.crt"))
))

// or from a config block
// my-server {
//   certificate = "/some/path/server.crt"
//   private-key = "/some/path/server.key"
//   trusted-ca-certificates = ["/some/path/clientCA.crt"]
//   # or to use the default trust store
//   trusted-ca-certificates = "system"
// }
ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(system.settings.config.getConfig("my-server")))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpsServerExampleTest.java#L50-L64 "Go to snippet source")HttpsConnectionContext https = ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(
    Paths.get("/some/path/server.crt"),
    Paths.get("/some/path/server.key"),
    List.of(Paths.get("/some/path/serverCA.crt"))
));

// or from a config block
// my-server {
//   certificate = "/some/path/server.crt"
//   private-key = "/some/path/server.key"
//   trusted-ca-certificates = ["/some/path/clientCA.crt"]
//   # or to use the default trust store
//   trusted-ca-certificates = "system"
// }
ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(system.settings().config().getConfig("my-server")));
```

For mTLS (mutual TLS) the trusted CA cert list needs to contain the CA that issues the certs which clients that the server trusts connect with.

If there are more low level aspects you need to configure, or if you are loading certificates from a Java key store:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L8-L33 "Go to snippet source")import java.io.InputStream
import java.security.{ KeyStore, SecureRandom }
import javax.net.ssl.{ KeyManagerFactory, SSLContext, TrustManagerFactory }
import akka.actor.ActorSystem
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.server.{ Directives, Route }
import akka.http.scaladsl.{ ConnectionContext, Http, HttpsConnectionContext }
import akka.pki.pem.DERPrivateKeyLoader
import akka.pki.pem.PEMDecoder

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.GeneralSecurityException
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import java.util.concurrent.atomic.AtomicReference
import scala.collection.mutable
import scala.concurrent.duration.Deadline
import scala.concurrent.duration.DurationInt
import scala.concurrent.duration.FiniteDuration
implicit val system = ActorSystem()
implicit val dispatcher = system.dispatcher

// Manual HTTPS configuration

val password: Array[Char] = "change me".toCharArray // do not store passwords in code, read them from somewhere safe!

val ks: KeyStore = KeyStore.getInstance("PKCS12")
val keystore: InputStream = getClass.getClassLoader.getResourceAsStream("server.p12")

require(keystore != null, "Keystore required!")
ks.load(keystore, password)

val keyManagerFactory: KeyManagerFactory = KeyManagerFactory.getInstance("SunX509")
keyManagerFactory.init(ks, password)

val tmf: TrustManagerFactory = TrustManagerFactory.getInstance("SunX509")
tmf.init(ks)

val sslContext: SSLContext = SSLContext.getInstance("TLS")
sslContext.init(keyManagerFactory.getKeyManagers, tmf.getTrustManagers, new SecureRandom)
val https: HttpsConnectionContext = ConnectionContext.httpsServer(sslContext)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/simple/SimpleServerApp.java#L34-L153 "Go to snippet source")  
// ** CONFIGURING ADDITIONAL SETTINGS ** //

public static HttpsConnectionContext createHttpsContext(ActorSystem system) {
    try {
      // initialise the keystore
      // !!! never put passwords into code !!!
      final char[] password = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

      final KeyStore ks = KeyStore.getInstance("PKCS12");
      final InputStream keystore = SimpleServerApp.class.getClassLoader().getResourceAsStream("httpsDemoKeys/keys/server.p12");
      if (keystore == null) {
        throw new RuntimeException("Keystore required!");
      }
      ks.load(keystore, password);

      final KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
      keyManagerFactory.init(ks, password);

      final TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
      tmf.init(ks);

      final SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(keyManagerFactory.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

      return ConnectionContext.httpsServer(sslContext);

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```

After that you can pass it to `enableHttps`, like displayed below:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L79-L82 "Go to snippet source")val routes: Route = get {
  complete("Hello world!")
}
Http().newServerAt("127.0.0.1", 8080).enableHttps(https).bind(routes)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/simple/SimpleServerApp.java#L108-L110 "Go to snippet source")Http.get(system).newServerAt("localhost", 8080)
    .enableHttps(createHttpsContext(system))
    .bind(app.createRoute());
```

## Running both HTTP and HTTPS

If you want to run HTTP and HTTPS servers in a single application, you first create an instance of `HttpsConnectionContext` as explained above and then create two server bindings for different ports, one with https enabled and one without:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L70-L75 "Go to snippet source")// you can run both HTTP and HTTPS in the same application as follows:
val commonRoutes: Route = get {
  complete("Hello world!")
}
Http().newServerAt("127.0.0.1", 443).enableHttps(https).bind(commonRoutes)
Http().newServerAt("127.0.0.1", 80).bind(commonRoutes)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/simple/SimpleServerHttpHttpsApp.java#L31-L39 "Go to snippet source")final Http http = Http.get(system);
//Run HTTP server firstly
http.newServerAt("localhost", 80).bind(route);

//get configured HTTPS context
HttpsConnectionContext httpsContext = SimpleServerApp.createHttpsContext(system);

//Then run HTTPS server
http.newServerAt("localhost", 443).enableHttps(httpsContext).bind(route);
```

## Mutual authentication

To require clients to authenticate themselves when connecting, using mTLS (mutual TLS), you must set this on the `SSLEngine`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L110-L121 "Go to snippet source")val sslContext: SSLContext = ???
ConnectionContext.httpsServer(() => {
  val engine = sslContext.createSSLEngine()
  engine.setUseClientMode(false)

  // to require trusted certs for any client to allow them to connect
  engine.setNeedClientAuth(true)
  // or, for optional client certs:
  // engine.setWantClientAuth(true)

  engine
})
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpsServerExampleTest.java#L33-L43 "Go to snippet source")ConnectionContext.httpsServer(() -> {
        SSLEngine engine = sslContext.createSSLEngine();
        engine.setUseClientMode(false);

        // to require trusted certs for any client to allow them to connect
        engine.setNeedClientAuth(true);
        // or, for optional client certs:
        // engine.setWantClientAuth(true);

        return engine;
});
```

For further (custom) certificate checks, you can access the `javax.net.ssl.SSLSession` via the `sslSession` attribute.

At this point dynamic renegotiation of the certificates to be used is not implemented. For details see [issue \#18351](https://github.com/akka/akka-core/issues/18351) and some preliminary work in [PR \#19787](https://github.com/akka/akka-core/pull/19787).

## Rotating certificates

It is often important to rotate the certificates without having to redeploy/restart a server. This is possible with Akka HTTP through the `ConnectionContext.httpsServer(() => SSLEngine)``ConnectionContext.httpsServer(akka.japi.function.Creator[SSLEngine])` `ConnectionContext` factory. The function passed to `httpsServer` will be invoked on each connection so can return differently configured `SSLEngine`s over time.

The function for creating the `SSLEngine` can be manually implemented, but for convenience a few utilities are provided in the [`SSLContextFactory`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory.html "akka.http.javadsl.common.SSLContextFactory")[`SSLContextFactory`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html "akka.http.scaladsl.common.SSLContextFactory") class. Here is an example using those utilities providing a cached `SSLEngine` that is periodically reloaded to pick up updated certificates:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/HttpsServerExampleSpec.scala#L133-L142 "Go to snippet source")val https = ConnectionContext.httpsServer(
  SSLContextFactory.refreshingSSLEngineProvider(5.minutes) {
    () =>
      SSLContextFactory.createSSLContextFromPem(
        certificatePath = Paths.get("/some/path/server.crt"),
        privateKeyPath = Paths.get("/some/path/server.key"),
        trustedCaCertificatePaths = Seq(Paths.get("/some/path/serverCA.crt"))
      )
  })
Http().newServerAt("127.0.0.1", 8080).enableHttps(https).bind(routes)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpsServerExampleTest.java#L73-L82 "Go to snippet source")HttpsConnectionContext https = ConnectionContext.httpsServer(SSLContextFactory.refreshingSSLEngineProvider(
    Duration.ofMinutes(5),
    () ->
      SSLContextFactory.createSSLContextFromPem(
        Paths.get("/some/path/server.crt"),
        Paths.get("/some/path/server.key"),
        List.of(Paths.get("/some/path/serverCA.crt")))));
Http.get(system).newServerAt("127.0.0.1", 443)
    .enableHttps(https)
    .bind(routes);
```

## Further reading

The topic of properly configuring HTTPS for your web server is an always changing one, thus we recommend staying up to date with various security breach news and of course keep your JVM at the latest version possible, as the default settings are often updated by Oracle in reaction to various security updates and known issues.

We also recommend having a look at the [Play documentation about securing your app](https://www.playframework.com/documentation/2.5.x/ConfiguringHttps#ssl-certificates), as well as the techniques described in the Play documentation about setting up a [reverse proxy to terminate TLS in front of your application](https://www.playframework.com/documentation/2.5.x/HTTPServer) instead of terminating TLS inside the JVM, and therefore Akka HTTP, itself.

Other excellent articles on the subject:

- [Oracle Java SE 8: Creating a Keystore using JSSE](https://docs.oracle.com/javase/8/docs/technotes/guides/security/jsse/JSSERefGuide.html#CreateKeystore)
- [Java PKI Programmer’s Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/security/certpath/CertPathProgGuide.html)
- [Fixing X.509 Certificates](https://tersesystems.com/2014/03/20/fixing-x509-certificates/)

## Code Examples

### Example 1: Server HTTPS Support

```scala
/**
 *  Creates an HttpsConnectionContext for server-side use from the given SSLContext.
 */
def httpsServer(sslContext: SSLContext): HttpsConnectionContext = // ...
```

### Example 2: Server HTTPS Support

```scala
/**
 * Creates an HttpsConnectionContext for server-side use from the given SSLContext.
 */
def httpsServer(sslContext: SSLContext): HttpsConnectionContext = // ...
```

### Example 3: Using HTTPS

```scala
val https: HttpsConnectionContext = ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(
  certificatePath = Paths.get("/some/path/server.crt"),
  privateKeyPath = Paths.get("/some/path/server.key"),
  trustedCaCertificatePaths = Seq(Paths.get("/some/path/serverCA.crt"))
))

// or from a config block
// my-server {
//   certificate = "/some/path/server.crt"
//   private-key = "/some/path/server.key"
//   trusted-ca-certificates = ["/some/path/clientCA.crt"]
//   # or to use the default trust store
//   trusted-ca-certificates = "system"
// }
ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(system.settings.config.getConfig("my-server")))
```

### Example 4: Using HTTPS

```java
HttpsConnectionContext https = ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(
    Paths.get("/some/path/server.crt"),
    Paths.get("/some/path/server.key"),
    List.of(Paths.get("/some/path/serverCA.crt"))
));

// or from a config block
// my-server {
//   certificate = "/some/path/server.crt"
//   private-key = "/some/path/server.key"
//   trusted-ca-certificates = ["/some/path/clientCA.crt"]
//   # or to use the default trust store
//   trusted-ca-certificates = "system"
// }
ConnectionContext.httpsServer(SSLContextFactory.createSSLContextFromPem(system.settings().config().getConfig("my-server")));
```

### Example 5: Using HTTPS

```scala
import java.io.InputStream
import java.security.{ KeyStore, SecureRandom }
import javax.net.ssl.{ KeyManagerFactory, SSLContext, TrustManagerFactory }
import akka.actor.ActorSystem
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.server.{ Directives, Route }
import akka.http.scaladsl.{ ConnectionContext, Http, HttpsConnectionContext }
import akka.pki.pem.DERPrivateKeyLoader
import akka.pki.pem.PEMDecoder

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.GeneralSecurityException
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import java.util.concurrent.atomic.AtomicReference
import scala.collection.mutable
import scala.concurrent.duration.Deadline
import scala.concurrent.duration.DurationInt
import scala.concurrent.duration.FiniteDuration
implicit val system = ActorSystem()
implicit val dispatcher = system.dispatcher

// Manual HTTPS configuration

val password: Array[Char] = "change me".toCharArray // do not store passwords in code, read them from somewhere safe!

val ks: KeyStore = KeyStore.getInstance("PKCS12")
val keystore: InputStream = getClass.getClassLoader.getResourceAsStream("server.p12")

require(keystore != null, "Keystore required!")
ks.load(keystore, password)

val keyManagerFactory: KeyManagerFactory = KeyManagerFactory.getInstance("SunX509")
keyManagerFactory.init(ks, password)

val tmf: TrustManagerFactory = TrustManagerFactory.getInstance("SunX509")
tmf.init(ks)

val sslContext: SSLContext = SSLContext.getInstance("TLS")
sslContext.init(keyManagerFactory.getKeyManagers, tmf.getTrustManagers, new SecureRandom)
val https: HttpsConnectionContext = ConnectionContext.httpsServer(sslContext)
```

### Example 6: Using HTTPS

```java
// ** CONFIGURING ADDITIONAL SETTINGS ** //

public static HttpsConnectionContext createHttpsContext(ActorSystem system) {
    try {
      // initialise the keystore
      // !!! never put passwords into code !!!
      final char[] password = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

      final KeyStore ks = KeyStore.getInstance("PKCS12");
      final InputStream keystore = SimpleServerApp.class.getClassLoader().getResourceAsStream("httpsDemoKeys/keys/server.p12");
      if (keystore == null) {
        throw new RuntimeException("Keystore required!");
      }
      ks.load(keystore, password);

      final KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
      keyManagerFactory.init(ks, password);

      final TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
      tmf.init(ks);

      final SSLContext sslContext = SSLContext.getInstance("TLS");
      sslContext.init(keyManagerFactory.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

      return ConnectionContext.httpsServer(sslContext);

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```

### Example 7: Using HTTPS

```scala
val routes: Route = get {
  complete("Hello world!")
}
Http().newServerAt("127.0.0.1", 8080).enableHttps(https).bind(routes)
```

### Example 8: Using HTTPS

```java
Http.get(system).newServerAt("localhost", 8080)
    .enableHttps(createHttpsContext(system))
    .bind(app.createRoute());
```

### Example 9: Running both HTTP and HTTPS

```scala
// you can run both HTTP and HTTPS in the same application as follows:
val commonRoutes: Route = get {
  complete("Hello world!")
}
Http().newServerAt("127.0.0.1", 443).enableHttps(https).bind(commonRoutes)
Http().newServerAt("127.0.0.1", 80).bind(commonRoutes)
```

### Example 10: Running both HTTP and HTTPS

```java
final Http http = Http.get(system);
//Run HTTP server firstly
http.newServerAt("localhost", 80).bind(route);

//get configured HTTPS context
HttpsConnectionContext httpsContext = SimpleServerApp.createHttpsContext(system);

//Then run HTTPS server
http.newServerAt("localhost", 443).enableHttps(httpsContext).bind(route);
```

### Example 11: Mutual authentication

```scala
val sslContext: SSLContext = ???
ConnectionContext.httpsServer(() => {
  val engine = sslContext.createSSLEngine()
  engine.setUseClientMode(false)

  // to require trusted certs for any client to allow them to connect
  engine.setNeedClientAuth(true)
  // or, for optional client certs:
  // engine.setWantClientAuth(true)

  engine
})
```

### Example 12: Mutual authentication

```java
ConnectionContext.httpsServer(() -> {
        SSLEngine engine = sslContext.createSSLEngine();
        engine.setUseClientMode(false);

        // to require trusted certs for any client to allow them to connect
        engine.setNeedClientAuth(true);
        // or, for optional client certs:
        // engine.setWantClientAuth(true);

        return engine;
});
```

### Example 13: Rotating certificates

```scala
val https = ConnectionContext.httpsServer(
  SSLContextFactory.refreshingSSLEngineProvider(5.minutes) {
    () =>
      SSLContextFactory.createSSLContextFromPem(
        certificatePath = Paths.get("/some/path/server.crt"),
        privateKeyPath = Paths.get("/some/path/server.key"),
        trustedCaCertificatePaths = Seq(Paths.get("/some/path/serverCA.crt"))
      )
  })
Http().newServerAt("127.0.0.1", 8080).enableHttps(https).bind(routes)
```

### Example 14: Rotating certificates

```java
HttpsConnectionContext https = ConnectionContext.httpsServer(SSLContextFactory.refreshingSSLEngineProvider(
    Duration.ofMinutes(5),
    () ->
      SSLContextFactory.createSSLContextFromPem(
        Paths.get("/some/path/server.crt"),
        Paths.get("/some/path/server.key"),
        List.of(Paths.get("/some/path/serverCA.crt")))));
Http.get(system).newServerAt("127.0.0.1", 443)
    .enableHttps(https)
    .bind(routes);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory.html
- https://doc.akka.io/libraries/akka-http/10.7/client-side/client-https-support.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/graceful-termination.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html](https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html)*