---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Builder.html
title: ReplicatedDataMessages.ORMap.Builder
---

# ReplicatedDataMessages.ORMap.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORMap.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORMap.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORMap`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry))​(int index,  [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.Builder))​(int index,  [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry))​([ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.Builder))​([ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEntries](#clearEntries())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearKeys](#clearKeys())()` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `java.util.List<[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `java.util.List<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesList](#getEntriesList())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `java.util.List<? extends [ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKeys](#getKeys())()` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKeysBuilder](#getKeysBuilder())()` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getKeysOrBuilder](#getKeysOrBuilder())()` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `boolean` | `[hasKeys](#hasKeys())()` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap))​([ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeKeys](#mergeKeys(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry))​(int index,  [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.Builder))​(int index,  [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.ORMap.Entry entries = 2;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKeys](#setKeys(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKeys](#setKeys(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet.Builder))​([ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.ORSet keys = 1;` |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKeys
		
		
		
		```
		public boolean hasKeys()
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		
		Specified by:
		`[hasKeys](ReplicatedDataMessages.ORMapOrBuilder.html#hasKeys())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the keys field is set.
		- #### getKeys
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") getKeys()
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		
		Specified by:
		`[getKeys](ReplicatedDataMessages.ORMapOrBuilder.html#getKeys())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The keys.
		- #### setKeys
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKeys​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		- #### setKeys
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKeys​([ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		- #### mergeKeys
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeKeys​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		- #### clearKeys
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearKeys()
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		- #### getKeysBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") getKeysBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		- #### getKeysOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getKeysOrBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet keys = 1;`
		
		Specified by:
		`[getKeysOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html#getKeysOrBuilder())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesList()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		
		Specified by:
		`[getEntriesList](ReplicatedDataMessages.ORMapOrBuilder.html#getEntriesList())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		
		Specified by:
		`[getEntriesCount](ReplicatedDataMessages.ORMapOrBuilder.html#getEntriesCount())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") getEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		
		Specified by:
		`[getEntries](ReplicatedDataMessages.ORMapOrBuilder.html#getEntries(int))` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                       [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### setEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                       [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                       [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                       [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllEntries​(java.lang.Iterable<? extends [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEntries()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEntriesOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getEntriesOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatedDataMessages.ORMapOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatedDataMessages.ORMapOrBuilder](ReplicatedDataMessages.ORMapOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesBuilderList()
		```
		
		`repeated .akka.cluster.ddata.ORMap.Entry entries = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMap.Builder](ReplicatedDataMessages.ORMap.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Builder.html)*