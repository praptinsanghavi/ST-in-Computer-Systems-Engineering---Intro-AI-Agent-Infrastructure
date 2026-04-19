---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html
title: TestConductorProtocol.EnterBarrier.Builder
---

# TestConductorProtocol.EnterBarrier.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.EnterBarrier.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.EnterBarrier.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.EnterBarrier.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `EnterBarrier`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clearName](#clearName())()` | `required string name = 1;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clearOp](#clearOp())()` | `required .BarrierOp op = 2;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clearTimeout](#clearTimeout())()` | `optional int64 timeout = 3;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getName](#getName())()` | `required string name = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getNameBytes](#getNameBytes())()` | `required string name = 1;` |
	| `[TestConductorProtocol.BarrierOp](TestConductorProtocol.BarrierOp.html "enum in akka.remote.testconductor")` | `[getOp](#getOp())()` | `required .BarrierOp op = 2;` |
	| `long` | `[getTimeout](#getTimeout())()` | `optional int64 timeout = 3;` |
	| `boolean` | `[hasName](#hasName())()` | `required string name = 1;` |
	| `boolean` | `[hasOp](#hasOp())()` | `required .BarrierOp op = 2;` |
	| `boolean` | `[hasTimeout](#hasTimeout())()` | `optional int64 timeout = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.EnterBarrier))​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setName](#setName(java.lang.String))​(java.lang.String value)` | `required string name = 1;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setNameBytes](#setNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string name = 1;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setOp](#setOp(akka.remote.testconductor.TestConductorProtocol.BarrierOp))​([TestConductorProtocol.BarrierOp](TestConductorProtocol.BarrierOp.html "enum in akka.remote.testconductor") value)` | `required .BarrierOp op = 2;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setTimeout](#setTimeout(long))​(long value)` | `optional int64 timeout = 3;` |
	| `[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasName
		
		
		
		```
		public boolean hasName()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[hasName](TestConductorProtocol.EnterBarrierOrBuilder.html#hasName())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the name field is set.
		- #### getName
		
		
		
		```
		public java.lang.String getName()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[getName](TestConductorProtocol.EnterBarrierOrBuilder.html#getName())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The name.
		- #### getNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getNameBytes()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[getNameBytes](TestConductorProtocol.EnterBarrierOrBuilder.html#getNameBytes())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for name.
		- #### setName
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setName​(java.lang.String value)
		```
		
		`required string name = 1;`
		
		Parameters:
		`value` \- The name to set.
		Returns:
		This builder for chaining.
		- #### clearName
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clearName()
		```
		
		`required string name = 1;`
		
		Returns:
		This builder for chaining.
		- #### setNameBytes
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string name = 1;`
		
		Parameters:
		`value` \- The bytes for name to set.
		Returns:
		This builder for chaining.
		- #### hasOp
		
		
		
		```
		public boolean hasOp()
		```
		
		`required .BarrierOp op = 2;`
		
		Specified by:
		`[hasOp](TestConductorProtocol.EnterBarrierOrBuilder.html#hasOp())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the op field is set.
		- #### getOp
		
		
		
		```
		public [TestConductorProtocol.BarrierOp](TestConductorProtocol.BarrierOp.html "enum in akka.remote.testconductor") getOp()
		```
		
		`required .BarrierOp op = 2;`
		
		Specified by:
		`[getOp](TestConductorProtocol.EnterBarrierOrBuilder.html#getOp())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The op.
		- #### setOp
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setOp​([TestConductorProtocol.BarrierOp](TestConductorProtocol.BarrierOp.html "enum in akka.remote.testconductor") value)
		```
		
		`required .BarrierOp op = 2;`
		
		Parameters:
		`value` \- The op to set.
		Returns:
		This builder for chaining.
		- #### clearOp
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clearOp()
		```
		
		`required .BarrierOp op = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasTimeout
		
		
		
		```
		public boolean hasTimeout()
		```
		
		`optional int64 timeout = 3;`
		
		Specified by:
		`[hasTimeout](TestConductorProtocol.EnterBarrierOrBuilder.html#hasTimeout())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the timeout field is set.
		- #### getTimeout
		
		
		
		```
		public long getTimeout()
		```
		
		`optional int64 timeout = 3;`
		
		Specified by:
		`[getTimeout](TestConductorProtocol.EnterBarrierOrBuilder.html#getTimeout())` in interface `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The timeout.
		- #### setTimeout
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setTimeout​(long value)
		```
		
		`optional int64 timeout = 3;`
		
		Parameters:
		`value` \- The timeout to set.
		Returns:
		This builder for chaining.
		- #### clearTimeout
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") clearTimeout()
		```
		
		`optional int64 timeout = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.BarrierOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrierOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html)*