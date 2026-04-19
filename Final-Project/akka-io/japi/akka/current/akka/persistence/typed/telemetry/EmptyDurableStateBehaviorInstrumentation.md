---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
title: EmptyDurableStateBehaviorInstrumentation
---

# EmptyDurableStateBehaviorInstrumentation

## Content

Package [akka.persistence.typed.telemetry](package-summary.html)
## Class EmptyDurableStateBehaviorInstrumentation

- java.lang.Object
- - akka.persistence.typed.telemetry.EmptyDurableStateBehaviorInstrumentation

- All Implemented Interfaces:
`[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`

Direct Known Subclasses:
`[EmptyDurableStateBehaviorInstrumentation$](EmptyDurableStateBehaviorInstrumentation$.html "class in akka.persistence.typed.telemetry")`

---

```
public class EmptyDurableStateBehaviorInstrumentation
extends java.lang.Object
implements [DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyDurableStateBehaviorInstrumentation](#%3Cinit%3E())()` |  |
	| `[EmptyDurableStateBehaviorInstrumentation](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[actorInitialized](#actorInitialized(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Initialize state for an EventSourcedBehavior actor. |
	| `void` | `[afterRequestRecoveryPermit](#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object context)` | Record after a recovery permit is requested. |
	| `java.lang.Object` | `[beforeRequestRecoveryPermit](#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record before a recovery permit is requested. |
	| `java.lang.Object` | `[deleteStateCalled](#deleteStateCalled(akka.actor.typed.ActorRef,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object command)` | Record delete state. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `void` | `[persistFailed](#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Throwable throwable,  java.lang.Object state,  long revision,  java.lang.Object context)` | Record persistence persist failure. |
	| `java.lang.Object` | `[persistStateCalled](#persistStateCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object state,  java.lang.Object command)` | Record persist state. |
	| `void` | `[persistStateDone](#persistStateDone(akka.actor.typed.ActorRef,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object context)` | Record state is written and the registered callback is called. |
	| `java.lang.Object` | `[persistStateWritten](#persistStateWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object state,  java.lang.Object context)` | Record state is written but the registered callback has not been called yet |
	| `void` | `[recoveryDone](#recoveryDone(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record persistence recovery done. |
	| `void` | `[recoveryFailed](#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Throwable throwable)` | Record persistence recovery failure. |
	| `void` | `[recoveryStarted](#recoveryStarted(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record persistence recovery started. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyDurableStateBehaviorInstrumentation
		
		
		
		```
		public EmptyDurableStateBehaviorInstrumentation()
		```
		- #### EmptyDurableStateBehaviorInstrumentation
		
		
		
		```
		public EmptyDurableStateBehaviorInstrumentation​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### actorInitialized
		
		
		
		```
		public void actorInitialized​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#actorInitialized(akka.actor.typed.ActorRef))`
		Initialize state for an EventSourcedBehavior actor.
		
		Specified by:
		`[actorInitialized](DurableStateBehaviorInstrumentation.html#actorInitialized(akka.actor.typed.ActorRef))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		- #### beforeRequestRecoveryPermit
		
		
		
		```
		public java.lang.Object beforeRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))`
		Record before a recovery permit is requested.
		 
		
		Specified by:
		`[beforeRequestRecoveryPermit](DurableStateBehaviorInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is about to be requested
		Returns:
		context that will be passed to `afterRequestRecoveryPermit`
		- #### afterRequestRecoveryPermit
		
		
		
		```
		public void afterRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                       java.lang.Object context)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))`
		Record after a recovery permit is requested.
		 
		
		Specified by:
		`[afterRequestRecoveryPermit](DurableStateBehaviorInstrumentation.html#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is requested
		`context` \- returned by `beforeRequestRecoveryPermit`
		- #### recoveryStarted
		
		
		
		```
		public void recoveryStarted​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#recoveryStarted(akka.actor.typed.ActorRef))`
		Record persistence recovery started.
		 
		
		Specified by:
		`[recoveryStarted](DurableStateBehaviorInstrumentation.html#recoveryStarted(akka.actor.typed.ActorRef))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is started.
		- #### recoveryDone
		
		
		
		```
		public void recoveryDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#recoveryDone(akka.actor.typed.ActorRef))`
		Record persistence recovery done.
		 
		
		Specified by:
		`[recoveryDone](DurableStateBehaviorInstrumentation.html#recoveryDone(akka.actor.typed.ActorRef))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is finished.
		- #### recoveryFailed
		
		
		
		```
		public void recoveryFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                           java.lang.Throwable throwable)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable))`
		Record persistence recovery failure.
		 
		
		Specified by:
		`[recoveryFailed](DurableStateBehaviorInstrumentation.html#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		- #### persistStateCalled
		
		
		
		```
		public java.lang.Object persistStateCalled​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                           java.lang.Object state,
		                                           java.lang.Object command)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#persistStateCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))`
		Record persist state.
		 
		
		Specified by:
		`[persistStateCalled](DurableStateBehaviorInstrumentation.html#persistStateCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the state will be sent to the store.
		`state` \- the state that was submitted for persistence.
		`command` \- actor message (command) for which the state update was emitted.
		Returns:
		context that will be passed to `persistStateWritten`
		- #### deleteStateCalled
		
		
		
		```
		public java.lang.Object deleteStateCalled​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                          java.lang.Object command)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#deleteStateCalled(akka.actor.typed.ActorRef,java.lang.Object))`
		Record delete state.
		 
		
		Specified by:
		`[deleteStateCalled](DurableStateBehaviorInstrumentation.html#deleteStateCalled(akka.actor.typed.ActorRef,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the delete state will be sent to the store.
		`command` \- actor message (command) for which the state update was emitted.
		Returns:
		context that will be passed to `persistStateWritten`
		- #### persistStateWritten
		
		
		
		```
		public java.lang.Object persistStateWritten​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                            java.lang.Object state,
		                                            java.lang.Object context)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#persistStateWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))`
		Record state is written but the registered callback has not been called yet
		 
		
		Specified by:
		`[persistStateWritten](DurableStateBehaviorInstrumentation.html#persistStateWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the state has been successfully persisted.
		`state` \- the state that was stored in the journal.
		`context` \- context returned by `persistStateCalled`
		Returns:
		context that will be passed to `persistStateDone`
		- #### persistStateDone
		
		
		
		```
		public void persistStateDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                             java.lang.Object context)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#persistStateDone(akka.actor.typed.ActorRef,java.lang.Object))`
		Record state is written and the registered callback is called.
		 
		
		Specified by:
		`[persistStateDone](DurableStateBehaviorInstrumentation.html#persistStateDone(akka.actor.typed.ActorRef,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the state has been successfully persisted.
		`context` \- context returned by `persistStateWritten`
		- #### persistFailed
		
		
		
		```
		public void persistFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                          java.lang.Throwable throwable,
		                          java.lang.Object state,
		                          long revision,
		                          java.lang.Object context)
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))`
		Record persistence persist failure.
		 
		
		Specified by:
		`[persistFailed](DurableStateBehaviorInstrumentation.html#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`state` \- the state that was to be persisted.
		`revision` \- the sequence number associated with the failure
		`context` \- context returned by `persistStateCalled`
		- #### dependencies
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Description copied from interface: `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html#dependencies())`
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Specified by:
		`[dependencies](DurableStateBehaviorInstrumentation.html#dependencies())` in interface `[DurableStateBehaviorInstrumentation](DurableStateBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Returns:
		list of class names for optional instrumentation dependencies

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html)*