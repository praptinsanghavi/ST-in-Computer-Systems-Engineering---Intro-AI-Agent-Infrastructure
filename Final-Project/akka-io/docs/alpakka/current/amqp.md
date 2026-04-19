---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:44Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/amqp.html
title: AMQP • Alpakka Documentation
---

# AMQP • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# AMQP

The AMQP connector provides Akka Stream sources and sinks to connect to AMQP 0\.9\.1 servers (RabbitMQ, OpenAMQ, etc.).

AMQP 1\.0 is currently not supported (Qpid, ActiveMQ, Solace, etc.).

| Project Info: Alpakka AMQP | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-amqp 10\.0\.2 [Snapshots are available](other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.amqp |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.1, 2016\-11\-11 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Aamqp) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-amqp" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-amqp_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-amqp_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.rabbitmq | amqp\-client | [5\.25\.0](https://mvnrepository.com/artifact/com.rabbitmq/amqp-client/5.25.0) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.rabbitmq    amqp-client    [5.25.0](https://mvnrepository.com/artifact/com.rabbitmq/amqp-client/5.25.0)    AL 2.0
    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Connecting to server

All the AMQP connectors are configured using a [`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider")[`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider") and a list of [`Declaration`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/Declaration.html "akka.stream.alpakka.amqp.Declaration")[`Declaration`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/Declaration.html "akka.stream.alpakka.amqp.Declaration")

There are several types of [`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider")[`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider"):

- [`AmqpLocalConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpLocalConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpLocalConnectionProvider")[`AmqpLocalConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpLocalConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpLocalConnectionProvider") which connects to the default localhost. It creates a new connection for each stage.
- [`AmqpUriConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpUriConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpUriConnectionProvider")[`AmqpUriConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpUriConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpUriConnectionProvider") which connects to the given AMQP URI. It creates a new connection for each stage.
- [`AmqpDetailsConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpDetailsConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpDetailsConnectionProvider")[`AmqpDetailsConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpDetailsConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpDetailsConnectionProvider") which supports more fine\-grained configuration. It creates a new connection for each stage.
- [`AmqpConnectionFactoryConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionFactoryConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpConnectionFactoryConnectionProvider")[`AmqpConnectionFactoryConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionFactoryConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpConnectionFactoryConnectionProvider") which takes a raw [ConnectionFactory](https://rabbitmq.github.io/rabbitmq-java-client/api/current/com/rabbitmq/client/ConnectionFactory.html). It creates a new connection for each stage.
- [`AmqpCachedConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpCachedConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpCachedConnectionProvider")[`AmqpCachedConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpCachedConnectionProvider$.html "akka.stream.alpakka.amqp.AmqpCachedConnectionProvider") which receive any other provider as parameter and caches the connection it provides to be used in all stages. By default it closes the connection whenever the last stage using the provider stops. Optionally, it takes `automaticRelease` boolean parameter so the connection is not automatically release and the user have to release it explicitly.

Warning
Please be aware that the basic usage of [`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider")[`AmqpConnectionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html "akka.stream.alpakka.amqp.AmqpConnectionProvider") like this `AmqpUriConnectionProvider(s"amqp://$host:$port")` has an issue with recovering connections, more details can be found in this [issue](https://github.com/akka/alpakka/issues/1270)

## Sending messages

First define a queue name and the declaration of the queue that the messages will be sent to.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L42-L43 "Go to snippet source")val queueName = "amqp-conn-it-spec-simple-queue-" + System.currentTimeMillis()
val queueDeclaration = QueueDeclaration(queueName)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L67-L68 "Go to snippet source")final String queueName = "amqp-conn-it-test-simple-queue-" + System.currentTimeMillis();
final QueueDeclaration queueDeclaration = QueueDeclaration.create(queueName);
```

Here we used [`QueueDeclaration`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/QueueDeclaration.html "akka.stream.alpakka.amqp.QueueDeclaration")[`QueueDeclaration`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/QueueDeclaration.html "akka.stream.alpakka.amqp.QueueDeclaration") configuration class to create a queue declaration.

### With flow

Similarly as with Sink, the first step is to create Flow which accepts [`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")[`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")s and forwards it’s content to the AMQP server. Flow emits [`WriteResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteResult.html "akka.stream.alpakka.amqp.WriteResult")[`WriteResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteResult.html "akka.stream.alpakka.amqp.WriteResult")s informing about publication result (see below for summary of delivery guarantees for different Flow variants).

[`AmqpFlow`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpFlow$.html "akka.stream.alpakka.amqp.javadsl.AmqpFlow")[`AmqpFlow`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpFlow$.html "akka.stream.alpakka.amqp.scaladsl.AmqpFlow") is a collection of factory methods that facilitates creation of flows. Here we created a *simple* sink, which means that we are able to pass `ByteString`s to the sink instead of wrapping data into [`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")[`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")s.

Last step is to [materialize](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html) and run the flow we have created.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L255-L269 "Go to snippet source")val settings = AmqpWriteSettings(connectionProvider)
  .withRoutingKey(queueName)
  .withDeclaration(queueDeclaration)
  .withBufferSize(10)
  .withConfirmationTimeout(200.millis)

val amqpFlow: Flow[WriteMessage, WriteResult, Future[Done]] =
  AmqpFlow.withConfirm(settings)

val input = Vector("one", "two", "three", "four", "five")
val result: Future[Seq[WriteResult]] =
  Source(input)
    .map(message => WriteMessage(ByteString(message)))
    .via(amqpFlow)
    .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L344-L362 "Go to snippet source")final AmqpWriteSettings settings =
    AmqpWriteSettings.create(connectionProvider)
        .withRoutingKey(queueName)
        .withDeclaration(queueDeclaration)
        .withBufferSize(10)
        .withConfirmationTimeout(Duration.ofMillis(200));

final Flow<WriteMessage, WriteResult, CompletionStage<Done>> amqpFlow =
    AmqpFlow.createWithConfirm(settings);

final List<String> input = Arrays.asList("one", "two", "three", "four", "five");

final List<WriteResult> result =
    Source.from(input)
        .map(message -> WriteMessage.create(ByteString.fromString(message)))
        .via(amqpFlow)
        .runWith(Sink.seq(), system)
        .toCompletableFuture()
        .get();
```

Various variants of AMQP flow offer different delivery and ordering guarantees:

| AMQP flow factory | Description |
| --- | --- |
| AmqpFlow.apply | The most basic type of flow. Does not impose delivery guarantees, messages are published in a fire\-and\-forget manner. Emitted results have `confirmed` always set to true. |
| AmqpFlow.withConfirm | Variant that uses asynchronous confirmations. Maximum number of messages simultaneously waiting for confirmation before signaling backpressure is configured with a `bufferSize` parameter. Emitted results preserve the order of messages pulled from upstream \- due to that restriction this flow is expected to be slightly less effective than it’s unordered counterpart. |
| AmqpFlow.withConfirmUnordered | The same as `AmqpFlow.withConfirm` with the exception of ordering guarantee \- results are emitted downstream as soon as confirmation is received, meaning that there is no ordering guarantee of any sort. |

For [`FlowWithContext`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowWithContext$.html "akka.stream.scaladsl.FlowWithContext") counterparts of above flows see [`AmqpFlowWithContext`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpFlowWithContext$.html "akka.stream.alpakka.amqp.javadsl.AmqpFlowWithContext")[`AmqpFlowWithContext`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpFlowWithContext$.html "akka.stream.alpakka.amqp.scaladsl.AmqpFlowWithContext").

Warning
`AmqpFlow.withConfirm` and `AmqpFlow.withConfirmUnordered` are implemented using RabbitMQ’s extension to AMQP protocol ([Publisher Confirms](https://www.rabbitmq.com/confirms.html#publisher-confirms)), therefore they are not intended to work with another AMQP brokers.

### With sink

Create a sink, that accepts and forwards [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")s to the AMQP server.

[`AmqpSink`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpSink$.html "akka.stream.alpakka.amqp.javadsl.AmqpSink")[`AmqpSink`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpSink$.html "akka.stream.alpakka.amqp.scaladsl.AmqpSink") is a collection of factory methods that facilitates creation of sinks. Here we created a *simple* sink, which means that we are able to pass `ByteString`s to the sink instead of wrapping data into [`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")[`WriteMessage`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html "akka.stream.alpakka.amqp.WriteMessage")s.

Last step is to [materialize](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html) and run the sink we have created.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L47-L58 "Go to snippet source")val amqpSink: Sink[ByteString, Future[Done]] =
  AmqpSink.simple(
    AmqpWriteSettings(connectionProvider)
      .withRoutingKey(queueName)
      .withDeclaration(queueDeclaration)
  )

val input = Vector("one", "two", "three", "four", "five")
val writing: Future[Done] =
  Source(input)
    .map(s => ByteString(s))
    .runWith(amqpSink)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L78-L86 "Go to snippet source")final Sink<ByteString, CompletionStage<Done>> amqpSink =
    AmqpSink.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withRoutingKey(queueName)
            .withDeclaration(queueDeclaration));

