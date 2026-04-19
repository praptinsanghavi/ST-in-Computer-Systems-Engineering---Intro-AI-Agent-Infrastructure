---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc.html
title: PersistenceMdc
---

# PersistenceMdc

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class PersistenceMdc

- java.lang.Object
- - akka.persistence.typed.internal.PersistenceMdc

- ---

```
public class PersistenceMdc
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceMdc](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[AsyncReplicationIntercept](#AsyncReplicationIntercept())()` |  |
	| `static java.lang.String` | `[AwaitingPermit](#AwaitingPermit())()` |  |
	| `static java.lang.String` | `[Initializing](#Initializing())()` |  |
	| `static java.lang.String` | `[PersistenceIdKey](#PersistenceIdKey())()` |  |
	| `static java.lang.String` | `[PersistencePhaseKey](#PersistencePhaseKey())()` |  |
	| `static java.lang.String` | `[PersistingEvents](#PersistingEvents())()` |  |
	| `static java.lang.String` | `[ReplayingEvents](#ReplayingEvents())()` |  |
	| `static java.lang.String` | `[ReplayingSnapshot](#ReplayingSnapshot())()` |  |
	| `static java.lang.String` | `[RunningCmds](#RunningCmds())()` |  |
	| `static void` | `[setMdc](#setMdc(akka.persistence.typed.PersistenceId,java.lang.String))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  java.lang.String phase)` |  |
	| `static java.lang.String` | `[StoringSnapshot](#StoringSnapshot())()` |  |
	| `static java.lang.String` | `[WaitingAsyncEffect](#WaitingAsyncEffect())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceMdc
		
		
		
		```
		public PersistenceMdc()
		```

	- ### Method Detail
	
	
	
		- #### Initializing
		
		
		
		```
		public static java.lang.String Initializing()
		```
		- #### AwaitingPermit
		
		
		
		```
		public static java.lang.String AwaitingPermit()
		```
		- #### ReplayingSnapshot
		
		
		
		```
		public static java.lang.String ReplayingSnapshot()
		```
		- #### ReplayingEvents
		
		
		
		```
		public static java.lang.String ReplayingEvents()
		```
		- #### RunningCmds
		
		
		
		```
		public static java.lang.String RunningCmds()
		```
		- #### PersistingEvents
		
		
		
		```
		public static java.lang.String PersistingEvents()
		```
		- #### WaitingAsyncEffect
		
		
		
		```
		public static java.lang.String WaitingAsyncEffect()
		```
		- #### AsyncReplicationIntercept
		
		
		
		```
		public static java.lang.String AsyncReplicationIntercept()
		```
		- #### StoringSnapshot
		
		
		
		```
		public static java.lang.String StoringSnapshot()
		```
		- #### PersistencePhaseKey
		
		
		
		```
		public static java.lang.String PersistencePhaseKey()
		```
		- #### PersistenceIdKey
		
		
		
		```
		public static java.lang.String PersistenceIdKey()
		```
		- #### setMdc
		
		
		
		```
		public static void setMdc​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                          java.lang.String phase)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc.html)*