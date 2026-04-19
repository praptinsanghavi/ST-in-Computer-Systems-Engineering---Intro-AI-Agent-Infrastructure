---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html
title: ClusterMessages.VectorClock.VersionOrBuilder
---

# ClusterMessages.VectorClock.VersionOrBuilder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Interface ClusterMessages.VectorClock.VersionOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")`, `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")`

Enclosing class:
[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")

---

```
public static interface ClusterMessages.VectorClock.VersionOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getHashIndex](#getHashIndex())()` | `required int32 hashIndex = 1;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasHashIndex](#hasHashIndex())()` | `required int32 hashIndex = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasHashIndex
		
		
		
		```
		boolean hasHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Returns:
		Whether the hashIndex field is set.
		- #### getHashIndex
		
		
		
		```
		int getHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Returns:
		The hashIndex.
		- #### hasTimestamp
		
		
		
		```
		boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		The timestamp.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html)*