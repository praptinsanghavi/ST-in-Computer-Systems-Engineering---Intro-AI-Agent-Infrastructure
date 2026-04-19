---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers$.html
title: Dispatchers$
---

# Dispatchers$

## Content

Package [akka.dispatch](package-summary.html)
## Class Dispatchers$

- java.lang.Object
- - akka.dispatch.Dispatchers$

- ---

```
public class Dispatchers$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Dispatchers$](Dispatchers$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dispatchers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[DefaultBlockingDispatcherId](#DefaultBlockingDispatcherId())()` | The id of a default dispatcher to use for operations known to be blocking. |
	| `java.lang.String` | `[DefaultDispatcherId](#DefaultDispatcherId())()` | The id of the default dispatcher, also the full key of the  configuration of the default dispatcher. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Dispatchers$](Dispatchers$.html "class in akka.dispatch") MODULE$
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
		- #### DefaultBlockingDispatcherId
		
		
		
		```
		public final java.lang.String DefaultBlockingDispatcherId()
		```
		
		The id of a default dispatcher to use for operations known to be blocking. Note that
		 for optimal performance you will want to isolate different blocking resources
		 on different thread pools.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers$.html)*