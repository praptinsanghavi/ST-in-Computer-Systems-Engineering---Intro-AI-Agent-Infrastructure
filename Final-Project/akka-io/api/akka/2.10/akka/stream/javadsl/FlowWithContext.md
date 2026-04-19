---
description: Akka 2.10.17 - akka.stream.javadsl.FlowWithContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:55:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/FlowWithContext.html
title: Akka 2.10.17 - akka.stream.javadsl.FlowWithContext
---

# Akka 2.10.17 - akka.stream.javadsl.FlowWithContext

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.FlowWithContext

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
- FlowWithContext
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
[c](FlowWithContext$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [FlowWithContext](FlowWithContext$.html "See companion object")[**](../../../akka/stream/javadsl/FlowWithContext.html "Permalink")

### Companion [object FlowWithContext](FlowWithContext$.html "See companion object")

#### final  class FlowWithContext\[In, CtxIn, Out, CtxOut, \+Mat] extends GraphDelegate\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]

A flow that provides operations which automatically propagate the context of an element.
Only a subset of common operations from [Flow](Flow.html) is supported. As an escape hatch you can
use [FlowWithContext.via](#via[Out2,CtxOut2,Mat2](viaFlow:akka.stream.Graph[akka.stream.FlowShape[akka.japi.Pair[Out@scala.annotation.unchecked.uncheckedVariance,CtxOut@scala.annotation.unchecked.uncheckedVariance],akka.japi.Pair[Out2,CtxOut2]],Mat2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut2,Mat]) to manually provide the context propagation for otherwise unsupported
operations.

An "empty" flow can be created by calling `FlowWithContext[Ctx, T]`.

Source[FlowWithContext.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/FlowWithContext.scala#L44)Linear SupertypesGraphDelegate\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat], [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FlowWithContext
2. GraphDelegate
3. Graph
4. AnyRef
5. Any
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

1. [**](../../../akka/stream/javadsl/FlowWithContext.html#<init>(delegate:akka.stream.javadsl.Flow[akka.japi.Pair[In,CtxIn],akka.japi.Pair[Out,CtxOut],Mat]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  new FlowWithContext(delegate: [Flow](Flow.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut], Mat])
### Type Members

1. [**](../../../akka/stream/javadsl/FlowWithContext.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/javadsl/FlowWithContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/FlowWithContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/FlowWithContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toany2stringadd\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/FlowWithContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FlowWithContext\[In, CtxIn, Out, CtxOut, Mat], B)ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toArrowAssoc\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/FlowWithContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/FlowWithContext.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition Classes[Graph](../Graph.html)
7. [**](../../../akka/stream/javadsl/FlowWithContext.html#asFlow():akka.stream.javadsl.Flow[akka.japi.Pair[In,CtxIn],akka.japi.Pair[Out,CtxOut],Mat]@scala.annotation.unchecked.uncheckedVariance "Permalink")  def asFlow(): [Flow](Flow.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut], Mat]Creates a regular flow of pairs (data, context).
8. [**](../../../akka/stream/javadsl/FlowWithContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/stream/javadsl/FlowWithContext.html#asScala:akka.stream.scaladsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def asScala: [scaladsl.FlowWithContext](../scaladsl/FlowWithContext.html)\[In, CtxIn, Out, CtxOut, Mat]
10. [**](../../../akka/stream/javadsl/FlowWithContext.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/javadsl/FlowWithContext.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
12. [**](../../../akka/stream/javadsl/FlowWithContext.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
13. [**](../../../akka/stream/javadsl/FlowWithContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/javadsl/FlowWithContext.html#collect[Out2](pf:PartialFunction[Out,Out2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def collect\[Out2](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Out, Out2]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.collect](Flow.html#collect[T](pf:PartialFunction[Out,T]):akka.stream.javadsl.Flow[In,T,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.collect](Flow.html#collect[T](pf:PartialFunction[Out,T]):akka.stream.javadsl.Flow[In,T,Mat]).

Note, that the context of elements that are filtered out is skipped as well.

See also[akka.stream.javadsl.Flow.collect](Flow.html#collect[T](pf:PartialFunction[Out,T]):akka.stream.javadsl.Flow[In,T,Mat])
15. [**](../../../akka/stream/javadsl/FlowWithContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toEnsuring\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/javadsl/FlowWithContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toEnsuring\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/javadsl/FlowWithContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toEnsuring\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/javadsl/FlowWithContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toEnsuring\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/javadsl/FlowWithContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/javadsl/FlowWithContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/javadsl/FlowWithContext.html#filter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def filter(p: [Predicate](../../japi/function/Predicate.html)\[Out]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.filter](Flow.html#filter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.filter](Flow.html#filter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat]).

Note, that the context of elements that are filtered out is skipped as well.

See also[akka.stream.javadsl.Flow.filter](Flow.html#filter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
22. [**](../../../akka/stream/javadsl/FlowWithContext.html#filterNot(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def filterNot(p: [Predicate](../../japi/function/Predicate.html)\[Out]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.filterNot](Flow.html#filterNot(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.filterNot](Flow.html#filterNot(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat]).

Note, that the context of elements that are filtered out is skipped as well.

See also[akka.stream.javadsl.Flow.filterNot](Flow.html#filterNot(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
23. [**](../../../akka/stream/javadsl/FlowWithContext.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
24. [**](../../../akka/stream/javadsl/FlowWithContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/stream/javadsl/FlowWithContext.html#grouped(n:Int):akka.stream.javadsl.FlowWithContext[In,CtxIn,java.util.List[Out@scala.annotation.unchecked.uncheckedVariance],java.util.List[CtxOut@scala.annotation.unchecked.uncheckedVariance],Mat] "Permalink")  def grouped(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): FlowWithContext\[In, CtxIn, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[CtxOut], Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.grouped](Flow.html#grouped(n:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.grouped](Flow.html#grouped(n:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat]).

Each output group will be associated with a `Seq` of corresponding context elements.

See also[akka.stream.javadsl.Flow.grouped](Flow.html#grouped(n:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat])
26. [**](../../../akka/stream/javadsl/FlowWithContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/javadsl/FlowWithContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/stream/javadsl/FlowWithContext.html#log(name:String):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def log(name: String): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat])
29. [**](../../../akka/stream/javadsl/FlowWithContext.html#log(name:String,log:akka.event.LoggingAdapter):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def log(name: String, log: [LoggingAdapter](../../event/LoggingAdapter.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat])
30. [**](../../../akka/stream/javadsl/FlowWithContext.html#log(name:String,extract:akka.japi.function.Function[Out,Any]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def log(name: String, extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat])
31. [**](../../../akka/stream/javadsl/FlowWithContext.html#log(name:String,extract:akka.japi.function.Function[Out,Any],log:akka.event.LoggingAdapter):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def log(name: String, extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], log: [LoggingAdapter](../../event/LoggingAdapter.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.log](Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat])
32. [**](../../../akka/stream/javadsl/FlowWithContext.html#logWithMarker(name:String,marker:akka.japi.function.Function2[Out,CtxOut,akka.event.LogMarker]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function2](../../japi/function/Function2.html)\[Out, CtxOut, [LogMarker](../../event/LogMarker.html)]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat])
33. [**](../../../akka/stream/javadsl/FlowWithContext.html#logWithMarker(name:String,marker:akka.japi.function.Function2[Out,CtxOut,akka.event.LogMarker],log:akka.event.MarkerLoggingAdapter):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function2](../../japi/function/Function2.html)\[Out, CtxOut, [LogMarker](../../event/LogMarker.html)], log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat])
34. [**](../../../akka/stream/javadsl/FlowWithContext.html#logWithMarker(name:String,marker:akka.japi.function.Function2[Out,CtxOut,akka.event.LogMarker],extract:akka.japi.function.Function[Out,Any]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function2](../../japi/function/Function2.html)\[Out, CtxOut, [LogMarker](../../event/LogMarker.html)], extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat])
35. [**](../../../akka/stream/javadsl/FlowWithContext.html#logWithMarker(name:String,marker:akka.japi.function.Function2[Out,CtxOut,akka.event.LogMarker],extract:akka.japi.function.Function[Out,Any],log:akka.event.MarkerLoggingAdapter):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function2](../../japi/function/Function2.html)\[Out, CtxOut, [LogMarker](../../event/LogMarker.html)], extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.logWithMarker](Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat])
36. [**](../../../akka/stream/javadsl/FlowWithContext.html#map[Out2](f:akka.japi.function.Function[Out,Out2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def map\[Out2](f: [Function](../../japi/function/Function.html)\[Out, Out2]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.map](Flow.html#map[T](f:akka.japi.function.Function[Out,T]):akka.stream.javadsl.Flow[In,T,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.map](Flow.html#map[T](f:akka.japi.function.Function[Out,T]):akka.stream.javadsl.Flow[In,T,Mat]).

See also[akka.stream.javadsl.Flow.map](Flow.html#map[T](f:akka.japi.function.Function[Out,T]):akka.stream.javadsl.Flow[In,T,Mat])
37. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapAsync[Out2](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[Out2]]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def mapAsync\[Out2](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Out2]]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.mapAsync](Flow.html#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])

Context\-preserving variant of [akka.stream.javadsl.Flow.mapAsync](Flow.html#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])

See also[akka.stream.javadsl.Flow.mapAsync](Flow.html#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])
38. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapAsyncPartitioned[Out2,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[Out2]]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def mapAsyncPartitioned\[Out2, P](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), perPartition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), partitioner: [Function](../../japi/function/Function.html)\[Out, P], f: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[Out, P, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Out2]]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.mapAsyncPartitioned](Flow.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])

Context\-preserving variant of [akka.stream.javadsl.Flow.mapAsyncPartitioned](Flow.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])

See also[akka.stream.javadsl.Flow.mapAsyncPartitioned](Flow.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])
39. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapConcat[Out2](f:akka.japi.function.Function[Out,_<:Iterable[Out2]]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def mapConcat\[Out2](f: [Function](../../japi/function/Function.html)\[Out, \_ \<: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Out2]]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.mapConcat](Flow.html#mapConcat[T](f:akka.japi.function.Function[Out,Iterable[T]]):akka.stream.javadsl.Flow[In,T,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.mapConcat](Flow.html#mapConcat[T](f:akka.japi.function.Function[Out,Iterable[T]]):akka.stream.javadsl.Flow[In,T,Mat]).

The context of the input element will be associated with each of the output elements calculated from
this input element.

Example:

`def dup(element: String) = Seq(element, element)`

Input:

("a", 1\)
("b", 2\)

inputElements.mapConcat(dup)

Output:

("a", 1\)
("a", 1\)
("b", 2\)
("b", 2\)

See also[akka.stream.javadsl.Flow.mapConcat](Flow.html#mapConcat[T](f:akka.japi.function.Function[Out,Iterable[T]]):akka.stream.javadsl.Flow[In,T,Mat])
40. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapContext[CtxOut2](extractContext:akka.japi.function.Function[CtxOut,CtxOut2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut2,Mat] "Permalink")  def mapContext\[CtxOut2](extractContext: [Function](../../japi/function/Function.html)\[CtxOut, CtxOut2]): FlowWithContext\[In, CtxIn, Out, CtxOut2, Mat]Apply the given function to each context element (leaving the data elements unchanged).
41. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapError(pf:PartialFunction[Throwable,Throwable]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def mapError(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, Throwable]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.mapError](Flow.html#mapError[E<:Throwable](clazz:Class[E],f:akka.japi.function.Function[E,Throwable]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.mapError](Flow.html#mapError[E<:Throwable](clazz:Class[E],f:akka.japi.function.Function[E,Throwable]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.mapError](Flow.html#mapError[E<:Throwable](clazz:Class[E],f:akka.japi.function.Function[E,Throwable]):akka.stream.javadsl.Flow[In,Out,Mat])
42. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: [Function](../../japi/function/Function.html)\[Mat, Mat2]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat2]Context\-preserving variant of [akka.stream.javadsl.Flow.mapMaterializedValue](Flow.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.Flow[In,Out,Mat2]).

Context\-preserving variant of [akka.stream.javadsl.Flow.mapMaterializedValue](Flow.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.Flow[In,Out,Mat2]).

See also[akka.stream.javadsl.Flow.mapMaterializedValue](Flow.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.Flow[In,Out,Mat2])
43. [**](../../../akka/stream/javadsl/FlowWithContext.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition Classes[Graph](../Graph.html)
44. [**](../../../akka/stream/javadsl/FlowWithContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
45. [**](../../../akka/stream/javadsl/FlowWithContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../../akka/stream/javadsl/FlowWithContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
47. [**](../../../akka/stream/javadsl/FlowWithContext.html#shape:S "Permalink") final  def shape: [FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesGraphDelegate → [Graph](../Graph.html)
48. [**](../../../akka/stream/javadsl/FlowWithContext.html#sliding(n:Int,step:Int):akka.stream.javadsl.FlowWithContext[In,CtxIn,java.util.List[Out@scala.annotation.unchecked.uncheckedVariance],java.util.List[CtxOut@scala.annotation.unchecked.uncheckedVariance],Mat] "Permalink")  def sliding(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1): FlowWithContext\[In, CtxIn, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[CtxOut], Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.sliding](Flow.html#sliding(n:Int,step:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.sliding](Flow.html#sliding(n:Int,step:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat]).

Each output group will be associated with a `Seq` of corresponding context elements.

See also[akka.stream.javadsl.Flow.sliding](Flow.html#sliding(n:Int,step:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat])
49. [**](../../../akka/stream/javadsl/FlowWithContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
50. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
51. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(control:akka.stream.javadsl.ThrottleControl):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
52. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(cost:Int,per:java.time.Duration,maximumBurst:Int,costCalculation:akka.japi.function.Function[Out,Integer],mode:akka.stream.ThrottleMode):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)], mode: [ThrottleMode](../ThrottleMode.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
53. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(cost:Int,per:java.time.Duration,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
54. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(elements:Int,per:java.time.Duration,maximumBurst:Int,mode:akka.stream.ThrottleMode):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
55. [**](../../../akka/stream/javadsl/FlowWithContext.html#throttle(elements:Int,per:java.time.Duration):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat]).

See also[akka.stream.javadsl.Flow.throttle](Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat])
56. [**](../../../akka/stream/javadsl/FlowWithContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
57. [**](../../../akka/stream/javadsl/FlowWithContext.html#unsafeDataVia[Out2,Mat2](viaFlow:akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out2],Mat2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut,Mat] "Permalink")  def unsafeDataVia\[Out2, Mat2](viaFlow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out2], Mat2]): FlowWithContext\[In, CtxIn, Out2, CtxOut, Mat]Transform this flow by the regular flow.

Transform this flow by the regular flow. The given flow works on the data portion of the stream and
ignores the context.

The given flow \*must\* not re\-order, drop or emit multiple elements for one incoming
element, the sequence of incoming contexts is re\-combined with the outgoing
elements of the stream. If a flow not fulfilling this requirement is used the stream
will not fail but continue running in a corrupt state and re\-combine incorrect pairs
of elements and contexts or deadlock.

For more background on these requirements
 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
58. [**](../../../akka/stream/javadsl/FlowWithContext.html#via[Out2,CtxOut2,Mat2](viaFlow:akka.stream.Graph[akka.stream.FlowShape[akka.japi.Pair[Out@scala.annotation.unchecked.uncheckedVariance,CtxOut@scala.annotation.unchecked.uncheckedVariance],akka.japi.Pair[Out2,CtxOut2]],Mat2]):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out2,CtxOut2,Mat] "Permalink")  def via\[Out2, CtxOut2, Mat2](viaFlow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[Out, CtxOut], [Pair](../../japi/Pair.html)\[Out2, CtxOut2]], Mat2]): FlowWithContext\[In, CtxIn, Out2, CtxOut2, Mat]Transform this flow by the regular flow.

Transform this flow by the regular flow. The given flow must support manual context propagation by
taking and producing tuples of (data, context).

 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
 by the downstream elements, such as reordering. For more background on these requirements
 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.

This can be used as an escape hatch for operations that are not (yet) provided with automatic
context propagation here.

See also[akka.stream.javadsl.Flow.via](Flow.html#via[T,M](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],M]):akka.stream.javadsl.Flow[In,T,Mat])
59. [**](../../../akka/stream/javadsl/FlowWithContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
60. [**](../../../akka/stream/javadsl/FlowWithContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
61. [**](../../../akka/stream/javadsl/FlowWithContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
62. [**](../../../akka/stream/javadsl/FlowWithContext.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]Context\-preserving variant of [akka.stream.javadsl.Flow.withAttributes](Flow.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Flow[In,Out,Mat]).

Context\-preserving variant of [akka.stream.javadsl.Flow.withAttributes](Flow.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Flow[In,Out,Mat]).

Definition ClassesFlowWithContext → [Graph](../Graph.html)See also[akka.stream.javadsl.Flow.withAttributes](Flow.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Flow[In,Out,Mat])
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/javadsl/FlowWithContext.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(flowWithContext: GraphMapMatVal[FlowShape[Pair[In, CtxIn], Pair[Out, CtxOut]], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/FlowWithContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/FlowWithContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toStringFormat\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/FlowWithContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FlowWithContext\[In, CtxIn, Out, CtxOut, Mat], B)ImplicitThis member is added by an implicit conversion from FlowWithContext\[In, CtxIn, Out, CtxOut, Mat] toArrowAssoc\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from GraphDelegate\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]

### Inherited from [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromFlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FlowShape](../FlowShape.html)\[[Pair](../../japi/Pair.html)\[In, CtxIn], [Pair](../../japi/Pair.html)\[Out, CtxOut]], Mat]

### Inherited by implicit conversion any2stringadd fromFlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to any2stringadd\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]]

### Inherited by implicit conversion StringFormat fromFlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to StringFormat\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]]

### Inherited by implicit conversion Ensuring fromFlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to Ensuring\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]]

### Inherited by implicit conversion ArrowAssoc fromFlowWithContext\[In, CtxIn, Out, CtxOut, Mat] to ArrowAssoc\[FlowWithContext\[In, CtxIn, Out, CtxOut, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Predicate.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ThrottleMode.html
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

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext.html](https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext.html)*