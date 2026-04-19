---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.Builder.html
title: ClusterShardingMessages.CurrentShardState.Builder
---

# ClusterShardingMessages.CurrentShardState.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.CurrentShardState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardState.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.CurrentShardState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `CurrentShardState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllEntityIds](#addAllEntityIds(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string entityIds = 2;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addEntityIds](#addEntityIds(java.lang.String))​(java.lang.String value)` | `repeated string entityIds = 2;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addEntityIdsBytes](#addEntityIdsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string entityIds = 2;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearEntityIds](#clearEntityIds())()` | `repeated string entityIds = 2;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShardId](#clearShardId())()` | `required string shardId = 1;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getEntityIds](#getEntityIds(int))​(int index)` | `repeated string entityIds = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityIdsBytes](#getEntityIdsBytes(int))​(int index)` | `repeated string entityIds = 2;` |
	| `int` | `[getEntityIdsCount](#getEntityIdsCount())()` | `repeated string entityIds = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getEntityIdsList](#getEntityIdsList())()` | `repeated string entityIds = 2;` |
	| `java.lang.String` | `[getShardId](#getShardId())()` | `required string shardId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardIdBytes](#getShardIdBytes())()` | `required string shardId = 1;` |
	| `boolean` | `[hasShardId](#hasShardId())()` | `required string shardId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentShardState))​([ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setEntityIds](#setEntityIds(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string entityIds = 2;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShardId](#setShardId(java.lang.String))​(java.lang.String value)` | `required string shardId = 1;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShardIdBytes](#setShardIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string shardId = 1;` |
	| `[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.CurrentShardState](ClusterShardingMessages.CurrentShardState.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasShardId
		
		
		
		```
		public boolean hasShardId()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[hasShardId](ClusterShardingMessages.CurrentShardStateOrBuilder.html#hasShardId())` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the shardId field is set.
		- #### getShardId
		
		
		
		```
		public java.lang.String getShardId()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[getShardId](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getShardId())` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The shardId.
		- #### getShardIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getShardIdBytes()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[getShardIdBytes](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getShardIdBytes())` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for shardId.
		- #### setShardId
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShardId​(java.lang.String value)
		```
		
		`required string shardId = 1;`
		
		Parameters:
		`value` \- The shardId to set.
		Returns:
		This builder for chaining.
		- #### clearShardId
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShardId()
		```
		
		`required string shardId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setShardIdBytes
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShardIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string shardId = 1;`
		
		Parameters:
		`value` \- The bytes for shardId to set.
		Returns:
		This builder for chaining.
		- #### getEntityIdsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getEntityIdsList()
		```
		
		`repeated string entityIds = 2;`
		
		Specified by:
		`[getEntityIdsList](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getEntityIdsList())` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the entityIds.
		- #### getEntityIdsCount
		
		
		
		```
		public int getEntityIdsCount()
		```
		
		`repeated string entityIds = 2;`
		
		Specified by:
		`[getEntityIdsCount](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getEntityIdsCount())` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of entityIds.
		- #### getEntityIds
		
		
		
		```
		public java.lang.String getEntityIds​(int index)
		```
		
		`repeated string entityIds = 2;`
		
		Specified by:
		`[getEntityIds](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getEntityIds(int))` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The entityIds at the given index.
		- #### getEntityIdsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEntityIdsBytes​(int index)
		```
		
		`repeated string entityIds = 2;`
		
		Specified by:
		`[getEntityIdsBytes](ClusterShardingMessages.CurrentShardStateOrBuilder.html#getEntityIdsBytes(int))` in interface `[ClusterShardingMessages.CurrentShardStateOrBuilder](ClusterShardingMessages.CurrentShardStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the entityIds at the given index.
		- #### setEntityIds
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setEntityIds​(int index,
		                                                                      java.lang.String value)
		```
		
		`repeated string entityIds = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The entityIds to set.
		Returns:
		This builder for chaining.
		- #### addEntityIds
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addEntityIds​(java.lang.String value)
		```
		
		`repeated string entityIds = 2;`
		
		Parameters:
		`value` \- The entityIds to add.
		Returns:
		This builder for chaining.
		- #### addAllEntityIds
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllEntityIds​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string entityIds = 2;`
		
		Parameters:
		`values` \- The entityIds to add.
		Returns:
		This builder for chaining.
		- #### clearEntityIds
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearEntityIds()
		```
		
		`repeated string entityIds = 2;`
		
		Returns:
		This builder for chaining.
		- #### addEntityIdsBytes
		
		
		
		```
		public [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addEntityIdsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string entityIds = 2;`
		
		Parameters:
		`value` \- The bytes of the entityIds to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentShardState.Builder](ClusterShardingMessages.CurrentShardState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardStateOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentShardState.Builder.html)*