---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/../quickstart-scala/index.html
title: Akka gRPC Quickstart with Scala
---

# Akka gRPC Quickstart with Scala

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka gRPC Quickstart with Scala

Akka gRPC is a toolkit for building streaming gRPC servers and clients on top of Akka Streams. This guide will get you started building gRPC based systems with Scala. If you prefer to use Akka gRPC with Java, switch to the [Akka gRPC Quickstart with Java guide](../quickstart-java/index.html). 

After trying this example the [Akka gRPC documentation](../index.html) is a good next step to continue learning more about Akka gRPC.

## Downloading the example

The Hello World example for Scala is a zipped project that includes build files for sbt, Maven and Gradle. You can choose any of these build tools. You can run it on Linux, MacOS, or Windows. The only prerequisite is Java 17 or later, and a local installation of the build tool.

1. Download the project [zip file](../attachments/akka-grpc-quickstart-scala.zip).
2. Extract the zip file to a convenient location:

- On Linux and OSX systems, open a terminal and use the command `unzip akka-grpc-quickstart-scala.zip`.
- On Windows, use a tool such as File Explorer to extract the project.

## Running the example

To run Hello World:

On OSX/Linux use `sbt` to start sbt in the instructions below, on Windows `sbt.bat`. On OSX/Linux use `./gradlew` to start Gradle in the instructions below, on Windows `./gradlew.bat`. For Gradle you have to make the build tool executable with `chmod u+x ./gradlew`

1. In a console, change directories to the top level of the unzipped project.

For example, if you used the default project name, akka\-grpc\-quickstart, and extracted the project to your root directory, from the root directory, enter: `cd akka-grpc-quickstart`
2. Compile the project by entering:

sbt

```
sbt compile

```

Maven

```
mvn compile

```

Gradle

```
./gradlew compileScala

```

sbtMavenGradle downloads project dependencies, generates gRPC classes from protobuf, and compiles.
3. Run the server:

sbt

```
sbt "runMain com.example.helloworld.GreeterServer"

```

Maven

```
mvn compile dependency:properties exec:exec@server

```

Gradle

```
./gradlew runServer

```

sbtMavenGradle runs the `com.example.helloworld.GreeterServer` main class that starts the gRPC server. The `exec:exec@server` execution is defined in the Maven `pom.xml` build definition. The `runServer` task is defined in `build.gradle`.

The output should include something like:

```
gRPC server bound to: /127.0.0.1:8080

```
4. Run the client, open another console window and enter:

sbt

```
sbt "runMain com.example.helloworld.GreeterClient"

```

Maven

```
mvn compile dependency:properties exec:exec@client

```

Gradle

```
./gradlew runClient

```

sbtMavenGradle runs the `com.example.helloworld.GreeterClient` main class that starts the gRPC client. The `exec:exec@client` execution is defined in the Maven `pom.xml` build definition. The `runClient` task is defined in `build.gradle`.

The output should include something like:

```
Performing request: Alice
Performing request: Bob
HelloReply(Hello, Bob,UnknownFieldSet(Map()))
HelloReply(Hello, Alice,UnknownFieldSet(Map()))

```

Congratulations, you just ran your first Akka gRPC server and client. Now take a look at what happened under the covers.

You can end the programs with `ctrl-c`.

## What Hello World does

As you saw in the console output, the example outputs several greetings. Let’s take at the code and what happens at runtime.

### Server

First, the `GreeterServer` main class creates an `akka.actor.typed.ActorSystem`, a container in which Actors, Akka Streams and Akka HTTP run. Next, it defines a function from `HttpRequest` to `Future[HttpResponse]` using the `GreeterServiceImpl`. This function handles gRPC requests in the HTTP/2 server and is bound to port 8080 in this example.

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/samples/akka-grpc-quickstart-scala/src/main/scala/com/example/helloworld/GreeterServer.scala#L4-L19 "Go to snippet source")  
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.ConnectionContext
import akka.http.scaladsl.Http
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import com.typesafe.config.ConfigFactory

import java.nio.file.Paths
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success
object GreeterServer {

  def main(args: Array[String]): Unit = {
    // important to enable HTTP/2 in ActorSystem's config
    val conf =
      ConfigFactory.parseString("akka.http.server.enable-http2 = on").withFallback(ConfigFactory.defaultApplication())
    val system = ActorSystem[Nothing](Behaviors.empty[Nothing], "GreeterServer", conf)
    new GreeterServer(system).run()
  }
}

class GreeterServer(system: ActorSystem[_]) {

  def run(): Future[Http.ServerBinding] = {
    implicit val sys = system
    implicit val ec: ExecutionContext = system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl(system))

    val serverHttpContext = ConnectionContext.httpsServer(
      SSLContextFactory.createSSLContextFromPem(
        // Note: filesystem paths, not classpath
        Paths.get("src/main/resources/certs/server1.pem"),
        Paths.get("src/main/resources/certs/server1.key")))

