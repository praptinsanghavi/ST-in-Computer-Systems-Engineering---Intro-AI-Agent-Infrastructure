---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/mtls.html
title: Mutual authentication with TLS • Akka gRPC
---

# Mutual authentication with TLS • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Mutual authentication with TLS

Mutual or mTLS means that just like how a client will only connect to servers with valid certificates, the server will also verify the client certificate and only allow connections if the client key pair is accepted by the server. This is useful for example in microservices where only other known services are allowed to interact with a service, and public access should be denied.

For mTLS to work the server must be set up with a keystore containing the CA (certificate authority) public key used to sign the individual certs for clients that are allowed to access the server, just like how in a regular TLS/HTTPS scenario the client must be able to verify the server certificate. 

Since the CA is what controls what clients can access a service, it is likely an organisation or service specific CA rather than a normal public one like what you use for a public web server.

## Setting the server up

A JKS store can be prepared with the right contents, or we can create it on the fly from certificate files in some location the server as read access to. In this example we use certificate and key files in the PEM format available from the file system and use the Akka HTTP convenience factories to load them.

The server is set up with its own private key and certificate as well as with a trust store containing the certificate authority (CA) to trust client certificates from:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/MtlsGreeterServer.scala#L6-L79 "Go to snippet source")package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.http.scaladsl.ConnectionContext
import akka.http.scaladsl.Http
import akka.http.scaladsl.HttpsConnectionContext
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import example.myapp.helloworld.grpc._
import org.slf4j.LoggerFactory

import java.nio.file.Paths
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration.DurationInt
import scala.io.Source

object MtlsGreeterServer {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("MtlsHelloWorldServer")
    new MtlsGreeterServer(system).run()
    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

}

class MtlsGreeterServer(system: ActorSystem) {

  private val log = LoggerFactory.getLogger(classOf[MtlsGreeterServer])
  def run(): Future[Http.ServerBinding] = {
    // Akka boot up code
    implicit val sys: ActorSystem = system
    implicit val ec: ExecutionContext = sys.dispatcher

    // Create service handlers
    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl())

    // Bind service handler servers to localhost:8443
    val binding =
      Http()
        .newServerAt("127.0.0.1", 8443)
        .enableHttps(serverHttpContext)
        .bind(service)
        .map(_.addToCoordinatedShutdown(5.seconds))

    // report successful binding
    binding.foreach { binding => log.info(s"gRPC server bound to: {}", binding.localAddress) }

    binding
  }

  private def serverHttpContext: HttpsConnectionContext =
    ConnectionContext.httpsServer { () =>
      val context = SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        certificatePath = Paths.get("src/main/resources/certs/localhost-server.crt"),
        privateKeyPath = Paths.get("src/main/resources/certs/localhost-server.key"),
        // client certs are issued by this CA
        trustedCaCertificatePaths = Seq(Paths.get("src/main/resources/certs/rootCA.crt")))

      val engine = context.createSSLEngine()
      engine.setUseClientMode(false)

      // require client certs
      engine.setNeedClientAuth(true)

      engine
    }

  private def classPathFileAsString(path: String): String =
    Source.fromResource(path).mkString
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/MtlsGreeterServer.java#L6-L90 "Go to snippet source")package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.http.javadsl.ConnectionContext;
import akka.http.javadsl.Http;
import akka.http.javadsl.HttpsConnectionContext;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.common.SSLContextFactory;
import akka.http.javadsl.model.AttributeKeys;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.model.SslSessionInfo;
import akka.japi.function.Function;
import akka.pki.pem.DERPrivateKeyLoader;
import akka.pki.pem.PEMDecoder;
import akka.stream.Materializer;
import akka.stream.SystemMaterializer;
import example.myapp.helloworld.grpc.GreeterService;
import example.myapp.helloworld.grpc.GreeterServiceHandlerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

class MtlsGreeterServer {

  private static final Logger log = LoggerFactory.getLogger(MtlsGreeterServer.class);

