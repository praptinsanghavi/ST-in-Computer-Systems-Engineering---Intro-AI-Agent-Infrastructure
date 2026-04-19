---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.Builder.html
title: WireFormats.AcknowledgementInfo.Builder
---

# WireFormats.AcknowledgementInfo.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AcknowledgementInfo.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AcknowledgementInfo.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote")

---

```
public static final class WireFormats.AcknowledgementInfo.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>
implements [WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")
```

Protobuf type `AcknowledgementInfo`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[addAllNacks](#addAllNacks(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Long> values)` | `repeated fixed64 nacks = 2;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[addNacks](#addNacks(long))​(long value)` | `repeated fixed64 nacks = 2;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clearCumulativeAck](#clearCumulativeAck())()` | `required fixed64 cumulativeAck = 1;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clearNacks](#clearNacks())()` | `repeated fixed64 nacks = 2;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `long` | `[getCumulativeAck](#getCumulativeAck())()` | `required fixed64 cumulativeAck = 1;` |
	| `[WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getNacks](#getNacks(int))​(int index)` | `repeated fixed64 nacks = 2;` |
	| `int` | `[getNacksCount](#getNacksCount())()` | `repeated fixed64 nacks = 2;` |
	| `java.util.List<java.lang.Long>` | `[getNacksList](#getNacksList())()` | `repeated fixed64 nacks = 2;` |
	| `boolean` | `[hasCumulativeAck](#hasCumulativeAck())()` | `required fixed64 cumulativeAck = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AcknowledgementInfo))​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") other)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[setCumulativeAck](#setCumulativeAck(long))​(long value)` | `required fixed64 cumulativeAck = 1;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[setNacks](#setNacks(int,long))​(int index,  long value)` | `repeated fixed64 nacks = 2;` |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasCumulativeAck
		
		
		
		```
		public boolean hasCumulativeAck()
		```
		
		`required fixed64 cumulativeAck = 1;`
		
		Specified by:
		`[hasCumulativeAck](WireFormats.AcknowledgementInfoOrBuilder.html#hasCumulativeAck())` in interface `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the cumulativeAck field is set.
		- #### getCumulativeAck
		
		
		
		```
		public long getCumulativeAck()
		```
		
		`required fixed64 cumulativeAck = 1;`
		
		Specified by:
		`[getCumulativeAck](WireFormats.AcknowledgementInfoOrBuilder.html#getCumulativeAck())` in interface `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The cumulativeAck.
		- #### setCumulativeAck
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") setCumulativeAck​(long value)
		```
		
		`required fixed64 cumulativeAck = 1;`
		
		Parameters:
		`value` \- The cumulativeAck to set.
		Returns:
		This builder for chaining.
		- #### clearCumulativeAck
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clearCumulativeAck()
		```
		
		`required fixed64 cumulativeAck = 1;`
		
		Returns:
		This builder for chaining.
		- #### getNacksList
		
		
		
		```
		public java.util.List<java.lang.Long> getNacksList()
		```
		
		`repeated fixed64 nacks = 2;`
		
		Specified by:
		`[getNacksList](WireFormats.AcknowledgementInfoOrBuilder.html#getNacksList())` in interface `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the nacks.
		- #### getNacksCount
		
		
		
		```
		public int getNacksCount()
		```
		
		`repeated fixed64 nacks = 2;`
		
		Specified by:
		`[getNacksCount](WireFormats.AcknowledgementInfoOrBuilder.html#getNacksCount())` in interface `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of nacks.
		- #### getNacks
		
		
		
		```
		public long getNacks​(int index)
		```
		
		`repeated fixed64 nacks = 2;`
		
		Specified by:
		`[getNacks](WireFormats.AcknowledgementInfoOrBuilder.html#getNacks(int))` in interface `[WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The nacks at the given index.
		- #### setNacks
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") setNacks​(int index,
		                                                        long value)
		```
		
		`repeated fixed64 nacks = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The nacks to set.
		Returns:
		This builder for chaining.
		- #### addNacks
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") addNacks​(long value)
		```
		
		`repeated fixed64 nacks = 2;`
		
		Parameters:
		`value` \- The nacks to add.
		Returns:
		This builder for chaining.
		- #### addAllNacks
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") addAllNacks​(java.lang.Iterable<? extends java.lang.Long> values)
		```
		
		`repeated fixed64 nacks = 2;`
		
		Parameters:
		`values` \- The nacks to add.
		Returns:
		This builder for chaining.
		- #### clearNacks
		
		
		
		```
		public [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") clearNacks()
		```
		
		`repeated fixed64 nacks = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfoOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AcknowledgementInfo.Builder.html)*