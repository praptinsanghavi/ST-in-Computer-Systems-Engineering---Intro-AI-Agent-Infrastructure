---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:40:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html
title: ClusterShardingMessages.CoordinatorState.ShardEntry
---

# ClusterShardingMessages.CoordinatorState.ShardEntry

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.CoordinatorState.ShardEntry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry

- All Implemented Interfaces:
`[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ClusterShardingMessages.CoordinatorState](ClusterShardingMessages.CoordinatorState.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.CoordinatorState.ShardEntry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `CoordinatorState.ShardEntry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | Protobuf type `CoordinatorState.ShardEntry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[REGIONREF_FIELD_NUMBER](#REGIONREF_FIELD_NUMBER)` |  |
	| `static int` | `[SHARDID_FIELD_NUMBER](#SHARDID_FIELD_NUMBER)` |  |
	
	
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
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `java.lang.String` | `[getRegionRef](#getRegionRef())()` | `required string regionRef = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getRegionRefBytes](#getRegionRefBytes())()` | `required string regionRef = 2;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `java.lang.String` | `[getShardId](#getShardId())()` | `required string shardId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getShardIdBytes](#getShardIdBytes())()` | `required string shardId = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasRegionRef](#hasRegionRef())()` | `required string regionRef = 2;` |
	| `boolean` | `[hasShardId](#hasShardId())()` | `required string shardId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry))​([ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") prototype)` |  |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### SHARDID\_FIELD\_NUMBER
		
		
		
		```
		public static final int SHARDID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry.SHARDID_FIELD_NUMBER)
		- #### REGIONREF\_FIELD\_NUMBER
		
		
		
		```
		public static final int REGIONREF_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CoordinatorState.ShardEntry.REGIONREF_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> PARSER
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
		- #### hasShardId
		
		
		
		```
		public boolean hasShardId()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[hasShardId](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#hasShardId())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the shardId field is set.
		- #### getShardId
		
		
		
		```
		public java.lang.String getShardId()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[getShardId](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#getShardId())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The shardId.
		- #### getShardIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getShardIdBytes()
		```
		
		`required string shardId = 1;`
		
		Specified by:
		`[getShardIdBytes](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#getShardIdBytes())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for shardId.
		- #### hasRegionRef
		
		
		
		```
		public boolean hasRegionRef()
		```
		
		`required string regionRef = 2;`
		
		Specified by:
		`[hasRegionRef](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#hasRegionRef())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the regionRef field is set.
		- #### getRegionRef
		
		
		
		```
		public java.lang.String getRegionRef()
		```
		
		`required string regionRef = 2;`
		
		Specified by:
		`[getRegionRef](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#getRegionRef())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The regionRef.
		- #### getRegionRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRegionRefBytes()
		```
		
		`required string regionRef = 2;`
		
		Specified by:
		`[getRegionRefBytes](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html#getRegionRefBytes())` in interface `[ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder](ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for regionRef.
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
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(byte[] data)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(byte[] data,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilder​([ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ClusterShardingMessages.CoordinatorState.ShardEntry.Builder](ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.CoordinatorState.ShardEntry](ClusterShardingMessages.CoordinatorState.ShardEntry.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CoordinatorState.ShardEntry.html)*