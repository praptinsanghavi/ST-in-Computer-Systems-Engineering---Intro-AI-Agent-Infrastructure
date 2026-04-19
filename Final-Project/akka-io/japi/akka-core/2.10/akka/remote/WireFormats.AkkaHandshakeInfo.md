---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfo.Builder.html
title: WireFormats.AkkaHandshakeInfo.Builder
---

# WireFormats.AkkaHandshakeInfo.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AkkaHandshakeInfo.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AkkaHandshakeInfo.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote")

---

```
public static final class WireFormats.AkkaHandshakeInfo.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>
implements [WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")
```

Protobuf type `AkkaHandshakeInfo`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clearCookie](#clearCookie())()` | `optional string cookie = 3;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clearOrigin](#clearOrigin())()` | `required .AddressData origin = 1;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clearUid](#clearUid())()` | `required fixed64 uid = 2;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getCookie](#getCookie())()` | `optional string cookie = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getCookieBytes](#getCookieBytes())()` | `optional string cookie = 3;` |
	| `[WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[getOrigin](#getOrigin())()` | `required .AddressData origin = 1;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[getOriginBuilder](#getOriginBuilder())()` | `required .AddressData origin = 1;` |
	| `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")` | `[getOriginOrBuilder](#getOriginOrBuilder())()` | `required .AddressData origin = 1;` |
	| `long` | `[getUid](#getUid())()` | `required fixed64 uid = 2;` |
	| `boolean` | `[hasCookie](#hasCookie())()` | `optional string cookie = 3;` |
	| `boolean` | `[hasOrigin](#hasOrigin())()` | `required .AddressData origin = 1;` |
	| `boolean` | `[hasUid](#hasUid())()` | `required fixed64 uid = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AkkaHandshakeInfo))​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") other)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[mergeOrigin](#mergeOrigin(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `required .AddressData origin = 1;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setCookie](#setCookie(java.lang.String))​(java.lang.String value)` | `optional string cookie = 3;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setCookieBytes](#setCookieBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string cookie = 3;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setOrigin](#setOrigin(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `required .AddressData origin = 1;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setOrigin](#setOrigin(akka.remote.WireFormats.AddressData.Builder))​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)` | `required .AddressData origin = 1;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setUid](#setUid(long))​(long value)` | `required fixed64 uid = 2;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasOrigin
		
		
		
		```
		public boolean hasOrigin()
		```
		
		`required .AddressData origin = 1;`
		
		Specified by:
		`[hasOrigin](WireFormats.AkkaHandshakeInfoOrBuilder.html#hasOrigin())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the origin field is set.
		- #### getOrigin
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") getOrigin()
		```
		
		`required .AddressData origin = 1;`
		
		Specified by:
		`[getOrigin](WireFormats.AkkaHandshakeInfoOrBuilder.html#getOrigin())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The origin.
		- #### setOrigin
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setOrigin​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`required .AddressData origin = 1;`
		- #### setOrigin
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setOrigin​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .AddressData origin = 1;`
		- #### mergeOrigin
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") mergeOrigin​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`required .AddressData origin = 1;`
		- #### clearOrigin
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clearOrigin()
		```
		
		`required .AddressData origin = 1;`
		- #### getOriginBuilder
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") getOriginBuilder()
		```
		
		`required .AddressData origin = 1;`
		- #### getOriginOrBuilder
		
		
		
		```
		public [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote") getOriginOrBuilder()
		```
		
		`required .AddressData origin = 1;`
		
		Specified by:
		`[getOriginOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html#getOriginOrBuilder())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required fixed64 uid = 2;`
		
		Specified by:
		`[hasUid](WireFormats.AkkaHandshakeInfoOrBuilder.html#hasUid())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public long getUid()
		```
		
		`required fixed64 uid = 2;`
		
		Specified by:
		`[getUid](WireFormats.AkkaHandshakeInfoOrBuilder.html#getUid())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The uid.
		- #### setUid
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setUid​(long value)
		```
		
		`required fixed64 uid = 2;`
		
		Parameters:
		`value` \- The uid to set.
		Returns:
		This builder for chaining.
		- #### clearUid
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clearUid()
		```
		
		`required fixed64 uid = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasCookie
		
		
		
		```
		public boolean hasCookie()
		```
		
		`optional string cookie = 3;`
		
		Specified by:
		`[hasCookie](WireFormats.AkkaHandshakeInfoOrBuilder.html#hasCookie())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the cookie field is set.
		- #### getCookie
		
		
		
		```
		public java.lang.String getCookie()
		```
		
		`optional string cookie = 3;`
		
		Specified by:
		`[getCookie](WireFormats.AkkaHandshakeInfoOrBuilder.html#getCookie())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The cookie.
		- #### getCookieBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getCookieBytes()
		```
		
		`optional string cookie = 3;`
		
		Specified by:
		`[getCookieBytes](WireFormats.AkkaHandshakeInfoOrBuilder.html#getCookieBytes())` in interface `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for cookie.
		- #### setCookie
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setCookie​(java.lang.String value)
		```
		
		`optional string cookie = 3;`
		
		Parameters:
		`value` \- The cookie to set.
		Returns:
		This builder for chaining.
		- #### clearCookie
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") clearCookie()
		```
		
		`optional string cookie = 3;`
		
		Returns:
		This builder for chaining.
		- #### setCookieBytes
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setCookieBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string cookie = 3;`
		
		Parameters:
		`value` \- The bytes for cookie to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AddressData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AddressData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AddressDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfo.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfoOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfo.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.AkkaHandshakeInfo.Builder.html)*