---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.Builder.html
title: WireFormats.FiniteDuration.Builder
---

# WireFormats.FiniteDuration.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.FiniteDuration.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.FiniteDuration.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")

---

```
public static final class WireFormats.FiniteDuration.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>
implements [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")
```

Protobuf type `FiniteDuration`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clearUnit](#clearUnit())()` | `required .TimeUnit unit = 2;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clearValue](#clearValue())()` | `required int64 value = 1;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")` | `[getUnit](#getUnit())()` | `required .TimeUnit unit = 2;` |
	| `long` | `[getValue](#getValue())()` | `required int64 value = 1;` |
	| `boolean` | `[hasUnit](#hasUnit())()` | `required .TimeUnit unit = 2;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required int64 value = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.FiniteDuration))​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") other)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[setUnit](#setUnit(akka.remote.WireFormats.TimeUnit))​([WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") value)` | `required .TimeUnit unit = 2;` |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")` | `[setValue](#setValue(long))​(long value)` | `required int64 value = 1;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") mergeFrom​([WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`required int64 value = 1;`
		
		Specified by:
		`[hasValue](WireFormats.FiniteDurationOrBuilder.html#hasValue())` in interface `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public long getValue()
		```
		
		`required int64 value = 1;`
		
		Specified by:
		`[getValue](WireFormats.FiniteDurationOrBuilder.html#getValue())` in interface `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") setValue​(long value)
		```
		
		`required int64 value = 1;`
		
		Parameters:
		`value` \- The value to set.
		Returns:
		This builder for chaining.
		- #### clearValue
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clearValue()
		```
		
		`required int64 value = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasUnit
		
		
		
		```
		public boolean hasUnit()
		```
		
		`required .TimeUnit unit = 2;`
		
		Specified by:
		`[hasUnit](WireFormats.FiniteDurationOrBuilder.html#hasUnit())` in interface `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the unit field is set.
		- #### getUnit
		
		
		
		```
		public [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") getUnit()
		```
		
		`required .TimeUnit unit = 2;`
		
		Specified by:
		`[getUnit](WireFormats.FiniteDurationOrBuilder.html#getUnit())` in interface `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")`
		Returns:
		The unit.
		- #### setUnit
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") setUnit​([WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") value)
		```
		
		`required .TimeUnit unit = 2;`
		
		Parameters:
		`value` \- The unit to set.
		Returns:
		This builder for chaining.
		- #### clearUnit
		
		
		
		```
		public [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") clearUnit()
		```
		
		`required .TimeUnit unit = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDurationOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TimeUnit.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FiniteDuration.Builder.html)*