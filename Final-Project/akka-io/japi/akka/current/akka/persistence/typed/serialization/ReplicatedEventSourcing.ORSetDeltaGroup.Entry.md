---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html
title: ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder
---

# ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ORSetDeltaGroup.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOperation](#clearOperation())()` | `required .ORSetDeltaOp operation = 1;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clearUnderlying](#clearUnderlying())()` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[getOperation](#getOperation())()` | `required .ORSetDeltaOp operation = 1;` |
	| `[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")` | `[getUnderlying](#getUnderlying())()` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[getUnderlyingBuilder](#getUnderlyingBuilder())()` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getUnderlyingOrBuilder](#getUnderlyingOrBuilder())()` | `required .ORSet underlying = 2;` |
	| `boolean` | `[hasOperation](#hasOperation())()` | `required .ORSetDeltaOp operation = 1;` |
	| `boolean` | `[hasUnderlying](#hasUnderlying())()` | `required .ORSet underlying = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaGroup.Entry))​([ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnderlying](#mergeUnderlying(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet))​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") value)` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setOperation](#setOperation(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaOp))​([ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") value)` | `required .ORSetDeltaOp operation = 1;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnderlying](#setUnderlying(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet))​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") value)` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnderlying](#setUnderlying(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet.Builder))​([ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                              int index,
		                                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasOperation
		
		
		
		```
		public boolean hasOperation()
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[hasOperation](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html#hasOperation())` in interface `[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the operation field is set.
		- #### getOperation
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") getOperation()
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[getOperation](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html#getOperation())` in interface `[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The operation.
		- #### setOperation
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setOperation​([ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") value)
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Parameters:
		`value` \- The operation to set.
		Returns:
		This builder for chaining.
		- #### clearOperation
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clearOperation()
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasUnderlying
		
		
		
		```
		public boolean hasUnderlying()
		```
		
		`required .ORSet underlying = 2;`
		
		Specified by:
		`[hasUnderlying](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html#hasUnderlying())` in interface `[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the underlying field is set.
		- #### getUnderlying
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") getUnderlying()
		```
		
		`required .ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlying](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlying())` in interface `[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The underlying.
		- #### setUnderlying
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setUnderlying​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .ORSet underlying = 2;`
		- #### setUnderlying
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setUnderlying​([ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`required .ORSet underlying = 2;`
		- #### mergeUnderlying
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") mergeUnderlying​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .ORSet underlying = 2;`
		- #### clearUnderlying
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") clearUnderlying()
		```
		
		`required .ORSet underlying = 2;`
		- #### getUnderlyingBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") getUnderlyingBuilder()
		```
		
		`required .ORSet underlying = 2;`
		- #### getUnderlyingOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization") getUnderlyingOrBuilder()
		```
		
		`required .ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlyingOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlyingOrBuilder())` in interface `[ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder](ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html)*