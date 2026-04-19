---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Wrapper.Builder.html
title: TestConductorProtocol.Wrapper.Builder
---

# TestConductorProtocol.Wrapper.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.Wrapper.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.Wrapper.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.Wrapper.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `Wrapper`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearAddr](#clearAddr())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearBarrier](#clearBarrier())()` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearDone](#clearDone())()` | `optional string done = 4;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearFailure](#clearFailure())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearHello](#clearHello())()` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")` | `[getAddr](#getAddr())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[getAddrBuilder](#getAddrBuilder())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")` | `[getAddrOrBuilder](#getAddrOrBuilder())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")` | `[getBarrier](#getBarrier())()` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[getBarrierBuilder](#getBarrierBuilder())()` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")` | `[getBarrierOrBuilder](#getBarrierOrBuilder())()` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getDone](#getDone())()` | `optional string done = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getDoneBytes](#getDoneBytes())()` | `optional string done = 4;` |
	| `[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")` | `[getFailure](#getFailure())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor")` | `[getFailureBuilder](#getFailureBuilder())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")` | `[getFailureOrBuilder](#getFailureOrBuilder())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")` | `[getHello](#getHello())()` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[getHelloBuilder](#getHelloBuilder())()` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")` | `[getHelloOrBuilder](#getHelloOrBuilder())()` | `optional .Hello hello = 1;` |
	| `boolean` | `[hasAddr](#hasAddr())()` | `optional .AddressRequest addr = 5;` |
	| `boolean` | `[hasBarrier](#hasBarrier())()` | `optional .EnterBarrier barrier = 2;` |
	| `boolean` | `[hasDone](#hasDone())()` | `optional string done = 4;` |
	| `boolean` | `[hasFailure](#hasFailure())()` | `optional .InjectFailure failure = 3;` |
	| `boolean` | `[hasHello](#hasHello())()` | `optional .Hello hello = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeAddr](#mergeAddr(akka.remote.testconductor.TestConductorProtocol.AddressRequest))​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") value)` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeBarrier](#mergeBarrier(akka.remote.testconductor.TestConductorProtocol.EnterBarrier))​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") value)` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeFailure](#mergeFailure(akka.remote.testconductor.TestConductorProtocol.InjectFailure))​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") value)` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.Wrapper))​([TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeHello](#mergeHello(akka.remote.testconductor.TestConductorProtocol.Hello))​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") value)` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setAddr](#setAddr(akka.remote.testconductor.TestConductorProtocol.AddressRequest))​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") value)` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setAddr](#setAddr(akka.remote.testconductor.TestConductorProtocol.AddressRequest.Builder))​([TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setBarrier](#setBarrier(akka.remote.testconductor.TestConductorProtocol.EnterBarrier))​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") value)` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setBarrier](#setBarrier(akka.remote.testconductor.TestConductorProtocol.EnterBarrier.Builder))​([TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setDone](#setDone(java.lang.String))​(java.lang.String value)` | `optional string done = 4;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setDoneBytes](#setDoneBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string done = 4;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setFailure](#setFailure(akka.remote.testconductor.TestConductorProtocol.InjectFailure))​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") value)` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setFailure](#setFailure(akka.remote.testconductor.TestConductorProtocol.InjectFailure.Builder))​([TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setHello](#setHello(akka.remote.testconductor.TestConductorProtocol.Hello))​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") value)` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setHello](#setHello(akka.remote.testconductor.TestConductorProtocol.Hello.Builder))​([TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasHello
		
		
		
		```
		public boolean hasHello()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[hasHello](TestConductorProtocol.WrapperOrBuilder.html#hasHello())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the hello field is set.
		- #### getHello
		
		
		
		```
		public [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") getHello()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[getHello](TestConductorProtocol.WrapperOrBuilder.html#getHello())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The hello.
		- #### setHello
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setHello​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Hello hello = 1;`
		- #### setHello
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setHello​([TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .Hello hello = 1;`
		- #### mergeHello
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeHello​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Hello hello = 1;`
		- #### clearHello
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearHello()
		```
		
		`optional .Hello hello = 1;`
		- #### getHelloBuilder
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") getHelloBuilder()
		```
		
		`optional .Hello hello = 1;`
		- #### getHelloOrBuilder
		
		
		
		```
		public [TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor") getHelloOrBuilder()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[getHelloOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getHelloOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasBarrier
		
		
		
		```
		public boolean hasBarrier()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[hasBarrier](TestConductorProtocol.WrapperOrBuilder.html#hasBarrier())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the barrier field is set.
		- #### getBarrier
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") getBarrier()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[getBarrier](TestConductorProtocol.WrapperOrBuilder.html#getBarrier())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The barrier.
		- #### setBarrier
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setBarrier​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") value)
		```
		
		`optional .EnterBarrier barrier = 2;`
		- #### setBarrier
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setBarrier​([TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .EnterBarrier barrier = 2;`
		- #### mergeBarrier
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeBarrier​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") value)
		```
		
		`optional .EnterBarrier barrier = 2;`
		- #### clearBarrier
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearBarrier()
		```
		
		`optional .EnterBarrier barrier = 2;`
		- #### getBarrierBuilder
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") getBarrierBuilder()
		```
		
		`optional .EnterBarrier barrier = 2;`
		- #### getBarrierOrBuilder
		
		
		
		```
		public [TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor") getBarrierOrBuilder()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[getBarrierOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getBarrierOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasFailure
		
		
		
		```
		public boolean hasFailure()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[hasFailure](TestConductorProtocol.WrapperOrBuilder.html#hasFailure())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the failure field is set.
		- #### getFailure
		
		
		
		```
		public [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") getFailure()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[getFailure](TestConductorProtocol.WrapperOrBuilder.html#getFailure())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The failure.
		- #### setFailure
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setFailure​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") value)
		```
		
		`optional .InjectFailure failure = 3;`
		- #### setFailure
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setFailure​([TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .InjectFailure failure = 3;`
		- #### mergeFailure
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeFailure​([TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") value)
		```
		
		`optional .InjectFailure failure = 3;`
		- #### clearFailure
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearFailure()
		```
		
		`optional .InjectFailure failure = 3;`
		- #### getFailureBuilder
		
		
		
		```
		public [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") getFailureBuilder()
		```
		
		`optional .InjectFailure failure = 3;`
		- #### getFailureOrBuilder
		
		
		
		```
		public [TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor") getFailureOrBuilder()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[getFailureOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getFailureOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasDone
		
		
		
		```
		public boolean hasDone()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[hasDone](TestConductorProtocol.WrapperOrBuilder.html#hasDone())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the done field is set.
		- #### getDone
		
		
		
		```
		public java.lang.String getDone()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[getDone](TestConductorProtocol.WrapperOrBuilder.html#getDone())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The done.
		- #### getDoneBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getDoneBytes()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[getDoneBytes](TestConductorProtocol.WrapperOrBuilder.html#getDoneBytes())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for done.
		- #### setDone
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setDone​(java.lang.String value)
		```
		
		`optional string done = 4;`
		
		Parameters:
		`value` \- The done to set.
		Returns:
		This builder for chaining.
		- #### clearDone
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearDone()
		```
		
		`optional string done = 4;`
		
		Returns:
		This builder for chaining.
		- #### setDoneBytes
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setDoneBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string done = 4;`
		
		Parameters:
		`value` \- The bytes for done to set.
		Returns:
		This builder for chaining.
		- #### hasAddr
		
		
		
		```
		public boolean hasAddr()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[hasAddr](TestConductorProtocol.WrapperOrBuilder.html#hasAddr())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the addr field is set.
		- #### getAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") getAddr()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[getAddr](TestConductorProtocol.WrapperOrBuilder.html#getAddr())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The addr.
		- #### setAddr
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setAddr​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") value)
		```
		
		`optional .AddressRequest addr = 5;`
		- #### setAddr
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setAddr​([TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .AddressRequest addr = 5;`
		- #### mergeAddr
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeAddr​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") value)
		```
		
		`optional .AddressRequest addr = 5;`
		- #### clearAddr
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") clearAddr()
		```
		
		`optional .AddressRequest addr = 5;`
		- #### getAddrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") getAddrBuilder()
		```
		
		`optional .AddressRequest addr = 5;`
		- #### getAddrOrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor") getAddrOrBuilder()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[getAddrOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getAddrOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequestOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrierOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Hello.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Hello.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.HelloOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.InjectFailureOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Wrapper.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Wrapper.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.WrapperOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Wrapper.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Wrapper.Builder.html)*