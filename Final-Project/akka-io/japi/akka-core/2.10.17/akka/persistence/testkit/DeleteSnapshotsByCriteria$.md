---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria$.html
title: DeleteSnapshotsByCriteria$
---

# DeleteSnapshotsByCriteria$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class DeleteSnapshotsByCriteria$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")\>
	- - akka.persistence.testkit.DeleteSnapshotsByCriteria$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")>`

---

```
public class DeleteSnapshotsByCriteria$
extends scala.runtime.AbstractFunction1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.DeleteSnapshotsByCriteria$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeleteSnapshotsByCriteria$](DeleteSnapshotsByCriteria$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotsByCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")>` | `[unapply](#unapply(akka.persistence.testkit.DeleteSnapshotsByCriteria))​([DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeleteSnapshotsByCriteria$](DeleteSnapshotsByCriteria$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeleteSnapshotsByCriteria$
		
		
		
		```
		public DeleteSnapshotsByCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")>`
		- #### apply
		
		
		
		```
		public [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") apply​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")> unapply​([DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria$.html)*