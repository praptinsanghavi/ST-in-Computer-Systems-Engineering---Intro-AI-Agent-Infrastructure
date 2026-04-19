---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntryOrBuilder.html
title: ClusterMessages.ReceptionistEntryOrBuilder
---

# ClusterMessages.ReceptionistEntryOrBuilder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Interface ClusterMessages.ReceptionistEntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")`, `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")`

Enclosing class:
[ClusterMessages](ClusterMessages.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static interface ClusterMessages.ReceptionistEntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getActorRef](#getActorRef())()` | `required string actorRef = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getActorRefBytes](#getActorRefBytes())()` | `required string actorRef = 1;` |
	| `long` | `[getCreatedTimestamp](#getCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `long` | `[getSystemUid](#getSystemUid())()` | `required uint64 systemUid = 2;` |
	| `boolean` | `[hasActorRef](#hasActorRef())()` | `required string actorRef = 1;` |
	| `boolean` | `[hasCreatedTimestamp](#hasCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `boolean` | `[hasSystemUid](#hasSystemUid())()` | `required uint64 systemUid = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasActorRef
		
		
		
		```
		boolean hasActorRef()
		```
		
		`required string actorRef = 1;`
		
		Returns:
		Whether the actorRef field is set.
		- #### getActorRef
		
		
		
		```
		java.lang.String getActorRef()
		```
		
		`required string actorRef = 1;`
		
		Returns:
		The actorRef.
		- #### getActorRefBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getActorRefBytes()
		```
		
		`required string actorRef = 1;`
		
		Returns:
		The bytes for actorRef.
		- #### hasSystemUid
		
		
		
		```
		boolean hasSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Returns:
		Whether the systemUid field is set.
		- #### getSystemUid
		
		
		
		```
		long getSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Returns:
		The systemUid.
		- #### hasCreatedTimestamp
		
		
		
		```
		boolean hasCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Returns:
		Whether the createdTimestamp field is set.
		- #### getCreatedTimestamp
		
		
		
		```
		long getCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Returns:
		The createdTimestamp.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntryOrBuilder.html)*