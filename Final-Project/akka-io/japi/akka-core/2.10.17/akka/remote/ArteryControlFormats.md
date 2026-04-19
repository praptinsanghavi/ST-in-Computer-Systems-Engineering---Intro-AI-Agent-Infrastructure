---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:50:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html
title: ArteryControlFormats.SystemMessageEnvelope
---

# ArteryControlFormats.SystemMessageEnvelope

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.SystemMessageEnvelope

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.ArteryControlFormats.SystemMessageEnvelope

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`, `java.io.Serializable`

Enclosing class:
[ArteryControlFormats](ArteryControlFormats.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.SystemMessageEnvelope
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")
```

```

 SystemMessageDelivery.SystemMessageEnvelope
 
```

 Protobuf type `SystemMessageEnvelope`

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | SystemMessageDelivery.SystemMessageEnvelope |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ACKREPLYTO_FIELD_NUMBER](#ACKREPLYTO_FIELD_NUMBER)` |  |
	| `static int` | `[MESSAGE_FIELD_NUMBER](#MESSAGE_FIELD_NUMBER)` |  |
	| `static int` | `[MESSAGEMANIFEST_FIELD_NUMBER](#MESSAGEMANIFEST_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[SEQNO_FIELD_NUMBER](#SEQNO_FIELD_NUMBER)` |  |
	| `static int` | `[SERIALIZERID_FIELD_NUMBER](#SERIALIZERID_FIELD_NUMBER)` |  |
	
	
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
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getAckReplyTo](#getAckReplyTo())()` | `required .UniqueAddress ackReplyTo = 5;` |
	| `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` | `[getAckReplyToOrBuilder](#getAckReplyToOrBuilder())()` | `required .UniqueAddress ackReplyTo = 5;` |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getMessage](#getMessage())()` | `required bytes message = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageManifest](#getMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")>` | `[getParserForType](#getParserForType())()` |  |
	| `long` | `[getSeqNo](#getSeqNo())()` | `required uint64 seqNo = 4;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[hasAckReplyTo](#hasAckReplyTo())()` | `required .UniqueAddress ackReplyTo = 5;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required bytes message = 1;` |
	| `boolean` | `[hasMessageManifest](#hasMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `boolean` | `[hasSeqNo](#hasSeqNo())()` | `required uint64 seqNo = 4;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder(akka.remote.ArteryControlFormats.SystemMessageEnvelope))​([ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") prototype)` |  |
	| `[ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")>` | `[parser](#parser())()` |  |
	| `[ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### MESSAGE\_FIELD\_NUMBER
		
		
		
		```
		public static final int MESSAGE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope.MESSAGE_FIELD_NUMBER)
		- #### SERIALIZERID\_FIELD\_NUMBER
		
		
		
		```
		public static final int SERIALIZERID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope.SERIALIZERID_FIELD_NUMBER)
		- #### MESSAGEMANIFEST\_FIELD\_NUMBER
		
		
		
		```
		public static final int MESSAGEMANIFEST_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope.MESSAGEMANIFEST_FIELD_NUMBER)
		- #### SEQNO\_FIELD\_NUMBER
		
		
		
		```
		public static final int SEQNO_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope.SEQNO_FIELD_NUMBER)
		- #### ACKREPLYTO\_FIELD\_NUMBER
		
		
		
		```
		public static final int ACKREPLYTO_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ArteryControlFormats.SystemMessageEnvelope.ACKREPLYTO_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")> PARSER
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
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required bytes message = 1;`
		
		Specified by:
		`[hasMessage](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#hasMessage())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessage()
		```
		
		`required bytes message = 1;`
		
		Specified by:
		`[getMessage](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getMessage())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[hasSerializerId](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#hasSerializerId())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[getSerializerId](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getSerializerId())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The serializerId.
		- #### hasMessageManifest
		
		
		
		```
		public boolean hasMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Specified by:
		`[hasMessageManifest](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#hasMessageManifest())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the messageManifest field is set.
		- #### getMessageManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Specified by:
		`[getMessageManifest](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getMessageManifest())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The messageManifest.
		- #### hasSeqNo
		
		
		
		```
		public boolean hasSeqNo()
		```
		
		`required uint64 seqNo = 4;`
		
		Specified by:
		`[hasSeqNo](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#hasSeqNo())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the seqNo field is set.
		- #### getSeqNo
		
		
		
		```
		public long getSeqNo()
		```
		
		`required uint64 seqNo = 4;`
		
		Specified by:
		`[getSeqNo](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getSeqNo())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The seqNo.
		- #### hasAckReplyTo
		
		
		
		```
		public boolean hasAckReplyTo()
		```
		
		`required .UniqueAddress ackReplyTo = 5;`
		
		Specified by:
		`[hasAckReplyTo](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#hasAckReplyTo())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the ackReplyTo field is set.
		- #### getAckReplyTo
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getAckReplyTo()
		```
		
		`required .UniqueAddress ackReplyTo = 5;`
		
		Specified by:
		`[getAckReplyTo](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getAckReplyTo())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The ackReplyTo.
		- #### getAckReplyToOrBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote") getAckReplyToOrBuilder()
		```
		
		`required .UniqueAddress ackReplyTo = 5;`
		
		Specified by:
		`[getAckReplyToOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html#getAckReplyToOrBuilder())` in interface `[ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote")`
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
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(byte[] data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(byte[] data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(java.io.InputStream input)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(java.io.InputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") newBuilder​([ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html)*