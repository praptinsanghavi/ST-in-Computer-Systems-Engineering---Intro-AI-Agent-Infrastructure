---
description: Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
title: Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider
---

# Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider

> **Summary:** Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[typed](../index.html)
- [DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "INTERNAL API")
- [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for DurableStateBehavior.")
- [DurableStateBehaviorInstrumentationProvider](DurableStateBehaviorInstrumentationProvider.html "INTERNAL API")
- [EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "INTERNAL API")
- [EmptyEventSourcedBehaviorInstrumentation](EmptyEventSourcedBehaviorInstrumentation.html "INTERNAL API")
- [EventSourcedBehaviorEnsemble](EventSourcedBehaviorEnsemble.html "INTERNAL API")
- [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "INTERNAL API: Instrumentation SPI for EventSourcedBehavior.")
- [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "INTERNAL API")
[o](EventSourcedBehaviorInstrumentationProvider.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[telemetry](index.html)

# [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "See companion class")[**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html "Permalink")

### Companion [class EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html "See companion class")

#### object EventSourcedBehaviorInstrumentationProvider extends [ExtensionId](../../../actor/typed/ExtensionId.html)\[[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)]

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[EventSourcedBehaviorInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.scala#L268)Linear Supertypes[ExtensionId](../../../actor/typed/ExtensionId.html)\[[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehaviorInstrumentationProvider
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../../../actor/typed/ExtensionId.html)
5. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider "Permalink")  def createExtension(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesEventSourcedBehaviorInstrumentationProvider → [ExtensionId](../../../actor/typed/ExtensionId.html)
8. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../actor/typed/ExtensionId.html) → AnyRef → Any
10. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider "Permalink")  def get(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)
11. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../actor/typed/ExtensionId.html) → AnyRef → Any
13. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../../../actor/typed/ExtensionId.html)\[[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../../../actor/typed/ExtensionId.html)
14. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../../../actor/typed/ExtensionId.html)\[[EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html)*