---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
title: ShardingMessageExtractor$
---

# ShardingMessageExtractor$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingMessageExtractor$

- java.lang.Object
- - akka.cluster.sharding.typed.ShardingMessageExtractor$

- ---

```
public class ShardingMessageExtractor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingMessageExtractor$](ShardingMessageExtractor$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingMessageExtractor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M>` | `[apply](#apply(int))​(int numberOfShards)` | Scala API: |
	| `<M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M>` | `[noEnvelope](#noEnvelope(int,M,scala.Function1))​(int numberOfShards,  M stopMessage,  scala.Function1<M,​java.lang.String> extractEntityId)` | Scala API: Create a message extractor for a protocol where the entity id is available in each message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingMessageExtractor$](ShardingMessageExtractor$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingMessageExtractor$
		
		
		
		```
		public ShardingMessageExtractor$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>,​M> apply​(int numberOfShards)
		```
		
		Scala API:
		 
		 Create the default message extractor, using envelopes to identify what entity a message is for
		 and the hashcode of the entityId to decide which shard an entity belongs to.
		 
		
		
		 This is recommended since it does not force details about sharding into the entity protocol
		- #### noEnvelope
		
		
		
		```
		public <M> [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<M,​M> noEnvelope​(int numberOfShards,
		                                                          M stopMessage,
		                                                          scala.Function1<M,​java.lang.String> extractEntityId)
		```
		
		Scala API: Create a message extractor for a protocol where the entity id is available in each message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor$.html)*