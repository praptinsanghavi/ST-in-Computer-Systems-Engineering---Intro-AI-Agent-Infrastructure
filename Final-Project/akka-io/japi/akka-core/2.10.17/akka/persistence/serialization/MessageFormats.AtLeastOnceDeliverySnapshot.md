---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html
title: MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery
---

# MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery

- All Implemented Interfaces:
`[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery
extends akka.protobufv3.internal.GeneratedMessageV3
implements [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `AtLeastOnceDeliverySnapshot.UnconfirmedDelivery`

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | Protobuf type `AtLeastOnceDeliverySnapshot.UnconfirmedDelivery` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[DELIVERYID_FIELD_NUMBER](#DELIVERYID_FIELD_NUMBER)` |  |
	| `static int` | `[DESTINATION_FIELD_NUMBER](#DESTINATION_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[PAYLOAD_FIELD_NUMBER](#PAYLOAD_FIELD_NUMBER)` |  |
	
	
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
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `long` | `[getDeliveryId](#getDeliveryId())()` | `required int64 deliveryId = 1;` |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getDestination](#getDestination())()` | `required string destination = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getDestinationBytes](#getDestinationBytes())()` | `required string destination = 2;` |
	| `akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")>` | `[getParserForType](#getParserForType())()` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getPayload](#getPayload())()` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .PersistentPayload payload = 3;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `boolean` | `[hasDeliveryId](#hasDeliveryId())()` | `required int64 deliveryId = 1;` |
	| `boolean` | `[hasDestination](#hasDestination())()` | `required string destination = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .PersistentPayload payload = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[newBuilder](#newBuilder())()` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[newBuilder](#newBuilder(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery))​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") prototype)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")>` | `[parser](#parser())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### DELIVERYID\_FIELD\_NUMBER
		
		
		
		```
		public static final int DELIVERYID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.DELIVERYID_FIELD_NUMBER)
		- #### DESTINATION\_FIELD\_NUMBER
		
		
		
		```
		public static final int DESTINATION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.DESTINATION_FIELD_NUMBER)
		- #### PAYLOAD\_FIELD\_NUMBER
		
		
		
		```
		public static final int PAYLOAD_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.PAYLOAD_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> PARSER
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
		- #### hasDeliveryId
		
		
		
		```
		public boolean hasDeliveryId()
		```
		
		`required int64 deliveryId = 1;`
		
		Specified by:
		`[hasDeliveryId](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#hasDeliveryId())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the deliveryId field is set.
		- #### getDeliveryId
		
		
		
		```
		public long getDeliveryId()
		```
		
		`required int64 deliveryId = 1;`
		
		Specified by:
		`[getDeliveryId](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getDeliveryId())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The deliveryId.
		- #### hasDestination
		
		
		
		```
		public boolean hasDestination()
		```
		
		`required string destination = 2;`
		
		Specified by:
		`[hasDestination](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#hasDestination())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the destination field is set.
		- #### getDestination
		
		
		
		```
		public java.lang.String getDestination()
		```
		
		`required string destination = 2;`
		
		Specified by:
		`[getDestination](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getDestination())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The destination.
		- #### getDestinationBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getDestinationBytes()
		```
		
		`required string destination = 2;`
		
		Specified by:
		`[getDestinationBytes](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getDestinationBytes())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for destination.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required .PersistentPayload payload = 3;`
		
		Specified by:
		`[hasPayload](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#hasPayload())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getPayload()
		```
		
		`required .PersistentPayload payload = 3;`
		
		Specified by:
		`[getPayload](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getPayload())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The payload.
		- #### getPayloadOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getPayloadOrBuilder()
		```
		
		`required .PersistentPayload payload = 3;`
		
		Specified by:
		`[getPayloadOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getPayloadOrBuilder())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
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
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(java.nio.ByteBuffer data)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(java.nio.ByteBuffer data,
		                                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(byte[] data)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(byte[] data,
		                                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(java.io.InputStream input)
		                                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(java.io.InputStream input,
		                                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseDelimitedFrom​(java.io.InputStream input)
		                                                                                         throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseDelimitedFrom​(java.io.InputStream input,
		                                                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                         throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") newBuilder​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html)*