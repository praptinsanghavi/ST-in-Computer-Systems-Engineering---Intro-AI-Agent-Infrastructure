---
description: Akka 2.10.17 - akka.stream.javadsl.RunnableGraph
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:31:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/RunnableGraph.html
title: Akka 2.10.17 - akka.stream.javadsl.RunnableGraph
---

# Akka 2.10.17 - akka.stream.javadsl.RunnableGraph

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.RunnableGraph

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
- RunnableGraph
- [Sink](Sink.html "Java API")
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
[c](RunnableGraph$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [RunnableGraph](RunnableGraph$.html "See companion object")[**](../../../akka/stream/javadsl/RunnableGraph.html "Permalink")

### Companion [object RunnableGraph](RunnableGraph$.html "See companion object")

#### abstract  class RunnableGraph\[\+Mat] extends [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat]

Java API

Flow with attached input and output, can be executed.

Source[Flow.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Flow.scala#L4097)Linear Supertypes[Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RunnableGraph
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

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#<init>():akka.stream.javadsl.RunnableGraph[Mat] "Permalink")  new RunnableGraph()
### Type Members

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [ClosedShape](../ClosedShape.html)Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Abstract Value Members

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#asScala:akka.stream.scaladsl.RunnableGraph[Mat] "Permalink") abstract  def asScala: [scaladsl.RunnableGraph](../scaladsl/RunnableGraph.html)\[Mat]Converts this Java DSL element to its Scala DSL counterpart.
2. [**](../../../akka/stream/javadsl/RunnableGraph.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.RunnableGraph[Mat2] "Permalink") abstract  def mapMaterializedValue\[Mat2](f: [Function](../../japi/function/Function.html)\[Mat, Mat2]): RunnableGraph\[Mat2]Transform only the materialized value of this RunnableGraph, leaving all other properties as they were.
3. [**](../../../akka/stream/javadsl/RunnableGraph.html#run(materializer:akka.stream.Materializer):Mat "Permalink") abstract  def run(materializer: [Materializer](../Materializer.html)): MatRun this flow using a special materializer and return the materialized values of the flow.

Run this flow using a special materializer and return the materialized values of the flow.

Prefer the method taking an ActorSystem unless you have special requirements.
4. [**](../../../akka/stream/javadsl/RunnableGraph.html#shape:S "Permalink") abstract  def shape: [ClosedShape](../ClosedShape.html)The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition Classes[Graph](../Graph.html)
5. [**](../../../akka/stream/javadsl/RunnableGraph.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.RunnableGraph[Mat] "Permalink") abstract  def withAttributes(attr: [Attributes](../Attributes.html)): RunnableGraph\[Mat]Replace the attributes of this [Flow](Flow.html) with the given ones.

Replace the attributes of this [Flow](Flow.html) with the given ones. If this Flow is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition ClassesRunnableGraph → [Graph](../Graph.html)
### Concrete Value Members

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/RunnableGraph.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/RunnableGraph.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toany2stringadd\[RunnableGraph\[Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/RunnableGraph.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RunnableGraph\[Mat], B)ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toArrowAssoc\[RunnableGraph\[Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/RunnableGraph.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/RunnableGraph.html#addAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.RunnableGraph[Mat] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): RunnableGraph\[Mat]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition ClassesRunnableGraph → [Graph](../Graph.html)
7. [**](../../../akka/stream/javadsl/RunnableGraph.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/javadsl/RunnableGraph.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
9. [**](../../../akka/stream/javadsl/RunnableGraph.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
10. [**](../../../akka/stream/javadsl/RunnableGraph.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/javadsl/RunnableGraph.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/javadsl/RunnableGraph.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RunnableGraph\[Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RunnableGraph\[Mat]ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toEnsuring\[RunnableGraph\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/javadsl/RunnableGraph.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RunnableGraph\[Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RunnableGraph\[Mat]ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toEnsuring\[RunnableGraph\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/javadsl/RunnableGraph.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RunnableGraph\[Mat]ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toEnsuring\[RunnableGraph\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/javadsl/RunnableGraph.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RunnableGraph\[Mat]ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toEnsuring\[RunnableGraph\[Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/javadsl/RunnableGraph.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/javadsl/RunnableGraph.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/stream/javadsl/RunnableGraph.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
19. [**](../../../akka/stream/javadsl/RunnableGraph.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/RunnableGraph.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/javadsl/RunnableGraph.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../akka/stream/javadsl/RunnableGraph.html#named(name:String):akka.stream.javadsl.RunnableGraph[Mat] "Permalink")  def named(name: String): RunnableGraph\[Mat]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition ClassesRunnableGraph → [Graph](../Graph.html)
23. [**](../../../akka/stream/javadsl/RunnableGraph.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/stream/javadsl/RunnableGraph.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/stream/javadsl/RunnableGraph.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/javadsl/RunnableGraph.html#run(systemProvider:akka.actor.ClassicActorSystemProvider):Mat "Permalink")  def run(systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): MatRun this flow and return the materialized values of the flow.

Run this flow and return the materialized values of the flow.

Uses the system materializer.
27. [**](../../../akka/stream/javadsl/RunnableGraph.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/stream/javadsl/RunnableGraph.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/stream/javadsl/RunnableGraph.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/stream/javadsl/RunnableGraph.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/stream/javadsl/RunnableGraph.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[ClosedShape](../ClosedShape.html), Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(runnableGraph: GraphMapMatVal[ClosedShape, Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/RunnableGraph.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/RunnableGraph.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toStringFormat\[RunnableGraph\[Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/RunnableGraph.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RunnableGraph\[Mat], B)ImplicitThis member is added by an implicit conversion from RunnableGraph\[Mat] toArrowAssoc\[RunnableGraph\[Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromRunnableGraph\[Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[ClosedShape](../ClosedShape.html), Mat]

### Inherited by implicit conversion any2stringadd fromRunnableGraph\[Mat] to any2stringadd\[RunnableGraph\[Mat]]

### Inherited by implicit conversion StringFormat fromRunnableGraph\[Mat] to StringFormat\[RunnableGraph\[Mat]]

### Inherited by implicit conversion Ensuring fromRunnableGraph\[Mat] to Ensuring\[RunnableGraph\[Mat]]

### Inherited by implicit conversion ArrowAssoc fromRunnableGraph\[Mat] to ArrowAssoc\[RunnableGraph\[Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SinkQueueWithCancel$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph.html)*