    val bound: Future[Http.ServerBinding] = Http()(system)
      .newServerAt(interface = "127.0.0.1", port = 8080)
      .enableHttps(serverHttpContext)
      .bind(service)
      .map(_.addToCoordinatedShutdown(hardTerminationDeadline = 10.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        println(s"gRPC server bound to ${address.getHostString}:${address.getPort}")
      case Failure(ex) =>
        println("Failed to bind gRPC endpoint, terminating system")
        ex.printStackTrace()
        system.terminate()
    }

    bound
  }
}
```

`GreeterServiceImpl` is our implementation of the gRPC service, but first we must define the interface of the service in the protobuf file `src/main/protobuf/helloworld.proto`:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/samples/akka-grpc-quickstart-scala/src/main/protobuf/helloworld.proto#L2-L30 "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "com.example.helloworld";
option java_outer_classname = "HelloWorldProto";

// The greeting service definition.
service GreeterService {
    // Sends a greeting
    rpc SayHello (HelloRequest) returns (HelloReply) {}
}

// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
}
```

When compiling the project several things are generated from the proto definition. You can find the generated files in `target/scala-2.13/akka-grpc/main/``target/generated-sources/``build/generated/source/proto/main/` if you are curious.

For the server the following classes are generated:

- Message classes, such as `HelloRequest` and `HelloReply`
- `GreeterService` interface of the service
- `GreeterServiceHandler` utility to create the `HttpRequest` to `HttpResponse` function from the `GreeterServiceImpl`

The part that we have to implement on the server side is the `GreeterServiceImpl` which implements the generated `GreeterService` interface. It is this implementation that is bound to the `HTTP` server via the `GreeterServiceHandler` and it looks like this:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/samples/akka-grpc-quickstart-scala/src/main/scala/com/example/helloworld/GreeterServiceImpl.scala#L4-L13 "Go to snippet source")import scala.concurrent.Future

import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.stream.scaladsl.BroadcastHub
import akka.stream.scaladsl.Keep
import akka.stream.scaladsl.MergeHub
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

class GreeterServiceImpl(system: ActorSystem[_]) extends GreeterService {
  private implicit val sys: ActorSystem[_] = system

  override def sayHello(request: HelloRequest): Future[HelloReply] = {
    Future.successful(HelloReply(s"Hello, ${request.name}"))
  }

}
```

### Client

In this example we have the client in the same project as the server. That is common for testing purposes but for real usage you or another team would have a separate project (different service) that is using the client and doesn’t implement the server side of the service. Between such projects you would only share the proto file (by copying it).

From the same proto file that was used on the server side classes are generated for the client:

- Message classes, such as `HelloRequest` and `HelloReply`
- `GreeterService` interface of the service
- `GreeterServiceClient` that implements the client side of the `GreeterService`

On the client side we don’t have to implement anything, the `GreeterServiceClient` is ready to be used as is.

We need an `ActorSystem` and then the `GreeterServiceClient` can be created and used like this:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/samples/akka-grpc-quickstart-scala/src/main/scala/com/example/helloworld/GreeterClient.scala#L4-L14 "Go to snippet source")import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Failure
import scala.util.Success
import akka.Done
import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.grpc.GrpcClientSettings
import akka.stream.scaladsl.Source

object GreeterClient {

  def main(args: Array[String]): Unit = {
    implicit val sys: ActorSystem[Nothing] = ActorSystem[Nothing](Behaviors.empty[Nothing], "GreeterClient")
    implicit val ec: ExecutionContext = sys.executionContext

    val client = GreeterServiceClient(GrpcClientSettings.fromConfig("helloworld.GreeterService"))

    val names =
      if (args.isEmpty) List("Alice", "Bob")
      else args.toList

    names.foreach(singleRequestReply)

    def singleRequestReply(name: String): Unit = {
      println(s"Performing request: $name")
      val reply = client.sayHello(HelloRequest(name))
      reply.onComplete {
        case Success(msg) =>
          println(msg)
        case Failure(e) =>
          println(s"Error: $e")
      }
    }

  }

}
```

Note that clients and servers don’t have to be implemented with Akka gRPC. They can be implemented/used with other libraries or languages and interoperate according to the gRPC specification.

### Other types of calls

In this first example we saw a gRPC service call for single request returning a `Future` reply. The parameter and return type of the calls may also be streams in 3 different combinations:

- **client streaming call** \- `Source` (stream) of requests from the client that returns a `Future``CompletionStage` with a single response, see `itKeepsTalking` in above example
- **server streaming call** \- single request that returns a `Source` (stream) of responses, see `itKeepsReplying` in above example
- **client and server streaming call** \- `Source` (stream) of requests from the client that returns a `Source` (stream) of responses, see `streamHellos` in above example

