---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/PersistentFSMMigration.html
title: PersistentFSMMigration
---

# PersistentFSMMigration

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class PersistentFSMMigration

- java.lang.Object
- - akka.persistence.typed.scaladsl.PersistentFSMMigration

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
	| `static <State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State>` | `[snapshotAdapter](#snapshotAdapter(scala.Function3))​(scala.Function3<java.lang.String,​java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>,​State> adapt)` | Create a snapshot adapter that will adapt snapshots created by a PersistentFSM into  the correct State type of a [`EventSourcedBehavior`](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl") |
	
	
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
		public static <State> [SnapshotAdapter](../SnapshotAdapter.html "interface in akka.persistence.typed")<State> snapshotAdapter​(scala.Function3<java.lang.String,​java.lang.Object,​scala.Option<scala.concurrent.duration.FiniteDuration>,​State> adapt)
		```
		
		Create a snapshot adapter that will adapt snapshots created by a PersistentFSM into
		 the correct State type of a [`EventSourcedBehavior`](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")
		
		Parameters:
		`adapt` \- Takes in the state identifier, snapshot persisted by the PersistentFSM and the state timeout and
		 returns the `State` that should be given to the the [`EventSourcedBehavior`](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")
		Returns:
		A `SnapshotAdapter` to be used with a [`EventSourcedBehavior`](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/PersistentFSMMigration.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/PersistentFSMMigration.html)*