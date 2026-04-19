---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.Builder.html
title: QueryMessages.EventEnvelope.Builder
---

# QueryMessages.EventEnvelope.Builder

## Content

Package [akka.persistence.query.internal.protobuf](package-summary.html)
## Class QueryMessages.EventEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")\>
			- - akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope.Builder

- All Implemented Interfaces:
`[QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")

---

```
public static final class QueryMessages.EventEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>
implements [QueryMessages.EventEnvelopeOrBuilder](QueryMessages.EventEnvelopeOrBuilder.html "interface in akka.persistence.query.internal.protobuf")
```

```

 for akka.persistence.query.typed.EventEnvelope
 
```

 Protobuf type `akka.persistence.query.EventEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[addAllTags](#addAllTags(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string tags = 12;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[addTags](#addTags(java.lang.String))​(java.lang.String value)` | `repeated string tags = 12;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[addTagsBytes](#addTagsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string tags = 12;` |
	| `[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[build](#build())()` |  |
	| `[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearEntityType](#clearEntityType())()` | `required string entity_type = 2;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearEvent](#clearEvent())()` | `optional .Payload event = 8;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearFiltered](#clearFiltered())()` | `optional bool filtered = 10;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearMetadata](#clearMetadata())()` | `optional .Payload metadata = 9;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearOffset](#clearOffset())()` | `required string offset = 6;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearOffsetManifest](#clearOffsetManifest())()` | `required string offset_manifest = 7;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearPersistenceId](#clearPersistenceId())()` | `required string persistence_id = 1;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearSequenceNr](#clearSequenceNr())()` | `required int64 sequence_nr = 4;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearSlice](#clearSlice())()` | `required int32 slice = 3;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearSource](#clearSource())()` | `optional string source = 11;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearTags](#clearTags())()` | `repeated string tags = 12;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 5;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getEntityType](#getEntityType())()` | `required string entity_type = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityTypeBytes](#getEntityTypeBytes())()` | `required string entity_type = 2;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getEvent](#getEvent())()` | `optional .Payload event = 8;` |
	| `[ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getEventBuilder](#getEventBuilder())()` | `optional .Payload event = 8;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getEventOrBuilder](#getEventOrBuilder())()` | `optional .Payload event = 8;` |
	| `boolean` | `[getFiltered](#getFiltered())()` | `optional bool filtered = 10;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMetadata](#getMetadata())()` | `optional .Payload metadata = 9;` |
	| `[ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMetadataBuilder](#getMetadataBuilder())()` | `optional .Payload metadata = 9;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMetadataOrBuilder](#getMetadataOrBuilder())()` | `optional .Payload metadata = 9;` |
	| `java.lang.String` | `[getOffset](#getOffset())()` | `required string offset = 6;` |
	| `akka.protobufv3.internal.ByteString` | `[getOffsetBytes](#getOffsetBytes())()` | `required string offset = 6;` |
	| `java.lang.String` | `[getOffsetManifest](#getOffsetManifest())()` | `required string offset_manifest = 7;` |
	| `akka.protobufv3.internal.ByteString` | `[getOffsetManifestBytes](#getOffsetManifestBytes())()` | `required string offset_manifest = 7;` |
	| `java.lang.String` | `[getPersistenceId](#getPersistenceId())()` | `required string persistence_id = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPersistenceIdBytes](#getPersistenceIdBytes())()` | `required string persistence_id = 1;` |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `required int64 sequence_nr = 4;` |
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
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeEvent](#mergeEvent(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload event = 8;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.persistence.query.internal.protobuf.QueryMessages.EventEnvelope))​([QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") other)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeMetadata](#mergeMetadata(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload metadata = 9;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setEntityType](#setEntityType(java.lang.String))​(java.lang.String value)` | `required string entity_type = 2;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setEntityTypeBytes](#setEntityTypeBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string entity_type = 2;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setEvent](#setEvent(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload event = 8;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setEvent](#setEvent(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload event = 8;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setFiltered](#setFiltered(boolean))​(boolean value)` | `optional bool filtered = 10;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setMetadata](#setMetadata(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload metadata = 9;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setMetadata](#setMetadata(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload metadata = 9;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setOffset](#setOffset(java.lang.String))​(java.lang.String value)` | `required string offset = 6;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setOffsetBytes](#setOffsetBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string offset = 6;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setOffsetManifest](#setOffsetManifest(java.lang.String))​(java.lang.String value)` | `required string offset_manifest = 7;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setOffsetManifestBytes](#setOffsetManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string offset_manifest = 7;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setPersistenceId](#setPersistenceId(java.lang.String))​(java.lang.String value)` | `required string persistence_id = 1;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setPersistenceIdBytes](#setPersistenceIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string persistence_id = 1;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setSequenceNr](#setSequenceNr(long))​(long value)` | `required int64 sequence_nr = 4;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setSlice](#setSlice(int))​(int value)` | `required int32 slice = 3;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setSource](#setSource(java.lang.String))​(java.lang.String value)` | `optional string source = 11;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setSourceBytes](#setSourceBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string source = 11;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setTags](#setTags(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string tags = 12;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 5;` |
	| `[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeFrom​([QueryMessages.EventEnvelope](QueryMessages.EventEnvelope.html "class in akka.persistence.query.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		Throws:
		`java.io.IOException`
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
		- #### setPersistenceId
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setPersistenceId​(java.lang.String value)
		```
		
		`required string persistence_id = 1;`
		
		Parameters:
		`value` \- The persistenceId to set.
		Returns:
		This builder for chaining.
		- #### clearPersistenceId
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearPersistenceId()
		```
		
		`required string persistence_id = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPersistenceIdBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setPersistenceIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string persistence_id = 1;`
		
		Parameters:
		`value` \- The bytes for persistenceId to set.
		Returns:
		This builder for chaining.
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
		- #### setEntityType
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setEntityType​(java.lang.String value)
		```
		
		`required string entity_type = 2;`
		
		Parameters:
		`value` \- The entityType to set.
		Returns:
		This builder for chaining.
		- #### clearEntityType
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearEntityType()
		```
		
		`required string entity_type = 2;`
		
		Returns:
		This builder for chaining.
		- #### setEntityTypeBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setEntityTypeBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string entity_type = 2;`
		
		Parameters:
		`value` \- The bytes for entityType to set.
		Returns:
		This builder for chaining.
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
		- #### setSlice
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setSlice​(int value)
		```
		
		`required int32 slice = 3;`
		
		Parameters:
		`value` \- The slice to set.
		Returns:
		This builder for chaining.
		- #### clearSlice
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearSlice()
		```
		
		`required int32 slice = 3;`
		
		Returns:
		This builder for chaining.
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
		- #### setSequenceNr
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setSequenceNr​(long value)
		```
		
		`required int64 sequence_nr = 4;`
		
		Parameters:
		`value` \- The sequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearSequenceNr
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearSequenceNr()
		```
		
		`required int64 sequence_nr = 4;`
		
		Returns:
		This builder for chaining.
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
		- #### setTimestamp
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 5;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearTimestamp()
		```
		
		`required int64 timestamp = 5;`
		
		Returns:
		This builder for chaining.
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
		- #### setOffset
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setOffset​(java.lang.String value)
		```
		
		`required string offset = 6;`
		
		Parameters:
		`value` \- The offset to set.
		Returns:
		This builder for chaining.
		- #### clearOffset
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearOffset()
		```
		
		`required string offset = 6;`
		
		Returns:
		This builder for chaining.
		- #### setOffsetBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setOffsetBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string offset = 6;`
		
		Parameters:
		`value` \- The bytes for offset to set.
		Returns:
		This builder for chaining.
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
		- #### setOffsetManifest
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setOffsetManifest​(java.lang.String value)
		```
		
		`required string offset_manifest = 7;`
		
		Parameters:
		`value` \- The offsetManifest to set.
		Returns:
		This builder for chaining.
		- #### clearOffsetManifest
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearOffsetManifest()
		```
		
		`required string offset_manifest = 7;`
		
		Returns:
		This builder for chaining.
		- #### setOffsetManifestBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setOffsetManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string offset_manifest = 7;`
		
		Parameters:
		`value` \- The bytes for offsetManifest to set.
		Returns:
		This builder for chaining.
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
		- #### setEvent
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setEvent​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload event = 8;`
		- #### setEvent
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setEvent​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload event = 8;`
		- #### mergeEvent
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeEvent​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload event = 8;`
		- #### clearEvent
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearEvent()
		```
		
		`optional .Payload event = 8;`
		- #### getEventBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getEventBuilder()
		```
		
		`optional .Payload event = 8;`
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
		- #### setMetadata
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setMetadata​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload metadata = 9;`
		- #### setMetadata
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setMetadata​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload metadata = 9;`
		- #### mergeMetadata
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeMetadata​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload metadata = 9;`
		- #### clearMetadata
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearMetadata()
		```
		
		`optional .Payload metadata = 9;`
		- #### getMetadataBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMetadataBuilder()
		```
		
		`optional .Payload metadata = 9;`
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
		- #### setFiltered
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setFiltered​(boolean value)
		```
		
		`optional bool filtered = 10;`
		
		Parameters:
		`value` \- The filtered to set.
		Returns:
		This builder for chaining.
		- #### clearFiltered
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearFiltered()
		```
		
		`optional bool filtered = 10;`
		
		Returns:
		This builder for chaining.
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
		- #### setSource
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setSource​(java.lang.String value)
		```
		
		`optional string source = 11;`
		
		Parameters:
		`value` \- The source to set.
		Returns:
		This builder for chaining.
		- #### clearSource
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearSource()
		```
		
		`optional string source = 11;`
		
		Returns:
		This builder for chaining.
		- #### setSourceBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setSourceBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string source = 11;`
		
		Parameters:
		`value` \- The bytes for source to set.
		Returns:
		This builder for chaining.
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
		- #### setTags
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setTags​(int index,
		                                                   java.lang.String value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The tags to set.
		Returns:
		This builder for chaining.
		- #### addTags
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") addTags​(java.lang.String value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`value` \- The tags to add.
		Returns:
		This builder for chaining.
		- #### addAllTags
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") addAllTags​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`values` \- The tags to add.
		Returns:
		This builder for chaining.
		- #### clearTags
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") clearTags()
		```
		
		`repeated string tags = 12;`
		
		Returns:
		This builder for chaining.
		- #### addTagsBytes
		
		
		
		```
		public [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") addTagsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`value` \- The bytes of the tags to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[QueryMessages.EventEnvelope.Builder](QueryMessages.EventEnvelope.Builder.html "class in akka.persistence.query.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/internal/protobuf/QueryMessages.EventEnvelope.Builder.html)*