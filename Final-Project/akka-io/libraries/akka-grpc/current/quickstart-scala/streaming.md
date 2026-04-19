---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/../quickstart-scala/streaming.html
title: Streaming gRPC • Akka gRPC Quickstart with Scala
---

# Streaming gRPC • Akka gRPC Quickstart with Scala

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Streaming gRPC

In the [first example](index.html) we saw a gRPC service call for single request reply. Let’s add a bidirectional streaming call. First we will run it and then look at how it’s implemented.

### Running the streaming call

To run Hello World including the streaming calls:

1. Run the server:

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

sbtMavenGradle builds the project and runs the gRPC server

This starts the server in the same way as in the first example we ran previously. The output should include something like:

```
gRPC server bound to: /127.0.0.1:8080

```
2. Run the client, open another console window and enter:

sbt

```
sbt "runMain com.example.helloworld.GreeterClient Alice"

```

Maven

```
mvn -DGreeterClient.user=Alice compile dependency:properties exec:exec@client

```

Gradle

```
./gradlew runClient -PGreeterClient.user=Alice

```

sbtMavenGradle runs the gRPC client for Alice

Note that the difference from the first example is the additional argument `Alice``-DGreeterClient.user=Alice``-PGreeterClient.user=Alice`.

The output should include something like:

```
Performing request: Alice
Performing streaming requests: Alice
HelloReply(Hello, Alice)
Alice got streaming reply: Hello, Alice-0
Alice got streaming reply: Hello, Alice-1
Alice got streaming reply: Hello, Alice-2
Alice got streaming reply: Hello, Alice-3

```

The “Performing request: Alice” and “HelloReply(Hello, Alice)” comes from the single request response call in the previous example and the “streaming” are new.
3. Open yet another console window and enter:

sbt

```
sbt "runMain com.example.helloworld.GreeterClient Bob"

```

Maven

```
mvn -DGreeterClient.user=Bob compile dependency:properties exec:exec@client

```

Gradle

```
./gradlew runClient -PGreeterClient.user=Bob

```

sbtMavenGradle runs the gRPC client for Bob

Note that the difference is the argument `Bob`. The output should include something like:

```
Performing request: Bob
Performing streaming requests: Bob
HelloReply(Hello, Bob)
Bob got streaming reply: Hello, Bob-0
Bob got streaming reply: Hello, Alice-38
Bob got streaming reply: Hello, Bob-1
Bob got streaming reply: Hello, Alice-39
Bob got streaming reply: Hello, Bob-2
Bob got streaming reply: Hello, Alice-40
Bob got streaming reply: Hello, Bob-3

```

Note how the messages from Alice are also received by Bob.
4. Switch back to the console window with the Alice client. The output should include something like:

```
Alice got streaming reply: Hello, Bob-10
Alice got streaming reply: Hello, Alice-48
Alice got streaming reply: Hello, Bob-11
Alice got streaming reply: Hello, Alice-49
Alice got streaming reply: Hello, Bob-12
Alice got streaming reply: Hello, Alice-50
Alice got streaming reply: Hello, Bob-13

```

Note how messages from both Alice and Bob are received in both clients. The streaming request messages are broadcasted to all connected clients via the server.

Now take a look at how this is implemented.

You can end the programs with `ctrl-c`.

## What the streaming Hello World does

As you saw in the console output, the example outputs greetings from all clients to all clients. Let’s take at the code and what happens at runtime.

### Server

