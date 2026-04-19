---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
title: UnpersistentBehavior
---

# UnpersistentBehavior

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class UnpersistentBehavior\<Command,​Event,​State\>

- java.lang.Object
- - akka.persistence.testkit.javadsl.UnpersistentBehavior\<Command,​Event,​State\>

- ---

```
public final class UnpersistentBehavior<Command,​Event,​State>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnpersistentBehavior](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <Command,​State>[UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​java.lang.Void,​State>` | `[fromDurableState](#fromDurableState(akka.actor.typed.Behavior))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)` |  |
	| `static <Command,​State>[UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​java.lang.Void,​State>` | `[fromDurableState](#fromDurableState(akka.actor.typed.Behavior,State))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  State initialState)` |  |
	| `static <Command,​Event,​State>[UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State>` | `[fromEventSourced](#fromEventSourced(akka.actor.typed.Behavior))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)` |  |
	| `static <Command,​Event,​State>[UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State>` | `[fromEventSourced](#fromEventSourced(akka.actor.typed.Behavior,State,long))​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  State initialState,  long initialSequenceNr)` | Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots  for inspection. |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[getBehavior](#getBehavior())()` |  |
	| `[BehaviorTestKit](../../../actor/testkit/typed/javadsl/BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[getBehaviorTestKit](#getBehaviorTestKit())()` |  |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[Event](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[getEventProbe](#getEventProbe())()` | Note: durable state behaviors will not publish events to this probe |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[getSnapshotProbe](#getSnapshotProbe())()` |  |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[getStateProbe](#getStateProbe())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UnpersistentBehavior
		
		
		
		```
		public UnpersistentBehavior()
		```

	- ### Method Detail
	
	
	
		- #### fromEventSourced
		
		
		
		```
		public static <Command,​Event,​State> [UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State> fromEventSourced​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                                       State initialState,
		                                                                                                                       long initialSequenceNr)
		```
		
		Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots
		 for inspection. State is updated as in the EventSourcedBehavior, and side effects are performed synchronously. The
		 resulting Behavior is, contingent on the command handling, event handling, and side effects being compatible with the
		 BehaviorTestKit, testable with the BehaviorTestKit.
		 
		 The returned Behavior does not intrinsically depend on configuration: it therefore does not serialize and
		 assumes an unbounded stash for commands.
		 
		
		
		
		Parameters:
		`behavior` \- a (possibly wrapped) EventSourcedBehavior to serve as the basis for the unpersistent behavior
		`initialState` \- start the unpersistent behavior with this state; if null, behavior's initialState will be used
		`initialSequenceNr` \- start the unpersistent behavior with this sequence number; only applies if initialState is non\-null
		Returns:
		an UnpersistentBehavior based on an EventSourcedBehavior
		- #### fromEventSourced
		
		
		
		```
		public static <Command,​Event,​State> [UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State> fromEventSourced​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)
		```
		- #### fromDurableState
		
		
		
		```
		public static <Command,​State> [UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​java.lang.Void,​State> fromDurableState​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                                    State initialState)
		```
		- #### fromDurableState
		
		
		
		```
		public static <Command,​State> [UnpersistentBehavior](UnpersistentBehavior.html "class in akka.persistence.testkit.javadsl")<Command,​java.lang.Void,​State> fromDurableState​([Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)
		```
		- #### getBehavior
		
		
		
		```
		public [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> getBehavior()
		```
		- #### getBehaviorTestKit
		
		
		
		```
		public [BehaviorTestKit](../../../actor/testkit/typed/javadsl/BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> getBehaviorTestKit()
		```
		- #### getEventProbe
		
		
		
		```
		public [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[Event](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> getEventProbe()
		```
		
		Note: durable state behaviors will not publish events to this probe
		- #### getStateProbe
		
		
		
		```
		public [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> getStateProbe()
		```
		- #### getSnapshotProbe
		
		
		
		```
		public [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.javadsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> getSnapshotProbe()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/UnpersistentBehavior.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/UnpersistentBehavior.html)*