---
description: Akka 2.10.17 - akka.stream.scaladsl.SourceQueueWithComplete.QueueOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:55:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html
title: Akka 2.10.17 - akka.stream.scaladsl.SourceQueueWithComplete.QueueOps
---

# Akka 2.10.17 - akka.stream.scaladsl.SourceQueueWithComplete.QueueOps

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.SourceQueueWithComplete.QueueOps

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
- [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$.html "Permalink")  object [SourceQueueWithComplete](SourceQueueWithComplete$.html)Definition Classes[scaladsl](index.html)
- QueueOps
c[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[SourceQueueWithComplete](SourceQueueWithComplete$.html)

# QueueOps[**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html "Permalink")

### 

#### implicit final  class QueueOps\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[Queue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Queue.scala#L82)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. QueueOps
2. AnyVal
3. Any
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

1. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#<init>(queue:akka.stream.scaladsl.SourceQueueWithComplete[T]):akka.stream.scaladsl.SourceQueueWithComplete.QueueOps[T] "Permalink")  new QueueOps(queue: [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T])
### Value Members

1. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from QueueOps\[T] toany2stringadd\[QueueOps\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (QueueOps\[T], B)ImplicitThis member is added by an implicit conversion from QueueOps\[T] toArrowAssoc\[QueueOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#asJava:akka.stream.javadsl.SourceQueueWithComplete[T] "Permalink")  def asJava: [javadsl.SourceQueueWithComplete](../javadsl/SourceQueueWithComplete.html)\[T]Converts the queue into a `javadsl.SourceQueueWithComplete`
8. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (QueueOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QueueOps\[T]ImplicitThis member is added by an implicit conversion from QueueOps\[T] toEnsuring\[QueueOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (QueueOps\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueueOps\[T]ImplicitThis member is added by an implicit conversion from QueueOps\[T] toEnsuring\[QueueOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QueueOps\[T]ImplicitThis member is added by an implicit conversion from QueueOps\[T] toEnsuring\[QueueOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QueueOps\[T]ImplicitThis member is added by an implicit conversion from QueueOps\[T] toEnsuring\[QueueOps\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#queue:akka.stream.scaladsl.SourceQueueWithComplete[T] "Permalink")  val queue: [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T]
15. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from QueueOps\[T] toStringFormat\[QueueOps\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (QueueOps\[T], B)ImplicitThis member is added by an implicit conversion from QueueOps\[T] toArrowAssoc\[QueueOps\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromQueueOps\[T] to any2stringadd\[QueueOps\[T]]

### Inherited by implicit conversion StringFormat fromQueueOps\[T] to StringFormat\[QueueOps\[T]]

### Inherited by implicit conversion Ensuring fromQueueOps\[T] to Ensuring\[QueueOps\[T]]

### Inherited by implicit conversion ArrowAssoc fromQueueOps\[T] to ArrowAssoc\[QueueOps\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SourceQueueWithComplete.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/SourceQueueWithComplete$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/SourceQueueWithComplete.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/SourceQueueWithComplete$$QueueOps.html)*