final List<String> input = Arrays.asList("one", "two", "three", "four", "five");
CompletionStage<Done> writing =
    Source.from(input).map(ByteString::fromString).runWith(amqpSink, system);
```

## Receiving messages

Create a source using the same queue declaration as before.

The `bufferSize` parameter controls the maximum number of messages to prefetch from the AMQP server.

Run the source and take the same amount of messages as we previously sent to it.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L63-L74 "Go to snippet source")val amqpSource: Source[ReadResult, NotUsed] =
  AmqpSource.atMostOnceSource(
    NamedQueueSourceSettings(connectionProvider, queueName)
      .withDeclaration(queueDeclaration)
      .withAckRequired(false),
    bufferSize = 10
  )

val result: Future[immutable.Seq[ReadResult]] =
  amqpSource
    .take(input.size)
    .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L91-L100 "Go to snippet source")final Integer bufferSize = 10;
final Source<ReadResult, NotUsed> amqpSource =
    AmqpSource.atMostOnceSource(
        NamedQueueSourceSettings.create(connectionProvider, queueName)
            .withDeclaration(queueDeclaration)
            .withAckRequired(false),
        bufferSize);

final CompletionStage<List<ReadResult>> result =
    amqpSource.take(input.size()).runWith(Sink.seq(), system);
```

