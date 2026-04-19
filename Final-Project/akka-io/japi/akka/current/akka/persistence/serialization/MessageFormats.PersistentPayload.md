---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
title: MessageFormats.PersistentPayload.Builder
---

# MessageFormats.PersistentPayload.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.PersistentPayload.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.PersistentPayload.Builder

- All Implemented Interfaces:
`[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.PersistentPayload.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `PersistentPayload`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clearPayload](#clearPayload())()` | `required bytes payload = 2;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clearPayloadManifest](#clearPayloadManifest())()` | `optional bytes payloadManifest = 3;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clearSerializerId](#clearSerializerId())()` | `required int32 serializerId = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getPayload](#getPayload())()` | `required bytes payload = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getPayloadManifest](#getPayloadManifest())()` | `optional bytes payloadManifest = 3;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 1;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required bytes payload = 2;` |
	| `boolean` | `[hasPayloadManifest](#hasPayloadManifest())()` | `optional bytes payloadManifest = 3;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes payload = 2;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setPayloadManifest](#setPayloadManifest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes payloadManifest = 3;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required int32 serializerId = 1;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 int index,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required int32 serializerId = 1;`
		
		Specified by:
		`[hasSerializerId](MessageFormats.PersistentPayloadOrBuilder.html#hasSerializerId())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 1;`
		
		Specified by:
		`[getSerializerId](MessageFormats.PersistentPayloadOrBuilder.html#getSerializerId())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setSerializerId​(int value)
		```
		
		`required int32 serializerId = 1;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clearSerializerId()
		```
		
		`required int32 serializerId = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required bytes payload = 2;`
		
		Specified by:
		`[hasPayload](MessageFormats.PersistentPayloadOrBuilder.html#hasPayload())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPayload()
		```
		
		`required bytes payload = 2;`
		
		Specified by:
		`[getPayload](MessageFormats.PersistentPayloadOrBuilder.html#getPayload())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setPayload​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes payload = 2;`
		
		Parameters:
		`value` \- The payload to set.
		Returns:
		This builder for chaining.
		- #### clearPayload
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clearPayload()
		```
		
		`required bytes payload = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPayloadManifest
		
		
		
		```
		public boolean hasPayloadManifest()
		```
		
		`optional bytes payloadManifest = 3;`
		
		Specified by:
		`[hasPayloadManifest](MessageFormats.PersistentPayloadOrBuilder.html#hasPayloadManifest())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the payloadManifest field is set.
		- #### getPayloadManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPayloadManifest()
		```
		
		`optional bytes payloadManifest = 3;`
		
		Specified by:
		`[getPayloadManifest](MessageFormats.PersistentPayloadOrBuilder.html#getPayloadManifest())` in interface `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The payloadManifest.
		- #### setPayloadManifest
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setPayloadManifest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes payloadManifest = 3;`
		
		Parameters:
		`value` \- The payloadManifest to set.
		Returns:
		This builder for chaining.
		- #### clearPayloadManifest
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") clearPayloadManifest()
		```
		
		`optional bytes payloadManifest = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html)*