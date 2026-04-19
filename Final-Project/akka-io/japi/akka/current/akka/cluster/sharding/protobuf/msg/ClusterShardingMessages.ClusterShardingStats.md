---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.Builder.html
title: ClusterShardingMessages.ClusterShardingStats.Builder
---

# ClusterShardingMessages.ClusterShardingStats.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.ClusterShardingStats.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStats.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.ClusterShardingStats.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `ClusterShardingStats`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllStats](#addAllStats(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry))​(int index,  [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry.Builder))​(int index,  [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry))​([ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStats](#addStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry.Builder))​([ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStatsBuilder](#addStatsBuilder())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addStatsBuilder](#addStatsBuilder(int))​(int index)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearStats](#clearStats())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStats](#getStats(int))​(int index)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStatsBuilder](#getStatsBuilder(int))​(int index)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `java.util.List<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getStatsBuilderList](#getStatsBuilderList())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `int` | `[getStatsCount](#getStatsCount())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `java.util.List<[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getStatsList](#getStatsList())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getStatsOrBuilder](#getStatsOrBuilder(int))​(int index)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getStatsOrBuilderList](#getStatsOrBuilderList())()` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStats))​([ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeStats](#removeStats(int))​(int index)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry))​(int index,  [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry.Builder))​(int index,  [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ClusterShardingStatsEntry stats = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             int index,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.ClusterShardingStats](ClusterShardingMessages.ClusterShardingStats.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getStatsList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")> getStatsList()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		
		Specified by:
		`[getStatsList](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html#getStatsList())` in interface `[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStatsCount
		
		
		
		```
		public int getStatsCount()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		
		Specified by:
		`[getStatsCount](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html#getStatsCount())` in interface `[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") getStats​(int index)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		
		Specified by:
		`[getStats](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html#getStats(int))` in interface `[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​(int index,
		                                                                     [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​(int index,
		                                                                     [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​([ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​(int index,
		                                                                     [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​([ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStats​(int index,
		                                                                     [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addAllStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllStats​(java.lang.Iterable<? extends [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### clearStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearStats()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### removeStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeStats​(int index)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### getStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") getStatsBuilder​(int index)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### getStatsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getStatsOrBuilder​(int index)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		
		Specified by:
		`[getStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html#getStatsOrBuilder(int))` in interface `[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getStatsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getStatsOrBuilderList()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		
		Specified by:
		`[getStatsOrBuilderList](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html#getStatsOrBuilderList())` in interface `[ClusterShardingMessages.ClusterShardingStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStatsBuilder()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### addStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addStatsBuilder​(int index)
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### getStatsBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getStatsBuilderList()
		```
		
		`repeated .ClusterShardingStatsEntry stats = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStats.Builder](ClusterShardingMessages.ClusterShardingStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStats.Builder.html)*