---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Hello.Builder.html
title: TestConductorProtocol.Hello.Builder
---

# TestConductorProtocol.Hello.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.Hello.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.Hello.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.Hello.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `Hello`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clearAddress](#clearAddress())()` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clearName](#clearName())()` | `required string name = 1;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[getAddress](#getAddress())()` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[getAddressBuilder](#getAddressBuilder())()` | `required .Address address = 2;` |
	| `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getName](#getName())()` | `required string name = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getNameBytes](#getNameBytes())()` | `required string name = 1;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 2;` |
	| `boolean` | `[hasName](#hasName())()` | `required string name = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[mergeAddress](#mergeAddress(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.Hello))​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setAddress](#setAddress(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setAddress](#setAddress(akka.remote.testconductor.TestConductorProtocol.Address.Builder))​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)` | `required .Address address = 2;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setName](#setName(java.lang.String))​(java.lang.String value)` | `required string name = 1;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setNameBytes](#setNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string name = 1;` |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasName
		
		
		
		```
		public boolean hasName()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[hasName](TestConductorProtocol.HelloOrBuilder.html#hasName())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the name field is set.
		- #### getName
		
		
		
		```
		public java.lang.String getName()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[getName](TestConductorProtocol.HelloOrBuilder.html#getName())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The name.
		- #### getNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getNameBytes()
		```
		
		`required string name = 1;`
		
		Specified by:
		`[getNameBytes](TestConductorProtocol.HelloOrBuilder.html#getNameBytes())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for name.
		- #### setName
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setName​(java.lang.String value)
		```
		
		`required string name = 1;`
		
		Parameters:
		`value` \- The name to set.
		Returns:
		This builder for chaining.
		- #### clearName
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clearName()
		```
		
		`required string name = 1;`
		
		Returns:
		This builder for chaining.
		- #### setNameBytes
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string name = 1;`
		
		Parameters:
		`value` \- The bytes for name to set.
		Returns:
		This builder for chaining.
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .Address address = 2;`
		
		Specified by:
		`[hasAddress](TestConductorProtocol.HelloOrBuilder.html#hasAddress())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") getAddress()
		```
		
		`required .Address address = 2;`
		
		Specified by:
		`[getAddress](TestConductorProtocol.HelloOrBuilder.html#getAddress())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setAddress​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`required .Address address = 2;`
		- #### setAddress
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setAddress​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`required .Address address = 2;`
		- #### mergeAddress
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") mergeAddress​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`required .Address address = 2;`
		- #### clearAddress
		
		
		
		```
		public [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") clearAddress()
		```
		
		`required .Address address = 2;`
		- #### getAddressBuilder
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") getAddressBuilder()
		```
		
		`required .Address address = 2;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor") getAddressOrBuilder()
		```
		
		`required .Address address = 2;`
		
		Specified by:
		`[getAddressOrBuilder](TestConductorProtocol.HelloOrBuilder.html#getAddressOrBuilder())` in interface `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")`
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Hello.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Hello.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.HelloOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Hello.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Hello.Builder.html)*