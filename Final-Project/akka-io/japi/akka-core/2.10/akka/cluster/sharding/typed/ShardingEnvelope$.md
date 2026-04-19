---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:06:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope$.html
title: ShardingEnvelope$
---

# ShardingEnvelope$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingEnvelope$

- java.lang.Object
- - akka.cluster.sharding.typed.ShardingEnvelope$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ShardingEnvelope$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.ShardingEnvelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingEnvelope$](ShardingEnvelope$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(java.lang.String,M))​(java.lang.String entityId,  M message)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<M> scala.Option<scala.Tuple2<java.lang.String,​M>>` | `[unapply](#unapply(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingEnvelope$](ShardingEnvelope$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingEnvelope$
		
		
		
		```
		public ShardingEnvelope$()
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
		public <M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> apply​(java.lang.String entityId,
		                                     M message)
		```
		- #### unapply
		
		
		
		```
		public <M> scala.Option<scala.Tuple2<java.lang.String,​M>> unapply​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope$.html)*