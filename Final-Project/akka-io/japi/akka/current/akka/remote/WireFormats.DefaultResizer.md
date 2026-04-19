---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizer.Builder.html
title: WireFormats.DefaultResizer.Builder
---

# WireFormats.DefaultResizer.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.DefaultResizer.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.DefaultResizer.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote")

---

```
public static final class WireFormats.DefaultResizer.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>
implements [WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")
```

Protobuf type `DefaultResizer`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearBackoffRate](#clearBackoffRate())()` | `required double backoffRate = 6;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearBackoffThreshold](#clearBackoffThreshold())()` | `required double backoffThreshold = 5;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearLowerBound](#clearLowerBound())()` | `required uint32 lowerBound = 1;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearMessagesPerResize](#clearMessagesPerResize())()` | `required uint32 messagesPerResize = 7;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearPressureThreshold](#clearPressureThreshold())()` | `required uint32 pressureThreshold = 3;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearRampupRate](#clearRampupRate())()` | `required double rampupRate = 4;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clearUpperBound](#clearUpperBound())()` | `required uint32 upperBound = 2;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `double` | `[getBackoffRate](#getBackoffRate())()` | `required double backoffRate = 6;` |
	| `double` | `[getBackoffThreshold](#getBackoffThreshold())()` | `required double backoffThreshold = 5;` |
	| `[WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getLowerBound](#getLowerBound())()` | `required uint32 lowerBound = 1;` |
	| `int` | `[getMessagesPerResize](#getMessagesPerResize())()` | `required uint32 messagesPerResize = 7;` |
	| `int` | `[getPressureThreshold](#getPressureThreshold())()` | `required uint32 pressureThreshold = 3;` |
	| `double` | `[getRampupRate](#getRampupRate())()` | `required double rampupRate = 4;` |
	| `int` | `[getUpperBound](#getUpperBound())()` | `required uint32 upperBound = 2;` |
	| `boolean` | `[hasBackoffRate](#hasBackoffRate())()` | `required double backoffRate = 6;` |
	| `boolean` | `[hasBackoffThreshold](#hasBackoffThreshold())()` | `required double backoffThreshold = 5;` |
	| `boolean` | `[hasLowerBound](#hasLowerBound())()` | `required uint32 lowerBound = 1;` |
	| `boolean` | `[hasMessagesPerResize](#hasMessagesPerResize())()` | `required uint32 messagesPerResize = 7;` |
	| `boolean` | `[hasPressureThreshold](#hasPressureThreshold())()` | `required uint32 pressureThreshold = 3;` |
	| `boolean` | `[hasRampupRate](#hasRampupRate())()` | `required double rampupRate = 4;` |
	| `boolean` | `[hasUpperBound](#hasUpperBound())()` | `required uint32 upperBound = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.DefaultResizer))​([WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") other)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setBackoffRate](#setBackoffRate(double))​(double value)` | `required double backoffRate = 6;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setBackoffThreshold](#setBackoffThreshold(double))​(double value)` | `required double backoffThreshold = 5;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setLowerBound](#setLowerBound(int))​(int value)` | `required uint32 lowerBound = 1;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setMessagesPerResize](#setMessagesPerResize(int))​(int value)` | `required uint32 messagesPerResize = 7;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setPressureThreshold](#setPressureThreshold(int))​(int value)` | `required uint32 pressureThreshold = 3;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setRampupRate](#setRampupRate(double))​(double value)` | `required double rampupRate = 4;` |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")` | `[setUpperBound](#setUpperBound(int))​(int value)` | `required uint32 upperBound = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") mergeFrom​([WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasLowerBound
		
		
		
		```
		public boolean hasLowerBound()
		```
		
		`required uint32 lowerBound = 1;`
		
		Specified by:
		`[hasLowerBound](WireFormats.DefaultResizerOrBuilder.html#hasLowerBound())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the lowerBound field is set.
		- #### getLowerBound
		
		
		
		```
		public int getLowerBound()
		```
		
		`required uint32 lowerBound = 1;`
		
		Specified by:
		`[getLowerBound](WireFormats.DefaultResizerOrBuilder.html#getLowerBound())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The lowerBound.
		- #### setLowerBound
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setLowerBound​(int value)
		```
		
		`required uint32 lowerBound = 1;`
		
		Parameters:
		`value` \- The lowerBound to set.
		Returns:
		This builder for chaining.
		- #### clearLowerBound
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearLowerBound()
		```
		
		`required uint32 lowerBound = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasUpperBound
		
		
		
		```
		public boolean hasUpperBound()
		```
		
		`required uint32 upperBound = 2;`
		
		Specified by:
		`[hasUpperBound](WireFormats.DefaultResizerOrBuilder.html#hasUpperBound())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the upperBound field is set.
		- #### getUpperBound
		
		
		
		```
		public int getUpperBound()
		```
		
		`required uint32 upperBound = 2;`
		
		Specified by:
		`[getUpperBound](WireFormats.DefaultResizerOrBuilder.html#getUpperBound())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The upperBound.
		- #### setUpperBound
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setUpperBound​(int value)
		```
		
		`required uint32 upperBound = 2;`
		
		Parameters:
		`value` \- The upperBound to set.
		Returns:
		This builder for chaining.
		- #### clearUpperBound
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearUpperBound()
		```
		
		`required uint32 upperBound = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPressureThreshold
		
		
		
		```
		public boolean hasPressureThreshold()
		```
		
		`required uint32 pressureThreshold = 3;`
		
		Specified by:
		`[hasPressureThreshold](WireFormats.DefaultResizerOrBuilder.html#hasPressureThreshold())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the pressureThreshold field is set.
		- #### getPressureThreshold
		
		
		
		```
		public int getPressureThreshold()
		```
		
		`required uint32 pressureThreshold = 3;`
		
		Specified by:
		`[getPressureThreshold](WireFormats.DefaultResizerOrBuilder.html#getPressureThreshold())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The pressureThreshold.
		- #### setPressureThreshold
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setPressureThreshold​(int value)
		```
		
		`required uint32 pressureThreshold = 3;`
		
		Parameters:
		`value` \- The pressureThreshold to set.
		Returns:
		This builder for chaining.
		- #### clearPressureThreshold
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearPressureThreshold()
		```
		
		`required uint32 pressureThreshold = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasRampupRate
		
		
		
		```
		public boolean hasRampupRate()
		```
		
		`required double rampupRate = 4;`
		
		Specified by:
		`[hasRampupRate](WireFormats.DefaultResizerOrBuilder.html#hasRampupRate())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the rampupRate field is set.
		- #### getRampupRate
		
		
		
		```
		public double getRampupRate()
		```
		
		`required double rampupRate = 4;`
		
		Specified by:
		`[getRampupRate](WireFormats.DefaultResizerOrBuilder.html#getRampupRate())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The rampupRate.
		- #### setRampupRate
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setRampupRate​(double value)
		```
		
		`required double rampupRate = 4;`
		
		Parameters:
		`value` \- The rampupRate to set.
		Returns:
		This builder for chaining.
		- #### clearRampupRate
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearRampupRate()
		```
		
		`required double rampupRate = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasBackoffThreshold
		
		
		
		```
		public boolean hasBackoffThreshold()
		```
		
		`required double backoffThreshold = 5;`
		
		Specified by:
		`[hasBackoffThreshold](WireFormats.DefaultResizerOrBuilder.html#hasBackoffThreshold())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the backoffThreshold field is set.
		- #### getBackoffThreshold
		
		
		
		```
		public double getBackoffThreshold()
		```
		
		`required double backoffThreshold = 5;`
		
		Specified by:
		`[getBackoffThreshold](WireFormats.DefaultResizerOrBuilder.html#getBackoffThreshold())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The backoffThreshold.
		- #### setBackoffThreshold
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setBackoffThreshold​(double value)
		```
		
		`required double backoffThreshold = 5;`
		
		Parameters:
		`value` \- The backoffThreshold to set.
		Returns:
		This builder for chaining.
		- #### clearBackoffThreshold
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearBackoffThreshold()
		```
		
		`required double backoffThreshold = 5;`
		
		Returns:
		This builder for chaining.
		- #### hasBackoffRate
		
		
		
		```
		public boolean hasBackoffRate()
		```
		
		`required double backoffRate = 6;`
		
		Specified by:
		`[hasBackoffRate](WireFormats.DefaultResizerOrBuilder.html#hasBackoffRate())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the backoffRate field is set.
		- #### getBackoffRate
		
		
		
		```
		public double getBackoffRate()
		```
		
		`required double backoffRate = 6;`
		
		Specified by:
		`[getBackoffRate](WireFormats.DefaultResizerOrBuilder.html#getBackoffRate())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The backoffRate.
		- #### setBackoffRate
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setBackoffRate​(double value)
		```
		
		`required double backoffRate = 6;`
		
		Parameters:
		`value` \- The backoffRate to set.
		Returns:
		This builder for chaining.
		- #### clearBackoffRate
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearBackoffRate()
		```
		
		`required double backoffRate = 6;`
		
		Returns:
		This builder for chaining.
		- #### hasMessagesPerResize
		
		
		
		```
		public boolean hasMessagesPerResize()
		```
		
		`required uint32 messagesPerResize = 7;`
		
		Specified by:
		`[hasMessagesPerResize](WireFormats.DefaultResizerOrBuilder.html#hasMessagesPerResize())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the messagesPerResize field is set.
		- #### getMessagesPerResize
		
		
		
		```
		public int getMessagesPerResize()
		```
		
		`required uint32 messagesPerResize = 7;`
		
		Specified by:
		`[getMessagesPerResize](WireFormats.DefaultResizerOrBuilder.html#getMessagesPerResize())` in interface `[WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote")`
		Returns:
		The messagesPerResize.
		- #### setMessagesPerResize
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setMessagesPerResize​(int value)
		```
		
		`required uint32 messagesPerResize = 7;`
		
		Parameters:
		`value` \- The messagesPerResize to set.
		Returns:
		This builder for chaining.
		- #### clearMessagesPerResize
		
		
		
		```
		public [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") clearMessagesPerResize()
		```
		
		`required uint32 messagesPerResize = 7;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizer.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizer.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizerOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizer.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DefaultResizer.Builder.html)*