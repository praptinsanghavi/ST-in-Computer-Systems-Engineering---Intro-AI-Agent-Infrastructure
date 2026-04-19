---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/SnapshotInteractions.html
title: SnapshotInteractions
---

# SnapshotInteractions

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Interface SnapshotInteractions\<C,​E,​S\>

- ---

```
public interface SnapshotInteractions<C,​E,​S>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[internalDeleteSnapshots](#internalDeleteSnapshots(long))​(long toSequenceNr)` | Deletes the snapshots up to and including the \`sequenceNr\`. |
	| `void` | `[internalSaveSnapshot](#internalSaveSnapshot(akka.persistence.typed.internal.Running.RunningState,scala.Option))​(akka.persistence.typed.internal.Running.RunningState<[S](SnapshotInteractions.html "type parameter in SnapshotInteractions")> state,  scala.Option<java.lang.Object> metadata)` |  |
	| `void` | `[loadSnapshot](#loadSnapshot(akka.persistence.SnapshotSelectionCriteria,long))​([SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  long toSequenceNr)` | Instructs the snapshot store to load the specified snapshot and send it via an `SnapshotOffer`  to the running `PersistentActor`. |
	| `akka.persistence.typed.internal.BehaviorSetup<[C](SnapshotInteractions.html "type parameter in SnapshotInteractions"),​[E](SnapshotInteractions.html "type parameter in SnapshotInteractions"),​[S](SnapshotInteractions.html "type parameter in SnapshotInteractions")>` | `[setup](#setup())()` |  |

- - ### Method Detail
	
	
	
		- #### internalDeleteSnapshots
		
		
		
		```
		void internalDeleteSnapshots​(long toSequenceNr)
		```
		
		Deletes the snapshots up to and including the \`sequenceNr\`.
		- #### internalSaveSnapshot
		
		
		
		```
		void internalSaveSnapshot​(akka.persistence.typed.internal.Running.RunningState<[S](SnapshotInteractions.html "type parameter in SnapshotInteractions")> state,
		                          scala.Option<java.lang.Object> metadata)
		```
		- #### loadSnapshot
		
		
		
		```
		void loadSnapshot​([SnapshotSelectionCriteria](../../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                  long toSequenceNr)
		```
		
		Instructs the snapshot store to load the specified snapshot and send it via an `SnapshotOffer`
		 to the running `PersistentActor`.
		- #### setup
		
		
		
		```
		akka.persistence.typed.internal.BehaviorSetup<[C](SnapshotInteractions.html "type parameter in SnapshotInteractions"),​[E](SnapshotInteractions.html "type parameter in SnapshotInteractions"),​[S](SnapshotInteractions.html "type parameter in SnapshotInteractions")> setup()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/SnapshotInteractions.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/SnapshotInteractions.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/SnapshotInteractions.html)*