---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.Builder.html
title: ClusterShardingMessages.CurrentShardRegionState.Builder
---

# ClusterShardingMessages.CurrentShardRegionState.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.CurrentShardRegionState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardRegionState.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.CurrentShardRegionState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `CurrentShardRegionState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllFailed](#addAllFailed(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllShards](#addAllShards(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addFailed](#addFailed(java.lang.String))​(java.lang.String value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addFailedBytes](#addFailedBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState))​(int index,  [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState.Builder))​(int index,  [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState))​([ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState.Builder))​([ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardsBuilder](#addShardsBuilder())()` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardsBuilder](#addShardsBuilder(int))​(int index)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearFailed](#clearFailed())()` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShards](#clearShards())()` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getFailed](#getFailed(int))​(int index)` | `repeated string failed = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getFailedBytes](#getFailedBytes(int))​(int index)` | `repeated string failed = 2;` |
	| `int` | `[getFailedCount](#getFailedCount())()` | `repeated string failed = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getFailedList](#getFailedList())()` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getShards](#getShards(int))​(int index)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getShardsBuilder](#getShardsBuilder(int))​(int index)` | `repeated .ShardState shards = 1;` |
	| `java.util.List<[ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getShardsBuilderList](#getShardsBuilderList())()` | `repeated .ShardState shards = 1;` |
	| `int` | `[getShardsCount](#getShardsCount())()` | `repeated .ShardState shards = 1;` |
	| `java.util.List<[ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getShardsList](#getShardsList())()` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.ShardStateOrBuilder](ClusterShardingMessages.ShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getShardsOrBuilder](#getShardsOrBuilder(int))​(int index)` | `repeated .ShardState shards = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.ShardStateOrBuilder](ClusterShardingMessages.ShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getShardsOrBuilderList](#getShardsOrBuilderList())()` | `repeated .ShardState shards = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardRegionState))​([ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeShards](#removeShards(int))​(int index)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setFailed](#setFailed(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShards](#setShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState))​(int index,  [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShards](#setShards(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardState.Builder))​(int index,  [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardState shards = 1;` |
	| `[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                int index,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.CurrentShardRegionState](ClusterShardingMessages.CurrentShardRegionState.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getShardsList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")> getShardsList()
		```
		
		`repeated .ShardState shards = 1;`
		
		Specified by:
		`[getShardsList](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getShardsList())` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShardsCount
		
		
		
		```
		public int getShardsCount()
		```
		
		`repeated .ShardState shards = 1;`
		
		Specified by:
		`[getShardsCount](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getShardsCount())` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShards
		
		
		
		```
		public [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") getShards​(int index)
		```
		
		`repeated .ShardState shards = 1;`
		
		Specified by:
		`[getShards](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getShards(int))` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShards​(int index,
		                                                                         [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardState shards = 1;`
		- #### setShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShards​(int index,
		                                                                         [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardState shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​([ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardState shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​(int index,
		                                                                         [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardState shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​([ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardState shards = 1;`
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​(int index,
		                                                                         [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardState shards = 1;`
		- #### addAllShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllShards​(java.lang.Iterable<? extends [ClusterShardingMessages.ShardState](ClusterShardingMessages.ShardState.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .ShardState shards = 1;`
		- #### clearShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShards()
		```
		
		`repeated .ShardState shards = 1;`
		- #### removeShards
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeShards​(int index)
		```
		
		`repeated .ShardState shards = 1;`
		- #### getShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") getShardsBuilder​(int index)
		```
		
		`repeated .ShardState shards = 1;`
		- #### getShardsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardStateOrBuilder](ClusterShardingMessages.ShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getShardsOrBuilder​(int index)
		```
		
		`repeated .ShardState shards = 1;`
		
		Specified by:
		`[getShardsOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getShardsOrBuilder(int))` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getShardsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.ShardStateOrBuilder](ClusterShardingMessages.ShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getShardsOrBuilderList()
		```
		
		`repeated .ShardState shards = 1;`
		
		Specified by:
		`[getShardsOrBuilderList](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getShardsOrBuilderList())` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardsBuilder()
		```
		
		`repeated .ShardState shards = 1;`
		- #### addShardsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardsBuilder​(int index)
		```
		
		`repeated .ShardState shards = 1;`
		- #### getShardsBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ShardState.Builder](ClusterShardingMessages.ShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getShardsBuilderList()
		```
		
		`repeated .ShardState shards = 1;`
		- #### getFailedList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getFailedList()
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailedList](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getFailedList())` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the failed.
		- #### getFailedCount
		
		
		
		```
		public int getFailedCount()
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailedCount](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getFailedCount())` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of failed.
		- #### getFailed
		
		
		
		```
		public java.lang.String getFailed​(int index)
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailed](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getFailed(int))` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The failed at the given index.
		- #### getFailedBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getFailedBytes​(int index)
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailedBytes](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html#getFailedBytes(int))` in interface `[ClusterShardingMessages.CurrentShardRegionStateOrBuilder](ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the failed at the given index.
		- #### setFailed
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setFailed​(int index,
		                                                                         java.lang.String value)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The failed to set.
		Returns:
		This builder for chaining.
		- #### addFailed
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addFailed​(java.lang.String value)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`value` \- The failed to add.
		Returns:
		This builder for chaining.
		- #### addAllFailed
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllFailed​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`values` \- The failed to add.
		Returns:
		This builder for chaining.
		- #### clearFailed
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearFailed()
		```
		
		`repeated string failed = 2;`
		
		Returns:
		This builder for chaining.
		- #### addFailedBytes
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addFailedBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`value` \- The bytes of the failed to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardRegionState.Builder](ClusterShardingMessages.CurrentShardRegionState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionStateOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardState.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStateOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardRegionState.Builder.html)*