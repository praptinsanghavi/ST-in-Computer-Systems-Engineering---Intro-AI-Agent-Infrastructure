---
description: Akka 2.10.17 - akka.persistence.snapshot.japi.SnapshotStore
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:32:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/snapshot/japi/SnapshotStore.html
title: Akka 2.10.17 - akka.persistence.snapshot.japi.SnapshotStore
---

# Akka 2.10.17 - akka.persistence.snapshot.japi.SnapshotStore

> **Summary:** Akka 2.10.17 - akka.persistence.snapshot.japi.SnapshotStore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/snapshot/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[snapshot](../index.html)
- SnapshotStore
c[akka](../../../index.html).[persistence](../../index.html).[snapshot](../index.html).[japi](index.html)

# SnapshotStore[**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html "Permalink")

### 

#### abstract  class SnapshotStore extends [snapshot.SnapshotStore](../SnapshotStore.html) with SnapshotStorePlugin

Java API: abstract snapshot store.

Source[SnapshotStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/snapshot/japi/SnapshotStore.scala#L16)Linear SupertypesSnapshotStorePlugin, [snapshot.SnapshotStore](../SnapshotStore.html), [ActorLogging](../../../actor/ActorLogging.html), [Actor](../../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotStore
2. SnapshotStorePlugin
3. SnapshotStore
4. ActorLogging
5. Actor
6. AnyRef
7. Any
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

1. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#<init>():akka.persistence.snapshot.japi.SnapshotStore "Permalink")  new SnapshotStore()
### Type Members

1. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../../actor/Actor.html)
### Abstract Value Members

1. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#doDeleteAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[Void] "Permalink") abstract  def doDeleteAsync(persistenceId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), criteria: [SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]Java API, Plugin API: deletes all snapshots matching `criteria`.

Java API, Plugin API: deletes all snapshots matching `criteria`.

persistenceIdid of the persistent actor.

criteriaselection criteria for deleting.

Definition ClassesSnapshotStorePlugin
2. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#doDeleteAsync(metadata:akka.persistence.SnapshotMetadata):scala.concurrent.Future[Void] "Permalink") abstract  def doDeleteAsync(metadata: [SnapshotMetadata](../../SnapshotMetadata.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]Java API, Plugin API: deletes the snapshot identified by `metadata`.

Java API, Plugin API: deletes the snapshot identified by `metadata`.

metadatasnapshot metadata.

Definition ClassesSnapshotStorePlugin
3. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#doLoadAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[java.util.Optional[akka.persistence.SelectedSnapshot]] "Permalink") abstract  def doLoadAsync(persistenceId: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), criteria: [SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[SelectedSnapshot](../../SelectedSnapshot.html)]]Java API, Plugin API: asynchronously loads a snapshot.

Java API, Plugin API: asynchronously loads a snapshot.

persistenceIdid of the persistent actor.

criteriaselection criteria for loading.

Definition ClassesSnapshotStorePlugin
4. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#doSaveAsync(metadata:akka.persistence.SnapshotMetadata,snapshot:Object):scala.concurrent.Future[Void] "Permalink") abstract  def doSaveAsync(metadata: [SnapshotMetadata](../../SnapshotMetadata.html), snapshot: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]Java API, Plugin API: asynchronously saves a snapshot.

Java API, Plugin API: asynchronously saves a snapshot.

metadatasnapshot metadata.

snapshotsnapshot.

Definition ClassesSnapshotStorePlugin
### Concrete Value Members

1. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SnapshotStore toany2stringadd\[SnapshotStore] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SnapshotStore, B)ImplicitThis member is added by an implicit conversion from SnapshotStore toArrowAssoc\[SnapshotStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
7. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
8. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
9. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
10. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../../index.html)] Definition Classes[Actor](../../../actor/Actor.html)Annotations@[InternalApi](../../../annotation/InternalApi.html)()
11. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../../actor/Actor.html)
14. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#deleteAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[Unit] "Permalink") final  def deleteAsync(persistenceId: String, criteria: [SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: deletes all snapshots matching `criteria`.

Plugin API: deletes all snapshots matching `criteria`.

This call is protected with a circuit\-breaker.

persistenceIdid of the persistent actor.

criteriaselection criteria for deleting.

Definition ClassesSnapshotStore → [SnapshotStore](../SnapshotStore.html)
15. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#deleteAsync(metadata:akka.persistence.SnapshotMetadata):scala.concurrent.Future[Unit] "Permalink") final  def deleteAsync(metadata: [SnapshotMetadata](../../SnapshotMetadata.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: deletes the snapshot identified by `metadata`.

