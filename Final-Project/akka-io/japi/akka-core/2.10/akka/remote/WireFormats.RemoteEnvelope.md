---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelope.Builder.html
title: WireFormats.RemoteEnvelope.Builder
---

# WireFormats.RemoteEnvelope.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.RemoteEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.RemoteEnvelope.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote")

---

```
public static final class WireFormats.RemoteEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>
implements [WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")
```

```

 Defines a remote message.
 
```

 Protobuf type `RemoteEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearMessage](#clearMessage())()` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearRecipient](#clearRecipient())()` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearSender](#clearSender())()` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clearSeq](#clearSeq())()` | `optional fixed64 seq = 5;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[getMessageBuilder](#getMessageBuilder())()` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[getRecipient](#getRecipient())()` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[getRecipientBuilder](#getRecipientBuilder())()` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")` | `[getRecipientOrBuilder](#getRecipientOrBuilder())()` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[getSender](#getSender())()` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[getSenderBuilder](#getSenderBuilder())()` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")` | `[getSenderOrBuilder](#getSenderOrBuilder())()` | `optional .ActorRefData sender = 4;` |
	| `long` | `[getSeq](#getSeq())()` | `optional fixed64 seq = 5;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .SerializedMessage message = 2;` |
	| `boolean` | `[hasRecipient](#hasRecipient())()` | `required .ActorRefData recipient = 1;` |
	| `boolean` | `[hasSender](#hasSender())()` | `optional .ActorRefData sender = 4;` |
	| `boolean` | `[hasSeq](#hasSeq())()` | `optional fixed64 seq = 5;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.RemoteEnvelope))​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") other)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeMessage](#mergeMessage(akka.remote.WireFormats.SerializedMessage))​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") value)` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeRecipient](#mergeRecipient(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeSender](#mergeSender(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(akka.remote.WireFormats.SerializedMessage))​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") value)` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(akka.remote.WireFormats.SerializedMessage.Builder))​([WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") builderForValue)` | `required .SerializedMessage message = 2;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setRecipient](#setRecipient(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setRecipient](#setRecipient(akka.remote.WireFormats.ActorRefData.Builder))​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRefData recipient = 1;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setSender](#setSender(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setSender](#setSender(akka.remote.WireFormats.ActorRefData.Builder))​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)` | `optional .ActorRefData sender = 4;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setSeq](#setSeq(long))​(long value)` | `optional fixed64 seq = 5;` |
	| `[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeFrom​([WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasRecipient
		
		
		
		```
		public boolean hasRecipient()
		```
		
		`required .ActorRefData recipient = 1;`
		
		Specified by:
		`[hasRecipient](WireFormats.RemoteEnvelopeOrBuilder.html#hasRecipient())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the recipient field is set.
		- #### getRecipient
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") getRecipient()
		```
		
		`required .ActorRefData recipient = 1;`
		
		Specified by:
		`[getRecipient](WireFormats.RemoteEnvelopeOrBuilder.html#getRecipient())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The recipient.
		- #### setRecipient
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setRecipient​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`required .ActorRefData recipient = 1;`
		- #### setRecipient
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setRecipient​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRefData recipient = 1;`
		- #### mergeRecipient
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeRecipient​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`required .ActorRefData recipient = 1;`
		- #### clearRecipient
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearRecipient()
		```
		
		`required .ActorRefData recipient = 1;`
		- #### getRecipientBuilder
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") getRecipientBuilder()
		```
		
		`required .ActorRefData recipient = 1;`
		- #### getRecipientOrBuilder
		
		
		
		```
		public [WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote") getRecipientOrBuilder()
		```
		
		`required .ActorRefData recipient = 1;`
		
		Specified by:
		`[getRecipientOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html#getRecipientOrBuilder())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required .SerializedMessage message = 2;`
		
		Specified by:
		`[hasMessage](WireFormats.RemoteEnvelopeOrBuilder.html#hasMessage())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") getMessage()
		```
		
		`required .SerializedMessage message = 2;`
		
		Specified by:
		`[getMessage](WireFormats.RemoteEnvelopeOrBuilder.html#getMessage())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setMessage​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") value)
		```
		
		`required .SerializedMessage message = 2;`
		- #### setMessage
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setMessage​([WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .SerializedMessage message = 2;`
		- #### mergeMessage
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeMessage​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") value)
		```
		
		`required .SerializedMessage message = 2;`
		- #### clearMessage
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearMessage()
		```
		
		`required .SerializedMessage message = 2;`
		- #### getMessageBuilder
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") getMessageBuilder()
		```
		
		`required .SerializedMessage message = 2;`
		- #### getMessageOrBuilder
		
		
		
		```
		public [WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .SerializedMessage message = 2;`
		
		Specified by:
		`[getMessageOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html#getMessageOrBuilder())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### hasSender
		
		
		
		```
		public boolean hasSender()
		```
		
		`optional .ActorRefData sender = 4;`
		
		Specified by:
		`[hasSender](WireFormats.RemoteEnvelopeOrBuilder.html#hasSender())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the sender field is set.
		- #### getSender
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") getSender()
		```
		
		`optional .ActorRefData sender = 4;`
		
		Specified by:
		`[getSender](WireFormats.RemoteEnvelopeOrBuilder.html#getSender())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The sender.
		- #### setSender
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setSender​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`optional .ActorRefData sender = 4;`
		- #### setSender
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setSender​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .ActorRefData sender = 4;`
		- #### mergeSender
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeSender​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`optional .ActorRefData sender = 4;`
		- #### clearSender
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearSender()
		```
		
		`optional .ActorRefData sender = 4;`
		- #### getSenderBuilder
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") getSenderBuilder()
		```
		
		`optional .ActorRefData sender = 4;`
		- #### getSenderOrBuilder
		
		
		
		```
		public [WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote") getSenderOrBuilder()
		```
		
		`optional .ActorRefData sender = 4;`
		
		Specified by:
		`[getSenderOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html#getSenderOrBuilder())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### hasSeq
		
		
		
		```
		public boolean hasSeq()
		```
		
		`optional fixed64 seq = 5;`
		
		Specified by:
		`[hasSeq](WireFormats.RemoteEnvelopeOrBuilder.html#hasSeq())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the seq field is set.
		- #### getSeq
		
		
		
		```
		public long getSeq()
		```
		
		`optional fixed64 seq = 5;`
		
		Specified by:
		`[getSeq](WireFormats.RemoteEnvelopeOrBuilder.html#getSeq())` in interface `[WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The seq.
		- #### setSeq
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setSeq​(long value)
		```
		
		`optional fixed64 seq = 5;`
		
		Parameters:
		`value` \- The seq to set.
		Returns:
		This builder for chaining.
		- #### clearSeq
		
		
		
		```
		public [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") clearSeq()
		```
		
		`optional fixed64 seq = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelope.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.RemoteEnvelope.Builder.html)*