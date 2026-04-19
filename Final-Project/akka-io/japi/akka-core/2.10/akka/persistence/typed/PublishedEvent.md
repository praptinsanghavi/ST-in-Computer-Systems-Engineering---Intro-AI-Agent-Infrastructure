---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PublishedEvent.html
title: PublishedEvent
---

# PublishedEvent

## Content

Package [akka.persistence.typed](package-summary.html)
## Interface PublishedEvent

- ---

```
public interface PublishedEvent
```

When using event publishing the events published to the system event stream will be in this form.
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[event](#event())()` | User event |
	| `java.util.Optional<[ReplicatedPublishedEventMetaData](internal/ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>` | `[getReplicatedMetaData](#getReplicatedMetaData())()` | Java API: When emitted from an Replicated Event Sourcing actor this will contain the replica id |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[persistenceId](#persistenceId())()` |  |
	| `scala.Option<[ReplicatedPublishedEventMetaData](internal/ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>` | `[replicatedMetaData](#replicatedMetaData())()` | Scala API: When emitted from an Replicated Event Sourcing actor this will contain the replica id |
	| `long` | `[sequenceNumber](#sequenceNumber())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `[PublishedEvent](PublishedEvent.html "interface in akka.persistence.typed")` | `[withoutTags](#withoutTags())()` | If the published event is tagged, return a new published event with the payload unwrapped and the tags dropped,  if it is not tagged return the published event as is. |

- - ### Method Detail
	
	
	
		- #### event
		
		
		
		```
		java.lang.Object event()
		```
		
		User event
		- #### getReplicatedMetaData
		
		
		
		```
		java.util.Optional<[ReplicatedPublishedEventMetaData](internal/ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")> getReplicatedMetaData()
		```
		
		Java API: When emitted from an Replicated Event Sourcing actor this will contain the replica id
		- #### persistenceId
		
		
		
		```
		[PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId()
		```
		- #### replicatedMetaData
		
		
		
		```
		scala.Option<[ReplicatedPublishedEventMetaData](internal/ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")> replicatedMetaData()
		```
		
		Scala API: When emitted from an Replicated Event Sourcing actor this will contain the replica id
		- #### sequenceNumber
		
		
		
		```
		long sequenceNumber()
		```
		- #### tags
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> tags()
		```
		- #### timestamp
		
		
		
		```
		long timestamp()
		```
		- #### withoutTags
		
		
		
		```
		[PublishedEvent](PublishedEvent.html "interface in akka.persistence.typed") withoutTags()
		```
		
		If the published event is tagged, return a new published event with the payload unwrapped and the tags dropped,
		 if it is not tagged return the published event as is.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PublishedEvent.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PublishedEvent.html)*