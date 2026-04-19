---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.Builder.html
title: WireFormats.SerializedMessage.Builder
---

# WireFormats.SerializedMessage.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.SerializedMessage.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.SerializedMessage.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")

---

```
public static final class WireFormats.SerializedMessage.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>
implements [WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")
```

```

 Defines a message.
 
```

 Protobuf type `SerializedMessage`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clearMessage](#clearMessage())()` | `required bytes message = 1;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clearMessageManifest](#clearMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clearSerializerId](#clearSerializerId())()` | `required int32 serializerId = 2;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getMessage](#getMessage())()` | `required bytes message = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageManifest](#getMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required bytes message = 1;` |
	| `boolean` | `[hasMessageManifest](#hasMessageManifest())()` | `optional bytes messageManifest = 3;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.SerializedMessage))​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") other)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes message = 1;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setMessageManifest](#setMessageManifest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes messageManifest = 3;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required int32 serializerId = 2;` |
	| `[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") mergeFrom​([WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required bytes message = 1;`
		
		Specified by:
		`[hasMessage](WireFormats.SerializedMessageOrBuilder.html#hasMessage())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessage()
		```
		
		`required bytes message = 1;`
		
		Specified by:
		`[getMessage](WireFormats.SerializedMessageOrBuilder.html#getMessage())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setMessage​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes message = 1;`
		
		Parameters:
		`value` \- The message to set.
		Returns:
		This builder for chaining.
		- #### clearMessage
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clearMessage()
		```
		
		`required bytes message = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[hasSerializerId](WireFormats.SerializedMessageOrBuilder.html#hasSerializerId())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[getSerializerId](WireFormats.SerializedMessageOrBuilder.html#getSerializerId())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setSerializerId​(int value)
		```
		
		`required int32 serializerId = 2;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clearSerializerId()
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
		`[hasMessageManifest](WireFormats.SerializedMessageOrBuilder.html#hasMessageManifest())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the messageManifest field is set.
		- #### getMessageManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Specified by:
		`[getMessageManifest](WireFormats.SerializedMessageOrBuilder.html#getMessageManifest())` in interface `[WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The messageManifest.
		- #### setMessageManifest
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setMessageManifest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes messageManifest = 3;`
		
		Parameters:
		`value` \- The messageManifest to set.
		Returns:
		This builder for chaining.
		- #### clearMessageManifest
		
		
		
		```
		public [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") clearMessageManifest()
		```
		
		`optional bytes messageManifest = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.SerializedMessage.Builder.html)*