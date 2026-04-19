---
description: Akka 2.10.17 - akka.stream.scaladsl.MergePreferred.MergePreferredShape
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:32:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html
title: Akka 2.10.17 - akka.stream.scaladsl.MergePreferred.MergePreferredShape
---

# Akka 2.10.17 - akka.stream.scaladsl.MergePreferred.MergePreferredShape

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.MergePreferred.MergePreferredShape

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
- [**](../../../akka/stream/scaladsl/MergePreferred$.html "Permalink")  object [MergePreferred](MergePreferred$.html)Definition Classes[scaladsl](index.html)
- MergePreferredShape
c[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[MergePreferred](MergePreferred$.html)

# MergePreferredShape[**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html "Permalink")

### 

#### final  class MergePreferredShape\[T] extends [UniformFanInShape](../UniformFanInShape.html)\[T, T]

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Graph.scala#L178)Linear Supertypes[UniformFanInShape](../UniformFanInShape.html)\[T, T], [FanInShape](../FanInShape.html)\[T], [Shape](../Shape.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MergePreferredShape
2. UniformFanInShape
3. FanInShape
4. Shape
5. AnyRef
6. Any
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

1. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#<init>(secondaryPorts:Int,name:String):akka.stream.scaladsl.MergePreferred.MergePreferredShape[T] "Permalink")  new MergePreferredShape(secondaryPorts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), name: String)
2. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#<init>(secondaryPorts:Int,_init:akka.stream.FanInShape.Init[T]):akka.stream.scaladsl.MergePreferred.MergePreferredShape[T] "Permalink")  new MergePreferredShape(secondaryPorts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), \_init: [Init](../FanInShape$$Init.html)\[T])
### Value Members

1. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toany2stringadd\[MergePreferredShape\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MergePreferredShape\[T], B)ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toArrowAssoc\[MergePreferredShape\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#construct(init:akka.stream.FanInShape.Init[T]):akka.stream.FanInShape[T] "Permalink")  def construct(init: [Init](../FanInShape$$Init.html)\[T]): [FanInShape](../FanInShape.html)\[T]Attributesprotected Definition ClassesMergePreferredShape → [UniformFanInShape](../UniformFanInShape.html) → [FanInShape](../FanInShape.html)
9. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#deepCopy():akka.stream.scaladsl.MergePreferred.MergePreferredShape[T] "Permalink")  def deepCopy(): MergePreferredShape\[T]Create a copy of this Shape object, returning the same type as the
original; this constraint can unfortunately not be expressed in the
type system.

Create a copy of this Shape object, returning the same type as the
original; this constraint can unfortunately not be expressed in the
type system.

Definition ClassesMergePreferredShape → [UniformFanInShape](../UniformFanInShape.html) → [FanInShape](../FanInShape.html) → [Shape](../Shape.html)
10. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MergePreferredShape\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MergePreferredShape\[T]ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toEnsuring\[MergePreferredShape\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MergePreferredShape\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MergePreferredShape\[T]ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toEnsuring\[MergePreferredShape\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MergePreferredShape\[T]ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toEnsuring\[MergePreferredShape\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MergePreferredShape\[T]ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toEnsuring\[MergePreferredShape\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#getInlets:java.util.List[akka.stream.Inlet[_]] "Permalink")  def getInlets: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Inlet](../Inlet.html)\[\_]]Java API: get a list of all input ports

Java API: get a list of all input ports

Definition Classes[Shape](../Shape.html)
18. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#getOutlets:java.util.List[akka.stream.Outlet[_]] "Permalink")  def getOutlets: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Outlet](../Outlet.html)\[\_]]Java API: get a list of all output ports

Java API: get a list of all output ports

Definition Classes[Shape](../Shape.html)
19. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#hasSamePortsAndShapeAs(s:akka.stream.Shape):Boolean "Permalink")  def hasSamePortsAndShapeAs(s: [Shape](../Shape.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Compare this to another shape and determine whether the arrangement of ports is the same (including their ordering).

Compare this to another shape and determine whether the arrangement of ports is the same (including their ordering).

Definition Classes[Shape](../Shape.html)
20. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#hasSamePortsAs(s:akka.stream.Shape):Boolean "Permalink")  def hasSamePortsAs(s: [Shape](../Shape.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Compare this to another shape and determine whether the set of ports is the same (ignoring their ordering).

Compare this to another shape and determine whether the set of ports is the same (ignoring their ordering).

Definition Classes[Shape](../Shape.html)
21. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#in(n:Int):akka.stream.Inlet[T@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def in(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Inlet](../Inlet.html)\[T]Definition Classes[UniformFanInShape](../UniformFanInShape.html)
23. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#inlets:Seq[akka.stream.Inlet[T@scala.annotation.unchecked.uncheckedVariance]] "Permalink") final  def inlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inlet](../Inlet.html)\[T]]Not meant for overriding outside of Akka.

Not meant for overriding outside of Akka.

Definition Classes[UniformFanInShape](../UniformFanInShape.html) → [FanInShape](../FanInShape.html) → [Shape](../Shape.html)
24. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#n:Int "Permalink")  val n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[UniformFanInShape](../UniformFanInShape.html)
26. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#newInlet[T](name:String):akka.stream.Inlet[T] "Permalink")  def newInlet\[T](name: String): [Inlet](../Inlet.html)\[T]Attributesprotected Definition Classes[FanInShape](../FanInShape.html)
28. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#out:akka.stream.Outlet[O@scala.annotation.unchecked.uncheckedVariance] "Permalink") final  def out: [Outlet](../Outlet.html)\[T]Definition Classes[FanInShape](../FanInShape.html)
31. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#outlets:Seq[akka.stream.Outlet[O@scala.annotation.unchecked.uncheckedVariance]] "Permalink") final  def outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](../Outlet.html)\[T]]Scala API: get a list of all output ports

Scala API: get a list of all output ports

Definition Classes[FanInShape](../FanInShape.html) → [Shape](../Shape.html)
32. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#preferred:akka.stream.Inlet[T] "Permalink")  val preferred: [Inlet](../Inlet.html)\[T]
33. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#requireSamePortsAndShapeAs(s:akka.stream.Shape):Unit "Permalink")  def requireSamePortsAndShapeAs(s: [Shape](../Shape.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserting version of [\#hasSamePortsAndShapeAs](#hasSamePortsAndShapeAs(s:akka.stream.Shape):Boolean).

Asserting version of [\#hasSamePortsAndShapeAs](#hasSamePortsAndShapeAs(s:akka.stream.Shape):Boolean).

Definition Classes[Shape](../Shape.html)
34. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#requireSamePortsAs(s:akka.stream.Shape):Unit "Permalink")  def requireSamePortsAs(s: [Shape](../Shape.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserting version of [\#hasSamePortsAs](#hasSamePortsAs(s:akka.stream.Shape):Boolean).

Asserting version of [\#hasSamePortsAs](#hasSamePortsAs(s:akka.stream.Shape):Boolean).

Definition Classes[Shape](../Shape.html)
35. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#secondaryPorts:Int "Permalink")  val secondaryPorts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
36. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toStringFormat\[MergePreferredShape\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MergePreferredShape\[T], B)ImplicitThis member is added by an implicit conversion from MergePreferredShape\[T] toArrowAssoc\[MergePreferredShape\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UniformFanInShape](../UniformFanInShape.html)\[T, T]

### Inherited from [FanInShape](../FanInShape.html)\[T]

### Inherited from [Shape](../Shape.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMergePreferredShape\[T] to any2stringadd\[MergePreferredShape\[T]]

### Inherited by implicit conversion StringFormat fromMergePreferredShape\[T] to StringFormat\[MergePreferredShape\[T]]

### Inherited by implicit conversion Ensuring fromMergePreferredShape\[T] to Ensuring\[MergePreferredShape\[T]]

### Inherited by implicit conversion ArrowAssoc fromMergePreferredShape\[T] to ArrowAssoc\[MergePreferredShape\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape$$Init.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Shape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$$MergePreferredShape.html)*