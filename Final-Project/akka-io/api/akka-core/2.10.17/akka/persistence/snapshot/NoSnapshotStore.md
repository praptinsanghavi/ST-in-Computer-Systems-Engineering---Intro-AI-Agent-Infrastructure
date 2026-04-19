---
description: Akka 2.10.17 - akka.persistence.snapshot.NoSnapshotStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/snapshot/NoSnapshotStore.html
title: Akka 2.10.17 - akka.persistence.snapshot.NoSnapshotStore
---

# Akka 2.10.17 - akka.persistence.snapshot.NoSnapshotStore

> **Summary:** Akka 2.10.17 - akka.persistence.snapshot.NoSnapshotStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/snapshot/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[snapshot](index.html)
- NoSnapshotStore
- [SnapshotStore](SnapshotStore.html "Abstract snapshot store.")
- [SnapshotStoreSpec](SnapshotStoreSpec.html "This spec aims to verify custom akka-persistence SnapshotStore implementations.")
c[akka](../../index.html).[persistence](../index.html).[snapshot](index.html)

# NoSnapshotStore[**](../../../akka/persistence/snapshot/NoSnapshotStore.html "Permalink")

### 

#### final  class NoSnapshotStore extends [SnapshotStore](SnapshotStore.html)

Used as default snapshot\-store in case no other store was configured.

If a [akka.persistence.PersistentActor](../PersistentActor.html) calls the [akka.persistence.PersistentActor\#saveSnapshot](../PersistentActor.html#saveSnapshot(snapshot:Any):Unit) method,
and at the same time does not configure a specific snapshot\-store to be used \*and\* no default snapshot\-store
is available, then the `NoSnapshotStore` will be used to signal a snapshot store failure.

Source[NoSnapshotStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/snapshot/NoSnapshotStore.scala#L18)Linear Supertypes[SnapshotStore](SnapshotStore.html), [ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NoSnapshotStore
2. SnapshotStore
3. ActorLogging
4. Actor
5. AnyRef
6. Any
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

1. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#<init>():akka.persistence.snapshot.NoSnapshotStore "Permalink")  new NoSnapshotStore()
### Type Members

1. [**](../../../akka/persistence/snapshot/NoSnapshotStore$NoSnapshotStoreException.html "Permalink") final  class [NoSnapshotStoreException](NoSnapshotStore$NoSnapshotStoreException.html) extends RuntimeException
2. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NoSnapshotStore toany2stringadd\[NoSnapshotStore] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NoSnapshotStore, B)ImplicitThis member is added by an implicit conversion from NoSnapshotStore toArrowAssoc\[NoSnapshotStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
14. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#deleteAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[Unit] "Permalink")  def deleteAsync(persistenceId: String, criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: deletes all snapshots matching `criteria`.

Plugin API: deletes all snapshots matching `criteria`.

This call is protected with a circuit\-breaker.

persistenceIdid of the persistent actor.

criteriaselection criteria for deleting.

Definition ClassesNoSnapshotStore → [SnapshotStore](SnapshotStore.html)
15. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#deleteAsync(metadata:akka.persistence.SnapshotMetadata):scala.concurrent.Future[Unit] "Permalink")  def deleteAsync(metadata: [SnapshotMetadata](../SnapshotMetadata.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: deletes the snapshot identified by `metadata`.

Plugin API: deletes the snapshot identified by `metadata`.

This call is protected with a circuit\-breaker.

metadatasnapshot metadata.

Definition ClassesNoSnapshotStore → [SnapshotStore](SnapshotStore.html)
16. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NoSnapshotStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoSnapshotStoreImplicitThis member is added by an implicit conversion from NoSnapshotStore toEnsuring\[NoSnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NoSnapshotStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoSnapshotStoreImplicitThis member is added by an implicit conversion from NoSnapshotStore toEnsuring\[NoSnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NoSnapshotStoreImplicitThis member is added by an implicit conversion from NoSnapshotStore toEnsuring\[NoSnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NoSnapshotStoreImplicitThis member is added by an implicit conversion from NoSnapshotStore toEnsuring\[NoSnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#loadAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[Option[akka.persistence.SelectedSnapshot]] "Permalink")  def loadAsync(persistenceId: String, criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SelectedSnapshot](../SelectedSnapshot.html)]]Plugin API: asynchronously loads a snapshot.

Plugin API: asynchronously loads a snapshot.

If the future `Option` is `None` then all events will be replayed,
i.e. there was no snapshot. If snapshot could not be loaded the `Future`
should be completed with failure. That is important because events may
have been deleted and just replaying the events might not result in a valid
state.

This call is protected with a circuit\-breaker.

persistenceIdid of the persistent actor.

criteriaselection criteria for loading.

Definition ClassesNoSnapshotStore → [SnapshotStore](SnapshotStore.html)
26. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
27. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
32. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
34. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#receive:PartialFunction[Any,Unit] "Permalink") final  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[SnapshotStore](SnapshotStore.html) → [Actor](../../actor/Actor.html)
35. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#receivePluginInternal:akka.actor.Actor.Receive "Permalink")  def receivePluginInternal: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Plugin API
Allows plugin implementers to use `f pipeTo self` and
handle additional messages for implementing advanced features

Plugin API
Allows plugin implementers to use `f pipeTo self` and
handle additional messages for implementing advanced features

Definition Classes[SnapshotStore](SnapshotStore.html)
36. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#receiveSnapshotStore:akka.actor.Actor.Receive "Permalink") final  val receiveSnapshotStore: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Definition Classes[SnapshotStore](SnapshotStore.html)
37. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#saveAsync(metadata:akka.persistence.SnapshotMetadata,snapshot:Any):scala.concurrent.Future[Unit] "Permalink")  def saveAsync(metadata: [SnapshotMetadata](../SnapshotMetadata.html), snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously saves a snapshot.

Plugin API: asynchronously saves a snapshot.

This call is protected with a circuit\-breaker.

metadatasnapshot metadata.

snapshotsnapshot.

Definition ClassesNoSnapshotStore → [SnapshotStore](SnapshotStore.html)
38. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
39. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
40. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
41. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
42. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
43. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
44. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
46. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NoSnapshotStore toStringFormat\[NoSnapshotStore] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/snapshot/NoSnapshotStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NoSnapshotStore, B)ImplicitThis member is added by an implicit conversion from NoSnapshotStore toArrowAssoc\[NoSnapshotStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SnapshotStore](SnapshotStore.html)

### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNoSnapshotStore to any2stringadd\[NoSnapshotStore]

### Inherited by implicit conversion StringFormat fromNoSnapshotStore to StringFormat\[NoSnapshotStore]

### Inherited by implicit conversion Ensuring fromNoSnapshotStore to Ensuring\[NoSnapshotStore]

### Inherited by implicit conversion ArrowAssoc fromNoSnapshotStore to ArrowAssoc\[NoSnapshotStore]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/NoSnapshotStore$NoSnapshotStoreException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/NoSnapshotStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/SnapshotStoreSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/NoSnapshotStore.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/NoSnapshotStore.html)*