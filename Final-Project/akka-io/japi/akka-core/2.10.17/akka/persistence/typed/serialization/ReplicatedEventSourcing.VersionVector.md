---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html
title: ReplicatedEventSourcing.VersionVector.Entry
---

# ReplicatedEventSourcing.VersionVector.Entry

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.VersionVector.Entry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry

- All Implemented Interfaces:
`[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.VersionVector.Entry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `VersionVector.Entry`

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | Protobuf type `VersionVector.Entry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[KEY_FIELD_NUMBER](#KEY_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")>` | `[PARSER](#PARSER)` | Deprecated. |
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
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilder](#newBuilder(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry))​([ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") prototype)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")>` | `[parser](#parser())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[toBuilder](#toBuilder())()` |  |
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
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry.KEY_FIELD_NUMBER)
		- #### VERSION\_FIELD\_NUMBER
		
		
		
		```
		public static final int VERSION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry.VERSION_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> PARSER
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
		`[hasKey](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html#hasKey())` in interface `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html#getKey())` in interface `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html#getKeyBytes())` in interface `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for key.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[hasVersion](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html#hasVersion())` in interface `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[getVersion](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html#getVersion())` in interface `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The version.
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
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(java.nio.ByteBuffer data)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(java.nio.ByteBuffer data,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(byte[] data)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(byte[] data,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseDelimitedFrom​(java.io.InputStream input)
		                                                                      throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseDelimitedFrom​(java.io.InputStream input,
		                                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                      throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") newBuilder​([ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html)*