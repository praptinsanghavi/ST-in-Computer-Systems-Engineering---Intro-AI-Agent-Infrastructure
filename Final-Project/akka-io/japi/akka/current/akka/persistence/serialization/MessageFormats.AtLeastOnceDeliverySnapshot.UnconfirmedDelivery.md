---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html
title: MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder
---

# MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder

- All Implemented Interfaces:
`[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `AtLeastOnceDeliverySnapshot.UnconfirmedDelivery`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clearDeliveryId](#clearDeliveryId())()` | `required int64 deliveryId = 1;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clearDestination](#clearDestination())()` | `required string destination = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clearPayload](#clearPayload())()` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `long` | `[getDeliveryId](#getDeliveryId())()` | `required int64 deliveryId = 1;` |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getDestination](#getDestination())()` | `required string destination = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getDestinationBytes](#getDestinationBytes())()` | `required string destination = 2;` |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getPayload](#getPayload())()` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .PersistentPayload payload = 3;` |
	| `boolean` | `[hasDeliveryId](#hasDeliveryId())()` | `required int64 deliveryId = 1;` |
	| `boolean` | `[hasDestination](#hasDestination())()` | `required string destination = 2;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .PersistentPayload payload = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery))​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[mergePayload](#mergePayload(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setDeliveryId](#setDeliveryId(long))​(long value)` | `required int64 deliveryId = 1;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setDestination](#setDestination(java.lang.String))​(java.lang.String value)` | `required string destination = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setDestinationBytes](#setDestinationBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string destination = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `required .PersistentPayload payload = 3;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                               int index,
		                                                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
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
		- #### setDeliveryId
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setDeliveryId​(long value)
		```
		
		`required int64 deliveryId = 1;`
		
		Parameters:
		`value` \- The deliveryId to set.
		Returns:
		This builder for chaining.
		- #### clearDeliveryId
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clearDeliveryId()
		```
		
		`required int64 deliveryId = 1;`
		
		Returns:
		This builder for chaining.
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
		- #### setDestination
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setDestination​(java.lang.String value)
		```
		
		`required string destination = 2;`
		
		Parameters:
		`value` \- The destination to set.
		Returns:
		This builder for chaining.
		- #### clearDestination
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clearDestination()
		```
		
		`required string destination = 2;`
		
		Returns:
		This builder for chaining.
		- #### setDestinationBytes
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setDestinationBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string destination = 2;`
		
		Parameters:
		`value` \- The bytes for destination to set.
		Returns:
		This builder for chaining.
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
		- #### setPayload
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setPayload​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`required .PersistentPayload payload = 3;`
		- #### setPayload
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setPayload​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`required .PersistentPayload payload = 3;`
		- #### mergePayload
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") mergePayload​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`required .PersistentPayload payload = 3;`
		- #### clearPayload
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") clearPayload()
		```
		
		`required .PersistentPayload payload = 3;`
		- #### getPayloadBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") getPayloadBuilder()
		```
		
		`required .PersistentPayload payload = 3;`
		- #### getPayloadOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getPayloadOrBuilder()
		```
		
		`required .PersistentPayload payload = 3;`
		
		Specified by:
		`[getPayloadOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html#getPayloadOrBuilder())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")`
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html)*