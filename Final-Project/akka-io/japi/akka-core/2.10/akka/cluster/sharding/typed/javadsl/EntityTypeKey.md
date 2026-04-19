---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
title: EntityTypeKey
---

# EntityTypeKey

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class EntityTypeKey\<T\>

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.EntityTypeKey\<T\>

- ---

```
public abstract class EntityTypeKey<T>
extends java.lang.Object
```

The key of an entity type, the `name` must be unique.
 
 Not for user extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTypeKey](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<T>` | `[create](#create(java.lang.Class,java.lang.String))​(java.lang.Class<T> messageClass,  java.lang.String name)` | Creates an `EntityTypeKey`. |
	| `abstract java.lang.String` | `[name](#name())()` | Name of the entity type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityTypeKey
		
		
		
		```
		public EntityTypeKey()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<T> create​(java.lang.Class<T> messageClass,
		                                          java.lang.String name)
		```
		
		Creates an `EntityTypeKey`. The `name` must be unique.
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		Name of the entity type.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html)*