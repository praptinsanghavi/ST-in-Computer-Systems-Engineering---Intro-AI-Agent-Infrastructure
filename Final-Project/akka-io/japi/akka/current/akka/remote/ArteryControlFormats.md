---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.html
title: ArteryControlFormats.UniqueAddress
---

# ArteryControlFormats.UniqueAddress

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.UniqueAddress

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.ArteryControlFormats.UniqueAddress

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`, `java.io.Serializable`

Enclosing class:
[ArteryControlFormats](ArteryControlFormats.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.UniqueAddress
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")
```

```

 Defines a remote address with uid.
 
```

 Protobuf type `UniqueAddress`

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.ArteryControlFormats.UniqueAddress)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | Defines a remote address with uid. |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ADDRESS_FIELD_NUMBER](#ADDRESS_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[UID_FIELD_NUMBER](#UID_FIELD_NUMBER)` |  |
	
	
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
	| `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | `[getAddress](#getAddress())()` | `required .Address address = 1;` |
	| `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 1;` |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getUid](#getUid())()` | `required uint64 uid = 2;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasUid](#hasUid())()` | `required uint64 uid = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") prototype)` |  |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")>` | `[parser](#parser())()` |  |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### ADDRESS\_FIELD\_NUMBER
		
		
		
		```
		public static final int ADDRESS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.UniqueAddress.ADDRESS_FIELD_NUMBER)
		- #### UID\_FIELD\_NUMBER
		
		
		
		```
		public static final int UID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.UniqueAddress.UID_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")> PARSER
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
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[hasAddress](ArteryControlFormats.UniqueAddressOrBuilder.html#hasAddress())` in interface `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") getAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddress](ArteryControlFormats.UniqueAddressOrBuilder.html#getAddress())` in interface `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The address.
		- #### getAddressOrBuilder
		
		
		
		```
		public [ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote") getAddressOrBuilder()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html#getAddressOrBuilder())` in interface `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required uint64 uid = 2;`
		
		Specified by:
		`[hasUid](ArteryControlFormats.UniqueAddressOrBuilder.html#hasUid())` in interface `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public long getUid()
		```
		
		`required uint64 uid = 2;`
		
		Specified by:
		`[getUid](ArteryControlFormats.UniqueAddressOrBuilder.html#getUid())` in interface `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The uid.
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
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(byte[] data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(byte[] data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") newBuilder​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.html](https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.html)*