---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html
title: EventsourcedEnsemble
---

# EventsourcedEnsemble

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Class EventsourcedEnsemble

- java.lang.Object
- - akka.persistence.telemetry.EventsourcedEnsemble

- All Implemented Interfaces:
`[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`

---

```
public class EventsourcedEnsemble
extends java.lang.Object
implements [EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsourcedEnsemble](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[afterRequestRecoveryPermit](#afterRequestRecoveryPermit(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object context)` | Record after a recovery permit is requested. |
	| `java.lang.Object` | `[beforeRequestRecoveryPermit](#beforeRequestRecoveryPermit(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record before a recovery permit is requested. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `scala.collection.immutable.Seq<[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")>` | `[instrumentations](#instrumentations())()` |  |
	| `java.lang.Object` | `[persistEventCalled](#persistEventCalled(akka.actor.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object event,  java.lang.Object command)` | Record persist event. |
	| `void` | `[persistEventDone](#persistEventDone(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object context)` | Record event is written and the registered callback is called. |
	| `java.lang.Object` | `[persistEventWritten](#persistEventWritten(akka.actor.ActorRef,java.lang.Object,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object event,  java.lang.Object context)` | Record event is written but the registered callback has not been called yet |
	| `void` | `[persistFailed](#persistFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[persistRejected](#persistRejected(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event,  long seqNr,  java.lang.Object context)` | Record persistence persist failure. |
	| `void` | `[recoveryDone](#recoveryDone(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record persistence recovery done. |
	| `void` | `[recoveryFailed](#recoveryFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Throwable throwable,  java.lang.Object event)` | Record persistence recovery failure. |
	| `void` | `[recoveryStarted](#recoveryStarted(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)` | Record persistence recovery started. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventsourcedEnsemble
		
		
		
		```
		public EventsourcedEnsemble​(scala.collection.immutable.Seq<[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations)
		```

	- ### Method Detail
	
	
	
		- #### afterRequestRecoveryPermit
		
		
		
		```
		public void afterRequestRecoveryPermit​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                       java.lang.Object context)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#afterRequestRecoveryPermit(akka.actor.ActorRef,java.lang.Object))`
		Record after a recovery permit is requested.
		 
		
		Specified by:
		`[afterRequestRecoveryPermit](EventsourcedInstrumentation.html#afterRequestRecoveryPermit(akka.actor.ActorRef,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is requested
		`context` \- returned by `beforeRequestRecoveryPermit`
		- #### beforeRequestRecoveryPermit
		
		
		
		```
		public java.lang.Object beforeRequestRecoveryPermit​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.ActorRef))`
		Record before a recovery permit is requested.
		 
		
		Specified by:
		`[beforeRequestRecoveryPermit](EventsourcedInstrumentation.html#beforeRequestRecoveryPermit(akka.actor.ActorRef))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery permit is about to be requested
		Returns:
		context that will be passed to `afterRequestRecoveryPermit`
		- #### dependencies
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#dependencies())`
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Specified by:
		`[dependencies](EventsourcedInstrumentation.html#dependencies())` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Returns:
		list of class names for optional instrumentation dependencies
		- #### instrumentations
		
		
		
		```
		public scala.collection.immutable.Seq<[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations()
		```
		- #### persistEventCalled
		
		
		
		```
		public java.lang.Object persistEventCalled​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                           java.lang.Object event,
		                                           java.lang.Object command)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#persistEventCalled(akka.actor.ActorRef,java.lang.Object,java.lang.Object))`
		Record persist event.
		 
		
		Specified by:
		`[persistEventCalled](EventsourcedInstrumentation.html#persistEventCalled(akka.actor.ActorRef,java.lang.Object,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event will be sent to the journal.
		`event` \- the event that was submitted for persistence. For persist of several events it will be
		 called for each event in the batch in the same order.
		`command` \- actor message (command), if any (otherwise null), for which the event was emitted.
		Returns:
		context that will be passed to `persistEventWritten`
		- #### persistEventDone
		
		
		
		```
		public void persistEventDone​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                             java.lang.Object context)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#persistEventDone(akka.actor.ActorRef,java.lang.Object))`
		Record event is written and the registered callback is called.
		 
		
		Specified by:
		`[persistEventDone](EventsourcedInstrumentation.html#persistEventDone(akka.actor.ActorRef,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`context` \- context returned by `persistEventWritten`
		- #### persistEventWritten
		
		
		
		```
		public java.lang.Object persistEventWritten​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                                            java.lang.Object event,
		                                            java.lang.Object context)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#persistEventWritten(akka.actor.ActorRef,java.lang.Object,java.lang.Object))`
		Record event is written but the registered callback has not been called yet
		 
		
		Specified by:
		`[persistEventWritten](EventsourcedInstrumentation.html#persistEventWritten(akka.actor.ActorRef,java.lang.Object,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the event has been successfully persisted.
		`event` \- the event that was stored in the journal.
		`context` \- context returned by `persistEventCalled`
		Returns:
		context that will be passed to `persistEventDone`
		- #### persistFailed
		
		
		
		```
		public void persistFailed​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                          java.lang.Throwable throwable,
		                          java.lang.Object event,
		                          long seqNr,
		                          java.lang.Object context)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#persistFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))`
		Record persistence persist failure.
		 
		
		Specified by:
		`[persistFailed](EventsourcedInstrumentation.html#persistFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### persistRejected
		
		
		
		```
		public void persistRejected​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                            java.lang.Throwable throwable,
		                            java.lang.Object event,
		                            long seqNr,
		                            java.lang.Object context)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#persistRejected(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))`
		Record persistence persist failure.
		 
		
		Specified by:
		`[persistRejected](EventsourcedInstrumentation.html#persistRejected(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object,long,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was to be persisted.
		`seqNr` \- the sequence number associated with the failure
		`context` \- context returned by `persistEventCalled`
		- #### recoveryDone
		
		
		
		```
		public void recoveryDone​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#recoveryDone(akka.actor.ActorRef))`
		Record persistence recovery done.
		 
		
		Specified by:
		`[recoveryDone](EventsourcedInstrumentation.html#recoveryDone(akka.actor.ActorRef))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is finished.
		- #### recoveryFailed
		
		
		
		```
		public void recoveryFailed​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef,
		                           java.lang.Throwable throwable,
		                           java.lang.Object event)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#recoveryFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object))`
		Record persistence recovery failure.
		 
		
		Specified by:
		`[recoveryFailed](EventsourcedInstrumentation.html#recoveryFailed(akka.actor.ActorRef,java.lang.Throwable,java.lang.Object))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery has failed.
		`throwable` \- the cause of the failure.
		`event` \- the event that was replayed, if any (otherwise null)
		- #### recoveryStarted
		
		
		
		```
		public void recoveryStarted​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Description copied from interface: `[EventsourcedInstrumentation](EventsourcedInstrumentation.html#recoveryStarted(akka.actor.ActorRef))`
		Record persistence recovery started.
		 
		
		Specified by:
		`[recoveryStarted](EventsourcedInstrumentation.html#recoveryStarted(akka.actor.ActorRef))` in interface `[EventsourcedInstrumentation](EventsourcedInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`actorRef` \- the `ActorRef` for which the recovery is started.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EventsourcedEnsemble.html)*