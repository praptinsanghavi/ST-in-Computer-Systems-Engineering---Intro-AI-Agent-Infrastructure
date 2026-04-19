---
description: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$CancellationStrategy$.html
title: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy
---

# Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy

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
[o](Attributes$$CancellationStrategy.html "See companion class")[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html)

# [CancellationStrategy](Attributes$$CancellationStrategy.html "See companion class")[**](../../akka/stream/Attributes$$CancellationStrategy$.html "Permalink")

### Companion [class CancellationStrategy](Attributes$$CancellationStrategy.html "See companion class")

#### object CancellationStrategy extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L412)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CancellationStrategy
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html "Permalink") final  case class [AfterDelay](Attributes$$CancellationStrategy$$AfterDelay.html "Strategy that allows to delay any action when cancelStage is invoked.")(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)) extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStrategy that allows to delay any action when `cancelStage` is invoked.

Strategy that allows to delay any action when `cancelStage` is invoked.

The idea of this strategy is to delay any action on cancellation because it is expected that the stage is completed
through another path in the meantime. The downside is that a stage and a stream may live longer than expected if no
such signal is received and cancellation is invoked later on. In streams with many stages that all apply this strategy,
this strategy might significantly delay the propagation of a cancellation signal because each upstream stage might impose
such a delay. During this time, the stream will be mostly "silent", i.e. it cannot make progress because of backpressure,
but you might still be able observe a long delay at the ultimate source.
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html "Permalink") sealed  trait [Strategy](Attributes$$CancellationStrategy$$Strategy.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$CancellationStrategy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#afterDelay(delay:java.time.Duration,strategy:akka.stream.Attributes.CancellationStrategy.Strategy):akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  def afterDelay(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)): [Strategy](Attributes$$CancellationStrategy$$Strategy.html)Java API

Java API

Strategy that allows to delay any action when `cancelStage` is invoked.

The idea of this strategy is to delay any action on cancellation because it is expected that the stage is completed
through another path in the meantime. The downside is that a stage and a stream may live longer than expected if no
such signal is received and cancellation is invoked later on. In streams with many stages that all apply this strategy,
this strategy might significantly delay the propagation of a cancellation signal because each upstream stage might impose
such a delay. During this time, the stream will be mostly "silent", i.e. it cannot make progress because of backpressure,
but you might still be able observe a long delay at the ultimate source.
5. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#completeStage:akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  def completeStage: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)Java API

Java API

Strategy that treats `cancelStage` the same as `completeStage`, i.e. all inlets are cancelled (propagating the
cancellation cause) and all outlets are regularly completed.

This used to be the default behavior before Akka 2\.6\.

This behavior can be problematic in stacks of BidiFlows where different layers of the stack are both connected
through inputs and outputs. In this case, an error in a doubly connected component triggers both a cancellation
going upstream and an error going downstream. Since the stack might be connected to those components with inlets and
outlets, a race starts whether the cancellation or the error arrives first. If the error arrives first, that's usually
good because then the error can be propagated both on inlets and outlets. However, if the cancellation arrives first,
the previous default behavior to complete the stage will lead other outputs to be completed regularly. The error
which arrive late at the other hand will just be ignored (that connection will have been cancelled already and also
the paths through which the error could propagates are already shut down).
8. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#failStage:akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  def failStage: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)Java API

Java API

Strategy that treats `cancelStage` the same as `failStage`, i.e. all inlets are cancelled (propagating the
cancellation cause) and all outlets are failed propagating the cause from cancellation.
11. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#propagateFailure:akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  def propagateFailure: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)Java API

Java API

Strategy that treats `cancelStage` in different ways depending on the cause that was given to the cancellation.

If the cause was a regular, active cancellation (`SubscriptionWithCancelException.NoMoreElementsNeeded`), the stage
receiving this cancellation is completed regularly.

If another cause was given, this is treated as an error and the behavior is the same as with `failStage`.

This is a good default strategy.
18. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/Attributes$$CancellationStrategy$$CompleteStage$.html "Permalink")  case object [CompleteStage](Attributes$$CancellationStrategy$$CompleteStage$.html "Strategy that treats cancelStage the same as completeStage, i.e.") extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStrategy that treats `cancelStage` the same as `completeStage`, i.e.

Strategy that treats `cancelStage` the same as `completeStage`, i.e. all inlets are cancelled (propagating the
cancellation cause) and all outlets are regularly completed.

This used to be the default behavior before Akka 2\.6\.

This behavior can be problematic in stacks of BidiFlows where different layers of the stack are both connected
through inputs and outputs. In this case, an error in a doubly connected component triggers both a cancellation
going upstream and an error going downstream. Since the stack might be connected to those components with inlets and
outlets, a race starts whether the cancellation or the error arrives first. If the error arrives first, that's usually
good because then the error can be propagated both on inlets and outlets. However, if the cancellation arrives first,
the previous default behavior to complete the stage will lead other outputs to be completed regularly. The error
which arrive late at the other hand will just be ignored (that connection will have been cancelled already and also
the paths through which the error could propagates are already shut down).
24. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html "Permalink")  case object [FailStage](Attributes$$CancellationStrategy$$FailStage$.html "Strategy that treats cancelStage the same as failStage, i.e.") extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStrategy that treats `cancelStage` the same as `failStage`, i.e.

Strategy that treats `cancelStage` the same as `failStage`, i.e. all inlets are cancelled (propagating the
cancellation cause) and all outlets are failed propagating the cause from cancellation.
25. [**](../../akka/stream/Attributes$$CancellationStrategy$$PropagateFailure$.html "Permalink")  case object [PropagateFailure](Attributes$$CancellationStrategy$$PropagateFailure$.html "Strategy that treats cancelStage in different ways depending on the cause that was given to the cancellation.") extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStrategy that treats `cancelStage` in different ways depending on the cause that was given to the cancellation.

Strategy that treats `cancelStage` in different ways depending on the cause that was given to the cancellation.

If the cause was a regular, active cancellation (`SubscriptionWithCancelException.NoMoreElementsNeeded`), the stage
receiving this cancellation is completed regularly.

If another cause was given, this is treated as an error and the behavior is the same as with `failStage`.

This is a good default strategy.
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$AsyncBoundary$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$CompleteStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$PropagateFailure$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$InputBuffer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$MandatoryAttribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Name.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$SourceLocation$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$SourceLocation.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html](https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html)*