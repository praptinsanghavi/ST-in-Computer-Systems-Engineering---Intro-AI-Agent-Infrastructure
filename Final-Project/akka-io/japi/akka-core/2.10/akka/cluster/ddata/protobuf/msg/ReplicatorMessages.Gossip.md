---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.EntryOrBuilder.html
title: ReplicatorMessages.Gossip.EntryOrBuilder
---

# ReplicatorMessages.Gossip.EntryOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatorMessages.Gossip.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatorMessages.Gossip.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEnvelope](#getEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEnvelopeOrBuilder](#getEnvelopeOrBuilder())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `long` | `[getUsedTimestamp](#getUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `boolean` | `[hasEnvelope](#hasEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasUsedTimestamp](#hasUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	
	
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
		- #### hasUsedTimestamp
		
		
		
		```
		boolean hasUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Returns:
		Whether the usedTimestamp field is set.
		- #### getUsedTimestamp
		
		
		
		```
		long getUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Returns:
		The usedTimestamp.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.EntryOrBuilder.html)*