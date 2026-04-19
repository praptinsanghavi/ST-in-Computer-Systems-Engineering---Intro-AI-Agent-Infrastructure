---
description: Akka 2.10.17 - akka.stream.javadsl.BidiFlow
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/BidiFlow.html
title: Akka 2.10.17 - akka.stream.javadsl.BidiFlow
---

# Akka 2.10.17 - akka.stream.javadsl.BidiFlow

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.BidiFlow

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [AsPublisher](AsPublisher.html)
- [Balance](Balance$.html "Fan-out the stream to several streams.")
- BidiFlow
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
[c](BidiFlow$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [BidiFlow](BidiFlow$.html "See companion object")[**](../../../akka/stream/javadsl/BidiFlow.html "Permalink")

### Companion [object BidiFlow](BidiFlow$.html "See companion object")

#### final  class BidiFlow\[I1, O1, I2, O2, Mat] extends [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat]

Source[BidiFlow.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/BidiFlow.scala#L101)Linear Supertypes[Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BidiFlow
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

1. [**](../../../akka/stream/javadsl/BidiFlow.html#<init>(delegate:akka.stream.scaladsl.BidiFlow[I1,O1,I2,O2,Mat]):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  new BidiFlow(delegate: [scaladsl.BidiFlow](../scaladsl/BidiFlow.html)\[I1, O1, I2, O2, Mat])
### Type Members

1. [**](../../../akka/stream/javadsl/BidiFlow.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [BidiShape](../BidiShape.html)\[I1, O1, I2, O2]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/javadsl/BidiFlow.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/BidiFlow.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/BidiFlow.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toany2stringadd\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/BidiFlow.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BidiFlow\[I1, O1, I2, O2, Mat], B)ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toArrowAssoc\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/BidiFlow.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/BidiFlow.html#addAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): BidiFlow\[I1, O1, I2, O2, Mat]Add the given attributes to this Source.

Add the given attributes to this Source. Further calls to `withAttributes`
will not remove these attributes. Note that this
operation has no effect on an empty Flow (because the attributes apply
only to the contained processing operators).

Definition ClassesBidiFlow → [Graph](../Graph.html)
7. [**](../../../akka/stream/javadsl/BidiFlow.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/javadsl/BidiFlow.html#asScala:akka.stream.scaladsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def asScala: [scaladsl.BidiFlow](../scaladsl/BidiFlow.html)\[I1, O1, I2, O2, Mat]
9. [**](../../../akka/stream/javadsl/BidiFlow.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): BidiFlow\[I1, O1, I2, O2, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition ClassesBidiFlow → [Graph](../Graph.html)
10. [**](../../../akka/stream/javadsl/BidiFlow.html#async(dispatcher:String):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def async(dispatcher: String): BidiFlow\[I1, O1, I2, O2, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

dispatcherRun the graph on this dispatcher

Definition ClassesBidiFlow → [Graph](../Graph.html)
11. [**](../../../akka/stream/javadsl/BidiFlow.html#async:akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def async: BidiFlow\[I1, O1, I2, O2, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

Definition ClassesBidiFlow → [Graph](../Graph.html)
12. [**](../../../akka/stream/javadsl/BidiFlow.html#atop[OO1,II2,Mat2,M](bidi:akka.stream.javadsl.BidiFlow[O1,OO1,II2,I2,Mat2],combine:akka.japi.function.Function2[Mat,Mat2,M]):akka.stream.javadsl.BidiFlow[I1,OO1,II2,O2,M] "Permalink")  def atop\[OO1, II2, Mat2, M](bidi: BidiFlow\[O1, OO1, II2, I2, Mat2], combine: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, M]): BidiFlow\[I1, OO1, II2, O2, M]Add the given BidiFlow as the next step in a bidirectional transformation 161

Add the given BidiFlow as the next step in a bidirectional transformation 161

pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
layer, the closest to the metal.

```
    +----------------------------+
    | Resulting BidiFlow         |
    |                            |
    |  +------+        +------+  |
I1 ~~> |      |  ~O1~> |      | ~~> OO1
    |  | this |        | bidi |  |
O2 <~~ |      | <~I2~  |      | <~~ II2
    |  +------+        +------+  |
    +----------------------------+
```
The `combine` function is used to compose the materialized values of this flow and that
flow into the materialized value of the resulting BidiFlow.
13. [**](../../../akka/stream/javadsl/BidiFlow.html#atop[OO1,II2,Mat2](bidi:akka.stream.javadsl.BidiFlow[O1,OO1,II2,I2,Mat2]):akka.stream.javadsl.BidiFlow[I1,OO1,II2,O2,Mat] "Permalink")  def atop\[OO1, II2, Mat2](bidi: BidiFlow\[O1, OO1, II2, I2, Mat2]): BidiFlow\[I1, OO1, II2, O2, Mat]Add the given BidiFlow as the next step in a bidirectional transformation
pipeline.

Add the given BidiFlow as the next step in a bidirectional transformation
pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
layer, the closest to the metal.

```
    +----------------------------+
    | Resulting BidiFlow         |
    |                            |
    |  +------+        +------+  |
I1 ~~> |      |  ~O1~> |      | ~~> OO1
    |  | this |        | bidi |  |
O2 <~~ |      | <~I2~  |      | <~~ II2
    |  +------+        +------+  |
    +----------------------------+
```
The materialized value of the combined BidiFlow will be the materialized
value of the current flow (ignoring the other BidiFlow’s value), use
atopMat if a different strategy is needed.
14. [**](../../../akka/stream/javadsl/BidiFlow.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/javadsl/BidiFlow.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BidiFlow\[I1, O1, I2, O2, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BidiFlow\[I1, O1, I2, O2, Mat]ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toEnsuring\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/javadsl/BidiFlow.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BidiFlow\[I1, O1, I2, O2, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BidiFlow\[I1, O1, I2, O2, Mat]ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toEnsuring\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/javadsl/BidiFlow.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BidiFlow\[I1, O1, I2, O2, Mat]ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toEnsuring\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/javadsl/BidiFlow.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BidiFlow\[I1, O1, I2, O2, Mat]ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toEnsuring\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/javadsl/BidiFlow.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/javadsl/BidiFlow.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/javadsl/BidiFlow.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition ClassesBidiFlow → [Graph](../Graph.html)
22. [**](../../../akka/stream/javadsl/BidiFlow.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/javadsl/BidiFlow.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/javadsl/BidiFlow.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/stream/javadsl/BidiFlow.html#join[Mat2,M](flow:akka.stream.javadsl.Flow[O1,I2,Mat2],combine:akka.japi.function.Function2[Mat,Mat2,M]):akka.stream.javadsl.Flow[I1,O2,M] "Permalink")  def join\[Mat2, M](flow: [Flow](Flow.html)\[O1, I2, Mat2], combine: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, M]): [Flow](Flow.html)\[I1, O2, M]Add the given Flow as the final step in a bidirectional transformation
pipeline.

Add the given Flow as the final step in a bidirectional transformation
pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
layer, the closest to the metal.

```
    +---------------------------+
    | Resulting Flow            |
    |                           |
    |  +------+        +------+ |
I1 ~~> |      |  ~O1~> |      | |
    |  | this |        | flow | |
O2 <~~ |      | <~I2~  |      | |
    |  +------+        +------+ |
    +---------------------------+
```
The `combine` function is used to compose the materialized values of this flow and that
flow into the materialized value of the resulting [Flow](Flow.html).
26. [**](../../../akka/stream/javadsl/BidiFlow.html#join[Mat2](flow:akka.stream.javadsl.Flow[O1,I2,Mat2]):akka.stream.javadsl.Flow[I1,O2,Mat] "Permalink")  def join\[Mat2](flow: [Flow](Flow.html)\[O1, I2, Mat2]): [Flow](Flow.html)\[I1, O2, Mat]Add the given Flow as the final step in a bidirectional transformation
pipeline.

Add the given Flow as the final step in a bidirectional transformation
pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
layer, the closest to the metal.

```
    +---------------------------+
    | Resulting Flow            |
    |                           |
    |  +------+        +------+ |
I1 ~~> |      |  ~O1~> |      | |
    |  | this |        | flow | |
O2 <~~ |      | <~I2~  |      | |
    |  +------+        +------+ |
    +---------------------------+
```
The materialized value of the combined [Flow](Flow.html) will be the materialized
value of the current flow (ignoring the other Flow’s value), use
joinMat if a different strategy is needed.
27. [**](../../../akka/stream/javadsl/BidiFlow.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: [Function](../../japi/function/Function.html)\[Mat, Mat2]): BidiFlow\[I1, O1, I2, O2, Mat2]Transform only the materialized value of this BidiFlow, leaving all other properties as they were.
28. [**](../../../akka/stream/javadsl/BidiFlow.html#named(name:String):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def named(name: String): BidiFlow\[I1, O1, I2, O2, Mat]Add a `name` attribute to this Flow.

Add a `name` attribute to this Flow.

Definition ClassesBidiFlow → [Graph](../Graph.html)
29. [**](../../../akka/stream/javadsl/BidiFlow.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../akka/stream/javadsl/BidiFlow.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/stream/javadsl/BidiFlow.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/stream/javadsl/BidiFlow.html#reversed:akka.stream.javadsl.BidiFlow[I2,O2,I1,O1,Mat] "Permalink")  def reversed: BidiFlow\[I2, O2, I1, O1, Mat]Turn this BidiFlow around by 180 degrees, logically flipping it upside down in a protocol stack.
33. [**](../../../akka/stream/javadsl/BidiFlow.html#shape:akka.stream.BidiShape[I1,O1,I2,O2] "Permalink")  def shape: [BidiShape](../BidiShape.html)\[I1, O1, I2, O2]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesBidiFlow → [Graph](../Graph.html)
34. [**](../../../akka/stream/javadsl/BidiFlow.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../akka/stream/javadsl/BidiFlow.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
36. [**](../../../akka/stream/javadsl/BidiFlow.html#traversalBuilder:akka.stream.impl.TraversalBuilder "Permalink")  def traversalBuilder: TraversalBuilderINTERNAL API.

INTERNAL API.

Every materializable element must be backed by a stream layout module

Definition ClassesBidiFlow → [Graph](../Graph.html)
37. [**](../../../akka/stream/javadsl/BidiFlow.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/javadsl/BidiFlow.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/javadsl/BidiFlow.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/stream/javadsl/BidiFlow.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.BidiFlow[I1,O1,I2,O2,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): BidiFlow\[I1, O1, I2, O2, Mat]Change the attributes of this [Source](Source.html) to the given ones and seal the list
of attributes.

Change the attributes of this [Source](Source.html) to the given ones and seal the list
of attributes. This means that further calls will not be able to remove these
attributes, but instead add new ones. Note that this
operation has no effect on an empty Flow (because the attributes apply
only to the contained processing operators).

Definition ClassesBidiFlow → [Graph](../Graph.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/javadsl/BidiFlow.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(bidiFlow: GraphMapMatVal[BidiShape[I1, O1, I2, O2], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/BidiFlow.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/BidiFlow.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toStringFormat\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/BidiFlow.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BidiFlow\[I1, O1, I2, O2, Mat], B)ImplicitThis member is added by an implicit conversion from BidiFlow\[I1, O1, I2, O2, Mat] toArrowAssoc\[BidiFlow\[I1, O1, I2, O2, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromBidiFlow\[I1, O1, I2, O2, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat]

### Inherited by implicit conversion any2stringadd fromBidiFlow\[I1, O1, I2, O2, Mat] to any2stringadd\[BidiFlow\[I1, O1, I2, O2, Mat]]

### Inherited by implicit conversion StringFormat fromBidiFlow\[I1, O1, I2, O2, Mat] to StringFormat\[BidiFlow\[I1, O1, I2, O2, Mat]]

### Inherited by implicit conversion Ensuring fromBidiFlow\[I1, O1, I2, O2, Mat] to Ensuring\[BidiFlow\[I1, O1, I2, O2, Mat]]

### Inherited by implicit conversion ArrowAssoc fromBidiFlow\[I1, O1, I2, O2, Mat] to ArrowAssoc\[BidiFlow\[I1, O1, I2, O2, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Graph.html
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
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow.html](https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow.html)*