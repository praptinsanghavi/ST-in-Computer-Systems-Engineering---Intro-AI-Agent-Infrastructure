---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReq.Builder.html
title: ArteryControlFormats.HandshakeReq.Builder
---

# ArteryControlFormats.HandshakeReq.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.HandshakeReq.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.HandshakeReq.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.HandshakeReq.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")
```

Protobuf type `HandshakeReq`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clearTo](#clearTo())()` | `required .Address to = 2;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote")` | `[getTo](#getTo())()` | `required .Address to = 2;` |
	| `[ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote")` | `[getToBuilder](#getToBuilder())()` | `required .Address to = 2;` |
	| `[ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote")` | `[getToOrBuilder](#getToOrBuilder())()` | `required .Address to = 2;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasTo](#hasTo())()` | `required .Address to = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.HandshakeReq))​([ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeTo](#mergeTo(akka.remote.ArteryControlFormats.Address))​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") value)` | `required .Address to = 2;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress.Builder))​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setTo](#setTo(akka.remote.ArteryControlFormats.Address))​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") value)` | `required .Address to = 2;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setTo](#setTo(akka.remote.ArteryControlFormats.Address.Builder))​([ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") builderForValue)` | `required .Address to = 2;` |
	| `[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ArteryControlFormats.HandshakeReqOrBuilder.html#hasFrom())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ArteryControlFormats.HandshakeReqOrBuilder.html#getFrom())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clearFrom()
		```
		
		`required .UniqueAddress from = 1;`
		- #### getFromBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") getFromBuilder()
		```
		
		`required .UniqueAddress from = 1;`
		- #### getFromOrBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote") getFromOrBuilder()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFromOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html#getFromOrBuilder())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		- #### hasTo
		
		
		
		```
		public boolean hasTo()
		```
		
		`required .Address to = 2;`
		
		Specified by:
		`[hasTo](ArteryControlFormats.HandshakeReqOrBuilder.html#hasTo())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the to field is set.
		- #### getTo
		
		
		
		```
		public [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") getTo()
		```
		
		`required .Address to = 2;`
		
		Specified by:
		`[getTo](ArteryControlFormats.HandshakeReqOrBuilder.html#getTo())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		Returns:
		The to.
		- #### setTo
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setTo​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") value)
		```
		
		`required .Address to = 2;`
		- #### setTo
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setTo​([ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Address to = 2;`
		- #### mergeTo
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeTo​([ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") value)
		```
		
		`required .Address to = 2;`
		- #### clearTo
		
		
		
		```
		public [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") clearTo()
		```
		
		`required .Address to = 2;`
		- #### getToBuilder
		
		
		
		```
		public [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") getToBuilder()
		```
		
		`required .Address to = 2;`
		- #### getToOrBuilder
		
		
		
		```
		public [ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote") getToOrBuilder()
		```
		
		`required .Address to = 2;`
		
		Specified by:
		`[getToOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html#getToOrBuilder())` in interface `[ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReq.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReq.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReqOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReq.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/ArteryControlFormats.HandshakeReq.Builder.html)*