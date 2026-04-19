---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html
title: ClusterShardingMessages.StopShards.Builder
---

# ClusterShardingMessages.StopShards.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.StopShards.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.StopShards.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `StopShards`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllShards](#addAllShards(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string shards = 1;` |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShards](#addShards(java.lang.String))​(java.lang.String value)` | `repeated string shards = 1;` |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addShardsBytes](#addShardsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string shards = 1;` |
	| `[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearShards](#clearShards())()` | `repeated string shards = 1;` |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getShards](#getShards(int))​(int index)` | `repeated string shards = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardsBytes](#getShardsBytes(int))​(int index)` | `repeated string shards = 1;` |
	| `int` | `[getShardsCount](#getShardsCount())()` | `repeated string shards = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getShardsList](#getShardsList())()` | `repeated string shards = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards))​([ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setShards](#setShards(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string shards = 1;` |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getShardsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getShardsList()
		```
		
		`repeated string shards = 1;`
		
		Specified by:
		`[getShardsList](ClusterShardingMessages.StopShardsOrBuilder.html#getShardsList())` in interface `[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		A list containing the shards.
		- #### getShardsCount
		
		
		
		```
		public int getShardsCount()
		```
		
		`repeated string shards = 1;`
		
		Specified by:
		`[getShardsCount](ClusterShardingMessages.StopShardsOrBuilder.html#getShardsCount())` in interface `[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The count of shards.
		- #### getShards
		
		
		
		```
		public java.lang.String getShards​(int index)
		```
		
		`repeated string shards = 1;`
		
		Specified by:
		`[getShards](ClusterShardingMessages.StopShardsOrBuilder.html#getShards(int))` in interface `[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The shards at the given index.
		- #### getShardsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getShardsBytes​(int index)
		```
		
		`repeated string shards = 1;`
		
		Specified by:
		`[getShardsBytes](ClusterShardingMessages.StopShardsOrBuilder.html#getShardsBytes(int))` in interface `[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the shards at the given index.
		- #### setShards
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") setShards​(int index,
		                                                            java.lang.String value)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The shards to set.
		Returns:
		This builder for chaining.
		- #### addShards
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShards​(java.lang.String value)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`value` \- The shards to add.
		Returns:
		This builder for chaining.
		- #### addAllShards
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllShards​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`values` \- The shards to add.
		Returns:
		This builder for chaining.
		- #### clearShards
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearShards()
		```
		
		`repeated string shards = 1;`
		
		Returns:
		This builder for chaining.
		- #### addShardsBytes
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") addShardsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string shards = 1;`
		
		Parameters:
		`value` \- The bytes of the shards to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShardsOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html)*