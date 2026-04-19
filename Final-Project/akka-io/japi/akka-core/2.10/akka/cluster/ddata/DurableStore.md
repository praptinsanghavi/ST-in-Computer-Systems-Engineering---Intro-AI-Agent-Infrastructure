---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.html
title: DurableStore
---

# DurableStore

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class DurableStore

- java.lang.Object
- - akka.cluster.ddata.DurableStore

- ---

```
public class DurableStore
extends java.lang.Object
```

An actor implementing the durable store for the Distributed Data `Replicator`
 has to implement the protocol with the messages defined here.
 
 At startup the `Replicator` creates the durable store actor and sends the
 `Load` message to it. It must then reply with 0 or more `LoadData` messages
 followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).
 

 If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
 will stop itself and the durable store.
 

 When the `Replicator` needs to store a value it sends a `Store` message
 to the durable store actor, which must then reply with the `successMsg` or
 `failureMsg` to the `replyTo`.
 

 When entries have expired the `Replicator` sends a `Expire` message to the durable
 store actor, which can delete the entries from the backend store.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[DurableStore.DurableDataEnvelope](DurableStore.DurableDataEnvelope.html "class in akka.cluster.ddata")` | Wrapper class for serialization of a data value. |
	| `static class` | `[DurableStore.Expire](DurableStore.Expire.html "class in akka.cluster.ddata")` | Request to expire (remove) entries. |
	| `static class` | `[DurableStore.Expire$](DurableStore.Expire$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.LoadAll$](DurableStore.LoadAll$.html "class in akka.cluster.ddata")` | Request to load all entries. |
	| `static class` | `[DurableStore.LoadAllCompleted$](DurableStore.LoadAllCompleted$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.LoadData](DurableStore.LoadData.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.LoadData$](DurableStore.LoadData$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.LoadFailed](DurableStore.LoadFailed.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.Store](DurableStore.Store.html "class in akka.cluster.ddata")` | Request to store an entry. |
	| `static class` | `[DurableStore.Store$](DurableStore.Store$.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.StoreReply](DurableStore.StoreReply.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[DurableStore.StoreReply$](DurableStore.StoreReply$.html "class in akka.cluster.ddata")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStore](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DurableStore
		
		
		
		```
		public DurableStore()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.DurableDataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Expire$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Expire.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadAllCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadData$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.LoadFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Store$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.Store.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.StoreReply$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.StoreReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DurableStore.html)*