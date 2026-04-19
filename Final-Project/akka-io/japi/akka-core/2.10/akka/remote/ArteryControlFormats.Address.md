---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.Builder.html
title: ArteryControlFormats.Address.Builder
---

# ArteryControlFormats.Address.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.Address.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.Address.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.Address.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")
```

```

 Defines a remote address.
 
```

 Protobuf type `Address`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearHostname](#clearHostname())()` | `required string hostname = 3;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearPort](#clearPort())()` | `required uint32 port = 4;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearProtocol](#clearProtocol())()` | `required string protocol = 1;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clearSystem](#clearSystem())()` | `required string system = 2;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
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
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.Address))​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 3;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 3;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 4;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `required string protocol = 1;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string protocol = 1;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 2;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 2;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasProtocol
		
		
		
		```
		public boolean hasProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[hasProtocol](ArteryControlFormats.AddressOrBuilder.html#hasProtocol())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocol](ArteryControlFormats.AddressOrBuilder.html#getProtocol())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`required string protocol = 1;`
		
		Specified by:
		`[getProtocolBytes](ArteryControlFormats.AddressOrBuilder.html#getProtocolBytes())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setProtocol​(java.lang.String value)
		```
		
		`required string protocol = 1;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearProtocol()
		```
		
		`required string protocol = 1;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasSystem](ArteryControlFormats.AddressOrBuilder.html#hasSystem())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystem](ArteryControlFormats.AddressOrBuilder.html#getSystem())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 2;`
		
		Specified by:
		`[getSystemBytes](ArteryControlFormats.AddressOrBuilder.html#getSystemBytes())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setSystem​(java.lang.String value)
		```
		
		`required string system = 2;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearSystem()
		```
		
		`required string system = 2;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setSystemBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasHostname](ArteryControlFormats.AddressOrBuilder.html#hasHostname())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 3;`
		
		Specified by:
		`[getHostname](ArteryControlFormats.AddressOrBuilder.html#getHostname())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 3;`
		
		Specified by:
		`[getHostnameBytes](ArteryControlFormats.AddressOrBuilder.html#getHostnameBytes())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 3;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearHostname()
		```
		
		`required string hostname = 3;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasPort](ArteryControlFormats.AddressOrBuilder.html#hasPort())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 4;`
		
		Specified by:
		`[getPort](ArteryControlFormats.AddressOrBuilder.html#getPort())` in interface `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setPort​(int value)
		```
		
		`required uint32 port = 4;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") clearPort()
		```
		
		`required uint32 port = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.Address.Builder.html)*