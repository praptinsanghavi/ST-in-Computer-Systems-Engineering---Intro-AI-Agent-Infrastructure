---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPool.Builder.html
title: WireFormats.ScatterGatherPool.Builder
---

# WireFormats.ScatterGatherPool.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.ScatterGatherPool.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.ScatterGatherPool.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote")

---

```
public static final class WireFormats.ScatterGatherPool.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>
implements [WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")
```

Protobuf type `ScatterGatherPool`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clearGeneric](#clearGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clearWithin](#clearWithin())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote")` | `[getGeneric](#getGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote")` | `[getGenericBuilder](#getGenericBuilder())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote")` | `[getGenericOrBuilder](#getGenericOrBuilder())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getWithin](#getWithin())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[getWithinBuilder](#getWithinBuilder())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")` | `[getWithinOrBuilder](#getWithinOrBuilder())()` | `required .FiniteDuration within = 2;` |
	| `boolean` | `[hasGeneric](#hasGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `boolean` | `[hasWithin](#hasWithin())()` | `required .FiniteDuration within = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.ScatterGatherPool))​([WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") other)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeGeneric](#mergeGeneric(akka.remote.WireFormats.GenericRoutingPool))​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[mergeWithin](#mergeWithin(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setGeneric](#setGeneric(akka.remote.WireFormats.GenericRoutingPool))​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setGeneric](#setGeneric(akka.remote.WireFormats.GenericRoutingPool.Builder))​([WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") builderForValue)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setWithin](#setWithin(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")` | `[setWithin](#setWithin(akka.remote.WireFormats.FiniteDuration.Builder))​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)` | `required .FiniteDuration within = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeFrom​([WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasGeneric
		
		
		
		```
		public boolean hasGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[hasGeneric](WireFormats.ScatterGatherPoolOrBuilder.html#hasGeneric())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the generic field is set.
		- #### getGeneric
		
		
		
		```
		public [WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") getGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[getGeneric](WireFormats.ScatterGatherPoolOrBuilder.html#getGeneric())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The generic.
		- #### setGeneric
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setGeneric​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### setGeneric
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setGeneric​([WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### mergeGeneric
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeGeneric​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### clearGeneric
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clearGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### getGenericBuilder
		
		
		
		```
		public [WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") getGenericBuilder()
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### getGenericOrBuilder
		
		
		
		```
		public [WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote") getGenericOrBuilder()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[getGenericOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html#getGenericOrBuilder())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		- #### hasWithin
		
		
		
		```
		public boolean hasWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[hasWithin](WireFormats.ScatterGatherPoolOrBuilder.html#hasWithin())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the within field is set.
		- #### getWithin
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[getWithin](WireFormats.ScatterGatherPoolOrBuilder.html#getWithin())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The within.
		- #### setWithin
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setWithin​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration within = 2;`
		- #### setWithin
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setWithin​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .FiniteDuration within = 2;`
		- #### mergeWithin
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeWithin​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration within = 2;`
		- #### clearWithin
		
		
		
		```
		public [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") clearWithin()
		```
		
		`required .FiniteDuration within = 2;`
		- #### getWithinBuilder
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") getWithinBuilder()
		```
		
		`required .FiniteDuration within = 2;`
		- #### getWithinOrBuilder
		
		
		
		```
		public [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote") getWithinOrBuilder()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[getWithinOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html#getWithinOrBuilder())` in interface `[WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.FiniteDuration.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.FiniteDuration.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.FiniteDurationOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.GenericRoutingPool.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.GenericRoutingPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.GenericRoutingPoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPool.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPool.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ScatterGatherPool.Builder.html)*