---
description: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:50:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/GraphDSL$$Implicits$.html
title: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits
---

# Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](../Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Definition Classes[stream](../index.html)
- [**](../../../akka/stream/scaladsl/GraphDSL$.html "Permalink")  object [GraphDSL](GraphDSL$.html) extends [GraphApply](GraphApply.html)Definition Classes[scaladsl](index.html)
- [Builder](GraphDSL$$Builder.html)
- Implicits
o[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[GraphDSL](GraphDSL$.html)

# Implicits[**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html "Permalink")

### 

#### object Implicits

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Graph.scala#L1703)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Implicits
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$BidiFlowShapeArrow.html "Permalink") implicit final  class [BidiFlowShapeArrow](GraphDSL$$Implicits$$BidiFlowShapeArrow.html)\[I1, O1, I2, O2] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$CombinerBase.html "Permalink") sealed  trait [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)\[\+T] extends [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
3. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$DisabledReversePortOps.html "Permalink") final  class [DisabledReversePortOps](GraphDSL$$Implicits$$DisabledReversePortOps.html)\[In] extends [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In]
4. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FanInOps.html "Permalink") implicit final  class [FanInOps](GraphDSL$$Implicits$$FanInOps.html)\[In, Out] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)\[Out] with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In]
5. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FanOutOps.html "Permalink") implicit final  class [FanOutOps](GraphDSL$$Implicits$$FanOutOps.html)\[In, Out] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In]
6. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowArrow.html "Permalink") implicit final  class [FlowArrow](GraphDSL$$Implicits$$FlowArrow.html)\[I, O, M] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
7. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html "Permalink") implicit final  class [FlowShapeArrow](GraphDSL$$Implicits$$FlowShapeArrow.html)\[I, O] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[I]
8. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$PortOps.html "Permalink")  trait [PortOps](GraphDSL$$Implicits$$PortOps.html)\[\+Out] extends [FlowOps](FlowOps.html)\[Out, [NotUsed](../../NotUsed.html)] with [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)\[Out]
9. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReverseCombinerBase.html "Permalink") sealed  trait [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[T] extends [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
10. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html "Permalink") implicit  class [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In] extends [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In]
11. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$SinkArrow.html "Permalink") implicit final  class [SinkArrow](GraphDSL$$Implicits$$SinkArrow.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[T]
12. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$SinkShapeArrow.html "Permalink") implicit final  class [SinkShapeArrow](GraphDSL$$Implicits$$SinkShapeArrow.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[T]
13. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$SourceArrow.html "Permalink") implicit final  class [SourceArrow](GraphDSL$$Implicits$$SourceArrow.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)\[T]
14. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$SourceShapeArrow.html "Permalink") implicit final  class [SourceShapeArrow](GraphDSL$$Implicits$$SourceShapeArrow.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)\[T]
### Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#fanOut2flow[I,O](j:akka.stream.UniformFanOutShape[I,O])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.PortOps[O] "Permalink") implicit  def fanOut2flow\[I, O](j: [UniformFanOutShape](../UniformFanOutShape.html)\[I, O])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [PortOps](GraphDSL$$Implicits$$PortOps.html)\[O]
9. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#flow2flow[I,O](f:akka.stream.FlowShape[I,O])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.PortOps[O] "Permalink") implicit  def flow2flow\[I, O](f: [FlowShape](../FlowShape.html)\[I, O])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [PortOps](GraphDSL$$Implicits$$PortOps.html)\[O]
10. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#port2flow[T](from:akka.stream.Outlet[T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.PortOps[T] "Permalink") implicit  def port2flow\[T](from: [Outlet](../Outlet.html)\[T])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [PortOps](GraphDSL$$Implicits$$PortOps.html)\[T]
17. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Builder.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$BidiFlowShapeArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$CombinerBase.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$DisabledReversePortOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$FanInOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$FanOutOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$PortOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$ReverseCombinerBase.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$SinkArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$SinkShapeArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$SourceArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$$SourceShapeArrow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$.html](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$$Implicits$.html)*