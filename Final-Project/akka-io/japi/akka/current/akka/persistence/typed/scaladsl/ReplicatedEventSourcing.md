---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.html
title: ReplicatedEventSourcing
---

# ReplicatedEventSourcing

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class ReplicatedEventSourcing

- java.lang.Object
- - akka.persistence.typed.scaladsl.ReplicatedEventSourcing

- ---

```
public class ReplicatedEventSourcing
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventSourcing](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[commonJournalConfig](#commonJournalConfig(akka.persistence.typed.ReplicationId,scala.collection.immutable.Set,java.lang.String,scala.Function1))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  scala.collection.immutable.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,  java.lang.String queryPluginId,  scala.Function1<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.scaladsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)` | Initialize a replicated event sourced behavior where all entity replicas are stored in the same journal. |
	| `static <Command,​Event,​State>[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>` | `[perReplicaJournalConfig](#perReplicaJournalConfig(akka.persistence.typed.ReplicationId,scala.collection.immutable.Map,scala.Function1))​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,  scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,  scala.Function1<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.scaladsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)` | Initialize a replicated event sourced behavior. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEventSourcing
		
		
		
		```
		public ReplicatedEventSourcing()
		```

	- ### Method Detail
	
	
	
		- #### commonJournalConfig
		
		
		
		```
		public static <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> commonJournalConfig​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                          scala.collection.immutable.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> allReplicaIds,
		                                                                                                                          java.lang.String queryPluginId,
		                                                                                                                          scala.Function1<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.scaladsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)
		```
		
		Initialize a replicated event sourced behavior where all entity replicas are stored in the same journal.
		 
		 Events from each replica for the same entityId will be replicated to every copy.
		 Care must be taken to handle events in any order as events can happen concurrently at different replicas.
		 
		
		
		 Using an replicated event sourced behavior means there is no longer the single writer guarantee.
		 
		
		
		 A different journal plugin id can be configured using withJournalPluginId after creation. Different databases
		 can be used for each replica.
		 The events from other replicas are read using PersistentQuery.
		 
		
		
		
		Parameters:
		`allReplicaIds` \- All replica ids. These need to be known to receive events from all replicas.
		`queryPluginId` \- A single query plugin used to read the events from other replicas. Must be the query side of your configured journal plugin.
		- #### perReplicaJournalConfig
		
		
		
		```
		public static <Command,​Event,​State> [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State> perReplicaJournalConfig​([ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId,
		                                                                                                                              scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,
		                                                                                                                              scala.Function1<[ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.scaladsl"),​[EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")<Command,​Event,​State>> eventSourcedBehaviorFactory)
		```
		
		Initialize a replicated event sourced behavior.
		 
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.html)*