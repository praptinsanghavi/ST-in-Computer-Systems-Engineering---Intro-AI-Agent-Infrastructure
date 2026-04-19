---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure$.html
title: DeleteSnapshotFailure$
---

# DeleteSnapshotFailure$

## Content

Package [akka.persistence](package-summary.html)
## Class DeleteSnapshotFailure$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")\>
	- - akka.persistence.DeleteSnapshotFailure$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")>`

---

```
public class DeleteSnapshotFailure$
extends scala.runtime.AbstractFunction2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.DeleteSnapshotFailure$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeleteSnapshotFailure$](DeleteSnapshotFailure$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotFailure$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata,java.lang.Throwable))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Throwable cause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable>>` | `[unapply](#unapply(akka.persistence.DeleteSnapshotFailure))​([DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeleteSnapshotFailure$](DeleteSnapshotFailure$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeleteSnapshotFailure$
		
		
		
		```
		public DeleteSnapshotFailure$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                                   java.lang.Throwable cause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable,​[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Throwable>> unapply​([DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure$.html)*