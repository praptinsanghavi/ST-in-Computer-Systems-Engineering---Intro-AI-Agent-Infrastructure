---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html
title: TestConductorProtocol.AddressRequest.Builder
---

# TestConductorProtocol.AddressRequest.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.AddressRequest.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.AddressRequest.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.AddressRequest.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `AddressRequest`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clearAddr](#clearAddr())()` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clearNode](#clearNode())()` | `required string node = 1;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[getAddr](#getAddr())()` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[getAddrBuilder](#getAddrBuilder())()` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")` | `[getAddrOrBuilder](#getAddrOrBuilder())()` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getNode](#getNode())()` | `required string node = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getNodeBytes](#getNodeBytes())()` | `required string node = 1;` |
	| `boolean` | `[hasAddr](#hasAddr())()` | `optional .Address addr = 2;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required string node = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[mergeAddr](#mergeAddr(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.AddressRequest))​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setAddr](#setAddr(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setAddr](#setAddr(akka.remote.testconductor.TestConductorProtocol.Address.Builder))​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)` | `optional .Address addr = 2;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setNode](#setNode(java.lang.String))​(java.lang.String value)` | `required string node = 1;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setNodeBytes](#setNodeBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string node = 1;` |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     int index,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required string node = 1;`
		
		Specified by:
		`[hasNode](TestConductorProtocol.AddressRequestOrBuilder.html#hasNode())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public java.lang.String getNode()
		```
		
		`required string node = 1;`
		
		Specified by:
		`[getNode](TestConductorProtocol.AddressRequestOrBuilder.html#getNode())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The node.
		- #### getNodeBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getNodeBytes()
		```
		
		`required string node = 1;`
		
		Specified by:
		`[getNodeBytes](TestConductorProtocol.AddressRequestOrBuilder.html#getNodeBytes())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for node.
		- #### setNode
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setNode​(java.lang.String value)
		```
		
		`required string node = 1;`
		
		Parameters:
		`value` \- The node to set.
		Returns:
		This builder for chaining.
		- #### clearNode
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clearNode()
		```
		
		`required string node = 1;`
		
		Returns:
		This builder for chaining.
		- #### setNodeBytes
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setNodeBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string node = 1;`
		
		Parameters:
		`value` \- The bytes for node to set.
		Returns:
		This builder for chaining.
		- #### hasAddr
		
		
		
		```
		public boolean hasAddr()
		```
		
		`optional .Address addr = 2;`
		
		Specified by:
		`[hasAddr](TestConductorProtocol.AddressRequestOrBuilder.html#hasAddr())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the addr field is set.
		- #### getAddr
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") getAddr()
		```
		
		`optional .Address addr = 2;`
		
		Specified by:
		`[getAddr](TestConductorProtocol.AddressRequestOrBuilder.html#getAddr())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The addr.
		- #### setAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setAddr​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Address addr = 2;`
		- #### setAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setAddr​([TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") builderForValue)
		```
		
		`optional .Address addr = 2;`
		- #### mergeAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") mergeAddr​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") value)
		```
		
		`optional .Address addr = 2;`
		- #### clearAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") clearAddr()
		```
		
		`optional .Address addr = 2;`
		- #### getAddrBuilder
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") getAddrBuilder()
		```
		
		`optional .Address addr = 2;`
		- #### getAddrOrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor") getAddrOrBuilder()
		```
		
		`optional .Address addr = 2;`
		
		Specified by:
		`[getAddrOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html#getAddrOrBuilder())` in interface `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")`
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequest.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequestOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html)*