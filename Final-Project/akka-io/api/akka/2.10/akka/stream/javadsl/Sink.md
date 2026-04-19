---
description: Akka 2.10.17 - akka.stream.javadsl.Sink
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Sink.html
title: Akka 2.10.17 - akka.stream.javadsl.Sink
---

# Akka 2.10.17 - akka.stream.javadsl.Sink

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Sink

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [AsPublisher](AsPublisher.html)
- [Balance](Balance$.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast$.html "Fan-out the stream to several streams.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat$.html "Takes two streams and outputs an output stream formed from the two input streams by consuming one stream first emitting all of its elements, then consuming the second stream emitting all of its elements.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay and can be stateful to compute delay for any sequence of elements, all elements go through nextDelay() updating state and returning delay for each element")
- [FileIO](FileIO$.html "Java API: Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [Framing](Framing$.html)
- [FramingTruncation](FramingTruncation.html "Determines mode in which Framing operates.")
- [GraphDSL](GraphDSL$.html)
- [JavaFlowSupport](JavaFlowSupport.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming akka.util.ByteString objects.")
- [Keep](Keep$.html)
- [Merge](Merge$.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest$.html "MergeLatest joins elements from N input streams into stream of lists of size N.")
- [MergePreferred](MergePreferred$.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized$.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence$.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [Partition](Partition$.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Java API")
- Sink
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [Source](Source.html "Java API")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [SubSource](SubSource.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Split one stream into several streams using a splitting function.")
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
[c](Sink$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Sink](Sink$.html "See companion object")[**](../../../akka/stream/javadsl/Sink.html "Permalink")

### Companion [object Sink](Sink$.html "See companion object")

#### final  class Sink\[In, Mat] extends [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

Java API

A `Sink` is a set of stream processing steps that has one open input.
Can be used as a `Subscriber`

Source[Sink.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Sink.scala#L510)Linear Supertypes[Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Sink
2. Graph
3. AnyRef
4. Any
Implicitly  
1. by GraphMapMatVal
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/javadsl/Sink.html#<init>(delegate:akka.stream.scaladsl.Sink[In,Mat]):akka.stream.javadsl.Sink[In,Mat] "Permalink")  new Sink(delegate: [scaladsl.Sink](../scaladsl/Sink.html)\[In, Mat])
### Type Members

1. [**](../../../akka/stream/javadsl/Sink.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [SinkShape](../SinkShape.html)\[In]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/javadsl/Sink.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Sink.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Sink.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toany2stringadd\[Sink\[In, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/Sink.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Sink\[In, Mat], B)ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toArrowAssoc\[Sink\[In, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/Sink.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/Sink.html#addAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): Sink\[In, Mat]Add the given attributes to this Sink.

Add the given attributes to this Sink. If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Sink is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition ClassesSink → [Graph](../Graph.html)
7. [**](../../../akka/stream/javadsl/Sink.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/javadsl/Sink.html#asScala:akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def asScala: [scaladsl.Sink](../scaladsl/Sink.html)\[In, Mat]Converts this Sink to its Scala DSL counterpart.
9. [**](../../../akka/stream/javadsl/Sink.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Sink\[In, Mat]Put an asynchronous boundary around this `Sink`

Put an asynchronous boundary around this `Sink`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition ClassesSink → [Graph](../Graph.html)
10. [**](../../../akka/stream/javadsl/Sink.html#async(dispatcher:String):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def async(dispatcher: String): Sink\[In, Mat]Put an asynchronous boundary around this `Sink`

Put an asynchronous boundary around this `Sink`

dispatcherRun the graph on this dispatcher

Definition ClassesSink → [Graph](../Graph.html)
11. [**](../../../akka/stream/javadsl/Sink.html#async:akka.stream.javadsl.Sink[In,Mat] "Permalink")  def async: Sink\[In, Mat]Put an asynchronous boundary around this `Sink`

Put an asynchronous boundary around this `Sink`

Definition ClassesSink → [Graph](../Graph.html)
12. [**](../../../akka/stream/javadsl/Sink.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/javadsl/Sink.html#contramap[In2](f:akka.japi.function.Function[In2,In]):akka.stream.javadsl.Sink[In2,Mat] "Permalink")  def contramap\[In2](f: [Function](../../japi/function/Function.html)\[In2, In]): Sink\[In2, Mat]Transform this Sink by applying a function to each \*incoming\* upstream element before
it is passed to the Sink

Transform this Sink by applying a function to each \*incoming\* upstream element before
it is passed to the Sink

**Backpressures when** original Sink backpressures

**Cancels when** original Sink backpressures
14. [**](../../../akka/stream/javadsl/Sink.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Sink\[In, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/javadsl/Sink.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Sink\[In, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/javadsl/Sink.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/javadsl/Sink.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/javadsl/Sink.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/stream/javadsl/Sink.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/stream/javadsl/Sink.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition ClassesSink → [Graph](../Graph.html)
21. [**](../../../akka/stream/javadsl/Sink.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/javadsl/Sink.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/javadsl/Sink.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/stream/javadsl/Sink.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.Sink[In,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: [Function](../../japi/function/Function.html)\[Mat, Mat2]): Sink\[In, Mat2]Transform only the materialized value of this Sink, leaving all other properties as they were.
25. [**](../../../akka/stream/javadsl/Sink.html#named(name:String):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def named(name: String): Sink\[In, Mat]Add a `name` attribute to this Sink.

Add a `name` attribute to this Sink.

Definition ClassesSink → [Graph](../Graph.html)
26. [**](../../../akka/stream/javadsl/Sink.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/javadsl/Sink.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/javadsl/Sink.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/javadsl/Sink.html#preMaterialize(materializer:akka.stream.Materializer):akka.japi.Pair[Mat@scala.annotation.unchecked.uncheckedVariance,akka.stream.javadsl.Sink[In@scala.annotation.unchecked.uncheckedVariance,akka.NotUsed]] "Permalink")  def preMaterialize(materializer: [Materializer](../Materializer.html)): [Pair](../../japi/Pair.html)\[Mat, Sink\[In, [NotUsed](../../NotUsed.html)]]Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.

Prefer the method taking an ActorSystem unless you have special requirements.
30. [**](../../../akka/stream/javadsl/Sink.html#preMaterialize(systemProvider:akka.actor.ClassicActorSystemProvider):akka.japi.Pair[Mat@scala.annotation.unchecked.uncheckedVariance,akka.stream.javadsl.Sink[In@scala.annotation.unchecked.uncheckedVariance,akka.NotUsed]] "Permalink")  def preMaterialize(systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [Pair](../../japi/Pair.html)\[Mat, Sink\[In, [NotUsed](../../NotUsed.html)]]Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.

Note that the `ActorSystem` can be used as the `systemProvider` parameter.

Note that `preMaterialize` is implemented through a reactive streams `Subscriber` which means that a buffer is introduced
and that errors are not propagated upstream but are turned into cancellations without error details.
31. [**](../../../akka/stream/javadsl/Sink.html#runWith[M](source:akka.stream.Graph[akka.stream.SourceShape[In],M],materializer:akka.stream.Materializer):M "Permalink")  def runWith\[M](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], M], materializer: [Materializer](../Materializer.html)): MConnect this `Sink` to a `Source` and run it.
32. [**](../../../akka/stream/javadsl/Sink.html#runWith[M](source:akka.stream.Graph[akka.stream.SourceShape[In],M],systemProvider:akka.actor.ClassicActorSystemProvider):M "Permalink")  def runWith\[M](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], M], systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): MConnect this `Sink` to a `Source` and run it.

Connect this `Sink` to a `Source` and run it.

Note that the `ActorSystem` can be used as the `systemProvider` parameter.
33. [**](../../../akka/stream/javadsl/Sink.html#shape:akka.stream.SinkShape[In] "Permalink")  def shape: [SinkShape](../SinkShape.html)\[In]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesSink → [Graph](../Graph.html)
34. [**](../../../akka/stream/javadsl/Sink.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../akka/stream/javadsl/Sink.html#toString():String "Permalink")  def toString(): StringDefinition ClassesSink → AnyRef → Any
36. [**](../../../akka/stream/javadsl/Sink.html#traversalBuilder:akka.stream.impl.LinearTraversalBuilder "Permalink")  def traversalBuilder: LinearTraversalBuilderINTERNAL API.

INTERNAL API.

Every materializable element must be backed by a stream layout module

Definition ClassesSink → [Graph](../Graph.html)
37. [**](../../../akka/stream/javadsl/Sink.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/javadsl/Sink.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/javadsl/Sink.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/stream/javadsl/Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): Sink\[In, Mat]Replace the attributes of this Sink with the given ones.

Replace the attributes of this Sink with the given ones. If this Sink is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition ClassesSink → [Graph](../Graph.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/javadsl/Sink.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SinkShape](../SinkShape.html)\[In], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(sink: GraphMapMatVal[SinkShape[In], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Sink.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/Sink.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toStringFormat\[Sink\[In, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/Sink.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Sink\[In, Mat], B)ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toArrowAssoc\[Sink\[In, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromSink\[In, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

### Inherited by implicit conversion any2stringadd fromSink\[In, Mat] to any2stringadd\[Sink\[In, Mat]]

### Inherited by implicit conversion StringFormat fromSink\[In, Mat] to StringFormat\[Sink\[In, Mat]]

### Inherited by implicit conversion Ensuring fromSink\[In, Mat] to Ensuring\[Sink\[In, Mat]]

### Inherited by implicit conversion ArrowAssoc fromSink\[In, Mat] to ArrowAssoc\[Sink\[In, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink$.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink.html](https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink.html)*