---
description: Akka 2.10.17 - akka.stream.scaladsl.UnzipWithApply.UnzipWithCreatorObject6
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:57:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html
title: Akka 2.10.17 - akka.stream.scaladsl.UnzipWithApply.UnzipWithCreatorObject6
---

# Akka 2.10.17 - akka.stream.scaladsl.UnzipWithApply.UnzipWithCreatorObject6

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.UnzipWithApply.UnzipWithCreatorObject6

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
- [**](../../../akka/stream/scaladsl/UnzipWithApply$.html "Permalink")  object [UnzipWithApply](UnzipWithApply$.html)Definition Classes[scaladsl](index.html)
- [UnzipWithCreator](UnzipWithApply$$UnzipWithCreator.html)
- [UnzipWithCreator10](UnzipWithApply$$UnzipWithCreator10.html)
- [UnzipWithCreator11](UnzipWithApply$$UnzipWithCreator11.html)
- [UnzipWithCreator12](UnzipWithApply$$UnzipWithCreator12.html)
- [UnzipWithCreator13](UnzipWithApply$$UnzipWithCreator13.html)
- [UnzipWithCreator14](UnzipWithApply$$UnzipWithCreator14.html)
- [UnzipWithCreator15](UnzipWithApply$$UnzipWithCreator15.html)
- [UnzipWithCreator16](UnzipWithApply$$UnzipWithCreator16.html)
- [UnzipWithCreator17](UnzipWithApply$$UnzipWithCreator17.html)
- [UnzipWithCreator18](UnzipWithApply$$UnzipWithCreator18.html)
- [UnzipWithCreator19](UnzipWithApply$$UnzipWithCreator19.html)
- [UnzipWithCreator2](UnzipWithApply$$UnzipWithCreator2.html)
- [UnzipWithCreator20](UnzipWithApply$$UnzipWithCreator20.html)
- [UnzipWithCreator21](UnzipWithApply$$UnzipWithCreator21.html)
- [UnzipWithCreator22](UnzipWithApply$$UnzipWithCreator22.html)
- [UnzipWithCreator3](UnzipWithApply$$UnzipWithCreator3.html)
- [UnzipWithCreator4](UnzipWithApply$$UnzipWithCreator4.html)
- [UnzipWithCreator5](UnzipWithApply$$UnzipWithCreator5.html)
- [UnzipWithCreator6](UnzipWithApply$$UnzipWithCreator6.html)
- [UnzipWithCreator7](UnzipWithApply$$UnzipWithCreator7.html)
- [UnzipWithCreator8](UnzipWithApply$$UnzipWithCreator8.html)
- [UnzipWithCreator9](UnzipWithApply$$UnzipWithCreator9.html)
- [UnzipWithCreatorObject10](UnzipWithApply$$UnzipWithCreatorObject10$.html)
- [UnzipWithCreatorObject11](UnzipWithApply$$UnzipWithCreatorObject11$.html)
- [UnzipWithCreatorObject12](UnzipWithApply$$UnzipWithCreatorObject12$.html)
- [UnzipWithCreatorObject13](UnzipWithApply$$UnzipWithCreatorObject13$.html)
- [UnzipWithCreatorObject14](UnzipWithApply$$UnzipWithCreatorObject14$.html)
- [UnzipWithCreatorObject15](UnzipWithApply$$UnzipWithCreatorObject15$.html)
- [UnzipWithCreatorObject16](UnzipWithApply$$UnzipWithCreatorObject16$.html)
- [UnzipWithCreatorObject17](UnzipWithApply$$UnzipWithCreatorObject17$.html)
- [UnzipWithCreatorObject18](UnzipWithApply$$UnzipWithCreatorObject18$.html)
- [UnzipWithCreatorObject19](UnzipWithApply$$UnzipWithCreatorObject19$.html)
- [UnzipWithCreatorObject2](UnzipWithApply$$UnzipWithCreatorObject2$.html)
- [UnzipWithCreatorObject20](UnzipWithApply$$UnzipWithCreatorObject20$.html)
- [UnzipWithCreatorObject21](UnzipWithApply$$UnzipWithCreatorObject21$.html)
- [UnzipWithCreatorObject22](UnzipWithApply$$UnzipWithCreatorObject22$.html)
- [UnzipWithCreatorObject3](UnzipWithApply$$UnzipWithCreatorObject3$.html)
- [UnzipWithCreatorObject4](UnzipWithApply$$UnzipWithCreatorObject4$.html)
- [UnzipWithCreatorObject5](UnzipWithApply$$UnzipWithCreatorObject5$.html)
- UnzipWithCreatorObject6
- [UnzipWithCreatorObject7](UnzipWithApply$$UnzipWithCreatorObject7$.html)
- [UnzipWithCreatorObject8](UnzipWithApply$$UnzipWithCreatorObject8$.html)
- [UnzipWithCreatorObject9](UnzipWithApply$$UnzipWithCreatorObject9$.html)
o[akka](../../index.html).[stream](../index.html).[scaladsl](index.html).[UnzipWithApply](UnzipWithApply$.html)

# UnzipWithCreatorObject6[**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html "Permalink")

### 

#### implicit  object UnzipWithCreatorObject6 extends [UnzipWithCreator6](UnzipWithApply$$UnzipWithCreator6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]

Source[UnzipWithApply.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/target/scala-2.13/src_managed/main/akka/stream/scaladsl/UnzipWithApply.scala#L55)Linear Supertypes[UnzipWithCreator6](UnzipWithApply$$UnzipWithCreator6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [UnzipWithCreator](UnzipWithApply$$UnzipWithCreator.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [UnzipWith6](UnzipWith6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnzipWithCreatorObject6
2. UnzipWithCreator6
3. UnzipWithCreator
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#create(unzipper:In=>(A1,A2,A3,A4,A5,A6)):akka.stream.scaladsl.UnzipWith6[In,A1,A2,A3,A4,A5,A6] "Permalink")  def create(unzipper: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))): [UnzipWith6](UnzipWith6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition Classes[UnzipWithCreator6](UnzipWithApply$$UnzipWithCreator6.html) → [UnzipWithCreator](UnzipWithApply$$UnzipWithCreator.html)
7. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [UnzipWithCreator6](UnzipWithApply$$UnzipWithCreator6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]

### Inherited from [UnzipWithCreator](UnzipWithApply$$UnzipWithCreator.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)), [UnzipWith6](UnzipWith6.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWith6.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator10.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator11.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator12.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator13.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator14.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator15.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator16.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator17.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator18.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator19.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator2.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator20.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator21.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator22.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator3.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator4.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator5.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator6.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator7.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator8.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreator9.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject10$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject11$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject12$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject13$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject14$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject15$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject16$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject17$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject18$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject19$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject2$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject20$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject21$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject22$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject3$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject4$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject5$.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/UnzipWithApply$$UnzipWithCreatorObject6$.html)*