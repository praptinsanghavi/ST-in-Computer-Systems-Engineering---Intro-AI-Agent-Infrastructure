---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.Builder.html
title: ClusterShardingMessages.CoordinatorState.Builder
---

# ClusterShardingMessages.CoordinatorState.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.CoordinatorState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.CoordinatorState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `CoordinatorState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllRegionProxies](#addAllRegionProxies(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string regionProxies = 3;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllRegions](#addAllRegions(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllShards](#addAllShards(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllUnallocatedShards](#addAllUnallocatedShards(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string unallocatedShards = 4;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegionProxies](#addRegionProxies(java.lang.String))​(java.lang.String value)` | `repeated string regionProxies = 3;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegionProxiesBytes](#addRegionProxiesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string regionProxies = 3;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegions](#addRegions(java.lang.String))​(java.lang.String value)` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegionsBytes](#addRegionsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry))​(int index,  [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry.Builder))​(int index,  [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry))​([ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry.Builder))​([ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardsBuilder](#addShardsBuilder())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardsBuilder](#addShardsBuilder(int))​(int index)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addUnallocatedShards](#addUnallocatedShards(java.lang.String))​(java.lang.String value)` | `repeated string unallocatedShards = 4;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addUnallocatedShardsBytes](#addUnallocatedShardsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string unallocatedShards = 4;` |
	| `[ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearRegionProxies](#clearRegionProxies())()` | `repeated string regionProxies = 3;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearRegions](#clearRegions())()` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShards](#clearShards())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearUnallocatedShards](#clearUnallocatedShards())()` | `repeated string unallocatedShards = 4;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getRegionProxies](#getRegionProxies(int))​(int index)` | `repeated string regionProxies = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getRegionProxiesBytes](#getRegionProxiesBytes(int))​(int index)` | `repeated string regionProxies = 3;` |
	| `int` | `[getRegionProxiesCount](#getRegionProxiesCount())()` | `repeated string regionProxies = 3;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getRegionProxiesList](#getRegionProxiesList())()` | `repeated string regionProxies = 3;` |
	| `java.lang.String` | `[getRegions](#getRegions(int))​(int index)` | `repeated string regions = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getRegionsBytes](#getRegionsBytes(int))​(int index)` | `repeated string regions = 2;` |
	| `int` | `[getRegionsCount](#getRegionsCount())()` | `repeated string regions = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getRegionsList](#getRegionsList())()` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getShards](#getShards(int))​(int index)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getShardsBuilder](#getShardsBuilder(int))​(int index)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `java.util.List<[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getShardsBuilderList](#getShardsBuilderList())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `int` | `[getShardsCount](#getShardsCount())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `java.util.List<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getShardsList](#getShardsList())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getShardsOrBuilder](#getShardsOrBuilder(int))​(int index)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getShardsOrBuilderList](#getShardsOrBuilderList())()` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `java.lang.String` | `[getUnallocatedShards](#getUnallocatedShards(int))​(int index)` | `repeated string unallocatedShards = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getUnallocatedShardsBytes](#getUnallocatedShardsBytes(int))​(int index)` | `repeated string unallocatedShards = 4;` |
	| `int` | `[getUnallocatedShardsCount](#getUnallocatedShardsCount())()` | `repeated string unallocatedShards = 4;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getUnallocatedShardsList](#getUnallocatedShardsList())()` | `repeated string unallocatedShards = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState))​([ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeShards](#removeShards(int))​(int index)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRegionProxies](#setRegionProxies(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string regionProxies = 3;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRegions](#setRegions(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string regions = 2;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShards](#setShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry))​(int index,  [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShards](#setShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry.Builder))​(int index,  [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .CoordinatorState.ShardEntry shards = 1;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnallocatedShards](#setUnallocatedShards(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string unallocatedShards = 4;` |
	| `[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3\.Builder
		
		
		`getAllFields, getField, getFieldBuilder, getOneofFieldDescriptor, getParentForChildren, getRepeatedField, getRepeatedFieldBuilder, getRepeatedFieldCount, getUnknownFields, getUnknownFieldSetBuilder, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, internalGetMutableMapField, internalGetMutableMapFieldReflection, isClean, markClean, mergeUnknownLengthDelimitedField, mergeUnknownVarintField, newBuilderForField, onBuilt, onChanged, parseUnknownField, setUnknownFieldSetBuilder, setUnknownFieldsProto3`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage.Builder
		
		
		`findInitializationErrors, getInitializationErrorString, internalMergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, newUninitializedMessageException, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite.Builder
		
		
		`addAll, addAll, mergeDelimitedFrom, mergeDelimitedFrom, mergeFrom, newUninitializedMessageException`
		- ### Methods inherited from class java.lang.Object
		
		
		`equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.Message.Builder
		
		
		`mergeDelimitedFrom, mergeDelimitedFrom`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite.Builder
		
		
		`mergeFrom`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         int index,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getShardsList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> getShardsList()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		
		Specified by:
		`[getShardsList](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getShardsList())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShardsCount
		
		
		
		```
		public int getShardsCount()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		
		Specified by:
		`[getShardsCount](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getShardsCount())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") getShards​(int index)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		
		Specified by:
		`[getShards](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getShards(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShards​(int index,
		                                                                  [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### setShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShards​(int index,
		                                                                  [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​([ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​(int index,
		                                                                  [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​([ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​(int index,
		                                                                  [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addAllShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllShards​(java.lang.Iterable<? extends [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### clearShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShards()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### removeShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeShards​(int index)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### getShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") getShardsBuilder​(int index)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### getShardsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getShardsOrBuilder​(int index)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		
		Specified by:
		`[getShardsOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getShardsOrBuilder(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShardsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getShardsOrBuilderList()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		
		Specified by:
		`[getShardsOrBuilderList](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getShardsOrBuilderList())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardsBuilder()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### addShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardsBuilder​(int index)
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### getShardsBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getShardsBuilderList()
		```
		
		`repeated .CoordinatorState.ShardEntry shards = 1;`
		- #### getRegionsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getRegionsList()
		```
		
		`repeated string regions = 2;`
		
		Specified by:
		`[getRegionsList](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionsList())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the regions.
		- #### getRegionsCount
		
		
		
		```
		public int getRegionsCount()
		```
		
		`repeated string regions = 2;`
		
		Specified by:
		`[getRegionsCount](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionsCount())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of regions.
		- #### getRegions
		
		
		
		```
		public java.lang.String getRegions​(int index)
		```
		
		`repeated string regions = 2;`
		
		Specified by:
		`[getRegions](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegions(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The regions at the given index.
		- #### getRegionsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRegionsBytes​(int index)
		```
		
		`repeated string regions = 2;`
		
		Specified by:
		`[getRegionsBytes](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionsBytes(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the regions at the given index.
		- #### setRegions
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRegions​(int index,
		                                                                   java.lang.String value)
		```
		
		`repeated string regions = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The regions to set.
		Returns:
		This builder for chaining.
		- #### addRegions
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegions​(java.lang.String value)
		```
		
		`repeated string regions = 2;`
		
		Parameters:
		`value` \- The regions to add.
		Returns:
		This builder for chaining.
		- #### addAllRegions
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllRegions​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string regions = 2;`
		
		Parameters:
		`values` \- The regions to add.
		Returns:
		This builder for chaining.
		- #### clearRegions
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearRegions()
		```
		
		`repeated string regions = 2;`
		
		Returns:
		This builder for chaining.
		- #### addRegionsBytes
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegionsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string regions = 2;`
		
		Parameters:
		`value` \- The bytes of the regions to add.
		Returns:
		This builder for chaining.
		- #### getRegionProxiesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getRegionProxiesList()
		```
		
		`repeated string regionProxies = 3;`
		
		Specified by:
		`[getRegionProxiesList](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionProxiesList())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the regionProxies.
		- #### getRegionProxiesCount
		
		
		
		```
		public int getRegionProxiesCount()
		```
		
		`repeated string regionProxies = 3;`
		
		Specified by:
		`[getRegionProxiesCount](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionProxiesCount())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of regionProxies.
		- #### getRegionProxies
		
		
		
		```
		public java.lang.String getRegionProxies​(int index)
		```
		
		`repeated string regionProxies = 3;`
		
		Specified by:
		`[getRegionProxies](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionProxies(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The regionProxies at the given index.
		- #### getRegionProxiesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRegionProxiesBytes​(int index)
		```
		
		`repeated string regionProxies = 3;`
		
		Specified by:
		`[getRegionProxiesBytes](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getRegionProxiesBytes(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the regionProxies at the given index.
		- #### setRegionProxies
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRegionProxies​(int index,
		                                                                         java.lang.String value)
		```
		
		`repeated string regionProxies = 3;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The regionProxies to set.
		Returns:
		This builder for chaining.
		- #### addRegionProxies
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegionProxies​(java.lang.String value)
		```
		
		`repeated string regionProxies = 3;`
		
		Parameters:
		`value` \- The regionProxies to add.
		Returns:
		This builder for chaining.
		- #### addAllRegionProxies
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllRegionProxies​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string regionProxies = 3;`
		
		Parameters:
		`values` \- The regionProxies to add.
		Returns:
		This builder for chaining.
		- #### clearRegionProxies
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearRegionProxies()
		```
		
		`repeated string regionProxies = 3;`
		
		Returns:
		This builder for chaining.
		- #### addRegionProxiesBytes
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegionProxiesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string regionProxies = 3;`
		
		Parameters:
		`value` \- The bytes of the regionProxies to add.
		Returns:
		This builder for chaining.
		- #### getUnallocatedShardsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getUnallocatedShardsList()
		```
		
		`repeated string unallocatedShards = 4;`
		
		Specified by:
		`[getUnallocatedShardsList](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getUnallocatedShardsList())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the unallocatedShards.
		- #### getUnallocatedShardsCount
		
		
		
		```
		public int getUnallocatedShardsCount()
		```
		
		`repeated string unallocatedShards = 4;`
		
		Specified by:
		`[getUnallocatedShardsCount](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getUnallocatedShardsCount())` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of unallocatedShards.
		- #### getUnallocatedShards
		
		
		
		```
		public java.lang.String getUnallocatedShards​(int index)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Specified by:
		`[getUnallocatedShards](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getUnallocatedShards(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The unallocatedShards at the given index.
		- #### getUnallocatedShardsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getUnallocatedShardsBytes​(int index)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Specified by:
		`[getUnallocatedShardsBytes](ClusterShardingMessages.CoordinatorStateOrBuilder.html#getUnallocatedShardsBytes(int))` in interface `[ClusterShardingMessages.CoordinatorStateOrBuilder](ClusterShardingMessages.CoordinatorStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the unallocatedShards at the given index.
		- #### setUnallocatedShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnallocatedShards​(int index,
		                                                                             java.lang.String value)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The unallocatedShards to set.
		Returns:
		This builder for chaining.
		- #### addUnallocatedShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addUnallocatedShards​(java.lang.String value)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Parameters:
		`value` \- The unallocatedShards to add.
		Returns:
		This builder for chaining.
		- #### addAllUnallocatedShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllUnallocatedShards​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Parameters:
		`values` \- The unallocatedShards to add.
		Returns:
		This builder for chaining.
		- #### clearUnallocatedShards
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearUnallocatedShards()
		```
		
		`repeated string unallocatedShards = 4;`
		
		Returns:
		This builder for chaining.
		- #### addUnallocatedShardsBytes
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addUnallocatedShardsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string unallocatedShards = 4;`
		
		Parameters:
		`value` \- The bytes of the unallocatedShards to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CoordinatorState.Builder](ClusterShardingMessages.CoordinatorState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorStateOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.Builder.html)*