---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.StashBuffer
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/StashBuffer.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.StashBuffer
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.StashBuffer

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.StashBuffer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).

Definition Classes[scaladsl](index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- StashBuffer
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# StashBuffer[**](../../../../akka/actor/typed/scaladsl/StashBuffer.html "Permalink")

### 

#### trait StashBuffer\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A non thread safe mutable message buffer that can be used to buffer messages inside actors
and then unstash them.

The buffer can hold at most the given `capacity` number of messages.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[StashBuffer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/StashBuffer.scala#L35)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StashBuffer
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
### Abstract Value Members

1. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#capacity:Int "Permalink") abstract  def capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)What is the capacity of this buffer.

What is the capacity of this buffer.

returnsthe capacity of this buffer
2. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#clear():Unit "Permalink") abstract  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes all messages from the buffer.
3. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#contains[U>:T](message:U):Boolean "Permalink") abstract  def contains\[U \>: T](message: U): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Tests whether this StashBuffer contains a given message.

Tests whether this StashBuffer contains a given message.

messagethe message to test

returnstrue if the buffer contains the message, false otherwise.
4. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#exists(predicate:T=>Boolean):Boolean "Permalink") abstract  def exists(predicate: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Tests whether a predicate holds for at least one element of this StashBuffer.

Tests whether a predicate holds for at least one element of this StashBuffer.

predicatethe predicate used to test

returnstrue if the predicate holds for at least one message, false otherwise.
5. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#foreach(f:T=>Unit):Unit "Permalink") abstract  def foreach(f: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Iterate over all elements of the buffer and apply a function to each element,
without removing them.

Iterate over all elements of the buffer and apply a function to each element,
without removing them.

fthe function to apply to each element
6. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#head:T "Permalink") abstract  def head: TReturn the first element of the message buffer without removing it.

Return the first element of the message buffer without removing it.

returnsthe first element or throws `NoSuchElementException` if the buffer is empty

Exceptions thrown``NoSuchElementException`` if the buffer is empty
7. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#isEmpty:Boolean "Permalink") abstract  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the message buffer is empty.

Check if the message buffer is empty.

returnsif the buffer is empty
8. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#isFull:Boolean "Permalink") abstract  def isFull: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returns`true` if no more messages can be added, i.e. size equals the capacity of the stash buffer
9. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#nonEmpty:Boolean "Permalink") abstract  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the message buffer is not empty.

Check if the message buffer is not empty.

returnsif the buffer is not empty
10. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#size:Int "Permalink") abstract  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)How many elements are in the message buffer.

How many elements are in the message buffer.

returnsthe number of elements in the message buffer
11. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#stash(message:T):akka.actor.typed.scaladsl.StashBuffer[T] "Permalink") abstract  def stash(message: T): StashBuffer\[T]Add one element to the end of the message buffer.

Add one element to the end of the message buffer.

messagethe message to buffer

returnsthis message buffer

Exceptions thrown[``StashOverflowException``](StashOverflowException.html) is thrown if the buffer [StashBuffer\#isFull](#isFull:Boolean).
12. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#unstash(behavior:akka.actor.typed.Behavior[T],numberOfMessages:Int,wrap:T=>T):akka.actor.typed.Behavior[T] "Permalink") abstract  def unstash(behavior: [Behavior](../Behavior.html)\[T], numberOfMessages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), wrap: (T) \=\> T): [Behavior](../Behavior.html)\[T]Transition to the given `behavior` and process `numberOfMessages` of the stashed messages.

Transition to the given `behavior` and process `numberOfMessages` of the stashed messages.
The messages will be processed in the same order they arrived.

The purpose of this method, compared to `unstashAll` is to unstash a limited
number of messages and then send a message to `self` before continuing unstashing
more. That means that other new messages may arrive in\-between and those must
be stashed to keep the original order of messages. To differentiate between
unstashed and new incoming messages the unstashed messages can be wrapped
in another message with the `wrap`.

If an exception is thrown by processing a message a proceeding messages
and the message causing the exception have been removed from the
`StashBuffer`, but unprocessed messages remain.

It's allowed to stash messages while unstashing. Those newly added
messages will not be processed by this call and have to be unstashed
in another call.

The `behavior` passed to `unstash` must not be `unhandled`.
13. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#unstashAll(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "Permalink") abstract  def unstashAll(behavior: [Behavior](../Behavior.html)\[T]): [Behavior](../Behavior.html)\[T]Transition to the given `behavior` and process all stashed messages.

Transition to the given `behavior` and process all stashed messages.
Messages will be processed in the same order they arrived.
The `StashBuffer` will be empty after processing all messages,
unless an exception is thrown or messages are stashed while unstashing.

If an exception is thrown by processing a message a proceeding messages
and the message causing the exception have been removed from the
`StashBuffer`, but unprocessed messages remain.

It's allowed to stash messages while unstashing. Those newly added
messages will not be processed by this call and have to be unstashed
in another call.

The `behavior` passed to `unstashAll` must not be `unhandled`.
### Concrete Value Members

1. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StashBuffer\[T] toany2stringadd\[StashBuffer\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StashBuffer\[T], B)ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toArrowAssoc\[StashBuffer\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StashBuffer\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StashBuffer\[T]ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toEnsuring\[StashBuffer\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StashBuffer\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StashBuffer\[T]ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toEnsuring\[StashBuffer\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StashBuffer\[T]ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toEnsuring\[StashBuffer\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StashBuffer\[T]ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toEnsuring\[StashBuffer\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StashBuffer\[T] toStringFormat\[StashBuffer\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/scaladsl/StashBuffer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StashBuffer\[T], B)ImplicitThis member is added by an implicit conversion from StashBuffer\[T] toArrowAssoc\[StashBuffer\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStashBuffer\[T] to any2stringadd\[StashBuffer\[T]]

### Inherited by implicit conversion StringFormat fromStashBuffer\[T] to StringFormat\[StashBuffer\[T]]

### Inherited by implicit conversion Ensuring fromStashBuffer\[T] to Ensuring\[StashBuffer\[T]]

### Inherited by implicit conversion ArrowAssoc fromStashBuffer\[T] to ArrowAssoc\[StashBuffer\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html)*