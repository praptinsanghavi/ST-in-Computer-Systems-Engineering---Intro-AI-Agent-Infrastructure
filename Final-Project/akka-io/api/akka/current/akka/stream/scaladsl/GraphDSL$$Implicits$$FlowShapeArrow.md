---
description: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.FlowShapeArrow
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html
title: Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.FlowShapeArrow
---

# Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.FlowShapeArrow

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.GraphDSL.Implicits.FlowShapeArrow

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
- FlowShapeArrow
- [PortOps](GraphDSL$$Implicits$$PortOps.html)
- [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
- [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)
- [SinkArrow](GraphDSL$$Implicits$$SinkArrow.html)
- [SinkShapeArrow](GraphDSL$$Implicits$$SinkShapeArrow.html)
- [SourceArrow](GraphDSL$$Implicits$$SourceArrow.html)
- [SourceShapeArrow](GraphDSL$$Implicits$$SourceShapeArrow.html)
c[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[GraphDSL](GraphDSL$.html).[Implicits](GraphDSL$$Implicits$.html)

# FlowShapeArrow[**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html "Permalink")

### 

#### implicit final  class FlowShapeArrow\[I, O] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal) with [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[I]

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Graph.scala#L1873)Linear Supertypes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[I], [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FlowShapeArrow
2. ReverseCombinerBase
3. AnyVal
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

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<init>(f:akka.stream.FlowShape[I,O]):akka.stream.scaladsl.GraphDSL.Implicits.FlowShapeArrow[I,O] "Permalink")  new FlowShapeArrow(f: [FlowShape](../FlowShape.html)\[I, O])
### Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toany2stringadd\[FlowShapeArrow\[I, O]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FlowShapeArrow\[I, O], B)ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toArrowAssoc\[FlowShapeArrow\[I, O]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~(from:akka.stream.SourceShape[T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~(from: [SourceShape](../SourceShape.html)\[I])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
6. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~(from:akka.stream.Graph[akka.stream.SourceShape[T],_])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~(from: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[I], \_])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
7. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~[In](flow:akka.stream.FlowShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](flow: [FlowShape](../FlowShape.html)\[In, I])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
8. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~[In](junction:akka.stream.UniformFanInShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](junction: [UniformFanInShape](../UniformFanInShape.html)\[In, I])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
9. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~[In](junction:akka.stream.UniformFanOutShape[In,T])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](junction: [UniformFanOutShape](../UniformFanOutShape.html)\[In, I])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
10. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~[In](via:akka.stream.Graph[akka.stream.FlowShape[In,T],_])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.scaladsl.GraphDSL.Implicits.ReversePortOps[In] "Permalink")  def \<\~\[In](via: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, I], \_])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [ReversePortOps](GraphDSL$$Implicits$$ReversePortOps.html)\[In]Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
11. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~[U<:T](from:akka.stream.Outlet[U])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~\[U \<: I](from: [Outlet](../Outlet.html)\[U])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
12. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~>[M](flow:akka.stream.Graph[akka.stream.FlowShape[O,I],M])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):Unit "Permalink")  def \<\~\>\[M](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[O, I], M])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
13. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~>[I2,O2](bidi:akka.stream.BidiShape[O,O2,I2,I])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.BidiShape[O,O2,I2,I] "Permalink")  def \<\~\>\[I2, O2](bidi: [BidiShape](../BidiShape.html)\[O, O2, I2, I])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [BidiShape](../BidiShape.html)\[O, O2, I2, I]
14. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#<~>[I2,O2,Mat](bidi:akka.stream.Graph[akka.stream.BidiShape[O,O2,I2,I],Mat])(implicitb:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.BidiShape[O,O2,I2,I] "Permalink")  def \<\~\>\[I2, O2, Mat](bidi: [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[O, O2, I2, I], Mat])(implicit b: [Builder](GraphDSL$$Builder.html)\[\_]): [BidiShape](../BidiShape.html)\[O, O2, I2, I]
15. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
17. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FlowShapeArrow\[I, O]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowShapeArrow\[I, O]ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toEnsuring\[FlowShapeArrow\[I, O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FlowShapeArrow\[I, O]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowShapeArrow\[I, O]ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toEnsuring\[FlowShapeArrow\[I, O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowShapeArrow\[I, O]ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toEnsuring\[FlowShapeArrow\[I, O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowShapeArrow\[I, O]ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toEnsuring\[FlowShapeArrow\[I, O]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#f:akka.stream.FlowShape[I,O] "Permalink")  val f: [FlowShape](../FlowShape.html)\[I, O]
22. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
23. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#importAndGetPortReverse(b:akka.stream.scaladsl.GraphDSL.Builder[_]):akka.stream.Inlet[I] "Permalink")  def importAndGetPortReverse(b: [Builder](GraphDSL$$Builder.html)\[\_]): [Inlet](../Inlet.html)\[I]Definition ClassesFlowShapeArrow → [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)
24. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toStringFormat\[FlowShapeArrow\[I, O]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FlowShapeArrow\[I, O], B)ImplicitThis member is added by an implicit conversion from FlowShapeArrow\[I, O] toArrowAssoc\[FlowShapeArrow\[I, O]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReverseCombinerBase](GraphDSL$$Implicits$$ReverseCombinerBase.html)\[I]

### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFlowShapeArrow\[I, O] to any2stringadd\[FlowShapeArrow\[I, O]]

### Inherited by implicit conversion StringFormat fromFlowShapeArrow\[I, O] to StringFormat\[FlowShapeArrow\[I, O]]

### Inherited by implicit conversion Ensuring fromFlowShapeArrow\[I, O] to Ensuring\[FlowShapeArrow\[I, O]]

### Inherited by implicit conversion ArrowAssoc fromFlowShapeArrow\[I, O] to ArrowAssoc\[FlowShapeArrow\[I, O]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/BidiShape.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$$Implicits$$FlowShapeArrow.html)*