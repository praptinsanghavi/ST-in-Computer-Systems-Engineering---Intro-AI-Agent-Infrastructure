---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html
title: ReplicationInterceptor
---

# ReplicationInterceptor

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface ReplicationInterceptor\<Event,​State\>

- ---

```
public interface ReplicationInterceptor<Event,​State>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")>` | `[intercept](#intercept(State,Event,akka.persistence.typed.ReplicaId,long))​([State](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") state,  [Event](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") event,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long sequenceNumber)` |  |

- - ### Method Detail
	
	
	
		- #### intercept
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../../Done.html "class in akka")> intercept​([State](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") state,
		                                                     [Event](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") event,
		                                                     [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
		                                                     long sequenceNumber)
		```
		
		
		Parameters:
		`state` \- Current state
		`event` \- The replicated event
		`originReplica` \- The replica where the event came from
		`sequenceNumber` \- The local sequence number the event will get when persisted
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html)*