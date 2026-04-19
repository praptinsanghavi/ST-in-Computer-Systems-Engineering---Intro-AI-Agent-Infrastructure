---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html
title: ClusterMessages.Address.Builder
---

# ClusterMessages.Address.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Address.Builder

- All Implemented Interfaces:
`[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Defines a remote address.
 
```

 Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearHostname](#clearHostname())()` | `required string hostname = 2;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearPort](#clearPort())()` | `required uint32 port = 3;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearProtocol](#clearProtocol())()` | `optional string protocol = 4;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSystem](#clearSystem())()` | `required string system = 1;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
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
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Address))​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 2;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 2;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 3;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `optional string protocol = 4;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string protocol = 4;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 1;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 1;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        int index,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSystem
		
		
		
		```
		public boolean hasSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[hasSystem](ClusterMessages.AddressOrBuilder.html#hasSystem())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystem](ClusterMessages.AddressOrBuilder.html#getSystem())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystemBytes](ClusterMessages.AddressOrBuilder.html#getSystemBytes())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setSystem​(java.lang.String value)
		```
		
		`required string system = 1;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearSystem()
		```
		
		`required string system = 1;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setSystemBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasHostname](ClusterMessages.AddressOrBuilder.html#hasHostname())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostname](ClusterMessages.AddressOrBuilder.html#getHostname())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostnameBytes](ClusterMessages.AddressOrBuilder.html#getHostnameBytes())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 2;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearHostname()
		```
		
		`required string hostname = 2;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasPort](ClusterMessages.AddressOrBuilder.html#hasPort())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 3;`
		
		Specified by:
		`[getPort](ClusterMessages.AddressOrBuilder.html#getPort())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setPort​(int value)
		```
		
		`required uint32 port = 3;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearPort()
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
		`[hasProtocol](ClusterMessages.AddressOrBuilder.html#hasProtocol())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocol](ClusterMessages.AddressOrBuilder.html#getProtocol())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocolBytes](ClusterMessages.AddressOrBuilder.html#getProtocolBytes())` in interface `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setProtocol​(java.lang.String value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") clearProtocol()
		```
		
		`optional string protocol = 4;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The bytes for protocol to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html)*