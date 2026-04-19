---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LatestFirstSystemMessageList$.html
title: LatestFirstSystemMessageList$
---

# LatestFirstSystemMessageList$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class LatestFirstSystemMessageList$

- java.lang.Object
- - akka.actor.typed.internal.LatestFirstSystemMessageList$

- ---

```
public class LatestFirstSystemMessageList$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LatestFirstSystemMessageList$](LatestFirstSystemMessageList$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LatestFirstSystemMessageList$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.LatestFirstSystemMessageList` | `[$colon$colon$extension](#$colon$colon$extension(akka.actor.typed.internal.LatestFirstSystemMessageList,akka.actor.typed.internal.SystemMessage))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this,  [SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") msg)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.actor.typed.internal.LatestFirstSystemMessageList,java.lang.Object))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	| `boolean` | `[isEmpty$extension](#isEmpty$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	| `boolean` | `[nonEmpty$extension](#nonEmpty$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	| `akka.actor.typed.internal.EarliestFirstSystemMessageList` | `[reverse$extension](#reverse$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	| `int` | `[size$extension](#size$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	| `akka.actor.typed.internal.LatestFirstSystemMessageList` | `[tail$extension](#tail$extension(akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LatestFirstSystemMessageList$](LatestFirstSystemMessageList$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LatestFirstSystemMessageList$
		
		
		
		```
		public LatestFirstSystemMessageList$()
		```

	- ### Method Detail
	
	
	
		- #### isEmpty$extension
		
		
		
		```
		public final boolean isEmpty$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### nonEmpty$extension
		
		
		
		```
		public final boolean nonEmpty$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### size$extension
		
		
		
		```
		public final int size$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### tail$extension
		
		
		
		```
		public final akka.actor.typed.internal.LatestFirstSystemMessageList tail$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### reverse$extension
		
		
		
		```
		public final akka.actor.typed.internal.EarliestFirstSystemMessageList reverse$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### $colon$colon$extension
		
		
		
		```
		public final akka.actor.typed.internal.LatestFirstSystemMessageList $colon$colon$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this,
		                                                                                           [SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") msg)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​(akka.actor.typed.internal.LatestFirstSystemMessageList $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LatestFirstSystemMessageList$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LatestFirstSystemMessageList$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LatestFirstSystemMessageList$.html)*