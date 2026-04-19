---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html
title: ClusterMetricsMessages.Address.Builder
---

# ClusterMetricsMessages.Address.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

```

 Defines a remote address.
 
```

 Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearHostname](#clearHostname())()` | `required string hostname = 2;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearPort](#clearPort())()` | `required uint32 port = 3;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearProtocol](#clearProtocol())()` | `optional string protocol = 4;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearSystem](#clearSystem())()` | `required string system = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
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
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 2;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 2;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 3;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `optional string protocol = 4;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string protocol = 4;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSystem
		
		
		
		```
		public boolean hasSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[hasSystem](ClusterMetricsMessages.AddressOrBuilder.html#hasSystem())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystem](ClusterMetricsMessages.AddressOrBuilder.html#getSystem())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystemBytes](ClusterMetricsMessages.AddressOrBuilder.html#getSystemBytes())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSystem​(java.lang.String value)
		```
		
		`required string system = 1;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearSystem()
		```
		
		`required string system = 1;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSystemBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasHostname](ClusterMetricsMessages.AddressOrBuilder.html#hasHostname())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostname](ClusterMetricsMessages.AddressOrBuilder.html#getHostname())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostnameBytes](ClusterMetricsMessages.AddressOrBuilder.html#getHostnameBytes())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 2;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearHostname()
		```
		
		`required string hostname = 2;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasPort](ClusterMetricsMessages.AddressOrBuilder.html#hasPort())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 3;`
		
		Specified by:
		`[getPort](ClusterMetricsMessages.AddressOrBuilder.html#getPort())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setPort​(int value)
		```
		
		`required uint32 port = 3;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearPort()
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
		`[hasProtocol](ClusterMetricsMessages.AddressOrBuilder.html#hasProtocol())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocol](ClusterMetricsMessages.AddressOrBuilder.html#getProtocol())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocolBytes](ClusterMetricsMessages.AddressOrBuilder.html#getProtocolBytes())` in interface `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setProtocol​(java.lang.String value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearProtocol()
		```
		
		`optional string protocol = 4;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The bytes for protocol to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html)*