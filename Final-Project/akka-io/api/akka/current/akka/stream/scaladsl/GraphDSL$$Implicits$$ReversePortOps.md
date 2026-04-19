---
description: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html
title: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps
---

# Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps

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
- [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$.html "Permalink")  object [Implicits](GraphDSL$$Implicits$.html)Definition Classes[GraphDSL](GraphDSL$.html)
- [BidiFlowShapeArrow](GraphDSL$$Implicits$$BidiFlowShapeArrow.html)
- [CombinerBase](GraphDSL$$Implicits$$CombinerBase.html)
- [DisabledReversePortOps](GraphDSL$$Implicits$$DisabledReversePortOps.html)
- [FanInOps](GraphDSL$$Implicits$$FanInOps.html)
- [FanOutOps](GraphDSL$$Implicits$$FanOutOps.html)
- [FlowArrow](GraphDSL$$Implicits$$FlowArrow.html)
- [FlowShapeArrow](GraphDSL$$Implicits$$FlowShapeArrow.html)
- [PortOps](GraphDSL$$Implicits$$PortOps.html)
- [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
- ReversePortOps
- [SinkArrow](GraphDSL$$Implicits$$SinkArrow.html)
- [SinkShapeArrow](GraphDSL$$Implicits$$SinkShapeArrow.html)
- [SourceArrow](GraphDSL$$Implicits$$SourceArrow.html)
- [SourceShapeArrow](GraphDSL$$Implicits$$SourceShapeArrow.html)
c[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[GraphDSL](GraphDSL$.html).[Implicits](GraphDSL$$Implicits$.html)

# ReversePortOps[**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html "Permalink")

### 

#### implicit  class ReversePortOps\[In] extends [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In]

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Graph.scala#L1843)Linear Supertypes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DisabledReversePortOps](GraphDSL$$Implicits$$DisabledReversePortOps.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReversePortOps
2. ReverseCombinerBase
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<init>(inlet:akka.stream.Inlet[In]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  new ReversePortOps(inlet: [Inlet](../Inlet.html)\[In])
### Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toany2stringadd\[ReversePortOps\[In]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReversePortOps\[In], B)ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toArrowAssoc\[ReversePortOps\[In]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~(from:akka.stream.SourceShape[T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~(from: [SourceShape](../SourceShape.html)\[In])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
6. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~(from:akka.stream.Graph[akka.stream.SourceShape[T],_])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~(from: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], \_])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
7. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~[In](flow:akka.stream.FlowShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](flow: [FlowShape](../FlowShape.html)\[In, In])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): ReversePortOps\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
8. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~[In](junction:akka.stream.UniformFanInShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](junction: [UniformFanInShape](../UniformFanInShape.html)\[In, In])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): ReversePortOps\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
9. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~[In](junction:akka.stream.UniformFanOutShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](junction: [UniformFanOutShape](../UniformFanOutShape.html)\[In, In])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): ReversePortOps\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
10. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~[In](via:akka.stream.Graph[akka.stream.FlowShape[In,T],_])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](via: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, In], \_])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): ReversePortOps\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
11. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#<~[U<:T](from:akka.stream.Outlet[U])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~\[U \<: In](from: [Outlet](../Outlet.html)\[U])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
12. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReversePortOps\[In]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReversePortOps\[In]ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toEnsuring\[ReversePortOps\[In]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReversePortOps\[In]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReversePortOps\[In]ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toEnsuring\[ReversePortOps\[In]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReversePortOps\[In]ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toEnsuring\[ReversePortOps\[In]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReversePortOps\[In]ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toEnsuring\[ReversePortOps\[In]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#importAndGetPortReverse(b:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.Inlet[In] "Permalink")  def importAndGetPortReverse(b: [Builder](GraphDSL$$Builder.html)\[\_]): [Inlet](../Inlet.html)\[In]Definition ClassesReversePortOps → [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
24. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#inlet:akka.stream.Inlet[In] "Permalink")  val inlet: [Inlet](../Inlet.html)\[In]
25. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toStringFormat\[ReversePortOps\[In]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReversePortOps\[In], B)ImplicitThis member is added by an implicit conversion from ReversePortOps\[In] toArrowAssoc\[ReversePortOps\[In]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[In]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReversePortOps\[In] to any2stringadd\[ReversePortOps\[In]]

### Inherited by implicit conversion StringFormat fromReversePortOps\[In] to StringFormat\[ReversePortOps\[In]]

### Inherited by implicit conversion Ensuring fromReversePortOps\[In] to Ensuring\[ReversePortOps\[In]]

### Inherited by implicit conversion ArrowAssoc fromReversePortOps\[In] to ArrowAssoc\[ReversePortOps\[In]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Builder.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$BidiFlowShapeArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$CombinerBase.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$DisabledReversePortOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FanInOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FanOutOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$PortOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$ReverseCombinerBase.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$SinkArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$SinkShapeArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$SourceArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$SourceShapeArrow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$ReversePortOps.html)*