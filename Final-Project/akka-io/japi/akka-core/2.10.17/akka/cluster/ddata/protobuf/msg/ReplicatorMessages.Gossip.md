---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:35:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html
title: ReplicatorMessages.Gossip.Entry
---

# ReplicatorMessages.Gossip.Entry

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Gossip.Entry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry

- All Implemented Interfaces:
`[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatorMessages.Gossip](ReplicatorMessages.Gossip.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Gossip.Entry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Gossip.Entry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | Protobuf type `akka.cluster.ddata.Gossip.Entry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ENVELOPE_FIELD_NUMBER](#ENVELOPE_FIELD_NUMBER)` |  |
	| `static int` | `[KEY_FIELD_NUMBER](#KEY_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[USEDTIMESTAMP_FIELD_NUMBER](#USEDTIMESTAMP_FIELD_NUMBER)` |  |
	
	
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
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEnvelope](#getEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEnvelopeOrBuilder](#getEnvelopeOrBuilder())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getUsedTimestamp](#getUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `boolean` | `[hasEnvelope](#hasEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasUsedTimestamp](#hasUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry))​([ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)` |  |
	| `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### KEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int KEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.KEY_FIELD_NUMBER)
		- #### ENVELOPE\_FIELD\_NUMBER
		
		
		
		```
		public static final int ENVELOPE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.ENVELOPE_FIELD_NUMBER)
		- #### USEDTIMESTAMP\_FIELD\_NUMBER
		
		
		
		```
		public static final int USEDTIMESTAMP_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Gossip.Entry.USEDTIMESTAMP_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> PARSER
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
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[hasKey](ReplicatorMessages.Gossip.EntryOrBuilder.html#hasKey())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](ReplicatorMessages.Gossip.EntryOrBuilder.html#getKey())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](ReplicatorMessages.Gossip.EntryOrBuilder.html#getKeyBytes())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### hasEnvelope
		
		
		
		```
		public boolean hasEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[hasEnvelope](ReplicatorMessages.Gossip.EntryOrBuilder.html#hasEnvelope())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the envelope field is set.
		- #### getEnvelope
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") getEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelope](ReplicatorMessages.Gossip.EntryOrBuilder.html#getEnvelope())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The envelope.
		- #### getEnvelopeOrBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEnvelopeOrBuilder()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelopeOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html#getEnvelopeOrBuilder())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasUsedTimestamp
		
		
		
		```
		public boolean hasUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Specified by:
		`[hasUsedTimestamp](ReplicatorMessages.Gossip.EntryOrBuilder.html#hasUsedTimestamp())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the usedTimestamp field is set.
		- #### getUsedTimestamp
		
		
		
		```
		public long getUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Specified by:
		`[getUsedTimestamp](ReplicatorMessages.Gossip.EntryOrBuilder.html#getUsedTimestamp())` in interface `[ReplicatorMessages.Gossip.EntryOrBuilder](ReplicatorMessages.Gossip.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The usedTimestamp.
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
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                          throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                          throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder​([ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatorMessages.Gossip.Entry.Builder](ReplicatorMessages.Gossip.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Gossip.Entry](ReplicatorMessages.Gossip.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Gossip.Entry.html)*