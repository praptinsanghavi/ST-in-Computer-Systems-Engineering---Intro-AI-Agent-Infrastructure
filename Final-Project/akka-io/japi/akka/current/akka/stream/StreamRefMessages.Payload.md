---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.Payload.Builder.html
title: StreamRefMessages.Payload.Builder
---

# StreamRefMessages.Payload.Builder

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.Payload.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")\>
			- - akka.stream.StreamRefMessages.Payload.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`, `java.lang.Cloneable`

Enclosing class:
[StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream")

---

```
public static final class StreamRefMessages.Payload.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>
implements [StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")
```

Protobuf type `Payload`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream")` | `[build](#build())()` |  |
	| `[StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream")` | `[buildPartial](#buildPartial())()` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clear](#clear())()` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clearEnclosedMessage](#clearEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clearMessageManifest](#clearMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clearSerializerId](#clearSerializerId())()` | `required int32 serializerId = 2;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[clone](#clone())()` |  |
	| `[StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getEnclosedMessage](#getEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageManifest](#getMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[hasEnclosedMessage](#hasEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `boolean` | `[hasMessageManifest](#hasMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.stream.StreamRefMessages.Payload))​([StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") other)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setEnclosedMessage](#setEnclosedMessage(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes enclosedMessage = 1;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setMessageManifest](#setMessageManifest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes messageManifest = 3;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required int32 serializerId = 2;` |
	| `[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### clear
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### setField
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### clearField
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### clearOneof
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### setRepeatedField
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### addRepeatedField
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") mergeFrom​([StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		Throws:
		`java.io.IOException`
		- #### hasEnclosedMessage
		
		
		
		```
		public boolean hasEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[hasEnclosedMessage](StreamRefMessages.PayloadOrBuilder.html#hasEnclosedMessage())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the enclosedMessage field is set.
		- #### getEnclosedMessage
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[getEnclosedMessage](StreamRefMessages.PayloadOrBuilder.html#getEnclosedMessage())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		The enclosedMessage.
		- #### setEnclosedMessage
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setEnclosedMessage​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes enclosedMessage = 1;`
		
		Parameters:
		`value` \- The enclosedMessage to set.
		Returns:
		This builder for chaining.
		- #### clearEnclosedMessage
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clearEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[hasSerializerId](StreamRefMessages.PayloadOrBuilder.html#hasSerializerId())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[getSerializerId](StreamRefMessages.PayloadOrBuilder.html#getSerializerId())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setSerializerId​(int value)
		```
		
		`required int32 serializerId = 2;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clearSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasMessageManifest
		
		
		
		```
		public boolean hasMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Specified by:
		`[hasMessageManifest](StreamRefMessages.PayloadOrBuilder.html#hasMessageManifest())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the messageManifest field is set.
		- #### getMessageManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Specified by:
		`[getMessageManifest](StreamRefMessages.PayloadOrBuilder.html#getMessageManifest())` in interface `[StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream")`
		Returns:
		The messageManifest.
		- #### setMessageManifest
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setMessageManifest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes messageManifest = 3;`
		
		Parameters:
		`value` \- The messageManifest to set.
		Returns:
		This builder for chaining.
		- #### clearMessageManifest
		
		
		
		```
		public [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") clearMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.Payload.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.Payload.Builder.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.Payload.Builder.html)*