---
description: Akka 2.10.17 - akka.actor.testkit.typed.Effect.NoEffects
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/Effect$$NoEffects.html
title: Akka 2.10.17 - akka.actor.testkit.typed.Effect.NoEffects
---

# Akka 2.10.17 - akka.actor.testkit.typed.Effect.NoEffects

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.Effect.NoEffects

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/Effect$.html "Permalink")  object [Effect](Effect$.html)Definition Classes[typed](index.html)
- [AskInitiated](Effect$$AskInitiated.html "The behavior initiated an ask via its context.")
- [MessageAdapter](Effect$$MessageAdapter.html "The behavior create a message adapter for the messages of type clazz")
- NoEffects
- [ReceiveTimeoutCancelled](Effect$$ReceiveTimeoutCancelled.html)
- [ReceiveTimeoutSet](Effect$$ReceiveTimeoutSet.html "The behavior set a new receive timeout, with message as timeout notification")
- [Scheduled](Effect$$Scheduled.html "The behavior used context.scheduleOnce to schedule message to be sent to target after delay FIXME what about events scheduled through the scheduler?")
- [Spawned](Effect$$Spawned.html "The behavior spawned a named child with the given behavior (and optionally specific props)")
- [SpawnedAnonymous](Effect$$SpawnedAnonymous.html "The behavior spawned an anonymous child with the given behavior (and optionally specific props)")
- [Stopped](Effect$$Stopped.html "The behavior stopped childName")
- [TimerCancelled](Effect$$TimerCancelled.html)
- [TimerScheduled](Effect$$TimerScheduled.html)
- [Unwatched](Effect$$Unwatched.html "The behavior stopped watching other, through context.unwatch(other)")
- [Watched](Effect$$Watched.html "The behavior started watching other, through context.watch(other)")
- [WatchedWith](Effect$$WatchedWith.html "The behavior started watching other, through context.watchWith(other, message)")
[c](Effect$$NoEffects$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html).[Effect](Effect$.html)

# [NoEffects](Effect$$NoEffects$.html "See companion object")[**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html "Permalink")

### Companion [object NoEffects](Effect$$NoEffects$.html "See companion object")

#### sealed abstract  class NoEffects extends [Effect](Effect.html)

Used for NoEffects expectations by type

Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/Effect.scala#L302)Linear Supertypes[Effect](Effect.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NoEffects](Effect$$NoEffects$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NoEffects
2. Effect
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
### Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NoEffects toany2stringadd\[NoEffects] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NoEffects, B)ImplicitThis member is added by an implicit conversion from NoEffects toArrowAssoc\[NoEffects] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NoEffects) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoEffectsImplicitThis member is added by an implicit conversion from NoEffects toEnsuring\[NoEffects] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NoEffects) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoEffectsImplicitThis member is added by an implicit conversion from NoEffects toEnsuring\[NoEffects] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoEffectsImplicitThis member is added by an implicit conversion from NoEffects toEnsuring\[NoEffects] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoEffectsImplicitThis member is added by an implicit conversion from NoEffects toEnsuring\[NoEffects] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NoEffects toStringFormat\[NoEffects] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/testkit/typed/Effect$$NoEffects.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NoEffects, B)ImplicitThis member is added by an implicit conversion from NoEffects toArrowAssoc\[NoEffects] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Effect](Effect.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNoEffects to any2stringadd\[NoEffects]

### Inherited by implicit conversion StringFormat fromNoEffects to StringFormat\[NoEffects]

### Inherited by implicit conversion Ensuring fromNoEffects to Ensuring\[NoEffects]

### Inherited by implicit conversion ArrowAssoc fromNoEffects to ArrowAssoc\[NoEffects]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$AskInitiated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$MessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Scheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Spawned$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Spawned.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$SpawnedAnonymous$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$SpawnedAnonymous.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Stopped.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerCancelled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Unwatched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Watched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$WatchedWith.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects.html)*