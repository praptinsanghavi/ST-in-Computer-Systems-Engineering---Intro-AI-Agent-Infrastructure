---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-refs.html
title: StreamRefs - Reactive Streams over the network • Akka core
---

# StreamRefs - Reactive Streams over the network • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamRefs \- Reactive Streams over the network

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Introduction

Warning
This module is currently marked as [may change](../common/may-change.html) in the sense of being the subject of final development. This means that the API or semantics can change without warning or deprecation period, and it is not recommended to use this module in production just yet.

Stream references, or “stream refs” for short, allow running Akka Streams across multiple nodes within an Akka Cluster. 

Unlike heavier “streaming data processing” frameworks, Akka Streams are neither “deployed” nor automatically distributed. Akka stream refs are, as the name implies, references to existing parts of a stream, and can be used to create a distributed processing framework or to introduce such capabilities in specific parts of your application.

Stream refs are trivial to use in existing clustered Akka applications and require no additional configuration or setup. They automatically maintain flow\-control / back\-pressure over the network and employ Akka’s failure detection mechanisms to fail\-fast (“let it crash!”) in the case of failures of remote nodes. They can be seen as an implementation of the [Work Pulling Pattern](https://www.michaelpollmeier.com/akka-work-pulling-pattern), which one would otherwise implement manually.

Note
A useful way to think about stream refs is: “like an `ActorRef`, but for Akka Streams’s `Source` and `Sink`”.

Stream refs refer to an already existing, possibly remote, `Sink` or `Source`. This is not to be mistaken with deploying streams remotely, which this feature is not intended for.

IMPORTANT
Use stream refs with Akka Cluster. The [failure detector can cause quarantining](../typed/cluster-concepts.html#quarantined) if plain Akka remoting is used.

## Stream References

The prime use case for stream refs is to replace raw actor or HTTP messaging in systems that expect long\-running streams of data between two entities. Often they can be used to effectively achieve point\-to\-point streaming without the need to set up additional message brokers or similar secondary clusters.

Stream refs are well\-suited for any system in which you need to send messages between nodes in a flow\-controlled fashion. Typical examples include sending work requests to worker nodes as fast as possible, but not faster than the worker nodes can process them, or sending data elements that the downstream may be slow at processing. It is recommended to mix and introduce stream refs in actor\-messaging\-based systems, where the actor messaging is used to orchestrate and prepare such message flows, and later the stream refs are used to do the flow\-controlled message transfer. 

Stream refs are not persistent. However, it is simple to build a resumable stream by introducing such a protocol in the actor messaging layer. Stream refs are absolutely expected to be sent over Akka remoting to other nodes within a cluster using Akka Cluster, and therefore complement, instead of compete, with plain Actor messaging. Actors would usually be used to establish the stream via some initial message saying, “I want to offer you many log elements (the stream ref),” or conversely, “if you need to send me much data, here is the stream ref you can use to do so”.

Since the two sides (“local” and “remote”) of each reference may be confusing to refer to as “remote” and “local” – since either side can be seen as “local” or “remote” depending how we look at it – we propose using the terminology “origin” and “target”, which is defined by where the stream ref was created. For `SourceRef`s, the “origin” is the side which has the data that it is going to stream out. For `SinkRef`s, the “origin” side is the actor system that is ready to receive the data and has allocated the ref. Those two may be seen as duals of each other. However, to explain patterns about sharing references, we found this wording to be rather useful.

### Source Refs \- offering streaming data to a remote system

A [``SourceRef``](https://doc.akka.io/api/akka-core/2.10/akka/stream/SourceRef.html "akka.stream.SourceRef")[``SourceRef``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceRef.html "akka.stream.SourceRef") can be offered to a remote actor system in order for it to consume some source of data that we have prepared locally. 

In order to share a `Source` with a remote endpoint you need to materialize it by running it into the `Sink.sourceRef`. That `Sink` materializes the `SourceRef` that you can then send to other nodes.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowStreamRefsDocSpec.scala#L17-L40 "Go to snippet source")import akka.stream.SourceRef

case class RequestLogs(streamId: Int)
case class LogsOffer(streamId: Int, sourceRef: SourceRef[String])

class DataSource extends Actor {

  def receive = {
    case RequestLogs(streamId) =>
      // obtain the source you want to offer:
      val source: Source[String, NotUsed] = streamLogs(streamId)

      // materialize the SourceRef:
      val ref: SourceRef[String] = source.runWith(StreamRefs.sourceRef())

      // wrap the SourceRef in some domain message, such that the sender knows what source it is
      val reply = LogsOffer(streamId, ref)

      // reply to sender
      sender() ! reply
  }

  def streamLogs(streamId: Long): Source[String, NotUsed] = ???
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowStreamRefsDocTest.java#L31-L63 "Go to snippet source")static class RequestLogs {
  public final long streamId;

  public RequestLogs(long streamId) {
    this.streamId = streamId;
  }
}

static class LogsOffer {
  final SourceRef<String> sourceRef;

  public LogsOffer(SourceRef<String> sourceRef) {
    this.sourceRef = sourceRef;
  }
}

static class DataSource extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder().match(RequestLogs.class, this::handleRequestLogs).build();
  }

  private void handleRequestLogs(RequestLogs requestLogs) {
    Source<String, NotUsed> logs = streamLogs(requestLogs.streamId);
    SourceRef<String> logsRef = logs.runWith(StreamRefs.sourceRef(), mat);

    getSender().tell(new LogsOffer(logsRef), getSelf());
  }

  private Source<String, NotUsed> streamLogs(long streamId) {
    return Source.repeat("[INFO] some interesting logs here (for id: " + streamId + ")");
  }
}
```

The origin actor which creates and owns the `Source` could also perform some validation or additional setup when preparing the `Source`. Once it has handed out the `SourceRef`, the remote side can run it like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowStreamRefsDocSpec.scala#L44-L53 "Go to snippet source")val sourceActor = system.actorOf(Props[DataSource](), "dataSource")

sourceActor ! RequestLogs(1337)
val offer = expectMsgType[LogsOffer]

// implicitly converted to a Source:
offer.sourceRef.runWith(Sink.foreach(println))
// alternatively explicitly obtain Source from SourceRef:
// offer.sourceRef.source.runWith(Sink.foreach(println))

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowStreamRefsDocTest.java#L71-L77 "Go to snippet source")ActorRef sourceActor = system.actorOf(Props.create(DataSource.class), "dataSource");

sourceActor.tell(new RequestLogs(1337), getTestActor());
LogsOffer offer = expectMsgClass(LogsOffer.class);

offer.sourceRef.getSource().runWith(Sink.foreach(log -> System.out.println(log)), mat);

```

The process of preparing and running a `SourceRef`\-powered distributed stream is shown by the animation below:

![SourceRef usage animation](../images/source-ref-animation.gif)

Warning
A `SourceRef` is *by design* “single\-shot”; i.e., it may only be materialized once. This is in order to not complicate the mental model of what materialization means.

Multicast can be mimicked by starting a `BroadcastHub` operator once, then attaching multiple new streams to it, each emitting a new stream ref. This way, materialization of the `BroadcastHub`s Source creates a unique single\-shot stream ref, however they can all be powered using a single `Source` – located before the `BroadcastHub` operator.

### Sink Refs \- offering to receive streaming data from a remote system

The dual of [``SourceRef``](https://doc.akka.io/api/akka-core/2.10/akka/stream/SinkRef.html "akka.stream.SinkRef")[``SourceRef``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html "akka.stream.SinkRef")s.

They can be used to offer the other side the capability to send to the *origin* side data in a streaming, flow\-controlled fashion. The origin here allocates a `Sink`, which could be as simple as a `Sink.foreach` or as advanced as a complex `Sink` which streams the incoming data into various other systems (e.g., any of the Alpakka\-provided `Sink`s).

Note
To form a good mental model of `SinkRef`s, you can think of them as being similar to “passive mode” in FTP.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowStreamRefsDocSpec.scala#L59-L83 "Go to snippet source")import akka.stream.SinkRef

case class PrepareUpload(id: String)
case class MeasurementsSinkReady(id: String, sinkRef: SinkRef[String])

class DataReceiver extends Actor {

  def receive = {
    case PrepareUpload(nodeId) =>
      // obtain the source you want to offer:
      val sink: Sink[String, NotUsed] = logsSinkFor(nodeId)

      // materialize the SinkRef (the remote is like a source of data for us):
      val ref: SinkRef[String] = StreamRefs.sinkRef[String]().to(sink).run()

      // wrap the SinkRef in some domain message, such that the sender knows what source it is
      val reply = MeasurementsSinkReady(nodeId, ref)

      // reply to sender
      sender() ! reply
  }

  def logsSinkFor(nodeId: String): Sink[String, NotUsed] = ???
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowStreamRefsDocTest.java#L84-L120 "Go to snippet source")static class PrepareUpload {
  final String id;

  public PrepareUpload(String id) {
    this.id = id;
  }
}

static class MeasurementsSinkReady {
  final String id;
  final SinkRef<String> sinkRef;

  public MeasurementsSinkReady(String id, SinkRef<String> ref) {
    this.id = id;
    this.sinkRef = ref;
  }
}

static class DataReceiver extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            PrepareUpload.class,
            prepare -> {
              Sink<String, NotUsed> sink = logsSinkFor(prepare.id);
              SinkRef<String> sinkRef = StreamRefs.<String>sinkRef().to(sink).run(mat);

              getSender().tell(new MeasurementsSinkReady(prepare.id, sinkRef), getSelf());
            })
        .build();
  }

  private Sink<String, NotUsed> logsSinkFor(String id) {
    return Sink.<String>ignore().mapMaterializedValue(done -> NotUsed.getInstance());
  }
}
```

Using the offered `SinkRef` to send data to the origin of the `Sink` is also simple, as we can treat the `SinkRef` as any other `Sink` and directly `runWith` or `run` with it.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowStreamRefsDocSpec.scala#L89-L95 "Go to snippet source")val receiver = system.actorOf(Props[DataReceiver](), "receiver")

receiver ! PrepareUpload("system-42-tmp")
val ready = expectMsgType[MeasurementsSinkReady]

// stream local metrics to Sink's origin:
localMetrics().runWith(ready.sinkRef)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowStreamRefsDocTest.java#L128-L133 "Go to snippet source")ActorRef receiver = system.actorOf(Props.create(DataReceiver.class), "dataReceiver");

receiver.tell(new PrepareUpload("system-42-tmp"), getTestActor());
MeasurementsSinkReady ready = expectMsgClass(MeasurementsSinkReady.class);

Source.repeat("hello").runWith(ready.sinkRef.getSink(), mat);
```

