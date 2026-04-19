---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.Builder.html
title: ClusterShardingMessages.EntityState.Builder
---

# ClusterShardingMessages.EntityState.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.EntityState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityState.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.EntityState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `EntityState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllEntities](#addAllEntities(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string entities = 1;` |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addEntities](#addEntities(java.lang.String))​(java.lang.String value)` | `repeated string entities = 1;` |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addEntitiesBytes](#addEntitiesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string entities = 1;` |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearEntities](#clearEntities())()` | `repeated string entities = 1;` |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getEntities](#getEntities(int))​(int index)` | `repeated string entities = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntitiesBytes](#getEntitiesBytes(int))​(int index)` | `repeated string entities = 1;` |
	| `int` | `[getEntitiesCount](#getEntitiesCount())()` | `repeated string entities = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getEntitiesList](#getEntitiesList())()` | `repeated string entities = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityState))​([ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setEntities](#setEntities(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string entities = 1;` |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.EntityState](ClusterShardingMessages.EntityState.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getEntitiesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getEntitiesList()
		```
		
		`repeated string entities = 1;`
		
		Specified by:
		`[getEntitiesList](ClusterShardingMessages.EntityStateOrBuilder.html#getEntitiesList())` in interface `[ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the entities.
		- #### getEntitiesCount
		
		
		
		```
		public int getEntitiesCount()
		```
		
		`repeated string entities = 1;`
		
		Specified by:
		`[getEntitiesCount](ClusterShardingMessages.EntityStateOrBuilder.html#getEntitiesCount())` in interface `[ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of entities.
		- #### getEntities
		
		
		
		```
		public java.lang.String getEntities​(int index)
		```
		
		`repeated string entities = 1;`
		
		Specified by:
		`[getEntities](ClusterShardingMessages.EntityStateOrBuilder.html#getEntities(int))` in interface `[ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The entities at the given index.
		- #### getEntitiesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEntitiesBytes​(int index)
		```
		
		`repeated string entities = 1;`
		
		Specified by:
		`[getEntitiesBytes](ClusterShardingMessages.EntityStateOrBuilder.html#getEntitiesBytes(int))` in interface `[ClusterShardingMessages.EntityStateOrBuilder](ClusterShardingMessages.EntityStateOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the entities at the given index.
		- #### setEntities
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setEntities​(int index,
		                                                               java.lang.String value)
		```
		
		`repeated string entities = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The entities to set.
		Returns:
		This builder for chaining.
		- #### addEntities
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addEntities​(java.lang.String value)
		```
		
		`repeated string entities = 1;`
		
		Parameters:
		`value` \- The entities to add.
		Returns:
		This builder for chaining.
		- #### addAllEntities
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllEntities​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string entities = 1;`
		
		Parameters:
		`values` \- The entities to add.
		Returns:
		This builder for chaining.
		- #### clearEntities
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearEntities()
		```
		
		`repeated string entities = 1;`
		
		Returns:
		This builder for chaining.
		- #### addEntitiesBytes
		
		
		
		```
		public [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") addEntitiesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string entities = 1;`
		
		Parameters:
		`value` \- The bytes of the entities to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityState.Builder](ClusterShardingMessages.EntityState.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStateOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityState.Builder.html)*