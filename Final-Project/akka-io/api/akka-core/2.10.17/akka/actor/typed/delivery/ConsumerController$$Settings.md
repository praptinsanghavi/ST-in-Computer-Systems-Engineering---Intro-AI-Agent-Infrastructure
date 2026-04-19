---
description: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:22:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/delivery/ConsumerController$$Settings.html
title: Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings
---

# Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings

> **Summary:** Akka 2.10.17 - akka.actor.typed.delivery.ConsumerController.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/delivery/ConsumerController$.html "Permalink")  object [ConsumerController](ConsumerController$.html "ConsumerController and ProducerController or WorkPullingProducerController are used together.")`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together.

`ConsumerController` and [ProducerController](ProducerController$.html) or [WorkPullingProducerController](WorkPullingProducerController$.html) are used
together. See the descriptions in those classes or the Akka reference documentation for
how they are intended to be used.

The destination consumer actor will start the flow by sending an initial [ConsumerController.Start](ConsumerController$$Start.html)
message to the `ConsumerController`. The `ActorRef` in the `Start` message is typically constructed
as a message adapter to map the [ConsumerController.Delivery](ConsumerController$$Delivery.html) to the protocol of the consumer actor.

Received messages from the producer are wrapped in [ConsumerController.Delivery](ConsumerController$$Delivery.html) when sent to the consumer,
which is supposed to reply with [ConsumerController.Confirmed](ConsumerController$$Confirmed.html) when it has processed the message.
Next message is not delivered until the previous is confirmed.
More messages from the producer that arrive while waiting for the confirmation are stashed by
the `ConsumerController` and delivered when previous message was confirmed.

The consumer and the `ConsumerController` actors are supposed to be local so that these messages are fast
and not lost. This is enforced by a runtime check.

The `ConsumerController` is automatically stopped when the consumer that registered with the `Start`
message is terminated.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [Command](ConsumerController$$Command.html)
- [Confirmed](ConsumerController$$Confirmed.html)
- [DeliverThenStop](ConsumerController$$DeliverThenStop.html)
- [Delivery](ConsumerController$$Delivery.html "Received messages from the producer are wrapped in Delivery when sent to the consumer.")
- [RegisterToProducerController](ConsumerController$$RegisterToProducerController.html "Register the ConsumerController to the given producerController.")
- [SequencedMessage](ConsumerController$$SequencedMessage.html "This is used between the ProducerController and ConsumerController.")
- Settings
- [Start](ConsumerController$$Start.html "Initial message from the consumer actor.")
[c](ConsumerController$$Settings$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[delivery](index.html).[ConsumerController](ConsumerController$.html)

# [Settings](ConsumerController$$Settings$.html "See companion object")[**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html "Permalink")

### Companion [object Settings](ConsumerController$$Settings$.html "See companion object")

#### final  class Settings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ConsumerController.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/delivery/ConsumerController.scala#L226)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
2. AnyRef
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
### Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Settings toany2stringadd\[Settings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#flowControlWindow:Int "Permalink")  val flowControlWindow: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
15. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#getResendIntervalMax():java.time.Duration "Permalink")  def getResendIntervalMax(): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Java API
17. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#onlyFlowControl:Boolean "Permalink")  val onlyFlowControl: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
23. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#resendIntervalMax:scala.concurrent.duration.FiniteDuration "Permalink")  val resendIntervalMax: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
24. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#resendIntervalMin:scala.concurrent.duration.FiniteDuration "Permalink")  val resendIntervalMin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
25. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesSettings → AnyRef → Any
27. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withFlowControlWindow(newFlowControlWindow:Int):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withFlowControlWindow(newFlowControlWindow: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Settings
31. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withOnlyFlowControl(newOnlyFlowControl:Boolean):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withOnlyFlowControl(newOnlyFlowControl: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Settings
32. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withResendIntervalMax(newResendIntervalMax:java.time.Duration):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withResendIntervalMax(newResendIntervalMax: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): SettingsJava API
33. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withResendIntervalMax(newResendIntervalMax:scala.concurrent.duration.FiniteDuration):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withResendIntervalMax(newResendIntervalMax: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): SettingsScala API
34. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withResendIntervalMin(newResendIntervalMin:java.time.Duration):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withResendIntervalMin(newResendIntervalMin: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): SettingsJava API
35. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#withResendIntervalMin(newResendIntervalMin:scala.concurrent.duration.FiniteDuration):akka.actor.typed.delivery.ConsumerController.Settings "Permalink")  def withResendIntervalMin(newResendIntervalMin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): SettingsScala API
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Settings toStringFormat\[Settings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/delivery/ConsumerController$$Settings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSettings to any2stringadd\[Settings]

### Inherited by implicit conversion StringFormat fromSettings to StringFormat\[Settings]

### Inherited by implicit conversion Ensuring fromSettings to Ensuring\[Settings]

### Inherited by implicit conversion ArrowAssoc fromSettings to ArrowAssoc\[Settings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Confirmed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Confirmed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$DeliverThenStop.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Delivery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Delivery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$RegisterToProducerController.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$SequencedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Start.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/WorkPullingProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController$$Settings.html)*