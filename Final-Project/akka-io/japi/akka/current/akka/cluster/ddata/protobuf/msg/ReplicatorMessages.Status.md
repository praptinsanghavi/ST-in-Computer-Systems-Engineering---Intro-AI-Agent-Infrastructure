---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Builder.html
title: ReplicatorMessages.Status.Builder
---

# ReplicatorMessages.Status.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Status.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Status.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Status`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry))​(int index,  [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry.Builder))​(int index,  [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry))​([ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry.Builder))​([ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearChunk](#clearChunk())()` | `required uint32 chunk = 1;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEntries](#clearEntries())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearFromSystemUid](#clearFromSystemUid())()` | `optional sfixed64 fromSystemUid = 5;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearToSystemUid](#clearToSystemUid())()` | `optional sfixed64 toSystemUid = 4;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearTotChunks](#clearTotChunks())()` | `required uint32 totChunks = 2;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getChunk](#getChunk())()` | `required uint32 chunk = 1;` |
	| `[ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `java.util.List<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `java.util.List<[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesList](#getEntriesList())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `java.util.List<? extends [ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `long` | `[getFromSystemUid](#getFromSystemUid())()` | `optional sfixed64 fromSystemUid = 5;` |
	| `long` | `[getToSystemUid](#getToSystemUid())()` | `optional sfixed64 toSystemUid = 4;` |
	| `int` | `[getTotChunks](#getTotChunks())()` | `required uint32 totChunks = 2;` |
	| `boolean` | `[hasChunk](#hasChunk())()` | `required uint32 chunk = 1;` |
	| `boolean` | `[hasFromSystemUid](#hasFromSystemUid())()` | `optional sfixed64 fromSystemUid = 5;` |
	| `boolean` | `[hasToSystemUid](#hasToSystemUid())()` | `optional sfixed64 toSystemUid = 4;` |
	| `boolean` | `[hasTotChunks](#hasTotChunks())()` | `required uint32 totChunks = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status))​([ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setChunk](#setChunk(int))​(int value)` | `required uint32 chunk = 1;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry))​(int index,  [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry.Builder))​(int index,  [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Status.Entry entries = 3;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setFromSystemUid](#setFromSystemUid(long))​(long value)` | `optional sfixed64 fromSystemUid = 5;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setToSystemUid](#setToSystemUid(long))​(long value)` | `optional sfixed64 toSystemUid = 4;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setTotChunks](#setTotChunks(int))​(int value)` | `required uint32 totChunks = 2;` |
	| `[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.Status](ReplicatorMessages.Status.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasChunk
		
		
		
		```
		public boolean hasChunk()
		```
		
		`required uint32 chunk = 1;`
		
		Specified by:
		`[hasChunk](ReplicatorMessages.StatusOrBuilder.html#hasChunk())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the chunk field is set.
		- #### getChunk
		
		
		
		```
		public int getChunk()
		```
		
		`required uint32 chunk = 1;`
		
		Specified by:
		`[getChunk](ReplicatorMessages.StatusOrBuilder.html#getChunk())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The chunk.
		- #### setChunk
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setChunk​(int value)
		```
		
		`required uint32 chunk = 1;`
		
		Parameters:
		`value` \- The chunk to set.
		Returns:
		This builder for chaining.
		- #### clearChunk
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearChunk()
		```
		
		`required uint32 chunk = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasTotChunks
		
		
		
		```
		public boolean hasTotChunks()
		```
		
		`required uint32 totChunks = 2;`
		
		Specified by:
		`[hasTotChunks](ReplicatorMessages.StatusOrBuilder.html#hasTotChunks())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the totChunks field is set.
		- #### getTotChunks
		
		
		
		```
		public int getTotChunks()
		```
		
		`required uint32 totChunks = 2;`
		
		Specified by:
		`[getTotChunks](ReplicatorMessages.StatusOrBuilder.html#getTotChunks())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The totChunks.
		- #### setTotChunks
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setTotChunks​(int value)
		```
		
		`required uint32 totChunks = 2;`
		
		Parameters:
		`value` \- The totChunks to set.
		Returns:
		This builder for chaining.
		- #### clearTotChunks
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearTotChunks()
		```
		
		`required uint32 totChunks = 2;`
		
		Returns:
		This builder for chaining.
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesList()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		
		Specified by:
		`[getEntriesList](ReplicatorMessages.StatusOrBuilder.html#getEntriesList())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		
		Specified by:
		`[getEntriesCount](ReplicatorMessages.StatusOrBuilder.html#getEntriesCount())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") getEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		
		Specified by:
		`[getEntries](ReplicatorMessages.StatusOrBuilder.html#getEntries(int))` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                    [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                    [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                    [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                    [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllEntries​(java.lang.Iterable<? extends [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEntries()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEntriesOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatorMessages.StatusOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getEntriesOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatorMessages.StatusOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Status.Entry entries = 3;`
		- #### hasToSystemUid
		
		
		
		```
		public boolean hasToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 4;`
		
		Specified by:
		`[hasToSystemUid](ReplicatorMessages.StatusOrBuilder.html#hasToSystemUid())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the toSystemUid field is set.
		- #### getToSystemUid
		
		
		
		```
		public long getToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 4;`
		
		Specified by:
		`[getToSystemUid](ReplicatorMessages.StatusOrBuilder.html#getToSystemUid())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The toSystemUid.
		- #### setToSystemUid
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setToSystemUid​(long value)
		```
		
		`optional sfixed64 toSystemUid = 4;`
		
		Parameters:
		`value` \- The toSystemUid to set.
		Returns:
		This builder for chaining.
		- #### clearToSystemUid
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasFromSystemUid
		
		
		
		```
		public boolean hasFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 5;`
		
		Specified by:
		`[hasFromSystemUid](ReplicatorMessages.StatusOrBuilder.html#hasFromSystemUid())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the fromSystemUid field is set.
		- #### getFromSystemUid
		
		
		
		```
		public long getFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 5;`
		
		Specified by:
		`[getFromSystemUid](ReplicatorMessages.StatusOrBuilder.html#getFromSystemUid())` in interface `[ReplicatorMessages.StatusOrBuilder](ReplicatorMessages.StatusOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The fromSystemUid.
		- #### setFromSystemUid
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setFromSystemUid​(long value)
		```
		
		`optional sfixed64 fromSystemUid = 5;`
		
		Parameters:
		`value` \- The fromSystemUid to set.
		Returns:
		This builder for chaining.
		- #### clearFromSystemUid
		
		
		
		```
		public [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Builder](ReplicatorMessages.Status.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StatusOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Builder.html)*