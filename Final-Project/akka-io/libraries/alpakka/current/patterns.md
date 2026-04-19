---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/patterns.html
title: Integration Patterns • Alpakka Documentation
---

# Integration Patterns • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Integration Patterns

Many [Enterprise Integration Patterns](https://www.enterpriseintegrationpatterns.com/patterns/messaging/toc.html) can be implemented with Akka Streams (see [Akka Streams documentation](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html)).

# PassThrough

Use PassThroughFlow when you have a message that should be used in a flow that transform it but you want to maintain the original message for another following flow. For example when consuming messages from Kafka (CommittableMessage), the message can be used inside a flow (transform it, save it inside a database, …) and then you need again the original message to commit the offset.

It can be used whenever you have 2 flows:

- Flow1 that takes a message `A` and returns `B`
- Flow2 that takes a message `A` and return `C`

If you want to execute first Flow1 and then Flow2 you need a way to maintain/passthrough message `A`. 

```
                    a=>transform=>a1
                   /                 \
                  /                   \
a=>(a, a)=>unzip -                     zip=>(a1, a)=> a
                  \                   /
                   \                 /
                    --------a--------

```

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/scala/akka/stream/alpakka/eip/scaladsl/PassThroughExamples.scala#L72-L92 "Go to snippet source")object PassThroughFlow {
  def apply[A, T](processingFlow: Flow[A, T, NotUsed]): Graph[FlowShape[A, (T, A)], NotUsed] =
    apply[A, T, (T, A)](processingFlow, Keep.both)

  def apply[A, T, O](processingFlow: Flow[A, T, NotUsed], output: (T, A) => O): Graph[FlowShape[A, O], NotUsed] =
    Flow.fromGraph(GraphDSL.create() { implicit builder =>
      {
        import GraphDSL.Implicits._

        val broadcast = builder.add(Broadcast[A](2))
        val zip = builder.add(ZipWith[T, A, O]((left, right) => output(left, right)))

        // format: off
        broadcast.out(0) ~> processingFlow ~> zip.in0
        broadcast.out(1)         ~>           zip.in1
        // format: on

        FlowShape(broadcast.in, zip.out)
      }
    })
}
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/java/akka/stream/alpakka/eip/javadsl/PassThroughExamples.java#L86-L104 "Go to snippet source")class PassThroughFlow {

  public static <A, T> Graph<FlowShape<A, Pair<T, A>>, NotUsed> create(Flow<A, T, NotUsed> flow) {
    return create(flow, Keep.both());
  }

  public static <A, T, O> Graph<FlowShape<A, O>, NotUsed> create(
      Flow<A, T, NotUsed> flow, Function2<T, A, O> output) {
    return Flow.fromGraph(
        GraphDSL.create(
            builder -> {
              UniformFanOutShape<A, A> broadcast = builder.add(Broadcast.create(2));
              FanInShape2<T, A, O> zip = builder.add(ZipWith.create(output));
              builder.from(broadcast.out(0)).via(builder.add(flow)).toInlet(zip.in0());
              builder.from(broadcast.out(1)).toInlet(zip.in1());
              return FlowShape.apply(broadcast.in(), zip.out());
            }));
  }
}
```

A sample usage:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/scala/akka/stream/alpakka/eip/scaladsl/PassThroughExamples.scala#L49-L62 "Go to snippet source")//Sample Source
val source = Source(List(1, 2, 3))

// Pass through this flow maintaining the original message
val passThroughMe =
  Flow[Int]
    .map(_ * 10)

val ret = source
  .via(PassThroughFlow(passThroughMe))
  .runWith(Sink.seq)

//Verify results
ret.futureValue should be(Vector((10, 1), (20, 2), (30, 3)))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/java/akka/stream/alpakka/eip/javadsl/PassThroughExamples.java#L55-L70 "Go to snippet source")// Sample Source
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3));

// Pass through this flow maintaining the original message
Flow<Integer, Integer, NotUsed> passThroughMe = Flow.of(Integer.class).map(i -> i * 10);

CompletionStage<List<Pair<Integer, Integer>>> ret =
    source.via(PassThroughFlow.create(passThroughMe)).runWith(Sink.seq(), system);

// Verify results
List<Pair<Integer, Integer>> list = ret.toCompletableFuture().get();
assert list.equals(
    Arrays.asList(
        new Pair<Integer, Integer>(10, 1),
        new Pair<Integer, Integer>(20, 2),
        new Pair<Integer, Integer>(30, 3)));
```

