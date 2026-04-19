---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc$.html
title: PersistenceMdc$
---

# PersistenceMdc$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class PersistenceMdc$

- java.lang.Object
- - akka.persistence.typed.internal.PersistenceMdc$

- ---

```
public class PersistenceMdc$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceMdc$](PersistenceMdc$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceMdc$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[AsyncReplicationIntercept](#AsyncReplicationIntercept())()` |  |
	| `java.lang.String` | `[AwaitingPermit](#AwaitingPermit())()` |  |
	| `java.lang.String` | `[Initializing](#Initializing())()` |  |
	| `java.lang.String` | `[PersistenceIdKey](#PersistenceIdKey())()` |  |
	| `java.lang.String` | `[PersistencePhaseKey](#PersistencePhaseKey())()` |  |
	| `java.lang.String` | `[PersistingEvents](#PersistingEvents())()` |  |
	| `java.lang.String` | `[ReplayingEvents](#ReplayingEvents())()` |  |
	| `java.lang.String` | `[ReplayingSnapshot](#ReplayingSnapshot())()` |  |
	| `java.lang.String` | `[RunningCmds](#RunningCmds())()` |  |
	| `void` | `[setMdc](#setMdc(akka.persistence.typed.PersistenceId,java.lang.String))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  java.lang.String phase)` |  |
	| `java.lang.String` | `[StoringSnapshot](#StoringSnapshot())()` |  |
	| `java.lang.String` | `[WaitingAsyncEffect](#WaitingAsyncEffect())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceMdc$](PersistenceMdc$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistenceMdc$
		
		
		
		```
		public PersistenceMdc$()
		```

	- ### Method Detail
	
	
	
		- #### Initializing
		
		
		
		```
		public java.lang.String Initializing()
		```
		- #### AwaitingPermit
		
		
		
		```
		public java.lang.String AwaitingPermit()
		```
		- #### ReplayingSnapshot
		
		
		
		```
		public java.lang.String ReplayingSnapshot()
		```
		- #### ReplayingEvents
		
		
		
		```
		public java.lang.String ReplayingEvents()
		```
		- #### RunningCmds
		
		
		
		```
		public java.lang.String RunningCmds()
		```
		- #### PersistingEvents
		
		
		
		```
		public java.lang.String PersistingEvents()
		```
		- #### WaitingAsyncEffect
		
		
		
		```
		public java.lang.String WaitingAsyncEffect()
		```
		- #### AsyncReplicationIntercept
		
		
		
		```
		public java.lang.String AsyncReplicationIntercept()
		```
		- #### StoringSnapshot
		
		
		
		```
		public java.lang.String StoringSnapshot()
		```
		- #### PersistencePhaseKey
		
		
		
		```
		public java.lang.String PersistencePhaseKey()
		```
		- #### PersistenceIdKey
		
		
		
		```
		public java.lang.String PersistenceIdKey()
		```
		- #### setMdc
		
		
		
		```
		public void setMdc​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                   java.lang.String phase)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/PersistenceMdc$.html)*