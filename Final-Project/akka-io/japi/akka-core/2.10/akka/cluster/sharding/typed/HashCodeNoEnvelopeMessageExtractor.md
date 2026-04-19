---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:24:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
title: HashCodeNoEnvelopeMessageExtractor
---

# HashCodeNoEnvelopeMessageExtractor

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class HashCodeNoEnvelopeMessageExtractor\<M\>

- java.lang.Object
- - [akka.cluster.sharding.typed.ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")\<M,​M\>
	- - akka.cluster.sharding.typed.HashCodeNoEnvelopeMessageExtractor\<M\>

- Type Parameters:
`M` \- The type of message accepted by the entity actor

---

```
public abstract class HashCodeNoEnvelopeMessageExtractor<M>
extends [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M>
```

Default message extractor type, using a property of the message to identify what entity a message is for
 and the hashcode of the entityId to decide which shard an entity belongs to.
 
 This is recommended since it does not force details about sharding into the entity protocol

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HashCodeNoEnvelopeMessageExtractor](#%3Cinit%3E(int))​(int numberOfShards)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[numberOfShards](#numberOfShards())()` |  |
	| `java.lang.String` | `[shardId](#shardId(java.lang.String))​(java.lang.String entityId)` | The shard identifier for a given entity id. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor")` | `[unwrapMessage](#unwrapMessage(M))​([M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor") message)` | Extract the message to send to the entity from an incoming `message`. |
	
	
		- ### Methods inherited from class akka.cluster.sharding.typed.[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")
		
		
		`[apply](ShardingMessageExtractor.html#apply(int)), [entityId](ShardingMessageExtractor.html#entityId(E)), [noEnvelope](ShardingMessageExtractor.html#noEnvelope(int,M,scala.Function1))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HashCodeNoEnvelopeMessageExtractor
		
		
		
		```
		public HashCodeNoEnvelopeMessageExtractor​(int numberOfShards)
		```

	- ### Method Detail
	
	
	
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
		`[shardId](ShardingMessageExtractor.html#shardId(java.lang.String))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor"),​[M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### unwrapMessage
		
		
		
		```
		public final [M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor") unwrapMessage​([M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor") message)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#unwrapMessage(E))`
		Extract the message to send to the entity from an incoming `message`.
		 Note that the extracted message does not have to be the same as the incoming
		 message to support wrapping in message envelope that is unwrapped before
		 sending to the entity actor.
		
		Specified by:
		`[unwrapMessage](ShardingMessageExtractor.html#unwrapMessage(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor"),​[M](HashCodeNoEnvelopeMessageExtractor.html "type parameter in HashCodeNoEnvelopeMessageExtractor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html)*