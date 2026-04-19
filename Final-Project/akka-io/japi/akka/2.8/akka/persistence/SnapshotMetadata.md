---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotMetadata.html
title: SnapshotMetadata
---

# SnapshotMetadata

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotMetadata

- java.lang.Object
- - akka.persistence.SnapshotMetadata

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.Product3<java.lang.String,​java.lang.Object,​java.lang.Object>`

---

```
public final class SnapshotMetadata
extends java.lang.Object
implements scala.Product3<java.lang.String,​java.lang.Object,​java.lang.Object>, java.io.Serializable
```

Snapshot metadata.
 
 param: persistenceId id of persistent actor from which the snapshot was taken.
 param: sequenceNr sequence number at which the snapshot was taken.
 param: timestamp time at which the snapshot was saved, defaults to 0 when unknown.
 param: metadata a journal can optionally support persisting metadata separate to the domain state, used for Replicated Event Sourcing support

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotMetadata)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMetadata](#%3Cinit%3E(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	| `[SnapshotMetadata](#%3Cinit%3E(java.lang.String,long,long,scala.Option))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp,  scala.Option<java.lang.Object> metadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[_1](#_1())()` |  |
	| `long` | `[_2](#_2())()` |  |
	| `long` | `[_3](#_3())()` |  |
	| `static long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` |  |
	| `static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	| `static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long,long,scala.Option))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp,  scala.Option<java.lang.Object> meta)` |  |
	| `static long` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[copy](#copy(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.Option<java.lang.Object>` | `[metadata](#metadata())()` |  |
	| `static scala.math.Ordering<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>` | `[ordering](#ordering())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.String,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") sm)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[withMetadata](#withMetadata(java.lang.Object))​(java.lang.Object metadata)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator`
		- ### Methods inherited from interface scala.Product3
		
		
		`productArity, productElement`

- - ### Constructor Detail
	
	
	
		- #### SnapshotMetadata
		
		
		
		```
		public SnapshotMetadata​(java.lang.String persistenceId,
		                        long sequenceNr,
		                        long timestamp,
		                        scala.Option<java.lang.Object> metadata)
		```
		- #### SnapshotMetadata
		
		
		
		```
		public SnapshotMetadata​(java.lang.String persistenceId,
		                        long sequenceNr,
		                        long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### ordering
		
		
		
		```
		public static scala.math.Ordering<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")> ordering()
		```
		- #### apply
		
		
		
		```
		public static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                                     long sequenceNr,
		                                     long timestamp,
		                                     scala.Option<java.lang.Object> meta)
		```
		- #### apply
		
		
		
		```
		public static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                                     long sequenceNr,
		                                     long timestamp)
		```
		- #### apply
		
		
		
		```
		public static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                                     long sequenceNr)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.String,​java.lang.Object,​java.lang.Object>> unapply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") sm)
		```
		- #### apply$default$3
		
		
		
		```
		public static long apply$default$3()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static long $lessinit$greater$default$3()
		```
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### metadata
		
		
		
		```
		public scala.Option<java.lang.Object> metadata()
		```
		- #### withMetadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") withMetadata​(java.lang.Object metadata)
		```
		- #### copy
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") copy​(java.lang.String persistenceId,
		                             long sequenceNr,
		                             long timestamp)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### \_1
		
		
		
		```
		public java.lang.String _1()
		```
		
		
		Specified by:
		`_1` in interface `scala.Product3<java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### \_2
		
		
		
		```
		public long _2()
		```
		
		
		Specified by:
		`_2` in interface `scala.Product3<java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### \_3
		
		
		
		```
		public long _3()
		```
		
		
		Specified by:
		`_3` in interface `scala.Product3<java.lang.String,​java.lang.Object,​java.lang.Object>`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/2.8/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotMetadata.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotMetadata.html)*