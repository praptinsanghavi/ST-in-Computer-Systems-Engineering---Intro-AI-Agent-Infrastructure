---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/server/details.html
title: Details • Akka gRPC
---

# Details • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Details

## Accessing request metadata

By default the generated service interfaces don’t provide access to the request metadata, only to the request body (via the RPC method input parameter). If your methods require access to the request [`Metadata`](/api/akka-grpc/2.5.10/akka/grpc/javadsl/Metadata.html "akka.grpc.javadsl.Metadata")[`Metadata`](/api/akka-grpc/2.5.10/akka/grpc/scaladsl/Metadata.html "akka.grpc.scaladsl.Metadata"), you can configure Akka gRPC to generate server “power APIs” that extend the base service interfaces to provide an additional request metadata parameter to each service method. See the detailed chapters on [sbt](../buildtools/sbt.html), [Gradle](../buildtools/gradle.html) and [Maven](../buildtools/maven.html) for how to set this build option. Note that this option doesn’t effect the generated client stubs.

Notice: you need to change `GreeterServiceHandlerFactory` to `GreeterServiceHandlerFactoryPowerApiHandlerFactory`.

Notice: you need to change `GreeterServiceHandler` to `GreeterServicePowerApiHandler`.

Here’s an example implementation of these server power APIs:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/PowerGreeterServiceImpl.scala#L6-L50 "Go to snippet source")package example.myapp.helloworld

import akka.NotUsed
import akka.actor.ActorSystem
import akka.grpc.scaladsl.Metadata
import akka.stream.scaladsl.{ Sink, Source }
import example.myapp.helloworld.grpc._

import scala.concurrent.Future

class PowerGreeterServiceImpl(implicit system: ActorSystem) extends GreeterServicePowerApi {
  import system.dispatcher

  override def sayHello(in: HelloRequest, metadata: Metadata): Future[HelloReply] = {
    val greetee = authTaggedName(in, metadata)
    println(s"sayHello to $greetee")
    Future.successful(HelloReply(s"Hello, $greetee"))
  }

  override def itKeepsTalking(in: Source[HelloRequest, NotUsed], metadata: Metadata): Future[HelloReply] = {
    println(s"sayHello to in stream...")
    in.runWith(Sink.seq)
      .map(elements => HelloReply(s"Hello, ${elements.map(authTaggedName(_, metadata)).mkString(", ")}"))
  }

  override def itKeepsReplying(in: HelloRequest, metadata: Metadata): Source[HelloReply, NotUsed] = {
    val greetee = authTaggedName(in, metadata)
    println(s"sayHello to $greetee with stream of chars...")
    Source(s"Hello, $greetee".toList).map(character => HelloReply(character.toString))
  }

  override def streamHellos(in: Source[HelloRequest, NotUsed], metadata: Metadata): Source[HelloReply, NotUsed] = {
    println(s"sayHello to stream...")
    in.map(request => HelloReply(s"Hello, ${authTaggedName(request, metadata)}"))
  }

  // Bare-bones just for GRPC metadata demonstration purposes
  private def isAuthenticated(metadata: Metadata): Boolean =
    metadata.getText("authorization").nonEmpty

