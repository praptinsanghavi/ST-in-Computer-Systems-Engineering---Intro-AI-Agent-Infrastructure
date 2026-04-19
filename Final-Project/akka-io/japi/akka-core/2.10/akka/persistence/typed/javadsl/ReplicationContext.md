---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
title: ReplicationContext
---

# ReplicationContext

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface ReplicationContext

- ---

```
public interface ReplicationContext
```

Provides access to replication specific state
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[concurrent](#concurrent())()` | Must only be called from the event handler |
	| `long` | `[currentTimeMillis](#currentTimeMillis())()` |  |
	| `java.lang.String` | `[entityId](#entityId())()` |  |
	| `java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")>` | `[getAllReplicas](#getAllReplicas())()` |  |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[origin](#origin())()` | Must only be called from the event handler |
	| `[PersistenceId](../PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `boolean` | `[recoveryRunning](#recoveryRunning())()` | Must only be called from the event handler |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[replicaId](#replicaId())()` |  |
	| `[ReplicationId](../ReplicationId.html "class in akka.persistence.typed")` | `[replicationId](#replicationId())()` |  |

- - ### Method Detail
	
	
	
		- #### concurrent
		
		
		
		```
		boolean concurrent()
		```
		
		Must only be called from the event handler
		
		Returns:
		true if this event happened concurrent with an event from another replica
		- #### currentTimeMillis
		
		
		
		```
		long currentTimeMillis()
		```
		
		
		Returns:
		a timestamp that will always be increasing (is monotonic)
		- #### entityId
		
		
		
		```
		java.lang.String entityId()
		```
		
		
		Returns:
		The unique id of this replica, not including the replica id
		- #### getAllReplicas
		
		
		
		```
		java.util.Set<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")> getAllReplicas()
		```
		
		
		Returns:
		The ids of all replicas of this replicated event sourced actor
		- #### origin
		
		
		
		```
		[ReplicaId](../ReplicaId.html "class in akka.persistence.typed") origin()
		```
		
		Must only be called from the event handler
		
		Returns:
		the replica id where the current event was persisted
		- #### persistenceId
		
		
		
		```
		[PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		
		
		Returns:
		The unique id of this replica, including the replica id
		- #### recoveryRunning
		
		
		
		```
		boolean recoveryRunning()
		```
		
		Must only be called from the event handler
		
		Returns:
		true when the event handler is invoked during recovery.
		- #### replicaId
		
		
		
		```
		[ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId()
		```
		
		
		Returns:
		The replica id of this replicated event sourced actor
		- #### replicationId
		
		
		
		```
		[ReplicationId](../ReplicationId.html "class in akka.persistence.typed") replicationId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html)*