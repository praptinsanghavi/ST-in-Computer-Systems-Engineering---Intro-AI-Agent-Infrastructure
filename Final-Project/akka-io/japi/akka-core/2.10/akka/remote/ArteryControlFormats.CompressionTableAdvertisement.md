---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.Builder.html
title: ArteryControlFormats.CompressionTableAdvertisement.Builder
---

# ArteryControlFormats.CompressionTableAdvertisement.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.CompressionTableAdvertisement.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.CompressionTableAdvertisement.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.CompressionTableAdvertisement.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")
```

```

 CompressionProtocol.ActorRefCompressionAdvertisement
 CompressionProtocol.ClassManifestCompressionAdvertisement
 
```

 Protobuf type `CompressionTableAdvertisement`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addAllKeys](#addAllKeys(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addAllValues](#addAllValues(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | `repeated uint32 values = 5;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addKeys](#addKeys(java.lang.String))​(java.lang.String value)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addKeysBytes](#addKeysBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[addValues](#addValues(int))​(int value)` | `repeated uint32 values = 5;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearKeys](#clearKeys())()` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearOriginUid](#clearOriginUid())()` | `required uint64 originUid = 2;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearTableVersion](#clearTableVersion())()` | `required uint32 tableVersion = 3;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clearValues](#clearValues())()` | `repeated uint32 values = 5;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `java.lang.String` | `[getKeys](#getKeys(int))​(int index)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `akka.protobufv3.internal.ByteString` | `[getKeysBytes](#getKeysBytes(int))​(int index)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `int` | `[getKeysCount](#getKeysCount())()` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getKeysList](#getKeysList())()` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `long` | `[getOriginUid](#getOriginUid())()` | `required uint64 originUid = 2;` |
	| `int` | `[getTableVersion](#getTableVersion())()` | `required uint32 tableVersion = 3;` |
	| `int` | `[getValues](#getValues(int))​(int index)` | `repeated uint32 values = 5;` |
	| `int` | `[getValuesCount](#getValuesCount())()` | `repeated uint32 values = 5;` |
	| `java.util.List<java.lang.Integer>` | `[getValuesList](#getValuesList())()` | `repeated uint32 values = 5;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasOriginUid](#hasOriginUid())()` | `required uint64 originUid = 2;` |
	| `boolean` | `[hasTableVersion](#hasTableVersion())()` | `required uint32 tableVersion = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.CompressionTableAdvertisement))​([ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress))​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setFrom](#setFrom(akka.remote.ArteryControlFormats.UniqueAddress.Builder))​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setKeys](#setKeys(int,java.lang.String))​(int index,  java.lang.String value)` | actual Map is represented by separate sequences of keys and values,  relies on both sequences using the same order so that corresponding entries can be  associated again when deserializing |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setOriginUid](#setOriginUid(long))​(long value)` | `required uint64 originUid = 2;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setTableVersion](#setTableVersion(int))​(int value)` | `required uint32 tableVersion = 3;` |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")` | `[setValues](#setValues(int,int))​(int index,  int value)` | `repeated uint32 values = 5;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                   int index,
		                                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#hasFrom())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getFrom())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setFrom​([ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearFrom()
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
		`[getFromOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getFromOrBuilder())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		- #### hasOriginUid
		
		
		
		```
		public boolean hasOriginUid()
		```
		
		`required uint64 originUid = 2;`
		
		Specified by:
		`[hasOriginUid](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#hasOriginUid())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the originUid field is set.
		- #### getOriginUid
		
		
		
		```
		public long getOriginUid()
		```
		
		`required uint64 originUid = 2;`
		
		Specified by:
		`[getOriginUid](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getOriginUid())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		The originUid.
		- #### setOriginUid
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setOriginUid​(long value)
		```
		
		`required uint64 originUid = 2;`
		
		Parameters:
		`value` \- The originUid to set.
		Returns:
		This builder for chaining.
		- #### clearOriginUid
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearOriginUid()
		```
		
		`required uint64 originUid = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasTableVersion
		
		
		
		```
		public boolean hasTableVersion()
		```
		
		`required uint32 tableVersion = 3;`
		
		Specified by:
		`[hasTableVersion](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#hasTableVersion())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the tableVersion field is set.
		- #### getTableVersion
		
		
		
		```
		public int getTableVersion()
		```
		
		`required uint32 tableVersion = 3;`
		
		Specified by:
		`[getTableVersion](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getTableVersion())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		The tableVersion.
		- #### setTableVersion
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setTableVersion​(int value)
		```
		
		`required uint32 tableVersion = 3;`
		
		Parameters:
		`value` \- The tableVersion to set.
		Returns:
		This builder for chaining.
		- #### clearTableVersion
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearTableVersion()
		```
		
		`required uint32 tableVersion = 3;`
		
		Returns:
		This builder for chaining.
		- #### getKeysList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getKeysList()
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Specified by:
		`[getKeysList](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getKeysList())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the keys.
		- #### getKeysCount
		
		
		
		```
		public int getKeysCount()
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Specified by:
		`[getKeysCount](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getKeysCount())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of keys.
		- #### getKeys
		
		
		
		```
		public java.lang.String getKeys​(int index)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Specified by:
		`[getKeys](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getKeys(int))` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The keys at the given index.
		- #### getKeysBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeysBytes​(int index)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Specified by:
		`[getKeysBytes](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getKeysBytes(int))` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the keys at the given index.
		- #### setKeys
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setKeys​(int index,
		                                                                          java.lang.String value)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The keys to set.
		Returns:
		This builder for chaining.
		- #### addKeys
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addKeys​(java.lang.String value)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Parameters:
		`value` \- The keys to add.
		Returns:
		This builder for chaining.
		- #### addAllKeys
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addAllKeys​(java.lang.Iterable<java.lang.String> values)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Parameters:
		`values` \- The keys to add.
		Returns:
		This builder for chaining.
		- #### clearKeys
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearKeys()
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Returns:
		This builder for chaining.
		- #### addKeysBytes
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addKeysBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 actual Map is represented by separate sequences of keys and values,
		 relies on both sequences using the same order so that corresponding entries can be
		 associated again when deserializing
		 
		```
		
		`repeated string keys = 4;`
		
		Parameters:
		`value` \- The bytes of the keys to add.
		Returns:
		This builder for chaining.
		- #### getValuesList
		
		
		
		```
		public java.util.List<java.lang.Integer> getValuesList()
		```
		
		`repeated uint32 values = 5;`
		
		Specified by:
		`[getValuesList](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getValuesList())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the values.
		- #### getValuesCount
		
		
		
		```
		public int getValuesCount()
		```
		
		`repeated uint32 values = 5;`
		
		Specified by:
		`[getValuesCount](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getValuesCount())` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of values.
		- #### getValues
		
		
		
		```
		public int getValues​(int index)
		```
		
		`repeated uint32 values = 5;`
		
		Specified by:
		`[getValues](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html#getValues(int))` in interface `[ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The values at the given index.
		- #### setValues
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setValues​(int index,
		                                                                            int value)
		```
		
		`repeated uint32 values = 5;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The values to set.
		Returns:
		This builder for chaining.
		- #### addValues
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addValues​(int value)
		```
		
		`repeated uint32 values = 5;`
		
		Parameters:
		`value` \- The values to add.
		Returns:
		This builder for chaining.
		- #### addAllValues
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") addAllValues​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		`repeated uint32 values = 5;`
		
		Parameters:
		`values` \- The values to add.
		Returns:
		This builder for chaining.
		- #### clearValues
		
		
		
		```
		public [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") clearValues()
		```
		
		`repeated uint32 values = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.Builder.html)*