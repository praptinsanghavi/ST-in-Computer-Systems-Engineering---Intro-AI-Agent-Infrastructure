---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
title: EventSourcedBehaviorTestKit
---

# EventSourcedBehaviorTestKit

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface EventSourcedBehaviorTestKit\<Command,​Event,​State\>

- ---

```
public interface EventSourcedBehaviorTestKit<Command,​Event,​State>
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static interface` | `[EventSourcedBehaviorTestKit.CommandResult](EventSourcedBehaviorTestKit.CommandResult.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.CommandResult.html "type parameter in EventSourcedBehaviorTestKit.CommandResult"),​[Event](EventSourcedBehaviorTestKit.CommandResult.html "type parameter in EventSourcedBehaviorTestKit.CommandResult"),​[State](EventSourcedBehaviorTestKit.CommandResult.html "type parameter in EventSourcedBehaviorTestKit.CommandResult")>` | The result of running a command. |
	| `static interface` | `[EventSourcedBehaviorTestKit.CommandResultWithReply](EventSourcedBehaviorTestKit.CommandResultWithReply.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.CommandResultWithReply.html "type parameter in EventSourcedBehaviorTestKit.CommandResultWithReply"),​[Event](EventSourcedBehaviorTestKit.CommandResultWithReply.html "type parameter in EventSourcedBehaviorTestKit.CommandResultWithReply"),​[State](EventSourcedBehaviorTestKit.CommandResultWithReply.html "type parameter in EventSourcedBehaviorTestKit.CommandResultWithReply"),​[Reply](EventSourcedBehaviorTestKit.CommandResultWithReply.html "type parameter in EventSourcedBehaviorTestKit.CommandResultWithReply")>` | The result of running a command with a `replyTo: ActorRef[R]`, i.e. |
	| `static interface` | `[EventSourcedBehaviorTestKit.RestartResult](EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")<[State](EventSourcedBehaviorTestKit.RestartResult.html "type parameter in EventSourcedBehaviorTestKit.RestartResult")>` | The result of restarting the behavior. |
	| `static class` | `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.scaladsl")` | Customization of which serialization checks that are performed. |
	| `static class` | `[EventSourcedBehaviorTestKit.SerializationSettings$](EventSourcedBehaviorTestKit.SerializationSettings$.html "class in akka.persistence.testkit.scaladsl")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clear](#clear())()` | Clears the in\-memory journal and snapshot storage and restarts the behavior. |
	| `[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")` | `[getState](#getState())()` | Retrieve the current state of the Behavior. |
	| `void` | `[initialize](#initialize(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> events)` |  |
	| `void` | `[initialize](#initialize(State,scala.collection.immutable.Seq))​([State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit") state,  scala.collection.immutable.Seq<[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> events)` | Initializes behavior from provided state and/or events. |
	| `[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")` | `[persistenceTestKit](#persistenceTestKit())()` | The underlying `PersistenceTestKit` for the in\-memory journal. |
	| `[EventSourcedBehaviorTestKit.RestartResult](EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")<[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")>` | `[restart](#restart())()` | Restart the behavior, which will then recover from stored snapshot and events. |
	| `[EventSourcedBehaviorTestKit.CommandResult](EventSourcedBehaviorTestKit.CommandResult.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")>` | `[runCommand](#runCommand(Command))​([Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit") command)` | Run one command through the behavior. |
	| `<R> [EventSourcedBehaviorTestKit.CommandResultWithReply](EventSourcedBehaviorTestKit.CommandResultWithReply.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​R>` | `[runCommand](#runCommand(scala.Function1))​(scala.Function1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<R>,​[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> creator)` | Run one command with a `replyTo: ActorRef[R]` through the behavior. |
	| `scala.Option<[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")>` | `[snapshotTestKit](#snapshotTestKit())()` | The underlying `SnapshotTestKit` for snapshot storage. |

- - ### Method Detail
	
	
	
		- #### runCommand
		
		
		
		```
		[EventSourcedBehaviorTestKit.CommandResult](EventSourcedBehaviorTestKit.CommandResult.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> runCommand​([Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit") command)
		```
		
		Run one command through the behavior. The returned result contains emitted events and the state
		 after applying the events.
		- #### runCommand
		
		
		
		```
		<R> [EventSourcedBehaviorTestKit.CommandResultWithReply](EventSourcedBehaviorTestKit.CommandResultWithReply.html "interface in akka.persistence.testkit.scaladsl")<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​R> runCommand​(scala.Function1<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<R>,​[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> creator)
		```
		
		Run one command with a `replyTo: ActorRef[R]` through the behavior. The returned result contains emitted events,
		 the state after applying the events, and the reply.
		- #### getState
		
		
		
		```
		[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit") getState()
		```
		
		Retrieve the current state of the Behavior.
		- #### restart
		
		
		
		```
		[EventSourcedBehaviorTestKit.RestartResult](EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")<[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> restart()
		```
		
		Restart the behavior, which will then recover from stored snapshot and events. Can be used for testing
		 that the recovery is correct.
		- #### clear
		
		
		
		```
		void clear()
		```
		
		Clears the in\-memory journal and snapshot storage and restarts the behavior.
		- #### persistenceTestKit
		
		
		
		```
		[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl") persistenceTestKit()
		```
		
		The underlying `PersistenceTestKit` for the in\-memory journal.
		 Can be useful for advanced testing scenarios, such as simulating failures or
		 populating the journal with events that are used for replay.
		- #### snapshotTestKit
		
		
		
		```
		scala.Option<[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")> snapshotTestKit()
		```
		
		The underlying `SnapshotTestKit` for snapshot storage. Present only if snapshots are enabled.
		 Can be useful for advanced testing scenarios, such as simulating failures or
		 populating the storage with snapshots that are used for replay.
		- #### initialize
		
		
		
		```
		void initialize​([State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit") state,
		                scala.collection.immutable.Seq<[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> events)
		```
		
		Initializes behavior from provided state and/or events.
		- #### initialize
		
		
		
		```
		void initialize​(scala.collection.immutable.Seq<[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")> events)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.CommandResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.CommandResultWithReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.RestartResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.SerializationSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.SerializationSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html)*