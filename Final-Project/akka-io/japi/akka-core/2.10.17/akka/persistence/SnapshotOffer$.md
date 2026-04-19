---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer$.html
title: SnapshotOffer$
---

# SnapshotOffer$

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotOffer$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")\>
	- - akka.persistence.SnapshotOffer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")>`

---

```
public class SnapshotOffer$
extends scala.runtime.AbstractFunction2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotOffer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotOffer$](SnapshotOffer$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotOffer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotOffer))​([SnapshotOffer](SnapshotOffer.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotOffer$](SnapshotOffer$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotOffer$
		
		
		
		```
		public SnapshotOffer$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [SnapshotOffer](SnapshotOffer.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                           java.lang.Object snapshot)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object,​[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>> unapply​([SnapshotOffer](SnapshotOffer.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer$.html)*