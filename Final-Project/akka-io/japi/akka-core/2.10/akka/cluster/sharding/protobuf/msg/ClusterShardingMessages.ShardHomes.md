---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.Builder.html
title: ClusterShardingMessages.ShardHomes.Builder
---

# ClusterShardingMessages.ShardHomes.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.ShardHomes.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomes.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.ShardHomes.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `ShardHomes`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllHomes](#addAllHomes(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomes](#addHomes(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry))​(int index,  [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomes](#addHomes(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry.Builder))​(int index,  [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomes](#addHomes(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry))​([ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomes](#addHomes(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry.Builder))​([ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomesBuilder](#addHomesBuilder())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addHomesBuilder](#addHomesBuilder(int))​(int index)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearHomes](#clearHomes())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getHomes](#getHomes(int))​(int index)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getHomesBuilder](#getHomesBuilder(int))​(int index)` | `repeated .ShardHomesEntry homes = 1;` |
	| `java.util.List<[ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getHomesBuilderList](#getHomesBuilderList())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `int` | `[getHomesCount](#getHomesCount())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `java.util.List<[ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getHomesList](#getHomesList())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomesEntryOrBuilder](ClusterShardingMessages.ShardHomesEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getHomesOrBuilder](#getHomesOrBuilder(int))​(int index)` | `repeated .ShardHomesEntry homes = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.ShardHomesEntryOrBuilder](ClusterShardingMessages.ShardHomesEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getHomesOrBuilderList](#getHomesOrBuilderList())()` | `repeated .ShardHomesEntry homes = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomes))​([ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeHomes](#removeHomes(int))​(int index)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setHomes](#setHomes(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry))​(int index,  [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setHomes](#setHomes(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardHomesEntry.Builder))​(int index,  [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .ShardHomesEntry homes = 1;` |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.ShardHomes](ClusterShardingMessages.ShardHomes.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getHomesList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")> getHomesList()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		
		Specified by:
		`[getHomesList](ClusterShardingMessages.ShardHomesOrBuilder.html#getHomesList())` in interface `[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getHomesCount
		
		
		
		```
		public int getHomesCount()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		
		Specified by:
		`[getHomesCount](ClusterShardingMessages.ShardHomesOrBuilder.html#getHomesCount())` in interface `[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") getHomes​(int index)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		
		Specified by:
		`[getHomes](ClusterShardingMessages.ShardHomesOrBuilder.html#getHomes(int))` in interface `[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") setHomes​(int index,
		                                                           [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### setHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") setHomes​(int index,
		                                                           [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomes​([ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomes​(int index,
		                                                           [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomes​([ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomes​(int index,
		                                                           [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addAllHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllHomes​(java.lang.Iterable<? extends [ClusterShardingMessages.ShardHomesEntry](ClusterShardingMessages.ShardHomesEntry.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### clearHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearHomes()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### removeHomes
		
		
		
		```
		public [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeHomes​(int index)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### getHomesBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") getHomesBuilder​(int index)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### getHomesOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardHomesEntryOrBuilder](ClusterShardingMessages.ShardHomesEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getHomesOrBuilder​(int index)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		
		Specified by:
		`[getHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html#getHomesOrBuilder(int))` in interface `[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getHomesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.ShardHomesEntryOrBuilder](ClusterShardingMessages.ShardHomesEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getHomesOrBuilderList()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		
		Specified by:
		`[getHomesOrBuilderList](ClusterShardingMessages.ShardHomesOrBuilder.html#getHomesOrBuilderList())` in interface `[ClusterShardingMessages.ShardHomesOrBuilder](ClusterShardingMessages.ShardHomesOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addHomesBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomesBuilder()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### addHomesBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addHomesBuilder​(int index)
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### getHomesBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.ShardHomesEntry.Builder](ClusterShardingMessages.ShardHomesEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getHomesBuilderList()
		```
		
		`repeated .ShardHomesEntry homes = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ShardHomes.Builder](ClusterShardingMessages.ShardHomes.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomesOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardHomes.Builder.html)*