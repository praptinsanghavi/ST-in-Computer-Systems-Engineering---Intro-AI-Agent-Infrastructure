---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainer.Builder.html
title: WireFormats.AckAndEnvelopeContainer.Builder
---

# WireFormats.AckAndEnvelopeContainer.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AckAndEnvelopeContainer.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AckAndEnvelopeContainer.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote")

---

```
public static final class WireFormats.AckAndEnvelopeContainer.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>
implements [WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")
```

Protobuf type `AckAndEnvelopeContainer`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clearAck](#clearAck())()` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clearEnvelope](#clearEnvelope())()` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote")` | `[getAck](#getAck())()` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[getAckBuilder](#getAckBuilder())()` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")` | `[getAckOrBuilder](#getAckOrBuilder())()` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote")` | `[getEnvelope](#getEnvelope())()` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[getEnvelopeBuilder](#getEnvelopeBuilder())()` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")` | `[getEnvelopeOrBuilder](#getEnvelopeOrBuilder())()` | `optional .RemoteEnvelope envelope = 2;` |
	| `boolean` | `[hasAck](#hasAck())()` | `optional .AcknowledgementInfo ack = 1;` |
	| `boolean` | `[hasEnvelope](#hasEnvelope())()` | `optional .RemoteEnvelope envelope = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeAck](#mergeAck(akka.remote.WireFormats.AcknowledgementInfo))​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") value)` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeEnvelope](#mergeEnvelope(akka.remote.WireFormats.RemoteEnvelope))​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") value)` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AckAndEnvelopeContainer))​([WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") other)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setAck](#setAck(akka.remote.WireFormats.AcknowledgementInfo))​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") value)` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setAck](#setAck(akka.remote.WireFormats.AcknowledgementInfo.Builder))​([WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") builderForValue)` | `optional .AcknowledgementInfo ack = 1;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setEnvelope](#setEnvelope(akka.remote.WireFormats.RemoteEnvelope))​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") value)` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setEnvelope](#setEnvelope(akka.remote.WireFormats.RemoteEnvelope.Builder))​([WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") builderForValue)` | `optional .RemoteEnvelope envelope = 2;` |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasAck
		
		
		
		```
		public boolean hasAck()
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		
		Specified by:
		`[hasAck](WireFormats.AckAndEnvelopeContainerOrBuilder.html#hasAck())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the ack field is set.
		- #### getAck
		
		
		
		```
		public [WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") getAck()
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		
		Specified by:
		`[getAck](WireFormats.AckAndEnvelopeContainerOrBuilder.html#getAck())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		Returns:
		The ack.
		- #### setAck
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setAck​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") value)
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		- #### setAck
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setAck​([WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		- #### mergeAck
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeAck​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") value)
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		- #### clearAck
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clearAck()
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		- #### getAckBuilder
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") getAckBuilder()
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		- #### getAckOrBuilder
		
		
		
		```
		public [WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote") getAckOrBuilder()
		```
		
		`optional .AcknowledgementInfo ack = 1;`
		
		Specified by:
		`[getAckOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html#getAckOrBuilder())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		- #### hasEnvelope
		
		
		
		```
		public boolean hasEnvelope()
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		
		Specified by:
		`[hasEnvelope](WireFormats.AckAndEnvelopeContainerOrBuilder.html#hasEnvelope())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the envelope field is set.
		- #### getEnvelope
		
		
		
		```
		public [WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") getEnvelope()
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelope](WireFormats.AckAndEnvelopeContainerOrBuilder.html#getEnvelope())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		Returns:
		The envelope.
		- #### setEnvelope
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setEnvelope​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") value)
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		- #### setEnvelope
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setEnvelope​([WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		- #### mergeEnvelope
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeEnvelope​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") value)
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		- #### clearEnvelope
		
		
		
		```
		public [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") clearEnvelope()
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		- #### getEnvelopeBuilder
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") getEnvelopeBuilder()
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		- #### getEnvelopeOrBuilder
		
		
		
		```
		public [WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote") getEnvelopeOrBuilder()
		```
		
		`optional .RemoteEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelopeOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html#getEnvelopeOrBuilder())` in interface `[WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainer.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainer.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainerOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfoOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainer.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AckAndEnvelopeContainer.Builder.html)*