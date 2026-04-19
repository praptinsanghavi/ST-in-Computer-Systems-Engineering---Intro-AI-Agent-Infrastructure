---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata$.html
title: ReplicatedEventMetadata$
---

# ReplicatedEventMetadata$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicatedEventMetadata$

- java.lang.Object
- - akka.persistence.typed.internal.ReplicatedEventMetadata$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ReplicatedEventMetadata$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.ReplicatedEventMetadata$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedEventMetadata$](ReplicatedEventMetadata$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal")` | `[apply](#apply(akka.persistence.typed.ReplicaId,long,akka.persistence.typed.internal.VersionVector,boolean))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long originSequenceNr,  akka.persistence.typed.internal.VersionVector version,  boolean concurrent)` | INTERNAL API |
	| `java.lang.Object` | `[instanceForJournalTest](#instanceForJournalTest())()` | For a journal supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer  to the built in serializer for serialization format |
	| `scala.Option<scala.Tuple4<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.internal.ReplicatedEventMetadata))​([ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedEventMetadata$](ReplicatedEventMetadata$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedEventMetadata$
		
		
		
		```
		public ReplicatedEventMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### instanceForJournalTest
		
		
		
		```
		public java.lang.Object instanceForJournalTest()
		```
		
		For a journal supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer
		 to the built in serializer for serialization format
		- #### apply
		
		
		
		```
		public [ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") apply​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
		                                     long originSequenceNr,
		                                     akka.persistence.typed.internal.VersionVector version,
		                                     boolean concurrent)
		```
		
		INTERNAL API
		 
		
		Parameters:
		`originReplica` \- Where the event originally was created
		`originSequenceNr` \- The original sequenceNr in the origin DC
		`version` \- The version with which the event was persisted at the different DC. The same event will have different version vectors
		 at each location as they are received at different times
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector,​java.lang.Object>> unapply​([ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEventMetadata$.html)*