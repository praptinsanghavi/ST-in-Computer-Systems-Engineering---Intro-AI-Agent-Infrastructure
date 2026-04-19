---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html
title: QueryMessages.EventEnvelope
---

# QueryMessages.EventEnvelope

## Content

Package [akka.persistence.query.internal.protobuf](package-summary.html)
## Class QueryMessages.EventEnvelope

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope

- All Implemented Interfaces:
`[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[QueryMessages](QueryMessages.html "class in akka.persistence.query.internal.protobuf")

---

```
public static final class QueryMessages.EventEnvelope
extends akka.protobufv3.internal.GeneratedMessageV3
implements [QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")
```

```

 for akka.persistence.query.typed.EventEnvelope
 
```

 Protobuf type `akka.persistence.query.EventEnvelope`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | for akka.persistence.query.typed.EventEnvelope |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ENTITY_TYPE_FIELD_NUMBER](#ENTITY_TYPE_FIELD_NUMBER)` |  |
	| `static int` | `[EVENT_FIELD_NUMBER](#EVENT_FIELD_NUMBER)` |  |
	| `static int` | `[FILTERED_FIELD_NUMBER](#FILTERED_FIELD_NUMBER)` |  |
	| `static int` | `[METADATA_FIELD_NUMBER](#METADATA_FIELD_NUMBER)` |  |
	| `static int` | `[OFFSET_FIELD_NUMBER](#OFFSET_FIELD_NUMBER)` |  |
	| `static int` | `[OFFSET_MANIFEST_FIELD_NUMBER](#OFFSET_MANIFEST_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[PERSISTENCE_ID_FIELD_NUMBER](#PERSISTENCE_ID_FIELD_NUMBER)` |  |
	| `static int` | `[SEQUENCE_NR_FIELD_NUMBER](#SEQUENCE_NR_FIELD_NUMBER)` |  |
	| `static int` | `[SLICE_FIELD_NUMBER](#SLICE_FIELD_NUMBER)` |  |
	| `static int` | `[SOURCE_FIELD_NUMBER](#SOURCE_FIELD_NUMBER)` |  |
	| `static int` | `[TAGS_FIELD_NUMBER](#TAGS_FIELD_NUMBER)` |  |
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
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getEntityType](#getEntityType())()` | `required string entity_type = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityTypeBytes](#getEntityTypeBytes())()` | `required string entity_type = 2;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getEvent](#getEvent())()` | `optional .Payload event = 8;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getEventOrBuilder](#getEventOrBuilder())()` | `optional .Payload event = 8;` |
	| `boolean` | `[getFiltered](#getFiltered())()` | `optional bool filtered = 10;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMetadata](#getMetadata())()` | `optional .Payload metadata = 9;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMetadataOrBuilder](#getMetadataOrBuilder())()` | `optional .Payload metadata = 9;` |
	| `java.lang.String` | `[getOffset](#getOffset())()` | `required string offset = 6;` |
	| `akka.protobufv3.internal.ByteString` | `[getOffsetBytes](#getOffsetBytes())()` | `required string offset = 6;` |
	| `java.lang.String` | `[getOffsetManifest](#getOffsetManifest())()` | `required string offset_manifest = 7;` |
	| `akka.protobufv3.internal.ByteString` | `[getOffsetManifestBytes](#getOffsetManifestBytes())()` | `required string offset_manifest = 7;` |
	| `akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")>` | `[getParserForType](#getParserForType())()` |  |
	| `java.lang.String` | `[getPersistenceId](#getPersistenceId())()` | `required string persistence_id = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPersistenceIdBytes](#getPersistenceIdBytes())()` | `required string persistence_id = 1;` |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `required int64 sequence_nr = 4;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `int` | `[getSlice](#getSlice())()` | `required int32 slice = 3;` |
	| `java.lang.String` | `[getSource](#getSource())()` | `optional string source = 11;` |
	| `akka.protobufv3.internal.ByteString` | `[getSourceBytes](#getSourceBytes())()` | `optional string source = 11;` |
	| `java.lang.String` | `[getTags](#getTags(int))​(int index)` | `repeated string tags = 12;` |
	| `akka.protobufv3.internal.ByteString` | `[getTagsBytes](#getTagsBytes(int))​(int index)` | `repeated string tags = 12;` |
	| `int` | `[getTagsCount](#getTagsCount())()` | `repeated string tags = 12;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getTagsList](#getTagsList())()` | `repeated string tags = 12;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 5;` |
	| `boolean` | `[hasEntityType](#hasEntityType())()` | `required string entity_type = 2;` |
	| `boolean` | `[hasEvent](#hasEvent())()` | `optional .Payload event = 8;` |
	| `boolean` | `[hasFiltered](#hasFiltered())()` | `optional bool filtered = 10;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasMetadata](#hasMetadata())()` | `optional .Payload metadata = 9;` |
	| `boolean` | `[hasOffset](#hasOffset())()` | `required string offset = 6;` |
	| `boolean` | `[hasOffsetManifest](#hasOffsetManifest())()` | `required string offset_manifest = 7;` |
	| `boolean` | `[hasPersistenceId](#hasPersistenceId())()` | `required string persistence_id = 1;` |
	| `boolean` | `[hasSequenceNr](#hasSequenceNr())()` | `required int64 sequence_nr = 4;` |
	| `boolean` | `[hasSlice](#hasSlice())()` | `required int32 slice = 3;` |
	| `boolean` | `[hasSource](#hasSource())()` | `optional string source = 11;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 5;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[newBuilder](#newBuilder())()` |  |
	| `static [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[newBuilder](#newBuilder(akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope))​([QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") prototype)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")>` | `[parser](#parser())()` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### PERSISTENCE\_ID\_FIELD\_NUMBER
		
		
		
		```
		public static final int PERSISTENCE_ID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.PERSISTENCE_ID_FIELD_NUMBER)
		- #### ENTITY\_TYPE\_FIELD\_NUMBER
		
		
		
		```
		public static final int ENTITY_TYPE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.ENTITY_TYPE_FIELD_NUMBER)
		- #### SLICE\_FIELD\_NUMBER
		
		
		
		```
		public static final int SLICE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.SLICE_FIELD_NUMBER)
		- #### SEQUENCE\_NR\_FIELD\_NUMBER
		
		
		
		```
		public static final int SEQUENCE_NR_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.SEQUENCE_NR_FIELD_NUMBER)
		- #### TIMESTAMP\_FIELD\_NUMBER
		
		
		
		```
		public static final int TIMESTAMP_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.TIMESTAMP_FIELD_NUMBER)
		- #### OFFSET\_FIELD\_NUMBER
		
		
		
		```
		public static final int OFFSET_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.OFFSET_FIELD_NUMBER)
		- #### OFFSET\_MANIFEST\_FIELD\_NUMBER
		
		
		
		```
		public static final int OFFSET_MANIFEST_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.OFFSET_MANIFEST_FIELD_NUMBER)
		- #### EVENT\_FIELD\_NUMBER
		
		
		
		```
		public static final int EVENT_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.EVENT_FIELD_NUMBER)
		- #### METADATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int METADATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.METADATA_FIELD_NUMBER)
		- #### FILTERED\_FIELD\_NUMBER
		
		
		
		```
		public static final int FILTERED_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.FILTERED_FIELD_NUMBER)
		- #### SOURCE\_FIELD\_NUMBER
		
		
		
		```
		public static final int SOURCE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.SOURCE_FIELD_NUMBER)
		- #### TAGS\_FIELD\_NUMBER
		
		
		
		```
		public static final int TAGS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.TAGS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")> PARSER
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
		- #### hasPersistenceId
		
		
		
		```
		public boolean hasPersistenceId()
		```
		
		`required string persistence_id = 1;`
		
		Specified by:
		`[hasPersistenceId](QueryMessages.EventEnvelopeOrBuilder.html#hasPersistenceId())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the persistenceId field is set.
		- #### getPersistenceId
		
		
		
		```
		public java.lang.String getPersistenceId()
		```
		
		`required string persistence_id = 1;`
		
		Specified by:
		`[getPersistenceId](QueryMessages.EventEnvelopeOrBuilder.html#getPersistenceId())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The persistenceId.
		- #### getPersistenceIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPersistenceIdBytes()
		```
		
		`required string persistence_id = 1;`
		
		Specified by:
		`[getPersistenceIdBytes](QueryMessages.EventEnvelopeOrBuilder.html#getPersistenceIdBytes())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The bytes for persistenceId.
		- #### hasEntityType
		
		
		
		```
		public boolean hasEntityType()
		```
		
		`required string entity_type = 2;`
		
		Specified by:
		`[hasEntityType](QueryMessages.EventEnvelopeOrBuilder.html#hasEntityType())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the entityType field is set.
		- #### getEntityType
		
		
		
		```
		public java.lang.String getEntityType()
		```
		
		`required string entity_type = 2;`
		
		Specified by:
		`[getEntityType](QueryMessages.EventEnvelopeOrBuilder.html#getEntityType())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The entityType.
		- #### getEntityTypeBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEntityTypeBytes()
		```
		
		`required string entity_type = 2;`
		
		Specified by:
		`[getEntityTypeBytes](QueryMessages.EventEnvelopeOrBuilder.html#getEntityTypeBytes())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The bytes for entityType.
		- #### hasSlice
		
		
		
		```
		public boolean hasSlice()
		```
		
		`required int32 slice = 3;`
		
		Specified by:
		`[hasSlice](QueryMessages.EventEnvelopeOrBuilder.html#hasSlice())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the slice field is set.
		- #### getSlice
		
		
		
		```
		public int getSlice()
		```
		
		`required int32 slice = 3;`
		
		Specified by:
		`[getSlice](QueryMessages.EventEnvelopeOrBuilder.html#getSlice())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The slice.
		- #### hasSequenceNr
		
		
		
		```
		public boolean hasSequenceNr()
		```
		
		`required int64 sequence_nr = 4;`
		
		Specified by:
		`[hasSequenceNr](QueryMessages.EventEnvelopeOrBuilder.html#hasSequenceNr())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the sequenceNr field is set.
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		
		`required int64 sequence_nr = 4;`
		
		Specified by:
		`[getSequenceNr](QueryMessages.EventEnvelopeOrBuilder.html#getSequenceNr())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The sequenceNr.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 5;`
		
		Specified by:
		`[hasTimestamp](QueryMessages.EventEnvelopeOrBuilder.html#hasTimestamp())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 5;`
		
		Specified by:
		`[getTimestamp](QueryMessages.EventEnvelopeOrBuilder.html#getTimestamp())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The timestamp.
		- #### hasOffset
		
		
		
		```
		public boolean hasOffset()
		```
		
		`required string offset = 6;`
		
		Specified by:
		`[hasOffset](QueryMessages.EventEnvelopeOrBuilder.html#hasOffset())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the offset field is set.
		- #### getOffset
		
		
		
		```
		public java.lang.String getOffset()
		```
		
		`required string offset = 6;`
		
		Specified by:
		`[getOffset](QueryMessages.EventEnvelopeOrBuilder.html#getOffset())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The offset.
		- #### getOffsetBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOffsetBytes()
		```
		
		`required string offset = 6;`
		
		Specified by:
		`[getOffsetBytes](QueryMessages.EventEnvelopeOrBuilder.html#getOffsetBytes())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The bytes for offset.
		- #### hasOffsetManifest
		
		
		
		```
		public boolean hasOffsetManifest()
		```
		
		`required string offset_manifest = 7;`
		
		Specified by:
		`[hasOffsetManifest](QueryMessages.EventEnvelopeOrBuilder.html#hasOffsetManifest())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the offsetManifest field is set.
		- #### getOffsetManifest
		
		
		
		```
		public java.lang.String getOffsetManifest()
		```
		
		`required string offset_manifest = 7;`
		
		Specified by:
		`[getOffsetManifest](QueryMessages.EventEnvelopeOrBuilder.html#getOffsetManifest())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The offsetManifest.
		- #### getOffsetManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOffsetManifestBytes()
		```
		
		`required string offset_manifest = 7;`
		
		Specified by:
		`[getOffsetManifestBytes](QueryMessages.EventEnvelopeOrBuilder.html#getOffsetManifestBytes())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The bytes for offsetManifest.
		- #### hasEvent
		
		
		
		```
		public boolean hasEvent()
		```
		
		`optional .Payload event = 8;`
		
		Specified by:
		`[hasEvent](QueryMessages.EventEnvelopeOrBuilder.html#hasEvent())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the event field is set.
		- #### getEvent
		
		
		
		```
		public [ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getEvent()
		```
		
		`optional .Payload event = 8;`
		
		Specified by:
		`[getEvent](QueryMessages.EventEnvelopeOrBuilder.html#getEvent())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The event.
		- #### getEventOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getEventOrBuilder()
		```
		
		`optional .Payload event = 8;`
		
		Specified by:
		`[getEventOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html#getEventOrBuilder())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		- #### hasMetadata
		
		
		
		```
		public boolean hasMetadata()
		```
		
		`optional .Payload metadata = 9;`
		
		Specified by:
		`[hasMetadata](QueryMessages.EventEnvelopeOrBuilder.html#hasMetadata())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the metadata field is set.
		- #### getMetadata
		
		
		
		```
		public [ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMetadata()
		```
		
		`optional .Payload metadata = 9;`
		
		Specified by:
		`[getMetadata](QueryMessages.EventEnvelopeOrBuilder.html#getMetadata())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The metadata.
		- #### getMetadataOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMetadataOrBuilder()
		```
		
		`optional .Payload metadata = 9;`
		
		Specified by:
		`[getMetadataOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html#getMetadataOrBuilder())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		- #### hasFiltered
		
		
		
		```
		public boolean hasFiltered()
		```
		
		`optional bool filtered = 10;`
		
		Specified by:
		`[hasFiltered](QueryMessages.EventEnvelopeOrBuilder.html#hasFiltered())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the filtered field is set.
		- #### getFiltered
		
		
		
		```
		public boolean getFiltered()
		```
		
		`optional bool filtered = 10;`
		
		Specified by:
		`[getFiltered](QueryMessages.EventEnvelopeOrBuilder.html#getFiltered())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The filtered.
		- #### hasSource
		
		
		
		```
		public boolean hasSource()
		```
		
		`optional string source = 11;`
		
		Specified by:
		`[hasSource](QueryMessages.EventEnvelopeOrBuilder.html#hasSource())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		Whether the source field is set.
		- #### getSource
		
		
		
		```
		public java.lang.String getSource()
		```
		
		`optional string source = 11;`
		
		Specified by:
		`[getSource](QueryMessages.EventEnvelopeOrBuilder.html#getSource())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The source.
		- #### getSourceBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSourceBytes()
		```
		
		`optional string source = 11;`
		
		Specified by:
		`[getSourceBytes](QueryMessages.EventEnvelopeOrBuilder.html#getSourceBytes())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The bytes for source.
		- #### getTagsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getTagsList()
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsList](QueryMessages.EventEnvelopeOrBuilder.html#getTagsList())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		A list containing the tags.
		- #### getTagsCount
		
		
		
		```
		public int getTagsCount()
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsCount](QueryMessages.EventEnvelopeOrBuilder.html#getTagsCount())` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Returns:
		The count of tags.
		- #### getTags
		
		
		
		```
		public java.lang.String getTags​(int index)
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTags](QueryMessages.EventEnvelopeOrBuilder.html#getTags(int))` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The tags at the given index.
		- #### getTagsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getTagsBytes​(int index)
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsBytes](QueryMessages.EventEnvelopeOrBuilder.html#getTagsBytes(int))` in interface `[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the tags at the given index.
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
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(java.nio.ByteBuffer data)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(java.nio.ByteBuffer data,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(byte[] data)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(byte[] data,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(java.io.InputStream input)
		                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(java.io.InputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input)
		                                                      throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") newBuilder​([QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html)*