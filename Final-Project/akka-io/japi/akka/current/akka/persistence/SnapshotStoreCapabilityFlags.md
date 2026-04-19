---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotStoreCapabilityFlags.html
title: SnapshotStoreCapabilityFlags
---

# SnapshotStoreCapabilityFlags

## Content

Package [akka.persistence](package-summary.html)
## Interface SnapshotStoreCapabilityFlags

- All Superinterfaces:
`[CapabilityFlags](CapabilityFlags.html "interface in akka.persistence")`

All Known Implementing Classes:
`[JavaSnapshotStoreSpec](japi/snapshot/JavaSnapshotStoreSpec.html "class in akka.persistence.japi.snapshot")`, `[SnapshotStoreSpec](snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot")`

---

```
public interface SnapshotStoreCapabilityFlags
extends [CapabilityFlags](CapabilityFlags.html "interface in akka.persistence")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsMetadata](#supportsMetadata())()` | When `true` enables tests which check if the snapshot store properly stores and  loads metadata (needed for replication) along with the snapshots |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsSerialization](#supportsSerialization())()` | When `true` enables tests which check if the snapshot store properly serialize and  deserialize snapshots. |

- - ### Method Detail
	
	
	
		- #### supportsMetadata
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsMetadata()
		```
		
		When `true` enables tests which check if the snapshot store properly stores and
		 loads metadata (needed for replication) along with the snapshots
		- #### supportsSerialization
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsSerialization()
		```
		
		When `true` enables tests which check if the snapshot store properly serialize and
		 deserialize snapshots.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka/current/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/snapshot/SnapshotStoreSpec.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotStoreCapabilityFlags.html](https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotStoreCapabilityFlags.html)*