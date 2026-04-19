---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
title: ReplicatedEventSourcing$
---

# ReplicatedEventSourcing$

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class ReplicatedEventSourcing$

- java.lang.Object
- - akka.persistence.typed.javadsl.ReplicatedEventSourcing$

- ---

```
public class ReplicatedEventSourcing$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedEventSourcing$](ReplicatedEventSourcing$.html "class in akka.persistence.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventSourcing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[commonJournalConfig](#commonJournalConfig(akka.persistence.typed.ReplicationId,java.util.Set,java.lang.String,java.util.function.Function))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  java.lang.String queryPluginId,  java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> behaviorFactory)` | Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration. |
	| `<Command,​Event,​State>[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[commonJournalConfigForEventSourcedOnCommandBehavior](#commonJournalConfigForEventSourcedOnCommandBehavior(akka.persistence.typed.ReplicationId,java.util.Set,java.lang.String,java.util.function.Function))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  java.lang.String queryPluginId,  java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> behaviorFactory)` | Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration. |
	| `<Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[perReplicaJournalConfig](#perReplicaJournalConfig(akka.persistence.typed.ReplicationId,java.util.Map,java.util.function.Function))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  java.util.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,  java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)` | Initialize a replicated event sourced behavior where each journal has different journal configuration e.g. |
	| `<Command,​Event,​State>[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>` | `[perReplicaJournalConfigForEventSourcedOnCommandBehavior](#perReplicaJournalConfigForEventSourcedOnCommandBehavior(akka.persistence.typed.ReplicationId,java.util.Map,java.util.function.Function))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  java.util.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,  java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)` | Initialize a replicated event sourced behavior where each journal has different journal configuration e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedEventSourcing$](ReplicatedEventSourcing$.html "class in akka.persistence.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedEventSourcing$
		
		
		
		```
		public ReplicatedEventSourcing$()
		```

	- ### Method Detail
	
	
	
		- #### commonJournalConfig
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> commonJournalConfig​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                   java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                                                                                   java.lang.String queryPluginId,
		                                                                                                                   java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> behaviorFactory)
		```
		
		Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.
		 This is typical if there is a shared database and no replica specific configuration is required.
		 
		 Events from each replica for the same entityId will be replicated to every copy.
		 Care must be taken to handle events in any order as events can happen concurrently at different replicas.
		 
		
		
		 Using an replicated event sourced behavior means there is no longer the single writer guarantee.
		 
		
		
		 A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
		 can be used for each replica.
		 The events from other replicas are read using PersistentQuery.
		 
		
		
		
		Parameters:
		`queryPluginId` \- A single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
		- #### commonJournalConfigForEventSourcedOnCommandBehavior
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> commonJournalConfigForEventSourcedOnCommandBehavior​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                                                            java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                                                                                                                            java.lang.String queryPluginId,
		                                                                                                                                                            java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> behaviorFactory)
		```
		
		Initialize a replicated event sourced behavior where all entity replicas are share the same journal configuration.
		 This is typical if there is a shared database and no replica specific configuration is required.
		 
		 Events from each replica for the same entityId will be replicated to every copy.
		 Care must be taken to handle events in any order as events can happen concurrently at different replicas.
		 
		
		
		 Using an replicated event sourced behavior means there is no longer the single writer guarantee.
		 
		
		
		 A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
		 can be used for each replica.
		 The events from other replicas are read using PersistentQuery.
		 
		
		
		
		Parameters:
		`queryPluginId` \- A single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
		- #### perReplicaJournalConfig
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> perReplicaJournalConfig​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                       java.util.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,
		                                                                                                                       java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)
		```
		
		Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.
		 each replica uses a different database or requires different database configuration for a shared database.
		 
		 Events from each replica for the same entityId will be replicated to every copy.
		 Care must be taken to handle events in any order as events can happen concurrently at different replicas.
		 
		
		
		 Using an replicated event sourced behavior means there is no longer the single writer guarantee.
		 
		
		
		 The journal plugin id for the entity itself can be configured using withJournalPluginId after creation.
		 A query side identifier is passed per replica allowing for separate database/journal configuration per
		 replica. The events from other replicas are read using PersistentQuery.
		 
		
		
		
		Parameters:
		`allReplicasAndQueryPlugins` \- All replica ids and a query plugin per replica id. These need to be known to receive events from all replicas
		 and configured with the query plugin for the journal that each replica uses.
		- #### perReplicaJournalConfigForEventSourcedOnCommandBehavior
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State> perReplicaJournalConfigForEventSourcedOnCommandBehavior​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                                                                java.util.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,
		                                                                                                                                                                java.util.function.Function<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl"),​[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)
		```
		
		Initialize a replicated event sourced behavior where each journal has different journal configuration e.g.
		 each replica uses a different database or requires different database configuration for a shared database.
		 
		 Events from each replica for the same entityId will be replicated to every copy.
		 Care must be taken to handle events in any order as events can happen concurrently at different replicas.
		 
		
		
		 Using an replicated event sourced behavior means there is no longer the single writer guarantee.
		 
		
		
		 The journal plugin id for the entity itself can be configured using withJournalPluginId after creation.
		 A query side identifier is passed per replica allowing for separate database/journal configuration per
		 replica. The events from other replicas are read using PersistentQuery.
		 
		
		
		
		Parameters:
		`allReplicasAndQueryPlugins` \- All replica ids and a query plugin per replica id. These need to be known to receive events from all replicas
		 and configured with the query plugin for the journal that each replica uses.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html)*