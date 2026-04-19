---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/receptionist/ShardedServiceRegistry$.html
title: ShardedServiceRegistry$
---

# ShardedServiceRegistry$

## Content

Package [akka.cluster.typed.internal.receptionist](package-summary.html)
## Class ShardedServiceRegistry$

- java.lang.Object
- - akka.cluster.typed.internal.receptionist.ShardedServiceRegistry$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ShardedServiceRegistry$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.typed.internal.receptionist.ShardedServiceRegistry$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedServiceRegistry$](ShardedServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedServiceRegistry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.typed.internal.receptionist.ShardedServiceRegistry` | `[apply](#apply(int))​(int numberOfKeys)` |  |
	| `akka.cluster.typed.internal.receptionist.ShardedServiceRegistry` | `[apply](#apply(scala.collection.immutable.Map,scala.collection.immutable.Set,scala.collection.immutable.Set))​(scala.collection.immutable.Map<[ORMultiMapKey](../../../ddata/ORMultiMapKey.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>,​akka.cluster.typed.internal.receptionist.ServiceRegistry> serviceRegistries,  scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")> nodes,  scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")> unreachable)` | INTERNAL API |
	| `scala.Option<scala.Tuple3<scala.collection.immutable.Map<[ORMultiMapKey](../../../ddata/ORMultiMapKey.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>,​akka.cluster.typed.internal.receptionist.ServiceRegistry>,​scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")>>>` | `[unapply](#unapply(akka.cluster.typed.internal.receptionist.ShardedServiceRegistry))​(akka.cluster.typed.internal.receptionist.ShardedServiceRegistry x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedServiceRegistry$](ShardedServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardedServiceRegistry$
		
		
		
		```
		public ShardedServiceRegistry$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ShardedServiceRegistry apply​(int numberOfKeys)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ShardedServiceRegistry apply​(scala.collection.immutable.Map<[ORMultiMapKey](../../../ddata/ORMultiMapKey.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>,​akka.cluster.typed.internal.receptionist.ServiceRegistry> serviceRegistries,
		                                                                             scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")> nodes,
		                                                                             scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")> unreachable)
		```
		
		INTERNAL API
		 
		 Two level structure for keeping service registry to be able to shard entries over multiple ddata keys (to not
		 get too large ddata messages)
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<scala.collection.immutable.Map<[ORMultiMapKey](../../../ddata/ORMultiMapKey.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>,​akka.cluster.typed.internal.receptionist.ServiceRegistry>,​scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")>,​scala.collection.immutable.Set<[UniqueAddress](../../../UniqueAddress.html "class in akka.cluster")>>> unapply​(akka.cluster.typed.internal.receptionist.ShardedServiceRegistry x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/receptionist/ShardedServiceRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/receptionist/ShardedServiceRegistry$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/receptionist/ShardedServiceRegistry$.html)*