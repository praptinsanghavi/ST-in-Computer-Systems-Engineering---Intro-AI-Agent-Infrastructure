---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Builder.html
title: ReplicatorMessages.DeltaPropagation.Builder
---

# ReplicatorMessages.DeltaPropagation.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.DeltaPropagation.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.DeltaPropagation.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.DeltaPropagation`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry))​(int index,  [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry.Builder))​(int index,  [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry))​([ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry.Builder))​([ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEntries](#clearEntries())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearFromNode](#clearFromNode())()` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearReply](#clearReply())()` | no reply if not set |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `java.util.List<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `java.util.List<[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesList](#getEntriesList())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `java.util.List<? extends [ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getFromNode](#getFromNode())()` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getFromNodeBuilder](#getFromNodeBuilder())()` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getFromNodeOrBuilder](#getFromNodeOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `boolean` | `[getReply](#getReply())()` | no reply if not set |
	| `boolean` | `[hasFromNode](#hasFromNode())()` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `boolean` | `[hasReply](#hasReply())()` | no reply if not set |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation))​([ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFromNode](#mergeFromNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry))​(int index,  [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry.Builder))​(int index,  [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setFromNode](#setFromNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setFromNode](#setFromNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress fromNode = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setReply](#setReply(boolean))​(boolean value)` | no reply if not set |
	| `[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.DeltaPropagation](ReplicatorMessages.DeltaPropagation.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFromNode
		
		
		
		```
		public boolean hasFromNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		
		Specified by:
		`[hasFromNode](ReplicatorMessages.DeltaPropagationOrBuilder.html#hasFromNode())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the fromNode field is set.
		- #### getFromNode
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getFromNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		
		Specified by:
		`[getFromNode](ReplicatorMessages.DeltaPropagationOrBuilder.html#getFromNode())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The fromNode.
		- #### setFromNode
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setFromNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		- #### setFromNode
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setFromNode​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		- #### mergeFromNode
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFromNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		- #### clearFromNode
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearFromNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		- #### getFromNodeBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") getFromNodeBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		- #### getFromNodeOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getFromNodeOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress fromNode = 1;`
		
		Specified by:
		`[getFromNodeOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html#getFromNodeOrBuilder())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesList()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		
		Specified by:
		`[getEntriesList](ReplicatorMessages.DeltaPropagationOrBuilder.html#getEntriesList())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		
		Specified by:
		`[getEntriesCount](ReplicatorMessages.DeltaPropagationOrBuilder.html#getEntriesCount())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") getEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		
		Specified by:
		`[getEntries](ReplicatorMessages.DeltaPropagationOrBuilder.html#getEntries(int))` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                              [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                              [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                              [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                              [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllEntries​(java.lang.Iterable<? extends [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEntries()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEntriesOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getEntriesOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatorMessages.DeltaPropagationOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesBuilderList()
		```
		
		`repeated .akka.cluster.ddata.DeltaPropagation.Entry entries = 2;`
		- #### hasReply
		
		
		
		```
		public boolean hasReply()
		```
		
		
		```
		
		 no reply if not set
		 
		```
		
		`optional bool reply = 3;`
		
		Specified by:
		`[hasReply](ReplicatorMessages.DeltaPropagationOrBuilder.html#hasReply())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the reply field is set.
		- #### getReply
		
		
		
		```
		public boolean getReply()
		```
		
		
		```
		
		 no reply if not set
		 
		```
		
		`optional bool reply = 3;`
		
		Specified by:
		`[getReply](ReplicatorMessages.DeltaPropagationOrBuilder.html#getReply())` in interface `[ReplicatorMessages.DeltaPropagationOrBuilder](ReplicatorMessages.DeltaPropagationOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The reply.
		- #### setReply
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setReply​(boolean value)
		```
		
		
		```
		
		 no reply if not set
		 
		```
		
		`optional bool reply = 3;`
		
		Parameters:
		`value` \- The reply to set.
		Returns:
		This builder for chaining.
		- #### clearReply
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearReply()
		```
		
		
		```
		
		 no reply if not set
		 
		```
		
		`optional bool reply = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Builder](ReplicatorMessages.DeltaPropagation.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagationOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Builder.html)*