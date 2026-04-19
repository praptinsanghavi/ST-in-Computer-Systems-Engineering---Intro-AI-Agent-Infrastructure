---
description: Akka 2.10.17 - akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
title: Akka 2.10.17 - akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider
---

# Akka 2.10.17 - akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider

> **Summary:** Akka 2.10.17 - akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider

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
- RecoveryPermitterInstrumentationProvider
[c](RecoveryPermitterInstrumentationProvider$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[telemetry](index.html)

# [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider$.html "See companion object")[**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html "Permalink")

### Companion [object RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider$.html "See companion object")

#### class RecoveryPermitterInstrumentationProvider extends [Extension](../../actor/Extension.html)

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[RecoveryPermitterInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/telemetry/RecoveryPermitterInstrumentation.scala#L110)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoveryPermitterInstrumentationProvider
2. Extension
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
### Instance Constructors

1. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.telemetry.RecoveryPermitterInstrumentationProvider "Permalink")  new RecoveryPermitterInstrumentationProvider(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toany2stringadd\[RecoveryPermitterInstrumentationProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RecoveryPermitterInstrumentationProvider, B)ImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toArrowAssoc\[RecoveryPermitterInstrumentationProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RecoveryPermitterInstrumentationProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoveryPermitterInstrumentationProviderImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toEnsuring\[RecoveryPermitterInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RecoveryPermitterInstrumentationProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoveryPermitterInstrumentationProviderImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toEnsuring\[RecoveryPermitterInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoveryPermitterInstrumentationProviderImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toEnsuring\[RecoveryPermitterInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoveryPermitterInstrumentationProviderImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toEnsuring\[RecoveryPermitterInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#instrumentation:akka.persistence.telemetry.RecoveryPermitterInstrumentation "Permalink")  val instrumentation: [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)
17. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toStringFormat\[RecoveryPermitterInstrumentationProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RecoveryPermitterInstrumentationProvider, B)ImplicitThis member is added by an implicit conversion from RecoveryPermitterInstrumentationProvider toArrowAssoc\[RecoveryPermitterInstrumentationProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRecoveryPermitterInstrumentationProvider to any2stringadd\[RecoveryPermitterInstrumentationProvider]

### Inherited by implicit conversion StringFormat fromRecoveryPermitterInstrumentationProvider to StringFormat\[RecoveryPermitterInstrumentationProvider]

### Inherited by implicit conversion Ensuring fromRecoveryPermitterInstrumentationProvider to Ensuring\[RecoveryPermitterInstrumentationProvider]

### Inherited by implicit conversion ArrowAssoc fromRecoveryPermitterInstrumentationProvider to ArrowAssoc\[RecoveryPermitterInstrumentationProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html)*