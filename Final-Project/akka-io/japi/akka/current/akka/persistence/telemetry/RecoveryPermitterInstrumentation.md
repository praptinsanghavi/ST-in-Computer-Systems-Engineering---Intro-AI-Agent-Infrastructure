---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
title: RecoveryPermitterInstrumentation
---

# RecoveryPermitterInstrumentation

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Interface RecoveryPermitterInstrumentation

- All Known Implementing Classes:
`[EmptyRecoveryPermitterInstrumentation](EmptyRecoveryPermitterInstrumentation.html "class in akka.persistence.telemetry")`, `[EmptyRecoveryPermitterInstrumentation$](EmptyRecoveryPermitterInstrumentation$.html "class in akka.persistence.telemetry")`, `[RecoveryPermitterEnsemble](RecoveryPermitterEnsemble.html "class in akka.persistence.telemetry")`

---

```
public interface RecoveryPermitterInstrumentation
```

INTERNAL API: Instrumentation SPI for PersistentActor.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `void` | `[recoveryPermitterStatus](#recoveryPermitterStatus(akka.actor.ActorRef,int,int,int))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recoveryPermitter,  int maxPermits,  int usedPermits,  int pendingActors)` | Record recovery permitter status \- invoked after an actor has requested a permit. |

- - ### Method Detail
	
	
	
		- #### dependencies
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Returns:
		list of class names for optional instrumentation dependencies
		- #### recoveryPermitterStatus
		
		
		
		```
		void recoveryPermitterStatus​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recoveryPermitter,
		                             int maxPermits,
		                             int usedPermits,
		                             int pendingActors)
		```
		
		Record recovery permitter status \- invoked after an actor has requested a permit.
		 
		
		Parameters:
		`recoveryPermitter` \- `ActorRef` handling the permits for this actor
		 system.
		`maxPermits` \- the max permits set (via configuration).
		`usedPermits` \- the number of used (issued) permits.
		`pendingActors` \- number of pending actors waiting for a permit.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/EmptyRecoveryPermitterInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html)*