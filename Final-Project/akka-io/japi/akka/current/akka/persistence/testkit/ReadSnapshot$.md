---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot$.html
title: ReadSnapshot$
---

# ReadSnapshot$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ReadSnapshot$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option\<java.lang.Object\>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")\>
	- - akka.persistence.testkit.ReadSnapshot$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")>`

---

```
public class ReadSnapshot$
extends scala.runtime.AbstractFunction2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ReadSnapshot$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReadSnapshot$](ReadSnapshot$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReadSnapshot$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria,scala.Option))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  scala.Option<java.lang.Object> snapshot)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.testkit.ReadSnapshot))​([ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReadSnapshot$](ReadSnapshot$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReadSnapshot$
		
		
		
		```
		public ReadSnapshot$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")>`
		- #### apply
		
		
		
		```
		public [ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") apply​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                          scala.Option<java.lang.Object> snapshot)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>,​[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>>> unapply​([ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot$.html)*