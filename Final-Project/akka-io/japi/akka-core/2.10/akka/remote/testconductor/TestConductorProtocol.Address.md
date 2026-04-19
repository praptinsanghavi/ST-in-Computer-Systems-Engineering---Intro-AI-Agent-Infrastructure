---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
title: TestConductorProtocol.Address.Builder
---

# TestConductorProtocol.Address.Builder

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")\>
			- - akka.remote.testconductor.TestConductorProtocol.Address.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`, `java.lang.Cloneable`

Enclosing class:
[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>
implements [TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[build](#build())()` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[buildPartial](#buildPartial())()` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clear](#clear())()` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearHost](#clearHost())()` | `required string host = 3;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearPort](#clearPort())()` | `required int32 port = 4;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearProtocol](#clearProtocol())()` | `required string protocol = 1;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clearSystem](#clearSystem())()` | `required string system = 2;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[clone](#clone())()` |  |
	| `[TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getHost](#getHost())()` | `required string host = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getHostBytes](#getHostBytes())()` | `required string host = 3;` |
	| `int` | `[getPort](#getPort())()` | `required int32 port = 4;` |
	| `java.lang.String` | `[getProtocol](#getProtocol())()` | `required string protocol = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getProtocolBytes](#getProtocolBytes())()` | `required string protocol = 1;` |
	| `java.lang.String` | `[getSystem](#getSystem())()` | `required string system = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getSystemBytes](#getSystemBytes())()` | `required string system = 2;` |
	| `boolean` | `[hasHost](#hasHost())()` | `required string host = 3;` |
	| `boolean` | `[hasPort](#hasPort())()` | `required int32 port = 4;` |
	| `boolean` | `[hasProtocol](#hasProtocol())()` | `required string protocol = 1;` |
	| `boolean` | `[hasSystem](#hasSystem())()` | `required string system = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[mergeFrom](#mergeFrom(akka.remote.testconductor.TestConductorProtocol.Address))​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") other)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setHost](#setHost(java.lang.String))​(java.lang.String value)` | `required string host = 3;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setHostBytes](#setHostBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string host = 3;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setPort](#setPort(int))​(int value)` | `required int32 port = 4;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `required string protocol = 1;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string protocol = 1;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 2;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 2;` |
	| `[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### clear
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### setField
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### clearField
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### clearOneof
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### setRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### addRepeatedField
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") mergeFrom​([TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeFrom
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		Throws:
		`java.io.IOException`
		- #### hasProtocol
		
		
		
		```
		public boolean hasProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[hasProtocol](TestConductorProtocol.AddressOrBuilder.html#hasProtocol())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocol](TestConductorProtocol.AddressOrBuilder.html#getProtocol())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocolBytes](TestConductorProtocol.AddressOrBuilder.html#getProtocolBytes())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setProtocol​(java.lang.String value)
		```
		
		`required string protocol = 1;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearProtocol()
		```
		
		`required string protocol = 1;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string protocol = 1;`
		
		Parameters:
		`value` \- The bytes for protocol to set.
		Returns:
		This builder for chaining.
		- #### hasSystem
		
		
		
		```
		public boolean hasSystem()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[hasSystem](TestConductorProtocol.AddressOrBuilder.html#hasSystem())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystem](TestConductorProtocol.AddressOrBuilder.html#getSystem())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystemBytes](TestConductorProtocol.AddressOrBuilder.html#getSystemBytes())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setSystem​(java.lang.String value)
		```
		
		`required string system = 2;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearSystem()
		```
		
		`required string system = 2;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setSystemBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string system = 2;`
		
		Parameters:
		`value` \- The bytes for system to set.
		Returns:
		This builder for chaining.
		- #### hasHost
		
		
		
		```
		public boolean hasHost()
		```
		
		`required string host = 3;`
		
		Specified by:
		`[hasHost](TestConductorProtocol.AddressOrBuilder.html#hasHost())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the host field is set.
		- #### getHost
		
		
		
		```
		public java.lang.String getHost()
		```
		
		`required string host = 3;`
		
		Specified by:
		`[getHost](TestConductorProtocol.AddressOrBuilder.html#getHost())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The host.
		- #### getHostBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostBytes()
		```
		
		`required string host = 3;`
		
		Specified by:
		`[getHostBytes](TestConductorProtocol.AddressOrBuilder.html#getHostBytes())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for host.
		- #### setHost
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setHost​(java.lang.String value)
		```
		
		`required string host = 3;`
		
		Parameters:
		`value` \- The host to set.
		Returns:
		This builder for chaining.
		- #### clearHost
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearHost()
		```
		
		`required string host = 3;`
		
		Returns:
		This builder for chaining.
		- #### setHostBytes
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setHostBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string host = 3;`
		
		Parameters:
		`value` \- The bytes for host to set.
		Returns:
		This builder for chaining.
		- #### hasPort
		
		
		
		```
		public boolean hasPort()
		```
		
		`required int32 port = 4;`
		
		Specified by:
		`[hasPort](TestConductorProtocol.AddressOrBuilder.html#hasPort())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required int32 port = 4;`
		
		Specified by:
		`[getPort](TestConductorProtocol.AddressOrBuilder.html#getPort())` in interface `[TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setPort​(int value)
		```
		
		`required int32 port = 4;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") clearPort()
		```
		
		`required int32 port = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html)*