  public static void main(String[] args) throws Exception {
    ActorSystem sys = ActorSystem.create("MtlsHelloWorldServer");

    run(sys).thenAccept(binding -> {
      log.info("gRPC server bound to {}", binding.localAddress());
    });

    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

  public static CompletionStage<ServerBinding> run(ActorSystem sys) throws Exception {
    Materializer mat = SystemMaterializer.get(sys).materializer();

    // Instantiate implementation
    GreeterService impl = new GreeterServiceImpl(mat);

    Function<HttpRequest, CompletionStage<HttpResponse>> service =
      GreeterServiceHandlerFactory.create(impl, sys);

    return Http
      .get(sys)
      .newServerAt("127.0.0.1", 8443)
      .enableHttps(serverHttpContext())
      .bind(service);
  }

  private static HttpsConnectionContext serverHttpContext() {
    return ConnectionContext.httpsServer(() -> {
      SSLContext context = SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/localhost-server.crt"),
        Paths.get("src/main/resources/certs/localhost-server.key"),
        // client certs to trust are issued by this CA
        List.of(Paths.get("src/main/resources/certs/rootCA.crt")));

      SSLEngine engine = context.createSSLEngine();
      engine.setUseClientMode(false);

      // require client certs
      engine.setNeedClientAuth(true);
      return engine;
    });
  }
}
```

When run the server will only accept client connections that use a keypair that it considers valid, other connections will be denied and fail with a TLS protocol error.

It is possible to rotate the certificates without restarting the service, see the [Akka HTTP documentation](https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html#rotating-certificates). 

## Setting the client up

In the client, the trust store must be set up to trust the server certificate, in our example it is signed with the same CA as the server:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/MtlsGreeterClient.scala#L6-L69 "Go to snippet source")package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.grpc.GrpcClientSettings
import akka.http.scaladsl.common.SSLContextFactory
import example.myapp.helloworld.grpc.GreeterServiceClient
import example.myapp.helloworld.grpc.HelloRequest

import java.nio.file.Paths
import javax.net.ssl.SSLContext
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.DurationInt
import scala.util.Failure
import scala.util.Success

object MtlsGreeterClient {

  def main(args: Array[String]): Unit = {
    implicit val sys: ActorSystem = ActorSystem.create("MtlsHelloWorldClient")
    implicit val ec: ExecutionContext = sys.dispatcher

    val clientSettings = GrpcClientSettings.connectToServiceAt("localhost", 8443).withSslContext(sslContext())

    // alternatively, for rotating certs
    val rotatingClientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443).withSslContextProvider(rotatingSslContext())

    val client = GreeterServiceClient(clientSettings)
    val reply = client.sayHello(HelloRequest("Jonas"))

    reply.onComplete { tryResponse =>
      tryResponse match {
        case Success(reply) =>
          println(s"Successful reply: $reply")
        case Failure(exception) =>
          println("Request failed")
          exception.printStackTrace()
      }
      sys.terminate()
    }
  }

  def sslContext(): SSLContext = {
    SSLContextFactory.createSSLContextFromPem(
      // Note: these are filesystem paths, not classpath
      certificatePath = Paths.get("src/main/resources/certs/client1.crt"),
      privateKeyPath = Paths.get("src/main/resources/certs/client1.key"),
      // server cert is issued by this CA
      trustedCaCertificatePaths = Seq(Paths.get("src/main/resources/certs/rootCA.crt")))
  }

  def rotatingSslContext(): () => SSLContext = {
    SSLContextFactory.refreshingSSLContextProvider(30.seconds) { () =>
      println("### reloading cert")
      SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/client1.crt"),
        Paths.get("src/main/resources/certs/client1.key"),
        // server cert is issued by this CA
        Seq(Paths.get("src/main/resources/certs/rootCA.crt")))
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/MtlsGreeterClient.java#L6-L76 "Go to snippet source")package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.grpc.GrpcClientSettings;
import akka.http.javadsl.common.SSLContextFactory;
import akka.japi.function.Creator;
import example.myapp.helloworld.grpc.GreeterServiceClient;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;

import javax.net.ssl.*;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class MtlsGreeterClient {

  public static void main(String[] args) {
    ActorSystem system = ActorSystem.create("MtlsHelloWorldClient");

    GrpcClientSettings clientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443, system)
        .withSslContext(sslContext());

    // alternatively, for rotating certs
    GrpcClientSettings rotatingClientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443, system)
        .withSslContextCreator(rotatingSslContext());

    GreeterServiceClient client = GreeterServiceClient.create(clientSettings, system);

    CompletionStage<HelloReply> reply = client.sayHello(HelloRequest.newBuilder().setName("Jonas").build());

    reply.whenComplete((response, error) -> {
      if (error == null) {
        System.out.println("Successful reply: " + reply);
      } else {
        System.out.println("Request failed");
        error.printStackTrace();
      }
      system.terminate();
    });
  }

  private static SSLContext sslContext() {
    try {
      return SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/client1.crt"),
        Paths.get("src/main/resources/certs/client1.key"),
        // server cert is issued by this CA
        List.of(Paths.get("src/main/resources/certs/rootCA.crt"))
      );
    } catch (Exception ex) {
      throw new RuntimeException("Failed to set up SSL context for the client", ex);
    }
  }

  private static Creator<SSLContext> rotatingSslContext() {
    return SSLContextFactory.refreshingSSLContextProvider(Duration.ofMinutes(5), () ->
      SSLContextFactory.createSSLContextFromPem(
      // Note: these are filesystem paths, not classpath
      Paths.get("src/main/resources/certs/client1.crt"),
      Paths.get("src/main/resources/certs/client1.key"),
      // server cert is issued by this CA
      List.of(Paths.get("src/main/resources/certs/rootCA.crt"))
    ));
  }
}
```