The process of preparing and running a `SinkRef`\-powered distributed stream is shown by the animation below:

![SourceRef usage animation](../images/sink-ref-animation.gif)

Warning
A `SinkRef` is *by design* “single\-shot”; i.e., it may only be materialized once. This is in order to not complicate the mental model of what materialization means.

If you have a use case for building a fan\-in operation that accepts writes from multiple remote nodes, you can build your `Sink` and prepend it with a `MergeHub` operator, each time materializing a new `SinkRef` targeting that `MergeHub`. This has the added benefit of giving you full control of how to merge these streams (i.e., by using “merge preferred” or any other variation of the fan\-in operators).

### Delivery guarantees

Stream refs utilise normal actor messaging for their transport, and therefore provide the same level of basic delivery guarantees. Stream refs do extend the semantics somewhat, through demand re\-delivery and sequence fault detection. In other words:

- messages are sent over actor remoting
	- which relies on TCP (classic remoting or Artery TCP) or Aeron UDP for basic redelivery mechanisms
- messages are guaranteed to to be in\-order
- messages can be lost, however:
	- a *dropped demand signal* will be re\-delivered automatically (similar to system messages)
	- a *dropped element signal* will cause the stream to *fail*

## Bulk Stream References

Warning
Bulk stream references are not implemented yet. See ticket [Bulk Transfer Stream Refs \#24276](https://github.com/akka/akka-core/issues/24276) to track progress or signal demand for this feature. 

Bulk stream refs can be used to create simple side\-channels to transfer humongous amounts of data such as huge log files, messages or even media, with as much ease as if it was a trivial local stream.

## Serialization of SourceRef and SinkRef

StreamRefs require serialization, since the whole point is to send them between nodes of a cluster. A built in serializer is provided when `SourceRef` and `SinkRef` are sent directly as messages however the recommended use is to wrap them into your own actor message classes. 

When [Akka Jackson](../serialization-jackson.html) is used, serialization of wrapped `SourceRef` and `SinkRef` will work out of the box.

If you are using some other form of serialization you will need to use the [`StreamRefResolver`](https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamRefResolver.html "akka.stream.StreamRefResolver")[`StreamRefResolver`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefResolver.html "akka.stream.StreamRefResolver") extension from your serializer to get the `SourceRef` and `SinkRef`. The extension provides the methods `toSerializationFormat(sink or source)` to transform from refs to string and `resolve{Sink,Source}Ref(String)` to resolve refs from strings.

## Configuration

### Stream reference subscription timeouts

All stream references have a subscription timeout, which is intended to prevent resource leaks in case a remote node requests the allocation of many streams but never actually runs them. In order to prevent this, each stream reference has a default timeout (of 30 seconds), after which the origin will abort the stream offer if the target has not materialized the stream ref. After the timeout has triggered, materialization of the target side will fail, pointing out that the origin is missing.

Since these timeouts are often very different based on the kind of stream offered, and there can be many different kinds of them in the same application, it is possible to not only configure this setting globally (`akka.stream.materializer.stream-ref.subscription-timeout`), but also via attributes:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowStreamRefsDocSpec.scala#L101-L114 "Go to snippet source")// configure the timeout for source
import scala.concurrent.duration._
import akka.stream.StreamRefAttributes

// configuring Sink.sourceRef (notice that we apply the attributes to the Sink!):
Source
  .repeat("hello")
  .runWith(StreamRefs.sourceRef().addAttributes(StreamRefAttributes.subscriptionTimeout(5.seconds)))

// configuring SinkRef.source:
StreamRefs
  .sinkRef()
  .addAttributes(StreamRefAttributes.subscriptionTimeout(5.seconds))
  .runWith(Sink.ignore) // not very interesting Sink, just an example
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowStreamRefsDocTest.java#L144-L155 "Go to snippet source")FiniteDuration timeout = FiniteDuration.create(5, TimeUnit.SECONDS);
Attributes timeoutAttributes = StreamRefAttributes.subscriptionTimeout(timeout);

// configuring Sink.sourceRef (notice that we apply the attributes to the Sink!):
Source.repeat("hello")
    .runWith(StreamRefs.<String>sourceRef().addAttributes(timeoutAttributes), mat);

// configuring SinkRef.source:
StreamRefs.<String>sinkRef()
    .addAttributes(timeoutAttributes)
    .runWith(Sink.<String>ignore(), mat); // not very interesting sink, just an example

```

### General configuration

Other settings can be set globally in your `application.conf`, by overriding any of the following values in the `akka.stream.materializer.stream-ref.*` keyspace:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/resources/reference.conf#L142-L174 "Go to snippet source")# configure defaults for SourceRef and SinkRef
stream-ref {
  # Buffer of a SinkRef that is used to batch Request elements from the other side of the stream ref
  #
  # The buffer will be attempted to be filled eagerly even while the local stage did not request elements,
  # because the delay of requesting over network boundaries is much higher.
  buffer-capacity = 32

  # Demand is signalled by sending a cumulative demand message ("requesting messages until the n-th sequence number)
  # Using a cumulative demand model allows us to re-deliver the demand message in case of message loss (which should
  # be very rare in any case, yet possible -- mostly under connection break-down and re-establishment).
  #
  # The semantics of handling and updating the demand however are in-line with what Reactive Streams dictates.
  #
  # In normal operation, demand is signalled in response to arriving elements, however if no new elements arrive
  # within `demand-redelivery-interval` a re-delivery of the demand will be triggered, assuming that it may have gotten lost.
  demand-redelivery-interval = 1 second

  # Subscription timeout, during which the "remote side" MUST subscribe (materialize) the handed out stream ref.
  # This timeout does not have to be very low in normal situations, since the remote side may also need to
  # prepare things before it is ready to materialize the reference. However the timeout is needed to avoid leaking
  # in-active streams which are never subscribed to.
  subscription-timeout = 30 seconds

  # In order to guard the receiving end of a stream ref from never terminating (since awaiting a Completion or Failed
  # message) after / before a Terminated is seen, a special timeout is applied once Terminated is received by it.
  # This allows us to terminate stream refs that have been targeted to other nodes which are Downed, and as such the
  # other side of the stream ref would never send the "final" terminal message.
  #
  # The timeout specifically means the time between the Terminated signal being received and when the local SourceRef
  # determines to fail itself, assuming there was message loss or a complete partition of the completion signal.
  final-termination-signal-deadline = 2 seconds
}
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Source Refs - offering streaming data to a remote system

```scala
import akka.stream.SourceRef

case class RequestLogs(streamId: Int)
case class LogsOffer(streamId: Int, sourceRef: SourceRef[String])

class DataSource extends Actor {

  def receive = {
    case RequestLogs(streamId) =>
      // obtain the source you want to offer:
      val source: Source[String, NotUsed] = streamLogs(streamId)

      // materialize the SourceRef:
      val ref: SourceRef[String] = source.runWith(StreamRefs.sourceRef())

      // wrap the SourceRef in some domain message, such that the sender knows what source it is
      val reply = LogsOffer(streamId, ref)

      // reply to sender
      sender() ! reply
  }

  def streamLogs(streamId: Long): Source[String, NotUsed] = ???
}
```

### Example 5: Source Refs - offering streaming data to a remote system

```java
static class RequestLogs {
  public final long streamId;

  public RequestLogs(long streamId) {
    this.streamId = streamId;
  }
}

static class LogsOffer {
  final SourceRef<String> sourceRef;

  public LogsOffer(SourceRef<String> sourceRef) {
    this.sourceRef = sourceRef;
  }
}

static class DataSource extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder().match(RequestLogs.class, this::handleRequestLogs).build();
  }

  private void handleRequestLogs(RequestLogs requestLogs) {
    Source<String, NotUsed> logs = streamLogs(requestLogs.streamId);
    SourceRef<String> logsRef = logs.runWith(StreamRefs.sourceRef(), mat);

    getSender().tell(new LogsOffer(logsRef), getSelf());
  }

  private Source<String, NotUsed> streamLogs(long streamId) {
    return Source.repeat("[INFO] some interesting logs here (for id: " + streamId + ")");
  }
}
```

### Example 6: Source Refs - offering streaming data to a remote system

```scala
val sourceActor = system.actorOf(Props[DataSource](), "dataSource")

