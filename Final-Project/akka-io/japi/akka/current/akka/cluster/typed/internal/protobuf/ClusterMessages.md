---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html
title: ClusterMessages.ReceptionistEntry
---

# ClusterMessages.ReceptionistEntry

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ClusterMessages.ReceptionistEntry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry

- All Implemented Interfaces:
`[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ClusterMessages](ClusterMessages.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ClusterMessages.ReceptionistEntry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

Protobuf type `akka.cluster.typed.ReceptionistEntry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | Protobuf type `akka.cluster.typed.ReceptionistEntry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ACTORREF_FIELD_NUMBER](#ACTORREF_FIELD_NUMBER)` |  |
	| `static int` | `[CREATEDTIMESTAMP_FIELD_NUMBER](#CREATEDTIMESTAMP_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[SYSTEMUID_FIELD_NUMBER](#SYSTEMUID_FIELD_NUMBER)` |  |
	
	
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
	| `java.lang.String` | `[getActorRef](#getActorRef())()` | `required string actorRef = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getActorRefBytes](#getActorRefBytes())()` | `required string actorRef = 1;` |
	| `long` | `[getCreatedTimestamp](#getCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getSystemUid](#getSystemUid())()` | `required uint64 systemUid = 2;` |
	| `boolean` | `[hasActorRef](#hasActorRef())()` | `required string actorRef = 1;` |
	| `boolean` | `[hasCreatedTimestamp](#hasCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasSystemUid](#hasSystemUid())()` | `required uint64 systemUid = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilder](#newBuilder(akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry))​([ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") prototype)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")>` | `[parser](#parser())()` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### ACTORREF\_FIELD\_NUMBER
		
		
		
		```
		public static final int ACTORREF_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry.ACTORREF_FIELD_NUMBER)
		- #### SYSTEMUID\_FIELD\_NUMBER
		
		
		
		```
		public static final int SYSTEMUID_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry.SYSTEMUID_FIELD_NUMBER)
		- #### CREATEDTIMESTAMP\_FIELD\_NUMBER
		
		
		
		```
		public static final int CREATEDTIMESTAMP_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry.CREATEDTIMESTAMP_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")> PARSER
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
		- #### hasActorRef
		
		
		
		```
		public boolean hasActorRef()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[hasActorRef](ClusterMessages.ReceptionistEntryOrBuilder.html#hasActorRef())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the actorRef field is set.
		- #### getActorRef
		
		
		
		```
		public java.lang.String getActorRef()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[getActorRef](ClusterMessages.ReceptionistEntryOrBuilder.html#getActorRef())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The actorRef.
		- #### getActorRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getActorRefBytes()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[getActorRefBytes](ClusterMessages.ReceptionistEntryOrBuilder.html#getActorRefBytes())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for actorRef.
		- #### hasSystemUid
		
		
		
		```
		public boolean hasSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Specified by:
		`[hasSystemUid](ClusterMessages.ReceptionistEntryOrBuilder.html#hasSystemUid())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the systemUid field is set.
		- #### getSystemUid
		
		
		
		```
		public long getSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Specified by:
		`[getSystemUid](ClusterMessages.ReceptionistEntryOrBuilder.html#getSystemUid())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The systemUid.
		- #### hasCreatedTimestamp
		
		
		
		```
		public boolean hasCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Specified by:
		`[hasCreatedTimestamp](ClusterMessages.ReceptionistEntryOrBuilder.html#hasCreatedTimestamp())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the createdTimestamp field is set.
		- #### getCreatedTimestamp
		
		
		
		```
		public long getCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Specified by:
		`[getCreatedTimestamp](ClusterMessages.ReceptionistEntryOrBuilder.html#getCreatedTimestamp())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The createdTimestamp.
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
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(byte[] data)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(byte[] data,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.io.InputStream input)
		                                                   throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.io.InputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                   throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                   throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilder​([ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html)*