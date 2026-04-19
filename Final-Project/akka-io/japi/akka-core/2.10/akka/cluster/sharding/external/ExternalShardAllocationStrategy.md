---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation$.html
title: ExternalShardAllocationStrategy.ShardLocation$
---

# ExternalShardAllocationStrategy.ShardLocation$

## Content

Package [akka.cluster.sharding.external](package-summary.html)
## Class ExternalShardAllocationStrategy.ShardLocation$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")\>
	- - akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")>`

Enclosing class:
[ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html "class in akka.cluster.sharding.external")

---

```
public static class ExternalShardAllocationStrategy.ShardLocation$
extends scala.runtime.AbstractFunction1<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExternalShardAllocationStrategy.ShardLocation$](ExternalShardAllocationStrategy.ShardLocation$.html "class in akka.cluster.sharding.external")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardLocation$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")` | `[apply](#apply(akka.actor.Address))​([Address](../../../actor/Address.html "class in akka.actor") address)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Address](../../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.sharding.external.ExternalShardAllocationStrategy.ShardLocation))​([ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExternalShardAllocationStrategy.ShardLocation$](ExternalShardAllocationStrategy.ShardLocation$.html "class in akka.cluster.sharding.external") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardLocation$
		
		
		
		```
		public ShardLocation$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")>`
		- #### apply
		
		
		
		```
		public [ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external") apply​([Address](../../../actor/Address.html "class in akka.actor") address)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Address](../../../actor/Address.html "class in akka.actor"),​[ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../../../actor/Address.html "class in akka.actor")> unapply​([ExternalShardAllocationStrategy.ShardLocation](ExternalShardAllocationStrategy.ShardLocation.html "class in akka.cluster.sharding.external") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.ShardLocation$.html)*