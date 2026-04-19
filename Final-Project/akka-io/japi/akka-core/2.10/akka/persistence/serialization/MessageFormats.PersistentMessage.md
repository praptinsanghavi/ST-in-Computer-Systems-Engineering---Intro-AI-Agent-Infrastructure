---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html
title: MessageFormats.PersistentMessage.Builder
---

# MessageFormats.PersistentMessage.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.PersistentMessage.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.PersistentMessage.Builder

- All Implemented Interfaces:
`[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.PersistentMessage.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `PersistentMessage`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearDeleted](#clearDeleted())()` | not used in new records from 2\.4 |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearManifest](#clearManifest())()` | `optional string manifest = 12;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearMetadata](#clearMetadata())()` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearPayload](#clearPayload())()` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearPersistenceId](#clearPersistenceId())()` | `optional string persistenceId = 3;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearSender](#clearSender())()` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearSequenceNr](#clearSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearTimestamp](#clearTimestamp())()` | `optional sint64 timestamp = 14;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clearWriterUuid](#clearWriterUuid())()` | `optional string writerUuid = 13;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `boolean` | `[getDeleted](#getDeleted())()` | not used in new records from 2\.4 |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getManifest](#getManifest())()` | `optional string manifest = 12;` |
	| `akka.protobufv3.internal.ByteString` | `[getManifestBytes](#getManifestBytes())()` | `optional string manifest = 12;` |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getMetadata](#getMetadata())()` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[getMetadataBuilder](#getMetadataBuilder())()` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getMetadataOrBuilder](#getMetadataOrBuilder())()` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getPayload](#getPayload())()` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `optional .PersistentPayload payload = 1;` |
	| `java.lang.String` | `[getPersistenceId](#getPersistenceId())()` | `optional string persistenceId = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getPersistenceIdBytes](#getPersistenceIdBytes())()` | `optional string persistenceId = 3;` |
	| `java.lang.String` | `[getSender](#getSender())()` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `akka.protobufv3.internal.ByteString` | `[getSenderBytes](#getSenderBytes())()` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `optional sint64 timestamp = 14;` |
	| `java.lang.String` | `[getWriterUuid](#getWriterUuid())()` | `optional string writerUuid = 13;` |
	| `akka.protobufv3.internal.ByteString` | `[getWriterUuidBytes](#getWriterUuidBytes())()` | `optional string writerUuid = 13;` |
	| `boolean` | `[hasDeleted](#hasDeleted())()` | not used in new records from 2\.4 |
	| `boolean` | `[hasManifest](#hasManifest())()` | `optional string manifest = 12;` |
	| `boolean` | `[hasMetadata](#hasMetadata())()` | `optional .PersistentPayload metadata = 15;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `optional .PersistentPayload payload = 1;` |
	| `boolean` | `[hasPersistenceId](#hasPersistenceId())()` | `optional string persistenceId = 3;` |
	| `boolean` | `[hasSender](#hasSender())()` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `boolean` | `[hasSequenceNr](#hasSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `optional sint64 timestamp = 14;` |
	| `boolean` | `[hasWriterUuid](#hasWriterUuid())()` | `optional string writerUuid = 13;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.PersistentMessage))​([MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergeMetadata](#mergeMetadata(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergePayload](#mergePayload(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setDeleted](#setDeleted(boolean))​(boolean value)` | not used in new records from 2\.4 |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setManifest](#setManifest(java.lang.String))​(java.lang.String value)` | `optional string manifest = 12;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setManifestBytes](#setManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string manifest = 12;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setMetadata](#setMetadata(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setMetadata](#setMetadata(akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `optional .PersistentPayload metadata = 15;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `optional .PersistentPayload payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setPersistenceId](#setPersistenceId(java.lang.String))​(java.lang.String value)` | `optional string persistenceId = 3;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setPersistenceIdBytes](#setPersistenceIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string persistenceId = 3;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setSender](#setSender(java.lang.String))​(java.lang.String value)` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setSenderBytes](#setSenderBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | optional int32 redeliveries \= 6; // Removed in 2\.4  repeated string confirms \= 7; // Removed in 2\.4  optional bool confirmable \= 8; // Removed in 2\.4  optional DeliveredMessage confirmMessage \= 9; // Removed in 2\.4  optional string confirmTarget \= 10; // Removed in 2\.4 |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setSequenceNr](#setSequenceNr(long))​(long value)` | `optional int64 sequenceNr = 2;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `optional sint64 timestamp = 14;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setWriterUuid](#setWriterUuid(java.lang.String))​(java.lang.String value)` | `optional string writerUuid = 13;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[setWriterUuidBytes](#setWriterUuidBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string writerUuid = 13;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 int index,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`optional .PersistentPayload payload = 1;`
		
		Specified by:
		`[hasPayload](MessageFormats.PersistentMessageOrBuilder.html#hasPayload())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getPayload()
		```
		
		`optional .PersistentPayload payload = 1;`
		
		Specified by:
		`[getPayload](MessageFormats.PersistentMessageOrBuilder.html#getPayload())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setPayload​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`optional .PersistentPayload payload = 1;`
		- #### setPayload
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setPayload​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`optional .PersistentPayload payload = 1;`
		- #### mergePayload
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergePayload​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`optional .PersistentPayload payload = 1;`
		- #### clearPayload
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearPayload()
		```
		
		`optional .PersistentPayload payload = 1;`
		- #### getPayloadBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") getPayloadBuilder()
		```
		
		`optional .PersistentPayload payload = 1;`
		- #### getPayloadOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getPayloadOrBuilder()
		```
		
		`optional .PersistentPayload payload = 1;`
		
		Specified by:
		`[getPayloadOrBuilder](MessageFormats.PersistentMessageOrBuilder.html#getPayloadOrBuilder())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		- #### hasSequenceNr
		
		
		
		```
		public boolean hasSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[hasSequenceNr](MessageFormats.PersistentMessageOrBuilder.html#hasSequenceNr())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the sequenceNr field is set.
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[getSequenceNr](MessageFormats.PersistentMessageOrBuilder.html#getSequenceNr())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The sequenceNr.
		- #### setSequenceNr
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setSequenceNr​(long value)
		```
		
		`optional int64 sequenceNr = 2;`
		
		Parameters:
		`value` \- The sequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearSequenceNr
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPersistenceId
		
		
		
		```
		public boolean hasPersistenceId()
		```
		
		`optional string persistenceId = 3;`
		
		Specified by:
		`[hasPersistenceId](MessageFormats.PersistentMessageOrBuilder.html#hasPersistenceId())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the persistenceId field is set.
		- #### getPersistenceId
		
		
		
		```
		public java.lang.String getPersistenceId()
		```
		
		`optional string persistenceId = 3;`
		
		Specified by:
		`[getPersistenceId](MessageFormats.PersistentMessageOrBuilder.html#getPersistenceId())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The persistenceId.
		- #### getPersistenceIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPersistenceIdBytes()
		```
		
		`optional string persistenceId = 3;`
		
		Specified by:
		`[getPersistenceIdBytes](MessageFormats.PersistentMessageOrBuilder.html#getPersistenceIdBytes())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for persistenceId.
		- #### setPersistenceId
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setPersistenceId​(java.lang.String value)
		```
		
		`optional string persistenceId = 3;`
		
		Parameters:
		`value` \- The persistenceId to set.
		Returns:
		This builder for chaining.
		- #### clearPersistenceId
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearPersistenceId()
		```
		
		`optional string persistenceId = 3;`
		
		Returns:
		This builder for chaining.
		- #### setPersistenceIdBytes
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setPersistenceIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string persistenceId = 3;`
		
		Parameters:
		`value` \- The bytes for persistenceId to set.
		Returns:
		This builder for chaining.
		- #### hasDeleted
		
		
		
		```
		public boolean hasDeleted()
		```
		
		
		```
		
		 not used in new records from 2.4
		 
		```
		
		`optional bool deleted = 4;`
		
		Specified by:
		`[hasDeleted](MessageFormats.PersistentMessageOrBuilder.html#hasDeleted())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the deleted field is set.
		- #### getDeleted
		
		
		
		```
		public boolean getDeleted()
		```
		
		
		```
		
		 not used in new records from 2.4
		 
		```
		
		`optional bool deleted = 4;`
		
		Specified by:
		`[getDeleted](MessageFormats.PersistentMessageOrBuilder.html#getDeleted())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The deleted.
		- #### setDeleted
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setDeleted​(boolean value)
		```
		
		
		```
		
		 not used in new records from 2.4
		 
		```
		
		`optional bool deleted = 4;`
		
		Parameters:
		`value` \- The deleted to set.
		Returns:
		This builder for chaining.
		- #### clearDeleted
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearDeleted()
		```
		
		
		```
		
		 not used in new records from 2.4
		 
		```
		
		`optional bool deleted = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasSender
		
		
		
		```
		public boolean hasSender()
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Specified by:
		`[hasSender](MessageFormats.PersistentMessageOrBuilder.html#hasSender())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the sender field is set.
		- #### getSender
		
		
		
		```
		public java.lang.String getSender()
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Specified by:
		`[getSender](MessageFormats.PersistentMessageOrBuilder.html#getSender())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The sender.
		- #### getSenderBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSenderBytes()
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Specified by:
		`[getSenderBytes](MessageFormats.PersistentMessageOrBuilder.html#getSenderBytes())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for sender.
		- #### setSender
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setSender​(java.lang.String value)
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Parameters:
		`value` \- The sender to set.
		Returns:
		This builder for chaining.
		- #### clearSender
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearSender()
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Returns:
		This builder for chaining.
		- #### setSenderBytes
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setSenderBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 optional int32 redeliveries = 6; // Removed in 2.4
		 repeated string confirms = 7; // Removed in 2.4
		 optional bool confirmable = 8;  // Removed in 2.4
		 optional DeliveredMessage confirmMessage = 9; // Removed in 2.4
		 optional string confirmTarget = 10; // Removed in 2.4
		 
		```
		
		`optional string sender = 11;`
		
		Parameters:
		`value` \- The bytes for sender to set.
		Returns:
		This builder for chaining.
		- #### hasManifest
		
		
		
		```
		public boolean hasManifest()
		```
		
		`optional string manifest = 12;`
		
		Specified by:
		`[hasManifest](MessageFormats.PersistentMessageOrBuilder.html#hasManifest())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the manifest field is set.
		- #### getManifest
		
		
		
		```
		public java.lang.String getManifest()
		```
		
		`optional string manifest = 12;`
		
		Specified by:
		`[getManifest](MessageFormats.PersistentMessageOrBuilder.html#getManifest())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The manifest.
		- #### getManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getManifestBytes()
		```
		
		`optional string manifest = 12;`
		
		Specified by:
		`[getManifestBytes](MessageFormats.PersistentMessageOrBuilder.html#getManifestBytes())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for manifest.
		- #### setManifest
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setManifest​(java.lang.String value)
		```
		
		`optional string manifest = 12;`
		
		Parameters:
		`value` \- The manifest to set.
		Returns:
		This builder for chaining.
		- #### clearManifest
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearManifest()
		```
		
		`optional string manifest = 12;`
		
		Returns:
		This builder for chaining.
		- #### setManifestBytes
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string manifest = 12;`
		
		Parameters:
		`value` \- The bytes for manifest to set.
		Returns:
		This builder for chaining.
		- #### hasWriterUuid
		
		
		
		```
		public boolean hasWriterUuid()
		```
		
		`optional string writerUuid = 13;`
		
		Specified by:
		`[hasWriterUuid](MessageFormats.PersistentMessageOrBuilder.html#hasWriterUuid())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the writerUuid field is set.
		- #### getWriterUuid
		
		
		
		```
		public java.lang.String getWriterUuid()
		```
		
		`optional string writerUuid = 13;`
		
		Specified by:
		`[getWriterUuid](MessageFormats.PersistentMessageOrBuilder.html#getWriterUuid())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The writerUuid.
		- #### getWriterUuidBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getWriterUuidBytes()
		```
		
		`optional string writerUuid = 13;`
		
		Specified by:
		`[getWriterUuidBytes](MessageFormats.PersistentMessageOrBuilder.html#getWriterUuidBytes())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for writerUuid.
		- #### setWriterUuid
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setWriterUuid​(java.lang.String value)
		```
		
		`optional string writerUuid = 13;`
		
		Parameters:
		`value` \- The writerUuid to set.
		Returns:
		This builder for chaining.
		- #### clearWriterUuid
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearWriterUuid()
		```
		
		`optional string writerUuid = 13;`
		
		Returns:
		This builder for chaining.
		- #### setWriterUuidBytes
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setWriterUuidBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string writerUuid = 13;`
		
		Parameters:
		`value` \- The bytes for writerUuid to set.
		Returns:
		This builder for chaining.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`optional sint64 timestamp = 14;`
		
		Specified by:
		`[hasTimestamp](MessageFormats.PersistentMessageOrBuilder.html#hasTimestamp())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`optional sint64 timestamp = 14;`
		
		Specified by:
		`[getTimestamp](MessageFormats.PersistentMessageOrBuilder.html#getTimestamp())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setTimestamp​(long value)
		```
		
		`optional sint64 timestamp = 14;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearTimestamp()
		```
		
		`optional sint64 timestamp = 14;`
		
		Returns:
		This builder for chaining.
		- #### hasMetadata
		
		
		
		```
		public boolean hasMetadata()
		```
		
		`optional .PersistentPayload metadata = 15;`
		
		Specified by:
		`[hasMetadata](MessageFormats.PersistentMessageOrBuilder.html#hasMetadata())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the metadata field is set.
		- #### getMetadata
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getMetadata()
		```
		
		`optional .PersistentPayload metadata = 15;`
		
		Specified by:
		`[getMetadata](MessageFormats.PersistentMessageOrBuilder.html#getMetadata())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The metadata.
		- #### setMetadata
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setMetadata​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`optional .PersistentPayload metadata = 15;`
		- #### setMetadata
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setMetadata​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`optional .PersistentPayload metadata = 15;`
		- #### mergeMetadata
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergeMetadata​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`optional .PersistentPayload metadata = 15;`
		- #### clearMetadata
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") clearMetadata()
		```
		
		`optional .PersistentPayload metadata = 15;`
		- #### getMetadataBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") getMetadataBuilder()
		```
		
		`optional .PersistentPayload metadata = 15;`
		- #### getMetadataOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getMetadataOrBuilder()
		```
		
		`optional .PersistentPayload metadata = 15;`
		
		Specified by:
		`[getMetadataOrBuilder](MessageFormats.PersistentMessageOrBuilder.html#getMetadataOrBuilder())` in interface `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")`
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html)*