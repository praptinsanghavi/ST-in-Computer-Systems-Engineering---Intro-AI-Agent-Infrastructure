---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html
title: SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor
---

# SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor\<M\>

- java.lang.Object
- - [akka.cluster.sharding.typed.ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")\<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")\<M\>,​M\>
	- - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor\<M\>

- Enclosing class:
[SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "class in akka.cluster.sharding.typed")

---

```
public static final class SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor<M>
extends [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M>
```

To be used together with [`SliceRangeShardAllocationStrategy`](SliceRangeShardAllocationStrategy.html "class in akka.cluster.sharding.typed"). The slice of the entity
 is used as shardId.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardBySliceMessageExtractor](#%3Cinit%3E(java.lang.String,akka.persistence.Persistence))​(java.lang.String entityType,  [Persistence](../../../persistence/Persistence.html "class in akka.persistence") persistence)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[entityId](#entityId(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")> envelope)` | Extract the entity id from an incoming `message`. |
	| `java.lang.String` | `[shardId](#shardId(java.lang.String))​(java.lang.String entityId)` | The shard identifier for a given entity id. |
	| `[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")` | `[unwrapMessage](#unwrapMessage(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")> envelope)` | Extract the message to send to the entity from an incoming `message`. |
	
	
		- ### Methods inherited from class akka.cluster.sharding.typed.[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")
		
		
		`[apply](ShardingMessageExtractor.html#apply(int)), [noEnvelope](ShardingMessageExtractor.html#noEnvelope(int,M,scala.Function1))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardBySliceMessageExtractor
		
		
		
		```
		public ShardBySliceMessageExtractor​(java.lang.String entityType,
		                                    [Persistence](../../../persistence/Persistence.html "class in akka.persistence") persistence)
		```

	- ### Method Detail
	
	
	
		- #### entityId
		
		
		
		```
		public java.lang.String entityId​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")> envelope)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#entityId(E))`
		Extract the entity id from an incoming `message`. If `null` is returned
		 the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		
		Specified by:
		`[entityId](ShardingMessageExtractor.html#entityId(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>,​[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>`
		- #### shardId
		
		
		
		```
		public java.lang.String shardId​(java.lang.String entityId)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#shardId(java.lang.String))`
		The shard identifier for a given entity id. Only messages that passed the [`ShardingMessageExtractor.entityId(E)`](ShardingMessageExtractor.html#entityId(E))
		 function will be used as input to this function.
		
		Specified by:
		`[shardId](ShardingMessageExtractor.html#shardId(java.lang.String))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>,​[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>`
		- #### unwrapMessage
		
		
		
		```
		public [M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor") unwrapMessage​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")> envelope)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#unwrapMessage(E))`
		Extract the message to send to the entity from an incoming `message`.
		 Note that the extracted message does not have to be the same as the incoming
		 message to support wrapping in message envelope that is unwrapped before
		 sending to the entity actor.
		
		Specified by:
		`[unwrapMessage](ShardingMessageExtractor.html#unwrapMessage(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>,​[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html)*