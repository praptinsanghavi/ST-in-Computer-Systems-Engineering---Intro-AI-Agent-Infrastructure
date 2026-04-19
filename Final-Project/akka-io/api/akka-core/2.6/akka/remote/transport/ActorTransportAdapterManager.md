---
description: Akka 2.6.21 - akka.remote.transport.ActorTransportAdapterManager
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/remote/transport/ActorTransportAdapterManager.html
title: Akka 2.6.21 - akka.remote.transport.ActorTransportAdapterManager
---

# Akka 2.6.21 - akka.remote.transport.ActorTransportAdapterManager

> **Summary:** Akka 2.6.21 - akka.remote.transport.ActorTransportAdapterManager

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/transport/index.html "Permalink")  package [transport](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/transport/netty/index.html "Permalink")  package [netty](netty/index.html)Definition Classes[transport](index.html)
- [AbstractTransportAdapter](AbstractTransportAdapter.html "An adapter that wraps a transport and provides interception")
- [AbstractTransportAdapterHandle](AbstractTransportAdapterHandle.html)
- [ActorTransportAdapter](ActorTransportAdapter.html)
- ActorTransportAdapterManager
- [AkkaProtocolException](AkkaProtocolException.html)
- [AssociationHandle](AssociationHandle.html "An SPI layer for abstracting over logical links (associations) created by a akka.remote.transport.Transport.")
- [AssociationRegistry](AssociationRegistry$.html)
- [FailureInjectorException](FailureInjectorException.html)
- [FailureInjectorProvider](FailureInjectorProvider.html)
- [HandshakeInfo](HandshakeInfo.html)
- [SchemeAugmenter](SchemeAugmenter.html)
- [TestAssociationHandle](TestAssociationHandle.html)
- [TestTransport](TestTransport.html "Transport implementation to be used for testing.")
- [ThrottlerProvider](ThrottlerProvider.html)
- [ThrottlerTransportAdapter](ThrottlerTransportAdapter.html)
- [Transport](Transport.html "An SPI layer for implementing asynchronous transport mechanisms.")
- [TransportAdapterProvider](TransportAdapterProvider.html)
- [TransportAdapters](TransportAdapters.html)
- [TransportAdaptersExtension](TransportAdaptersExtension$.html)
c[akka](../../index.html).[remote](../index.html).[transport](index.html)

# ActorTransportAdapterManager[**](../../../akka/remote/transport/ActorTransportAdapterManager.html "Permalink")

### 

#### abstract  class ActorTransportAdapterManager extends [Actor](../../actor/Actor.html) with [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html)]

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Classic remoting is deprecated, use Artery

Source[AbstractTransportAdapter.scala](https://github.com/akka/akka/tree/v2.6.21//akka-remote/src/main/scala/akka/remote/transport/AbstractTransportAdapter.scala#L205)Linear Supertypes[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html)], [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorTransportAdapterManager
2. RequiresMessageQueue
3. Actor
4. AnyRef
5. Any
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

1. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#<init>():akka.remote.transport.ActorTransportAdapterManager "Permalink")  new ActorTransportAdapterManager()
### Type Members

1. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Abstract Value Members

1. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ready:ActorTransportAdapterManager.this.Receive "Permalink") abstract  def ready: [Receive](#Receive=akka.actor.Actor.Receive)Attributesprotected
### Concrete Value Members

1. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toany2stringadd\[ActorTransportAdapterManager] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorTransportAdapterManager, B)ImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toArrowAssoc\[ActorTransportAdapterManager] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#associationListener:akka.remote.transport.Transport.AssociationEventListener "Permalink")  var associationListener: [AssociationEventListener](Transport$$AssociationEventListener.html)Attributesprotected
13. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
15. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorTransportAdapterManager) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ActorTransportAdapterManagerImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toEnsuring\[ActorTransportAdapterManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorTransportAdapterManager) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ActorTransportAdapterManagerImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toEnsuring\[ActorTransportAdapterManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): ActorTransportAdapterManagerImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toEnsuring\[ActorTransportAdapterManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): ActorTransportAdapterManagerImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toEnsuring\[ActorTransportAdapterManager] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#localAddress:akka.actor.Address "Permalink")  var localAddress: [Address](../../actor/Address.html)Attributesprotected
25. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#nextId():Long "Permalink")  def nextId(): [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)Attributesprotected
27. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
29. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
30. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
32. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#receive:ActorTransportAdapterManager.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesActorTransportAdapterManager → [Actor](../../actor/Actor.html)
34. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
35. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
36. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
37. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
40. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toStringFormat\[ActorTransportAdapterManager] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/transport/ActorTransportAdapterManager.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorTransportAdapterManager, B)ImplicitThis member is added by an implicit conversion from ActorTransportAdapterManager toArrowAssoc\[ActorTransportAdapterManager] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[UnboundedMessageQueueSemantics](../../dispatch/UnboundedMessageQueueSemantics.html)]

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorTransportAdapterManager to any2stringadd\[ActorTransportAdapterManager]

### Inherited by implicit conversion StringFormat fromActorTransportAdapterManager to StringFormat\[ActorTransportAdapterManager]

### Inherited by implicit conversion Ensuring fromActorTransportAdapterManager to Ensuring\[ActorTransportAdapterManager]

### Inherited by implicit conversion ArrowAssoc fromActorTransportAdapterManager to ArrowAssoc\[ActorTransportAdapterManager]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AbstractTransportAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AbstractTransportAdapterHandle.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ActorTransportAdapter$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ActorTransportAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AkkaProtocolException.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AssociationHandle$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AssociationHandle.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/AssociationRegistry$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/FailureInjectorException.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/FailureInjectorProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/HandshakeInfo$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/HandshakeInfo.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/SchemeAugmenter.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TestAssociationHandle.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TestTransport$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TestTransport.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ThrottlerProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ThrottlerTransportAdapter$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ThrottlerTransportAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/Transport$$AssociationEventListener.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/Transport$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/Transport.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TransportAdapterProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TransportAdapters.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/TransportAdaptersExtension$.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/netty/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html](https://doc.akka.io/api/akka-core/2.6/akka/remote/transport/ActorTransportAdapterManager.html)*