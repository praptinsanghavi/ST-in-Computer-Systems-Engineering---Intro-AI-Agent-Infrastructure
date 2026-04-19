---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShardsOrBuilder.html
title: ClusterShardingMessages.StopShardsOrBuilder
---

# ClusterShardingMessages.StopShardsOrBuilder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Interface ClusterShardingMessages.StopShardsOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")`, `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")`

Enclosing class:
[ClusterShardingMessages](ClusterShardingMessages.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static interface ClusterShardingMessages.StopShardsOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getShards](#getShards(int))​(int index)` | `repeated string shards = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardsBytes](#getShardsBytes(int))​(int index)` | `repeated string shards = 1;` |
	| `int` | `[getShardsCount](#getShardsCount())()` | `repeated string shards = 1;` |
	| `java.util.List<java.lang.String>` | `[getShardsList](#getShardsList())()` | `repeated string shards = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### getShardsList
		
		
		
		```
		java.util.List<java.lang.String> getShardsList()
		```
		
		`repeated string shards = 1;`
		
		Returns:
		A list containing the shards.
		- #### getShardsCount
		
		
		
		```
		int getShardsCount()
		```
		
		`repeated string shards = 1;`
		
		Returns:
		The count of shards.
		- #### getShards
		
		
		
		```
		java.lang.String getShards​(int index)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The shards at the given index.
		- #### getShardsBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getShardsBytes​(int index)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the shards at the given index.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShardsOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShardsOrBuilder.html)*