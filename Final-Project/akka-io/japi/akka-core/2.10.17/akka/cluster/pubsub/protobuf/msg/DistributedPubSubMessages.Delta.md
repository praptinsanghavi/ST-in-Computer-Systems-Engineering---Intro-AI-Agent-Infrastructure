---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:38:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html
title: DistributedPubSubMessages.Delta.Entry
---

# DistributedPubSubMessages.Delta.Entry

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Delta.Entry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry

- All Implemented Interfaces:
`[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Delta.Entry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Delta.Entry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | Protobuf type `Delta.Entry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[KEY_FIELD_NUMBER](#KEY_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[REF_FIELD_NUMBER](#REF_FIELD_NUMBER)` |  |
	| `static int` | `[VERSION_FIELD_NUMBER](#VERSION_FIELD_NUMBER)` |  |
	
	
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
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `java.lang.String` | `[getRef](#getRef())()` | `optional string ref = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getRefBytes](#getRefBytes())()` | `optional string ref = 3;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasRef](#hasRef())()` | `optional string ref = 3;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry))​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") prototype)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### KEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int KEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.KEY_FIELD_NUMBER)
		- #### VERSION\_FIELD\_NUMBER
		
		
		
		```
		public static final int VERSION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.VERSION_FIELD_NUMBER)
		- #### REF\_FIELD\_NUMBER
		
		
		
		```
		public static final int REF_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.REF_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> PARSER
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
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[hasKey](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasKey())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getKey())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getKeyBytes())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[hasVersion](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasVersion())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[getVersion](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getVersion())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The version.
		- #### hasRef
		
		
		
		```
		public boolean hasRef()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[hasRef](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasRef())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the ref field is set.
		- #### getRef
		
		
		
		```
		public java.lang.String getRef()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[getRef](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getRef())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The ref.
		- #### getRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRefBytes()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[getRefBytes](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getRefBytes())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for ref.
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
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html)*