sourceActor ! RequestLogs(1337)
val offer = expectMsgType[LogsOffer]

// implicitly converted to a Source:
offer.sourceRef.runWith(Sink.foreach(println))
// alternatively explicitly obtain Source from SourceRef:
// offer.sourceRef.source.runWith(Sink.foreach(println))
```

### Example 7: Source Refs - offering streaming data to a remote system

```java
ActorRef sourceActor = system.actorOf(Props.create(DataSource.class), "dataSource");

sourceActor.tell(new RequestLogs(1337), getTestActor());
LogsOffer offer = expectMsgClass(LogsOffer.class);

offer.sourceRef.getSource().runWith(Sink.foreach(log -> System.out.println(log)), mat);
```

### Example 8: Sink Refs - offering to receive streaming data from a remote system

```scala
import akka.stream.SinkRef

case class PrepareUpload(id: String)
case class MeasurementsSinkReady(id: String, sinkRef: SinkRef[String])

class DataReceiver extends Actor {

  def receive = {
    case PrepareUpload(nodeId) =>
      // obtain the source you want to offer:
      val sink: Sink[String, NotUsed] = logsSinkFor(nodeId)

      // materialize the SinkRef (the remote is like a source of data for us):
      val ref: SinkRef[String] = StreamRefs.sinkRef[String]().to(sink).run()

      // wrap the SinkRef in some domain message, such that the sender knows what source it is
      val reply = MeasurementsSinkReady(nodeId, ref)

      // reply to sender
      sender() ! reply
  }

