---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/client/details.html
title: Details • Akka gRPC
---

# Details • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Details

## Client Lifecycle

Instances of the generated client may be long\-lived and can be used concurrently. You can keep the client running until your system terminates, or close it earlier. To avoid leaking in the latter case, you should call `.close()` on the client.

When the connection breaks, the client will try reconnecting to the server automatically. On each reconnection attempt, If a connection the `ServiceDiscovery` will be used and a new host may be found.

When using client\-side [load balancing](details.html#load-balancing) the reconnection loop will run indefinitely.

When using a direct client (not load balanced) when the connection breaks you can set up a maximum number of reconnection attempts. If that limit is reached, the client will shutdown. The default number of attempts to reconnect is infinite and configurable via `GrpcClientSettings`’s `connectionAttempts`.

The client offers a method `closed()` that returns a `Future``CompletionStage` that will complete once the client is explicitly closed after invoking `close()`. The returned `Future``CompletionStage` will complete with a failure when the maximum number of `connectionAttempts` (which causes a shutdown).

## Shared Channels

By default, each instance of a generated client creates a separate HTTP connection to the server. If the server supports multiple services, you may want to allow multiple generated clients to share a single connection.

To do this, create a [`GrpcChannel`](/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel.html "akka.grpc.GrpcChannel")[`GrpcChannel`](/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel.html "akka.grpc.GrpcChannel") by passing [`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings")[`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings") to the apply method. You can then use the GrpcChannel instance to create multiple generated clients; each client will use the provided channel to communicate with the server.

When using a shared channel, the client lifecycle changes slightly. Like the generated client, `GrpcChannel` offers `close` and `closed` methods; these can be used to explicitly close the connection to the server and detect when the connection has been closed or shutdown due to errors, respectively. When you are done communicating with the server, you should call `close` on the channel, rather than the individual clients. Calling `close` on a generated client that was created with a shared channel will throw a [`GrpcClientCloseException`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html "akka.grpc.GrpcClientCloseException")[`GrpcClientCloseException`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html "akka.grpc.GrpcClientCloseException").

## Channel laziness

The Netty based channel backing a client will only actually connect once the client sees a first request. It is possible to configure it to eagerly connect as soon as the client, or channel, is created by setting `eager-connection = true` or programmatically through [`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings")[`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings") `withEagerConnection`.

If the client does not see any traffic it will transition to an idle state, and close the connection, after 5 minutes. You can find some more details about the Netty channel behavior in [the grpc connectivity\-semantics\-and\-api docs](https://github.com/grpc/grpc/blob/master/doc/connectivity-semantics-and-api.md).

The Akka HTTP backed client always connects eagerly.

## Load balancing

When multiple endpoints are discovered for a gRPC client, currently one is selected and used for all outgoing calls.

This approach, while naïve, in fact works well in many cases: when there are multiple nodes available to handle requests, a server\-side load balancer is better\-positioned to make decisions than any single client, as it can take into account information from multiple clients, and sometimes even lifecycle information (e.g. not forward requests to nodes that are scheduled to shut down).

Client\-side load balancing is desirable when you are using the default `static` or the `grpc-dns` discovery mechanism. You can set the `load-balancing-policy` client configuration option to `round_robin` to enable the round\_robin client\-side load balancing strategy provided by grpc\-java.

Note that load balancing is marked as [experimental](https://github.com/grpc/grpc-java/issues/1771) in grpc\-java.

Client\-side load balancing for other discovery mechanisms is [not yet supported](https://github.com/akka/akka-grpc/issues/809).

## Request Metadata

Default request metadata, for example for authentication, can be provided through the [`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings")[`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings") passed to the client when it is created, it will be the base metadata used for each request.

In some cases you will want to provide specific metadata to a single request, this can be done through the “lifted” client API, each method of the service has an empty parameter list version (`.sayHello()`) on the client returning a [`SingleResponseRequestBuilder`](/api/akka-grpc/2.5.10/akka/grpc/javadsl/SingleResponseRequestBuilder.html "akka.grpc.javadsl.SingleResponseRequestBuilder")[`SingleResponseRequestBuilder`](/api/akka-grpc/2.5.10/akka/grpc/scaladsl/SingleResponseRequestBuilder.html "akka.grpc.scaladsl.SingleResponseRequestBuilder") or [`StreamResponseRequestBuilder`](/api/akka-grpc/2.5.10/akka/grpc/javadsl/StreamResponseRequestBuilder.html "akka.grpc.javadsl.StreamResponseRequestBuilder")[`StreamResponseRequestBuilder`](/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StreamResponseRequestBuilder.html "akka.grpc.scaladsl.StreamResponseRequestBuilder").

After adding the required metadata the request is done by calling `invoke` with the request parameters.

Notice: method `addHeader` return a new object, you should use it like `String` or use it in the chain structure.

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/LiftedGreeterClient.scala#L36-L40 "Go to snippet source")def singleRequestReply(): Unit = {
  sys.log.info("Performing request")
  val reply = client.sayHello().addHeader("key", "value").invoke(HelloRequest("Alice"))
  println(s"got single reply: ${Await.result(reply, 5.seconds).message}")
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/LiftedGreeterClient.java#L58-L64 "Go to snippet source")private static void singleRequestReply(GreeterServiceClient client) throws Exception {
  HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
  CompletionStage<HelloReply> reply = client.sayHello()
      .addHeader("key", "value")
      .invoke(request);
  System.out.println("got single reply: " + reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
}
```

## Rich error model

Beyond status codes you can also use the [Rich error model](https://grpc.io/docs/guides/error/#richer-error-model).

Extract the `GrpcServiceException` to access `code`, `message` and `details`.

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/interop-tests/src/test/scala/akka/grpc/scaladsl/RichErrorModelNativeSpec.scala#L85-L105 "Go to snippet source")val richErrorResponse = client.sayHello(HelloRequest("Bob")).failed.futureValue

richErrorResponse match {
  case status: GrpcServiceException =>
    status.metadata match {
      case richMetadata: MetadataStatus =>
        richMetadata.details(0).typeUrl should be("type.googleapis.com/google.rpc.LocalizedMessage")

        import LocalizedMessage.messageCompanion
        val localizedMessage = richMetadata.getParsedDetails[LocalizedMessage].head
        localizedMessage.message should be("The password!")
        localizedMessage.locale should be("EN")

        richMetadata.code should be(3)
        richMetadata.message should be("What is wrong?")

      case other => fail(s"This should be a RichGrpcMetadataImpl but it is ${other.getClass}")
    }

  case ex => fail(s"This should be a GrpcServiceException but it is ${ex.getClass}")
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/test/scala/example/myapp/helloworld/RichErrorModelNativeTest.java#L63-L78 "Go to snippet source")HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
CompletionStage<HelloReply> response = client.sayHello(request);
StatusRuntimeException statusRuntimeException = response.toCompletableFuture().handle((res, ex) ->
  (StatusRuntimeException) ex
).get();

GrpcServiceException ex = GrpcServiceException.apply(statusRuntimeException);
MetadataStatus meta = (MetadataStatus) ex.getMetadata();
assertEquals("type.googleapis.com/google.rpc.LocalizedMessage", meta.getDetails().get(0).typeUrl());

assertEquals(Status.INVALID_ARGUMENT.getCode().value(), meta.getCode());
assertEquals("What is wrong?", meta.getMessage());

LocalizedMessage details = meta.getParsedDetails(LocalizedMessage.getDefaultInstance()).get(0);
Assert.assertEquals("The password!", details.getMessage());
Assert.assertEquals("EN", details.getLocale());
```

Please look [here](../server/details.html) how to create errors with such details on the server side.

## Code Examples

### Example 1: Request Metadata

```scala
def singleRequestReply(): Unit = {
  sys.log.info("Performing request")
  val reply = client.sayHello().addHeader("key", "value").invoke(HelloRequest("Alice"))
  println(s"got single reply: ${Await.result(reply, 5.seconds).message}")
}
```

### Example 2: Request Metadata

```java
private static void singleRequestReply(GreeterServiceClient client) throws Exception {
  HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
  CompletionStage<HelloReply> reply = client.sayHello()
      .addHeader("key", "value")
      .invoke(request);
  System.out.println("got single reply: " + reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
}
```

### Example 3: Rich error model

```scala
val richErrorResponse = client.sayHello(HelloRequest("Bob")).failed.futureValue

richErrorResponse match {
  case status: GrpcServiceException =>
    status.metadata match {
      case richMetadata: MetadataStatus =>
        richMetadata.details(0).typeUrl should be("type.googleapis.com/google.rpc.LocalizedMessage")

        import LocalizedMessage.messageCompanion
        val localizedMessage = richMetadata.getParsedDetails[LocalizedMessage].head
        localizedMessage.message should be("The password!")
        localizedMessage.locale should be("EN")

        richMetadata.code should be(3)
        richMetadata.message should be("What is wrong?")

      case other => fail(s"This should be a RichGrpcMetadataImpl but it is ${other.getClass}")
    }

  case ex => fail(s"This should be a GrpcServiceException but it is ${ex.getClass}")
}
```

### Example 4: Rich error model

```java
HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
CompletionStage<HelloReply> response = client.sayHello(request);
StatusRuntimeException statusRuntimeException = response.toCompletableFuture().handle((res, ex) ->
  (StatusRuntimeException) ex
).get();

GrpcServiceException ex = GrpcServiceException.apply(statusRuntimeException);
MetadataStatus meta = (MetadataStatus) ex.getMetadata();
assertEquals("type.googleapis.com/google.rpc.LocalizedMessage", meta.getDetails().get(0).typeUrl());

assertEquals(Status.INVALID_ARGUMENT.getCode().value(), meta.getCode());
assertEquals("What is wrong?", meta.getMessage());

LocalizedMessage details = meta.getParsedDetails(LocalizedMessage.getDefaultInstance()).get(0);
Assert.assertEquals("The password!", details.getMessage());
Assert.assertEquals("EN", details.getLocale());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcChannel.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientCloseException.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/javadsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/SingleResponseRequestBuilder.html
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/scaladsl/StreamResponseRequestBuilder.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/index.html
- https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html
- https://doc.akka.io/libraries/akka-grpc/current/client/details.html
- https://doc.akka.io/libraries/akka-grpc/current/server/details.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/client/details.html](https://doc.akka.io/libraries/akka-grpc/current/client/details.html)*