This is how you send and receive message from AMQP server using this connector.

## Using Pub/Sub

Instead of sending messages directly to queues, it is possible to send messages to an exchange and then provide instructions to the AMQP server what to do with incoming messages. We are going to use the *fanout* type of the exchange, which enables message broadcasting to multiple consumers. We are going to do that by using an exchange declaration for the sink and all of the sources.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L125-L126 "Go to snippet source")val exchangeName = "amqp-conn-it-spec-pub-sub-" + System.currentTimeMillis()
val exchangeDeclaration = ExchangeDeclaration(exchangeName, "fanout")
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L172-L174 "Go to snippet source")final String exchangeName = "amqp-conn-it-test-pub-sub-" + System.currentTimeMillis();
final ExchangeDeclaration exchangeDeclaration =
    ExchangeDeclaration.create(exchangeName, "fanout");
```

The sink for the exchange is created in a very similar way.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L130-L134 "Go to snippet source")val amqpSink = AmqpSink.simple(
  AmqpWriteSettings(connectionProvider)
    .withExchange(exchangeName)
    .withDeclaration(exchangeDeclaration)
)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L178-L182 "Go to snippet source")final Sink<ByteString, CompletionStage<Done>> amqpSink =
    AmqpSink.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withExchange(exchangeName)
            .withDeclaration(exchangeDeclaration));
```

For the source, we are going to create multiple sources and merge them using [Akka Streams operators](https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html).

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L138-L153 "Go to snippet source")val fanoutSize = 4

val mergedSources = (0 until fanoutSize).foldLeft(Source.empty[(Int, String)]) {
  case (source, fanoutBranch) =>
    source.merge(
      AmqpSource
        .atMostOnceSource(
          TemporaryQueueSourceSettings(
            connectionProvider,
            exchangeName
          ).withDeclaration(exchangeDeclaration),
          bufferSize = 1
        )
        .map(msg => (fanoutBranch, msg.bytes.utf8String))
    )
}
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L186-L199 "Go to snippet source")final int fanoutSize = 4;
final int bufferSize = 1;

