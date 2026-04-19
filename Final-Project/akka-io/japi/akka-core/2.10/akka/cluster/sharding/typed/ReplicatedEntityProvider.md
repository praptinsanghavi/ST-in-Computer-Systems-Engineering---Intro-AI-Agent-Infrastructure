---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
title: ReplicatedEntityProvider
---

# ReplicatedEntityProvider

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ReplicatedEntityProvider\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.ReplicatedEntityProvider\<M\>

- Type Parameters:
`M` \- The type of messages the replicated entity accepts

---

```
public final class ReplicatedEntityProvider<M>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEntityProvider](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(java.lang.String,scala.collection.immutable.Set,scala.Function2,scala.reflect.ClassTag))​(java.lang.String typeName,  scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  scala.Function2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M>,​[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>> settingsPerReplicaFactory,  scala.reflect.ClassTag<M> evidence$1)` | Scala API: |
	| `static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[create](#create(java.lang.Class,java.lang.String,java.util.Set,akka.japi.function.Function2))​(java.lang.Class<M> messageClass,  java.lang.String typeName,  java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[EntityTypeKey](javadsl/EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>> settingsPerReplicaFactory)` | Java API: |
	| `static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[createPerDataCenter](#createPerDataCenter(java.lang.Class,java.lang.String,java.util.Set,java.util.function.Function))​(java.lang.Class<M> messageClass,  java.lang.String typeName,  java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  java.util.function.Function<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[createPerRole](#createPerRole(java.lang.Class,java.lang.String,java.util.Set,akka.japi.function.Function))​(java.lang.Class<M> messageClass,  java.lang.String typeName,  java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)` | Java API |
	| `boolean` | `[directReplication](#directReplication())()` |  |
	| `static <M,​E>[ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[perDataCenter](#perDataCenter(java.lang.String,scala.collection.immutable.Set,scala.Function1,scala.reflect.ClassTag))​(java.lang.String typeName,  scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  scala.Function1<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> create,  scala.reflect.ClassTag<M> evidence$2)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `static <M,​E>[ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M>` | `[perRole](#perRole(java.lang.String,scala.collection.immutable.Set,scala.Function1,scala.reflect.ClassTag))​(java.lang.String typeName,  scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  scala.Function1<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> create,  scala.reflect.ClassTag<M> evidence$3)` | Scala API |
	| `scala.collection.immutable.Seq<scala.Tuple2<[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntityProvider.html "type parameter in ReplicatedEntityProvider")>,​java.lang.String>>` | `[replicas](#replicas())()` |  |
	| `[ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntityProvider.html "type parameter in ReplicatedEntityProvider")>` | `[withDirectReplication](#withDirectReplication(boolean))​(boolean enabled)` | Start direct replication over sharding when replicated sharding starts up, requires the entities  to also have it enabled through `akka.persistence.typed.scaladsl.EventSourcedBehavior.withEventPublishing`  or `akka.persistence.typed.javadsl.ReplicatedEventSourcedBehavior.withEventPublishing`  to work. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEntityProvider
		
		
		
		```
		public ReplicatedEntityProvider()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> create​(java.lang.Class<M> messageClass,
		                                                     java.lang.String typeName,
		                                                     java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                     [Function2](../../../japi/function/Function2.html "interface in akka.japi.function")<[EntityTypeKey](javadsl/EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>> settingsPerReplicaFactory)
		```
		
		Java API:
		 
		 Provides full control over the [`ReplicatedEntity`](ReplicatedEntity.html "class in akka.cluster.sharding.typed") and the `Entity`
		 Most use cases can use the [`<M>createPerDataCenter(java.lang.Class<M>,java.lang.String,java.util.Set<akka.persistence.typed.ReplicaId>,java.util.function.Function<akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior<M>>)`](#createPerDataCenter(java.lang.Class,java.lang.String,java.util.Set,java.util.function.Function)) and [`<M>createPerRole(java.lang.Class<M>,java.lang.String,java.util.Set<akka.persistence.typed.ReplicaId>,akka.japi.function.Function<akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior<M>>)`](#createPerRole(java.lang.Class,java.lang.String,java.util.Set,akka.japi.function.Function))
		- #### apply
		
		
		
		```
		public static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> apply​(java.lang.String typeName,
		                                                    scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                    scala.Function2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M>,​[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>> settingsPerReplicaFactory,
		                                                    scala.reflect.ClassTag<M> evidence$1)
		```
		
		Scala API:
		 
		 Provides full control over the [`ReplicatedEntity`](ReplicatedEntity.html "class in akka.cluster.sharding.typed") and the `Entity`
		 Most use cases can use the [`<M,E>perDataCenter(java.lang.String,scala.collection.immutable.Set<akka.persistence.typed.ReplicaId>,scala.Function1<akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior<M>>,scala.reflect.ClassTag<M>)`](#perDataCenter(java.lang.String,scala.collection.immutable.Set,scala.Function1,scala.reflect.ClassTag)) and [`<M,E>perRole(java.lang.String,scala.collection.immutable.Set<akka.persistence.typed.ReplicaId>,scala.Function1<akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior<M>>,scala.reflect.ClassTag<M>)`](#perRole(java.lang.String,scala.collection.immutable.Set,scala.Function1,scala.reflect.ClassTag))
		
		
		
		
		Parameters:
		`typeName` \- The type name used in the `EntityTypeKey`
		- #### perDataCenter
		
		
		
		```
		public static <M,​E> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> perDataCenter​(java.lang.String typeName,
		                                                                    scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                                    scala.Function1<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> create,
		                                                                    scala.reflect.ClassTag<M> evidence$2)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Scala API
		 
		 Create a [`ReplicatedEntityProvider`](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed") that uses the defaults for `Entity` when running in
		 ClusterSharding. A replica will be run per data center.
		- #### perRole
		
		
		
		```
		public static <M,​E> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> perRole​(java.lang.String typeName,
		                                                              scala.collection.immutable.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                              scala.Function1<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> create,
		                                                              scala.reflect.ClassTag<M> evidence$3)
		```
		
		Scala API
		 
		 Create a [`ReplicatedEntityProvider`](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed") that uses the defaults for `Entity` when running in
		 ClusterSharding. The replicas in allReplicaIds should be roles used by nodes. A replica for each
		 entity will run on each role.
		- #### createPerDataCenter
		
		
		
		```
		public static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> createPerDataCenter​(java.lang.Class<M> messageClass,
		                                                                  java.lang.String typeName,
		                                                                  java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                                  java.util.function.Function<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Java API
		 
		 Create a [`ReplicatedEntityProvider`](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed") that uses the defaults for `Entity` when running in
		 ClusterSharding. A replica will be run per data center.
		- #### createPerRole
		
		
		
		```
		public static <M> [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<M> createPerRole​(java.lang.Class<M> messageClass,
		                                                            java.lang.String typeName,
		                                                            java.util.Set<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                            [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ReplicationId](../../../persistence/typed/ReplicationId.html "class in akka.persistence.typed"),​[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)
		```
		
		Java API
		 
		 Create a [`ReplicatedEntityProvider`](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed") that uses the defaults for `Entity` when running in
		 ClusterSharding.
		 
		
		
		 Map replicas to roles and then there will be a replica per role e.g. to match to availability zones/racks
		- #### replicas
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<[ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntityProvider.html "type parameter in ReplicatedEntityProvider")>,​java.lang.String>> replicas()
		```
		- #### directReplication
		
		
		
		```
		public boolean directReplication()
		```
		- #### withDirectReplication
		
		
		
		```
		public [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntityProvider.html "type parameter in ReplicatedEntityProvider")> withDirectReplication​(boolean enabled)
		```
		
		Start direct replication over sharding when replicated sharding starts up, requires the entities
		 to also have it enabled through `akka.persistence.typed.scaladsl.EventSourcedBehavior.withEventPublishing`
		 or `akka.persistence.typed.javadsl.ReplicatedEventSourcedBehavior.withEventPublishing`
		 to work.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html)*