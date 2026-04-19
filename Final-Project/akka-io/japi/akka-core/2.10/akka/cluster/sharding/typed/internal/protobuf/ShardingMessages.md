---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelopeOrBuilder.html
title: ShardingMessages.ShardingEnvelopeOrBuilder
---

# ShardingMessages.ShardingEnvelopeOrBuilder

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Interface ShardingMessages.ShardingEnvelopeOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf")`, `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")`

Enclosing class:
[ShardingMessages](ShardingMessages.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static interface ShardingMessages.ShardingEnvelopeOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getEntityId](#getEntityId())()` | `required string entityId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityIdBytes](#getEntityIdBytes())()` | `required string entityId = 1;` |
	| `[ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .Payload message = 2;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .Payload message = 2;` |
	| `boolean` | `[hasEntityId](#hasEntityId())()` | `required string entityId = 1;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .Payload message = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasEntityId
		
		
		
		```
		boolean hasEntityId()
		```
		
		`required string entityId = 1;`
		
		Returns:
		Whether the entityId field is set.
		- #### getEntityId
		
		
		
		```
		java.lang.String getEntityId()
		```
		
		`required string entityId = 1;`
		
		Returns:
		The entityId.
		- #### getEntityIdBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getEntityIdBytes()
		```
		
		`required string entityId = 1;`
		
		Returns:
		The bytes for entityId.
		- #### hasMessage
		
		
		
		```
		boolean hasMessage()
		```
		
		`required .Payload message = 2;`
		
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		[ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMessage()
		```
		
		`required .Payload message = 2;`
		
		Returns:
		The message.
		- #### getMessageOrBuilder
		
		
		
		```
		[ContainerFormats.PayloadOrBuilder](../../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .Payload message = 2;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelopeOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelopeOrBuilder.html)*