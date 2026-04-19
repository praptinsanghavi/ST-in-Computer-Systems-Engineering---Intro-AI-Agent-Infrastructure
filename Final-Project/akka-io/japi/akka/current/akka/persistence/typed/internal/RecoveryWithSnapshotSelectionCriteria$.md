---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/RecoveryWithSnapshotSelectionCriteria$.html
title: RecoveryWithSnapshotSelectionCriteria$
---

# RecoveryWithSnapshotSelectionCriteria$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class RecoveryWithSnapshotSelectionCriteria$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria\>
	- - akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria>`

---

```
public class RecoveryWithSnapshotSelectionCriteria$
extends scala.runtime.AbstractFunction1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecoveryWithSnapshotSelectionCriteria$](RecoveryWithSnapshotSelectionCriteria$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryWithSnapshotSelectionCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria` | `[apply](#apply(akka.persistence.typed.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed")>` | `[unapply](#unapply(akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria))​(akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecoveryWithSnapshotSelectionCriteria$](RecoveryWithSnapshotSelectionCriteria$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecoveryWithSnapshotSelectionCriteria$
		
		
		
		```
		public RecoveryWithSnapshotSelectionCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria>`
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria apply​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed"),​akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria>`
		- #### unapply
		
		
		
		```
		public scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed")> unapply​(akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/RecoveryWithSnapshotSelectionCriteria$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/RecoveryWithSnapshotSelectionCriteria$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/RecoveryWithSnapshotSelectionCriteria$.html)*