  private def authTaggedName(in: HelloRequest, metadata: Metadata): String = {
    val authenticated = isAuthenticated(metadata)
    s"${in.name} (${if (!authenticated) "not " else ""}authenticated)"
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/GreeterServicePowerApiImpl.java#L6-L87 "Go to snippet source")package example.myapp.helloworld;

import akka.NotUsed;
import akka.grpc.javadsl.Metadata;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import com.google.api.HttpBody;
import com.google.protobuf.ByteString;
import example.myapp.helloworld.grpc.GreeterServicePowerApi;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

public class GreeterServicePowerApiImpl implements GreeterServicePowerApi {
  private final Materializer mat;

  public GreeterServicePowerApiImpl(Materializer mat) {
   this.mat = mat;
  }

  @Override
  public CompletionStage<HelloReply> sayHello(HelloRequest in, Metadata metadata) {
    String greetee = authTaggedName(in, metadata);
    System.out.println("sayHello to " + greetee);
    HelloReply reply = HelloReply.newBuilder().setMessage("Hello, " + greetee).build();
    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HttpBody> sayHelloHttp(HelloRequest in, Metadata metadata) {
    System.out.println("sayHelloHttp to " + in.getName());
    HttpBody reply = HttpBody.newBuilder().setData(
      com.google.protobuf.ByteString.copyFrom("test".getBytes())
    ).build();

    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HelloReply> itKeepsTalking(Source<HelloRequest, NotUsed> in, Metadata metadata) {
    System.out.println("sayHello to in stream...");
    return in.runWith(Sink.seq(), mat)
      .thenApply(elements -> {
        String elementsStr = elements.stream().map(elem -> authTaggedName(elem, metadata))
            .collect(Collectors.toList()).toString();
        return HelloReply.newBuilder().setMessage("Hello, " + elementsStr).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in, Metadata metadata) {
    String greetee = authTaggedName(in, metadata);
    System.out.println("sayHello to " + greetee + " with stream of chars");
    List<Character> characters = ("Hello, " + greetee)
        .chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    return Source.from(characters)
      .map(character -> {
        return HelloReply.newBuilder().setMessage(String.valueOf(character)).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> streamHellos(Source<HelloRequest, NotUsed> in, Metadata metadata) {
    System.out.println("sayHello to stream...");
    return in.map(request -> HelloReply.newBuilder().setMessage("Hello, " + authTaggedName(request, metadata)).build());
  }

  // Bare-bones just for GRPC metadata demonstration purposes
  private boolean isAuthenticated(Metadata metadata) {
    return metadata.getText("authorization").isPresent();
  }

  private String authTaggedName(HelloRequest in, Metadata metadata) {
    boolean authenticated = isAuthenticated(metadata);
    return String.format("%s (%sauthenticated)", in.getName(), isAuthenticated(metadata) ? "" : "not ");
  }
}
```

## Status codes

To signal an error, you can fail the `Future``CompletionStage` or `Source` you are returning with a [`GrpcServiceException`](/api/akka-grpc/2.5.10/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException")[`GrpcServiceException`](/api/akka-grpc/2.5.10/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException") containing the status code you want to return.

For an overview of gRPC status codes and their meaning see [statuscodes.md](https://github.com/grpc/grpc/blob/master/doc/statuscodes.md).

For unary responses:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/scala/akka/grpc/scaladsl/GrpcExceptionHandlerSpec.scala#L57-L77 "Go to snippet source")import akka.grpc.GrpcServiceException
import io.grpc.Status

val exceptionMetadata = new MetadataBuilder()
  .addText("test-text", "test-text-data")
  .addBinary("test-binary-bin", ByteString("test-binary-data"))
  .build()

// ...

def sayHello(in: HelloRequest): Future[HelloReply] = {
  if (in.name.isEmpty)
    Future.failed(
      new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found"), exceptionMetadata))
  else
    Future.successful(HelloReply(s"Hi ${in.name}!"))
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/java/example/myapp/helloworld/grpc/ExceptionGreeterServiceImpl.java#L8-L39 "Go to snippet source")import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import io.grpc.Status;
import akka.grpc.GrpcServiceException;

// ...

@Override
public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    if (in.getName().isEmpty()) {
        CompletableFuture<HelloReply> future = new CompletableFuture<>();
        future.completeExceptionally(new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found")));
        return future;
    } else {
        return CompletableFuture.completedFuture(HelloReply.newBuilder().setMessage("Hi, " + in.getName()).build());
    }
}
```

For streaming responses:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/scala/akka/grpc/scaladsl/GrpcExceptionHandlerSpec.scala#L50-L89 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Source

import akka.grpc.GrpcServiceException
import io.grpc.Status

val exceptionMetadata = new MetadataBuilder()
  .addText("test-text", "test-text-data")
  .addBinary("test-binary-bin", ByteString("test-binary-data"))
  .build()

def itKeepsReplying(in: HelloRequest): Source[HelloReply, NotUsed] = {
  if (in.name.isEmpty)
    Source.failed(
      new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found"), exceptionMetadata))
  else
    myResponseSource
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/java/example/myapp/helloworld/grpc/ExceptionGreeterServiceImpl.java#L13-L54 "Go to snippet source")import akka.NotUsed;
import akka.stream.javadsl.Source;

import io.grpc.Status;
import akka.grpc.GrpcServiceException;

// ...

@Override
public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in) {
  if (in.getName().isEmpty()) {
        return Source.failed(new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found")));
    } else {
        return myResponseSource;
    }
}
```

## Rich error model

Beyond status codes you can also use the [Rich error model](https://grpc.io/docs/guides/error/#richer-error-model). 

This example uses an error model taken from [common protobuf](https://github.com/googleapis/googleapis/blob/master/google/rpc/error_details.proto) but every class that is based on `scalapb.GeneratedMessage``com.google.protobuf.Message` can be used. Build and return the error as an `AkkaGrpcException`:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/scala/akka/grpc/scaladsl/RichErrorModelNativeSpec.scala#L42-L45 "Go to snippet source")def sayHello(in: HelloRequest): Future[HelloReply] = {
  Future.failed(
    GrpcServiceException(Code.INVALID_ARGUMENT, "What is wrong?", Seq(new LocalizedMessage("EN", "The password!"))))
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/test/scala/example/myapp/helloworld/RichErrorNativeImpl.java#L25-L40 "Go to snippet source")@Override
public CompletionStage<HelloReply> sayHello(HelloRequest in) {

    ArrayList<Message> ar = new ArrayList<>();
    ar.add(LocalizedMessage.newBuilder().setLocale("EN").setMessage("The password!").build());

    GrpcServiceException exception = GrpcServiceException.create(
            Code.INVALID_ARGUMENT,
            "What is wrong?",
            ar
    );

    CompletableFuture<HelloReply> future = new CompletableFuture<>();
    future.completeExceptionally(exception);
    return future;
}
```

Please look [here](../client/details.html) how to handle this on the client.

## Code Examples

### Example 1: Accessing request metadata

```scala
package example.myapp.helloworld

import akka.NotUsed
import akka.actor.ActorSystem
import akka.grpc.scaladsl.Metadata
import akka.stream.scaladsl.{ Sink, Source }
import example.myapp.helloworld.grpc._

import scala.concurrent.Future

class PowerGreeterServiceImpl(implicit system: ActorSystem) extends GreeterServicePowerApi {
  import system.dispatcher

  override def sayHello(in: HelloRequest, metadata: Metadata): Future[HelloReply] = {
    val greetee = authTaggedName(in, metadata)
    println(s"sayHello to $greetee")
    Future.successful(HelloReply(s"Hello, $greetee"))
  }

  override def itKeepsTalking(in: Source[HelloRequest, NotUsed], metadata: Metadata): Future[HelloReply] = {
    println(s"sayHello to in stream...")
    in.runWith(Sink.seq)
      .map(elements => HelloReply(s"Hello, ${elements.map(authTaggedName(_, metadata)).mkString(", ")}"))
  }

  override def itKeepsReplying(in: HelloRequest, metadata: Metadata): Source[HelloReply, NotUsed] = {
    val greetee = authTaggedName(in, metadata)
    println(s"sayHello to $greetee with stream of chars...")
    Source(s"Hello, $greetee".toList).map(character => HelloReply(character.toString))
  }

  override def streamHellos(in: Source[HelloRequest, NotUsed], metadata: Metadata): Source[HelloReply, NotUsed] = {
    println(s"sayHello to stream...")
    in.map(request => HelloReply(s"Hello, ${authTaggedName(request, metadata)}"))
  }

  // Bare-bones just for GRPC metadata demonstration purposes
  private def isAuthenticated(metadata: Metadata): Boolean =
    metadata.getText("authorization").nonEmpty

  private def authTaggedName(in: HelloRequest, metadata: Metadata): String = {
    val authenticated = isAuthenticated(metadata)
    s"${in.name} (${if (!authenticated) "not " else ""}authenticated)"
  }
}
```

### Example 2: Accessing request metadata

```java
package example.myapp.helloworld;

import akka.NotUsed;
import akka.grpc.javadsl.Metadata;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import com.google.api.HttpBody;
import com.google.protobuf.ByteString;
import example.myapp.helloworld.grpc.GreeterServicePowerApi;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

public class GreeterServicePowerApiImpl implements GreeterServicePowerApi {
  private final Materializer mat;

  public GreeterServicePowerApiImpl(Materializer mat) {
   this.mat = mat;
  }

  @Override
  public CompletionStage<HelloReply> sayHello(HelloRequest in, Metadata metadata) {
    String greetee = authTaggedName(in, metadata);
    System.out.println("sayHello to " + greetee);
    HelloReply reply = HelloReply.newBuilder().setMessage("Hello, " + greetee).build();
    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HttpBody> sayHelloHttp(HelloRequest in, Metadata metadata) {
    System.out.println("sayHelloHttp to " + in.getName());
    HttpBody reply = HttpBody.newBuilder().setData(
      com.google.protobuf.ByteString.copyFrom("test".getBytes())
    ).build();

    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HelloReply> itKeepsTalking(Source<HelloRequest, NotUsed> in, Metadata metadata) {
    System.out.println("sayHello to in stream...");
    return in.runWith(Sink.seq(), mat)
      .thenApply(elements -> {
        String elementsStr = elements.stream().map(elem -> authTaggedName(elem, metadata))
            .collect(Collectors.toList()).toString();
        return HelloReply.newBuilder().setMessage("Hello, " + elementsStr).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in, Metadata metadata) {
    String greetee = authTaggedName(in, metadata);
    System.out.println("sayHello to " + greetee + " with stream of chars");
    List<Character> characters = ("Hello, " + greetee)
        .chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    return Source.from(characters)
      .map(character -> {
        return HelloReply.newBuilder().setMessage(String.valueOf(character)).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> streamHellos(Source<HelloRequest, NotUsed> in, Metadata metadata) {
    System.out.println("sayHello to stream...");
    return in.map(request -> HelloReply.newBuilder().setMessage("Hello, " + authTaggedName(request, metadata)).build());
  }

  // Bare-bones just for GRPC metadata demonstration purposes
  private boolean isAuthenticated(Metadata metadata) {
    return metadata.getText("authorization").isPresent();
  }

  private String authTaggedName(HelloRequest in, Metadata metadata) {
    boolean authenticated = isAuthenticated(metadata);
    return String.format("%s (%sauthenticated)", in.getName(), isAuthenticated(metadata) ? "" : "not ");
  }
}
```

### Example 3: Status codes

```scala
import akka.grpc.GrpcServiceException
import io.grpc.Status

val exceptionMetadata = new MetadataBuilder()
  .addText("test-text", "test-text-data")
  .addBinary("test-binary-bin", ByteString("test-binary-data"))
  .build()

// ...

def sayHello(in: HelloRequest): Future[HelloReply] = {
  if (in.name.isEmpty)
    Future.failed(
      new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found"), exceptionMetadata))
  else
    Future.successful(HelloReply(s"Hi ${in.name}!"))
}
```

### Example 4: Status codes

```java
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import io.grpc.Status;
import akka.grpc.GrpcServiceException;

// ...

@Override
public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    if (in.getName().isEmpty()) {
        CompletableFuture<HelloReply> future = new CompletableFuture<>();
        future.completeExceptionally(new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found")));
        return future;
    } else {
        return CompletableFuture.completedFuture(HelloReply.newBuilder().setMessage("Hi, " + in.getName()).build());
    }
}
```

### Example 5: Status codes

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source

import akka.grpc.GrpcServiceException
import io.grpc.Status

val exceptionMetadata = new MetadataBuilder()
  .addText("test-text", "test-text-data")
  .addBinary("test-binary-bin", ByteString("test-binary-data"))
  .build()

def itKeepsReplying(in: HelloRequest): Source[HelloReply, NotUsed] = {
  if (in.name.isEmpty)
    Source.failed(
      new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found"), exceptionMetadata))
  else
    myResponseSource
}
```

### Example 6: Status codes

```java
import akka.NotUsed;
import akka.stream.javadsl.Source;

import io.grpc.Status;
import akka.grpc.GrpcServiceException;

// ...

@Override
public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in) {
  if (in.getName().isEmpty()) {
        return Source.failed(new GrpcServiceException(Status.INVALID_ARGUMENT.withDescription("No name found")));
    } else {
        return myResponseSource;
    }
}
```

### Example 7: Rich error model

```scala
def sayHello(in: HelloRequest): Future[HelloReply] = {
  Future.failed(
    GrpcServiceException(Code.INVALID_ARGUMENT, "What is wrong?", Seq(new LocalizedMessage("EN", "The password!"))))
}
```

### Example 8: Rich error model

```java
@Override
public CompletionStage<HelloReply> sayHello(HelloRequest in) {

    ArrayList<Message> ar = new ArrayList<>();
    ar.add(LocalizedMessage.newBuilder().setLocale("EN").setMessage("The password!").build());

    GrpcServiceException exception = GrpcServiceException.create(
            Code.INVALID_ARGUMENT,
            "What is wrong?",
            ar
    );

    CompletableFuture<HelloReply> future = new CompletableFuture<>();
    future.completeExceptionally(exception);
    return future;
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html
- https://doc.akka.io/libraries/akka-grpc/current/client/details.html
- https://doc.akka.io/libraries/akka-grpc/current/server/akka-http.html
- https://doc.akka.io/libraries/akka-grpc/current/server/kubernetes.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/server/details.html](https://doc.akka.io/libraries/akka-grpc/current/server/details.html)*