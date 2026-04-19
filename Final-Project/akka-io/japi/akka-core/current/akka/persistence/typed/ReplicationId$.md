---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicationId$.html
title: ReplicationId$
---

# ReplicationId$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class ReplicationId$

- java.lang.Object
- - akka.persistence.typed.ReplicationId$

- ---

```
public class ReplicationId$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicationId$](ReplicationId$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicationId$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicationId](ReplicationId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String,akka.persistence.typed.ReplicaId))​(java.lang.String typeName,  java.lang.String entityId,  [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)` |  |
	| `[ReplicationId](ReplicationId.html "class in akka.persistence.typed")` | `[fromString](#fromString(java.lang.String))​(java.lang.String id)` |  |
	| `boolean` | `[isReplicationId](#isReplicationId(java.lang.String))​(java.lang.String id)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicationId$](ReplicationId$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicationId$
		
		
		
		```
		public ReplicationId$()
		```

	- ### Method Detail
	
	
	
		- #### fromString
		
		
		
		```
		public [ReplicationId](ReplicationId.html "class in akka.persistence.typed") fromString​(java.lang.String id)
		```
		- #### isReplicationId
		
		
		
		```
		public boolean isReplicationId​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public [ReplicationId](ReplicationId.html "class in akka.persistence.typed") apply​(java.lang.String typeName,
		                           java.lang.String entityId,
		                           [ReplicaId](ReplicaId.html "class in akka.persistence.typed") replicaId)
		```
		
		
		Parameters:
		`typeName` \- The name of the entity type e.g. account, user. Made part of the persistence id so that entity ids don't need to be unique across different replicated entities
		`entityId` \- The unique entity id
		`replicaId` \- The unique identity for this entity. The underlying persistence id will include the replica,
		 unless the replicaId is `ReplicaId.empty`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicationId$.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/ReplicationId$.html)*