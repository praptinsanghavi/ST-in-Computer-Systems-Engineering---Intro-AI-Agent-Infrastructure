---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout$.html
title: ReceiveTimeout$
---

# ReceiveTimeout$

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class ReceiveTimeout$

- java.lang.Object
- - akka.actor.dungeon.ReceiveTimeout$

- ---

```
public class ReceiveTimeout$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor.dungeon")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceiveTimeout$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")>` | `[emptyReceiveTimeoutData](#emptyReceiveTimeoutData())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor.dungeon") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReceiveTimeout$
		
		
		
		```
		public ReceiveTimeout$()
		```

	- ### Method Detail
	
	
	
		- #### emptyReceiveTimeoutData
		
		
		
		```
		public final scala.Tuple2<scala.concurrent.duration.Duration,​[Cancellable](../Cancellable.html "interface in akka.actor")> emptyReceiveTimeoutData()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout$.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout$.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ReceiveTimeout$.html)*