A client presenting a keypair will be able to connect to both servers requiring regular HTTPS gRPC services and mTLS servers that accept the client certificate.

It is possible to rotate the certificates without restarting the service, by using the Akka HTTP `SSLContextFactory.refreshingSSLContextProvider`. Note however that picking up the new certs works in concert with the connection handling of the underlying client, new certificates are not picked up until a new connection is made and connections are kept alive for a relatively long time by default (30 minutes without any requests sent with the default Netty based client).

For more details about the Akka HTTP certificate utilities see [Akka HTTP documentation](https://doc.akka.io/libraries/akka-http/10.7/client-side/client-https-support.html#convenient-loading-of-key-and-certificate).

## Further limiting of access using client certificate identities

In addition to requiring a trusted certificate it is possible to further limit access based on the identity present in the trusted client certificate ip or dns SAN (Subject Alternative Names) or CN (Common Name).

This is done by wrapping the service handler in the `requireClientCertificateIdentity`:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/GreeterServerWithClientCertIdentity.scala#L36-L48 "Go to snippet source")// Create service handlers
val handler: HttpRequest => Future[HttpResponse] =
  GreeterServiceHandler(new GreeterServiceImpl())

// As a Route
val handlerRoute: Route = handle(handler)

val route = requireClientCertificateIdentity("""mycorp\..*\.client\d+}""".r) {
  handlerRoute
}

// Bind service handler servers to localhost:8082
val binding = Http().newServerAt("127.0.0.1", 8082).bind(route)
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/GreeterServerWithClientCertIdentity.java#L46-L64 "Go to snippet source")// Instantiate implementation
GreeterService impl = new GreeterServiceImpl(mat);
Function<HttpRequest, CompletionStage<HttpResponse>> handler = GreeterServiceHandlerFactory.create(impl, sys);

// As a Route
Route handlerRoute = handle(handler);

// Protect the handler route
Route protectedHandler =
  requireClientCertificateIdentity("mycorp\\..*\\.client\\d+}", () -> {
    return handlerRoute;

  });

return Http.get(sys)
  .newServerAt("127.0.0.1", 8090)
  .bind(protectedHandler);
```

FIXME provide sample snippets

## Code Examples

### Example 1: Setting the server up

```scala
package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.http.scaladsl.ConnectionContext
import akka.http.scaladsl.Http
import akka.http.scaladsl.HttpsConnectionContext
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import example.myapp.helloworld.grpc._
import org.slf4j.LoggerFactory

import java.nio.file.Paths
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration.DurationInt
import scala.io.Source

object MtlsGreeterServer {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("MtlsHelloWorldServer")
    new MtlsGreeterServer(system).run()
    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

}

class MtlsGreeterServer(system: ActorSystem) {

  private val log = LoggerFactory.getLogger(classOf[MtlsGreeterServer])
  def run(): Future[Http.ServerBinding] = {
    // Akka boot up code
    implicit val sys: ActorSystem = system
    implicit val ec: ExecutionContext = sys.dispatcher

    // Create service handlers
    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl())

    // Bind service handler servers to localhost:8443
    val binding =
      Http()
        .newServerAt("127.0.0.1", 8443)
        .enableHttps(serverHttpContext)
        .bind(service)
        .map(_.addToCoordinatedShutdown(5.seconds))

    // report successful binding
    binding.foreach { binding => log.info(s"gRPC server bound to: {}", binding.localAddress) }

    binding
  }

  private def serverHttpContext: HttpsConnectionContext =
    ConnectionContext.httpsServer { () =>
      val context = SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        certificatePath = Paths.get("src/main/resources/certs/localhost-server.crt"),
        privateKeyPath = Paths.get("src/main/resources/certs/localhost-server.key"),
        // client certs are issued by this CA
        trustedCaCertificatePaths = Seq(Paths.get("src/main/resources/certs/rootCA.crt")))

      val engine = context.createSSLEngine()
      engine.setUseClientMode(false)

      // require client certs
      engine.setNeedClientAuth(true)

      engine
    }

  private def classPathFileAsString(path: String): String =
    Source.fromResource(path).mkString
}
```

### Example 2: Setting the server up

```java
package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.http.javadsl.ConnectionContext;
import akka.http.javadsl.Http;
import akka.http.javadsl.HttpsConnectionContext;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.common.SSLContextFactory;
import akka.http.javadsl.model.AttributeKeys;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.model.SslSessionInfo;
import akka.japi.function.Function;
import akka.pki.pem.DERPrivateKeyLoader;
import akka.pki.pem.PEMDecoder;
import akka.stream.Materializer;
import akka.stream.SystemMaterializer;
import example.myapp.helloworld.grpc.GreeterService;
import example.myapp.helloworld.grpc.GreeterServiceHandlerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

