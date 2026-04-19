---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html
title: ClusterShardingMessages.StopShards
---

# ClusterShardingMessages.StopShards

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.StopShards

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards

- All Implemented Interfaces:
`[ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ClusterShardingMessages](ClusterShardingMessages.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.StopShards
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ClusterShardingMessages.StopShardsOrBuilder](ClusterShardingMessages.StopShardsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `StopShards`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | Protobuf type `StopShards` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[SHARDS_FIELD_NUMBER](#SHARDS_FIELD_NUMBER)` |  |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `java.lang.String` | `[getShards](#getShards(int))​(int index)` | `repeated string shards = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardsBytes](#getShardsBytes(int))​(int index)` | `repeated string shards = 1;` |
	| `int` | `[getShardsCount](#getShardsCount())()` | `repeated string shards = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getShardsList](#getShardsList())()` | `repeated string shards = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards))​([ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") prototype)` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### SHARDS\_FIELD\_NUMBER
		
		
		
		```
		public static final int SHARDS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.StopShards.SHARDS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
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
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(byte[] data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(byte[] data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilder​([ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ClusterShardingMessages.StopShards.Builder](ClusterShardingMessages.StopShards.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.StopShards](ClusterShardingMessages.StopShards.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShardsOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.StopShards.html)*