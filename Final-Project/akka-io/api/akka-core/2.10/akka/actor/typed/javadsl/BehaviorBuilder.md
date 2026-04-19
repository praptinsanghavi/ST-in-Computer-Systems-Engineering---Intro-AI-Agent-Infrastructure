---
description: Akka 2.10.17 - akka.actor.typed.javadsl.BehaviorBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/BehaviorBuilder.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.BehaviorBuilder
---

# Akka 2.10.17 - akka.actor.typed.javadsl.BehaviorBuilder

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.BehaviorBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- BehaviorBuilder
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
[c](BehaviorBuilder$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html)

# [BehaviorBuilder](BehaviorBuilder$.html "See companion object")[**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html "Permalink")

### Companion [object BehaviorBuilder](BehaviorBuilder$.html "See companion object")

#### final  class BehaviorBuilder\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Immutable builder used for creating a [Behavior](../Behavior.html) by 'chaining' message and signal handlers.

When handling a message or signal, this [Behavior](../Behavior.html) will consider all handlers in the order they were added,
looking for the first handler for which both the type and the (optional) predicate match.

Akka `akka.japi.function` lambda types are used throughout to allow handlers to throw checked exceptions
(which will fail the actor).

Tthe common superclass of all supported messages.

Source[BehaviorBuilder.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/BehaviorBuilder.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorBuilder
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

1. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toany2stringadd\[BehaviorBuilder\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BehaviorBuilder\[T], B)ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toArrowAssoc\[BehaviorBuilder\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#build():akka.actor.typed.Behavior[T] "Permalink")  def build(): [Behavior](../Behavior.html)\[T]Build a Behavior from the current state of the builder
8. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BehaviorBuilder\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorBuilder\[T]ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toEnsuring\[BehaviorBuilder\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BehaviorBuilder\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorBuilder\[T]ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toEnsuring\[BehaviorBuilder\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorBuilder\[T]ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toEnsuring\[BehaviorBuilder\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorBuilder\[T]ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toEnsuring\[BehaviorBuilder\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onAnyMessage(handler:akka.japi.function.Function[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onAnyMessage(handler: [Function](../../../japi/function/Function.html)\[T, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the message handling matching any message.

Add a new case to the message handling matching any message. Subsequent `onMessage` clauses will
never see any messages.

handleraction to apply for any message

returnsa new behavior builder with the specified handling appended
22. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onMessage[M<:T](type:Class[M],test:akka.japi.function.Predicate[M],handler:akka.japi.function.Function[M,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onMessage\[M \<: T](type: Class\[M], test: [Predicate](../../../japi/function/Predicate.html)\[M], handler: [Function](../../../japi/function/Function.html)\[M, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new predicated case to the message handling.

Add a new predicated case to the message handling.

Mtype of message to match

typetype of message to match

testa predicate that will be evaluated on the argument if the type matches

handleraction to apply if the type matches and the predicate returns true

returnsa new behavior builder with the specified handling appended
23. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onMessage[M<:T](type:Class[M],handler:akka.japi.function.Function[M,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onMessage\[M \<: T](type: Class\[M], handler: [Function](../../../japi/function/Function.html)\[M, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the message handling.

Add a new case to the message handling.

Mtype of message to match

typetype of message to match

handleraction to apply if the type matches

returnsa new behavior builder with the specified handling appended
24. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onMessageEquals(msg:T,handler:akka.japi.function.Creator[akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onMessageEquals(msg: T, handler: [Creator](../../../japi/function/Creator.html)\[[Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the message handling matching equal messages.

Add a new case to the message handling matching equal messages.

msgthe message to compare to

handleraction to apply when the message matches

returnsa new behavior builder with the specified handling appended
25. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onMessageUnchecked[M<:T](type:Class[_<:T],handler:akka.japi.function.Function[M,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onMessageUnchecked\[M \<: T](type: Class\[\_ \<: T], handler: [Function](../../../japi/function/Function.html)\[M, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the message handling without compile time type check.

Add a new case to the message handling without compile time type check.

Should normally not be used, but when matching on class with generic type
argument it can be useful, e.g. `List.class` and `(List<String> list) -> {...}`

typetype of message to match

handleraction to apply when the type matches

returnsa new behavior builder with the specified handling appended
26. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onSignal[M<:akka.actor.typed.Signal](type:Class[M],test:akka.japi.function.Predicate[M],handler:akka.japi.function.Function[M,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onSignal\[M \<: [Signal](../Signal.html)](type: Class\[M], test: [Predicate](../../../japi/function/Predicate.html)\[M], handler: [Function](../../../japi/function/Function.html)\[M, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new predicated case to the signal handling.

Add a new predicated case to the signal handling.

Mtype of signal to match

typetype of signals to match

testa predicate that will be evaluated on the argument if the type matches

handleraction to apply if the type matches and the predicate returns true

returnsa new behavior builder with the specified handling appended
27. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onSignal[M<:akka.actor.typed.Signal](type:Class[M],handler:akka.japi.function.Function[M,akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onSignal\[M \<: [Signal](../Signal.html)](type: Class\[M], handler: [Function](../../../japi/function/Function.html)\[M, [Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the signal handling.

Add a new case to the signal handling.

Mtype of signal to match

typetype of signal to match

handleraction to apply if the type matches

returnsa new behavior builder with the specified handling appended
28. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#onSignalEquals(signal:akka.actor.typed.Signal,handler:akka.japi.function.Creator[akka.actor.typed.Behavior[T]]):akka.actor.typed.javadsl.BehaviorBuilder[T] "Permalink")  def onSignalEquals(signal: [Signal](../Signal.html), handler: [Creator](../../../japi/function/Creator.html)\[[Behavior](../Behavior.html)\[T]]): BehaviorBuilder\[T]Add a new case to the signal handling matching equal signals.

Add a new case to the signal handling matching equal signals.

signalthe signal to compare to

handleraction to apply when the message matches

returnsa new behavior builder with the specified handling appended
29. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toStringFormat\[BehaviorBuilder\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/javadsl/BehaviorBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BehaviorBuilder\[T], B)ImplicitThis member is added by an implicit conversion from BehaviorBuilder\[T] toArrowAssoc\[BehaviorBuilder\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBehaviorBuilder\[T] to any2stringadd\[BehaviorBuilder\[T]]

### Inherited by implicit conversion StringFormat fromBehaviorBuilder\[T] to StringFormat\[BehaviorBuilder\[T]]

### Inherited by implicit conversion Ensuring fromBehaviorBuilder\[T] to Ensuring\[BehaviorBuilder\[T]]

### Inherited by implicit conversion ArrowAssoc fromBehaviorBuilder\[T] to ArrowAssoc\[BehaviorBuilder\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Predicate.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.html)*