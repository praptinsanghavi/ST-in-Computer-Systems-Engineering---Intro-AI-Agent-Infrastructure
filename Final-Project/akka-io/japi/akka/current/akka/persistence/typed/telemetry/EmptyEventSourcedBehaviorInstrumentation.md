---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html
title: EmptyEventSourcedBehaviorInstrumentation
---

# EmptyEventSourcedBehaviorInstrumentation

## Content

Package [akka.persistence.typed.telemetry](package-summary.html)
## Class EmptyEventSourcedBehaviorInstrumentation

- java.lang.Object
- - akka.persistence.typed.telemetry.EmptyEventSourcedBehaviorInstrumentation

- All Implemented Interfaces:
`[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`

Direct Known Subclasses:
`[EmptyEventSourcedBehaviorInstrumentation$](EmptyEventSourcedBehaviorInstrumentation$.html "class in akka.persistence.typed.telemetry")`

---

```
public class EmptyEventSourcedBehaviorInstrumentation
extends java.lang.Object
implements [EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyEventSourcedBehaviorInstrumentation](#%3Cinit%3E())()` |  |
	| `[EmptyEventSourcedBehaviorInstrumentation](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[actorInitialized](#actorInitialized(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Initialize state for an EventSourcedBehavior actor. |
	| `void` | `[afterRequestRecoveryPermit](#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object context)` | Record after a recovery permit is requested. |
	| `java.lang.Object` | `[beforeRequestRecoveryPermit](#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record before a recovery permit is requested. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `java.lang.Object` | `[persistEventCalled](#persistEventCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object event,  java.lang.Object command)` | Record persist event. |
	| `void` | `[persistEventDone](#persistEventDone(akka.actor.typed.ActorRef,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object context)` | Record event is written and the registered callback is called. |
	| `java.lang.Object` | `[persistEventWritten](#persistEventWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Object event,  java.lang.Object context)` | Record event is written but the registered callback has not been called yet |
	| `void` | `[persistFailed](#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[persistRejected](#persistRejected(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[recoveryDone](#recoveryDone(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record persistence recovery done. |
	| `void` | `[recoveryFailed](#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,  java.lang.Throwable throwable,  java.lang.Object event)` | Record persistence recovery failure. |
	| `void` | `[recoveryStarted](#recoveryStarted(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)` | Record persistence recovery started. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyEventSourcedBehaviorInstrumentation
		
		
		
		```
		public EmptyEventSourcedBehaviorInstrumentation()
		```
		- #### EmptyEventSourcedBehaviorInstrumentation
		
		
		
		```
		public EmptyEventSourcedBehaviorInstrumentation​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### actorInitialized
		
		
		
		```
		public void actorInitialized​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#actorInitialized(akka.actor.typed.ActorRef))`
		Initialize state for an EventSourcedBehavior actor.
		
		Specified by:
		`[actorInitialized](EventSourcedBehaviorInstrumentation.html#actorInitialized(akka.actor.typed.ActorRef))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		- #### beforeRequestRecoveryPermit
		
		
		
		```
		public java.lang.Object beforeRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))`
		Record before a recovery permit is requested.
		 
		
		Specified by:
		`[beforeRequestRecoveryPermit](EventSourcedBehaviorInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.typed.ActorRef))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is about to be requested
		Returns:
		context that will be passed to `afterRequestRecoveryPermit`
		- #### afterRequestRecoveryPermit
		
		
		
		```
		public void afterRequestRecoveryPermit​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                       java.lang.Object context)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))`
		Record after a recovery permit is requested.
		 
		
		Specified by:
		`[afterRequestRecoveryPermit](EventSourcedBehaviorInstrumentation.html#afterRequestRecoveryPermit(akka.actor.typed.ActorRef,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is requested
		`context` \- returned by `beforeRequestRecoveryPermit`
		- #### recoveryStarted
		
		
		
		```
		public void recoveryStarted​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#recoveryStarted(akka.actor.typed.ActorRef))`
		Record persistence recovery started.
		 
		
		Specified by:
		`[recoveryStarted](EventSourcedBehaviorInstrumentation.html#recoveryStarted(akka.actor.typed.ActorRef))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is started.
		- #### recoveryDone
		
		
		
		```
		public void recoveryDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#recoveryDone(akka.actor.typed.ActorRef))`
		Record persistence recovery done.
		 
		
		Specified by:
		`[recoveryDone](EventSourcedBehaviorInstrumentation.html#recoveryDone(akka.actor.typed.ActorRef))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is finished.
		- #### recoveryFailed
		
		
		
		```
		public void recoveryFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                           java.lang.Throwable throwable,
		                           java.lang.Object event)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object))`
		Record persistence recovery failure.
		 
		
		Specified by:
		`[recoveryFailed](EventSourcedBehaviorInstrumentation.html#recoveryFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was replayed, if any (otherwise null)
		- #### persistEventCalled
		
		
		
		```
		public java.lang.Object persistEventCalled​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                           java.lang.Object event,
		                                           java.lang.Object command)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#persistEventCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))`
		Record persist event.
		 
		
		Specified by:
		`[persistEventCalled](EventSourcedBehaviorInstrumentation.html#persistEventCalled(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event will be sent to the journal.
		`event` \- the event that was submitted for persistence. For persist of several events it will be
		 called for each event in the batch in the same order.
		`command` \- actor message (command), if any (otherwise null), for which the event was emitted.
		Returns:
		context that will be passed to `persistEventWritten`
		- #### persistEventWritten
		
		
		
		```
		public java.lang.Object persistEventWritten​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                                            java.lang.Object event,
		                                            java.lang.Object context)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#persistEventWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))`
		Record event is written but the registered callback has not been called yet
		 
		
		Specified by:
		`[persistEventWritten](EventSourcedBehaviorInstrumentation.html#persistEventWritten(akka.actor.typed.ActorRef,java.lang.Object,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`event` \- the event that was stored in the journal.
		`context` \- context returned by `persistEventCalled`
		Returns:
		context that will be passed to `persistEventDone`
		- #### persistEventDone
		
		
		
		```
		public void persistEventDone​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                             java.lang.Object context)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#persistEventDone(akka.actor.typed.ActorRef,java.lang.Object))`
		Record event is written and the registered callback is called.
		 
		
		Specified by:
		`[persistEventDone](EventSourcedBehaviorInstrumentation.html#persistEventDone(akka.actor.typed.ActorRef,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`context` \- context returned by `persistEventWritten`
		- #### persistFailed
		
		
		
		```
		public void persistFailed​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                          java.lang.Throwable throwable,
		                          java.lang.Object event,
		                          long seqNr,
		                          java.lang.Object context)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))`
		Record persistence persist failure.
		 
		
		Specified by:
		`[persistFailed](EventSourcedBehaviorInstrumentation.html#persistFailed(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### persistRejected
		
		
		
		```
		public void persistRejected​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<?> actorRef,
		                            java.lang.Throwable throwable,
		                            java.lang.Object event,
		                            long seqNr,
		                            java.lang.Object context)
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#persistRejected(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))`
		Record persistence persist failure.
		 
		
		Specified by:
		`[persistRejected](EventSourcedBehaviorInstrumentation.html#persistRejected(akka.actor.typed.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### dependencies
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Description copied from interface: `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html#dependencies())`
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Specified by:
		`[dependencies](EventSourcedBehaviorInstrumentation.html#dependencies())` in interface `[EventSourcedBehaviorInstrumentation](EventSourcedBehaviorInstrumentation.html "interface in akka.persistence.typed.telemetry")`
		Returns:
		list of class names for optional instrumentation dependencies

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/telemetry/EmptyEventSourcedBehaviorInstrumentation.html)*