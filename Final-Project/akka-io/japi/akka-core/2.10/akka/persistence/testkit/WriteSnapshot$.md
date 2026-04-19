---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot$.html
title: WriteSnapshot$
---

# WriteSnapshot$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class WriteSnapshot$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")\>
	- - akka.persistence.testkit.WriteSnapshot$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")>`

---

```
public class WriteSnapshot$
extends scala.runtime.AbstractFunction2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.WriteSnapshot$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WriteSnapshot$](WriteSnapshot$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteSnapshot$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.testkit.SnapshotMeta,java.lang.Object))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,  java.lang.Object snapshot)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.WriteSnapshot))​([WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WriteSnapshot$](WriteSnapshot$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WriteSnapshot$
		
		
		
		```
		public WriteSnapshot$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")>`
		- #### apply
		
		
		
		```
		public [WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") apply​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,
		                           java.lang.Object snapshot)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object,​[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>> unapply​([WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot$.html)*