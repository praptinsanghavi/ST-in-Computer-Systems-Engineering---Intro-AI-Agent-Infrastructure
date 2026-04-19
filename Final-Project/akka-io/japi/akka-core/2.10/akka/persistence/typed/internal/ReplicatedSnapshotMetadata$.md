---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html
title: ReplicatedSnapshotMetadata$
---

# ReplicatedSnapshotMetadata$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicatedSnapshotMetadata$

- java.lang.Object
- - akka.persistence.typed.internal.ReplicatedSnapshotMetadata$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ReplicatedSnapshotMetadata$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.ReplicatedSnapshotMetadata$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedSnapshotMetadata$](ReplicatedSnapshotMetadata$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedSnapshotMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.ReplicatedSnapshotMetadata` | `[apply](#apply(akka.persistence.typed.internal.VersionVector,scala.collection.immutable.Map))​(akka.persistence.typed.internal.VersionVector version,  scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object> seenPerReplica)` |  |
	| `java.lang.Object` | `[instanceForSnapshotStoreTest](#instanceForSnapshotStoreTest())()` | For a snapshot store supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer  to the built in serializer for serialization format |
	| `scala.Option<scala.Tuple2<akka.persistence.typed.internal.VersionVector,​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.typed.internal.ReplicatedSnapshotMetadata))​(akka.persistence.typed.internal.ReplicatedSnapshotMetadata x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedSnapshotMetadata$](ReplicatedSnapshotMetadata$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedSnapshotMetadata$
		
		
		
		```
		public ReplicatedSnapshotMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### instanceForSnapshotStoreTest
		
		
		
		```
		public java.lang.Object instanceForSnapshotStoreTest()
		```
		
		For a snapshot store supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer
		 to the built in serializer for serialization format
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.ReplicatedSnapshotMetadata apply​(akka.persistence.typed.internal.VersionVector version,
		                                                                        scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object> seenPerReplica)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<akka.persistence.typed.internal.VersionVector,​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object>>> unapply​(akka.persistence.typed.internal.ReplicatedSnapshotMetadata x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicatedSnapshotMetadata$.html)*