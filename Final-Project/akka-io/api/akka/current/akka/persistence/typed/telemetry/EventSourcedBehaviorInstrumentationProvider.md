---
description: Akka 2.10.17 - akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html
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
- EventSourcedBehaviorInstrumentationProvider
[c](EventSourcedBehaviorInstrumentationProvider$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[telemetry](index.html)

# [EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider$.html "See companion object")[**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html "Permalink")

### Companion [object EventSourcedBehaviorInstrumentationProvider](EventSourcedBehaviorInstrumentationProvider$.html "See companion object")

#### class EventSourcedBehaviorInstrumentationProvider extends [Extension](../../../actor/typed/Extension.html)

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[EventSourcedBehaviorInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.scala#L278)Linear Supertypes[Extension](../../../actor/typed/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehaviorInstrumentationProvider
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

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentationProvider "Permalink")  new EventSourcedBehaviorInstrumentationProvider(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_])
### Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toany2stringadd\[EventSourcedBehaviorInstrumentationProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourcedBehaviorInstrumentationProvider, B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toArrowAssoc\[EventSourcedBehaviorInstrumentationProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorInstrumentationProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorInstrumentationProviderImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toEnsuring\[EventSourcedBehaviorInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorInstrumentationProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorInstrumentationProviderImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toEnsuring\[EventSourcedBehaviorInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorInstrumentationProviderImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toEnsuring\[EventSourcedBehaviorInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorInstrumentationProviderImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toEnsuring\[EventSourcedBehaviorInstrumentationProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#instrumentation:akka.persistence.typed.telemetry.EventSourcedBehaviorInstrumentation "Permalink")  val instrumentation: [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html)
17. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toStringFormat\[EventSourcedBehaviorInstrumentationProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourcedBehaviorInstrumentationProvider, B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorInstrumentationProvider toArrowAssoc\[EventSourcedBehaviorInstrumentationProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../../actor/typed/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventSourcedBehaviorInstrumentationProvider to any2stringadd\[EventSourcedBehaviorInstrumentationProvider]

### Inherited by implicit conversion StringFormat fromEventSourcedBehaviorInstrumentationProvider to StringFormat\[EventSourcedBehaviorInstrumentationProvider]

### Inherited by implicit conversion Ensuring fromEventSourcedBehaviorInstrumentationProvider to Ensuring\[EventSourcedBehaviorInstrumentationProvider]

### Inherited by implicit conversion ArrowAssoc fromEventSourcedBehaviorInstrumentationProvider to ArrowAssoc\[EventSourcedBehaviorInstrumentationProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Extension.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html)*