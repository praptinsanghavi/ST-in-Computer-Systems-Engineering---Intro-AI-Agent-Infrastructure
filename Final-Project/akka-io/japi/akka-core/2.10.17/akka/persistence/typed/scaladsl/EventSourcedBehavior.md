---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
title: EventSourcedBehavior
---

# EventSourcedBehavior

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface EventSourcedBehavior\<Command,​Event,​State\>

- ---

```
public interface EventSourcedBehavior<Command,​Event,​State>
```

Further customization of the `EventSourcedBehavior` can be done with the methods defined here.
 
 Not for user extension

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[EventSourcedBehavior.CommandHandler$](EventSourcedBehavior.CommandHandler$.html "class in akka.persistence.typed.scaladsl")` | The `CommandHandler` defines how to act on commands. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[eventAdapter](#eventAdapter(akka.persistence.typed.EventAdapter))​([EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​?> adapter)` | Transform the event to another type before giving to the journal. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[onPersistFailure](#onPersistFailure(akka.actor.typed.BackoffSupervisorStrategy))​([BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffStrategy)` | Back off strategy for persist failures. |
	| `[PersistenceId](../PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[receiveSignal](#receiveSignal(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler)` | Allows the event sourced behavior to react on signals. |
	| `scala.PartialFunction<scala.Tuple2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit>` | `[signalHandler](#signalHandler())()` |  |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[snapshotAdapter](#snapshotAdapter(akka.persistence.typed.SnapshotAdapter))​([SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> adapter)` | Transform the state to another type before giving to the journal. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[snapshotWhen](#snapshotWhen(scala.Function3))​(scala.Function3<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​java.lang.Object,​java.lang.Object> predicate)` | Initiates a snapshot if the given `predicate` evaluates to true. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[snapshotWhen](#snapshotWhen(scala.Function3,boolean))​(scala.Function3<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​java.lang.Object,​java.lang.Object> predicate,  boolean deleteEventsOnSnapshot)` | Can be used to delete events after `shouldSnapshot`. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withEventPublishing](#withEventPublishing(boolean))​(boolean enabled)` | Publish events to the system event stream as [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withJournalPluginId](#withJournalPluginId(java.lang.String))​(java.lang.String id)` | Change the journal plugin id that this actor should use. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withRecovery](#withRecovery(akka.persistence.typed.scaladsl.Recovery))​([Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl") recovery)` | Change the recovery strategy. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withReplicatedEventInterceptor](#withReplicatedEventInterceptor(akka.persistence.typed.scaladsl.ReplicationInterceptor))​([ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> interceptor)` | Invoke this callback when an event from another replica arrives, delaying persisting the event until the returned  future completes, if the future fails the actor is crashed. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withReplicatedEventsTransformation](#withReplicatedEventsTransformation(scala.Function2))​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>,​scala.collection.immutable.Seq<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>>> f)` | INTERNAL API: Invoke this transformation function when an event from another replica arrives, before persisting the event and  before calling the ordinary event handler. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withReplicatedEventTransformation](#withReplicatedEventTransformation(scala.Function2))​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>,​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>> f)` | Deprecated. Use withReplicatedEventsTransformation. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withReplication](#withReplication(akka.persistence.typed.internal.ReplicationContextImpl))​(akka.persistence.typed.internal.ReplicationContextImpl context)` | INTERNAL API |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withRetention](#withRetention(akka.persistence.typed.scaladsl.RetentionCriteria))​([RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") criteria)` | Criteria for retention/deletion of snapshots and events. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withSnapshotPluginId](#withSnapshotPluginId(java.lang.String))​(java.lang.String id)` | Change the snapshot store plugin id that this actor should use. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withSnapshotSelectionCriteria](#withSnapshotSelectionCriteria(akka.persistence.typed.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") selection)` | Deprecated. use withRecovery(Recovery.withSnapshotSelectionCriteria(...)). |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withStashCapacity](#withStashCapacity(int))​(int size)` | Define a custom stash capacity per entity. |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withTagger](#withTagger(scala.Function1))​(scala.Function1<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​scala.collection.immutable.Set<java.lang.String>> tagger)` | The `tagger` function should give event tags, which will be used in persistence query |
	| `[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>` | `[withTaggerForState](#withTaggerForState(scala.Function2))​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​scala.collection.immutable.Set<java.lang.String>> tagger)` | The `tagger` function should give event tags, which will be used in persistence query. |

- - ### Method Detail
	
	
	
		- #### persistenceId
		
		
		
		```
		[PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		- #### receiveSignal
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> receiveSignal​(scala.PartialFunction<scala.Tuple2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler)
		```
		
		Allows the event sourced behavior to react on signals.
		 
		 The regular lifecycle signals can be handled as well as
		 Akka Persistence specific signals (snapshot and recovery related). Those are all subtypes of
		 [`EventSourcedSignal`](../EventSourcedSignal.html "interface in akka.persistence.typed")
		- #### signalHandler
		
		
		
		```
		scala.PartialFunction<scala.Tuple2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> signalHandler()
		```
		
		
		Returns:
		The currently defined signal handler or an empty handler if no custom handler previously defined
		- #### withJournalPluginId
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withJournalPluginId​(java.lang.String id)
		```
		
		Change the journal plugin id that this actor should use.
		- #### withSnapshotPluginId
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withSnapshotPluginId​(java.lang.String id)
		```
		
		Change the snapshot store plugin id that this actor should use.
		- #### withSnapshotSelectionCriteria
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withSnapshotSelectionCriteria​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") selection)
		```
		
		Deprecated.
		use withRecovery(Recovery.withSnapshotSelectionCriteria(...)). Since 2\.6\.5\.
		
		Changes the snapshot selection criteria used by this behavior.
		 By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
		 from the sequence number up until which the snapshot reached.
		 
		 You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
		 performed by replaying all events \-\- which may take a long time.
		- #### snapshotWhen
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> snapshotWhen​(scala.Function3<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​java.lang.Object,​java.lang.Object> predicate)
		```
		
		Initiates a snapshot if the given `predicate` evaluates to true.
		 
		 Decide to store a snapshot based on the State, Event and sequenceNr when the event has
		 been successfully persisted.
		 
		
		
		 When persisting multiple events at once the snapshot is triggered after all the events have
		 been persisted.
		 
		
		
		 Snapshots triggered by `snapshotWhen` will not trigger deletes of old snapshots and events if
		 `EventSourcedBehavior.withRetention` with `RetentionCriteria.snapshotEvery` is used together with
		 `snapshotWhen`. Such deletes are only triggered by snapshots matching the `numberOfEvents` in the
		 [`RetentionCriteria`](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl").
		 
		
		
		 Events can be deleted if `snapshotWhen(predicate, deleteEventsOnSnapshot = true)` is used.
		- #### snapshotWhen
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> snapshotWhen​(scala.Function3<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​java.lang.Object,​java.lang.Object> predicate,
		                                                                   boolean deleteEventsOnSnapshot)
		```
		
		Can be used to delete events after `shouldSnapshot`.
		 
		 Can be used in combination with `EventSourcedBehavior.retentionCriteria` in a way that events are triggered
		 up the the oldest snapshot based on `RetentionCriteria.snapshotEvery` config.
		- #### withRetention
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withRetention​([RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") criteria)
		```
		
		Criteria for retention/deletion of snapshots and events.
		 By default, retention is disabled and snapshots are not saved and deleted automatically.
		- #### withTagger
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withTagger​(scala.Function1<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​scala.collection.immutable.Set<java.lang.String>> tagger)
		```
		
		The `tagger` function should give event tags, which will be used in persistence query
		- #### withTaggerForState
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withTaggerForState​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​scala.collection.immutable.Set<java.lang.String>> tagger)
		```
		
		The `tagger` function should give event tags, which will be used in persistence query.
		 The state passed to the tagger allows for toggling a tag with one event but keep all events after it tagged
		 based on a property or the type of the state.
		- #### eventAdapter
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> eventAdapter​([EventAdapter](../EventAdapter.html "class in akka.persistence.typed")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​?> adapter)
		```
		
		Transform the event to another type before giving to the journal. Can be used to wrap events
		 in types Journals understand but is of a different type than `Event`.
		- #### snapshotAdapter
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> snapshotAdapter​([SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> adapter)
		```
		
		Transform the state to another type before giving to the journal. Can be used to transform older
		 state types into the current state type e.g. when migrating from Persistent FSM to Typed EventSourcedBehavior.
		- #### onPersistFailure
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> onPersistFailure​([BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html "class in akka.actor.typed") backoffStrategy)
		```
		
		Back off strategy for persist failures.
		 
		 Specifically BackOff to prevent resume being used. Resume is not allowed as
		 it will be unknown if the event has been persisted.
		 
		
		
		 This supervision is only around the event sourced behavior not any outer setup/withTimers
		 block. If using restart, any actions e.g. scheduling timers, can be done on the PreRestart
		 
		
		
		 If not specified the actor will be stopped on failure.
		- #### withRecovery
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withRecovery​([Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl") recovery)
		```
		
		Change the recovery strategy.
		 By default, snapshots and events are recovered.
		- #### withEventPublishing
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withEventPublishing​(boolean enabled)
		```
		
		Publish events to the system event stream as [`PublishedEvent`](../PublishedEvent.html "interface in akka.persistence.typed") after they have been persisted
		- #### withReplication
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withReplication​(akka.persistence.typed.internal.ReplicationContextImpl context)
		```
		
		INTERNAL API
		- #### withStashCapacity
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withStashCapacity​(int size)
		```
		
		Define a custom stash capacity per entity.
		 If not defined, the default `akka.persistence.typed.stash-capacity` will be used.
		- #### withReplicatedEventInterceptor
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withReplicatedEventInterceptor​([ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> interceptor)
		```
		
		Invoke this callback when an event from another replica arrives, delaying persisting the event until the returned
		 future completes, if the future fails the actor is crashed.
		 
		 Only used when the entity is replicated.
		- #### withReplicatedEventTransformation
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withReplicatedEventTransformation​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>,​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>> f)
		```
		
		Deprecated.
		Use withReplicatedEventsTransformation. Since 2\.10\.12\.
		
		INTERNAL API: Invoke this transformation function when an event from another replica arrives, before persisting the event and
		 before calling the ordinary event handler. The transformation function returns the updated event and optionally
		 additional metadata that will be stored together with the event.
		 
		 Only used when the entity is replicated.
		- #### withReplicatedEventsTransformation
		
		
		
		```
		[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<[Command](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")> withReplicatedEventsTransformation​(scala.Function2<[State](EventSourcedBehavior.html "type parameter in EventSourcedBehavior"),​[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>,​scala.collection.immutable.Seq<[EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<[Event](EventSourcedBehavior.html "type parameter in EventSourcedBehavior")>>> f)
		```
		
		INTERNAL API: Invoke this transformation function when an event from another replica arrives, before persisting the event and
		 before calling the ordinary event handler. The transformation function returns the updated event, and possibly
		 additional events, and optionally additional metadata that will be stored together with the events.
		 
		 Only used when the entity is replicated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html)*