---
description: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html
title: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings
---

# Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings

> **Summary:** Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html "Permalink")  object [EventSourcedProducerQueue](EventSourcedProducerQueue$.html "DurableProducerQueue that can be used with akka.actor.typed.delivery.ProducerController for reliable delivery of messages.")DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages.

DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages. It is implemented with Event Sourcing and stores one
event before sending the message to the destination and one event for the confirmation
that the message has been delivered and processed.

The DurableProducerQueue.LoadState request is used at startup to retrieve the unconfirmed messages.

Definition Classes[delivery](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- Settings
[c](EventSourcedProducerQueue$$Settings$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[delivery](index.html).[EventSourcedProducerQueue](EventSourcedProducerQueue$.html)

# [Settings](EventSourcedProducerQueue$$Settings$.html "See companion object")[**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html "Permalink")

### Companion [object Settings](EventSourcedProducerQueue$$Settings$.html "See companion object")

#### final  class Settings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[EventSourcedProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/delivery/EventSourcedProducerQueue.scala#L78)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Settings toany2stringadd\[Settings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#cleanupUnusedAfter:scala.concurrent.duration.FiniteDuration "Permalink")  val cleanupUnusedAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
8. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#deleteEvents:Boolean "Permalink")  val deleteEvents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#getCleanupUnusedAfter():java.time.Duration "Permalink")  def getCleanupUnusedAfter(): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Java API
18. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#getRestartMaxBackoff():java.time.Duration "Permalink")  def getRestartMaxBackoff(): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Java API
19. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#journalPluginId:String "Permalink")  val journalPluginId: String
22. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#keepNSnapshots:Int "Permalink")  val keepNSnapshots: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#restartMaxBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  val restartMaxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
27. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#snapshotEvery:Int "Permalink")  val snapshotEvery: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
28. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#snapshotPluginId:String "Permalink")  val snapshotPluginId: String
29. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesSettings → AnyRef → Any
31. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withCleanupUnusedAfter(newCleanupUnusedAfter:java.time.Duration):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withCleanupUnusedAfter(newCleanupUnusedAfter: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): SettingsJava API
35. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withCleanupUnusedAfter(newCleanupUnusedAfter:scala.concurrent.duration.FiniteDuration):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withCleanupUnusedAfter(newCleanupUnusedAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): SettingsScala API
36. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withDeleteEvents(newDeleteEvents:Boolean):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withDeleteEvents(newDeleteEvents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Settings
37. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withJournalPluginId(id:String):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withJournalPluginId(id: String): Settings
38. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withKeepNSnapshots(newKeepNSnapshots:Int):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withKeepNSnapshots(newKeepNSnapshots: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Settings
39. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withRestartMaxBackoff(newRestartMaxBackoff:java.time.Duration):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withRestartMaxBackoff(newRestartMaxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): SettingsJava API
40. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withRestartMaxBackoff(newRestartMaxBackoff:scala.concurrent.duration.FiniteDuration):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withRestartMaxBackoff(newRestartMaxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): SettingsScala API
41. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withSnapshotEvery(newSnapshotEvery:Int):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withSnapshotEvery(newSnapshotEvery: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Settings
42. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#withSnapshotPluginId(id:String):akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings "Permalink")  def withSnapshotPluginId(id: String): Settings
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Settings toStringFormat\[Settings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSettings to any2stringadd\[Settings]

### Inherited by implicit conversion StringFormat fromSettings to StringFormat\[Settings]

### Inherited by implicit conversion Ensuring fromSettings to Ensuring\[Settings]

### Inherited by implicit conversion ArrowAssoc fromSettings to ArrowAssoc\[Settings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html)*