---
description: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:48:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
title: Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue
---

# Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue

> **Summary:** Akka 2.10.17 - akka.persistence.typed.delivery.EventSourcedProducerQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](index.html)Definition Classes[typed](../index.html)
- EventSourcedProducerQueue
o[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[delivery](index.html)

# EventSourcedProducerQueue[**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html "Permalink")

### 

#### object EventSourcedProducerQueue

DurableProducerQueue that can be used with [akka.actor.typed.delivery.ProducerController](../../../actor/typed/delivery/ProducerController$.html)
for reliable delivery of messages. It is implemented with Event Sourcing and stores one
event before sending the message to the destination and one event for the confirmation
that the message has been delivered and processed.

The DurableProducerQueue.LoadState request is used at startup to retrieve the unconfirmed messages.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[EventSourcedProducerQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/delivery/EventSourcedProducerQueue.scala#L36)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedProducerQueue
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html "Permalink") final  class [Settings](EventSourcedProducerQueue$$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#apply[A](persistenceId:akka.persistence.typed.PersistenceId,settings:akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]] "Permalink")  def apply\[A](persistenceId: [PersistenceId](../PersistenceId.html), settings: [Settings](EventSourcedProducerQueue$$Settings.html)): [Behavior](../../../actor/typed/Behavior.html)\[[Command](../../../actor/typed/delivery/DurableProducerQueue$$Command.html)\[A]]
5. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#apply[A](persistenceId:akka.persistence.typed.PersistenceId):akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]] "Permalink")  def apply\[A](persistenceId: [PersistenceId](../PersistenceId.html)): [Behavior](../../../actor/typed/Behavior.html)\[[Command](../../../actor/typed/delivery/DurableProducerQueue$$Command.html)\[A]]
6. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#create[A](persistenceId:akka.persistence.typed.PersistenceId,settings:akka.persistence.typed.delivery.EventSourcedProducerQueue.Settings):akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]] "Permalink")  def create\[A](persistenceId: [PersistenceId](../PersistenceId.html), settings: [Settings](EventSourcedProducerQueue$$Settings.html)): [Behavior](../../../actor/typed/Behavior.html)\[[Command](../../../actor/typed/delivery/DurableProducerQueue$$Command.html)\[A]]Java API
9. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#create[A](persistenceId:akka.persistence.typed.PersistenceId):akka.actor.typed.Behavior[akka.actor.typed.delivery.DurableProducerQueue.Command[A]] "Permalink")  def create\[A](persistenceId: [PersistenceId](../PersistenceId.html)): [Behavior](../../../actor/typed/Behavior.html)\[[Command](../../../actor/typed/delivery/DurableProducerQueue$$Command.html)\[A]]Java API
10. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html "Permalink")  object [Settings](EventSourcedProducerQueue$$Settings$.html)
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/delivery/EventSourcedProducerQueue$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/DurableProducerQueue$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/delivery/ProducerController$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/EventSourcedProducerQueue$$Settings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/EventSourcedProducerQueue$.html)*