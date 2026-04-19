---
description: Akka 2.10.17 - akka.testkit.TestActors.ForwardActor
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:43:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActors$$ForwardActor.html
title: Akka 2.10.17 - akka.testkit.TestActors.ForwardActor
---

# Akka 2.10.17 - akka.testkit.TestActors.ForwardActor

> **Summary:** Akka 2.10.17 - akka.testkit.TestActors.ForwardActor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestActors$.html "Permalink")  object [TestActors](TestActors$.html "A collection of common actor patterns used in tests.")A collection of common actor patterns used in tests.

A collection of common actor patterns used in tests.

Definition Classes[testkit](index.html)
- [BlackholeActor](TestActors$$BlackholeActor.html "BlackholeActor does nothing for incoming messages, its like a blackhole.")
- [EchoActor](TestActors$$EchoActor.html "EchoActor sends back received messages (unmodified).")
- ForwardActor
c[akka](../index.html).[testkit](index.html).[TestActors](TestActors$.html)

# ForwardActor[**](../../akka/testkit/TestActors$$ForwardActor.html "Permalink")

### 

#### class ForwardActor extends [Actor](../actor/Actor.html)

ForwardActor forwards all messages as\-is to specified ActorRef.

Source[TestActors.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestActors.scala#L37)Linear Supertypes[Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ForwardActor
2. Actor
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

1. [**](../../akka/testkit/TestActors$$ForwardActor.html#<init>(ref:akka.actor.ActorRef):akka.testkit.TestActors.ForwardActor "Permalink")  new ForwardActor(ref: [ActorRef](../actor/ActorRef.html))reftarget ActorRef to forward messages to
### Type Members

1. [**](../../akka/testkit/TestActors$$ForwardActor.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Value Members

1. [**](../../akka/testkit/TestActors$$ForwardActor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActors$$ForwardActor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActors$$ForwardActor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ForwardActor toany2stringadd\[ForwardActor] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestActors$$ForwardActor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ForwardActor, B)ImplicitThis member is added by an implicit conversion from ForwardActor toArrowAssoc\[ForwardActor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestActors$$ForwardActor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestActors$$ForwardActor.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/testkit/TestActors$$ForwardActor.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/testkit/TestActors$$ForwardActor.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/testkit/TestActors$$ForwardActor.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/testkit/TestActors$$ForwardActor.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/testkit/TestActors$$ForwardActor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/testkit/TestActors$$ForwardActor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/testkit/TestActors$$ForwardActor.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
14. [**](../../akka/testkit/TestActors$$ForwardActor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ForwardActor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForwardActorImplicitThis member is added by an implicit conversion from ForwardActor toEnsuring\[ForwardActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/testkit/TestActors$$ForwardActor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ForwardActor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForwardActorImplicitThis member is added by an implicit conversion from ForwardActor toEnsuring\[ForwardActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/testkit/TestActors$$ForwardActor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForwardActorImplicitThis member is added by an implicit conversion from ForwardActor toEnsuring\[ForwardActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/testkit/TestActors$$ForwardActor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForwardActorImplicitThis member is added by an implicit conversion from ForwardActor toEnsuring\[ForwardActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/testkit/TestActors$$ForwardActor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/testkit/TestActors$$ForwardActor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/testkit/TestActors$$ForwardActor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/testkit/TestActors$$ForwardActor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/testkit/TestActors$$ForwardActor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/testkit/TestActors$$ForwardActor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/testkit/TestActors$$ForwardActor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/testkit/TestActors$$ForwardActor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/testkit/TestActors$$ForwardActor.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
27. [**](../../akka/testkit/TestActors$$ForwardActor.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
28. [**](../../akka/testkit/TestActors$$ForwardActor.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
29. [**](../../akka/testkit/TestActors$$ForwardActor.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
30. [**](../../akka/testkit/TestActors$$ForwardActor.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesForwardActor → [Actor](../actor/Actor.html)
31. [**](../../akka/testkit/TestActors$$ForwardActor.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
32. [**](../../akka/testkit/TestActors$$ForwardActor.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
33. [**](../../akka/testkit/TestActors$$ForwardActor.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
34. [**](../../akka/testkit/TestActors$$ForwardActor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../akka/testkit/TestActors$$ForwardActor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
36. [**](../../akka/testkit/TestActors$$ForwardActor.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
37. [**](../../akka/testkit/TestActors$$ForwardActor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/testkit/TestActors$$ForwardActor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../akka/testkit/TestActors$$ForwardActor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActors$$ForwardActor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestActors$$ForwardActor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ForwardActor toStringFormat\[ForwardActor] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestActors$$ForwardActor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ForwardActor, B)ImplicitThis member is added by an implicit conversion from ForwardActor toArrowAssoc\[ForwardActor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromForwardActor to any2stringadd\[ForwardActor]

### Inherited by implicit conversion StringFormat fromForwardActor to StringFormat\[ForwardActor]

### Inherited by implicit conversion Ensuring fromForwardActor to Ensuring\[ForwardActor]

### Inherited by implicit conversion ArrowAssoc fromForwardActor to ArrowAssoc\[ForwardActor]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$BlackholeActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$EchoActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$ForwardActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$ForwardActor.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActors$$ForwardActor.html)*