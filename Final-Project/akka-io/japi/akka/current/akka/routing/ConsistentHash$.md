---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash$.html
title: ConsistentHash$
---

# ConsistentHash$

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHash$

- java.lang.Object
- - akka.routing.ConsistentHash$

- ---

```
public class ConsistentHash$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsistentHash$](ConsistentHash$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHash$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T>` | `[apply](#apply(scala.collection.Iterable,int,scala.reflect.ClassTag))​(scala.collection.Iterable<T> nodes,  int virtualNodesFactor,  scala.reflect.ClassTag<T> evidence$2)` |  |
	| `<T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T>` | `[create](#create(java.lang.Iterable,int))​(java.lang.Iterable<T> nodes,  int virtualNodesFactor)` | Java API: Factory method to create a ConsistentHash |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsistentHash$](ConsistentHash$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsistentHash$
		
		
		
		```
		public ConsistentHash$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T> apply​(scala.collection.Iterable<T> nodes,
		                                   int virtualNodesFactor,
		                                   scala.reflect.ClassTag<T> evidence$2)
		```
		- #### create
		
		
		
		```
		public <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T> create​(java.lang.Iterable<T> nodes,
		                                    int virtualNodesFactor)
		```
		
		Java API: Factory method to create a ConsistentHash

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash$.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash$.html](https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHash$.html)*