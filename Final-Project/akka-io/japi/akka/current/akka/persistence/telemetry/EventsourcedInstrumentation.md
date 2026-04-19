---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html
title: EventsourcedInstrumentation
---

# EventsourcedInstrumentation

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Interface EventsourcedInstrumentation

- All Known Implementing Classes:
`[EmptyEventsourcedInstrumentation](EmptyEventsourcedInstrumentation.html "class in akka.persistence.telemetry")`, `[EmptyEventsourcedInstrumentation$](EmptyEventsourcedInstrumentation$.html "class in akka.persistence.telemetry")`, `[EventsourcedEnsemble](EventsourcedEnsemble.html "class in akka.persistence.telemetry")`

---

```
public interface EventsourcedInstrumentation
```

INTERNAL API: Instrumentation SPI for PersistentActor.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterRequestRecoveryPermit](#afterRequestRecoveryPermit(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object context)` | Record after a recovery permit is requested. |
	| `java.lang.Object` | `[beforeRequestRecoveryPermit](#beforeRequestRecoveryPermit(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record before a recovery permit is requested. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `java.lang.Object` | `[persistEventCalled](#persistEventCalled(akka.actor.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object event,  java.lang.Object command)` | Record persist event. |
	| `void` | `[persistEventDone](#persistEventDone(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object context)` | Record event is written and the registered callback is called. |
	| `java.lang.Object` | `[persistEventWritten](#persistEventWritten(akka.actor.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object event,  java.lang.Object context)` | Record event is written but the registered callback has not been called yet |
	| `void` | `[persistFailed](#persistFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[persistRejected](#persistRejected(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[recoveryDone](#recoveryDone(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record persistence recovery done. |
	| `void` | `[recoveryFailed](#recoveryFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event)` | Record persistence recovery failure. |
	| `void` | `[recoveryStarted](#recoveryStarted(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record persistence recovery started. |

- - ### Method Detail
	
	
	
		- #### beforeRequestRecoveryPermit
		
		
		
		```
		java.lang.Object beforeRequestRecoveryPermit​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Record before a recovery permit is requested.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is about to be requested
		Returns:
		context that will be passed to `afterRequestRecoveryPermit`
		- #### afterRequestRecoveryPermit
		
		
		
		```
		void afterRequestRecoveryPermit​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                java.lang.Object context)
		```
		
		Record after a recovery permit is requested.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is requested
		`context` \- returned by `beforeRequestRecoveryPermit`
		- #### recoveryStarted
		
		
		
		```
		void recoveryStarted​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Record persistence recovery started.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is started.
		- #### recoveryDone
		
		
		
		```
		void recoveryDone​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Record persistence recovery done.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is finished.
		- #### recoveryFailed
		
		
		
		```
		void recoveryFailed​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                    java.lang.Throwable throwable,
		                    java.lang.Object event)
		```
		
		Record persistence recovery failure.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was replayed, if any (otherwise null)
		- #### persistEventCalled
		
		
		
		```
		java.lang.Object persistEventCalled​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                    java.lang.Object event,
		                                    java.lang.Object command)
		```
		
		Record persist event.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the event will be sent to the journal.
		`event` \- the event that was submitted for persistence. For persist of several events it will be
		 called for each event in the batch in the same order.
		`command` \- actor message (command), if any (otherwise null), for which the event was emitted.
		Returns:
		context that will be passed to `persistEventWritten`
		- #### persistEventWritten
		
		
		
		```
		java.lang.Object persistEventWritten​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                     java.lang.Object event,
		                                     java.lang.Object context)
		```
		
		Record event is written but the registered callback has not been called yet
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`event` \- the event that was stored in the journal.
		`context` \- context returned by `persistEventCalled`
		Returns:
		context that will be passed to `persistEventDone`
		- #### persistEventDone
		
		
		
		```
		void persistEventDone​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                      java.lang.Object context)
		```
		
		Record event is written and the registered callback is called.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`context` \- context returned by `persistEventWritten`
		- #### persistFailed
		
		
		
		```
		void persistFailed​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                   java.lang.Throwable throwable,
		                   java.lang.Object event,
		                   long seqNr,
		                   java.lang.Object context)
		```
		
		Record persistence persist failure.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### persistRejected
		
		
		
		```
		void persistRejected​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                     java.lang.Throwable throwable,
		                     java.lang.Object event,
		                     long seqNr,
		                     java.lang.Object context)
		```
		
		Record persistence persist failure.
		 
		
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### dependencies
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Returns:
		list of class names for optional instrumentation dependencies

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EmptyEventsourcedInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html)*