class MtlsGreeterServer {

  private static final Logger log = LoggerFactory.getLogger(MtlsGreeterServer.class);

  public static void main(String[] args) throws Exception {
    ActorSystem sys = ActorSystem.create("MtlsHelloWorldServer");

    run(sys).thenAccept(binding -> {
      log.info("gRPC server bound to {}", binding.localAddress());
    });

    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

  public static CompletionStage<ServerBinding> run(ActorSystem sys) throws Exception {
    Materializer mat = SystemMaterializer.get(sys).materializer();

    // Instantiate implementation
    GreeterService impl = new GreeterServiceImpl(mat);

    Function<HttpRequest, CompletionStage<HttpResponse>> service =
      GreeterServiceHandlerFactory.create(impl, sys);

    return Http
      .get(sys)
      .newServerAt("127.0.0.1", 8443)
      .enableHttps(serverHttpContext())
      .bind(service);
  }

  private static HttpsConnectionContext serverHttpContext() {
    return ConnectionContext.httpsServer(() -> {
      SSLContext context = SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/localhost-server.crt"),
        Paths.get("src/main/resources/certs/localhost-server.key"),
        // client certs to trust are issued by this CA
        List.of(Paths.get("src/main/resources/certs/rootCA.crt")));

      SSLEngine engine = context.createSSLEngine();
      engine.setUseClientMode(false);

      // require client certs
      engine.setNeedClientAuth(true);
      return engine;
    });
  }
}
```

### Example 3: Setting the client up

```scala
package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.grpc.GrpcClientSettings
import akka.http.scaladsl.common.SSLContextFactory
import example.myapp.helloworld.grpc.GreeterServiceClient
import example.myapp.helloworld.grpc.HelloRequest

import java.nio.file.Paths
import javax.net.ssl.SSLContext
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.DurationInt
import scala.util.Failure
import scala.util.Success

object MtlsGreeterClient {

  def main(args: Array[String]): Unit = {
    implicit val sys: ActorSystem = ActorSystem.create("MtlsHelloWorldClient")
    implicit val ec: ExecutionContext = sys.dispatcher

    val clientSettings = GrpcClientSettings.connectToServiceAt("localhost", 8443).withSslContext(sslContext())

    // alternatively, for rotating certs
    val rotatingClientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443).withSslContextProvider(rotatingSslContext())

    val client = GreeterServiceClient(clientSettings)
    val reply = client.sayHello(HelloRequest("Jonas"))

