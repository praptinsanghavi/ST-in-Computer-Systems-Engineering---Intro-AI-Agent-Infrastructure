---
description: Akka 2.9.8 - akka.persistence.typed.state.scaladsl.Effect
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
title: Akka 2.9.8 - akka.persistence.typed.state.scaladsl.Effect
---

# Akka 2.9.8 - akka.persistence.typed.state.scaladsl.Effect

> **Summary:** Akka 2.9.8 - akka.persistence.typed.state.scaladsl.Effect

## Content

Akka2\.9\.8 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Define these handlers in the DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [DurableStateBehavior](DurableStateBehavior.html "Further customization of the DurableStateBehavior can be done with the methods defined here.")
- Effect
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
[t](Effect$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[scaladsl](index.html)

# [Effect](Effect$.html "See companion object")[**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html "Permalink")

### Companion [object Effect](Effect$.html "See companion object")

#### trait Effect\[\+State] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

A command handler returns an `Effect` directive that defines what state to persist.

Instances are created through the factories in the Effect companion object.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[Effect.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/scaladsl/Effect.scala#L114)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Known Subclasses[EffectBuilder](EffectBuilder.html), [ReplyEffect](ReplyEffect.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Effect
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

1. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Effect\[State] toany2stringadd\[Effect\[State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Effect\[State], B)ImplicitThis member is added by an implicit conversion from Effect\[State] toArrowAssoc\[Effect\[State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Effect\[State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): Effect\[State]ImplicitThis member is added by an implicit conversion from Effect\[State] toEnsuring\[Effect\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Effect\[State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): Effect\[State]ImplicitThis member is added by an implicit conversion from Effect\[State] toEnsuring\[Effect\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): Effect\[State]ImplicitThis member is added by an implicit conversion from Effect\[State] toEnsuring\[Effect\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): Effect\[State]ImplicitThis member is added by an implicit conversion from Effect\[State] toEnsuring\[Effect\[State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Effect\[State] toStringFormat\[Effect\[State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/scaladsl/Effect.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Effect\[State], B)ImplicitThis member is added by an implicit conversion from Effect\[State] toArrowAssoc\[Effect\[State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEffect\[State] to any2stringadd\[Effect\[State]]

### Inherited by implicit conversion StringFormat fromEffect\[State] to StringFormat\[Effect\[State]]

### Inherited by implicit conversion Ensuring fromEffect\[State] to Ensuring\[Effect\[State]]

### Inherited by implicit conversion ArrowAssoc fromEffect\[State] to ArrowAssoc\[Effect\[State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.9/akka/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.9/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/Effect.html)*