  def logsSinkFor(nodeId: String): Sink[String, NotUsed] = ???
}
```

### Example 9: Sink Refs - offering to receive streaming data from a remote system

```java
static class PrepareUpload {
  final String id;

  public PrepareUpload(String id) {
    this.id = id;
  }
}

static class MeasurementsSinkReady {
  final String id;
  final SinkRef<String> sinkRef;

  public MeasurementsSinkReady(String id, SinkRef<String> ref) {
    this.id = id;
    this.sinkRef = ref;
  }
}

static class DataReceiver extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            PrepareUpload.class,
            prepare -> {
              Sink<String, NotUsed> sink = logsSinkFor(prepare.id);
              SinkRef<String> sinkRef = StreamRefs.<String>sinkRef().to(sink).run(mat);

              getSender().tell(new MeasurementsSinkReady(prepare.id, sinkRef), getSelf());
            })
        .build();
  }

  private Sink<String, NotUsed> logsSinkFor(String id) {
    return Sink.<String>ignore().mapMaterializedValue(done -> NotUsed.getInstance());
  }
}
```

### Example 10: Sink Refs - offering to receive streaming data from a remote system

```scala
val receiver = system.actorOf(Props[DataReceiver](), "receiver")

receiver ! PrepareUpload("system-42-tmp")
val ready = expectMsgType[MeasurementsSinkReady]