Using `Keep` you can choose what it the return value:

- `PassThroughFlow(passThroughMe, Keep.right)`: to only output the original message
- `PassThroughFlow(passThroughMe, Keep.both)`: to output both values as a `Tuple`
- `Keep.left`/`Keep.none`: are not very useful in this use case, there isn’t a pass\-through …

You can also write your own output function to combine in different ways the two outputs.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/scala/akka/stream/alpakka/eip/scaladsl/PassThroughExamples.scala#L28-L41 "Go to snippet source")//Sample Source
val source = Source(List(1, 2, 3))

// Pass through this flow maintaining the original message
val passThroughMe =
  Flow[Int]
    .map(_ * 10)

val ret = source
  .via(PassThroughFlow(passThroughMe, Keep.right))
  .runWith(Sink.seq)

//Verify results
ret.futureValue should be(Vector(1, 2, 3))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/java/akka/stream/alpakka/eip/javadsl/PassThroughExamples.java#L37-L48 "Go to snippet source")// Sample Source
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3));

// Pass through this flow maintaining the original message
Flow<Integer, Integer, NotUsed> passThroughMe = Flow.of(Integer.class).map(i -> i * 10);

CompletionStage<List<Integer>> ret =
    source.via(PassThroughFlow.create(passThroughMe, Keep.right())).runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(1, 2, 3));
```

This pattern is useful when integrating Alpakka connectors together. Here an example with Kafka:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/scala/akka/stream/alpakka/eip/scaladsl/PassThroughExamples.scala#L100-L111 "Go to snippet source")val writeFlow = Flow[ConsumerMessage.CommittableMessage[String, Array[Byte]]].map(_ => ???)

val consumerSettings =
  ConsumerSettings(system, new StringDeserializer, new ByteArrayDeserializer)
val committerSettings = CommitterSettings(system)

Consumer
  .committableSource(consumerSettings, Subscriptions.topics("topic1"))
  .via(PassThroughFlow(writeFlow, Keep.right))
  .map(_.committableOffset)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/doc-examples/src/test/java/akka/stream/alpakka/eip/javadsl/PassThroughExamples.java#L112-L125 "Go to snippet source")Flow<ConsumerMessage.CommittableMessage<String, byte[]>, String, NotUsed> writeFlow =
    Flow.fromFunction(i -> i.record().value().toString());

ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(system, new StringDeserializer(), new ByteArrayDeserializer());
CommitterSettings comitterSettings = CommitterSettings.create(system);
Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics("topic1"))
        .via(PassThroughFlow.create(writeFlow, Keep.right()))
        .map(i -> i.committableOffset())
        .toMat(Committer.sink(comitterSettings), Keep.both())
        .mapMaterializedValue(Consumer::createDrainingControl)
        .run(system);

```

## Code Examples

### Example 1: PassThrough

```text
a=>transform=>a1
                   /                 \
                  /                   \
a=>(a, a)=>unzip -                     zip=>(a1, a)=> a
                  \                   /
                   \                 /
                    --------a--------
```

### Example 2: PassThrough

```scala
object PassThroughFlow {
  def apply[A, T](processingFlow: Flow[A, T, NotUsed]): Graph[FlowShape[A, (T, A)], NotUsed] =
    apply[A, T, (T, A)](processingFlow, Keep.both)

  def apply[A, T, O](processingFlow: Flow[A, T, NotUsed], output: (T, A) => O): Graph[FlowShape[A, O], NotUsed] =
    Flow.fromGraph(GraphDSL.create() { implicit builder =>
      {
        import GraphDSL.Implicits._

        val broadcast = builder.add(Broadcast[A](2))
        val zip = builder.add(ZipWith[T, A, O]((left, right) => output(left, right)))

        // format: off
        broadcast.out(0) ~> processingFlow ~> zip.in0
        broadcast.out(1)         ~>           zip.in1
        // format: on

        FlowShape(broadcast.in, zip.out)
      }
    })
}
```

### Example 3: PassThrough

