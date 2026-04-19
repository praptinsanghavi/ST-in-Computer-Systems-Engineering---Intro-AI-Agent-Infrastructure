---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html
title: ArteryControlFormats.CompressionTableAdvertisementAck.Builder
---

# ArteryControlFormats.CompressionTableAdvertisementAck.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.CompressionTableAdvertisementAck.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.CompressionTableAdvertisementAck.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.CompressionTableAdvertisementAck.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")
```

```

 CompressionProtocol.ActorRefCompressionAdvertisementAck
 CompressionProtocol.ClassManifestCompressionAdvertisementAck
 
```

 Protobuf type `CompressionTableAdvertisementAck`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clearVersion](#clearVersion())()` | `required uint32 version = 2;` |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `int` | `[getVersion](#getVersion())()` | `required uint32 version = 2;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required uint32 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.CompressionTableAdvertisementAck))​([ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress.Builder))​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")` | `[setVersion](#setVersion(int))​(int value)` | `required uint32 version = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                      int index,
		                                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html#hasFrom())` in interface `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html#getFrom())` in interface `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clearFrom()
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
		`[getFromOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html#getFromOrBuilder())` in interface `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required uint32 version = 2;`
		
		Specified by:
		`[hasVersion](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html#hasVersion())` in interface `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public int getVersion()
		```
		
		`required uint32 version = 2;`
		
		Specified by:
		`[getVersion](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html#getVersion())` in interface `[ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setVersion​(int value)
		```
		
		`required uint32 version = 2;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") clearVersion()
		```
		
		`required uint32 version = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html)*