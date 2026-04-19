---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessageList$.html
title: SystemMessageList$
---

# SystemMessageList$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class SystemMessageList$

- java.lang.Object
- - akka.actor.typed.internal.SystemMessageList$

- ---

```
public class SystemMessageList$
extends java.lang.Object
```

INTERNAL API
 
 Helper companion object for `LatestFirstSystemMessageList` and
 `EarliestFirstSystemMessageList`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SystemMessageList$](SystemMessageList$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SystemMessageList$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.EarliestFirstSystemMessageList` | `[ENil](#ENil())()` |  |
	| `akka.actor.typed.internal.LatestFirstSystemMessageList` | `[LNil](#LNil())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SystemMessageList$](SystemMessageList$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SystemMessageList$
		
		
		
		```
		public SystemMessageList$()
		```

	- ### Method Detail
	
	
	
		- #### LNil
		
		
		
		```
		public final akka.actor.typed.internal.LatestFirstSystemMessageList LNil()
		```
		- #### ENil
		
		
		
		```
		public final akka.actor.typed.internal.EarliestFirstSystemMessageList ENil()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessageList$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessageList$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessageList$.html)*