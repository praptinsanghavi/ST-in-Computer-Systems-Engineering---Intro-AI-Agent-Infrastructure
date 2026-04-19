---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata$.html
title: SnapshotMetadata$
---

# SnapshotMetadata$

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotMetadata$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​java.lang.Object,​[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")\>
	- - akka.persistence.SnapshotMetadata$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.String,​java.lang.Object,​java.lang.Object,​[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>`

---

```
public class SnapshotMetadata$
extends scala.runtime.AbstractFunction3<java.lang.String,​java.lang.Object,​java.lang.Object,​[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotMetadata$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[apply](#apply(java.lang.String,long,long,scala.Option))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp,  scala.Option<java.lang.Object> meta)` |  |
	| `long` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.math.Ordering<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")>` | `[ordering](#ordering())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.String,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") sm)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotMetadata$
		
		
		
		```
		public SnapshotMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### ordering
		
		
		
		```
		public scala.math.Ordering<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")> ordering()
		```
		- #### apply
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                              long sequenceNr,
		                              long timestamp,
		                              scala.Option<java.lang.Object> meta)
		```
		- #### apply
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                              long sequenceNr,
		                              long timestamp)
		```
		- #### apply
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") apply​(java.lang.String persistenceId,
		                              long sequenceNr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.String,​java.lang.Object,​java.lang.Object>> unapply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") sm)
		```
		- #### apply$default$3
		
		
		
		```
		public long apply$default$3()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public long $lessinit$greater$default$3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata$.html](https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata$.html)*