As next step, let’s try the [bidirectional streaming calls](streaming.html).

## Code Examples

### Example 1: Running the example

```text
sbt compile
```

### Example 2: Running the example

```text
mvn compile
```

### Example 3: Running the example

```text
./gradlew compileScala
```

### Example 4: Running the example

```text
sbt "runMain com.example.helloworld.GreeterServer"
```

### Example 5: Running the example

```text
mvn compile dependency:properties exec:exec@server
```

### Example 6: Running the example

```text
./gradlew runServer
```

### Example 7: Running the example

```text
gRPC server bound to: /127.0.0.1:8080
```

### Example 8: Running the example

```text
sbt "runMain com.example.helloworld.GreeterClient"
```

### Example 9: Running the example

```text
mvn compile dependency:properties exec:exec@client
```

### Example 10: Running the example

```text
./gradlew runClient
```

### Example 11: Running the example

```text
Performing request: Alice
Performing request: Bob
HelloReply(Hello, Bob,UnknownFieldSet(Map()))
HelloReply(Hello, Alice,UnknownFieldSet(Map()))
```

### Example 12: Server

```scala
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.ConnectionContext
import akka.http.scaladsl.Http
import akka.http.scaladsl.common.SSLContextFactory
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import com.typesafe.config.ConfigFactory

import java.nio.file.Paths
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success
object GreeterServer {

  def main(args: Array[String]): Unit = {
    // important to enable HTTP/2 in ActorSystem's config
    val conf =
      ConfigFactory.parseString("akka.http.server.enable-http2 = on").withFallback(ConfigFactory.defaultApplication())
    val system = ActorSystem[Nothing](Behaviors.empty[Nothing], "GreeterServer", conf)
    new GreeterServer(system).run()
  }
}

class GreeterServer(system: ActorSystem[_]) {

  def run(): Future[Http.ServerBinding] = {
    implicit val sys = system
    implicit val ec: ExecutionContext = system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl(system))

    val serverHttpContext = ConnectionContext.httpsServer(
      SSLContextFactory.createSSLContextFromPem(
        // Note: filesystem paths, not classpath
        Paths.get("src/main/resources/certs/server1.pem"),
        Paths.get("src/main/resources/certs/server1.key")))

    val bound: Future[Http.ServerBinding] = Http()(system)
      .newServerAt(interface = "127.0.0.1", port = 8080)
      .enableHttps(serverHttpContext)
      .bind(service)
      .map(_.addToCoordinatedShutdown(hardTerminationDeadline = 10.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        println(s"gRPC server bound to ${address.getHostString}:${address.getPort}")
      case Failure(ex) =>
        println("Failed to bind gRPC endpoint, terminating system")
        ex.printStackTrace()
        system.terminate()
    }

    bound
  }
}
```

### Example 13: Server

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "com.example.helloworld";
option java_outer_classname = "HelloWorldProto";

// The greeting service definition.
service GreeterService {
    // Sends a greeting
    rpc SayHello (HelloRequest) returns (HelloReply) {}
}

// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
}
```

### Example 14: Server

```scala
import scala.concurrent.Future

import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.stream.scaladsl.BroadcastHub
import akka.stream.scaladsl.Keep
import akka.stream.scaladsl.MergeHub
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

class GreeterServiceImpl(system: ActorSystem[_]) extends GreeterService {
  private implicit val sys: ActorSystem[_] = system


  override def sayHello(request: HelloRequest): Future[HelloReply] = {
    Future.successful(HelloReply(s"Hello, ${request.name}"))
  }

}
```

### Example 15: Client

```scala
import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Failure
import scala.util.Success
import akka.Done
import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.grpc.GrpcClientSettings
import akka.stream.scaladsl.Source

object GreeterClient {

  def main(args: Array[String]): Unit = {
    implicit val sys: ActorSystem[Nothing] = ActorSystem[Nothing](Behaviors.empty[Nothing], "GreeterClient")
    implicit val ec: ExecutionContext = sys.executionContext

    val client = GreeterServiceClient(GrpcClientSettings.fromConfig("helloworld.GreeterService"))

    val names =
      if (args.isEmpty) List("Alice", "Bob")
      else args.toList

    names.foreach(singleRequestReply)


    def singleRequestReply(name: String): Unit = {
      println(s"Performing request: $name")
      val reply = client.sayHello(HelloRequest(name))
      reply.onComplete {
        case Success(msg) =>
          println(msg)
        case Failure(e) =>
          println(s"Error: $e")
      }
    }


  }

}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/attachments/akka-grpc-quickstart-scala.zip
- https://doc.akka.io/libraries/akka-grpc/current/index.html
- https://doc.akka.io/libraries/akka-grpc/current/quickstart-java/index.html
- https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/streaming.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/index.html](https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/index.html)*