---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
title: ReplicationInterceptor
---

# ReplicationInterceptor

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface ReplicationInterceptor\<State,​Event\>

- ---

```
public interface ReplicationInterceptor<State,​Event>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Done](../../../Done.html "class in akka")>` | `[intercept](#intercept(State,Event,akka.persistence.typed.ReplicaId,long))​([State](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") state,  [Event](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") event,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long sequenceNumber)` |  |

- - ### Method Detail
	
	
	
		- #### intercept
		
		
		
		```
		scala.concurrent.Future<[Done](../../../Done.html "class in akka")> intercept​([State](ReplicationInterceptor.html "type parameter in ReplicationInterceptor") state,
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

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html)*