    reply.onComplete { tryResponse =>
      tryResponse match {
        case Success(reply) =>
          println(s"Successful reply: $reply")
        case Failure(exception) =>
          println("Request failed")
          exception.printStackTrace()
      }
      sys.terminate()
    }
  }

  def sslContext(): SSLContext = {
    SSLContextFactory.createSSLContextFromPem(
      // Note: these are filesystem paths, not classpath
      certificatePath = Paths.get("src/main/resources/certs/client1.crt"),
      privateKeyPath = Paths.get("src/main/resources/certs/client1.key"),
      // server cert is issued by this CA
      trustedCaCertificatePaths = Seq(Paths.get("src/main/resources/certs/rootCA.crt")))
  }

  def rotatingSslContext(): () => SSLContext = {
    SSLContextFactory.refreshingSSLContextProvider(30.seconds) { () =>
      println("### reloading cert")
      SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/client1.crt"),
        Paths.get("src/main/resources/certs/client1.key"),
        // server cert is issued by this CA
        Seq(Paths.get("src/main/resources/certs/rootCA.crt")))
    }
  }

}
```

### Example 4: Setting the client up

```java
package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.grpc.GrpcClientSettings;
import akka.http.javadsl.common.SSLContextFactory;
import akka.japi.function.Creator;
import example.myapp.helloworld.grpc.GreeterServiceClient;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;

import javax.net.ssl.*;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class MtlsGreeterClient {

  public static void main(String[] args) {
    ActorSystem system = ActorSystem.create("MtlsHelloWorldClient");

    GrpcClientSettings clientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443, system)
        .withSslContext(sslContext());

    // alternatively, for rotating certs
    GrpcClientSettings rotatingClientSettings =
      GrpcClientSettings.connectToServiceAt("localhost", 8443, system)
        .withSslContextCreator(rotatingSslContext());


    GreeterServiceClient client = GreeterServiceClient.create(clientSettings, system);

    CompletionStage<HelloReply> reply = client.sayHello(HelloRequest.newBuilder().setName("Jonas").build());

    reply.whenComplete((response, error) -> {
      if (error == null) {
        System.out.println("Successful reply: " + reply);
      } else {
        System.out.println("Request failed");
        error.printStackTrace();
      }
      system.terminate();
    });
  }

  private static SSLContext sslContext() {
    try {
      return SSLContextFactory.createSSLContextFromPem(
        // Note: these are filesystem paths, not classpath
        Paths.get("src/main/resources/certs/client1.crt"),
        Paths.get("src/main/resources/certs/client1.key"),
        // server cert is issued by this CA
        List.of(Paths.get("src/main/resources/certs/rootCA.crt"))
      );
    } catch (Exception ex) {
      throw new RuntimeException("Failed to set up SSL context for the client", ex);
    }
  }

  private static Creator<SSLContext> rotatingSslContext() {
    return SSLContextFactory.refreshingSSLContextProvider(Duration.ofMinutes(5), () ->
      SSLContextFactory.createSSLContextFromPem(
      // Note: these are filesystem paths, not classpath
      Paths.get("src/main/resources/certs/client1.crt"),
      Paths.get("src/main/resources/certs/client1.key"),
      // server cert is issued by this CA
      List.of(Paths.get("src/main/resources/certs/rootCA.crt"))
    ));
  }
}
```

### Example 5: Further limiting of access using client certificate identities

```scala
// Create service handlers
val handler: HttpRequest => Future[HttpResponse] =
  GreeterServiceHandler(new GreeterServiceImpl())

// As a Route
val handlerRoute: Route = handle(handler)

val route = requireClientCertificateIdentity("""mycorp\..*\.client\d+}""".r) {
  handlerRoute
}

// Bind service handler servers to localhost:8082
val binding = Http().newServerAt("127.0.0.1", 8082).bind(route)
```

### Example 6: Further limiting of access using client certificate identities

```java
// Instantiate implementation
GreeterService impl = new GreeterServiceImpl(mat);
Function<HttpRequest, CompletionStage<HttpResponse>> handler = GreeterServiceHandlerFactory.create(impl, sys);

// As a Route
Route handlerRoute = handle(handler);

// Protect the handler route
Route protectedHandler =
  requireClientCertificateIdentity("mycorp\\..*\\.client\\d+}", () -> {
    return handlerRoute;

  });

return Http.get(sys)
  .newServerAt("127.0.0.1", 8090)
  .bind(protectedHandler);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/2.5/deploy.html
- https://doc.akka.io/libraries/akka-grpc/2.5/troubleshooting.html
- https://doc.akka.io/libraries/akka-http/10.7/client-side/client-https-support.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html](https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html)*