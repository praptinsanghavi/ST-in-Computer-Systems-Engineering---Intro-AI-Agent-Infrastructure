---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
title: SnapshotAdapter
---

# SnapshotAdapter

## Content

Package [akka.persistence.typed](package-summary.html)
## Interface SnapshotAdapter\<State\>

- Type Parameters:
`State` \- The state type of the `EventSourcedBehavior`

---

```
public interface SnapshotAdapter<State>
```

Facility to convert snapshots from and to a specialized data model.
 Can be used when migration from different state types e.g. when migration
 from Persistent FSM to Typed EventSourcedBehavior.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[State](SnapshotAdapter.html "type parameter in SnapshotAdapter")` | `[fromJournal](#fromJournal(java.lang.Object))​(java.lang.Object from)` | Transform the stored state into the current state type. |
	| `java.lang.Object` | `[toJournal](#toJournal(State))​([State](SnapshotAdapter.html "type parameter in SnapshotAdapter") state)` | Transform the state to a different type before sending to the journal. |

- - ### Method Detail
	
	
	
		- #### fromJournal
		
		
		
		```
		[State](SnapshotAdapter.html "type parameter in SnapshotAdapter") fromJournal​(java.lang.Object from)
		```
		
		Transform the stored state into the current state type.
		 Can be used for migrations from different serialized state types.
		- #### toJournal
		
		
		
		```
		java.lang.Object toJournal​([State](SnapshotAdapter.html "type parameter in SnapshotAdapter") state)
		```
		
		Transform the state to a different type before sending to the journal.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/SnapshotAdapter.html)*