Plugin API: deletes the snapshot identified by `metadata`.

This call is protected with a circuit\-breaker.

metadatasnapshot metadata.

Definition ClassesSnapshotStore → [SnapshotStore](../SnapshotStore.html)
16. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SnapshotStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotStoreImplicitThis member is added by an implicit conversion from SnapshotStore toEnsuring\[SnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SnapshotStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotStoreImplicitThis member is added by an implicit conversion from SnapshotStore toEnsuring\[SnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SnapshotStoreImplicitThis member is added by an implicit conversion from SnapshotStore toEnsuring\[SnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SnapshotStoreImplicitThis member is added by an implicit conversion from SnapshotStore toEnsuring\[SnapshotStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#loadAsync(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria):scala.concurrent.Future[Option[akka.persistence.SelectedSnapshot]] "Permalink") final  def loadAsync(persistenceId: String, criteria: [SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SelectedSnapshot](../../SelectedSnapshot.html)]]Plugin API: asynchronously loads a snapshot.

Plugin API: asynchronously loads a snapshot.

If the future `Option` is `None` then all events will be replayed,
i.e. there was no snapshot. If snapshot could not be loaded the `Future`
should be completed with failure. That is important because events may
have been deleted and just replaying the events might not result in a valid
state.

This call is protected with a circuit\-breaker.

persistenceIdid of the persistent actor.

criteriaselection criteria for loading.

Definition ClassesSnapshotStore → [SnapshotStore](../SnapshotStore.html)
26. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../../actor/ActorLogging.html)
27. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
32. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../../actor/Actor.html)Annotations@throws(classOf\[Exception])
34. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#receive:PartialFunction[Any,Unit] "Permalink") final  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[SnapshotStore](../SnapshotStore.html) → [Actor](../../../actor/Actor.html)
35. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#receivePluginInternal:akka.actor.Actor.Receive "Permalink")  def receivePluginInternal: [actor.Actor.Receive](../../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Plugin API
Allows plugin implementers to use `f pipeTo self` and
handle additional messages for implementing advanced features

Plugin API
Allows plugin implementers to use `f pipeTo self` and
handle additional messages for implementing advanced features

Definition Classes[SnapshotStore](../SnapshotStore.html)
36. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#receiveSnapshotStore:akka.actor.Actor.Receive "Permalink") final  val receiveSnapshotStore: [actor.Actor.Receive](../../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Definition Classes[SnapshotStore](../SnapshotStore.html)
37. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#saveAsync(metadata:akka.persistence.SnapshotMetadata,snapshot:Any):scala.concurrent.Future[Unit] "Permalink") final  def saveAsync(metadata: [SnapshotMetadata](../../SnapshotMetadata.html), snapshot: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Plugin API: asynchronously saves a snapshot.

Plugin API: asynchronously saves a snapshot.

This call is protected with a circuit\-breaker.

metadatasnapshot metadata.

snapshotsnapshot.

Definition ClassesSnapshotStore → [SnapshotStore](../SnapshotStore.html)
38. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../../actor/Actor.html)
39. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../../actor/Actor.html)
40. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../../actor/Actor.html)
41. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
42. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
43. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../../event/EventStream.html)

Definition Classes[Actor](../../../actor/Actor.html)
44. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
46. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SnapshotStore toStringFormat\[SnapshotStore] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/snapshot/japi/SnapshotStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SnapshotStore, B)ImplicitThis member is added by an implicit conversion from SnapshotStore toArrowAssoc\[SnapshotStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from SnapshotStorePlugin

### Inherited from [snapshot.SnapshotStore](../SnapshotStore.html)

### Inherited from [ActorLogging](../../../actor/ActorLogging.html)

### Inherited from [Actor](../../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSnapshotStore to any2stringadd\[SnapshotStore]

### Inherited by implicit conversion StringFormat fromSnapshotStore to StringFormat\[SnapshotStore]

### Inherited by implicit conversion Ensuring fromSnapshotStore to Ensuring\[SnapshotStore]

### Inherited by implicit conversion ArrowAssoc fromSnapshotStore to ArrowAssoc\[SnapshotStore]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/event/EventStream.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/japi/SnapshotStore.html
- https://doc.akka.io/api/akka/current/akka/persistence/snapshot/japi/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/snapshot/japi/SnapshotStore.html](https://doc.akka.io/api/akka/current/akka/persistence/snapshot/japi/SnapshotStore.html)*