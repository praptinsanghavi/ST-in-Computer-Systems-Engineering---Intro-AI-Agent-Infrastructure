---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html
title: ClusterShardingMessages.Address.Builder
---

# ClusterShardingMessages.Address.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

```

 Defines a remote address.
 
```

 Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearHostname](#clearHostname())()` | `required string hostname = 3;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearPort](#clearPort())()` | `required uint32 port = 4;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearProtocol](#clearProtocol())()` | `required string protocol = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearSystem](#clearSystem())()` | `required string system = 2;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getHostname](#getHostname())()` | `required string hostname = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getHostnameBytes](#getHostnameBytes())()` | `required string hostname = 3;` |
	| `int` | `[getPort](#getPort())()` | `required uint32 port = 4;` |
	| `java.lang.String` | `[getProtocol](#getProtocol())()` | `required string protocol = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getProtocolBytes](#getProtocolBytes())()` | `required string protocol = 1;` |
	| `java.lang.String` | `[getSystem](#getSystem())()` | `required string system = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getSystemBytes](#getSystemBytes())()` | `required string system = 2;` |
	| `boolean` | `[hasHostname](#hasHostname())()` | `required string hostname = 3;` |
	| `boolean` | `[hasPort](#hasPort())()` | `required uint32 port = 4;` |
	| `boolean` | `[hasProtocol](#hasProtocol())()` | `required string protocol = 1;` |
	| `boolean` | `[hasSystem](#hasSystem())()` | `required string system = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 3;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 3;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 4;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `required string protocol = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string protocol = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 2;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 2;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasProtocol
		
		
		
		```
		public boolean hasProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[hasProtocol](ClusterShardingMessages.AddressOrBuilder.html#hasProtocol())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocol](ClusterShardingMessages.AddressOrBuilder.html#getProtocol())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocolBytes](ClusterShardingMessages.AddressOrBuilder.html#getProtocolBytes())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setProtocol​(java.lang.String value)
		```
		
		`required string protocol = 1;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearProtocol()
		```
		
		`required string protocol = 1;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasSystem](ClusterShardingMessages.AddressOrBuilder.html#hasSystem())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystem](ClusterShardingMessages.AddressOrBuilder.html#getSystem())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystemBytes](ClusterShardingMessages.AddressOrBuilder.html#getSystemBytes())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setSystem​(java.lang.String value)
		```
		
		`required string system = 2;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearSystem()
		```
		
		`required string system = 2;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setSystemBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string system = 2;`
		
		Parameters:
		`value` \- The bytes for system to set.
		Returns:
		This builder for chaining.
		- #### hasHostname
		
		
		
		```
		public boolean hasHostname()
		```
		
		`required string hostname = 3;`
		
		Specified by:
		`[hasHostname](ClusterShardingMessages.AddressOrBuilder.html#hasHostname())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 3;`
		
		Specified by:
		`[getHostname](ClusterShardingMessages.AddressOrBuilder.html#getHostname())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 3;`
		
		Specified by:
		`[getHostnameBytes](ClusterShardingMessages.AddressOrBuilder.html#getHostnameBytes())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 3;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearHostname()
		```
		
		`required string hostname = 3;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string hostname = 3;`
		
		Parameters:
		`value` \- The bytes for hostname to set.
		Returns:
		This builder for chaining.
		- #### hasPort
		
		
		
		```
		public boolean hasPort()
		```
		
		`required uint32 port = 4;`
		
		Specified by:
		`[hasPort](ClusterShardingMessages.AddressOrBuilder.html#hasPort())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 4;`
		
		Specified by:
		`[getPort](ClusterShardingMessages.AddressOrBuilder.html#getPort())` in interface `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setPort​(int value)
		```
		
		`required uint32 port = 4;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearPort()
		```
		
		`required uint32 port = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html)*