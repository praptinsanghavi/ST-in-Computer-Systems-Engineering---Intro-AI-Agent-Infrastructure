---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html
title: ReliableDelivery.State.Builder
---

# ReliableDelivery.State.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.State.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.State.Builder

- All Implemented Interfaces:
`[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.State.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 DurableProducerQueue
 
```

 Protobuf type `akka.cluster.typed.delivery.State`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addAllConfirmed](#addAllConfirmed(java.lang.Iterable))​(java.lang.Iterable<? extends [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> values)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addAllUnconfirmed](#addAllUnconfirmed(java.lang.Iterable))​(java.lang.Iterable<? extends [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> values)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmed](#addConfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed))​(int index,  [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmed](#addConfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed.Builder))​(int index,  [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmed](#addConfirmed(akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed))​([ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmed](#addConfirmed(akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed.Builder))​([ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmedBuilder](#addConfirmedBuilder())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addConfirmedBuilder](#addConfirmedBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmed](#addUnconfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent))​(int index,  [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmed](#addUnconfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent.Builder))​(int index,  [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmed](#addUnconfirmed(akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent))​([ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmed](#addUnconfirmed(akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent.Builder))​([ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmedBuilder](#addUnconfirmedBuilder())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addUnconfirmedBuilder](#addUnconfirmedBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearConfirmed](#clearConfirmed())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearCurrentSeqNr](#clearCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearHighestConfirmedSeqNr](#clearHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearUnconfirmed](#clearUnconfirmed())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[getConfirmed](#getConfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[getConfirmedBuilder](#getConfirmedBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedBuilderList](#getConfirmedBuilderList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `int` | `[getConfirmedCount](#getConfirmedCount())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedList](#getConfirmedList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getConfirmedOrBuilder](#getConfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedOrBuilderList](#getConfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `long` | `[getCurrentSeqNr](#getCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getHighestConfirmedSeqNr](#getHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmed](#getUnconfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmedBuilder](#getUnconfirmedBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedBuilderList](#getUnconfirmedBuilderList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `int` | `[getUnconfirmedCount](#getUnconfirmedCount())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedList](#getUnconfirmedList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmedOrBuilder](#getUnconfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedOrBuilderList](#getUnconfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `boolean` | `[hasCurrentSeqNr](#hasCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `boolean` | `[hasHighestConfirmedSeqNr](#hasHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ReliableDelivery.State))​([ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[removeConfirmed](#removeConfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[removeUnconfirmed](#removeUnconfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setConfirmed](#setConfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed))​(int index,  [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setConfirmed](#setConfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed.Builder))​(int index,  [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setCurrentSeqNr](#setCurrentSeqNr(long))​(long value)` | `required int64 currentSeqNr = 1;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setHighestConfirmedSeqNr](#setHighestConfirmedSeqNr(long))​(long value)` | `required int64 highestConfirmedSeqNr = 2;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnconfirmed](#setUnconfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent))​(int index,  [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnconfirmed](#setUnconfirmed(int,akka.cluster.typed.internal.protobuf.ReliableDelivery.MessageSent.Builder))​(int index,  [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasCurrentSeqNr
		
		
		
		```
		public boolean hasCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Specified by:
		`[hasCurrentSeqNr](ReliableDelivery.StateOrBuilder.html#hasCurrentSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the currentSeqNr field is set.
		- #### getCurrentSeqNr
		
		
		
		```
		public long getCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Specified by:
		`[getCurrentSeqNr](ReliableDelivery.StateOrBuilder.html#getCurrentSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The currentSeqNr.
		- #### setCurrentSeqNr
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setCurrentSeqNr​(long value)
		```
		
		`required int64 currentSeqNr = 1;`
		
		Parameters:
		`value` \- The currentSeqNr to set.
		Returns:
		This builder for chaining.
		- #### clearCurrentSeqNr
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasHighestConfirmedSeqNr
		
		
		
		```
		public boolean hasHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Specified by:
		`[hasHighestConfirmedSeqNr](ReliableDelivery.StateOrBuilder.html#hasHighestConfirmedSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the highestConfirmedSeqNr field is set.
		- #### getHighestConfirmedSeqNr
		
		
		
		```
		public long getHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Specified by:
		`[getHighestConfirmedSeqNr](ReliableDelivery.StateOrBuilder.html#getHighestConfirmedSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The highestConfirmedSeqNr.
		- #### setHighestConfirmedSeqNr
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setHighestConfirmedSeqNr​(long value)
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Parameters:
		`value` \- The highestConfirmedSeqNr to set.
		Returns:
		This builder for chaining.
		- #### clearHighestConfirmedSeqNr
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### getConfirmedList
		
		
		
		```
		public java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> getConfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedList](ReliableDelivery.StateOrBuilder.html#getConfirmedList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmedCount
		
		
		
		```
		public int getConfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedCount](ReliableDelivery.StateOrBuilder.html#getConfirmedCount())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmed
		
		
		
		```
		public [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") getConfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmed](ReliableDelivery.StateOrBuilder.html#getConfirmed(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### setConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setConfirmed​(int index,
		                                                   [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### setConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setConfirmed​(int index,
		                                                   [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmed​([ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmed​(int index,
		                                                   [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmed​([ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmed​(int index,
		                                                   [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addAllConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addAllConfirmed​(java.lang.Iterable<? extends [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> values)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### clearConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearConfirmed()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### removeConfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") removeConfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") getConfirmedBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedOrBuilder
		
		
		
		```
		public [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getConfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedOrBuilder](ReliableDelivery.StateOrBuilder.html#getConfirmedOrBuilder(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmedOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getConfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedOrBuilderList](ReliableDelivery.StateOrBuilder.html#getConfirmedOrBuilderList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### addConfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmedBuilder()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### addConfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") addConfirmedBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedBuilderList
		
		
		
		```
		public java.util.List<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")> getConfirmedBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getUnconfirmedList
		
		
		
		```
		public java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> getUnconfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedList](ReliableDelivery.StateOrBuilder.html#getUnconfirmedList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedCount
		
		
		
		```
		public int getUnconfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedCount](ReliableDelivery.StateOrBuilder.html#getUnconfirmedCount())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmed
		
		
		
		```
		public [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") getUnconfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmed](ReliableDelivery.StateOrBuilder.html#getUnconfirmed(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### setUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnconfirmed​(int index,
		                                                     [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### setUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnconfirmed​(int index,
		                                                     [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmed​([ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmed​(int index,
		                                                     [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") value)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmed​([ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmed​(int index,
		                                                     [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") builderForValue)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addAllUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") addAllUnconfirmed​(java.lang.Iterable<? extends [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> values)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### clearUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") clearUnconfirmed()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### removeUnconfirmed
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") removeUnconfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") getUnconfirmedBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedOrBuilder
		
		
		
		```
		public [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getUnconfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedOrBuilder](ReliableDelivery.StateOrBuilder.html#getUnconfirmedOrBuilder(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getUnconfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedOrBuilderList](ReliableDelivery.StateOrBuilder.html#getUnconfirmedOrBuilderList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### addUnconfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmedBuilder()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### addUnconfirmedBuilder
		
		
		
		```
		public [ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf") addUnconfirmedBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedBuilderList
		
		
		
		```
		public java.util.List<[ReliableDelivery.MessageSent.Builder](ReliableDelivery.MessageSent.Builder.html "class in akka.cluster.typed.internal.protobuf")> getUnconfirmedBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.ConfirmedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSentOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.StateOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html)*