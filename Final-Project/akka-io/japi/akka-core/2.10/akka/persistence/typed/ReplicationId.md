---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html
title: ReplicationId
---

# ReplicationId

## Content

Package [akka.persistence.typed](package-summary.html)
## Class ReplicationId

- java.lang.Object
- - akka.persistence.typed.ReplicationId

- ---

```
public final class ReplicationId
extends java.lang.Object
```

param: typeName The name of the entity type e.g. account, user. Made part of the persistence id so that entity ids don't need to be unique across different replicated entities
 param: entityId The unique entity id
 param: replicaId The unique identity for this entity. The underlying persistence id will include the replica,
 unless the replicaId is `ReplicaId.empty`

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicationId](#%3Cinit%3E(java.lang.String,java.lang.String,akka.persistence.typed.ReplicaId))​(java.lang.String typeName,  java.lang.String entityId,  [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReplicationId](ReplicationId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String,akka.persistence.typed.ReplicaId))​(java.lang.String typeName,  java.lang.String entityId,  [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)` |  |
	| `java.lang.String` | `[entityId](#entityId())()` |  |
	| `static [ReplicationId](ReplicationId.html "class in akka.persistence.typed")` | `[fromString](#fromString(java.lang.String))​(java.lang.String id)` |  |
	| `static boolean` | `[isReplicationId](#isReplicationId(java.lang.String))​(java.lang.String id)` |  |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `[ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[replicaId](#replicaId())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[typeName](#typeName())()` |  |
	| `[ReplicationId](ReplicationId.html "class in akka.persistence.typed")` | `[withReplica](#withReplica(akka.persistence.typed.ReplicaId))​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") newReplica)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicationId
		
		
		
		```
		public ReplicationId​(java.lang.String typeName,
		                     java.lang.String entityId,
		                     [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)
		```

	- ### Method Detail
	
	
	
		- #### fromString
		
		
		
		```
		public static [ReplicationId](ReplicationId.html "class in akka.persistence.typed") fromString​(java.lang.String id)
		```
		- #### isReplicationId
		
		
		
		```
		public static boolean isReplicationId​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public static [ReplicationId](ReplicationId.html "class in akka.persistence.typed") apply​(java.lang.String typeName,
		                                  java.lang.String entityId,
		                                  [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)
		```
		
		
		Parameters:
		`typeName` \- The name of the entity type e.g. account, user. Made part of the persistence id so that entity ids don't need to be unique across different replicated entities
		`entityId` \- The unique entity id
		`replicaId` \- The unique identity for this entity. The underlying persistence id will include the replica,
		 unless the replicaId is `ReplicaId.empty`
		- #### typeName
		
		
		
		```
		public java.lang.String typeName()
		```
		- #### entityId
		
		
		
		```
		public java.lang.String entityId()
		```
		- #### replicaId
		
		
		
		```
		public [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId()
		```
		- #### persistenceId
		
		
		
		```
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### withReplica
		
		
		
		```
		public [ReplicationId](ReplicationId.html "class in akka.persistence.typed") withReplica​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") newReplica)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicationId.html)*