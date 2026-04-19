---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:39:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.html
title: DistributedPubSubMessages.SendToOneSubscriber
---

# DistributedPubSubMessages.SendToOneSubscriber

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.SendToOneSubscriber

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToOneSubscriber

- All Implemented Interfaces:
`[DistributedPubSubMessages.SendToOneSubscriberOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[DistributedPubSubMessages](DistributedPubSubMessages.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.SendToOneSubscriber
extends akka.protobufv3.internal.GeneratedMessageV3
implements [DistributedPubSubMessages.SendToOneSubscriberOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

```

 Send a message to only one subscriber of a group.
 
```

 Protobuf type `SendToOneSubscriber`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToOneSubscriber)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | Send a message to only one subscriber of a group. |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[PAYLOAD_FIELD_NUMBER](#PAYLOAD_FIELD_NUMBER)` |  |
	
	
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
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `[DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayload](#getPayload())()` | `required .Payload payload = 1;` |
	| `[DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .Payload payload = 1;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .Payload payload = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToOneSubscriber))​([DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") prototype)` |  |
	| `[DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### PAYLOAD\_FIELD\_NUMBER
		
		
		
		```
		public static final int PAYLOAD_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToOneSubscriber.PAYLOAD_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")> PARSER
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
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required .Payload payload = 1;`
		
		Specified by:
		`[hasPayload](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html#hasPayload())` in interface `[DistributedPubSubMessages.SendToOneSubscriberOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") getPayload()
		```
		
		`required .Payload payload = 1;`
		
		Specified by:
		`[getPayload](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html#getPayload())` in interface `[DistributedPubSubMessages.SendToOneSubscriberOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The payload.
		- #### getPayloadOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getPayloadOrBuilder()
		```
		
		`required .Payload payload = 1;`
		
		Specified by:
		`[getPayloadOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html#getPayloadOrBuilder())` in interface `[DistributedPubSubMessages.SendToOneSubscriberOrBuilder](DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
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
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder​([DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [DistributedPubSubMessages.SendToOneSubscriber.Builder](DistributedPubSubMessages.SendToOneSubscriber.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.SendToOneSubscriber](DistributedPubSubMessages.SendToOneSubscriber.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriberOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToOneSubscriber.html)*