Source<Pair<Integer, String>, NotUsed> mergedSources = Source.empty();
for (int i = 0; i < fanoutSize; i++) {
  final int fanoutBranch = i;
  mergedSources =
      mergedSources.merge(
          AmqpSource.atMostOnceSource(
                  TemporaryQueueSourceSettings.create(connectionProvider, exchangeName)
                      .withDeclaration(exchangeDeclaration),
                  bufferSize)
              .map(msg -> Pair.create(fanoutBranch, msg.bytes().utf8String())));
}
```

We merge all sources into one and add the index of the source to all incoming messages, so we can distinguish which source the incoming message came from.

Such sink and source can be started the same way as in the previous example.

## Using rabbitmq as an RPC mechanism

If you have remote workers that you want to incorporate into a stream, you can do it using rabbit RPC workflow [RabbitMQ RPC](https://www.rabbitmq.com/tutorials/tutorial-six-java.html)

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L93-L101 "Go to snippet source")val amqpRpcFlow = AmqpRpcFlow.simple(
  AmqpWriteSettings(connectionProvider).withRoutingKey(queueName).withDeclaration(queueDeclaration)
)

val (rpcQueueF: Future[String], probe: TestSubscriber.Probe[ByteString]) = Source(input)
  .map(s => ByteString(s))
  .viaMat(amqpRpcFlow)(Keep.right)
  .toMat(TestSink())(Keep.both)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L126-L138 "Go to snippet source")final Flow<ByteString, ByteString, CompletionStage<String>> ampqRpcFlow =
    AmqpRpcFlow.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withRoutingKey(queueName)
            .withDeclaration(queueDeclaration),
        1);

Pair<CompletionStage<String>, TestSubscriber.Probe<ByteString>> result =
    Source.from(input)
        .map(ByteString::fromString)
        .viaMat(ampqRpcFlow, Keep.right())
        .toMat(TestSink.create(system), Keep.both())
        .run(system);
```

## Acknowledging messages downstream

