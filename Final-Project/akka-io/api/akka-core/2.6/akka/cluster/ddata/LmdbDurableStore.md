---
description: Akka 2.6.21 - akka.cluster.ddata.LmdbDurableStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/ddata/LmdbDurableStore.html
title: Akka 2.6.21 - akka.cluster.ddata.LmdbDurableStore
---

# Akka 2.6.21 - akka.cluster.ddata.LmdbDurableStore

> **Summary:** Akka 2.6.21 - akka.cluster.ddata.LmdbDurableStore

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[ddata](index.html)
- [**](../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[ddata](index.html)
- [AbstractDeltaReplicatedData](AbstractDeltaReplicatedData.html "Java API: Interface for implementing a DeltaReplicatedData in Java.")
- [AbstractReplicatedData](AbstractReplicatedData.html "Java API: Interface for implementing a ReplicatedData in Java.")
- [DeltaReplicatedData](DeltaReplicatedData.html "ReplicatedData with additional support for delta-CRDT replication.")
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")
- [Flag](Flag.html "Implements a boolean flag CRDT that is initialized to false and can be switched to true.")
- [FlagKey](FlagKey.html)
- [GCounter](GCounter.html "Implements a 'Growing Counter' CRDT, also called a 'G-Counter'.")
- [GCounterKey](GCounterKey.html)
- [GSet](GSet.html "Implements a 'Add Set' CRDT, also called a 'G-Set'.")
- [GSetKey](GSetKey.html)
- [Key](Key.html "Key for the key-value data in Replicator.")
- [LWWMap](LWWMap.html "Specialized ORMap with LWWRegister values.")
- [LWWMapKey](LWWMapKey.html)
- [LWWRegister](LWWRegister.html "Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW-Register'.")
- [LWWRegisterKey](LWWRegisterKey.html)
- LmdbDurableStore
- [ManyVersionVector](ManyVersionVector.html)
- [ORMap](ORMap.html "Implements a 'Observed Remove Map' CRDT, also called a 'OR-Map'.")
- [ORMapKey](ORMapKey.html)
- [ORMultiMap](ORMultiMap.html "An immutable multi-map implementation.")
- [ORMultiMapKey](ORMultiMapKey.html)
- [ORSet](ORSet.html "Implements a 'Observed Remove Set' CRDT, also called a 'OR-Set'.")
- [ORSetKey](ORSetKey.html)
- [OneVersionVector](OneVersionVector.html)
- [PNCounter](PNCounter.html "Implements a 'Increment/Decrement Counter' CRDT, also called a 'PN-Counter'.")
- [PNCounterKey](PNCounterKey.html)
- [PNCounterMap](PNCounterMap.html "Map of named counters.")
- [PNCounterMapKey](PNCounterMapKey.html)
- [RemovedNodePruning](RemovedNodePruning.html "ReplicatedData that has support for pruning of data belonging to a specific node may implement this interface.")
- [ReplicatedData](ReplicatedData.html "Interface for implementing a state based convergent replicated data type (CvRDT).")
- [ReplicatedDataSerialization](ReplicatedDataSerialization.html "Marker trait for ReplicatedData serialized by akka.cluster.ddata.protobuf.ReplicatedDataSerializer.")
- [ReplicatedDelta](ReplicatedDelta.html "The delta must implement this type.")
- [ReplicatedDeltaSize](ReplicatedDeltaSize.html "Some complex deltas grow in size for each update and above a configured threshold such deltas are discarded and sent as full state instead.")
- [Replicator](Replicator.html "A replicated in-memory data store supporting low latency and high availability requirements.")
- [ReplicatorSettings](ReplicatorSettings.html)
- [RequiresCausalDeliveryOfDeltas](RequiresCausalDeliveryOfDeltas.html "Marker that specifies that the deltas must be applied in causal order.")
- [SelfUniqueAddress](SelfUniqueAddress.html "Cluster non-specific (typed vs classic) wrapper for akka.cluster.UniqueAddress.")
- [VersionVector](VersionVector.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](LmdbDurableStore$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[ddata](index.html)

# [LmdbDurableStore](LmdbDurableStore$.html "See companion object")[**](../../../akka/cluster/ddata/LmdbDurableStore.html "Permalink")

### Companion [object LmdbDurableStore](LmdbDurableStore$.html "See companion object")

#### final  class LmdbDurableStore extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)

Source[DurableStore.scala](https://github.com/akka/akka/tree/v2.6.21//akka-distributed-data/src/main/scala/akka/cluster/ddata/DurableStore.scala#L114)Linear Supertypes[ActorLogging](../../actor/ActorLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LmdbDurableStore
2. ActorLogging
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

1. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#<init>(config:com.typesafe.config.Config):akka.cluster.ddata.LmdbDurableStore "Permalink")  new LmdbDurableStore(config: Config)
### Type Members

1. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/LmdbDurableStore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LmdbDurableStore toany2stringadd\[LmdbDurableStore] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LmdbDurableStore, B)ImplicitThis member is added by an implicit conversion from LmdbDurableStore toArrowAssoc\[LmdbDurableStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#active:LmdbDurableStore.this.Receive "Permalink")  def active: [Receive](#Receive=akka.actor.Actor.Receive)
7. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
12. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
15. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#dbPut(tx:akka.util.OptionVal[org.lmdbjava.Txn[java.nio.ByteBuffer]],key:akka.cluster.ddata.Key.KeyId,data:akka.cluster.ddata.DurableStore.DurableDataEnvelope):Unit "Permalink")  def dbPut(tx: OptionVal\[Txn\[[ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)]], key: [KeyId](Key$.html#KeyId=String), data: [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
16. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#dir:java.io.File "Permalink")  val dir: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)
17. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ensureValueBufferSize(size:Int):Unit "Permalink")  def ensureValueBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
18. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LmdbDurableStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): LmdbDurableStoreImplicitThis member is added by an implicit conversion from LmdbDurableStore toEnsuring\[LmdbDurableStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LmdbDurableStore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): LmdbDurableStoreImplicitThis member is added by an implicit conversion from LmdbDurableStore toEnsuring\[LmdbDurableStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): LmdbDurableStoreImplicitThis member is added by an implicit conversion from LmdbDurableStore toEnsuring\[LmdbDurableStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): LmdbDurableStoreImplicitThis member is added by an implicit conversion from LmdbDurableStore toEnsuring\[LmdbDurableStore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
25. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
26. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#init:LmdbDurableStore.this.Receive "Permalink")  def init: [Receive](#Receive=akka.actor.Actor.Receive)
27. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#isDbInitialized:Boolean "Permalink")  def isDbInitialized: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
28. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
30. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#manifest:String "Permalink")  val manifest: String
31. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
33. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
34. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#pending:java.util.HashMap[akka.cluster.ddata.Key.KeyId,akka.cluster.ddata.DurableStore.DurableDataEnvelope] "Permalink")  val pending: [HashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html#java.util.HashMap)\[[KeyId](Key$.html#KeyId=String), [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html)]
35. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition ClassesLmdbDurableStore → [Actor](../../actor/Actor.html)
36. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition ClassesLmdbDurableStore → [Actor](../../actor/Actor.html)
37. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
38. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
39. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#receive:LmdbDurableStore.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesLmdbDurableStore → [Actor](../../actor/Actor.html)
40. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
41. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
42. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#serialization:akka.serialization.Serialization "Permalink")  val serialization: [Serialization](../../serialization/Serialization.html)
43. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#serializer:akka.serialization.SerializerWithStringManifest "Permalink")  val serializer: [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)
44. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
45. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
46. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
47. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
48. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
50. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
51. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#writeBehind():Unit "Permalink")  def writeBehind(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)
52. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#writeBehindInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val writeBehindInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LmdbDurableStore toStringFormat\[LmdbDurableStore] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/LmdbDurableStore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LmdbDurableStore, B)ImplicitThis member is added by an implicit conversion from LmdbDurableStore toArrowAssoc\[LmdbDurableStore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLmdbDurableStore to any2stringadd\[LmdbDurableStore]

### Inherited by implicit conversion StringFormat fromLmdbDurableStore to StringFormat\[LmdbDurableStore]

### Inherited by implicit conversion Ensuring fromLmdbDurableStore to Ensuring\[LmdbDurableStore]

### Inherited by implicit conversion ArrowAssoc fromLmdbDurableStore to ArrowAssoc\[LmdbDurableStore]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/AbstractDeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/AbstractReplicatedData.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/DeltaReplicatedData.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/DurableStore$$DurableDataEnvelope.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GCounter$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GCounterKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GSetKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWRegister$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LmdbDurableStore$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LmdbDurableStore.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMap$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMapKey$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMultiMap$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/ORMultiMap.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LmdbDurableStore.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LmdbDurableStore.html)*