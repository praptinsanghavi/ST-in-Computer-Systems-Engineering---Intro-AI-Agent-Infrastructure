---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Builder.html
title: ReplicatedDataMessages.GCounter.Builder
---

# ReplicatedDataMessages.GCounter.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.GCounter.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.GCounter.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.GCounter`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry))​(int index,  [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry.Builder))​(int index,  [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry))​([ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry.Builder))​([ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEntries](#clearEntries())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `java.util.List<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `java.util.List<[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesList](#getEntriesList())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `java.util.List<? extends [ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry))​(int index,  [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry.Builder))​(int index,  [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.GCounter.Entry entries = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesList()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		
		Specified by:
		`[getEntriesList](ReplicatedDataMessages.GCounterOrBuilder.html#getEntriesList())` in interface `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		
		Specified by:
		`[getEntriesCount](ReplicatedDataMessages.GCounterOrBuilder.html#getEntriesCount())` in interface `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") getEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		
		Specified by:
		`[getEntries](ReplicatedDataMessages.GCounterOrBuilder.html#getEntries(int))` in interface `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                          [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### setEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                          [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                          [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                          [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllEntries​(java.lang.Iterable<? extends [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEntries()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEntriesOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getEntriesOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatedDataMessages.GCounterOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesBuilderList()
		```
		
		`repeated .akka.cluster.ddata.GCounter.Entry entries = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Builder.html)*