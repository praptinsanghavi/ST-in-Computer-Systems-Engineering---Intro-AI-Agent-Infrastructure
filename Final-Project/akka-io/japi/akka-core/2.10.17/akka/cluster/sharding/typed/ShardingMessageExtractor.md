---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
title: ShardingMessageExtractor
---

# ShardingMessageExtractor

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingMessageExtractor\<E,​M\>

- java.lang.Object
- - akka.cluster.sharding.typed.ShardingMessageExtractor\<E,​M\>

- Type Parameters:
`E` \- Possibly an Envelope around the messages accepted by the entity actor, is the same as `M` if there is no
 envelope.
`M` \- The type of message accepted by the entity actor

Direct Known Subclasses:
`[HashCodeMessageExtractor](HashCodeMessageExtractor.html "class in akka.cluster.sharding.typed")`, `[HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed")`, `[Murmur2MessageExtractor](Murmur2MessageExtractor.html "class in akka.cluster.sharding.typed")`, `[Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed")`, `[ShardedDaemonProcessId.MessageExtractor](internal/ShardedDaemonProcessId.MessageExtractor.html "class in akka.cluster.sharding.typed.internal")`, `[SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "class in akka.cluster.sharding.typed")`

---

```
public abstract class ShardingMessageExtractor<E,​M>
extends java.lang.Object
```

Entirely customizable typed message extractor. Prefer [`HashCodeMessageExtractor`](HashCodeMessageExtractor.html "class in akka.cluster.sharding.typed") or
 [`HashCodeNoEnvelopeMessageExtractor`](HashCodeNoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed")if possible.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingMessageExtractor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M>` | `[apply](#apply(int))​(int numberOfShards)` | Scala API: |
	| `abstract java.lang.String` | `[entityId](#entityId(E))​([E](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor") message)` | Extract the entity id from an incoming `message`. |
	| `static <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M>` | `[noEnvelope](#noEnvelope(int,M,scala.Function1))​(int numberOfShards,  M stopMessage,  scala.Function1<M,​java.lang.String> extractEntityId)` | Scala API: Create a message extractor for a protocol where the entity id is available in each message. |
	| `abstract java.lang.String` | `[shardId](#shardId(java.lang.String))​(java.lang.String entityId)` | The shard identifier for a given entity id. |
	| `abstract [M](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor")` | `[unwrapMessage](#unwrapMessage(E))​([E](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor") message)` | Extract the message to send to the entity from an incoming `message`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ShardingMessageExtractor
		
		
		
		```
		public ShardingMessageExtractor()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M> apply​(int numberOfShards)
		```
		
		Scala API:
		 
		 Create the default message extractor, using envelopes to identify what entity a message is for
		 and the hashcode of the entityId to decide which shard an entity belongs to.
		 
		
		
		 This is recommended since it does not force details about sharding into the entity protocol
		- #### noEnvelope
		
		
		
		```
		public static <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M> noEnvelope​(int numberOfShards,
		                                                                 M stopMessage,
		                                                                 scala.Function1<M,​java.lang.String> extractEntityId)
		```
		
		Scala API: Create a message extractor for a protocol where the entity id is available in each message.
		- #### entityId
		
		
		
		```
		public abstract java.lang.String entityId​([E](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor") message)
		```
		
		Extract the entity id from an incoming `message`. If `null` is returned
		 the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		- #### shardId
		
		
		
		```
		public abstract java.lang.String shardId​(java.lang.String entityId)
		```
		
		The shard identifier for a given entity id. Only messages that passed the [`entityId(E)`](#entityId(E))
		 function will be used as input to this function.
		- #### unwrapMessage
		
		
		
		```
		public abstract [M](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor") unwrapMessage​([E](ShardingMessageExtractor.html "type parameter in ShardingMessageExtractor") message)
		```
		
		Extract the message to send to the entity from an incoming `message`.
		 Note that the extracted message does not have to be the same as the incoming
		 message to support wrapping in message envelope that is unwrapped before
		 sending to the entity actor.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.MessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html)*