---
description: Akka 2.10.17 - akka.actor.typed.javadsl.AbstractOnMessageBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.AbstractOnMessageBehavior
---

# Akka 2.10.17 - akka.actor.typed.javadsl.AbstractOnMessageBehavior

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.AbstractOnMessageBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- AbstractOnMessageBehavior
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html)

# AbstractOnMessageBehavior[**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html "Permalink")

### 

#### abstract  class AbstractOnMessageBehavior\[T] extends [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]

An actor `Behavior` can be implemented by extending this class and implementing the abstract
method [AbstractOnMessageBehavior\#onMessage](#onMessage(message:T):akka.actor.typed.Behavior[T]). Mutable state can be defined as instance
variables of the class.

This is an object\-oriented style of defining a `Behavior`. A more functional style alternative
is provided by the factory methods in [Behaviors](Behaviors$.html), for example [Behaviors.receiveMessage](Behaviors$.html#receiveMessage[T](onMessage:akka.japi.Function[T,akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]).

An alternative object\-oriented style is found in [AbstractBehavior](AbstractBehavior.html), which uses builders to
define the `Behavior`. In contrast to extending [AbstractBehavior](AbstractBehavior.html), extending this class
should have reduced overhead, though depending on the complexity of the protocol handled by
this actor and on the Java version in use, the `onMessage` and `onSignal` methods may be overly
complex.

Instances of this behavior should be created via [Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T]) and the [ActorContext](ActorContext.html) should
be passed as a constructor parameter from the factory function. This is important because a new
instance should be created when restart supervision is used.

When switching behavior to another behavior which requires a context, the original `ActorContext` can
be used or a `Behaviors.setup` can be used: either will end up using the same `ActorContext` instance.

It must not be created with an `ActorContext` of another actor (e.g. the parent actor). Doing so
will be detected at runtime and throw an `IllegalStateException` when the first message is received.

Source[AbstractOnMessageBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/AbstractOnMessageBehavior.scala#L35)See also[Behaviors.setup](Behaviors$.html#setup[T](factory:akka.japi.function.Function[akka.actor.typed.javadsl.ActorContext[T],akka.actor.typed.Behavior[T]]):akka.actor.typed.Behavior[T])

Linear Supertypes[ExtensibleBehavior](../ExtensibleBehavior.html)\[T], [Behavior](../Behavior.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractOnMessageBehavior
2. ExtensibleBehavior
3. Behavior
4. AnyRef
5. Any
Implicitly  
1. by BehaviorDecorators
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#<init>(context:akka.actor.typed.javadsl.ActorContext[T]):akka.actor.typed.javadsl.AbstractOnMessageBehavior[T] "Permalink")  new AbstractOnMessageBehavior(context: [ActorContext](ActorContext.html)\[T])
### Abstract Value Members

1. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#onMessage(message:T):akka.actor.typed.Behavior[T] "Permalink") abstract  def onMessage(message: T): [Behavior](../Behavior.html)\[T]Implement this to define how messages are processed.

Implement this to define how messages are processed. To indicate no change in behavior beyond
changes due to updating instance variables of this class, one may return either `this` or [Behaviors.same](Behaviors$.html#same[T]:akka.actor.typed.Behavior[T]).

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toany2stringadd\[AbstractOnMessageBehavior\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractOnMessageBehavior\[T], B)ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toArrowAssoc\[AbstractOnMessageBehavior\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../Behavior.html)\[T]ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] to[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../Behavior$.html).Definition Classes[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)
8. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractOnMessageBehavior\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractOnMessageBehavior\[T]ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toEnsuring\[AbstractOnMessageBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractOnMessageBehavior\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractOnMessageBehavior\[T]ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toEnsuring\[AbstractOnMessageBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractOnMessageBehavior\[T]ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toEnsuring\[AbstractOnMessageBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractOnMessageBehavior\[T]ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toEnsuring\[AbstractOnMessageBehavior\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#getContext:akka.actor.typed.javadsl.ActorContext[T] "Permalink") final  def getContext: [ActorContext](ActorContext.html)\[T]Attributesprotected
17. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: T]: [Behavior](../Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../Behavior.html)
20. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#onSignal(signal:akka.actor.typed.Signal):akka.actor.typed.Behavior[T] "Permalink")  def onSignal(signal: [Signal](../Signal.html)): [Behavior](../Behavior.html)\[T]Override this to handle a signal.

Override this to handle a signal. The default implementation handles only `MessageAdaptionFailure` and
otherwise ignores the signal.

Annotations@throws(classOf\[Exception])
24. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#receive(ctx:akka.actor.typed.TypedActorContext[T],msg:T):akka.actor.typed.Behavior[T] "Permalink") final  def receive(ctx: [TypedActorContext](../TypedActorContext.html)\[T], msg: T): [Behavior](../Behavior.html)\[T]Process an incoming message and return the next behavior.

Process an incoming message and return the next behavior.

The returned behavior can in addition to normal behaviors be one of the
canned special objects:

 \* returning `stopped` will terminate this Behavior
 \* returning `same` designates to reuse the current Behavior
 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled

Code calling this method should use [Behavior$](../Behavior$.html) `canonicalize` to replace
the special objects with real Behaviors.

Definition ClassesAbstractOnMessageBehavior → [ExtensibleBehavior](../ExtensibleBehavior.html)Annotations@throws(classOf\[Exception])
25. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#receiveSignal(ctx:akka.actor.typed.TypedActorContext[T],signal:akka.actor.typed.Signal):akka.actor.typed.Behavior[T] "Permalink") final  def receiveSignal(ctx: [TypedActorContext](../TypedActorContext.html)\[T], signal: [Signal](../Signal.html)): [Behavior](../Behavior.html)\[T]Process an incoming [Signal](../Signal.html) and return the next behavior.

Process an incoming [Signal](../Signal.html) and return the next behavior. This means
that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
can initiate a behavior change.

The returned behavior can in addition to normal behaviors be one of the
canned special objects:

 \* returning `stopped` will terminate this Behavior
 \* returning `same` designates to reuse the current Behavior
 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled

Code calling this method should use [Behavior$](../Behavior$.html) `canonicalize` to replace
the special objects with real Behaviors.

Definition ClassesAbstractOnMessageBehavior → [ExtensibleBehavior](../ExtensibleBehavior.html)Annotations@throws(classOf\[Exception])
26. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy.

Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy. Signals are not transformed.

Example:

```
val b: Behavior[Number] =
  Behaviors
    .receive[String] { (ctx, msg) =>
      println(msg)
      Behaviors.same
    }
    .transformMessages[Number] {
      case b: BigDecimal => s"BigDecimal(&dollar;b)"
      case i: BigInt     => s"BigInteger(&dollar;i)"
      // all other kinds of Number will be `unhandled`
    }
```
The `ClassTag` for `Outer` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass
the interceptor and be continue to the inner behavior untouched.

ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] to[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../Behavior$.html).Definition Classes[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)
29. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toStringFormat\[AbstractOnMessageBehavior\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/javadsl/AbstractOnMessageBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractOnMessageBehavior\[T], B)ImplicitThis member is added by an implicit conversion from AbstractOnMessageBehavior\[T] toArrowAssoc\[AbstractOnMessageBehavior\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ExtensibleBehavior](../ExtensibleBehavior.html)\[T]

### Inherited from [Behavior](../Behavior.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromAbstractOnMessageBehavior\[T] to [BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T]

### Inherited by implicit conversion any2stringadd fromAbstractOnMessageBehavior\[T] to any2stringadd\[AbstractOnMessageBehavior\[T]]

### Inherited by implicit conversion StringFormat fromAbstractOnMessageBehavior\[T] to StringFormat\[AbstractOnMessageBehavior\[T]]

### Inherited by implicit conversion Ensuring fromAbstractOnMessageBehavior\[T] to Ensuring\[AbstractOnMessageBehavior\[T]]

### Inherited by implicit conversion ArrowAssoc fromAbstractOnMessageBehavior\[T] to ArrowAssoc\[AbstractOnMessageBehavior\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html)*