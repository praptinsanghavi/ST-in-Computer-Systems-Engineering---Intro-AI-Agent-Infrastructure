---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html
title: MessageFormats.AtLeastOnceDeliverySnapshot.Builder
---

# MessageFormats.AtLeastOnceDeliverySnapshot.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.AtLeastOnceDeliverySnapshot.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.Builder

- All Implemented Interfaces:
`[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.AtLeastOnceDeliverySnapshot.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `AtLeastOnceDeliverySnapshot`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addAllUnconfirmedDeliveries](#addAllUnconfirmedDeliveries(java.lang.Iterable))​(java.lang.Iterable<? extends [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> values)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveries](#addUnconfirmedDeliveries(int,akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery))​(int index,  [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveries](#addUnconfirmedDeliveries(int,akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder))​(int index,  [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveries](#addUnconfirmedDeliveries(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery))​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveries](#addUnconfirmedDeliveries(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder))​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveriesBuilder](#addUnconfirmedDeliveriesBuilder())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[addUnconfirmedDeliveriesBuilder](#addUnconfirmedDeliveriesBuilder(int))​(int index)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearCurrentDeliveryId](#clearCurrentDeliveryId())()` | `required int64 currentDeliveryId = 1;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearUnconfirmedDeliveries](#clearUnconfirmedDeliveries())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `long` | `[getCurrentDeliveryId](#getCurrentDeliveryId())()` | `required int64 currentDeliveryId = 1;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")` | `[getUnconfirmedDeliveries](#getUnconfirmedDeliveries(int))​(int index)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")` | `[getUnconfirmedDeliveriesBuilder](#getUnconfirmedDeliveriesBuilder(int))​(int index)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `java.util.List<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")>` | `[getUnconfirmedDeliveriesBuilderList](#getUnconfirmedDeliveriesBuilderList())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `int` | `[getUnconfirmedDeliveriesCount](#getUnconfirmedDeliveriesCount())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `java.util.List<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")>` | `[getUnconfirmedDeliveriesList](#getUnconfirmedDeliveriesList())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")` | `[getUnconfirmedDeliveriesOrBuilder](#getUnconfirmedDeliveriesOrBuilder(int))​(int index)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `java.util.List<? extends [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")>` | `[getUnconfirmedDeliveriesOrBuilderList](#getUnconfirmedDeliveriesOrBuilderList())()` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `boolean` | `[hasCurrentDeliveryId](#hasCurrentDeliveryId())()` | `required int64 currentDeliveryId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot))​([MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[removeUnconfirmedDeliveries](#removeUnconfirmedDeliveries(int))​(int index)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setCurrentDeliveryId](#setCurrentDeliveryId(long))​(long value)` | `required int64 currentDeliveryId = 1;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setUnconfirmedDeliveries](#setUnconfirmedDeliveries(int,akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery))​(int index,  [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setUnconfirmedDeliveries](#setUnconfirmedDeliveries(int,akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder))​(int index,  [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;` |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           int index,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasCurrentDeliveryId
		
		
		
		```
		public boolean hasCurrentDeliveryId()
		```
		
		`required int64 currentDeliveryId = 1;`
		
		Specified by:
		`[hasCurrentDeliveryId](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#hasCurrentDeliveryId())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the currentDeliveryId field is set.
		- #### getCurrentDeliveryId
		
		
		
		```
		public long getCurrentDeliveryId()
		```
		
		`required int64 currentDeliveryId = 1;`
		
		Specified by:
		`[getCurrentDeliveryId](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getCurrentDeliveryId())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The currentDeliveryId.
		- #### setCurrentDeliveryId
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setCurrentDeliveryId​(long value)
		```
		
		`required int64 currentDeliveryId = 1;`
		
		Parameters:
		`value` \- The currentDeliveryId to set.
		Returns:
		This builder for chaining.
		- #### clearCurrentDeliveryId
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clearCurrentDeliveryId()
		```
		
		`required int64 currentDeliveryId = 1;`
		
		Returns:
		This builder for chaining.
		- #### getUnconfirmedDeliveriesList
		
		
		
		```
		public java.util.List<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> getUnconfirmedDeliveriesList()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		
		Specified by:
		`[getUnconfirmedDeliveriesList](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getUnconfirmedDeliveriesList())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getUnconfirmedDeliveriesCount
		
		
		
		```
		public int getUnconfirmedDeliveriesCount()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		
		Specified by:
		`[getUnconfirmedDeliveriesCount](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getUnconfirmedDeliveriesCount())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") getUnconfirmedDeliveries​(int index)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		
		Specified by:
		`[getUnconfirmedDeliveries](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getUnconfirmedDeliveries(int))` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### setUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setUnconfirmedDeliveries​(int index,
		                                                                                   [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### setUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setUnconfirmedDeliveries​(int index,
		                                                                                   [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveries​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveries​(int index,
		                                                                                   [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveries​([MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveries​(int index,
		                                                                                   [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addAllUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") addAllUnconfirmedDeliveries​(java.lang.Iterable<? extends [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization")> values)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### clearUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") clearUnconfirmedDeliveries()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### removeUnconfirmedDeliveries
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") removeUnconfirmedDeliveries​(int index)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### getUnconfirmedDeliveriesBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") getUnconfirmedDeliveriesBuilder​(int index)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### getUnconfirmedDeliveriesOrBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization") getUnconfirmedDeliveriesOrBuilder​(int index)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		
		Specified by:
		`[getUnconfirmedDeliveriesOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getUnconfirmedDeliveriesOrBuilder(int))` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getUnconfirmedDeliveriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization")> getUnconfirmedDeliveriesOrBuilderList()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		
		Specified by:
		`[getUnconfirmedDeliveriesOrBuilderList](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html#getUnconfirmedDeliveriesOrBuilderList())` in interface `[MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### addUnconfirmedDeliveriesBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveriesBuilder()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### addUnconfirmedDeliveriesBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") addUnconfirmedDeliveriesBuilder​(int index)
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### getUnconfirmedDeliveriesBuilderList
		
		
		
		```
		public java.util.List<[MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization")> getUnconfirmedDeliveriesBuilderList()
		```
		
		`repeated .AtLeastOnceDeliverySnapshot.UnconfirmedDelivery unconfirmedDeliveries = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html)*