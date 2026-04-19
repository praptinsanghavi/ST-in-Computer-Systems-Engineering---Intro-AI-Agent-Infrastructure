---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EarliestFirstSystemMessageList$.html
title: EarliestFirstSystemMessageList$
---

# EarliestFirstSystemMessageList$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class EarliestFirstSystemMessageList$

- java.lang.Object
- - akka.actor.typed.internal.EarliestFirstSystemMessageList$

- ---

```
public class EarliestFirstSystemMessageList$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EarliestFirstSystemMessageList$](EarliestFirstSystemMessageList$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EarliestFirstSystemMessageList$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.EarliestFirstSystemMessageList` | `[$colon$colon$extension](#$colon$colon$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList,akka.actor.typed.internal.SystemMessage))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,  [SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") msg)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList,java.lang.Object))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	| `boolean` | `[isEmpty$extension](#isEmpty$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	| `boolean` | `[nonEmpty$extension](#nonEmpty$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	| `akka.actor.typed.internal.LatestFirstSystemMessageList` | `[reverse$extension](#reverse$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	| `akka.actor.typed.internal.EarliestFirstSystemMessageList` | `[reversePrepend$extension](#reversePrepend$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList,akka.actor.typed.internal.LatestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,  akka.actor.typed.internal.LatestFirstSystemMessageList other)` |  |
	| `int` | `[size$extension](#size$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	| `akka.actor.typed.internal.EarliestFirstSystemMessageList` | `[tail$extension](#tail$extension(akka.actor.typed.internal.EarliestFirstSystemMessageList))​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EarliestFirstSystemMessageList$](EarliestFirstSystemMessageList$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EarliestFirstSystemMessageList$
		
		
		
		```
		public EarliestFirstSystemMessageList$()
		```

	- ### Method Detail
	
	
	
		- #### isEmpty$extension
		
		
		
		```
		public final boolean isEmpty$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### nonEmpty$extension
		
		
		
		```
		public final boolean nonEmpty$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### size$extension
		
		
		
		```
		public final int size$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### tail$extension
		
		
		
		```
		public final akka.actor.typed.internal.EarliestFirstSystemMessageList tail$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### reverse$extension
		
		
		
		```
		public final akka.actor.typed.internal.LatestFirstSystemMessageList reverse$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### $colon$colon$extension
		
		
		
		```
		public final akka.actor.typed.internal.EarliestFirstSystemMessageList $colon$colon$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,
		                                                                                             [SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") msg)
		```
		- #### reversePrepend$extension
		
		
		
		```
		public final akka.actor.typed.internal.EarliestFirstSystemMessageList reversePrepend$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,
		                                                                                               akka.actor.typed.internal.LatestFirstSystemMessageList other)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​(akka.actor.typed.internal.EarliestFirstSystemMessageList $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EarliestFirstSystemMessageList$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EarliestFirstSystemMessageList$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/EarliestFirstSystemMessageList$.html)*