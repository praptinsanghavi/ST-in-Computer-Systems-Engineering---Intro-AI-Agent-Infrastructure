---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.Builder.html
title: ArteryControlFormats.MessageWithAddress.Builder
---

# ArteryControlFormats.MessageWithAddress.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.MessageWithAddress.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.MessageWithAddress.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.MessageWithAddress.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")
```

```

 Generic message declaration that is used for all types of message that (currently) have a single
 address field. A message that needs to changed later can be cloned from this one and then adapted.
 ActorSystemTerminating
 ActorSystemTerminating.Ack
 OutboundHandshake.HandshakeRsp
 
```

 Protobuf type `MessageWithAddress`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[clearAddress](#clearAddress())()` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getAddress](#getAddress())()` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[getAddressBuilder](#getAddressBuilder())()` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .UniqueAddress address = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[mergeAddress](#mergeAddress(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.MessageWithAddress))​([ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[setAddress](#setAddress(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[setAddress](#setAddress(akka.remote.ArteryControlFormats.UniqueAddress.Builder))​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)` | `required .UniqueAddress address = 1;` |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        int index,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .UniqueAddress address = 1;`
		
		Specified by:
		`[hasAddress](ArteryControlFormats.MessageWithAddressOrBuilder.html#hasAddress())` in interface `[ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getAddress()
		```
		
		`required .UniqueAddress address = 1;`
		
		Specified by:
		`[getAddress](ArteryControlFormats.MessageWithAddressOrBuilder.html#getAddress())` in interface `[ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") setAddress​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress address = 1;`
		- #### setAddress
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") setAddress​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .UniqueAddress address = 1;`
		- #### mergeAddress
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") mergeAddress​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress address = 1;`
		- #### clearAddress
		
		
		
		```
		public [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") clearAddress()
		```
		
		`required .UniqueAddress address = 1;`
		- #### getAddressBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") getAddressBuilder()
		```
		
		`required .UniqueAddress address = 1;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote") getAddressOrBuilder()
		```
		
		`required .UniqueAddress address = 1;`
		
		Specified by:
		`[getAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html#getAddressOrBuilder())` in interface `[ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.MessageWithAddress.Builder.html)*