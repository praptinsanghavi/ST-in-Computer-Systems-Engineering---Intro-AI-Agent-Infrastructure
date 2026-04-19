---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPool.Builder.html
title: WireFormats.TailChoppingPool.Builder
---

# WireFormats.TailChoppingPool.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.TailChoppingPool.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.TailChoppingPool.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")

---

```
public static final class WireFormats.TailChoppingPool.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>
implements [WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")
```

Protobuf type `TailChoppingPool`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clearGeneric](#clearGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clearInterval](#clearInterval())()` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clearWithin](#clearWithin())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote")` | `[getGeneric](#getGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote")` | `[getGenericBuilder](#getGenericBuilder())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote")` | `[getGenericOrBuilder](#getGenericOrBuilder())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getInterval](#getInterval())()` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[getIntervalBuilder](#getIntervalBuilder())()` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")` | `[getIntervalOrBuilder](#getIntervalOrBuilder())()` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getWithin](#getWithin())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[getWithinBuilder](#getWithinBuilder())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")` | `[getWithinOrBuilder](#getWithinOrBuilder())()` | `required .FiniteDuration within = 2;` |
	| `boolean` | `[hasGeneric](#hasGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `boolean` | `[hasInterval](#hasInterval())()` | `required .FiniteDuration interval = 3;` |
	| `boolean` | `[hasWithin](#hasWithin())()` | `required .FiniteDuration within = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.TailChoppingPool))​([WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") other)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeGeneric](#mergeGeneric(akka.remote.WireFormats.GenericRoutingPool))​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeInterval](#mergeInterval(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[mergeWithin](#mergeWithin(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setGeneric](#setGeneric(akka.remote.WireFormats.GenericRoutingPool))​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setGeneric](#setGeneric(akka.remote.WireFormats.GenericRoutingPool.Builder))​([WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") builderForValue)` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setInterval](#setInterval(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setInterval](#setInterval(akka.remote.WireFormats.FiniteDuration.Builder))​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setWithin](#setWithin(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[setWithin](#setWithin(akka.remote.WireFormats.FiniteDuration.Builder))​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)` | `required .FiniteDuration within = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeFrom​([WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasGeneric
		
		
		
		```
		public boolean hasGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[hasGeneric](WireFormats.TailChoppingPoolOrBuilder.html#hasGeneric())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the generic field is set.
		- #### getGeneric
		
		
		
		```
		public [WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") getGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[getGeneric](WireFormats.TailChoppingPoolOrBuilder.html#getGeneric())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The generic.
		- #### setGeneric
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setGeneric​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### setGeneric
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setGeneric​([WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### mergeGeneric
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeGeneric​([WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") value)
		```
		
		`required .GenericRoutingPool generic = 1;`
		- #### clearGeneric
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clearGeneric()
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
		`[getGenericOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getGenericOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		- #### hasWithin
		
		
		
		```
		public boolean hasWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[hasWithin](WireFormats.TailChoppingPoolOrBuilder.html#hasWithin())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the within field is set.
		- #### getWithin
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[getWithin](WireFormats.TailChoppingPoolOrBuilder.html#getWithin())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The within.
		- #### setWithin
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setWithin​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration within = 2;`
		- #### setWithin
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setWithin​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .FiniteDuration within = 2;`
		- #### mergeWithin
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeWithin​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration within = 2;`
		- #### clearWithin
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clearWithin()
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
		`[getWithinOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getWithinOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		- #### hasInterval
		
		
		
		```
		public boolean hasInterval()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[hasInterval](WireFormats.TailChoppingPoolOrBuilder.html#hasInterval())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the interval field is set.
		- #### getInterval
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getInterval()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[getInterval](WireFormats.TailChoppingPoolOrBuilder.html#getInterval())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The interval.
		- #### setInterval
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setInterval​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration interval = 3;`
		- #### setInterval
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setInterval​([WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .FiniteDuration interval = 3;`
		- #### mergeInterval
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeInterval​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") value)
		```
		
		`required .FiniteDuration interval = 3;`
		- #### clearInterval
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") clearInterval()
		```
		
		`required .FiniteDuration interval = 3;`
		- #### getIntervalBuilder
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") getIntervalBuilder()
		```
		
		`required .FiniteDuration interval = 3;`
		- #### getIntervalOrBuilder
		
		
		
		```
		public [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote") getIntervalOrBuilder()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[getIntervalOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getIntervalOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDurationOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.GenericRoutingPool.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.GenericRoutingPool.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.GenericRoutingPoolOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPool.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPool.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPoolOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPool.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TailChoppingPool.Builder.html)*