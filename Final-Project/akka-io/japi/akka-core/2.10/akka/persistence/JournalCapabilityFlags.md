---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html
title: JournalCapabilityFlags
---

# JournalCapabilityFlags

## Content

Package [akka.persistence](package-summary.html)
## Interface JournalCapabilityFlags

- All Superinterfaces:
`[CapabilityFlags](CapabilityFlags.html "interface in akka.persistence")`

All Known Implementing Classes:
`[JavaJournalPerfSpec](japi/journal/JavaJournalPerfSpec.html "class in akka.persistence.japi.journal")`, `[JavaJournalSpec](japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal")`, `[JournalPerfSpec](journal/JournalPerfSpec.html "class in akka.persistence.journal")`, `[JournalSpec](journal/JournalSpec.html "class in akka.persistence.journal")`

---

```
public interface JournalCapabilityFlags
extends [CapabilityFlags](CapabilityFlags.html "interface in akka.persistence")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsMetadata](#supportsMetadata())()` | When `true` enables tests which check if the Journal stores and returns  metadata for an event |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsRejectingNonSerializableObjects](#supportsRejectingNonSerializableObjects())()` | When `true` enables tests which check if the Journal properly rejects  writes of objects which are not `java.lang.Serializable`. |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsReplayOnlyLast](#supportsReplayOnlyLast())()` | When `true` enables tests which check if the Journal can replay only the last event. |
	| `[CapabilityFlag](CapabilityFlag.html "class in akka.persistence")` | `[supportsSerialization](#supportsSerialization())()` | When `true` enables tests which check if the Journal properly serialize and  deserialize events. |

- - ### Method Detail
	
	
	
		- #### supportsMetadata
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsMetadata()
		```
		
		When `true` enables tests which check if the Journal stores and returns
		 metadata for an event
		- #### supportsRejectingNonSerializableObjects
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsRejectingNonSerializableObjects()
		```
		
		When `true` enables tests which check if the Journal properly rejects
		 writes of objects which are not `java.lang.Serializable`.
		- #### supportsReplayOnlyLast
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsReplayOnlyLast()
		```
		
		When `true` enables tests which check if the Journal can replay only the last event.
		- #### supportsSerialization
		
		
		
		```
		[CapabilityFlag](CapabilityFlag.html "class in akka.persistence") supportsSerialization()
		```
		
		When `true` enables tests which check if the Journal properly serialize and
		 deserialize events.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html)*