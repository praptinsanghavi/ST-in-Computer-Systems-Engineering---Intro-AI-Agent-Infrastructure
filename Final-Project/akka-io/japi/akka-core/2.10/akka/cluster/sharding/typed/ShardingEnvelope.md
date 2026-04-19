---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
title: ShardingEnvelope
---

# ShardingEnvelope

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingEnvelope\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.ShardingEnvelope\<M\>

- All Implemented Interfaces:
`[WrappedMessage](../../../actor/WrappedMessage.html "interface in akka.actor")`, `[ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ShardingEnvelope<M>
extends java.lang.Object
implements [WrappedMessage](../../../actor/WrappedMessage.html "interface in akka.actor"), [ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal"), scala.Product, java.io.Serializable
```

Default envelope type that may be used with Cluster Sharding.
 
 Cluster Sharding provides a default [`HashCodeMessageExtractor`](HashCodeMessageExtractor.html "class in akka.cluster.sharding.typed") that is able to handle
 these types of messages, by hashing the entityId into into the shardId. It is not the only,
 but a convenient way to send envelope\-wrapped messages via cluster sharding.
 

 The alternative way of routing messages through sharding is to not use envelopes,
 and have the message types themselves carry identifiers.
 

 param: entityId The business domain identifier of the entity.
 param: message The message to be send to the entity.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.ShardingEnvelope)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingEnvelope](#%3Cinit%3E(java.lang.String,M))​(java.lang.String entityId,  [M](ShardingEnvelope.html "type parameter in ShardingEnvelope") message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(java.lang.String,M))​(java.lang.String entityId,  M message)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>` | `[copy](#copy(java.lang.String,M))​(java.lang.String entityId,  M message)` |  |
	| `<M> java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `<M> M` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[entityId](#entityId())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[M](ShardingEnvelope.html "type parameter in ShardingEnvelope")` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <M> scala.Option<scala.Tuple2<java.lang.String,​M>>` | `[unapply](#unapply(akka.cluster.sharding.typed.ShardingEnvelope))​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ShardingEnvelope
		
		
		
		```
		public ShardingEnvelope​(java.lang.String entityId,
		                        [M](ShardingEnvelope.html "type parameter in ShardingEnvelope") message)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> apply​(java.lang.String entityId,
		                                            M message)
		```
		- #### unapply
		
		
		
		```
		public static <M> scala.Option<scala.Tuple2<java.lang.String,​M>> unapply​([ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> x$0)
		```
		- #### entityId
		
		
		
		```
		public java.lang.String entityId()
		```
		- #### message
		
		
		
		```
		public [M](ShardingEnvelope.html "type parameter in ShardingEnvelope") message()
		```
		
		
		Specified by:
		`[message](../../../actor/WrappedMessage.html#message())` in interface `[WrappedMessage](../../../actor/WrappedMessage.html "interface in akka.actor")`
		- #### copy
		
		
		
		```
		public <M> [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> copy​(java.lang.String entityId,
		                                    M message)
		```
		- #### copy$default$1
		
		
		
		```
		public <M> java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <M> M copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/ClusterShardingTypedSerializable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html)*