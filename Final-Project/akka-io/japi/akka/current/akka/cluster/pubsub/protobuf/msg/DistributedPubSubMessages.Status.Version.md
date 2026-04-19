---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.Builder.html
title: DistributedPubSubMessages.Status.Version.Builder
---

# DistributedPubSubMessages.Status.Version.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Status.Version.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status.Version.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Status.Version.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Status.Version`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearAddress](#clearAddress())()` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 2;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getAddress](#getAddress())()` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getAddressBuilder](#getAddressBuilder())()` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeAddress](#mergeAddress(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address))​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status.Version))​([DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address))​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address.Builder))​([DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 2;` |
	| `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         int index,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[hasAddress](DistributedPubSubMessages.Status.VersionOrBuilder.html#hasAddress())` in interface `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") getAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddress](DistributedPubSubMessages.Status.VersionOrBuilder.html#getAddress())` in interface `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setAddress​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### setAddress
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setAddress​([DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`required .Address address = 1;`
		- #### mergeAddress
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeAddress​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### clearAddress
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearAddress()
		```
		
		`required .Address address = 1;`
		- #### getAddressBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") getAddressBuilder()
		```
		
		`required .Address address = 1;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getAddressOrBuilder()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddressOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html#getAddressOrBuilder())` in interface `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[hasTimestamp](DistributedPubSubMessages.Status.VersionOrBuilder.html#hasTimestamp())` in interface `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[getTimestamp](DistributedPubSubMessages.Status.VersionOrBuilder.html#getTimestamp())` in interface `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 2;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.Builder.html)*