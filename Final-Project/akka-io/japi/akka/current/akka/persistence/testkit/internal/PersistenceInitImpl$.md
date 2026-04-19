---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PersistenceInitImpl$.html
title: PersistenceInitImpl$
---

# PersistenceInitImpl$

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class PersistenceInitImpl$

- java.lang.Object
- - akka.persistence.testkit.internal.PersistenceInitImpl$

- ---

```
public class PersistenceInitImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceInitImpl$](PersistenceInitImpl$.html "class in akka.persistence.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceInitImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String journalPluginId,  java.lang.String snapshotPluginId,  java.lang.String persistenceId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceInitImpl$](PersistenceInitImpl$.html "class in akka.persistence.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistenceInitImpl$
		
		
		
		```
		public PersistenceInitImpl$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../../actor/Props.html "class in akka.actor") props​(java.lang.String journalPluginId,
		                   java.lang.String snapshotPluginId,
		                   java.lang.String persistenceId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PersistenceInitImpl$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PersistenceInitImpl$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PersistenceInitImpl$.html)*