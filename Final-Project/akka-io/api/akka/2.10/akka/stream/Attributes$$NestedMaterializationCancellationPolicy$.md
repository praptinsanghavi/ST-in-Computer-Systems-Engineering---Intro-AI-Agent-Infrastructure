---
description: Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:55:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
title: Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy
---

# Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.NestedMaterializationCancellationPolicy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [AsyncBoundary](Attributes$$AsyncBoundary$.html)
- [Attribute](Attributes$$Attribute.html)
- [CancellationStrategy](Attributes$$CancellationStrategy.html "Cancellation strategies provide a way to configure the behavior of a stage when cancelStage is called.")
- [InputBuffer](Attributes$$InputBuffer.html "Each asynchronous piece of a materialized stream topology is executed by one Actor that manages an input buffer for all inlets of its shape.")
- [LogLevels](Attributes$$LogLevels.html)
- [MandatoryAttribute](Attributes$$MandatoryAttribute.html "Attributes that are always present (is defined with default values by the materializer)")
- [Name](Attributes$$Name.html)
- [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow.")
- [SourceLocation](Attributes$$SourceLocation.html "Attribute that contains the source location of for example a lambda passed to an operator, useful for example for debugging.")
[o](Attributes$$NestedMaterializationCancellationPolicy.html "See companion class")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "See companion class")[**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html "Permalink")

### Companion [class NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html "See companion class")

#### object NestedMaterializationCancellationPolicy

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L606)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NestedMaterializationCancellationPolicy
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#Default:akka.stream.Attributes.NestedMaterializationCancellationPolicy "Permalink")  val Default: [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html)Default [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html),
please see akka.stream.Attributes.NestedMaterializationCancellationPolicy.EagerCancellation() for details.
5. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#EagerCancellation:akka.stream.Attributes.NestedMaterializationCancellationPolicy "Permalink")  val EagerCancellation: [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html)A [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html) that configures graph stages
delaying nested flow materialization to cancel immediately when downstream cancels before
nested flow materialization.

A [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html) that configures graph stages
delaying nested flow materialization to cancel immediately when downstream cancels before
nested flow materialization.
This applies to [akka.stream.scaladsl.FlowOps.flatMapPrefix](scaladsl/FlowOps.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]), [akka.stream.scaladsl.Flow.futureFlow](scaladsl/Flow$.html#futureFlow[I,O,M](flow:scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]]) and derived operators.
6. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#PropagateToNested:akka.stream.Attributes.NestedMaterializationCancellationPolicy "Permalink")  val PropagateToNested: [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html)A [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html) that configures graph stages
delaying nested flow materialization to delay cancellation when downstream cancels before
nested flow materialization.

A [NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html) that configures graph stages
delaying nested flow materialization to delay cancellation when downstream cancels before
nested flow materialization. Once the nested flow is materialized it will be cancelled immediately.
This applies to [akka.stream.scaladsl.FlowOps.flatMapPrefix](scaladsl/FlowOps.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]), [akka.stream.scaladsl.Flow.futureFlow](scaladsl/Flow$.html#futureFlow[I,O,M](flow:scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]]) and derived operators.
7. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html](https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html)*