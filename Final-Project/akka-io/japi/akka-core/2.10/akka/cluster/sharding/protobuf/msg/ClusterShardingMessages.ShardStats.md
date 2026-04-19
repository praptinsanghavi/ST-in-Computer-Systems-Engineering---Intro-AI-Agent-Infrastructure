---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.Builder.html
title: ClusterShardingMessages.ShardStats.Builder
---

# ClusterShardingMessages.ShardStats.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.ShardStats.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardStats.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.ShardStats.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `ShardStats`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearEntityCount](#clearEntityCount())()` | `required int32 entityCount = 2;` |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShard](#clearShard())()` | `required string shard = 1;` |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getEntityCount](#getEntityCount())()` | `required int32 entityCount = 2;` |
	| `java.lang.String` | `[getShard](#getShard())()` | `required string shard = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardBytes](#getShardBytes())()` | `required string shard = 1;` |
	| `boolean` | `[hasEntityCount](#hasEntityCount())()` | `required int32 entityCount = 2;` |
	| `boolean` | `[hasShard](#hasShard())()` | `required string shard = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardStats))​([ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setEntityCount](#setEntityCount(int))​(int value)` | `required int32 entityCount = 2;` |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShard](#setShard(java.lang.String))​(java.lang.String value)` | `required string shard = 1;` |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShardBytes](#setShardBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string shard = 1;` |
	| `[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.ShardStats](ClusterShardingMessages.ShardStats.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasShard
		
		
		
		```
		public boolean hasShard()
		```
		
		`required string shard = 1;`
		
		Specified by:
		`[hasShard](ClusterShardingMessages.ShardStatsOrBuilder.html#hasShard())` in interface `[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the shard field is set.
		- #### getShard
		
		
		
		```
		public java.lang.String getShard()
		```
		
		`required string shard = 1;`
		
		Specified by:
		`[getShard](ClusterShardingMessages.ShardStatsOrBuilder.html#getShard())` in interface `[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The shard.
		- #### getShardBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getShardBytes()
		```
		
		`required string shard = 1;`
		
		Specified by:
		`[getShardBytes](ClusterShardingMessages.ShardStatsOrBuilder.html#getShardBytes())` in interface `[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for shard.
		- #### setShard
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShard​(java.lang.String value)
		```
		
		`required string shard = 1;`
		
		Parameters:
		`value` \- The shard to set.
		Returns:
		This builder for chaining.
		- #### clearShard
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShard()
		```
		
		`required string shard = 1;`
		
		Returns:
		This builder for chaining.
		- #### setShardBytes
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShardBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string shard = 1;`
		
		Parameters:
		`value` \- The bytes for shard to set.
		Returns:
		This builder for chaining.
		- #### hasEntityCount
		
		
		
		```
		public boolean hasEntityCount()
		```
		
		`required int32 entityCount = 2;`
		
		Specified by:
		`[hasEntityCount](ClusterShardingMessages.ShardStatsOrBuilder.html#hasEntityCount())` in interface `[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the entityCount field is set.
		- #### getEntityCount
		
		
		
		```
		public int getEntityCount()
		```
		
		`required int32 entityCount = 2;`
		
		Specified by:
		`[getEntityCount](ClusterShardingMessages.ShardStatsOrBuilder.html#getEntityCount())` in interface `[ClusterShardingMessages.ShardStatsOrBuilder](ClusterShardingMessages.ShardStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The entityCount.
		- #### setEntityCount
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setEntityCount​(int value)
		```
		
		`required int32 entityCount = 2;`
		
		Parameters:
		`value` \- The entityCount to set.
		Returns:
		This builder for chaining.
		- #### clearEntityCount
		
		
		
		```
		public [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearEntityCount()
		```
		
		`required int32 entityCount = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardStats.Builder](ClusterShardingMessages.ShardStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStatsOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardStats.Builder.html)*