---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html
title: ReplicatorMessages.DataEnvelope.PruningEntry.Builder
---

# ReplicatorMessages.DataEnvelope.PruningEntry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.DataEnvelope.PruningEntry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.DataEnvelope.PruningEntry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.DataEnvelope.PruningEntry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllSeen](#addAllSeen(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeen](#addSeen(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address))​(int index,  [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeen](#addSeen(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder))​(int index,  [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeen](#addSeen(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address))​([ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeen](#addSeen(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder))​([ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeenBuilder](#addSeenBuilder())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addSeenBuilder](#addSeenBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearObsoleteTime](#clearObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOwnerAddress](#clearOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearPerformed](#clearPerformed())()` | `required bool performed = 3;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearRemovedAddress](#clearRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearSeen](#clearSeen())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getObsoleteTime](#getObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddress](#getOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddressBuilder](#getOwnerAddressBuilder())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddressOrBuilder](#getOwnerAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `boolean` | `[getPerformed](#getPerformed())()` | `required bool performed = 3;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddress](#getRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddressBuilder](#getRemovedAddressBuilder())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddressOrBuilder](#getRemovedAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")` | `[getSeen](#getSeen(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getSeenBuilder](#getSeenBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<[ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getSeenBuilderList](#getSeenBuilderList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `int` | `[getSeenCount](#getSeenCount())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getSeenList](#getSeenList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getSeenOrBuilder](#getSeenOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getSeenOrBuilderList](#getSeenOrBuilderList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `boolean` | `[hasObsoleteTime](#hasObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `boolean` | `[hasOwnerAddress](#hasOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `boolean` | `[hasPerformed](#hasPerformed())()` | `required bool performed = 3;` |
	| `boolean` | `[hasRemovedAddress](#hasRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry))​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeOwnerAddress](#mergeOwnerAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeRemovedAddress](#mergeRemovedAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeSeen](#removeSeen(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setObsoleteTime](#setObsoleteTime(long))​(long value)` | `optional sint64 obsoleteTime = 5;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOwnerAddress](#setOwnerAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOwnerAddress](#setOwnerAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setPerformed](#setPerformed(boolean))​(boolean value)` | `required bool performed = 3;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRemovedAddress](#setRemovedAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRemovedAddress](#setRemovedAddress(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setSeen](#setSeen(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address))​(int index,  [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setSeen](#setSeen(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder))​(int index,  [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             int index,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasRemovedAddress
		
		
		
		```
		public boolean hasRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[hasRemovedAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasRemovedAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the removedAddress field is set.
		- #### getRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[getRemovedAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getRemovedAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The removedAddress.
		- #### setRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRemovedAddress​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### setRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRemovedAddress​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### mergeRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeRemovedAddress​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### clearRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### getRemovedAddressBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") getRemovedAddressBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### getRemovedAddressOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getRemovedAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[getRemovedAddressOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getRemovedAddressOrBuilder())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasOwnerAddress
		
		
		
		```
		public boolean hasOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[hasOwnerAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasOwnerAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the ownerAddress field is set.
		- #### getOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[getOwnerAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getOwnerAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The ownerAddress.
		- #### setOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOwnerAddress​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### setOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOwnerAddress​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### mergeOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeOwnerAddress​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### clearOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### getOwnerAddressBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") getOwnerAddressBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### getOwnerAddressOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOwnerAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[getOwnerAddressOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getOwnerAddressOrBuilder())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasPerformed
		
		
		
		```
		public boolean hasPerformed()
		```
		
		`required bool performed = 3;`
		
		Specified by:
		`[hasPerformed](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasPerformed())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the performed field is set.
		- #### getPerformed
		
		
		
		```
		public boolean getPerformed()
		```
		
		`required bool performed = 3;`
		
		Specified by:
		`[getPerformed](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getPerformed())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The performed.
		- #### setPerformed
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setPerformed​(boolean value)
		```
		
		`required bool performed = 3;`
		
		Parameters:
		`value` \- The performed to set.
		Returns:
		This builder for chaining.
		- #### clearPerformed
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearPerformed()
		```
		
		`required bool performed = 3;`
		
		Returns:
		This builder for chaining.
		- #### getSeenList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> getSeenList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenList](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenList())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeenCount
		
		
		
		```
		public int getSeenCount()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenCount](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenCount())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeen
		
		
		
		```
		public [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") getSeen​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeen](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeen(int))` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setSeen​(int index,
		                                                                    [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### setSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setSeen​(int index,
		                                                                    [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeen​([ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeen​(int index,
		                                                                    [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeen​([ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeen​(int index,
		                                                                    [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addAllSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllSeen​(java.lang.Iterable<? extends [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### clearSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearSeen()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### removeSeen
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeSeen​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenBuilder
		
		
		
		```
		public [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") getSeenBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenOrBuilder
		
		
		
		```
		public [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getSeenOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenOrBuilder(int))` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeenOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getSeenOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenOrBuilderList](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenOrBuilderList())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addSeenBuilder
		
		
		
		```
		public [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeenBuilder()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### addSeenBuilder
		
		
		
		```
		public [ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg") addSeenBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Address.Builder](ReplicatorMessages.Address.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getSeenBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### hasObsoleteTime
		
		
		
		```
		public boolean hasObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Specified by:
		`[hasObsoleteTime](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasObsoleteTime())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the obsoleteTime field is set.
		- #### getObsoleteTime
		
		
		
		```
		public long getObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Specified by:
		`[getObsoleteTime](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getObsoleteTime())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The obsoleteTime.
		- #### setObsoleteTime
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setObsoleteTime​(long value)
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Parameters:
		`value` \- The obsoleteTime to set.
		Returns:
		This builder for chaining.
		- #### clearObsoleteTime
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html)*