---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html
title: DurableStateBehaviorInstrumentation
---

# DurableStateBehaviorInstrumentation

## Content

Package [akka.persistence.typed.telemetry](package-summary.html)
## Interface DurableStateBehaviorInstrumentation

- All Known Implementing Classes:
`[DurableStateBehaviorEnsemble](DurableStateBehaviorEnsemble.html "class in akka.persistence.typed.telemetry")`, `[EmptyDurableStateBehaviorInstrumentation](EmptyDurableStateBehaviorInstrumentation.html "class in akka.persistence.typed.telemetry")`, `[EmptyDurableStateBehaviorInstrumentation$](EmptyDurableStateBehaviorInstrumentation$.html "class in akka.persistence.typed.telemetry")`

---

```
public interface DurableStateBehaviorInstrumentation
```

INTERNAL API: Instrumentation SPI for DurableStateBehavior.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
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

- - ### Method Detail
	
	
	
		- #### actorInitialized
		
		
		
		```
		void actorInitialized​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Initialize state for an EventSourcedBehavior actor.
		- #### beforeRequestRecoveryPermit
		
		
		
		```
		java.lang.Object beforeRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Record before a recovery permit is requested.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is about to be requested
		Returns:
		context that will be passed to `afterRequestRecoveryPermit`
		- #### afterRequestRecoveryPermit
		
		
		
		```
		void afterRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                java.lang.Object context)
		```
		
		Record after a recovery permit is requested.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is requested
		`context` \- returned by `beforeRequestRecoveryPermit`
		- #### recoveryStarted
		
		
		
		```
		void recoveryStarted​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Record persistence recovery started.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is started.
		- #### recoveryDone
		
		
		
		```
		void recoveryDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Record persistence recovery done.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is finished.
		- #### recoveryFailed
		
		
		
		```
		void recoveryFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                    java.lang.Throwable throwable)
		```
		
		Record persistence recovery failure.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		- #### persistStateCalled
		
		
		
		```
		java.lang.Object persistStateCalled​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                    java.lang.Object state,
		                                    java.lang.Object command)
		```
		
		Record persist state.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the state will be sent to the store.
		`state` \- the state that was submitted for persistence.
		`command` \- actor message (command) for which the state update was emitted.
		Returns:
		context that will be passed to `persistStateWritten`
		- #### deleteStateCalled
		
		
		
		```
		java.lang.Object deleteStateCalled​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                   java.lang.Object command)
		```
		
		Record delete state.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the delete state will be sent to the store.
		`command` \- actor message (command) for which the state update was emitted.
		Returns:
		context that will be passed to `persistStateWritten`
		- #### persistStateWritten
		
		
		
		```
		java.lang.Object persistStateWritten​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                     java.lang.Object state,
		                                     java.lang.Object context)
		```
		
		Record state is written but the registered callback has not been called yet
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the state has been successfully persisted.
		`state` \- the state that was stored in the journal.
		`context` \- context returned by `persistStateCalled`
		Returns:
		context that will be passed to `persistStateDone`
		- #### persistStateDone
		
		
		
		```
		void persistStateDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                      java.lang.Object context)
		```
		
		Record state is written and the registered callback is called.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the state has been successfully persisted.
		`context` \- context returned by `persistStateWritten`
		- #### persistFailed
		
		
		
		```
		void persistFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                   java.lang.Throwable throwable,
		                   java.lang.Object state,
		                   long revision,
		                   java.lang.Object context)
		```
		
		Record persistence persist failure.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`state` \- the state that was to be persisted.
		`revision` \- the sequence number associated with the failure
		`context` \- context returned by `persistStateCalled`
		- #### dependencies
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Returns:
		list of class names for optional instrumentation dependencies

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorEnsemble.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/EmptyDurableStateBehaviorInstrumentation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentation.html)*