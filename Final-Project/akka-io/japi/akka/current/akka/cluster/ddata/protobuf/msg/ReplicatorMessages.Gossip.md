---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:58:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Builder.html
title: ReplicatorMessages.Gossip.Builder
---

# ReplicatorMessages.Gossip.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Gossip.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Gossip.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Gossip`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllEntries](#addAllEntries(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry))​(int index,  [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.Builder))​(int index,  [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry))​([ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntries](#addEntries(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.Builder))​([ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addEntriesBuilder](#addEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEntries](#clearEntries())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearFromSystemUid](#clearFromSystemUid())()` | `optional sfixed64 fromSystemUid = 4;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearSendBack](#clearSendBack())()` | `required bool sendBack = 1;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearToSystemUid](#clearToSystemUid())()` | `optional sfixed64 toSystemUid = 3;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntries](#getEntries(int))​(int index)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEntriesBuilder](#getEntriesBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `java.util.List<[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesBuilderList](#getEntriesBuilderList())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `int` | `[getEntriesCount](#getEntriesCount())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `java.util.List<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesList](#getEntriesList())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEntriesOrBuilder](#getEntriesOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `java.util.List<? extends [ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getEntriesOrBuilderList](#getEntriesOrBuilderList())()` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `long` | `[getFromSystemUid](#getFromSystemUid())()` | `optional sfixed64 fromSystemUid = 4;` |
	| `boolean` | `[getSendBack](#getSendBack())()` | `required bool sendBack = 1;` |
	| `long` | `[getToSystemUid](#getToSystemUid())()` | `optional sfixed64 toSystemUid = 3;` |
	| `boolean` | `[hasFromSystemUid](#hasFromSystemUid())()` | `optional sfixed64 fromSystemUid = 4;` |
	| `boolean` | `[hasSendBack](#hasSendBack())()` | `required bool sendBack = 1;` |
	| `boolean` | `[hasToSystemUid](#hasToSystemUid())()` | `optional sfixed64 toSystemUid = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip))​([ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeEntries](#removeEntries(int))​(int index)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry))​(int index,  [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEntries](#setEntries(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.Builder))​(int index,  [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.Gossip.Entry entries = 2;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setFromSystemUid](#setFromSystemUid(long))​(long value)` | `optional sfixed64 fromSystemUid = 4;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setSendBack](#setSendBack(boolean))​(boolean value)` | `required bool sendBack = 1;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setToSystemUid](#setToSystemUid(long))​(long value)` | `optional sfixed64 toSystemUid = 3;` |
	| `[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSendBack
		
		
		
		```
		public boolean hasSendBack()
		```
		
		`required bool sendBack = 1;`
		
		Specified by:
		`[hasSendBack](ReplicatorMessages.GossipOrBuilder.html#hasSendBack())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the sendBack field is set.
		- #### getSendBack
		
		
		
		```
		public boolean getSendBack()
		```
		
		`required bool sendBack = 1;`
		
		Specified by:
		`[getSendBack](ReplicatorMessages.GossipOrBuilder.html#getSendBack())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The sendBack.
		- #### setSendBack
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setSendBack​(boolean value)
		```
		
		`required bool sendBack = 1;`
		
		Parameters:
		`value` \- The sendBack to set.
		Returns:
		This builder for chaining.
		- #### clearSendBack
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearSendBack()
		```
		
		`required bool sendBack = 1;`
		
		Returns:
		This builder for chaining.
		- #### getEntriesList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesList()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		
		Specified by:
		`[getEntriesList](ReplicatorMessages.GossipOrBuilder.html#getEntriesList())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesCount
		
		
		
		```
		public int getEntriesCount()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		
		Specified by:
		`[getEntriesCount](ReplicatorMessages.GossipOrBuilder.html#getEntriesCount())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") getEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		
		Specified by:
		`[getEntries](ReplicatorMessages.GossipOrBuilder.html#getEntries(int))` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                    [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### setEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEntries​(int index,
		                                                    [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                    [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​([ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntries​(int index,
		                                                    [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addAllEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllEntries​(java.lang.Iterable<? extends [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### clearEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEntries()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### removeEntries
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeEntries​(int index)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### getEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### getEntriesOrBuilder
		
		
		
		```
		public [ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEntriesOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilder](ReplicatorMessages.GossipOrBuilder.html#getEntriesOrBuilder(int))` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getEntriesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getEntriesOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		
		Specified by:
		`[getEntriesOrBuilderList](ReplicatorMessages.GossipOrBuilder.html#getEntriesOrBuilderList())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### addEntriesBuilder
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addEntriesBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### getEntriesBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getEntriesBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Gossip.Entry entries = 2;`
		- #### hasToSystemUid
		
		
		
		```
		public boolean hasToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 3;`
		
		Specified by:
		`[hasToSystemUid](ReplicatorMessages.GossipOrBuilder.html#hasToSystemUid())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the toSystemUid field is set.
		- #### getToSystemUid
		
		
		
		```
		public long getToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 3;`
		
		Specified by:
		`[getToSystemUid](ReplicatorMessages.GossipOrBuilder.html#getToSystemUid())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The toSystemUid.
		- #### setToSystemUid
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setToSystemUid​(long value)
		```
		
		`optional sfixed64 toSystemUid = 3;`
		
		Parameters:
		`value` \- The toSystemUid to set.
		Returns:
		This builder for chaining.
		- #### clearToSystemUid
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearToSystemUid()
		```
		
		`optional sfixed64 toSystemUid = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasFromSystemUid
		
		
		
		```
		public boolean hasFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 4;`
		
		Specified by:
		`[hasFromSystemUid](ReplicatorMessages.GossipOrBuilder.html#hasFromSystemUid())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the fromSystemUid field is set.
		- #### getFromSystemUid
		
		
		
		```
		public long getFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 4;`
		
		Specified by:
		`[getFromSystemUid](ReplicatorMessages.GossipOrBuilder.html#getFromSystemUid())` in interface `[ReplicatorMessages.GossipOrBuilder](ReplicatorMessages.GossipOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The fromSystemUid.
		- #### setFromSystemUid
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setFromSystemUid​(long value)
		```
		
		`optional sfixed64 fromSystemUid = 4;`
		
		Parameters:
		`value` \- The fromSystemUid to set.
		Returns:
		This builder for chaining.
		- #### clearFromSystemUid
		
		
		
		```
		public [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearFromSystemUid()
		```
		
		`optional sfixed64 fromSystemUid = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Gossip.Builder](ReplicatorMessages.Gossip.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.GossipOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Builder.html)*