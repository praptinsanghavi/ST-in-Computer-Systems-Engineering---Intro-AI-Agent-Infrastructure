---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializable.Builder.html
title: ContainerFormats.ThrowableNotSerializable.Builder
---

# ContainerFormats.ThrowableNotSerializable.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.ThrowableNotSerializable.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.ThrowableNotSerializable.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote")

---

```
public static final class ContainerFormats.ThrowableNotSerializable.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>
implements [ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")
```

Protobuf type `ThrowableNotSerializable`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clearMessage](#clearMessage())()` | `required string message = 1;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clearOriginalClassName](#clearOriginalClassName())()` | `required string originalClassName = 3;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clearOriginalMessage](#clearOriginalMessage())()` | `required string originalMessage = 2;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getMessage](#getMessage())()` | `required string message = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageBytes](#getMessageBytes())()` | `required string message = 1;` |
	| `java.lang.String` | `[getOriginalClassName](#getOriginalClassName())()` | `required string originalClassName = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getOriginalClassNameBytes](#getOriginalClassNameBytes())()` | `required string originalClassName = 3;` |
	| `java.lang.String` | `[getOriginalMessage](#getOriginalMessage())()` | `required string originalMessage = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getOriginalMessageBytes](#getOriginalMessageBytes())()` | `required string originalMessage = 2;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required string message = 1;` |
	| `boolean` | `[hasOriginalClassName](#hasOriginalClassName())()` | `required string originalClassName = 3;` |
	| `boolean` | `[hasOriginalMessage](#hasOriginalMessage())()` | `required string originalMessage = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.ThrowableNotSerializable))​([ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(java.lang.String))​(java.lang.String value)` | `required string message = 1;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setMessageBytes](#setMessageBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string message = 1;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setOriginalClassName](#setOriginalClassName(java.lang.String))​(java.lang.String value)` | `required string originalClassName = 3;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setOriginalClassNameBytes](#setOriginalClassNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string originalClassName = 3;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setOriginalMessage](#setOriginalMessage(java.lang.String))​(java.lang.String value)` | `required string originalMessage = 2;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setOriginalMessageBytes](#setOriginalMessageBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string originalMessage = 2;` |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required string message = 1;`
		
		Specified by:
		`[hasMessage](ContainerFormats.ThrowableNotSerializableOrBuilder.html#hasMessage())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public java.lang.String getMessage()
		```
		
		`required string message = 1;`
		
		Specified by:
		`[getMessage](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getMessage())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### getMessageBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageBytes()
		```
		
		`required string message = 1;`
		
		Specified by:
		`[getMessageBytes](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getMessageBytes())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for message.
		- #### setMessage
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setMessage​(java.lang.String value)
		```
		
		`required string message = 1;`
		
		Parameters:
		`value` \- The message to set.
		Returns:
		This builder for chaining.
		- #### clearMessage
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clearMessage()
		```
		
		`required string message = 1;`
		
		Returns:
		This builder for chaining.
		- #### setMessageBytes
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setMessageBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string message = 1;`
		
		Parameters:
		`value` \- The bytes for message to set.
		Returns:
		This builder for chaining.
		- #### hasOriginalMessage
		
		
		
		```
		public boolean hasOriginalMessage()
		```
		
		`required string originalMessage = 2;`
		
		Specified by:
		`[hasOriginalMessage](ContainerFormats.ThrowableNotSerializableOrBuilder.html#hasOriginalMessage())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the originalMessage field is set.
		- #### getOriginalMessage
		
		
		
		```
		public java.lang.String getOriginalMessage()
		```
		
		`required string originalMessage = 2;`
		
		Specified by:
		`[getOriginalMessage](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getOriginalMessage())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The originalMessage.
		- #### getOriginalMessageBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOriginalMessageBytes()
		```
		
		`required string originalMessage = 2;`
		
		Specified by:
		`[getOriginalMessageBytes](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getOriginalMessageBytes())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for originalMessage.
		- #### setOriginalMessage
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setOriginalMessage​(java.lang.String value)
		```
		
		`required string originalMessage = 2;`
		
		Parameters:
		`value` \- The originalMessage to set.
		Returns:
		This builder for chaining.
		- #### clearOriginalMessage
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clearOriginalMessage()
		```
		
		`required string originalMessage = 2;`
		
		Returns:
		This builder for chaining.
		- #### setOriginalMessageBytes
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setOriginalMessageBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string originalMessage = 2;`
		
		Parameters:
		`value` \- The bytes for originalMessage to set.
		Returns:
		This builder for chaining.
		- #### hasOriginalClassName
		
		
		
		```
		public boolean hasOriginalClassName()
		```
		
		`required string originalClassName = 3;`
		
		Specified by:
		`[hasOriginalClassName](ContainerFormats.ThrowableNotSerializableOrBuilder.html#hasOriginalClassName())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the originalClassName field is set.
		- #### getOriginalClassName
		
		
		
		```
		public java.lang.String getOriginalClassName()
		```
		
		`required string originalClassName = 3;`
		
		Specified by:
		`[getOriginalClassName](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getOriginalClassName())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The originalClassName.
		- #### getOriginalClassNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOriginalClassNameBytes()
		```
		
		`required string originalClassName = 3;`
		
		Specified by:
		`[getOriginalClassNameBytes](ContainerFormats.ThrowableNotSerializableOrBuilder.html#getOriginalClassNameBytes())` in interface `[ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for originalClassName.
		- #### setOriginalClassName
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setOriginalClassName​(java.lang.String value)
		```
		
		`required string originalClassName = 3;`
		
		Parameters:
		`value` \- The originalClassName to set.
		Returns:
		This builder for chaining.
		- #### clearOriginalClassName
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") clearOriginalClassName()
		```
		
		`required string originalClassName = 3;`
		
		Returns:
		This builder for chaining.
		- #### setOriginalClassNameBytes
		
		
		
		```
		public [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setOriginalClassNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string originalClassName = 3;`
		
		Parameters:
		`value` \- The bytes for originalClassName to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializable.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializableOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializable.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableNotSerializable.Builder.html)*