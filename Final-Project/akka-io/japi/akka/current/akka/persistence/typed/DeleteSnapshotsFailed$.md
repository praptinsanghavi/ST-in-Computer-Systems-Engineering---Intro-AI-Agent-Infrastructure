---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed$.html
title: DeleteSnapshotsFailed$
---

# DeleteSnapshotsFailed$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class DeleteSnapshotsFailed$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")\>
	- - akka.persistence.typed.DeleteSnapshotsFailed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")>`

---

```
public class DeleteSnapshotsFailed$
extends scala.runtime.AbstractFunction2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.DeleteSnapshotsFailed$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeleteSnapshotsFailed$](DeleteSnapshotsFailed$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotsFailed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")` | `[apply](#apply(akka.persistence.typed.DeletionTarget,java.lang.Throwable))​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target,  java.lang.Throwable failure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable>>` | `[unapply](#unapply(akka.persistence.typed.DeleteSnapshotsFailed))​([DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeleteSnapshotsFailed$](DeleteSnapshotsFailed$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeleteSnapshotsFailed$
		
		
		
		```
		public DeleteSnapshotsFailed$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")>`
		- #### apply
		
		
		
		```
		public [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed") apply​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target,
		                                   java.lang.Throwable failure)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable,​[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"),​java.lang.Throwable>> unapply​([DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed$.html)*