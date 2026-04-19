---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.Builder.html
title: ReplicatedDataMessages.PNCounter.Builder
---

# ReplicatedDataMessages.PNCounter.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.PNCounter.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.PNCounter.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.PNCounter`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearDecrements](#clearDecrements())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearIncrements](#clearIncrements())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDecrements](#getDecrements())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDecrementsBuilder](#getDecrementsBuilder())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getDecrementsOrBuilder](#getDecrementsOrBuilder())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getIncrements](#getIncrements())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getIncrementsBuilder](#getIncrementsBuilder())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getIncrementsOrBuilder](#getIncrementsOrBuilder())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `boolean` | `[hasDecrements](#hasDecrements())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `boolean` | `[hasIncrements](#hasIncrements())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeDecrements](#mergeDecrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter))​([ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeIncrements](#mergeIncrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setDecrements](#setDecrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setDecrements](#setDecrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Builder))​([ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setIncrements](#setIncrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter))​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setIncrements](#setIncrements(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Builder))​([ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 int index,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasIncrements
		
		
		
		```
		public boolean hasIncrements()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[hasIncrements](ReplicatedDataMessages.PNCounterOrBuilder.html#hasIncrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the increments field is set.
		- #### getIncrements
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") getIncrements()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[getIncrements](ReplicatedDataMessages.PNCounterOrBuilder.html#getIncrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The increments.
		- #### setIncrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setIncrements​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		- #### setIncrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setIncrements​([ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		- #### mergeIncrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeIncrements​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		- #### clearIncrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearIncrements()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		- #### getIncrementsBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") getIncrementsBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		- #### getIncrementsOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getIncrementsOrBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[getIncrementsOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html#getIncrementsOrBuilder())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasDecrements
		
		
		
		```
		public boolean hasDecrements()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[hasDecrements](ReplicatedDataMessages.PNCounterOrBuilder.html#hasDecrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the decrements field is set.
		- #### getDecrements
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") getDecrements()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[getDecrements](ReplicatedDataMessages.PNCounterOrBuilder.html#getDecrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The decrements.
		- #### setDecrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setDecrements​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		- #### setDecrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setDecrements​([ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		- #### mergeDecrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeDecrements​([ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		- #### clearDecrements
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearDecrements()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		- #### getDecrementsBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Builder](ReplicatedDataMessages.GCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") getDecrementsBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		- #### getDecrementsOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getDecrementsOrBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[getDecrementsOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html#getDecrementsOrBuilder())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.Builder.html)*