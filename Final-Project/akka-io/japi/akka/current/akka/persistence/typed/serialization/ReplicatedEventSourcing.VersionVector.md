---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
title: ReplicatedEventSourcing.VersionVector.Builder
---

# ReplicatedEventSourcing.VersionVector.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.VersionVector.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.VersionVector.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `VersionVector`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> values)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntries](#addEntries(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry))​(int index,  [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntries](#addEntries(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry.Builder))​(int index,  [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntries](#addEntries(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry))​([ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntries](#addEntries(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry.Builder))​([ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[clearEntries](#clearEntries())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .VersionVector.Entry entries = 1;` |
	| `java.util.List<[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `java.util.List<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")>` | `[getEntriesList](#getEntriesList())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .VersionVector.Entry entries = 1;` |
	| `java.util.List<? extends [ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .VersionVector.Entry entries = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[setEntries](#setEntries(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry))​(int index,  [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[setEntries](#setEntries(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Entry.Builder))​(int index,  [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector.Entry entries = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      int index,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> getEntriesList()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		
		Specified by:
		`[getEntriesList](ReplicatedEventSourcing.VersionVectorOrBuilder.html#getEntriesList())` in interface `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		
		Specified by:
		`[getEntriesCount](ReplicatedEventSourcing.VersionVectorOrBuilder.html#getEntriesCount())` in interface `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") getEntries​(int index)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		
		Specified by:
		`[getEntries](ReplicatedEventSourcing.VersionVectorOrBuilder.html#getEntries(int))` in interface `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### setEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") setEntries​(int index,
		                                                                [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### setEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") setEntries​(int index,
		                                                                [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addEntries​([ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addEntries​(int index,
		                                                                [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addEntries​([ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addEntries​(int index,
		                                                                [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addAllEntries​(java.lang.Iterable<? extends [ReplicatedEventSourcing.VersionVector.Entry](ReplicatedEventSourcing.VersionVector.Entry.html "class in akka.persistence.typed.serialization")> values)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") clearEntries()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") removeEntries​(int index)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") getEntriesBuilder​(int index)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization") getEntriesOrBuilder​(int index)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedEventSourcing.VersionVector.EntryOrBuilder](ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")> getEntriesOrBuilderList()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatedEventSourcing.VersionVectorOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") addEntriesBuilder()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization") addEntriesBuilder​(int index)
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.VersionVector.Entry.Builder](ReplicatedEventSourcing.VersionVector.Entry.Builder.html "class in akka.persistence.typed.serialization")> getEntriesBuilderList()
		```
		
		`repeated .VersionVector.Entry entries = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Entry.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html)*