---
description: Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcing
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:49:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
title: Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcing
---

# Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcing

> **Summary:** Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")
- [EventHandler](EventHandler.html "FunctionalInterface for reacting on events having been persisted")
- [EventHandlerBuilder](EventHandlerBuilder.html)
- [EventHandlerBuilderByState](EventHandlerBuilderByState.html)
- [EventSourcedBehavior](EventSourcedBehavior.html "For projects using Java 17 and newer, also see EventSourcedOnCommandBehavior")
- [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "A EventSourcedBehavior that is enforcing that replies to commands are not forgotten.")
- [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "Base class for replicated event sourced behaviors.")
- [ReplicatedEventSourcedOnCommandBehavior](ReplicatedEventSourcedOnCommandBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- ReplicatedEventSourcing
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in EventSourcedBehavior")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
o[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[javadsl](index.html)

# ReplicatedEventSourcing[**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html "Permalink")

### 

#### object ReplicatedEventSourcing

Source[ReplicatedEventSourcing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/javadsl/ReplicatedEventSourcing.scala#L72)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#commonJournalConfig[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],queryPluginId:String,behaviorFactory:java.util.function.Function[akka.persistence.typed.javadsl.ReplicationContext,akka.persistence.typed.javadsl.EventSourcedBehavior[Command,Event,State]]):akka.persistence.typed.javadsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def commonJournalConfig\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicaIds: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ReplicaId](../ReplicaId.html)], queryPluginId: String, behaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicationContext](ReplicationContext.html), [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]]): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.

Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.
This is typical if there is a shared database and no replica specific configuration is required.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
can be used for each replica.
The events from other replicas are read using PersistentQuery.

queryPluginIdA single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
7. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#commonJournalConfigForEventSourcedOnCommandBehavior[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],queryPluginId:String,behaviorFactory:java.util.function.Function[akka.persistence.typed.javadsl.ReplicationContext,akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior[Command,Event,State]]):akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior[Command,Event,State] "Permalink")  def commonJournalConfigForEventSourcedOnCommandBehavior\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicaIds: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ReplicaId](../ReplicaId.html)], queryPluginId: String, behaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicationContext](ReplicationContext.html), [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]]): [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.

Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.
This is typical if there is a shared database and no replica specific configuration is required.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
can be used for each replica.
The events from other replicas are read using PersistentQuery.

queryPluginIdA single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
8. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#perReplicaJournalConfig[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicasAndQueryPlugins:java.util.Map[akka.persistence.typed.ReplicaId,String],eventSourcedBehaviorFactory:java.util.function.Function[akka.persistence.typed.javadsl.ReplicationContext,akka.persistence.typed.javadsl.EventSourcedBehavior[Command,Event,State]]):akka.persistence.typed.javadsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def perReplicaJournalConfig\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicasAndQueryPlugins: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ReplicaId](../ReplicaId.html), String], eventSourcedBehaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicationContext](ReplicationContext.html), [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]]): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.

Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.
each replica uses a different database or requires different database configuration for a shared database.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

The journal plugin id for the entity itself can be configured using withJournalPluginId after creation.
A query side identifier is passed per replica allowing for separate database/journal configuration per
replica. The events from other replicas are read using PersistentQuery.

allReplicasAndQueryPluginsAll replica ids and a query plugin per replica id. These need to be known to receive events from all replicas
 and configured with the query plugin for the journal that each replica uses.
17. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#perReplicaJournalConfigForEventSourcedOnCommandBehavior[Command,Event,State](replicationId:akka.persistence.typed.ReplicationId,allReplicasAndQueryPlugins:java.util.Map[akka.persistence.typed.ReplicaId,String],eventSourcedBehaviorFactory:java.util.function.Function[akka.persistence.typed.javadsl.ReplicationContext,akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior[Command,Event,State]]):akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior[Command,Event,State] "Permalink")  def perReplicaJournalConfigForEventSourcedOnCommandBehavior\[Command, Event, State](replicationId: [ReplicationId](../ReplicationId.html), allReplicasAndQueryPlugins: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[ReplicaId](../ReplicaId.html), String], eventSourcedBehaviorFactory: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicationContext](ReplicationContext.html), [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]]): [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.

Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.
each replica uses a different database or requires different database configuration for a shared database.

Events from each replica for the same entityId will be replicated to every copy.
Care must be taken to handle events in any order as events can happen concurrently at different replicas.

Using an replicated event sourced behavior means there is no longer the single writer guarantee.

The journal plugin id for the entity itself can be configured using withJournalPluginId after creation.
A query side identifier is passed per replica allowing for separate database/journal configuration per
replica. The events from other replicas are read using PersistentQuery.

allReplicasAndQueryPluginsAll replica ids and a query plugin per replica id. These need to be known to receive events from all replicas
 and configured with the query plugin for the journal that each replica uses.
18. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html)*