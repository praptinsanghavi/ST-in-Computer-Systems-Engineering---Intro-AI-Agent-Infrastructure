---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html
title: DistributedPubSubMessages.Delta.EntryOrBuilder
---

# DistributedPubSubMessages.Delta.EntryOrBuilder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Interface DistributedPubSubMessages.Delta.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")`, `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")`

Enclosing class:
[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static interface DistributedPubSubMessages.Delta.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `java.lang.String` | `[getRef](#getRef())()` | `optional string ref = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getRefBytes](#getRefBytes())()` | `optional string ref = 3;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasRef](#hasRef())()` | `optional string ref = 3;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	
	
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
		- #### hasVersion
		
		
		
		```
		boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		long getVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		The version.
		- #### hasRef
		
		
		
		```
		boolean hasRef()
		```
		
		`optional string ref = 3;`
		
		Returns:
		Whether the ref field is set.
		- #### getRef
		
		
		
		```
		java.lang.String getRef()
		```
		
		`optional string ref = 3;`
		
		Returns:
		The ref.
		- #### getRefBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getRefBytes()
		```
		
		`optional string ref = 3;`
		
		Returns:
		The bytes for ref.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html)*