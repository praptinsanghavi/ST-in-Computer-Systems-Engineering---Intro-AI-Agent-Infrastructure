---
description: Akka 2.9.8 - akka.persistence.typed.state.scaladsl.ChangeEventHandler
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
title: Akka 2.9.8 - akka.persistence.typed.state.scaladsl.ChangeEventHandler
---

# Akka 2.9.8 - akka.persistence.typed.state.scaladsl.ChangeEventHandler

> **Summary:** Akka 2.9.8 - akka.persistence.typed.state.scaladsl.ChangeEventHandler

## Content

Akka2\.9\.8 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- ChangeEventHandler
- [DurableStateBehavior](DurableStateBehavior.html "Further customization of the DurableStateBehavior can be done with the methods defined here.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
[c](ChangeEventHandler$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[scaladsl](index.html)

# [ChangeEventHandler](ChangeEventHandler$.html "See companion object")[**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html "Permalink")

### Companion [object ChangeEventHandler](ChangeEventHandler$.html "See companion object")

#### final  class ChangeEventHandler\[Command, State, ChangeEvent] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

API May Change: Define these handlers in the [DurableStateBehavior\#withChangeEventHandler](DurableStateBehavior.html#withChangeEventHandler[ChangeEvent](handler:akka.persistence.typed.state.scaladsl.ChangeEventHandler[Command,State,ChangeEvent]):akka.persistence.typed.state.scaladsl.DurableStateBehavior[Command,State]) to store
additional change event when the state is updated. The event can be used in Projections.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[ChangeEventHandler.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/scaladsl/ChangeEventHandler.scala#L40)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ChangeEventHandler
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

1. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toany2stringadd\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ChangeEventHandler\[Command, State, ChangeEvent], B)ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toArrowAssoc\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#deleteHandler:(State,Command)=>ChangeEvent "Permalink")  val deleteHandler: (State, Command) \=\> ChangeEvent
9. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ChangeEventHandler\[Command, State, ChangeEvent]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): ChangeEventHandler\[Command, State, ChangeEvent]ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toEnsuring\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ChangeEventHandler\[Command, State, ChangeEvent]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): ChangeEventHandler\[Command, State, ChangeEvent]ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toEnsuring\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): ChangeEventHandler\[Command, State, ChangeEvent]ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toEnsuring\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): ChangeEventHandler\[Command, State, ChangeEvent]ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toEnsuring\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#updateHandler:(State,State,Command)=>ChangeEvent "Permalink")  val updateHandler: (State, State, Command) \=\> ChangeEvent
24. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toStringFormat\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/persistence/typed/state/scaladsl/ChangeEventHandler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ChangeEventHandler\[Command, State, ChangeEvent], B)ImplicitThis member is added by an implicit conversion from ChangeEventHandler\[Command, State, ChangeEvent] toArrowAssoc\[ChangeEventHandler\[Command, State, ChangeEvent]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromChangeEventHandler\[Command, State, ChangeEvent] to any2stringadd\[ChangeEventHandler\[Command, State, ChangeEvent]]

### Inherited by implicit conversion StringFormat fromChangeEventHandler\[Command, State, ChangeEvent] to StringFormat\[ChangeEventHandler\[Command, State, ChangeEvent]]

### Inherited by implicit conversion Ensuring fromChangeEventHandler\[Command, State, ChangeEvent] to Ensuring\[ChangeEventHandler\[Command, State, ChangeEvent]]

### Inherited by implicit conversion ArrowAssoc fromChangeEventHandler\[Command, State, ChangeEvent] to ArrowAssoc\[ChangeEventHandler\[Command, State, ChangeEvent]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/annotation/ApiMayChange.html
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
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html)*