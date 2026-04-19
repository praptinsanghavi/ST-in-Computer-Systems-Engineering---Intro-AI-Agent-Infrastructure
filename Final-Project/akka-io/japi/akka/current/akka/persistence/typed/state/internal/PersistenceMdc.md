---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistenceMdc.html
title: PersistenceMdc
---

# PersistenceMdc

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class PersistenceMdc

- java.lang.Object
- - akka.persistence.typed.state.internal.PersistenceMdc

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
	| `static java.lang.String` | `[AwaitingPermit](#AwaitingPermit())()` |  |
	| `static java.lang.String` | `[Initializing](#Initializing())()` |  |
	| `static java.lang.String` | `[PersistenceIdKey](#PersistenceIdKey())()` |  |
	| `static java.lang.String` | `[PersistencePhaseKey](#PersistencePhaseKey())()` |  |
	| `static java.lang.String` | `[PersistingState](#PersistingState())()` |  |
	| `static java.lang.String` | `[RecoveringState](#RecoveringState())()` |  |
	| `static java.lang.String` | `[RunningCmds](#RunningCmds())()` |  |
	| `static void` | `[setMdc](#setMdc(akka.persistence.typed.PersistenceId,java.lang.String))​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,  java.lang.String phase)` |  |
	
	
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
		- #### RecoveringState
		
		
		
		```
		public static java.lang.String RecoveringState()
		```
		- #### RunningCmds
		
		
		
		```
		public static java.lang.String RunningCmds()
		```
		- #### PersistingState
		
		
		
		```
		public static java.lang.String PersistingState()
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
		public static void setMdc​([PersistenceId](../../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                          java.lang.String phase)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistenceMdc.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistenceMdc.html)*