---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.Builder.html
title: TestConductorProtocol.InjectFailure.Builder
---

# TestConductorProtocol.InjectFailure.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.InjectFailure.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.InjectFailure.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.InjectFailure.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `InjectFailure`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearAddress](#clearAddress())()` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearDirection](#clearDirection())()` | `optional .Direction direction = 2;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearExitValue](#clearExitValue())()` | `optional int32 exitValue = 7;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearFailure](#clearFailure())()` | `required .FailType failure = 1;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clearRateMBit](#clearRateMBit())()` | `optional float rateMBit = 6;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[getAddress](#getAddress())()` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[getAddressBuilder](#getAddressBuilder())()` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[TestConductorProtocol.Direction](TestConductorProtocol.Direction.html "enum in akka.remote.testconductor")` | `[getDirection](#getDirection())()` | `optional .Direction direction = 2;` |
	| `int` | `[getExitValue](#getExitValue())()` | `optional int32 exitValue = 7;` |
	| `[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")` | `[getFailure](#getFailure())()` | `required .FailType failure = 1;` |
	| `float` | `[getRateMBit](#getRateMBit())()` | `optional float rateMBit = 6;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `optional .Address address = 3;` |
	| `boolean` | `[hasDirection](#hasDirection())()` | `optional .Direction direction = 2;` |
	| `boolean` | `[hasExitValue](#hasExitValue())()` | `optional int32 exitValue = 7;` |
	| `boolean` | `[hasFailure](#hasFailure())()` | `required .FailType failure = 1;` |
	| `boolean` | `[hasRateMBit](#hasRateMBit())()` | `optional float rateMBit = 6;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[mergeAddress](#mergeAddress(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.InjectFailure))​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setAddress](#setAddress(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setAddress](#setAddress(akka.remote.testconductor.TestConductorProtocol.Address.Builder))​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .Address address = 3;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setDirection](#setDirection(akka.remote.testconductor.TestConductorProtocol.Direction))​([TestConductorProtocol.Direction](TestConductorProtocol.Direction.html "enum in akka.remote.testconductor") value)` | `optional .Direction direction = 2;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setExitValue](#setExitValue(int))​(int value)` | `optional int32 exitValue = 7;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setFailure](#setFailure(akka.remote.testconductor.TestConductorProtocol.FailType))​([TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") value)` | `required .FailType failure = 1;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setRateMBit](#setRateMBit(float))​(float value)` | `optional float rateMBit = 6;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasFailure
		
		
		
		```
		public boolean hasFailure()
		```
		
		`required .FailType failure = 1;`
		
		Specified by:
		`[hasFailure](TestConductorProtocol.InjectFailureOrBuilder.html#hasFailure())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the failure field is set.
		- #### getFailure
		
		
		
		```
		public [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") getFailure()
		```
		
		`required .FailType failure = 1;`
		
		Specified by:
		`[getFailure](TestConductorProtocol.InjectFailureOrBuilder.html#getFailure())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The failure.
		- #### setFailure
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setFailure​([TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") value)
		```
		
		`required .FailType failure = 1;`
		
		Parameters:
		`value` \- The failure to set.
		Returns:
		This builder for chaining.
		- #### clearFailure
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearFailure()
		```
		
		`required .FailType failure = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasDirection
		
		
		
		```
		public boolean hasDirection()
		```
		
		`optional .Direction direction = 2;`
		
		Specified by:
		`[hasDirection](TestConductorProtocol.InjectFailureOrBuilder.html#hasDirection())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the direction field is set.
		- #### getDirection
		
		
		
		```
		public [TestConductorProtocol.Direction](TestConductorProtocol.Direction.html "enum in akka.remote.testconductor") getDirection()
		```
		
		`optional .Direction direction = 2;`
		
		Specified by:
		`[getDirection](TestConductorProtocol.InjectFailureOrBuilder.html#getDirection())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The direction.
		- #### setDirection
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setDirection​([TestConductorProtocol.Direction](TestConductorProtocol.Direction.html "enum in akka.remote.testconductor") value)
		```
		
		`optional .Direction direction = 2;`
		
		Parameters:
		`value` \- The direction to set.
		Returns:
		This builder for chaining.
		- #### clearDirection
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearDirection()
		```
		
		`optional .Direction direction = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`optional .Address address = 3;`
		
		Specified by:
		`[hasAddress](TestConductorProtocol.InjectFailureOrBuilder.html#hasAddress())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") getAddress()
		```
		
		`optional .Address address = 3;`
		
		Specified by:
		`[getAddress](TestConductorProtocol.InjectFailureOrBuilder.html#getAddress())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setAddress​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Address address = 3;`
		- #### setAddress
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setAddress​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .Address address = 3;`
		- #### mergeAddress
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") mergeAddress​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Address address = 3;`
		- #### clearAddress
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearAddress()
		```
		
		`optional .Address address = 3;`
		- #### getAddressBuilder
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") getAddressBuilder()
		```
		
		`optional .Address address = 3;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor") getAddressOrBuilder()
		```
		
		`optional .Address address = 3;`
		
		Specified by:
		`[getAddressOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html#getAddressOrBuilder())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasRateMBit
		
		
		
		```
		public boolean hasRateMBit()
		```
		
		`optional float rateMBit = 6;`
		
		Specified by:
		`[hasRateMBit](TestConductorProtocol.InjectFailureOrBuilder.html#hasRateMBit())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the rateMBit field is set.
		- #### getRateMBit
		
		
		
		```
		public float getRateMBit()
		```
		
		`optional float rateMBit = 6;`
		
		Specified by:
		`[getRateMBit](TestConductorProtocol.InjectFailureOrBuilder.html#getRateMBit())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The rateMBit.
		- #### setRateMBit
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setRateMBit​(float value)
		```
		
		`optional float rateMBit = 6;`
		
		Parameters:
		`value` \- The rateMBit to set.
		Returns:
		This builder for chaining.
		- #### clearRateMBit
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearRateMBit()
		```
		
		`optional float rateMBit = 6;`
		
		Returns:
		This builder for chaining.
		- #### hasExitValue
		
		
		
		```
		public boolean hasExitValue()
		```
		
		`optional int32 exitValue = 7;`
		
		Specified by:
		`[hasExitValue](TestConductorProtocol.InjectFailureOrBuilder.html#hasExitValue())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the exitValue field is set.
		- #### getExitValue
		
		
		
		```
		public int getExitValue()
		```
		
		`optional int32 exitValue = 7;`
		
		Specified by:
		`[getExitValue](TestConductorProtocol.InjectFailureOrBuilder.html#getExitValue())` in interface `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The exitValue.
		- #### setExitValue
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setExitValue​(int value)
		```
		
		`optional int32 exitValue = 7;`
		
		Parameters:
		`value` \- The exitValue to set.
		Returns:
		This builder for chaining.
		- #### clearExitValue
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") clearExitValue()
		```
		
		`optional int32 exitValue = 7;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Direction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailureOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.Builder.html)*