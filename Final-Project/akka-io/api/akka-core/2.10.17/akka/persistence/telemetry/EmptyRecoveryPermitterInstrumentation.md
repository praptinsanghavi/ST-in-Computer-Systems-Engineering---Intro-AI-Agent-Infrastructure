---
description: Akka 2.10.17 - akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
title: Akka 2.10.17 - akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation
---

# Akka 2.10.17 - akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation

> **Summary:** Akka 2.10.17 - akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](index.html)Definition Classes[persistence](../index.html)
- [EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "INTERNAL API")
- EmptyRecoveryPermitterInstrumentation
- [EventsourcedEnsemble](EventsourcedEnsemble.html "INTERNAL API")
- [EventsourcedInstrumentation](EventsourcedInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [EventsourcedInstrumentationProvider](EventsourcedInstrumentationProvider.html "INTERNAL API")
- [RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "INTERNAL API")
- [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "INTERNAL API: Instrumentation SPI for PersistentActor.")
- [RecoveryPermitterInstrumentationProvider](RecoveryPermitterInstrumentationProvider.html "INTERNAL API")
[c](EmptyRecoveryPermitterInstrumentation$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[telemetry](index.html)

# [EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation$.html "See companion object")[**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html "Permalink")

### Companion [object EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation$.html "See companion object")

#### class EmptyRecoveryPermitterInstrumentation extends [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)

INTERNAL API

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)() Source[RecoveryPermitterInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/telemetry/RecoveryPermitterInstrumentation.scala#L58)Linear Supertypes[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EmptyRecoveryPermitterInstrumentation
2. RecoveryPermitterInstrumentation
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

1. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#<init>(system:akka.actor.ActorSystem):akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation "Permalink")  new EmptyRecoveryPermitterInstrumentation(system: [ActorSystem](../../actor/ActorSystem.html))
2. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#<init>():akka.persistence.telemetry.EmptyRecoveryPermitterInstrumentation "Permalink")  new EmptyRecoveryPermitterInstrumentation()
### Value Members

1. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toany2stringadd\[EmptyRecoveryPermitterInstrumentation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EmptyRecoveryPermitterInstrumentation, B)ImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toArrowAssoc\[EmptyRecoveryPermitterInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#dependencies:Seq[String] "Permalink")  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies

Definition ClassesEmptyRecoveryPermitterInstrumentation → [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)
9. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EmptyRecoveryPermitterInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EmptyRecoveryPermitterInstrumentationImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toEnsuring\[EmptyRecoveryPermitterInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EmptyRecoveryPermitterInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EmptyRecoveryPermitterInstrumentationImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toEnsuring\[EmptyRecoveryPermitterInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EmptyRecoveryPermitterInstrumentationImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toEnsuring\[EmptyRecoveryPermitterInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EmptyRecoveryPermitterInstrumentationImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toEnsuring\[EmptyRecoveryPermitterInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#recoveryPermitterStatus(recoveryPermitter:akka.actor.ActorRef,maxPermits:Int,usedPermits:Int,pendingActors:Int):Unit "Permalink")  def recoveryPermitterStatus(recoveryPermitter: [ActorRef](../../actor/ActorRef.html), maxPermits: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), usedPermits: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pendingActors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Record recovery permitter status \- invoked after an actor has requested a permit.

Record recovery permitter status \- invoked after an actor has requested a permit.

recoveryPermitter`ActorRef` handling the permits for this actor
 system.

maxPermitsthe max permits set (via configuration).

usedPermitsthe number of used (issued) permits.

pendingActorsnumber of pending actors waiting for a permit.

Definition ClassesEmptyRecoveryPermitterInstrumentation → [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)
22. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toStringFormat\[EmptyRecoveryPermitterInstrumentation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EmptyRecoveryPermitterInstrumentation, B)ImplicitThis member is added by an implicit conversion from EmptyRecoveryPermitterInstrumentation toArrowAssoc\[EmptyRecoveryPermitterInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEmptyRecoveryPermitterInstrumentation to any2stringadd\[EmptyRecoveryPermitterInstrumentation]

### Inherited by implicit conversion StringFormat fromEmptyRecoveryPermitterInstrumentation to StringFormat\[EmptyRecoveryPermitterInstrumentation]

### Inherited by implicit conversion Ensuring fromEmptyRecoveryPermitterInstrumentation to Ensuring\[EmptyRecoveryPermitterInstrumentation]

### Inherited by implicit conversion ArrowAssoc fromEmptyRecoveryPermitterInstrumentation to ArrowAssoc\[EmptyRecoveryPermitterInstrumentation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html)*