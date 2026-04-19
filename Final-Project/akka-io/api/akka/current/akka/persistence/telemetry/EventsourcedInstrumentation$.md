---
description: Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:56:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/telemetry/EventsourcedInstrumentation$.html
title: Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation
---

# Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation

> **Summary:** Akka 2.10.17 - akka.persistence.telemetry.EventsourcedInstrumentation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[persistence](../index.html)
- [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "INTERNAL API")
- [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html "INTERNAL API")
- [EventsourcedEnsemble](EventsourcedEnsemble.html "INTERNAL API")
- [EventsourcedInstrumentation](EventsourcedInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "INTERNAL API")
- [RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "INTERNAL API")
- [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "INTERNAL API")
[o](EventsourcedInstrumentation.html "See companion trait")[akka](../../index.html).[persistence](../index.html).[telemetry](index.html)

# [EventsourcedInstrumentation](EventsourcedInstrumentation.html "See companion trait")[**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html "Permalink")

### Companion [trait EventsourcedInstrumentation](EventsourcedInstrumentation.html "See companion trait")

#### object EventsourcedInstrumentation

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[EventsourcedInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/telemetry/EventsourcedInstrumentation.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventsourcedInstrumentation
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#Context=AnyRef "Permalink")  type Context \= [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#EmptyContext:akka.persistence.telemetry.EventsourcedInstrumentation.Context "Permalink")  val EmptyContext: [Context](#Context=AnyRef)
5. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/telemetry/EventsourcedInstrumentation$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation$.html](https://doc.akka.io/api/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation$.html)*