// stream local metrics to Sink's origin:
localMetrics().runWith(ready.sinkRef)
```

### Example 11: Sink Refs - offering to receive streaming data from a remote system

```java
ActorRef receiver = system.actorOf(Props.create(DataReceiver.class), "dataReceiver");

receiver.tell(new PrepareUpload("system-42-tmp"), getTestActor());
MeasurementsSinkReady ready = expectMsgClass(MeasurementsSinkReady.class);

Source.repeat("hello").runWith(ready.sinkRef.getSink(), mat);
```

### Example 12: Stream reference subscription timeouts

```scala
// configure the timeout for source
import scala.concurrent.duration._
import akka.stream.StreamRefAttributes

// configuring Sink.sourceRef (notice that we apply the attributes to the Sink!):
Source
  .repeat("hello")
  .runWith(StreamRefs.sourceRef().addAttributes(StreamRefAttributes.subscriptionTimeout(5.seconds)))

// configuring SinkRef.source:
StreamRefs
  .sinkRef()
  .addAttributes(StreamRefAttributes.subscriptionTimeout(5.seconds))
  .runWith(Sink.ignore) // not very interesting Sink, just an example
```

### Example 13: Stream reference subscription timeouts

```java
FiniteDuration timeout = FiniteDuration.create(5, TimeUnit.SECONDS);
Attributes timeoutAttributes = StreamRefAttributes.subscriptionTimeout(timeout);

