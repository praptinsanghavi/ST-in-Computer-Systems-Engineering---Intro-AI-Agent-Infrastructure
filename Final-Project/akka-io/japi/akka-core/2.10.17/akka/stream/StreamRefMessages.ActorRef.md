---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRef.Builder.html
title: StreamRefMessages.ActorRef.Builder
---

# StreamRefMessages.ActorRef.Builder

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.ActorRef.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")\>
			- - akka.stream.StreamRefMessages.ActorRef.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")`, `java.lang.Cloneable`

Enclosing class:
[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")

---

```
public static final class StreamRefMessages.ActorRef.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>
implements [StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")
```

Protobuf type `ActorRef`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[build](#build())()` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[buildPartial](#buildPartial())()` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[clear](#clear())()` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[clearPath](#clearPath())()` | `required string path = 1;` |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[clone](#clone())()` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 1;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.stream.StreamRefMessages.ActorRef))​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") other)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 1;` |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 1;` |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### clear
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### setField
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### clearField
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### clearOneof
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### setRepeatedField
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### addRepeatedField
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") mergeFrom​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		Throws:
		`java.io.IOException`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[hasPath](StreamRefMessages.ActorRefOrBuilder.html#hasPath())` in interface `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPath](StreamRefMessages.ActorRefOrBuilder.html#getPath())` in interface `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPathBytes](StreamRefMessages.ActorRefOrBuilder.html#getPathBytes())` in interface `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") setPath​(java.lang.String value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") clearPath()
		```
		
		`required string path = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRef.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRef.Builder.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefMessages.ActorRef.Builder.html)*