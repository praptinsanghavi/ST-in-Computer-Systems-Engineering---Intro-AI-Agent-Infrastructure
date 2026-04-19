---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings$.html
title: ShardingProducerController.Settings$
---

# ShardingProducerController.Settings$

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingProducerController.Settings$

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingProducerController.Settings$

- Enclosing class:
[ShardingProducerController](ShardingProducerController.html "class in akka.cluster.sharding.typed.delivery")

---

```
public static class ShardingProducerController.Settings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingProducerController.Settings$](ShardingProducerController.Settings$.html "class in akka.cluster.sharding.typed.delivery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`  of the `ActorSystem`. |
	| `[ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Factory method from Config corresponding to  `akka.reliable-delivery.sharding.producer-controller`. |
	| `[ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`  of the `ActorSystem`. |
	| `[ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Factory method from Config corresponding to  `akka.reliable-delivery.sharding.producer-controller`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingProducerController.Settings$](ShardingProducerController.Settings$.html "class in akka.cluster.sharding.typed.delivery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Settings$
		
		
		
		```
		public Settings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") apply​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`
		 of the `ActorSystem`.
		- #### apply
		
		
		
		```
		public [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Factory method from Config corresponding to
		 `akka.reliable-delivery.sharding.producer-controller`.
		- #### create
		
		
		
		```
		public [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") create​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Factory method from config `akka.reliable-delivery.sharding.producer-controller`
		 of the `ActorSystem`.
		- #### create
		
		
		
		```
		public [ShardingProducerController.Settings](ShardingProducerController.Settings.html "class in akka.cluster.sharding.typed.delivery") create​(com.typesafe.config.Config config)
		```
		
		Java API: Factory method from Config corresponding to
		 `akka.reliable-delivery.sharding.producer-controller`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingProducerController.Settings$.html)*