Committable sources return [`CommittableReadResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/CommittableReadResult.html "akka.stream.alpakka.amqp.javadsl.CommittableReadResult")[`CommittableReadResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/CommittableReadResult.html "akka.stream.alpakka.amqp.scaladsl.CommittableReadResult") which wraps the [`ReadResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/ReadResult.html "akka.stream.alpakka.amqp.ReadResult")[`ReadResult`](/api/alpakka/10.0.2/akka/stream/alpakka/amqp/ReadResult.html "akka.stream.alpakka.amqp.ReadResult") and exposes the methods `ack` and `nack`.

Use `ack` to acknowledge the message back to RabbitMQ. `ack` takes an optional boolean parameter `multiple` indicating whether you are acknowledging the individual message or all the messages up to it.

Use `nack` to reject a message. Apart from the `multiple` argument, `nack` takes another optional boolean parameter indicating whether the item should be requeued or not.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/scala/docs/scaladsl/AmqpDocsSpec.scala#L196-L237 "Go to snippet source")val amqpSource = AmqpSource.committableSource(
  NamedQueueSourceSettings(connectionProvider, queueName)
    .withDeclaration(queueDeclaration),
  bufferSize = 10
)

val result: Future[immutable.Seq[ReadResult]] = amqpSource
  .mapAsync(1)(businessLogic)
  .mapAsync(1)(cm => cm.ack().map(_ => cm.message))
  .take(input.size)
  .runWith(Sink.seq)

val nackedResults: Future[immutable.Seq[ReadResult]] = amqpSource
  .mapAsync(1)(businessLogic)
  .take(input.size)
  .mapAsync(1)(cm => cm.nack(multiple = false, requeue = true).map(_ => cm.message))
  .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/amqp/src/test/java/docs/javadsl/AmqpDocsTest.java#L258-L316 "Go to snippet source")final Integer bufferSize = 10;
final Source<CommittableReadResult, NotUsed> amqpSource =
    AmqpSource.committableSource(
        NamedQueueSourceSettings.create(connectionProvider, queueName)
            .withDeclaration(queueDeclaration),
        bufferSize);

final CompletionStage<List<ReadResult>> result =
    amqpSource
        .mapAsync(1, this::businessLogic)
        .mapAsync(1, cm -> cm.ack(/* multiple */ false).thenApply(unused -> cm.message()))
        .take(input.size())
        .runWith(Sink.seq(), system);

final CompletionStage<List<ReadResult>> nackedResults =
    amqpSource
        .take(input.size())
        .mapAsync(1, this::businessLogic)
        .mapAsync(
            1,
            cm ->
                cm.nack(/* multiple */ false, /* requeue */ true)
                    .thenApply(unused -> cm.message()))
        .runWith(Sink.seq(), system);
```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-amqp" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 2: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-amqp_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-amqp_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Sending messages

```scala
val queueName = "amqp-conn-it-spec-simple-queue-" + System.currentTimeMillis()
val queueDeclaration = QueueDeclaration(queueName)
```

### Example 5: Sending messages

```java
final String queueName = "amqp-conn-it-test-simple-queue-" + System.currentTimeMillis();
final QueueDeclaration queueDeclaration = QueueDeclaration.create(queueName);
```

### Example 6: With flow

```scala
val settings = AmqpWriteSettings(connectionProvider)
  .withRoutingKey(queueName)
  .withDeclaration(queueDeclaration)
  .withBufferSize(10)
  .withConfirmationTimeout(200.millis)

val amqpFlow: Flow[WriteMessage, WriteResult, Future[Done]] =
  AmqpFlow.withConfirm(settings)

val input = Vector("one", "two", "three", "four", "five")
val result: Future[Seq[WriteResult]] =
  Source(input)
    .map(message => WriteMessage(ByteString(message)))
    .via(amqpFlow)
    .runWith(Sink.seq)
```

### Example 7: With flow

```java
final AmqpWriteSettings settings =
    AmqpWriteSettings.create(connectionProvider)
        .withRoutingKey(queueName)
        .withDeclaration(queueDeclaration)
        .withBufferSize(10)
        .withConfirmationTimeout(Duration.ofMillis(200));

final Flow<WriteMessage, WriteResult, CompletionStage<Done>> amqpFlow =
    AmqpFlow.createWithConfirm(settings);

final List<String> input = Arrays.asList("one", "two", "three", "four", "five");

final List<WriteResult> result =
    Source.from(input)
        .map(message -> WriteMessage.create(ByteString.fromString(message)))
        .via(amqpFlow)
        .runWith(Sink.seq(), system)
        .toCompletableFuture()
        .get();
```

### Example 8: With sink

```scala
val amqpSink: Sink[ByteString, Future[Done]] =
  AmqpSink.simple(
    AmqpWriteSettings(connectionProvider)
      .withRoutingKey(queueName)
      .withDeclaration(queueDeclaration)
  )

val input = Vector("one", "two", "three", "four", "five")
val writing: Future[Done] =
  Source(input)
    .map(s => ByteString(s))
    .runWith(amqpSink)
```

### Example 9: With sink

```java
final Sink<ByteString, CompletionStage<Done>> amqpSink =
    AmqpSink.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withRoutingKey(queueName)
            .withDeclaration(queueDeclaration));

final List<String> input = Arrays.asList("one", "two", "three", "four", "five");
CompletionStage<Done> writing =
    Source.from(input).map(ByteString::fromString).runWith(amqpSink, system);
```

### Example 10: Receiving messages

```scala
val amqpSource: Source[ReadResult, NotUsed] =
  AmqpSource.atMostOnceSource(
    NamedQueueSourceSettings(connectionProvider, queueName)
      .withDeclaration(queueDeclaration)
      .withAckRequired(false),
    bufferSize = 10
  )

val result: Future[immutable.Seq[ReadResult]] =
  amqpSource
    .take(input.size)
    .runWith(Sink.seq)
```

### Example 11: Receiving messages

```java
final Integer bufferSize = 10;
final Source<ReadResult, NotUsed> amqpSource =
    AmqpSource.atMostOnceSource(
        NamedQueueSourceSettings.create(connectionProvider, queueName)
            .withDeclaration(queueDeclaration)
            .withAckRequired(false),
        bufferSize);

final CompletionStage<List<ReadResult>> result =
    amqpSource.take(input.size()).runWith(Sink.seq(), system);
```

### Example 12: Using Pub/Sub

```scala
val exchangeName = "amqp-conn-it-spec-pub-sub-" + System.currentTimeMillis()
val exchangeDeclaration = ExchangeDeclaration(exchangeName, "fanout")
```

### Example 13: Using Pub/Sub

```java
final String exchangeName = "amqp-conn-it-test-pub-sub-" + System.currentTimeMillis();
final ExchangeDeclaration exchangeDeclaration =
    ExchangeDeclaration.create(exchangeName, "fanout");
```

### Example 14: Using Pub/Sub

```scala
val amqpSink = AmqpSink.simple(
  AmqpWriteSettings(connectionProvider)
    .withExchange(exchangeName)
    .withDeclaration(exchangeDeclaration)
)
```

### Example 15: Using Pub/Sub

```java
final Sink<ByteString, CompletionStage<Done>> amqpSink =
    AmqpSink.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withExchange(exchangeName)
            .withDeclaration(exchangeDeclaration));
```

### Example 16: Using Pub/Sub

```scala
val fanoutSize = 4

val mergedSources = (0 until fanoutSize).foldLeft(Source.empty[(Int, String)]) {
  case (source, fanoutBranch) =>
    source.merge(
      AmqpSource
        .atMostOnceSource(
          TemporaryQueueSourceSettings(
            connectionProvider,
            exchangeName
          ).withDeclaration(exchangeDeclaration),
          bufferSize = 1
        )
        .map(msg => (fanoutBranch, msg.bytes.utf8String))
    )
}
```

### Example 17: Using Pub/Sub

```java
final int fanoutSize = 4;
final int bufferSize = 1;

Source<Pair<Integer, String>, NotUsed> mergedSources = Source.empty();
for (int i = 0; i < fanoutSize; i++) {
  final int fanoutBranch = i;
  mergedSources =
      mergedSources.merge(
          AmqpSource.atMostOnceSource(
                  TemporaryQueueSourceSettings.create(connectionProvider, exchangeName)
                      .withDeclaration(exchangeDeclaration),
                  bufferSize)
              .map(msg -> Pair.create(fanoutBranch, msg.bytes().utf8String())));
}
```

### Example 18: Using rabbitmq as an RPC mechanism

```scala
val amqpRpcFlow = AmqpRpcFlow.simple(
  AmqpWriteSettings(connectionProvider).withRoutingKey(queueName).withDeclaration(queueDeclaration)
)

val (rpcQueueF: Future[String], probe: TestSubscriber.Probe[ByteString]) = Source(input)
  .map(s => ByteString(s))
  .viaMat(amqpRpcFlow)(Keep.right)
  .toMat(TestSink())(Keep.both)
  .run()
```

### Example 19: Using rabbitmq as an RPC mechanism

```java
final Flow<ByteString, ByteString, CompletionStage<String>> ampqRpcFlow =
    AmqpRpcFlow.createSimple(
        AmqpWriteSettings.create(connectionProvider)
            .withRoutingKey(queueName)
            .withDeclaration(queueDeclaration),
        1);

Pair<CompletionStage<String>, TestSubscriber.Probe<ByteString>> result =
    Source.from(input)
        .map(ByteString::fromString)
        .viaMat(ampqRpcFlow, Keep.right())
        .toMat(TestSink.create(system), Keep.both())
        .run(system);
```

### Example 20: Acknowledging messages downstream

```scala
val amqpSource = AmqpSource.committableSource(
  NamedQueueSourceSettings(connectionProvider, queueName)
    .withDeclaration(queueDeclaration),
  bufferSize = 10
)

val result: Future[immutable.Seq[ReadResult]] = amqpSource
  .mapAsync(1)(businessLogic)
  .mapAsync(1)(cm => cm.ack().map(_ => cm.message))
  .take(input.size)
  .runWith(Sink.seq)

val nackedResults: Future[immutable.Seq[ReadResult]] = amqpSource
  .mapAsync(1)(businessLogic)
  .take(input.size)
  .mapAsync(1)(cm => cm.nack(multiple = false, requeue = true).map(_ => cm.message))
  .runWith(Sink.seq)
```

### Example 21: Acknowledging messages downstream

```java
final Integer bufferSize = 10;
final Source<CommittableReadResult, NotUsed> amqpSource =
    AmqpSource.committableSource(
        NamedQueueSourceSettings.create(connectionProvider, queueName)
            .withDeclaration(queueDeclaration),
        bufferSize);

final CompletionStage<List<ReadResult>> result =
    amqpSource
        .mapAsync(1, this::businessLogic)
        .mapAsync(1, cm -> cm.ack(/* multiple */ false).thenApply(unused -> cm.message()))
        .take(input.size())
        .runWith(Sink.seq(), system);

final CompletionStage<List<ReadResult>> nackedResults =
    amqpSource
        .take(input.size())
        .mapAsync(1, this::businessLogic)
        .mapAsync(
            1,
            cm ->
                cm.nack(/* multiple */ false, /* requeue */ true)
                    .thenApply(unused -> cm.message()))
        .runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpCachedConnectionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionFactoryConnectionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpConnectionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpDetailsConnectionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpLocalConnectionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/AmqpUriConnectionProvider$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/Declaration.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/QueueDeclaration.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/ReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteMessage.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/WriteResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpFlowWithContext$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/AmqpSink$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/javadsl/CommittableReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpFlowWithContext$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/AmqpSink$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/amqp/scaladsl/CommittableReadResult.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/xml.html
- https://doc.akka.io/docs/alpakka/current/external/apache-camel.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/amqp.html](https://doc.akka.io/docs/alpakka/current/amqp.html)*