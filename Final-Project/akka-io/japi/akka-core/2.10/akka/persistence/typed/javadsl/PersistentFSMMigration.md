---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/PersistentFSMMigration.html
title: PersistentFSMMigration
---

# PersistentFSMMigration

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class PersistentFSMMigration

- java.lang.Object
- - akka.persistence.typed.javadsl.PersistentFSMMigration

- ---

```
public class PersistentFSMMigration
extends java.lang.Object
```

Helper functions for migration from PersistentFSM to Persistence Typed

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistentFSMMigration](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[snapshotAdapter](#snapshotAdapter(akka.japi.function.Function3))​([Function3](../../../japi/function/Function3.html "interface in akka.japi.function")<java.lang.String,​java.lang.Object,​java.util.Optional<java.time.Duration>,​State> adapt)` | Create a snapshot adapter that will adapt snapshots created by a PersistentFSM into  the correct State type of a [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistentFSMMigration
		
		
		
		```
		public PersistentFSMMigration()
		```

	- ### Method Detail
	
	
	
		- #### snapshotAdapter
		
		
		
		```
		public static <State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter​([Function3](../../../japi/function/Function3.html "interface in akka.japi.function")<java.lang.String,​java.lang.Object,​java.util.Optional<java.time.Duration>,​State> adapt)
		```
		
		Create a snapshot adapter that will adapt snapshots created by a PersistentFSM into
		 the correct State type of a [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		
		Parameters:
		`adapt` \- Takes in the state identifier, snapshot persisted by the PersistentFSM and the state timeout and
		 returns the `State` that should be given to the the [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		Returns:
		A `SnapshotAdapter` to be used with a [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function3.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/PersistentFSMMigration.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/PersistentFSMMigration.html)*