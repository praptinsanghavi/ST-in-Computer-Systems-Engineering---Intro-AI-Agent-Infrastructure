---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.Builder.html
title: ReplicatorMessages.DurableDataEnvelope.Builder
---

# ReplicatorMessages.DurableDataEnvelope.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.DurableDataEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DurableDataEnvelope.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.DurableDataEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.DurableDataEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllPruning](#addAllPruning(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruning](#addPruning(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry))​(int index,  [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruning](#addPruning(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.Builder))​(int index,  [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruning](#addPruning(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry))​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruning](#addPruning(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.Builder))​([ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruningBuilder](#addPruningBuilder())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addPruningBuilder](#addPruningBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearData](#clearData())()` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearPruning](#clearPruning())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getData](#getData())()` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDataBuilder](#getDataBuilder())()` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getDataOrBuilder](#getDataOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getPruning](#getPruning(int))​(int index)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getPruningBuilder](#getPruningBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getPruningBuilderList](#getPruningBuilderList())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `int` | `[getPruningCount](#getPruningCount())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getPruningList](#getPruningList())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getPruningOrBuilder](#getPruningOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `java.util.List<? extends [ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getPruningOrBuilderList](#getPruningOrBuilderList())()` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `boolean` | `[hasData](#hasData())()` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeData](#mergeData(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DurableDataEnvelope))​([ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removePruning](#removePruning(int))​(int index)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setData](#setData(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setData](#setData(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.OtherMessage data = 1;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setPruning](#setPruning(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry))​(int index,  [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setPruning](#setPruning(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.Builder))​(int index,  [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;` |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.DurableDataEnvelope](ReplicatorMessages.DurableDataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasData
		
		
		
		```
		public boolean hasData()
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		
		Specified by:
		`[hasData](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#hasData())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the data field is set.
		- #### getData
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getData()
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		
		Specified by:
		`[getData](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getData())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The data.
		- #### setData
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setData​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		- #### setData
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setData​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		- #### mergeData
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeData​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		- #### clearData
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearData()
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		- #### getDataBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getDataBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		- #### getDataOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getDataOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage data = 1;`
		
		Specified by:
		`[getDataOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getDataOrBuilder())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getPruningList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> getPruningList()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		
		Specified by:
		`[getPruningList](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getPruningList())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getPruningCount
		
		
		
		```
		public int getPruningCount()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		
		Specified by:
		`[getPruningCount](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getPruningCount())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getPruning
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") getPruning​(int index)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		
		Specified by:
		`[getPruning](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getPruning(int))` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setPruning​(int index,
		                                                                 [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### setPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setPruning​(int index,
		                                                                 [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruning​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruning​(int index,
		                                                                 [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruning​([ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruning​(int index,
		                                                                 [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addAllPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllPruning​(java.lang.Iterable<? extends [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### clearPruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearPruning()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### removePruning
		
		
		
		```
		public [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") removePruning​(int index)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### getPruningBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") getPruningBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### getPruningOrBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getPruningOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		
		Specified by:
		`[getPruningOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getPruningOrBuilder(int))` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getPruningOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getPruningOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		
		Specified by:
		`[getPruningOrBuilderList](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html#getPruningOrBuilderList())` in interface `[ReplicatorMessages.DurableDataEnvelopeOrBuilder](ReplicatorMessages.DurableDataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addPruningBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruningBuilder()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### addPruningBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addPruningBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### getPruningBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getPruningBuilderList()
		```
		
		`repeated .akka.cluster.ddata.DataEnvelope.PruningEntry pruning = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DurableDataEnvelope.Builder](ReplicatorMessages.DurableDataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DurableDataEnvelope.Builder.html)*