---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.Builder.html
title: ClusterShardingMessages.RememberedShardState.Builder
---

# ClusterShardingMessages.RememberedShardState.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.RememberedShardState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.RememberedShardState.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.RememberedShardState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `RememberedShardState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllShardId](#addAllShardId(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string shardId = 1;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardId](#addShardId(java.lang.String))​(java.lang.String value)` | `repeated string shardId = 1;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardIdBytes](#addShardIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string shardId = 1;` |
	| `[ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearMarker](#clearMarker())()` | `optional bool marker = 2;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShardId](#clearShardId())()` | `repeated string shardId = 1;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getMarker](#getMarker())()` | `optional bool marker = 2;` |
	| `java.lang.String` | `[getShardId](#getShardId(int))​(int index)` | `repeated string shardId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardIdBytes](#getShardIdBytes(int))​(int index)` | `repeated string shardId = 1;` |
	| `int` | `[getShardIdCount](#getShardIdCount())()` | `repeated string shardId = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getShardIdList](#getShardIdList())()` | `repeated string shardId = 1;` |
	| `boolean` | `[hasMarker](#hasMarker())()` | `optional bool marker = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.RememberedShardState))​([ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setMarker](#setMarker(boolean))​(boolean value)` | `optional bool marker = 2;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShardId](#setShardId(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string shardId = 1;` |
	| `[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             int index,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.RememberedShardState](ClusterShardingMessages.RememberedShardState.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getShardIdList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getShardIdList()
		```
		
		`repeated string shardId = 1;`
		
		Specified by:
		`[getShardIdList](ClusterShardingMessages.RememberedShardStateOrBuilder.html#getShardIdList())` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the shardId.
		- #### getShardIdCount
		
		
		
		```
		public int getShardIdCount()
		```
		
		`repeated string shardId = 1;`
		
		Specified by:
		`[getShardIdCount](ClusterShardingMessages.RememberedShardStateOrBuilder.html#getShardIdCount())` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of shardId.
		- #### getShardId
		
		
		
		```
		public java.lang.String getShardId​(int index)
		```
		
		`repeated string shardId = 1;`
		
		Specified by:
		`[getShardId](ClusterShardingMessages.RememberedShardStateOrBuilder.html#getShardId(int))` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The shardId at the given index.
		- #### getShardIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getShardIdBytes​(int index)
		```
		
		`repeated string shardId = 1;`
		
		Specified by:
		`[getShardIdBytes](ClusterShardingMessages.RememberedShardStateOrBuilder.html#getShardIdBytes(int))` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the shardId at the given index.
		- #### setShardId
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShardId​(int index,
		                                                                       java.lang.String value)
		```
		
		`repeated string shardId = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The shardId to set.
		Returns:
		This builder for chaining.
		- #### addShardId
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardId​(java.lang.String value)
		```
		
		`repeated string shardId = 1;`
		
		Parameters:
		`value` \- The shardId to add.
		Returns:
		This builder for chaining.
		- #### addAllShardId
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllShardId​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string shardId = 1;`
		
		Parameters:
		`values` \- The shardId to add.
		Returns:
		This builder for chaining.
		- #### clearShardId
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShardId()
		```
		
		`repeated string shardId = 1;`
		
		Returns:
		This builder for chaining.
		- #### addShardIdBytes
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string shardId = 1;`
		
		Parameters:
		`value` \- The bytes of the shardId to add.
		Returns:
		This builder for chaining.
		- #### hasMarker
		
		
		
		```
		public boolean hasMarker()
		```
		
		`optional bool marker = 2;`
		
		Specified by:
		`[hasMarker](ClusterShardingMessages.RememberedShardStateOrBuilder.html#hasMarker())` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the marker field is set.
		- #### getMarker
		
		
		
		```
		public boolean getMarker()
		```
		
		`optional bool marker = 2;`
		
		Specified by:
		`[getMarker](ClusterShardingMessages.RememberedShardStateOrBuilder.html#getMarker())` in interface `[ClusterShardingMessages.RememberedShardStateOrBuilder](ClusterShardingMessages.RememberedShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The marker.
		- #### setMarker
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setMarker​(boolean value)
		```
		
		`optional bool marker = 2;`
		
		Parameters:
		`value` \- The marker to set.
		Returns:
		This builder for chaining.
		- #### clearMarker
		
		
		
		```
		public [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearMarker()
		```
		
		`optional bool marker = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.RememberedShardState.Builder](ClusterShardingMessages.RememberedShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardStateOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.RememberedShardState.Builder.html)*