---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata.html
title: ReplicatedEventMetadata
---

# ReplicatedEventMetadata

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicatedEventMetadata

- java.lang.Object
- - akka.persistence.typed.internal.ReplicatedEventMetadata

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ReplicatedEventMetadata
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.ReplicatedEventMetadata)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEventMetadata](#%3Cinit%3E(akka.persistence.typed.ReplicaId,long,akka.persistence.typed.internal.VersionVector,boolean))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long originSequenceNr,  akka.persistence.typed.internal.VersionVector version,  boolean concurrent)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal")` | `[apply](#apply(akka.persistence.typed.ReplicaId,long,akka.persistence.typed.internal.VersionVector,boolean))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long originSequenceNr,  akka.persistence.typed.internal.VersionVector version,  boolean concurrent)` | INTERNAL API |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[concurrent](#concurrent())()` |  |
	| `[ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal")` | `[copy](#copy(akka.persistence.typed.ReplicaId,long,akka.persistence.typed.internal.VersionVector,boolean))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long originSequenceNr,  akka.persistence.typed.internal.VersionVector version,  boolean concurrent)` |  |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `akka.persistence.typed.internal.VersionVector` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static java.lang.Object` | `[instanceForJournalTest](#instanceForJournalTest())()` | For a journal supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer  to the built in serializer for serialization format |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[originReplica](#originReplica())()` |  |
	| `long` | `[originSequenceNr](#originSequenceNr())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.internal.ReplicatedEventMetadata))​([ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") x$0)` |  |
	| `akka.persistence.typed.internal.VersionVector` | `[version](#version())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEventMetadata
		
		
		
		```
		public ReplicatedEventMetadata​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
		                               long originSequenceNr,
		                               akka.persistence.typed.internal.VersionVector version,
		                               boolean concurrent)
		```

	- ### Method Detail
	
	
	
		- #### instanceForJournalTest
		
		
		
		```
		public static java.lang.Object instanceForJournalTest()
		```
		
		For a journal supporting Replicated Event Sourcing needing to add test coverage, use this instance as metadata and defer
		 to the built in serializer for serialization format
		- #### apply
		
		
		
		```
		public static [ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") apply​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
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
		public static scala.Option<scala.Tuple4<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector,​java.lang.Object>> unapply​([ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") x$0)
		```
		- #### originReplica
		
		
		
		```
		public [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica()
		```
		- #### originSequenceNr
		
		
		
		```
		public long originSequenceNr()
		```
		- #### version
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector version()
		```
		- #### concurrent
		
		
		
		```
		public boolean concurrent()
		```
		- #### copy
		
		
		
		```
		public [ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") copy​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
		                                    long originSequenceNr,
		                                    akka.persistence.typed.internal.VersionVector version,
		                                    boolean concurrent)
		```
		- #### copy$default$1
		
		
		
		```
		public [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public akka.persistence.typed.internal.VersionVector copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public boolean copy$default$4()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedEventMetadata.html)*