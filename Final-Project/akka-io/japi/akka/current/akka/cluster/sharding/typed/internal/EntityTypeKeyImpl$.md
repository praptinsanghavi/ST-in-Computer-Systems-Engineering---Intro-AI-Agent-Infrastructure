---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/EntityTypeKeyImpl$.html
title: EntityTypeKeyImpl$
---

# EntityTypeKeyImpl$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class EntityTypeKeyImpl$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.EntityTypeKeyImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EntityTypeKeyImpl$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.internal.EntityTypeKeyImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EntityTypeKeyImpl$](EntityTypeKeyImpl$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTypeKeyImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.cluster.sharding.typed.internal.EntityTypeKeyImpl<T>` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String messageClassName)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.cluster.sharding.typed.internal.EntityTypeKeyImpl))​(akka.cluster.sharding.typed.internal.EntityTypeKeyImpl<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EntityTypeKeyImpl$](EntityTypeKeyImpl$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EntityTypeKeyImpl$
		
		
		
		```
		public EntityTypeKeyImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> akka.cluster.sharding.typed.internal.EntityTypeKeyImpl<T> apply​(java.lang.String name,
		                                                                           java.lang.String messageClassName)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​(akka.cluster.sharding.typed.internal.EntityTypeKeyImpl<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/EntityTypeKeyImpl$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/EntityTypeKeyImpl$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/EntityTypeKeyImpl$.html)*