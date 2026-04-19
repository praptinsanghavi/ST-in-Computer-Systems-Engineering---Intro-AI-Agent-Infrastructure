---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.Builder.html
title: MessageFormats.CompositeMetadata.Builder
---

# MessageFormats.CompositeMetadata.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.CompositeMetadata.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.CompositeMetadata.Builder

- All Implemented Interfaces:
`[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.CompositeMetadata.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `CompositeMetadata`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addAllPayloads](#addAllPayloads(java.lang.Iterable))​(java.lang.Iterable<? extends [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")> values)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addPayloads](#addPayloads(int,akka.persistence.serialization.MessageFormats.PersistentPayload))​(int index,  [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addPayloads](#addPayloads(int,akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​(int index,  [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addPayloads](#addPayloads(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addPayloads](#addPayloads(akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[addPayloadsBuilder](#addPayloadsBuilder())()` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[addPayloadsBuilder](#addPayloadsBuilder(int))​(int index)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[clearPayloads](#clearPayloads())()` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getPayloads](#getPayloads(int))​(int index)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[getPayloadsBuilder](#getPayloadsBuilder(int))​(int index)` | `repeated .PersistentPayload payloads = 1;` |
	| `java.util.List<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>` | `[getPayloadsBuilderList](#getPayloadsBuilderList())()` | `repeated .PersistentPayload payloads = 1;` |
	| `int` | `[getPayloadsCount](#getPayloadsCount())()` | `repeated .PersistentPayload payloads = 1;` |
	| `java.util.List<[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")>` | `[getPayloadsList](#getPayloadsList())()` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getPayloadsOrBuilder](#getPayloadsOrBuilder(int))​(int index)` | `repeated .PersistentPayload payloads = 1;` |
	| `java.util.List<? extends [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")>` | `[getPayloadsOrBuilderList](#getPayloadsOrBuilderList())()` | `repeated .PersistentPayload payloads = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.CompositeMetadata))​([MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[removePayloads](#removePayloads(int))​(int index)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[setPayloads](#setPayloads(int,akka.persistence.serialization.MessageFormats.PersistentPayload))​(int index,  [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[setPayloads](#setPayloads(int,akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​(int index,  [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentPayload payloads = 1;` |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 int index,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### getPayloadsList
		
		
		
		```
		public java.util.List<[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")> getPayloadsList()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		
		Specified by:
		`[getPayloadsList](MessageFormats.CompositeMetadataOrBuilder.html#getPayloadsList())` in interface `[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayloadsCount
		
		
		
		```
		public int getPayloadsCount()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		
		Specified by:
		`[getPayloadsCount](MessageFormats.CompositeMetadataOrBuilder.html#getPayloadsCount())` in interface `[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayloads
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getPayloads​(int index)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		
		Specified by:
		`[getPayloads](MessageFormats.CompositeMetadataOrBuilder.html#getPayloads(int))` in interface `[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`
		- #### setPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") setPayloads​(int index,
		                                                            [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### setPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") setPayloads​(int index,
		                                                            [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addPayloads​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addPayloads​(int index,
		                                                            [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addPayloads​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addPayloads​(int index,
		                                                            [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addAllPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") addAllPayloads​(java.lang.Iterable<? extends [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")> values)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### clearPayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") clearPayloads()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### removePayloads
		
		
		
		```
		public [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") removePayloads​(int index)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### getPayloadsBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") getPayloadsBuilder​(int index)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### getPayloadsOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getPayloadsOrBuilder​(int index)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		
		Specified by:
		`[getPayloadsOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html#getPayloadsOrBuilder(int))` in interface `[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayloadsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")> getPayloadsOrBuilderList()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		
		Specified by:
		`[getPayloadsOrBuilderList](MessageFormats.CompositeMetadataOrBuilder.html#getPayloadsOrBuilderList())` in interface `[MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization")`
		- #### addPayloadsBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") addPayloadsBuilder()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### addPayloadsBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") addPayloadsBuilder​(int index)
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### getPayloadsBuilderList
		
		
		
		```
		public java.util.List<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")> getPayloadsBuilderList()
		```
		
		`repeated .PersistentPayload payloads = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.Builder.html)*