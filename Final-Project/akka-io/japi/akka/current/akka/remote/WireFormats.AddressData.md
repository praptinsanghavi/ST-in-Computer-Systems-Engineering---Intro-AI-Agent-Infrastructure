---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html
title: WireFormats.AddressData.Builder
---

# WireFormats.AddressData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AddressData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AddressData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")

---

```
public static final class WireFormats.AddressData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>
implements [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")
```

```

 Defines a remote address.
 
```

 Protobuf type `AddressData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearHostname](#clearHostname())()` | `required string hostname = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearPort](#clearPort())()` | `required uint32 port = 3;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearProtocol](#clearProtocol())()` | `optional string protocol = 4;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clearSystem](#clearSystem())()` | `required string system = 1;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
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
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") other)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setHostname](#setHostname(java.lang.String))​(java.lang.String value)` | `required string hostname = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setHostnameBytes](#setHostnameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string hostname = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setPort](#setPort(int))​(int value)` | `required uint32 port = 3;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setProtocol](#setProtocol(java.lang.String))​(java.lang.String value)` | `optional string protocol = 4;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setProtocolBytes](#setProtocolBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string protocol = 4;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setSystem](#setSystem(java.lang.String))​(java.lang.String value)` | `required string system = 1;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setSystemBytes](#setSystemBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string system = 1;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        int index,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasSystem
		
		
		
		```
		public boolean hasSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[hasSystem](WireFormats.AddressDataOrBuilder.html#hasSystem())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the system field is set.
		- #### getSystem
		
		
		
		```
		public java.lang.String getSystem()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystem](WireFormats.AddressDataOrBuilder.html#getSystem())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The system.
		- #### getSystemBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSystemBytes()
		```
		
		`required string system = 1;`
		
		Specified by:
		`[getSystemBytes](WireFormats.AddressDataOrBuilder.html#getSystemBytes())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for system.
		- #### setSystem
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setSystem​(java.lang.String value)
		```
		
		`required string system = 1;`
		
		Parameters:
		`value` \- The system to set.
		Returns:
		This builder for chaining.
		- #### clearSystem
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearSystem()
		```
		
		`required string system = 1;`
		
		Returns:
		This builder for chaining.
		- #### setSystemBytes
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setSystemBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasHostname](WireFormats.AddressDataOrBuilder.html#hasHostname())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the hostname field is set.
		- #### getHostname
		
		
		
		```
		public java.lang.String getHostname()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostname](WireFormats.AddressDataOrBuilder.html#getHostname())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The hostname.
		- #### getHostnameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getHostnameBytes()
		```
		
		`required string hostname = 2;`
		
		Specified by:
		`[getHostnameBytes](WireFormats.AddressDataOrBuilder.html#getHostnameBytes())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for hostname.
		- #### setHostname
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setHostname​(java.lang.String value)
		```
		
		`required string hostname = 2;`
		
		Parameters:
		`value` \- The hostname to set.
		Returns:
		This builder for chaining.
		- #### clearHostname
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearHostname()
		```
		
		`required string hostname = 2;`
		
		Returns:
		This builder for chaining.
		- #### setHostnameBytes
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setHostnameBytes​(akka.protobufv3.internal.ByteString value)
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
		`[hasPort](WireFormats.AddressDataOrBuilder.html#hasPort())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the port field is set.
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		`required uint32 port = 3;`
		
		Specified by:
		`[getPort](WireFormats.AddressDataOrBuilder.html#getPort())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The port.
		- #### setPort
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setPort​(int value)
		```
		
		`required uint32 port = 3;`
		
		Parameters:
		`value` \- The port to set.
		Returns:
		This builder for chaining.
		- #### clearPort
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearPort()
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
		`[hasProtocol](WireFormats.AddressDataOrBuilder.html#hasProtocol())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the protocol field is set.
		- #### getProtocol
		
		
		
		```
		public java.lang.String getProtocol()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocol](WireFormats.AddressDataOrBuilder.html#getProtocol())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The protocol.
		- #### getProtocolBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getProtocolBytes()
		```
		
		`optional string protocol = 4;`
		
		Specified by:
		`[getProtocolBytes](WireFormats.AddressDataOrBuilder.html#getProtocolBytes())` in interface `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for protocol.
		- #### setProtocol
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setProtocol​(java.lang.String value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The protocol to set.
		Returns:
		This builder for chaining.
		- #### clearProtocol
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") clearProtocol()
		```
		
		`optional string protocol = 4;`
		
		Returns:
		This builder for chaining.
		- #### setProtocolBytes
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setProtocolBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string protocol = 4;`
		
		Parameters:
		`value` \- The bytes for protocol to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html)*