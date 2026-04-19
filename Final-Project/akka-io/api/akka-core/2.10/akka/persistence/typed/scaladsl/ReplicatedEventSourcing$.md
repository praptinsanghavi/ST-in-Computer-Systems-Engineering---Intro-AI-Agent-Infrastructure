---
description: Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicatedEventSourcing
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
title: Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicatedEventSourcing
---

# Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicatedEventSourcing

> **Summary:** Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicatedEventSourcing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- ReplicatedEventSourcing
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
o[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# ReplicatedEventSourcing[**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html "Permalink")

### 

#### object ReplicatedEventSourcing

Source[ReplicatedEventSourcing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.scala#L69)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedEventSourcing
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#commonJournalConfig[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicaIds:Set[akka.persistence.typed.ReplicaId],queryPluginId:String)(eventSourcedBehaviorFactory:akka.persistence.typed.scaladsl.ReplicationContext=>akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def commonJournalConfig\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicaIds: Set\[[ReplicaId](../ReplicaId.html)], queryPluginId: String)(eventSourcedBehaviorFactory: ([ReplicationContext](ReplicationContext.html)) \=\> [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior where all entity replicas are stored in the same journal.

Initialize a replicated event sourced behavior where all entity replicas are stored in the same journal.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
can be used for each replica.
The events from other replicas are read using PersistentQuery.

allReplicaIdsAll replica ids. These need to be known to receive events from all replicas.

queryPluginIdA single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
7. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#perReplicaJournalConfig[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicasAndQueryPlugins:Map[akka.persistence.typed.ReplicaId,String])(eventSourcedBehaviorFactory:akka.persistence.typed.scaladsl.ReplicationContext=>akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def perReplicaJournalConfig\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicasAndQueryPlugins: Map\[[ReplicaId](../ReplicaId.html), String])(eventSourcedBehaviorFactory: ([ReplicationContext](ReplicationContext.html)) \=\> [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior.

Initialize a replicated event sourced behavior.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

The journal plugin id for the entity itself can be configured using withJournalPluginId after creation.
A query side identifier is passed per replica allowing for separate database/journal configuration per
replica. The events from other replicas are read using PersistentQuery.

allReplicasAndQueryPluginsAll replica ids and a query plugin per replica id. These need to be known to receive events from all replicas
 and configured with the query plugin for the journal that each replica uses.
16. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html)*