```java
class PassThroughFlow {

  public static <A, T> Graph<FlowShape<A, Pair<T, A>>, NotUsed> create(Flow<A, T, NotUsed> flow) {
    return create(flow, Keep.both());
  }

  public static <A, T, O> Graph<FlowShape<A, O>, NotUsed> create(
      Flow<A, T, NotUsed> flow, Function2<T, A, O> output) {
    return Flow.fromGraph(
        GraphDSL.create(
            builder -> {
              UniformFanOutShape<A, A> broadcast = builder.add(Broadcast.create(2));
              FanInShape2<T, A, O> zip = builder.add(ZipWith.create(output));
              builder.from(broadcast.out(0)).via(builder.add(flow)).toInlet(zip.in0());
              builder.from(broadcast.out(1)).toInlet(zip.in1());
              return FlowShape.apply(broadcast.in(), zip.out());
            }));
  }
}
```

### Example 4: PassThrough

```scala
//Sample Source
val source = Source(List(1, 2, 3))

// Pass through this flow maintaining the original message
val passThroughMe =
  Flow[Int]
    .map(_ * 10)

val ret = source
  .via(PassThroughFlow(passThroughMe))
  .runWith(Sink.seq)

//Verify results
ret.futureValue should be(Vector((10, 1), (20, 2), (30, 3)))
```

### Example 5: PassThrough

```java
// Sample Source
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3));

// Pass through this flow maintaining the original message
Flow<Integer, Integer, NotUsed> passThroughMe = Flow.of(Integer.class).map(i -> i * 10);

CompletionStage<List<Pair<Integer, Integer>>> ret =
    source.via(PassThroughFlow.create(passThroughMe)).runWith(Sink.seq(), system);

// Verify results
List<Pair<Integer, Integer>> list = ret.toCompletableFuture().get();
assert list.equals(
    Arrays.asList(
        new Pair<Integer, Integer>(10, 1),
        new Pair<Integer, Integer>(20, 2),
        new Pair<Integer, Integer>(30, 3)));
```

### Example 6: PassThrough

```scala
//Sample Source
val source = Source(List(1, 2, 3))

// Pass through this flow maintaining the original message
val passThroughMe =
  Flow[Int]
    .map(_ * 10)

val ret = source
  .via(PassThroughFlow(passThroughMe, Keep.right))
  .runWith(Sink.seq)

//Verify results
ret.futureValue should be(Vector(1, 2, 3))
```

### Example 7: PassThrough

```java
// Sample Source
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3));

// Pass through this flow maintaining the original message
Flow<Integer, Integer, NotUsed> passThroughMe = Flow.of(Integer.class).map(i -> i * 10);

CompletionStage<List<Integer>> ret =
    source.via(PassThroughFlow.create(passThroughMe, Keep.right())).runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(1, 2, 3));
```

### Example 8: PassThrough

```scala
val writeFlow = Flow[ConsumerMessage.CommittableMessage[String, Array[Byte]]].map(_ => ???)

val consumerSettings =
  ConsumerSettings(system, new StringDeserializer, new ByteArrayDeserializer)
val committerSettings = CommitterSettings(system)

Consumer
  .committableSource(consumerSettings, Subscriptions.topics("topic1"))
  .via(PassThroughFlow(writeFlow, Keep.right))
  .map(_.committableOffset)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

### Example 9: PassThrough

```java
Flow<ConsumerMessage.CommittableMessage<String, byte[]>, String, NotUsed> writeFlow =
    Flow.fromFunction(i -> i.record().value().toString());

ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(system, new StringDeserializer(), new ByteArrayDeserializer());
CommitterSettings comitterSettings = CommitterSettings.create(system);
Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics("topic1"))
        .via(PassThroughFlow.create(writeFlow, Keep.right()))
        .map(i -> i.committableOffset())
        .toMat(Committer.sink(comitterSettings), Keep.both())
        .mapMaterializedValue(Consumer::createDrainingControl)
        .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/alpakka/current/reference.html
- https://doc.akka.io/libraries/alpakka/current/release-notes/index.html

---
*Source: [https://doc.akka.io/libraries/alpakka/current/patterns.html](https://doc.akka.io/libraries/alpakka/current/patterns.html)*