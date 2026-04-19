---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.html
title: SnapshotProtocol
---

# SnapshotProtocol

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotProtocol

- java.lang.Object
- - akka.persistence.SnapshotProtocol

- ---

```
public class SnapshotProtocol
extends java.lang.Object
```

INTERNAL API.
 
 Defines messages exchanged between persistent actors and a snapshot store.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[SnapshotProtocol.DeleteSnapshot](SnapshotProtocol.DeleteSnapshot.html "class in akka.persistence")` | Instructs snapshot store to delete a snapshot. |
	| `static class` | `[SnapshotProtocol.DeleteSnapshot$](SnapshotProtocol.DeleteSnapshot$.html "class in akka.persistence")` |  |
	| `static class` | `[SnapshotProtocol.DeleteSnapshots](SnapshotProtocol.DeleteSnapshots.html "class in akka.persistence")` | Instructs snapshot store to delete all snapshots that match `criteria`. |
	| `static class` | `[SnapshotProtocol.DeleteSnapshots$](SnapshotProtocol.DeleteSnapshots$.html "class in akka.persistence")` |  |
	| `static class` | `[SnapshotProtocol.LoadSnapshot](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence")` | Instructs a snapshot store to load a snapshot. |
	| `static class` | `[SnapshotProtocol.LoadSnapshot$](SnapshotProtocol.LoadSnapshot$.html "class in akka.persistence")` |  |
	| `static class` | `[SnapshotProtocol.LoadSnapshotFailed](SnapshotProtocol.LoadSnapshotFailed.html "class in akka.persistence")` | Reply message to a failed [`SnapshotProtocol.LoadSnapshot`](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") request. |
	| `static class` | `[SnapshotProtocol.LoadSnapshotFailed$](SnapshotProtocol.LoadSnapshotFailed$.html "class in akka.persistence")` |  |
	| `static class` | `[SnapshotProtocol.LoadSnapshotResult](SnapshotProtocol.LoadSnapshotResult.html "class in akka.persistence")` | Response message to a [`SnapshotProtocol.LoadSnapshot`](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") message. |
	| `static class` | `[SnapshotProtocol.LoadSnapshotResult$](SnapshotProtocol.LoadSnapshotResult$.html "class in akka.persistence")` |  |
	| `static interface` | `[SnapshotProtocol.Message](SnapshotProtocol.Message.html "interface in akka.persistence")` | Marker trait shared by internal snapshot messages. |
	| `static interface` | `[SnapshotProtocol.Request](SnapshotProtocol.Request.html "interface in akka.persistence")` | Internal snapshot command. |
	| `static interface` | `[SnapshotProtocol.Response](SnapshotProtocol.Response.html "interface in akka.persistence")` | Internal snapshot acknowledgement. |
	| `static class` | `[SnapshotProtocol.SaveSnapshot](SnapshotProtocol.SaveSnapshot.html "class in akka.persistence")` | Instructs snapshot store to save a snapshot. |
	| `static class` | `[SnapshotProtocol.SaveSnapshot$](SnapshotProtocol.SaveSnapshot$.html "class in akka.persistence")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotProtocol](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SnapshotProtocol
		
		
		
		```
		public SnapshotProtocol()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshots$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshots.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotFailed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotResult$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Request.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.SaveSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.SaveSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.html)*