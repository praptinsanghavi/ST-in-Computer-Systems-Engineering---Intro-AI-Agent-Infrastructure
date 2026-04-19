---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
title: Murmur2NoEnvelopeMessageExtractor
---

# Murmur2NoEnvelopeMessageExtractor

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class Murmur2NoEnvelopeMessageExtractor\<M\>

- java.lang.Object
- - [akka.cluster.sharding.typed.ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")\<M,​M\>
	- - akka.cluster.sharding.typed.Murmur2NoEnvelopeMessageExtractor\<M\>

- ---

```
public abstract class Murmur2NoEnvelopeMessageExtractor<M>
extends [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M>
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Murmur2NoEnvelopeMessageExtractor](#%3Cinit%3E(int))​(int numberOfShards)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[numberOfShards](#numberOfShards())()` |  |
	| `java.lang.String` | `[shardId](#shardId(java.lang.String))​(java.lang.String entityId)` | The shard identifier for a given entity id. |
	| `[M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor")` | `[unwrapMessage](#unwrapMessage(M))​([M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor") message)` | Extract the message to send to the entity from an incoming `message`. |
	
	
		- ### Methods inherited from class akka.cluster.sharding.typed.[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")
		
		
		`[apply](ShardingMessageExtractor.html#apply(int)), [entityId](ShardingMessageExtractor.html#entityId(E)), [noEnvelope](ShardingMessageExtractor.html#noEnvelope(int,M,scala.Function1))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Murmur2NoEnvelopeMessageExtractor
		
		
		
		```
		public Murmur2NoEnvelopeMessageExtractor​(int numberOfShards)
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
		`[shardId](ShardingMessageExtractor.html#shardId(java.lang.String))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor"),​[M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor")>`
		- #### unwrapMessage
		
		
		
		```
		public [M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor") unwrapMessage​([M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor") message)
		```
		
		Description copied from class: `[ShardingMessageExtractor](ShardingMessageExtractor.html#unwrapMessage(E))`
		Extract the message to send to the entity from an incoming `message`.
		 Note that the extracted message does not have to be the same as the incoming
		 message to support wrapping in message envelope that is unwrapped before
		 sending to the entity actor.
		
		Specified by:
		`[unwrapMessage](ShardingMessageExtractor.html#unwrapMessage(E))` in class `[ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor"),​[M](Murmur2NoEnvelopeMessageExtractor.html "type parameter in Murmur2NoEnvelopeMessageExtractor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html)*