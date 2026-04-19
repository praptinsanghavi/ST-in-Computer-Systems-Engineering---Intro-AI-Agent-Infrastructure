---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.WriteOrBuilder.html
title: ReplicatorMessages.WriteOrBuilder
---

# ReplicatorMessages.WriteOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatorMessages.WriteOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatorMessages.Write](ReplicatorMessages.Write.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatorMessages.Write.Builder](ReplicatorMessages.Write.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatorMessages](ReplicatorMessages.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatorMessages.WriteOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEnvelope](#getEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEnvelopeOrBuilder](#getEnvelopeOrBuilder())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getFromNode](#getFromNode())()` | `optional .akka.cluster.ddata.UniqueAddress fromNode = 3;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getFromNodeOrBuilder](#getFromNodeOrBuilder())()` | `optional .akka.cluster.ddata.UniqueAddress fromNode = 3;` |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `boolean` | `[hasEnvelope](#hasEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `boolean` | `[hasFromNode](#hasFromNode())()` | `optional .akka.cluster.ddata.UniqueAddress fromNode = 3;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasKey
		
		
		
		```
		boolean hasKey()
		```
		
		`required string key = 1;`
		
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Returns:
		The bytes for key.
		- #### hasEnvelope
		
		
		
		```
		boolean hasEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Returns:
		Whether the envelope field is set.
		- #### getEnvelope
		
		
		
		```
		[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") getEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Returns:
		The envelope.
		- #### getEnvelopeOrBuilder
		
		
		
		```
		[ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEnvelopeOrBuilder()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### hasFromNode
		
		
		
		```
		boolean hasFromNode()
		```
		
		`optional .akka.cluster.ddata.UniqueAddress fromNode = 3;`
		
		Returns:
		Whether the fromNode field is set.
		- #### getFromNode
		
		
		
		```
		[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getFromNode()
		```
		
		`optional .akka.cluster.ddata.UniqueAddress fromNode = 3;`
		
		Returns:
		The fromNode.
		- #### getFromNodeOrBuilder
		
		
		
		```
		[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getFromNodeOrBuilder()
		```
		
		`optional .akka.cluster.ddata.UniqueAddress fromNode = 3;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Write.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Write.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.WriteOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.WriteOrBuilder.html)*