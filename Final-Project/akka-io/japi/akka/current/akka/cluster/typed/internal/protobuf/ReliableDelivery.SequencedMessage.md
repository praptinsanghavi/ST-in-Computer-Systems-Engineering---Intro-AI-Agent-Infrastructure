---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.Builder.html
title: ReliableDelivery.SequencedMessage.Builder
---

# ReliableDelivery.SequencedMessage.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.SequencedMessage.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.SequencedMessage.Builder

- All Implemented Interfaces:
`[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.SequencedMessage.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 ConsumerController
 
```

 Protobuf type `akka.cluster.typed.delivery.SequencedMessage`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearAck](#clearAck())()` | `required bool ack = 4;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearFirst](#clearFirst())()` | `required bool first = 3;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearFirstChunk](#clearFirstChunk())()` | `optional bool firstChunk = 7;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearLastChunk](#clearLastChunk())()` | `optional bool lastChunk = 8;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearMessage](#clearMessage())()` | `required .Payload message = 6;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearProducerControllerRef](#clearProducerControllerRef())()` | `required string producerControllerRef = 5;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearProducerId](#clearProducerId())()` | `required string producerId = 1;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearSeqNr](#clearSeqNr())()` | `required int64 seqNr = 2;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `boolean` | `[getAck](#getAck())()` | `required bool ack = 4;` |
	| `[ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getFirst](#getFirst())()` | `required bool first = 3;` |
	| `boolean` | `[getFirstChunk](#getFirstChunk())()` | `optional bool firstChunk = 7;` |
	| `boolean` | `[getLastChunk](#getLastChunk())()` | `optional bool lastChunk = 8;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .Payload message = 6;` |
	| `[ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMessageBuilder](#getMessageBuilder())()` | `required .Payload message = 6;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .Payload message = 6;` |
	| `java.lang.String` | `[getProducerControllerRef](#getProducerControllerRef())()` | `required string producerControllerRef = 5;` |
	| `akka.protobufv3.internal.ByteString` | `[getProducerControllerRefBytes](#getProducerControllerRefBytes())()` | `required string producerControllerRef = 5;` |
	| `java.lang.String` | `[getProducerId](#getProducerId())()` | `required string producerId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getProducerIdBytes](#getProducerIdBytes())()` | `required string producerId = 1;` |
	| `long` | `[getSeqNr](#getSeqNr())()` | `required int64 seqNr = 2;` |
	| `boolean` | `[hasAck](#hasAck())()` | `required bool ack = 4;` |
	| `boolean` | `[hasFirst](#hasFirst())()` | `required bool first = 3;` |
	| `boolean` | `[hasFirstChunk](#hasFirstChunk())()` | `optional bool firstChunk = 7;` |
	| `boolean` | `[hasLastChunk](#hasLastChunk())()` | `optional bool lastChunk = 8;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .Payload message = 6;` |
	| `boolean` | `[hasProducerControllerRef](#hasProducerControllerRef())()` | `required string producerControllerRef = 5;` |
	| `boolean` | `[hasProducerId](#hasProducerId())()` | `required string producerId = 1;` |
	| `boolean` | `[hasSeqNr](#hasSeqNr())()` | `required int64 seqNr = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ReliableDelivery.SequencedMessage))​([ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeMessage](#mergeMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 6;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setAck](#setAck(boolean))​(boolean value)` | `required bool ack = 4;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setFirst](#setFirst(boolean))​(boolean value)` | `required bool first = 3;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setFirstChunk](#setFirstChunk(boolean))​(boolean value)` | `optional bool firstChunk = 7;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setLastChunk](#setLastChunk(boolean))​(boolean value)` | `optional bool lastChunk = 8;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 6;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload message = 6;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setProducerControllerRef](#setProducerControllerRef(java.lang.String))​(java.lang.String value)` | `required string producerControllerRef = 5;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setProducerControllerRefBytes](#setProducerControllerRefBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string producerControllerRef = 5;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setProducerId](#setProducerId(java.lang.String))​(java.lang.String value)` | `required string producerId = 1;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setProducerIdBytes](#setProducerIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string producerId = 1;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setSeqNr](#setSeqNr(long))​(long value)` | `required int64 seqNr = 2;` |
	| `[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ReliableDelivery.SequencedMessage](ReliableDelivery.SequencedMessage.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasProducerId
		
		
		
		```
		public boolean hasProducerId()
		```
		
		`required string producerId = 1;`
		
		Specified by:
		`[hasProducerId](ReliableDelivery.SequencedMessageOrBuilder.html#hasProducerId())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the producerId field is set.
		- #### getProducerId
		
		
		
		```
		public java.lang.String getProducerId()
		```
		
		`required string producerId = 1;`
		
		Specified by:
		`[getProducerId](ReliableDelivery.SequencedMessageOrBuilder.html#getProducerId())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The producerId.
		- #### getProducerIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProducerIdBytes()
		```
		
		`required string producerId = 1;`
		
		Specified by:
		`[getProducerIdBytes](ReliableDelivery.SequencedMessageOrBuilder.html#getProducerIdBytes())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for producerId.
		- #### setProducerId
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setProducerId​(java.lang.String value)
		```
		
		`required string producerId = 1;`
		
		Parameters:
		`value` \- The producerId to set.
		Returns:
		This builder for chaining.
		- #### clearProducerId
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearProducerId()
		```
		
		`required string producerId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setProducerIdBytes
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setProducerIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string producerId = 1;`
		
		Parameters:
		`value` \- The bytes for producerId to set.
		Returns:
		This builder for chaining.
		- #### hasSeqNr
		
		
		
		```
		public boolean hasSeqNr()
		```
		
		`required int64 seqNr = 2;`
		
		Specified by:
		`[hasSeqNr](ReliableDelivery.SequencedMessageOrBuilder.html#hasSeqNr())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the seqNr field is set.
		- #### getSeqNr
		
		
		
		```
		public long getSeqNr()
		```
		
		`required int64 seqNr = 2;`
		
		Specified by:
		`[getSeqNr](ReliableDelivery.SequencedMessageOrBuilder.html#getSeqNr())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The seqNr.
		- #### setSeqNr
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setSeqNr​(long value)
		```
		
		`required int64 seqNr = 2;`
		
		Parameters:
		`value` \- The seqNr to set.
		Returns:
		This builder for chaining.
		- #### clearSeqNr
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearSeqNr()
		```
		
		`required int64 seqNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasFirst
		
		
		
		```
		public boolean hasFirst()
		```
		
		`required bool first = 3;`
		
		Specified by:
		`[hasFirst](ReliableDelivery.SequencedMessageOrBuilder.html#hasFirst())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the first field is set.
		- #### getFirst
		
		
		
		```
		public boolean getFirst()
		```
		
		`required bool first = 3;`
		
		Specified by:
		`[getFirst](ReliableDelivery.SequencedMessageOrBuilder.html#getFirst())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The first.
		- #### setFirst
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setFirst​(boolean value)
		```
		
		`required bool first = 3;`
		
		Parameters:
		`value` \- The first to set.
		Returns:
		This builder for chaining.
		- #### clearFirst
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearFirst()
		```
		
		`required bool first = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasAck
		
		
		
		```
		public boolean hasAck()
		```
		
		`required bool ack = 4;`
		
		Specified by:
		`[hasAck](ReliableDelivery.SequencedMessageOrBuilder.html#hasAck())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the ack field is set.
		- #### getAck
		
		
		
		```
		public boolean getAck()
		```
		
		`required bool ack = 4;`
		
		Specified by:
		`[getAck](ReliableDelivery.SequencedMessageOrBuilder.html#getAck())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The ack.
		- #### setAck
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setAck​(boolean value)
		```
		
		`required bool ack = 4;`
		
		Parameters:
		`value` \- The ack to set.
		Returns:
		This builder for chaining.
		- #### clearAck
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearAck()
		```
		
		`required bool ack = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasProducerControllerRef
		
		
		
		```
		public boolean hasProducerControllerRef()
		```
		
		`required string producerControllerRef = 5;`
		
		Specified by:
		`[hasProducerControllerRef](ReliableDelivery.SequencedMessageOrBuilder.html#hasProducerControllerRef())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the producerControllerRef field is set.
		- #### getProducerControllerRef
		
		
		
		```
		public java.lang.String getProducerControllerRef()
		```
		
		`required string producerControllerRef = 5;`
		
		Specified by:
		`[getProducerControllerRef](ReliableDelivery.SequencedMessageOrBuilder.html#getProducerControllerRef())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The producerControllerRef.
		- #### getProducerControllerRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProducerControllerRefBytes()
		```
		
		`required string producerControllerRef = 5;`
		
		Specified by:
		`[getProducerControllerRefBytes](ReliableDelivery.SequencedMessageOrBuilder.html#getProducerControllerRefBytes())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for producerControllerRef.
		- #### setProducerControllerRef
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setProducerControllerRef​(java.lang.String value)
		```
		
		`required string producerControllerRef = 5;`
		
		Parameters:
		`value` \- The producerControllerRef to set.
		Returns:
		This builder for chaining.
		- #### clearProducerControllerRef
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearProducerControllerRef()
		```
		
		`required string producerControllerRef = 5;`
		
		Returns:
		This builder for chaining.
		- #### setProducerControllerRefBytes
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setProducerControllerRefBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string producerControllerRef = 5;`
		
		Parameters:
		`value` \- The bytes for producerControllerRef to set.
		Returns:
		This builder for chaining.
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required .Payload message = 6;`
		
		Specified by:
		`[hasMessage](ReliableDelivery.SequencedMessageOrBuilder.html#hasMessage())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public [ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMessage()
		```
		
		`required .Payload message = 6;`
		
		Specified by:
		`[getMessage](ReliableDelivery.SequencedMessageOrBuilder.html#getMessage())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 6;`
		- #### setMessage
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload message = 6;`
		- #### mergeMessage
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 6;`
		- #### clearMessage
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearMessage()
		```
		
		`required .Payload message = 6;`
		- #### getMessageBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMessageBuilder()
		```
		
		`required .Payload message = 6;`
		- #### getMessageOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .Payload message = 6;`
		
		Specified by:
		`[getMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html#getMessageOrBuilder())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### hasFirstChunk
		
		
		
		```
		public boolean hasFirstChunk()
		```
		
		`optional bool firstChunk = 7;`
		
		Specified by:
		`[hasFirstChunk](ReliableDelivery.SequencedMessageOrBuilder.html#hasFirstChunk())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the firstChunk field is set.
		- #### getFirstChunk
		
		
		
		```
		public boolean getFirstChunk()
		```
		
		`optional bool firstChunk = 7;`
		
		Specified by:
		`[getFirstChunk](ReliableDelivery.SequencedMessageOrBuilder.html#getFirstChunk())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The firstChunk.
		- #### setFirstChunk
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setFirstChunk​(boolean value)
		```
		
		`optional bool firstChunk = 7;`
		
		Parameters:
		`value` \- The firstChunk to set.
		Returns:
		This builder for chaining.
		- #### clearFirstChunk
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearFirstChunk()
		```
		
		`optional bool firstChunk = 7;`
		
		Returns:
		This builder for chaining.
		- #### hasLastChunk
		
		
		
		```
		public boolean hasLastChunk()
		```
		
		`optional bool lastChunk = 8;`
		
		Specified by:
		`[hasLastChunk](ReliableDelivery.SequencedMessageOrBuilder.html#hasLastChunk())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the lastChunk field is set.
		- #### getLastChunk
		
		
		
		```
		public boolean getLastChunk()
		```
		
		`optional bool lastChunk = 8;`
		
		Specified by:
		`[getLastChunk](ReliableDelivery.SequencedMessageOrBuilder.html#getLastChunk())` in interface `[ReliableDelivery.SequencedMessageOrBuilder](ReliableDelivery.SequencedMessageOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The lastChunk.
		- #### setLastChunk
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setLastChunk​(boolean value)
		```
		
		`optional bool lastChunk = 8;`
		
		Parameters:
		`value` \- The lastChunk to set.
		Returns:
		This builder for chaining.
		- #### clearLastChunk
		
		
		
		```
		public [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") clearLastChunk()
		```
		
		`optional bool lastChunk = 8;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.SequencedMessage.Builder](ReliableDelivery.SequencedMessage.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.SequencedMessage.Builder.html)*