---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
title: ClusterMessages.UniqueAddress.Builder
---

# ClusterMessages.UniqueAddress.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.UniqueAddress.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder

- All Implemented Interfaces:
`[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.UniqueAddress.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Defines a remote address with uid.
 
```

 Protobuf type `UniqueAddress`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAddress](#clearAddress())()` | `required .Address address = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearUid](#clearUid())()` | `required uint32 uid = 2;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearUid2](#clearUid2())()` | 64 bit uids but with backward wire compatibility |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")` | `[getAddress](#getAddress())()` | `required .Address address = 1;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[getAddressBuilder](#getAddressBuilder())()` | `required .Address address = 1;` |
	| `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 1;` |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getUid](#getUid())()` | `required uint32 uid = 2;` |
	| `int` | `[getUid2](#getUid2())()` | 64 bit uids but with backward wire compatibility |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 1;` |
	| `boolean` | `[hasUid](#hasUid())()` | `required uint32 uid = 2;` |
	| `boolean` | `[hasUid2](#hasUid2())()` | 64 bit uids but with backward wire compatibility |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeAddress](#mergeAddress(akka.cluster.protobuf.msg.ClusterMessages.Address))​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.protobuf.msg.ClusterMessages.Address))​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.protobuf.msg.ClusterMessages.Address.Builder))​([ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .Address address = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUid](#setUid(int))​(int value)` | `required uint32 uid = 2;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUid2](#setUid2(int))​(int value)` | 64 bit uids but with backward wire compatibility |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[hasAddress](ClusterMessages.UniqueAddressOrBuilder.html#hasAddress())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") getAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddress](ClusterMessages.UniqueAddressOrBuilder.html#getAddress())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setAddress​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### setAddress
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setAddress​([ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .Address address = 1;`
		- #### mergeAddress
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") mergeAddress​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### clearAddress
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clearAddress()
		```
		
		`required .Address address = 1;`
		- #### getAddressBuilder
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") getAddressBuilder()
		```
		
		`required .Address address = 1;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getAddressOrBuilder()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html#getAddressOrBuilder())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required uint32 uid = 2;`
		
		Specified by:
		`[hasUid](ClusterMessages.UniqueAddressOrBuilder.html#hasUid())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public int getUid()
		```
		
		`required uint32 uid = 2;`
		
		Specified by:
		`[getUid](ClusterMessages.UniqueAddressOrBuilder.html#getUid())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The uid.
		- #### setUid
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setUid​(int value)
		```
		
		`required uint32 uid = 2;`
		
		Parameters:
		`value` \- The uid to set.
		Returns:
		This builder for chaining.
		- #### clearUid
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clearUid()
		```
		
		`required uint32 uid = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasUid2
		
		
		
		```
		public boolean hasUid2()
		```
		
		
		```
		
		 64 bit uids but with backward wire compatibility
		 
		```
		
		`optional uint32 uid2 = 3;`
		
		Specified by:
		`[hasUid2](ClusterMessages.UniqueAddressOrBuilder.html#hasUid2())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the uid2 field is set.
		- #### getUid2
		
		
		
		```
		public int getUid2()
		```
		
		
		```
		
		 64 bit uids but with backward wire compatibility
		 
		```
		
		`optional uint32 uid2 = 3;`
		
		Specified by:
		`[getUid2](ClusterMessages.UniqueAddressOrBuilder.html#getUid2())` in interface `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The uid2\.
		- #### setUid2
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setUid2​(int value)
		```
		
		
		```
		
		 64 bit uids but with backward wire compatibility
		 
		```
		
		`optional uint32 uid2 = 3;`
		
		Parameters:
		`value` \- The uid2 to set.
		Returns:
		This builder for chaining.
		- #### clearUid2
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") clearUid2()
		```
		
		
		```
		
		 64 bit uids but with backward wire compatibility
		 
		```
		
		`optional uint32 uid2 = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html)*