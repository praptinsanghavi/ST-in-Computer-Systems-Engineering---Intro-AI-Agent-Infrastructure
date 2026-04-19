---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:58:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html
title: ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder
---

# ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORSetDeltaGroup.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOperation](#clearOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearUnderlying](#clearUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[getOperation](#getOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getUnderlying](#getUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getUnderlyingBuilder](#getUnderlyingBuilder())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getUnderlyingOrBuilder](#getUnderlyingOrBuilder())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `boolean` | `[hasOperation](#hasOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `boolean` | `[hasUnderlying](#hasUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry))​([ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnderlying](#mergeUnderlying(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOperation](#setOperation(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaOp))​([ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnderlying](#setUnderlying(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnderlying](#setUnderlying(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet.Builder))​([ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             int index,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasOperation
		
		
		
		```
		public boolean hasOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[hasOperation](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#hasOperation())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the operation field is set.
		- #### getOperation
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") getOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[getOperation](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getOperation())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The operation.
		- #### setOperation
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOperation​([ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Parameters:
		`value` \- The operation to set.
		Returns:
		This builder for chaining.
		- #### clearOperation
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasUnderlying
		
		
		
		```
		public boolean hasUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[hasUnderlying](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#hasUnderlying())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the underlying field is set.
		- #### getUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") getUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlying](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlying())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The underlying.
		- #### setUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnderlying​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		- #### setUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnderlying​([ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		- #### mergeUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnderlying​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		- #### clearUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		- #### getUnderlyingBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") getUnderlyingBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		- #### getUnderlyingOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getUnderlyingOrBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlyingOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlyingOrBuilder())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html)*