---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
title: Murmur2MessageExtractor
---

# Murmur2MessageExtractor

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class Murmur2MessageExtractor\<M\>

- java.lang.Object
- - [akka.cluster.sharding.typed.ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")\<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")\<M\>,​M\>
	- - akka.cluster.sharding.typed.Murmur2MessageExtractor\<M\>

- ---

```
public final class Murmur2MessageExtractor<M>
extends [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M>
```

The murmur2 message extractor uses the same algorithm as the default kafka partitioner
 allowing kafka partitions to be mapped to shards.
 This can be used with the [`ExternalShardAllocationStrategy`](../external/ExternalShardAllocationStrategy.html "class in akka.cluster.sharding.external") to have messages
 processed locally.
 
 Extend [`Murmur2NoEnvelopeMessageExtractor`](Murmur2NoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed") to not use a message envelope extractor.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Murmur2MessageExtractor](#%3Cinit%3E(int))​(int numberOfShards)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[entityId](#entityId(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")> envelope)` | Extract the entity id from an incoming `message`. |
	| `int` | `[numberOfShards](#numberOfShards())()` |  |
	| `java.lang.String` | `[shardId](#shardId(java.lang.String))​(java.lang.String entityId)` | The shard identifier for a given entity id. |
	| `[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")` | `[unwrapMessage](#unwrapMessage(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")> envelope)` | Extract the message to send to the entity from an incoming `message`. |
	
	
		- ### Methods inherited from class akka.cluster.sharding.typed.[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")
		
		
		`[apply](ShardingMessageExtractor.html#apply(int)), [noEnvelope](ShardingMessageExtractor.html#noEnvelope(int,M,scala.Function1))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Murmur2MessageExtractor
		
		
		
		```
		public Murmur2MessageExtractor​(int numberOfShards)
		```

	- ### Method Detail
	
	
	
		- #### entityId
		
		
		
		```
		public java.lang.String entityId​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")> envelope)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#entityId(E))`
		Extract the entity id from an incoming `message`. If `null` is returned
		 the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		
		Specified by:
		`[entityId](ShardingMessageExtractor.html#entityId(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>,​[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>`
		- #### numberOfShards
		
		
		
		```
		public int numberOfShards()
		```
		- #### shardId
		
		
		
		```
		public java.lang.String shardId​(java.lang.String entityId)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#shardId(java.lang.String))`
		The shard identifier for a given entity id. Only messages that passed the [`ShardingMessageExtractor.entityId(E)`](ShardingMessageExtractor.html#entityId(E))
		 function will be used as input to this function.
		
		Specified by:
		`[shardId](ShardingMessageExtractor.html#shardId(java.lang.String))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>,​[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>`
		- #### unwrapMessage
		
		
		
		```
		public [M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor") unwrapMessage​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")> envelope)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#unwrapMessage(E))`
		Extract the message to send to the entity from an incoming `message`.
		 Note that the extracted message does not have to be the same as the incoming
		 message to support wrapping in message envelope that is unwrapped before
		 sending to the entity actor.
		
		Specified by:
		`[unwrapMessage](ShardingMessageExtractor.html#unwrapMessage(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>,​[M](Murmur2MessageExtractor.html "type parameter in Murmur2MessageExtractor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html)*