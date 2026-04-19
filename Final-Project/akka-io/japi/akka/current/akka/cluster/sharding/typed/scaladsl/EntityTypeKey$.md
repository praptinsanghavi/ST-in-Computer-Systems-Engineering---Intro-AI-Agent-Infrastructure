---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
title: EntityTypeKey$
---

# EntityTypeKey$

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Class EntityTypeKey$

- java.lang.Object
- - akka.cluster.sharding.typed.scaladsl.EntityTypeKey$

- ---

```
public class EntityTypeKey$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EntityTypeKey$](EntityTypeKey$.html "class in akka.cluster.sharding.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTypeKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag))​(java.lang.String name,  scala.reflect.ClassTag<T> tTag)` | Creates an `EntityTypeKey`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EntityTypeKey$](EntityTypeKey$.html "class in akka.cluster.sharding.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EntityTypeKey$
		
		
		
		```
		public EntityTypeKey$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<T> apply​(java.lang.String name,
		                                  scala.reflect.ClassTag<T> tTag)
		```
		
		Creates an `EntityTypeKey`. The `name` must be unique.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html)*