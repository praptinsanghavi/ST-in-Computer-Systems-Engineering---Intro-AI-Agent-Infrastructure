---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:38:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html
title: ClusterMessages.VectorClock.Version
---

# ClusterMessages.VectorClock.Version

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.VectorClock.Version

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version

- All Implemented Interfaces:
`[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.VectorClock.Version
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `VectorClock.Version`

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | Protobuf type `VectorClock.Version` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[HASHINDEX_FIELD_NUMBER](#HASHINDEX_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[TIMESTAMP_FIELD_NUMBER](#TIMESTAMP_FIELD_NUMBER)` |  |
	
	
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
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `int` | `[getHashIndex](#getHashIndex())()` | `required int32 hashIndex = 1;` |
	| `akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasHashIndex](#hasHashIndex())()` | `required int32 hashIndex = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version))​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") prototype)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### HASHINDEX\_FIELD\_NUMBER
		
		
		
		```
		public static final int HASHINDEX_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.HASHINDEX_FIELD_NUMBER)
		- #### TIMESTAMP\_FIELD\_NUMBER
		
		
		
		```
		public static final int TIMESTAMP_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.TIMESTAMP_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> PARSER
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
		- #### hasHashIndex
		
		
		
		```
		public boolean hasHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Specified by:
		`[hasHashIndex](ClusterMessages.VectorClock.VersionOrBuilder.html#hasHashIndex())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the hashIndex field is set.
		- #### getHashIndex
		
		
		
		```
		public int getHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Specified by:
		`[getHashIndex](ClusterMessages.VectorClock.VersionOrBuilder.html#getHashIndex())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The hashIndex.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[hasTimestamp](ClusterMessages.VectorClock.VersionOrBuilder.html#hasTimestamp())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[getTimestamp](ClusterMessages.VectorClock.VersionOrBuilder.html#getTimestamp())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The timestamp.
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
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(byte[] data)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(byte[] data,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") newBuilder​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html)*