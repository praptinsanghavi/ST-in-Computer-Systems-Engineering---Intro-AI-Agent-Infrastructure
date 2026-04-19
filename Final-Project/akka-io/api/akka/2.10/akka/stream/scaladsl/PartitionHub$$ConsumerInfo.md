---
description: Akka 2.10.17 - akka.stream.scaladsl.PartitionHub.ConsumerInfo
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:55:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html
title: Akka 2.10.17 - akka.stream.scaladsl.PartitionHub.ConsumerInfo
---

# Akka 2.10.17 - akka.stream.scaladsl.PartitionHub.ConsumerInfo

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.PartitionHub.ConsumerInfo

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
- [**](../../../akka/stream/scaladsl/PartitionHub$.html "Permalink")  object [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.

A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.
It consists of two parts, a [Sink](Sink.html) and a [Source](Source.html). The [Sink](Sink.html) e elements from a producer to the
actually live consumers it has. The selection of consumer is done with a function. Each element can be routed to
only one consumer. Once the producer has been materialized, the [Sink](Sink.html) it feeds into returns a
materialized value which is the corresponding [Source](Source.html). This [Source](Source.html) can be materialized an arbitrary number
of times, where each of the new materializations will receive their elements from the original [Sink](Sink.html).

Definition Classes[scaladsl](index.html)
- ConsumerInfo
t[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[PartitionHub](PartitionHub$.html)

# ConsumerInfo[**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html "Permalink")

### 

#### trait ConsumerInfo extends [javadsl.PartitionHub.ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Hub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Hub.scala#L954)Linear Supertypes[javadsl.PartitionHub.ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerInfo
2. ConsumerInfo
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
### Abstract Value Members

1. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#consumerIdByIdx(idx:Int):Long "Permalink") abstract  def consumerIdByIdx(idx: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Obtain consumer identifier by index

Obtain consumer identifier by index

Definition ClassesConsumerInfo → [ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)
2. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#consumerIds:IndexedSeq[Long] "Permalink") abstract  def consumerIds: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Sequence of all identifiers of current consumers.

Sequence of all identifiers of current consumers.

Use this method only if you need to enumerate consumer existing ids.
When selecting a specific consumerId by its index, prefer using the dedicated [\#consumerIdByIdx](#consumerIdByIdx(idx:Int):Long) method instead,
which is optimised for this use case.
3. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#getConsumerIds:java.util.List[Long] "Permalink") abstract  def getConsumerIds: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Sequence of all identifiers of current consumers.

Sequence of all identifiers of current consumers.

Use this method only if you need to enumerate consumer existing ids.
When selecting a specific consumerId by its index, prefer using the dedicated [\#consumerIdByIdx](#consumerIdByIdx(idx:Int):Long) method instead,
which is optimised for this use case.

Definition Classes[ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)
4. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#queueSize(consumerId:Long):Int "Permalink") abstract  def queueSize(consumerId: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Approximate number of buffered elements for a consumer.

Approximate number of buffered elements for a consumer.
Larger value than other consumers could be an indication of
that the consumer is slow.

Note that this is a moving target since the elements are
consumed concurrently.

Definition ClassesConsumerInfo → [ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)
5. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#size:Int "Permalink") abstract  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of attached consumers.

Number of attached consumers.

Definition ClassesConsumerInfo → [ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)
### Concrete Value Members

1. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConsumerInfo toany2stringadd\[ConsumerInfo] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConsumerInfo, B)ImplicitThis member is added by an implicit conversion from ConsumerInfo toArrowAssoc\[ConsumerInfo] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConsumerInfo) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConsumerInfo) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConsumerInfo toStringFormat\[ConsumerInfo] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConsumerInfo, B)ImplicitThis member is added by an implicit conversion from ConsumerInfo toArrowAssoc\[ConsumerInfo] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.PartitionHub.ConsumerInfo](../javadsl/PartitionHub$$ConsumerInfo.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConsumerInfo to any2stringadd\[ConsumerInfo]

### Inherited by implicit conversion StringFormat fromConsumerInfo to StringFormat\[ConsumerInfo]

### Inherited by implicit conversion Ensuring fromConsumerInfo to Ensuring\[ConsumerInfo]

### Inherited by implicit conversion ArrowAssoc fromConsumerInfo to ArrowAssoc\[ConsumerInfo]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/PartitionHub$$ConsumerInfo.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/PartitionHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html)*