// configuring Sink.sourceRef (notice that we apply the attributes to the Sink!):
Source.repeat("hello")
    .runWith(StreamRefs.<String>sourceRef().addAttributes(timeoutAttributes), mat);

// configuring SinkRef.source:
StreamRefs.<String>sinkRef()
    .addAttributes(timeoutAttributes)
    .runWith(Sink.<String>ignore(), mat); // not very interesting sink, just an example
```

### Example 14: General configuration

```conf
# configure defaults for SourceRef and SinkRef
stream-ref {
  # Buffer of a SinkRef that is used to batch Request elements from the other side of the stream ref
  #
  # The buffer will be attempted to be filled eagerly even while the local stage did not request elements,
  # because the delay of requesting over network boundaries is much higher.
  buffer-capacity = 32

  # Demand is signalled by sending a cumulative demand message ("requesting messages until the n-th sequence number)
  # Using a cumulative demand model allows us to re-deliver the demand message in case of message loss (which should
  # be very rare in any case, yet possible -- mostly under connection break-down and re-establishment).
  #
  # The semantics of handling and updating the demand however are in-line with what Reactive Streams dictates.
  #
  # In normal operation, demand is signalled in response to arriving elements, however if no new elements arrive
  # within `demand-redelivery-interval` a re-delivery of the demand will be triggered, assuming that it may have gotten lost.
  demand-redelivery-interval = 1 second

  # Subscription timeout, during which the "remote side" MUST subscribe (materialize) the handed out stream ref.
  # This timeout does not have to be very low in normal situations, since the remote side may also need to
  # prepare things before it is ready to materialize the reference. However the timeout is needed to avoid leaking
  # in-active streams which are never subscribed to.
  subscription-timeout = 30 seconds

  # In order to guard the receiving end of a stream ref from never terminating (since awaiting a Completion or Failed
  # message) after / before a Terminated is seen, a special timeout is applied once Terminated is received by it.
  # This allows us to terminate stream refs that have been targeted to other nodes which are Downed, and as such the
  # other side of the stream ref would never send the "final" terminal message.
  #
  # The timeout specifically means the time between the Terminated signal being received and when the local SourceRef
  # determines to fail itself, assuming there was message loss or a complete partition of the completion signal.
  final-termination-signal-deadline = 2 seconds
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SinkRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SourceRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamRefResolver.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefResolver.html
- https://doc.akka.io/libraries/akka-core/2.10/common/may-change.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-parallelism.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-concepts.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-refs.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-refs.html)*