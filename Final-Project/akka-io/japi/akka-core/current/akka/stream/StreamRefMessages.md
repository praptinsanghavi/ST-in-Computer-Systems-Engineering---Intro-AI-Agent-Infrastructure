---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:03:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRef.html
title: StreamRefMessages.SinkRef
---

# StreamRefMessages.SinkRef

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.SinkRef

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.stream.StreamRefMessages.SinkRef

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`, `java.io.Serializable`

Enclosing class:
[StreamRefMessages](StreamRefMessages.html "class in akka.stream")

---

```
public static final class StreamRefMessages.SinkRef
extends akka.protobufv3.internal.GeneratedMessageV3
implements [StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")
```

Protobuf type `SinkRef`

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamRefMessages.SinkRef)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | Protobuf type `SinkRef` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[TARGETREF_FIELD_NUMBER](#TARGETREF_FIELD_NUMBER)` |  |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[getTargetRef](#getTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")` | `[getTargetRefOrBuilder](#getTargetRefOrBuilder())()` | `required .ActorRef targetRef = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasTargetRef](#hasTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[newBuilder](#newBuilder())()` |  |
	| `static [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[newBuilder](#newBuilder(akka.stream.StreamRefMessages.SinkRef))​([StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") prototype)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")>` | `[parser](#parser())()` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### TARGETREF\_FIELD\_NUMBER
		
		
		
		```
		public static final int TARGETREF_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.stream.StreamRefMessages.SinkRef.TARGETREF_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### hasTargetRef
		
		
		
		```
		public boolean hasTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[hasTargetRef](StreamRefMessages.SinkRefOrBuilder.html#hasTargetRef())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the targetRef field is set.
		- #### getTargetRef
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") getTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[getTargetRef](StreamRefMessages.SinkRefOrBuilder.html#getTargetRef())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		Returns:
		The targetRef.
		- #### getTargetRefOrBuilder
		
		
		
		```
		public [StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream") getTargetRefOrBuilder()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[getTargetRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html#getTargetRefOrBuilder())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(java.nio.ByteBuffer data)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(java.nio.ByteBuffer data,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(byte[] data)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(byte[] data,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(java.io.InputStream input)
		                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(java.io.InputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseDelimitedFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseDelimitedFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") newBuilder​([StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRef.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRef.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/constant-values.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRef.html](https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SinkRef.html)*