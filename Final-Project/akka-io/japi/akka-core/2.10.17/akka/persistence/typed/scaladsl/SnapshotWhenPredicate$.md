---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html
title: SnapshotWhenPredicate$
---

# SnapshotWhenPredicate$

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class SnapshotWhenPredicate$

- java.lang.Object
- - akka.persistence.typed.scaladsl.SnapshotWhenPredicate$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SnapshotWhenPredicate$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API
 
 Default instance for no snapshots which is the default.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.scaladsl.SnapshotWhenPredicate$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotWhenPredicate$](SnapshotWhenPredicate$.html "class in akka.persistence.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotWhenPredicate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<State,​Event>akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event>` | `[apply](#apply(scala.Function3,boolean))​(scala.Function3<State,​Event,​java.lang.Object,​java.lang.Object> predicate,  boolean deleteEventsOnSnapshot)` | INTERNAL API |
	| `<State,​Event>akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event>` | `[noSnapshot](#noSnapshot())()` |  |
	| `<State,​Event>scala.Option<scala.Tuple2<scala.Function3<State,​Event,​java.lang.Object,​java.lang.Object>,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.typed.scaladsl.SnapshotWhenPredicate))​(akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotWhenPredicate$](SnapshotWhenPredicate$.html "class in akka.persistence.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotWhenPredicate$
		
		
		
		```
		public SnapshotWhenPredicate$()
		```

	- ### Method Detail
	
	
	
		- #### noSnapshot
		
		
		
		```
		public <State,​Event> akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event> noSnapshot()
		```
		- #### apply
		
		
		
		```
		public <State,​Event> akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event> apply​(scala.Function3<State,​Event,​java.lang.Object,​java.lang.Object> predicate,
		                                                                                                          boolean deleteEventsOnSnapshot)
		```
		
		INTERNAL API
		 
		 Wrapper to contain the predicate and deleteEventsOnSnapshot flag
		- #### unapply
		
		
		
		```
		public <State,​Event> scala.Option<scala.Tuple2<scala.Function3<State,​Event,​java.lang.Object,​java.lang.Object>,​java.lang.Object>> unapply​(akka.persistence.typed.scaladsl.SnapshotWhenPredicate<State,​Event> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html)*