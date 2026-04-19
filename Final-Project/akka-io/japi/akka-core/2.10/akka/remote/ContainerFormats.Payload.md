---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
title: ContainerFormats.Payload.Builder
---

# ContainerFormats.Payload.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.Payload.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.Payload.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")

---

```
public static final class ContainerFormats.Payload.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>
implements [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")
```

Protobuf type `Payload`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clearEnclosedMessage](#clearEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clearMessageManifest](#clearMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clearSerializerId](#clearSerializerId())()` | `required int32 serializerId = 2;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getEnclosedMessage](#getEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageManifest](#getMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[hasEnclosedMessage](#hasEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `boolean` | `[hasMessageManifest](#hasMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setEnclosedMessage](#setEnclosedMessage(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes enclosedMessage = 1;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setMessageManifest](#setMessageManifest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes messageManifest = 4;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required int32 serializerId = 2;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         int index,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasEnclosedMessage
		
		
		
		```
		public boolean hasEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[hasEnclosedMessage](ContainerFormats.PayloadOrBuilder.html#hasEnclosedMessage())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the enclosedMessage field is set.
		- #### getEnclosedMessage
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[getEnclosedMessage](ContainerFormats.PayloadOrBuilder.html#getEnclosedMessage())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		The enclosedMessage.
		- #### setEnclosedMessage
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setEnclosedMessage​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes enclosedMessage = 1;`
		
		Parameters:
		`value` \- The enclosedMessage to set.
		Returns:
		This builder for chaining.
		- #### clearEnclosedMessage
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clearEnclosedMessage()
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
		`[hasSerializerId](ContainerFormats.PayloadOrBuilder.html#hasSerializerId())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[getSerializerId](ContainerFormats.PayloadOrBuilder.html#getSerializerId())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setSerializerId​(int value)
		```
		
		`required int32 serializerId = 2;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clearSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasMessageManifest
		
		
		
		```
		public boolean hasMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Specified by:
		`[hasMessageManifest](ContainerFormats.PayloadOrBuilder.html#hasMessageManifest())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the messageManifest field is set.
		- #### getMessageManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Specified by:
		`[getMessageManifest](ContainerFormats.PayloadOrBuilder.html#getMessageManifest())` in interface `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")`
		Returns:
		The messageManifest.
		- #### setMessageManifest
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setMessageManifest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes messageManifest = 4;`
		
		Parameters:
		`value` \- The messageManifest to set.
		Returns:
		This builder for chaining.
		- #### clearMessageManifest
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") clearMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html)*