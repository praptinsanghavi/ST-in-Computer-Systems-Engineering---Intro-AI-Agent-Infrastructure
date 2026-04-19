---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html
title: ShardingProducerController.Start$
---

# ShardingProducerController.Start$

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingProducerController.Start$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingProducerController.Start$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ShardingProducerController](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery")

---

```
public static class ShardingProducerController.Start$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.delivery.ShardingProducerController.Start$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingProducerController.Start$](ShardingProducerController.Start$.html "class in akka.cluster.sharding.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Start$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> producer)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>>>` | `[unapply](#unapply(akka.cluster.sharding.typed.delivery.ShardingProducerController.Start))​([ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingProducerController.Start$](ShardingProducerController.Start$.html "class in akka.cluster.sharding.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Start$
		
		
		
		```
		public Start$()
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
		public <A> [ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A> apply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>> producer)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ShardingProducerController.RequestNext](ShardingProducerController.RequestNext.html "class in akka.cluster.sharding.typed.delivery")<A>>> unapply​([ShardingProducerController.Start](ShardingProducerController.Start.html "class in akka.cluster.sharding.typed.delivery")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.RequestNext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/ShardingProducerController.Start$.html)*