---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ServiceRegistry$.html
title: ServiceRegistry$
---

# ServiceRegistry$

## Content

Package [akka.cluster.typed.internal.receptionist](package-summary.html)
## Class ServiceRegistry$

- java.lang.Object
- - akka.cluster.typed.internal.receptionist.ServiceRegistry$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ServiceRegistry$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.typed.internal.receptionist.ServiceRegistry$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ServiceRegistry$](ServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServiceRegistry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.collection.immutable.Set<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<java.lang.Object>>` | `[actorRefsFor$extension](#actorRefsFor$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.actor.typed.internal.receptionist.AbstractServiceKey))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  akka.actor.typed.internal.receptionist.AbstractServiceKey key)` |  |
	| `<T> akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[addBinding$extension](#addBinding$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.actor.typed.receptionist.ServiceKey,akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry,akka.cluster.ddata.SelfUniqueAddress))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  [ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry value,  [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)` |  |
	| `akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[apply](#apply(akka.cluster.ddata.ORMultiMap))​([ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> entries)` |  |
	| `boolean` | `[canEqual$extension](#canEqual$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,java.lang.Object))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Set<akka.actor.typed.internal.receptionist.AbstractServiceKey>` | `[collectChangedKeys](#collectChangedKeys(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry previousRegistry,  akka.cluster.typed.internal.receptionist.ServiceRegistry newRegistry)` |  |
	| `[ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>` | `[copy$default$1$extension](#copy$default$1$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[copy$extension](#copy$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.cluster.ddata.ORMultiMap))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  [ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> entries)` |  |
	| `akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[Empty](#Empty())()` |  |
	| `scala.collection.immutable.Set<akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>` | `[entriesFor$extension](#entriesFor$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.actor.typed.internal.receptionist.AbstractServiceKey))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  akka.actor.typed.internal.receptionist.AbstractServiceKey key)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,java.lang.Object))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `scala.collection.immutable.Set<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>>` | `[keysFor$extension](#keysFor$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.cluster.UniqueAddress,akka.cluster.ddata.SelfUniqueAddress))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  [UniqueAddress](../../../UniqueAddress.html "class in akka.cluster") address,  [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)` |  |
	| `int` | `[productArity$extension](#productArity$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `java.lang.Object` | `[productElement$extension](#productElement$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,int))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  int x$1)` |  |
	| `java.lang.String` | `[productElementName$extension](#productElementName$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,int))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator$extension](#productIterator$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `java.lang.String` | `[productPrefix$extension](#productPrefix$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[removeAll$extension](#removeAll$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,scala.collection.immutable.Map,akka.cluster.ddata.SelfUniqueAddress))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  scala.collection.immutable.Map<akka.actor.typed.internal.receptionist.AbstractServiceKey,​scala.collection.immutable.Set<akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>> entries,  [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)` |  |
	| `<T> akka.cluster.typed.internal.receptionist.ServiceRegistry` | `[removeBinding$extension](#removeBinding$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry,akka.actor.typed.receptionist.ServiceKey,akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry,akka.cluster.ddata.SelfUniqueAddress))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,  [ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry value,  [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)` |  |
	| `[ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>` | `[toORMultiMap$extension](#toORMultiMap$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `java.lang.String` | `[toString$extension](#toString$extension(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)` |  |
	| `scala.Option<[ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>>` | `[unapply](#unapply(akka.cluster.typed.internal.receptionist.ServiceRegistry))​(akka.cluster.typed.internal.receptionist.ServiceRegistry x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ServiceRegistry$](ServiceRegistry$.html "class in akka.cluster.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServiceRegistry$
		
		
		
		```
		public ServiceRegistry$()
		```

	- ### Method Detail
	
	
	
		- #### Empty
		
		
		
		```
		public final akka.cluster.typed.internal.receptionist.ServiceRegistry Empty()
		```
		- #### collectChangedKeys
		
		
		
		```
		public scala.collection.immutable.Set<akka.actor.typed.internal.receptionist.AbstractServiceKey> collectChangedKeys​(akka.cluster.typed.internal.receptionist.ServiceRegistry previousRegistry,
		                                                                                                                    akka.cluster.typed.internal.receptionist.ServiceRegistry newRegistry)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ServiceRegistry apply​([ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> entries)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>> unapply​(akka.cluster.typed.internal.receptionist.ServiceRegistry x$0)
		```
		- #### actorRefsFor$extension
		
		
		
		```
		public final <T> scala.collection.immutable.Set<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<java.lang.Object>> actorRefsFor$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                                   akka.actor.typed.internal.receptionist.AbstractServiceKey key)
		```
		- #### entriesFor$extension
		
		
		
		```
		public final scala.collection.immutable.Set<akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> entriesFor$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                                                                     akka.actor.typed.internal.receptionist.AbstractServiceKey key)
		```
		- #### keysFor$extension
		
		
		
		```
		public final scala.collection.immutable.Set<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>> keysFor$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                             [UniqueAddress](../../../UniqueAddress.html "class in akka.cluster") address,
		                                                                             [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		- #### addBinding$extension
		
		
		
		```
		public final <T> akka.cluster.typed.internal.receptionist.ServiceRegistry addBinding$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                               [ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                                                               akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry value,
		                                                                                               [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		- #### removeBinding$extension
		
		
		
		```
		public final <T> akka.cluster.typed.internal.receptionist.ServiceRegistry removeBinding$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                                  [ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                                                                  akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry value,
		                                                                                                  [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		- #### removeAll$extension
		
		
		
		```
		public final akka.cluster.typed.internal.receptionist.ServiceRegistry removeAll$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                          scala.collection.immutable.Map<akka.actor.typed.internal.receptionist.AbstractServiceKey,​scala.collection.immutable.Set<akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>> entries,
		                                                                                          [SelfUniqueAddress](../../../ddata/SelfUniqueAddress.html "class in akka.cluster.ddata") node)
		```
		- #### toORMultiMap$extension
		
		
		
		```
		public final [ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> toORMultiMap$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### copy$extension
		
		
		
		```
		public final akka.cluster.typed.internal.receptionist.ServiceRegistry copy$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                                                     [ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> entries)
		```
		- #### copy$default$1$extension
		
		
		
		```
		public final [ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> copy$default$1$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### productPrefix$extension
		
		
		
		```
		public final java.lang.String productPrefix$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### productArity$extension
		
		
		
		```
		public final int productArity$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### productElement$extension
		
		
		
		```
		public final java.lang.Object productElement$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                       int x$1)
		```
		- #### productIterator$extension
		
		
		
		```
		public final scala.collection.Iterator<java.lang.Object> productIterator$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### canEqual$extension
		
		
		
		```
		public final boolean canEqual$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                        java.lang.Object x$1)
		```
		- #### productElementName$extension
		
		
		
		```
		public final java.lang.String productElementName$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                                           int x$1)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this,
		                                      java.lang.Object x$1)
		```
		- #### toString$extension
		
		
		
		```
		public final java.lang.String toString$extension​(akka.cluster.typed.internal.receptionist.ServiceRegistry $this)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ServiceRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ServiceRegistry$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ServiceRegistry$.html)*