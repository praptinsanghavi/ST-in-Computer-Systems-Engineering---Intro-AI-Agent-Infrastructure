---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.Builder.html
title: ReplicatedEventSourcing.PublishedEvent.Builder
---

# ReplicatedEventSourcing.PublishedEvent.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.PublishedEvent.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.PublishedEvent.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.PublishedEvent.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `PublishedEvent`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearMetadata](#clearMetadata())()` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearPayload](#clearPayload())()` | `optional .Payload payload = 3;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearPersistenceId](#clearPersistenceId())()` | `optional string persistenceId = 1;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearReplyTo](#clearReplyTo())()` | `optional string replyTo = 6;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearSequenceNr](#clearSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clearTimestamp](#clearTimestamp())()` | `optional int64 timestamp = 4;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization")` | `[getMetadata](#getMetadata())()` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[getMetadataBuilder](#getMetadataBuilder())()` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getMetadataOrBuilder](#getMetadataOrBuilder())()` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getPayload](#getPayload())()` | `optional .Payload payload = 3;` |
	| `[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `optional .Payload payload = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `optional .Payload payload = 3;` |
	| `java.lang.String` | `[getPersistenceId](#getPersistenceId())()` | `optional string persistenceId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPersistenceIdBytes](#getPersistenceIdBytes())()` | `optional string persistenceId = 1;` |
	| `java.lang.String` | `[getReplyTo](#getReplyTo())()` | `optional string replyTo = 6;` |
	| `akka.protobufv3.internal.ByteString` | `[getReplyToBytes](#getReplyToBytes())()` | `optional string replyTo = 6;` |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `optional int64 timestamp = 4;` |
	| `boolean` | `[hasMetadata](#hasMetadata())()` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `optional .Payload payload = 3;` |
	| `boolean` | `[hasPersistenceId](#hasPersistenceId())()` | `optional string persistenceId = 1;` |
	| `boolean` | `[hasReplyTo](#hasReplyTo())()` | `optional string replyTo = 6;` |
	| `boolean` | `[hasSequenceNr](#hasSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `optional int64 timestamp = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.PublishedEvent))​([ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeMetadata](#mergeMetadata(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData))​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") value)` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergePayload](#mergePayload(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload payload = 3;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setMetadata](#setMetadata(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData))​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") value)` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setMetadata](#setMetadata(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder))​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `optional .ReplicatedPublishedEventMetaData metadata = 5;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setPayload](#setPayload(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload payload = 3;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setPayload](#setPayload(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload payload = 3;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setPersistenceId](#setPersistenceId(java.lang.String))​(java.lang.String value)` | `optional string persistenceId = 1;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setPersistenceIdBytes](#setPersistenceIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string persistenceId = 1;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplyTo](#setReplyTo(java.lang.String))​(java.lang.String value)` | `optional string replyTo = 6;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplyToBytes](#setReplyToBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string replyTo = 6;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setSequenceNr](#setSequenceNr(long))​(long value)` | `optional int64 sequenceNr = 2;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `optional int64 timestamp = 4;` |
	| `[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.PublishedEvent](ReplicatedEventSourcing.PublishedEvent.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasPersistenceId
		
		
		
		```
		public boolean hasPersistenceId()
		```
		
		`optional string persistenceId = 1;`
		
		Specified by:
		`[hasPersistenceId](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasPersistenceId())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the persistenceId field is set.
		- #### getPersistenceId
		
		
		
		```
		public java.lang.String getPersistenceId()
		```
		
		`optional string persistenceId = 1;`
		
		Specified by:
		`[getPersistenceId](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getPersistenceId())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The persistenceId.
		- #### getPersistenceIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPersistenceIdBytes()
		```
		
		`optional string persistenceId = 1;`
		
		Specified by:
		`[getPersistenceIdBytes](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getPersistenceIdBytes())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for persistenceId.
		- #### setPersistenceId
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setPersistenceId​(java.lang.String value)
		```
		
		`optional string persistenceId = 1;`
		
		Parameters:
		`value` \- The persistenceId to set.
		Returns:
		This builder for chaining.
		- #### clearPersistenceId
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearPersistenceId()
		```
		
		`optional string persistenceId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPersistenceIdBytes
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setPersistenceIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string persistenceId = 1;`
		
		Parameters:
		`value` \- The bytes for persistenceId to set.
		Returns:
		This builder for chaining.
		- #### hasSequenceNr
		
		
		
		```
		public boolean hasSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[hasSequenceNr](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasSequenceNr())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the sequenceNr field is set.
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[getSequenceNr](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getSequenceNr())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The sequenceNr.
		- #### setSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setSequenceNr​(long value)
		```
		
		`optional int64 sequenceNr = 2;`
		
		Parameters:
		`value` \- The sequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`optional .Payload payload = 3;`
		
		Specified by:
		`[hasPayload](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasPayload())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") getPayload()
		```
		
		`optional .Payload payload = 3;`
		
		Specified by:
		`[getPayload](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getPayload())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setPayload​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload payload = 3;`
		- #### setPayload
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setPayload​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload payload = 3;`
		- #### mergePayload
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergePayload​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload payload = 3;`
		- #### clearPayload
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearPayload()
		```
		
		`optional .Payload payload = 3;`
		- #### getPayloadBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getPayloadBuilder()
		```
		
		`optional .Payload payload = 3;`
		- #### getPayloadOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getPayloadOrBuilder()
		```
		
		`optional .Payload payload = 3;`
		
		Specified by:
		`[getPayloadOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getPayloadOrBuilder())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`optional int64 timestamp = 4;`
		
		Specified by:
		`[hasTimestamp](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasTimestamp())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`optional int64 timestamp = 4;`
		
		Specified by:
		`[getTimestamp](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getTimestamp())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setTimestamp​(long value)
		```
		
		`optional int64 timestamp = 4;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearTimestamp()
		```
		
		`optional int64 timestamp = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasMetadata
		
		
		
		```
		public boolean hasMetadata()
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		
		Specified by:
		`[hasMetadata](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasMetadata())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the metadata field is set.
		- #### getMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") getMetadata()
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		
		Specified by:
		`[getMetadata](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getMetadata())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The metadata.
		- #### setMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setMetadata​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") value)
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		- #### setMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setMetadata​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		- #### mergeMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergeMetadata​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") value)
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		- #### clearMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearMetadata()
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		- #### getMetadataBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") getMetadataBuilder()
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		- #### getMetadataOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization") getMetadataOrBuilder()
		```
		
		`optional .ReplicatedPublishedEventMetaData metadata = 5;`
		
		Specified by:
		`[getMetadataOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getMetadataOrBuilder())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### hasReplyTo
		
		
		
		```
		public boolean hasReplyTo()
		```
		
		`optional string replyTo = 6;`
		
		Specified by:
		`[hasReplyTo](ReplicatedEventSourcing.PublishedEventOrBuilder.html#hasReplyTo())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the replyTo field is set.
		- #### getReplyTo
		
		
		
		```
		public java.lang.String getReplyTo()
		```
		
		`optional string replyTo = 6;`
		
		Specified by:
		`[getReplyTo](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getReplyTo())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The replyTo.
		- #### getReplyToBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getReplyToBytes()
		```
		
		`optional string replyTo = 6;`
		
		Specified by:
		`[getReplyToBytes](ReplicatedEventSourcing.PublishedEventOrBuilder.html#getReplyToBytes())` in interface `[ReplicatedEventSourcing.PublishedEventOrBuilder](ReplicatedEventSourcing.PublishedEventOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for replyTo.
		- #### setReplyTo
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setReplyTo​(java.lang.String value)
		```
		
		`optional string replyTo = 6;`
		
		Parameters:
		`value` \- The replyTo to set.
		Returns:
		This builder for chaining.
		- #### clearReplyTo
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") clearReplyTo()
		```
		
		`optional string replyTo = 6;`
		
		Returns:
		This builder for chaining.
		- #### setReplyToBytes
		
		
		
		```
		public [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setReplyToBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string replyTo = 6;`
		
		Parameters:
		`value` \- The bytes for replyTo to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.PublishedEvent.Builder](ReplicatedEventSourcing.PublishedEvent.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEventOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.PublishedEvent.Builder.html)*