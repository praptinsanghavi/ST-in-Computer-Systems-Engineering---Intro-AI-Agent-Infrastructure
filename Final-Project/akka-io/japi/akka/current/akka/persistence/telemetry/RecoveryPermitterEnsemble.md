---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html
title: RecoveryPermitterEnsemble
---

# RecoveryPermitterEnsemble

## Content

Package [akka.persistence.telemetry](package-summary.html)
## Class RecoveryPermitterEnsemble

- java.lang.Object
- - akka.persistence.telemetry.RecoveryPermitterEnsemble

- All Implemented Interfaces:
`[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")`

---

```
public class RecoveryPermitterEnsemble
extends java.lang.Object
implements [RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryPermitterEnsemble](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `scala.collection.immutable.Seq<[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")>` | `[instrumentations](#instrumentations())()` |  |
	| `void` | `[recoveryPermitterStatus](#recoveryPermitterStatus(akka.actor.ActorRef,int,int,int))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recoveryPermitter,  int maxPermits,  int usedPermits,  int pendingActors)` | Record recovery permitter status \- invoked after an actor has requested a permit. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecoveryPermitterEnsemble
		
		
		
		```
		public RecoveryPermitterEnsemble​(scala.collection.immutable.Seq<[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations)
		```

	- ### Method Detail
	
	
	
		- #### dependencies
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Description copied from interface: `[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html#dependencies())`
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Specified by:
		`[dependencies](RecoveryPermitterInstrumentation.html#dependencies())` in interface `[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")`
		Returns:
		list of class names for optional instrumentation dependencies
		- #### instrumentations
		
		
		
		```
		public scala.collection.immutable.Seq<[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")> instrumentations()
		```
		- #### recoveryPermitterStatus
		
		
		
		```
		public void recoveryPermitterStatus​([ActorRef](../../actor/ActorRef.html "class in akka.actor") recoveryPermitter,
		                                    int maxPermits,
		                                    int usedPermits,
		                                    int pendingActors)
		```
		
		Description copied from interface: `[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html#recoveryPermitterStatus(akka.actor.ActorRef,int,int,int))`
		Record recovery permitter status \- invoked after an actor has requested a permit.
		 
		
		Specified by:
		`[recoveryPermitterStatus](RecoveryPermitterInstrumentation.html#recoveryPermitterStatus(akka.actor.ActorRef,int,int,int))` in interface `[RecoveryPermitterInstrumentation](RecoveryPermitterInstrumentation.html "interface in akka.persistence.telemetry")`
		Parameters:
		`recoveryPermitter` \- `ActorRef` handling the permits for this actor
		 system.
		`maxPermits` \- the max permits set (via configuration).
		`usedPermits` \- the number of used (issued) permits.
		`pendingActors` \- number of pending actors waiting for a permit.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html](https://doc.akka.io/japi/akka/current/akka/persistence/telemetry/RecoveryPermitterEnsemble.html)*