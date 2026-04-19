---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/SnapshotCountRetentionCriteriaImpl$.html
title: SnapshotCountRetentionCriteriaImpl$
---

# SnapshotCountRetentionCriteriaImpl$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class SnapshotCountRetentionCriteriaImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl\>
	- - akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl>`

---

```
public class SnapshotCountRetentionCriteriaImpl$
extends scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotCountRetentionCriteriaImpl$](SnapshotCountRetentionCriteriaImpl$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotCountRetentionCriteriaImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl` | `[apply](#apply(int,int,boolean))​(int snapshotEveryNEvents,  int keepNSnapshots,  boolean deleteEventsOnSnapshot)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl))​(akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotCountRetentionCriteriaImpl$](SnapshotCountRetentionCriteriaImpl$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotCountRetentionCriteriaImpl$
		
		
		
		```
		public SnapshotCountRetentionCriteriaImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl>`
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl apply​(int snapshotEveryNEvents,
		                                                                                int keepNSnapshots,
		                                                                                boolean deleteEventsOnSnapshot)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.persistence.typed.internal.SnapshotCountRetentionCriteriaImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/SnapshotCountRetentionCriteriaImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/SnapshotCountRetentionCriteriaImpl$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/SnapshotCountRetentionCriteriaImpl$.html)*