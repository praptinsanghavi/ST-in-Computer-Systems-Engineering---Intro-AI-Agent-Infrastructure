---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/SelectedSnapshot$.html
title: SelectedSnapshot$
---

# SelectedSnapshot$

## Content

Package [akka.persistence](package-summary.html)
## Class SelectedSnapshot$

- java.lang.Object
- - akka.persistence.SelectedSnapshot$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SelectedSnapshot$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SelectedSnapshot$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SelectedSnapshot$](SelectedSnapshot$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelectedSnapshot$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` |  |
	| `[SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` | Java API, Plugin API. |
	| `scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SelectedSnapshot))​([SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SelectedSnapshot$](SelectedSnapshot$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SelectedSnapshot$
		
		
		
		```
		public SelectedSnapshot$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence") create​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                               java.lang.Object snapshot)
		```
		
		Java API, Plugin API.
		- #### apply
		
		
		
		```
		public [SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                              java.lang.Object snapshot)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>> unapply​([SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SelectedSnapshot$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/SelectedSnapshot$.html](https://doc.akka.io/japi/akka/current/akka/persistence/SelectedSnapshot$.html)*