First, the `GreeterServer` main class is the same as explained in the [first example](index.html#server). It binds the `GreeterServiceImpl` to the HTTP server.

We define the interface of the the new call in the protobuf file `src/main/protobuf/helloworld.proto` next to the previous `SayHello` call:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/samples/akka-grpc-quickstart-scala/src/main/protobuf/helloworld.proto#L14-L17 "Go to snippet source")// The stream of incoming HelloRequest messages are
// sent out as corresponding HelloReply. From
// all clients to all clients, like a chat room.
rpc SayHelloToAll (stream HelloRequest) returns (stream HelloReply) {}
```

This method is generated in the `GreeterService` interface and we have to implement it on the server side in `GreeterServiceImpl`:

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

  val (inboundHub: Sink[HelloRequest, NotUsed], outboundHub: Source[HelloReply, NotUsed]) =
    MergeHub.source[HelloRequest]
    .map(request => HelloReply(s"Hello, ${request.name}"))
      .toMat(BroadcastHub.sink[HelloReply])(Keep.both)
      .run()

  override def sayHello(request: HelloRequest): Future[HelloReply] = {
    Future.successful(HelloReply(s"Hello, ${request.name}"))
  }

  override def sayHelloToAll(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    in.runWith(inboundHub)
    outboundHub
  }
}
```

To connect all input and output streams of all connected clients dynamically we use a [MergeHub](https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html#using-the-mergehub) for the incoming messages and a [BroadcastHub](https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html#using-the-broadcasthub) for the outgoing messages.

The `MergeHub` and `BroadcastHub` are only needed because we want to connect different clients with each other. If each client was separate it might look like this to have the stream of incoming messages from one client transformed and emitted only to that client:

```
  override def sayHelloToAll(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    in.map(request => HelloReply(s"Hello, ${request.name}"))
  }

```

### Client

The client is emitting `HelloRequest` once per second and prints the streamed responses:

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

def streamingBroadcast(name: String): Unit = {
  println(s"Performing streaming requests: $name")

  val requestStream: Source[HelloRequest, NotUsed] =
    Source
      .tick(1.second, 1.second, "tick")
      .zipWithIndex
      .map { case (_, i) => i }
      .map(i => HelloRequest(s"$name-$i"))
      .mapMaterializedValue(_ => NotUsed)

  val responseStream: Source[HelloReply, NotUsed] = client.sayHelloToAll(requestStream)
  val done: Future[Done] =
    responseStream.runForeach(reply => println(s"$name got streaming reply: ${reply.message}"))

  done.onComplete {
    case Success(_) =>
      println("streamingBroadcast done")
    case Failure(e) =>
      println(s"Error streamingBroadcast: $e")
  }
}
```

## Code Examples

### Example 1: Running the streaming call

```text
sbt "runMain com.example.helloworld.GreeterServer"
```

### Example 2: Running the streaming call

```text
mvn compile dependency:properties exec:exec@server
```

### Example 3: Running the streaming call

```text
./gradlew runServer
```

### Example 4: Running the streaming call

```text
gRPC server bound to: /127.0.0.1:8080
```

### Example 5: Running the streaming call

```text
sbt "runMain com.example.helloworld.GreeterClient Alice"
```

### Example 6: Running the streaming call

```text
mvn -DGreeterClient.user=Alice compile dependency:properties exec:exec@client
```

### Example 7: Running the streaming call

```text
./gradlew runClient -PGreeterClient.user=Alice
```

### Example 8: Running the streaming call

```text
Performing request: Alice
Performing streaming requests: Alice
HelloReply(Hello, Alice)
Alice got streaming reply: Hello, Alice-0
Alice got streaming reply: Hello, Alice-1
Alice got streaming reply: Hello, Alice-2
Alice got streaming reply: Hello, Alice-3
```

### Example 9: Running the streaming call

```text
sbt "runMain com.example.helloworld.GreeterClient Bob"
```

### Example 10: Running the streaming call

```text
mvn -DGreeterClient.user=Bob compile dependency:properties exec:exec@client
```

### Example 11: Running the streaming call

```text
./gradlew runClient -PGreeterClient.user=Bob
```

### Example 12: Running the streaming call

```text
Performing request: Bob
Performing streaming requests: Bob
HelloReply(Hello, Bob)
Bob got streaming reply: Hello, Bob-0
Bob got streaming reply: Hello, Alice-38
Bob got streaming reply: Hello, Bob-1
Bob got streaming reply: Hello, Alice-39
Bob got streaming reply: Hello, Bob-2
Bob got streaming reply: Hello, Alice-40
Bob got streaming reply: Hello, Bob-3
```

### Example 13: Running the streaming call

```text
Alice got streaming reply: Hello, Bob-10
Alice got streaming reply: Hello, Alice-48
Alice got streaming reply: Hello, Bob-11
Alice got streaming reply: Hello, Alice-49
Alice got streaming reply: Hello, Bob-12
Alice got streaming reply: Hello, Alice-50
Alice got streaming reply: Hello, Bob-13
```

### Example 14: Server

```proto
// The stream of incoming HelloRequest messages are
// sent out as corresponding HelloReply. From
// all clients to all clients, like a chat room.
rpc SayHelloToAll (stream HelloRequest) returns (stream HelloReply) {}
```

### Example 15: Server

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

  val (inboundHub: Sink[HelloRequest, NotUsed], outboundHub: Source[HelloReply, NotUsed]) =
    MergeHub.source[HelloRequest]
    .map(request => HelloReply(s"Hello, ${request.name}"))
      .toMat(BroadcastHub.sink[HelloReply])(Keep.both)
      .run()

  override def sayHello(request: HelloRequest): Future[HelloReply] = {
    Future.successful(HelloReply(s"Hello, ${request.name}"))
  }

  override def sayHelloToAll(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    in.runWith(inboundHub)
    outboundHub
  }
}
```

### Example 16: Server

```scala
override def sayHelloToAll(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    in.map(request => HelloReply(s"Hello, ${request.name}"))
  }
```

### Example 17: Client

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

def streamingBroadcast(name: String): Unit = {
  println(s"Performing streaming requests: $name")

  val requestStream: Source[HelloRequest, NotUsed] =
    Source
      .tick(1.second, 1.second, "tick")
      .zipWithIndex
      .map { case (_, i) => i }
      .map(i => HelloRequest(s"$name-$i"))
      .mapMaterializedValue(_ => NotUsed)

  val responseStream: Source[HelloReply, NotUsed] = client.sayHelloToAll(requestStream)
  val done: Future[Done] =
    responseStream.runForeach(reply => println(s"$name got streaming reply: ${reply.message}"))

  done.onComplete {
    case Success(_) =>
      println("streamingBroadcast done")
    case Failure(e) =>
      println(s"Error streamingBroadcast: $e")
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html
- https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/index.html
- https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/streaming.html](https://doc.akka.io/libraries/akka-grpc/current/quickstart-scala/streaming.html)*