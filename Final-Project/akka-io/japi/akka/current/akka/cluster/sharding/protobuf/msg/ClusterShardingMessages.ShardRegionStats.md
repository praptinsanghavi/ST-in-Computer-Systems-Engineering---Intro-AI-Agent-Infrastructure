---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.Builder.html
title: ClusterShardingMessages.ShardRegionStats.Builder
---

# ClusterShardingMessages.ShardRegionStats.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.ShardRegionStats.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.ShardRegionStats.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `ShardRegionStats`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllFailed](#addAllFailed(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllStats](#addAllStats(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addFailed](#addFailed(java.lang.String))​(java.lang.String value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addFailedBytes](#addFailedBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry))​(int index,  [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry.Builder))​(int index,  [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry))​([ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry.Builder))​([ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStatsBuilder](#addStatsBuilder())()` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStatsBuilder](#addStatsBuilder(int))​(int index)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearFailed](#clearFailed())()` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearStats](#clearStats())()` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getFailed](#getFailed(int))​(int index)` | `repeated string failed = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getFailedBytes](#getFailedBytes(int))​(int index)` | `repeated string failed = 2;` |
	| `int` | `[getFailedCount](#getFailedCount())()` | `repeated string failed = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getFailedList](#getFailedList())()` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStats](#getStats(int))​(int index)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStatsBuilder](#getStatsBuilder(int))​(int index)` | `repeated .MapFieldEntry stats = 1;` |
	| `java.util.List<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getStatsBuilderList](#getStatsBuilderList())()` | `repeated .MapFieldEntry stats = 1;` |
	| `int` | `[getStatsCount](#getStatsCount())()` | `repeated .MapFieldEntry stats = 1;` |
	| `java.util.List<[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getStatsList](#getStatsList())()` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getStatsOrBuilder](#getStatsOrBuilder(int))​(int index)` | `repeated .MapFieldEntry stats = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getStatsOrBuilderList](#getStatsOrBuilderList())()` | `repeated .MapFieldEntry stats = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats))​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeStats](#removeStats(int))​(int index)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setFailed](#setFailed(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string failed = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry))​(int index,  [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry.Builder))​(int index,  [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .MapFieldEntry stats = 1;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         int index,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getStatsList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")> getStatsList()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		
		Specified by:
		`[getStatsList](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getStatsList())` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStatsCount
		
		
		
		```
		public int getStatsCount()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		
		Specified by:
		`[getStatsCount](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getStatsCount())` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStats
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") getStats​(int index)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		
		Specified by:
		`[getStats](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getStats(int))` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​(int index,
		                                                                 [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​(int index,
		                                                                 [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​([ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​(int index,
		                                                                 [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​([ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​(int index,
		                                                                 [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addAllStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllStats​(java.lang.Iterable<? extends [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### clearStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearStats()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### removeStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeStats​(int index)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### getStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") getStatsBuilder​(int index)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### getStatsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getStatsOrBuilder​(int index)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		
		Specified by:
		`[getStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getStatsOrBuilder(int))` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStatsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getStatsOrBuilderList()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		
		Specified by:
		`[getStatsOrBuilderList](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getStatsOrBuilderList())` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStatsBuilder()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### addStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStatsBuilder​(int index)
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### getStatsBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getStatsBuilderList()
		```
		
		`repeated .MapFieldEntry stats = 1;`
		- #### getFailedList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getFailedList()
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailedList](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getFailedList())` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the failed.
		- #### getFailedCount
		
		
		
		```
		public int getFailedCount()
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailedCount](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getFailedCount())` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of failed.
		- #### getFailed
		
		
		
		```
		public java.lang.String getFailed​(int index)
		```
		
		`repeated string failed = 2;`
		
		Specified by:
		`[getFailed](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getFailed(int))` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
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
		`[getFailedBytes](ClusterShardingMessages.ShardRegionStatsOrBuilder.html#getFailedBytes(int))` in interface `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the failed at the given index.
		- #### setFailed
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setFailed​(int index,
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
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addFailed​(java.lang.String value)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`value` \- The failed to add.
		Returns:
		This builder for chaining.
		- #### addAllFailed
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllFailed​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`values` \- The failed to add.
		Returns:
		This builder for chaining.
		- #### clearFailed
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearFailed()
		```
		
		`repeated string failed = 2;`
		
		Returns:
		This builder for chaining.
		- #### addFailedBytes
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addFailedBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string failed = 2;`
		
		Parameters:
		`value` \- The bytes of the failed to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStatsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.Builder.html)*