---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Dispatchers$.html
title: Dispatchers$
---

# Dispatchers$

## Content

Package [akka.actor.typed](package-summary.html)
## Class Dispatchers$

- java.lang.Object
- - akka.actor.typed.Dispatchers$

- ---

```
public class Dispatchers$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Dispatchers$](Dispatchers$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dispatchers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[DefaultDispatcherId](#DefaultDispatcherId())()` | The id of the default dispatcher, also the full key of the  configuration of the default dispatcher. |
	| `java.lang.String` | `[InternalDispatcherId](#InternalDispatcherId())()` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Dispatchers$](Dispatchers$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Dispatchers$
		
		
		
		```
		public Dispatchers$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultDispatcherId
		
		
		
		```
		public final java.lang.String DefaultDispatcherId()
		```
		
		The id of the default dispatcher, also the full key of the
		 configuration of the default dispatcher.
		- #### InternalDispatcherId
		
		
		
		```
		public final java.lang.String InternalDispatcherId()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Dispatchers$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Dispatchers$.html)*