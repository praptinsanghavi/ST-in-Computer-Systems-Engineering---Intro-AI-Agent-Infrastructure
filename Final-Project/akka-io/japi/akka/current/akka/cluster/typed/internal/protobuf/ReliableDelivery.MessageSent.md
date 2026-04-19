---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.Builder.html
title: ReliableDelivery.MessageSent.Builder
---

# ReliableDelivery.MessageSent.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.MessageSent.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent.Builder

- All Implemented Interfaces:
`[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.MessageSent.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 DurableProducerQueue
 
```

 Protobuf type `akka.cluster.typed.delivery.MessageSent`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearAck](#clearAck())()` | `required bool ack = 3;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearFirstChunk](#clearFirstChunk())()` | `optional bool firstChunk = 6;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearLastChunk](#clearLastChunk())()` | `optional bool lastChunk = 7;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearMessage](#clearMessage())()` | `required .Payload message = 5;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearQualifier](#clearQualifier())()` | `required string qualifier = 2;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearSeqNr](#clearSeqNr())()` | `required int64 seqNr = 1;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 4;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `boolean` | `[getAck](#getAck())()` | `required bool ack = 3;` |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getFirstChunk](#getFirstChunk())()` | `optional bool firstChunk = 6;` |
	| `boolean` | `[getLastChunk](#getLastChunk())()` | `optional bool lastChunk = 7;` |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .Payload message = 5;` |
	| `[ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMessageBuilder](#getMessageBuilder())()` | `required .Payload message = 5;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .Payload message = 5;` |
	| `java.lang.String` | `[getQualifier](#getQualifier())()` | `required string qualifier = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getQualifierBytes](#getQualifierBytes())()` | `required string qualifier = 2;` |
	| `long` | `[getSeqNr](#getSeqNr())()` | `required int64 seqNr = 1;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 4;` |
	| `boolean` | `[hasAck](#hasAck())()` | `required bool ack = 3;` |
	| `boolean` | `[hasFirstChunk](#hasFirstChunk())()` | `optional bool firstChunk = 6;` |
	| `boolean` | `[hasLastChunk](#hasLastChunk())()` | `optional bool lastChunk = 7;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .Payload message = 5;` |
	| `boolean` | `[hasQualifier](#hasQualifier())()` | `required string qualifier = 2;` |
	| `boolean` | `[hasSeqNr](#hasSeqNr())()` | `required int64 seqNr = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent))​([ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeMessage](#mergeMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 5;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setAck](#setAck(boolean))​(boolean value)` | `required bool ack = 3;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setFirstChunk](#setFirstChunk(boolean))​(boolean value)` | `optional bool firstChunk = 6;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setLastChunk](#setLastChunk(boolean))​(boolean value)` | `optional bool lastChunk = 7;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 5;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload message = 5;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setQualifier](#setQualifier(java.lang.String))​(java.lang.String value)` | `required string qualifier = 2;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setQualifierBytes](#setQualifierBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string qualifier = 2;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setSeqNr](#setSeqNr(long))​(long value)` | `required int64 seqNr = 1;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 4;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasSeqNr
		
		
		
		```
		public boolean hasSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[hasSeqNr](ReliableDelivery.MessageSentOrBuilder.html#hasSeqNr())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the seqNr field is set.
		- #### getSeqNr
		
		
		
		```
		public long getSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[getSeqNr](ReliableDelivery.MessageSentOrBuilder.html#getSeqNr())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The seqNr.
		- #### setSeqNr
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setSeqNr​(long value)
		```
		
		`required int64 seqNr = 1;`
		
		Parameters:
		`value` \- The seqNr to set.
		Returns:
		This builder for chaining.
		- #### clearSeqNr
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasQualifier
		
		
		
		```
		public boolean hasQualifier()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[hasQualifier](ReliableDelivery.MessageSentOrBuilder.html#hasQualifier())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the qualifier field is set.
		- #### getQualifier
		
		
		
		```
		public java.lang.String getQualifier()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[getQualifier](ReliableDelivery.MessageSentOrBuilder.html#getQualifier())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The qualifier.
		- #### getQualifierBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getQualifierBytes()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[getQualifierBytes](ReliableDelivery.MessageSentOrBuilder.html#getQualifierBytes())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for qualifier.
		- #### setQualifier
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setQualifier​(java.lang.String value)
		```
		
		`required string qualifier = 2;`
		
		Parameters:
		`value` \- The qualifier to set.
		Returns:
		This builder for chaining.
		- #### clearQualifier
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearQualifier()
		```
		
		`required string qualifier = 2;`
		
		Returns:
		This builder for chaining.
		- #### setQualifierBytes
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setQualifierBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string qualifier = 2;`
		
		Parameters:
		`value` \- The bytes for qualifier to set.
		Returns:
		This builder for chaining.
		- #### hasAck
		
		
		
		```
		public boolean hasAck()
		```
		
		`required bool ack = 3;`
		
		Specified by:
		`[hasAck](ReliableDelivery.MessageSentOrBuilder.html#hasAck())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the ack field is set.
		- #### getAck
		
		
		
		```
		public boolean getAck()
		```
		
		`required bool ack = 3;`
		
		Specified by:
		`[getAck](ReliableDelivery.MessageSentOrBuilder.html#getAck())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The ack.
		- #### setAck
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setAck​(boolean value)
		```
		
		`required bool ack = 3;`
		
		Parameters:
		`value` \- The ack to set.
		Returns:
		This builder for chaining.
		- #### clearAck
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearAck()
		```
		
		`required bool ack = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 4;`
		
		Specified by:
		`[hasTimestamp](ReliableDelivery.MessageSentOrBuilder.html#hasTimestamp())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 4;`
		
		Specified by:
		`[getTimestamp](ReliableDelivery.MessageSentOrBuilder.html#getTimestamp())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 4;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearTimestamp()
		```
		
		`required int64 timestamp = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required .Payload message = 5;`
		
		Specified by:
		`[hasMessage](ReliableDelivery.MessageSentOrBuilder.html#hasMessage())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public [ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMessage()
		```
		
		`required .Payload message = 5;`
		
		Specified by:
		`[getMessage](ReliableDelivery.MessageSentOrBuilder.html#getMessage())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 5;`
		- #### setMessage
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload message = 5;`
		- #### mergeMessage
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 5;`
		- #### clearMessage
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearMessage()
		```
		
		`required .Payload message = 5;`
		- #### getMessageBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMessageBuilder()
		```
		
		`required .Payload message = 5;`
		- #### getMessageOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .Payload message = 5;`
		
		Specified by:
		`[getMessageOrBuilder](ReliableDelivery.MessageSentOrBuilder.html#getMessageOrBuilder())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### hasFirstChunk
		
		
		
		```
		public boolean hasFirstChunk()
		```
		
		`optional bool firstChunk = 6;`
		
		Specified by:
		`[hasFirstChunk](ReliableDelivery.MessageSentOrBuilder.html#hasFirstChunk())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the firstChunk field is set.
		- #### getFirstChunk
		
		
		
		```
		public boolean getFirstChunk()
		```
		
		`optional bool firstChunk = 6;`
		
		Specified by:
		`[getFirstChunk](ReliableDelivery.MessageSentOrBuilder.html#getFirstChunk())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The firstChunk.
		- #### setFirstChunk
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setFirstChunk​(boolean value)
		```
		
		`optional bool firstChunk = 6;`
		
		Parameters:
		`value` \- The firstChunk to set.
		Returns:
		This builder for chaining.
		- #### clearFirstChunk
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearFirstChunk()
		```
		
		`optional bool firstChunk = 6;`
		
		Returns:
		This builder for chaining.
		- #### hasLastChunk
		
		
		
		```
		public boolean hasLastChunk()
		```
		
		`optional bool lastChunk = 7;`
		
		Specified by:
		`[hasLastChunk](ReliableDelivery.MessageSentOrBuilder.html#hasLastChunk())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the lastChunk field is set.
		- #### getLastChunk
		
		
		
		```
		public boolean getLastChunk()
		```
		
		`optional bool lastChunk = 7;`
		
		Specified by:
		`[getLastChunk](ReliableDelivery.MessageSentOrBuilder.html#getLastChunk())` in interface `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The lastChunk.
		- #### setLastChunk
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setLastChunk​(boolean value)
		```
		
		`optional bool lastChunk = 7;`
		
		Parameters:
		`value` \- The lastChunk to set.
		Returns:
		This builder for chaining.
		- #### clearLastChunk
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") clearLastChunk()
		```
		
		`optional bool lastChunk = 7;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSentOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.Builder.html)*