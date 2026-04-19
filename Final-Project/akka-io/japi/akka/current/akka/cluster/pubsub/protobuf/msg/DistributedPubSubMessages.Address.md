---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html
title: DistributedPubSubMessages.Address.Builder
---

# DistributedPubSubMessages.Address.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

```

 Defines a remote address.
 
```

 Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearHostname](#clearHostname())()` | `required string hostname = 2;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPort](#clearPort())()` | `required uint32 port = 3;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearProtocol](#clearProtocol())()` | `optional string protocol = 4;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearSystem](#clearSystem())()` | `required string system = 1;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getHostname](#getHostname())()` | `required string hostname = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getHostnameBytes](#getHostnameBytes())()` | `required string hostname = 2;` |
	| `int` | `[getPort](#getPort())()` | `required uint32 port = 3;` |
	| `java.lang.String` | `[getProtocol](#getProtocol())()` | `optional string protocol = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getProtocolBytes](#getProtocolBytes())()` | `optional string protocol = 4;` |
	| `java.lang.String` | `[getSystem](#getSystem())()` | `required string system = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getSystemBytes](#getSystemBytes())()` | `required string system = 1;` |
	| `boolean` | `[hasHostname](#hasHostname())()` | `required string hostname = 2;` |
	| `boolean` | `[hasPort](#hasPort())()` | `required uint32 port = 3;` |
	| `boolean` | `[hasProtocol](#hasProtocol())()` | `optional string protocol = 4;` |
	| `boolean` | `[hasSystem](#hasSystem())()` | `required string system = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address))​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 2;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 2;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 3;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `optional string protocol = 4;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string protocol = 4;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 1;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 1;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSystem
		
		
		
		```
		public boolean hasSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[hasSystem](DistributedPubSubMessages.AddressOrBuilder.html#hasSystem())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystem](DistributedPubSubMessages.AddressOrBuilder.html#getSystem())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystemBytes](DistributedPubSubMessages.AddressOrBuilder.html#getSystemBytes())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setSystem​(java.lang.String value)
		```
		
		`required string system = 1;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearSystem()
		```
		
		`required string system = 1;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setSystemBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string system = 1;`
		
		Parameters:
		`value` \- The bytes for system to set.
		Returns:
		This builder for chaining.
		- #### hasHostname
		
		
		
		```
		public boolean hasHostname()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[hasHostname](DistributedPubSubMessages.AddressOrBuilder.html#hasHostname())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostname](DistributedPubSubMessages.AddressOrBuilder.html#getHostname())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostnameBytes](DistributedPubSubMessages.AddressOrBuilder.html#getHostnameBytes())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 2;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearHostname()
		```
		
		`required string hostname = 2;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string hostname = 2;`
		
		Parameters:
		`value` \- The bytes for hostname to set.
		Returns:
		This builder for chaining.
		- #### hasPort
		
		
		
		```
		public boolean hasPort()
		```
		
		`required uint32 port = 3;`
		
		Specified by:
		`[hasPort](DistributedPubSubMessages.AddressOrBuilder.html#hasPort())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 3;`
		
		Specified by:
		`[getPort](DistributedPubSubMessages.AddressOrBuilder.html#getPort())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPort​(int value)
		```
		
		`required uint32 port = 3;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPort()
		```
		
		`required uint32 port = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasProtocol
		
		
		
		```
		public boolean hasProtocol()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[hasProtocol](DistributedPubSubMessages.AddressOrBuilder.html#hasProtocol())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocol](DistributedPubSubMessages.AddressOrBuilder.html#getProtocol())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocolBytes](DistributedPubSubMessages.AddressOrBuilder.html#getProtocolBytes())` in interface `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setProtocol​(java.lang.String value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearProtocol()
		```
		
		`optional string protocol = 4;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The bytes for protocol to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html)*