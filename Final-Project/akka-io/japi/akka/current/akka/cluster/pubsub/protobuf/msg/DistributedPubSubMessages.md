---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html
title: DistributedPubSubMessages.Status
---

# DistributedPubSubMessages.Status

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Status

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status

- All Implemented Interfaces:
`[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[DistributedPubSubMessages](DistributedPubSubMessages.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Status
extends akka.protobufv3.internal.GeneratedMessageV3
implements [DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Status`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | Protobuf type `Status` |
	| `static class` | `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | Protobuf type `Status.Version` |
	| `static interface` | `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[REPLYTOSTATUS_FIELD_NUMBER](#REPLYTOSTATUS_FIELD_NUMBER)` |  |
	| `static int` | `[VERSIONS_FIELD_NUMBER](#VERSIONS_FIELD_NUMBER)` |  |
	
	
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
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `boolean` | `[getReplyToStatus](#getReplyToStatus())()` | `optional bool replyToStatus = 2;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getVersions](#getVersions(int))​(int index)` | `repeated .Status.Version versions = 1;` |
	| `int` | `[getVersionsCount](#getVersionsCount())()` | `repeated .Status.Version versions = 1;` |
	| `java.util.List<[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getVersionsList](#getVersionsList())()` | `repeated .Status.Version versions = 1;` |
	| `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getVersionsOrBuilder](#getVersionsOrBuilder(int))​(int index)` | `repeated .Status.Version versions = 1;` |
	| `java.util.List<? extends [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")>` | `[getVersionsOrBuilderList](#getVersionsOrBuilderList())()` | `repeated .Status.Version versions = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasReplyToStatus](#hasReplyToStatus())()` | `optional bool replyToStatus = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status))​([DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") prototype)` |  |
	| `[DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### VERSIONS\_FIELD\_NUMBER
		
		
		
		```
		public static final int VERSIONS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status.VERSIONS_FIELD_NUMBER)
		- #### REPLYTOSTATUS\_FIELD\_NUMBER
		
		
		
		```
		public static final int REPLYTOSTATUS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Status.REPLYTOSTATUS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")> PARSER
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
		- #### getVersionsList
		
		
		
		```
		public java.util.List<[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")> getVersionsList()
		```
		
		`repeated .Status.Version versions = 1;`
		
		Specified by:
		`[getVersionsList](DistributedPubSubMessages.StatusOrBuilder.html#getVersionsList())` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getVersionsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")> getVersionsOrBuilderList()
		```
		
		`repeated .Status.Version versions = 1;`
		
		Specified by:
		`[getVersionsOrBuilderList](DistributedPubSubMessages.StatusOrBuilder.html#getVersionsOrBuilderList())` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getVersionsCount
		
		
		
		```
		public int getVersionsCount()
		```
		
		`repeated .Status.Version versions = 1;`
		
		Specified by:
		`[getVersionsCount](DistributedPubSubMessages.StatusOrBuilder.html#getVersionsCount())` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getVersions
		
		
		
		```
		public [DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") getVersions​(int index)
		```
		
		`repeated .Status.Version versions = 1;`
		
		Specified by:
		`[getVersions](DistributedPubSubMessages.StatusOrBuilder.html#getVersions(int))` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getVersionsOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getVersionsOrBuilder​(int index)
		```
		
		`repeated .Status.Version versions = 1;`
		
		Specified by:
		`[getVersionsOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html#getVersionsOrBuilder(int))` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### hasReplyToStatus
		
		
		
		```
		public boolean hasReplyToStatus()
		```
		
		`optional bool replyToStatus = 2;`
		
		Specified by:
		`[hasReplyToStatus](DistributedPubSubMessages.StatusOrBuilder.html#hasReplyToStatus())` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the replyToStatus field is set.
		- #### getReplyToStatus
		
		
		
		```
		public boolean getReplyToStatus()
		```
		
		`optional bool replyToStatus = 2;`
		
		Specified by:
		`[getReplyToStatus](DistributedPubSubMessages.StatusOrBuilder.html#getReplyToStatus())` in interface `[DistributedPubSubMessages.StatusOrBuilder](DistributedPubSubMessages.StatusOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The replyToStatus.
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
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(byte[] data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilder​([DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.StatusOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html)*