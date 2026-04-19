---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html
title: ReliableDelivery.State
---

# ReliableDelivery.State

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.State

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.State

- All Implemented Interfaces:
`[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReliableDelivery](ReliableDelivery.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.State
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 DurableProducerQueue
 
```

 Protobuf type `akka.cluster.typed.delivery.State`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.typed.internal.protobuf.ReliableDelivery.State)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | DurableProducerQueue |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CONFIRMED_FIELD_NUMBER](#CONFIRMED_FIELD_NUMBER)` |  |
	| `static int` | `[CURRENTSEQNR_FIELD_NUMBER](#CURRENTSEQNR_FIELD_NUMBER)` |  |
	| `static int` | `[HIGHESTCONFIRMEDSEQNR_FIELD_NUMBER](#HIGHESTCONFIRMEDSEQNR_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[UNCONFIRMED_FIELD_NUMBER](#UNCONFIRMED_FIELD_NUMBER)` |  |
	
	
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
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[getConfirmed](#getConfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `int` | `[getConfirmedCount](#getConfirmedCount())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedList](#getConfirmedList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getConfirmedOrBuilder](#getConfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedOrBuilderList](#getConfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `long` | `[getCurrentSeqNr](#getCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `long` | `[getHighestConfirmedSeqNr](#getHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmed](#getUnconfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `int` | `[getUnconfirmedCount](#getUnconfirmedCount())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedList](#getUnconfirmedList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmedOrBuilder](#getUnconfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedOrBuilderList](#getUnconfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `boolean` | `[hasCurrentSeqNr](#hasCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasHighestConfirmedSeqNr](#hasHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilder](#newBuilder(akka.cluster.typed.internal.protobuf.ReliableDelivery.State))​([ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") prototype)` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")>` | `[parser](#parser())()` |  |
	| `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### CURRENTSEQNR\_FIELD\_NUMBER
		
		
		
		```
		public static final int CURRENTSEQNR_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ReliableDelivery.State.CURRENTSEQNR_FIELD_NUMBER)
		- #### HIGHESTCONFIRMEDSEQNR\_FIELD\_NUMBER
		
		
		
		```
		public static final int HIGHESTCONFIRMEDSEQNR_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ReliableDelivery.State.HIGHESTCONFIRMEDSEQNR_FIELD_NUMBER)
		- #### CONFIRMED\_FIELD\_NUMBER
		
		
		
		```
		public static final int CONFIRMED_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ReliableDelivery.State.CONFIRMED_FIELD_NUMBER)
		- #### UNCONFIRMED\_FIELD\_NUMBER
		
		
		
		```
		public static final int UNCONFIRMED_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.typed.internal.protobuf.ReliableDelivery.State.UNCONFIRMED_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")> PARSER
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
		- #### hasCurrentSeqNr
		
		
		
		```
		public boolean hasCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Specified by:
		`[hasCurrentSeqNr](ReliableDelivery.StateOrBuilder.html#hasCurrentSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the currentSeqNr field is set.
		- #### getCurrentSeqNr
		
		
		
		```
		public long getCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Specified by:
		`[getCurrentSeqNr](ReliableDelivery.StateOrBuilder.html#getCurrentSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The currentSeqNr.
		- #### hasHighestConfirmedSeqNr
		
		
		
		```
		public boolean hasHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Specified by:
		`[hasHighestConfirmedSeqNr](ReliableDelivery.StateOrBuilder.html#hasHighestConfirmedSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the highestConfirmedSeqNr field is set.
		- #### getHighestConfirmedSeqNr
		
		
		
		```
		public long getHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Specified by:
		`[getHighestConfirmedSeqNr](ReliableDelivery.StateOrBuilder.html#getHighestConfirmedSeqNr())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The highestConfirmedSeqNr.
		- #### getConfirmedList
		
		
		
		```
		public java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> getConfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedList](ReliableDelivery.StateOrBuilder.html#getConfirmedList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmedOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getConfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedOrBuilderList](ReliableDelivery.StateOrBuilder.html#getConfirmedOrBuilderList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmedCount
		
		
		
		```
		public int getConfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedCount](ReliableDelivery.StateOrBuilder.html#getConfirmedCount())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmed
		
		
		
		```
		public [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") getConfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmed](ReliableDelivery.StateOrBuilder.html#getConfirmed(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getConfirmedOrBuilder
		
		
		
		```
		public [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getConfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		
		Specified by:
		`[getConfirmedOrBuilder](ReliableDelivery.StateOrBuilder.html#getConfirmedOrBuilder(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedList
		
		
		
		```
		public java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> getUnconfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedList](ReliableDelivery.StateOrBuilder.html#getUnconfirmedList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getUnconfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedOrBuilderList](ReliableDelivery.StateOrBuilder.html#getUnconfirmedOrBuilderList())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedCount
		
		
		
		```
		public int getUnconfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedCount](ReliableDelivery.StateOrBuilder.html#getUnconfirmedCount())` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmed
		
		
		
		```
		public [ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") getUnconfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmed](ReliableDelivery.StateOrBuilder.html#getUnconfirmed(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### getUnconfirmedOrBuilder
		
		
		
		```
		public [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getUnconfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		
		Specified by:
		`[getUnconfirmedOrBuilder](ReliableDelivery.StateOrBuilder.html#getUnconfirmedOrBuilder(int))` in interface `[ReliableDelivery.StateOrBuilder](ReliableDelivery.StateOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
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
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(byte[] data)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(byte[] data,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.io.InputStream input)
		                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(java.io.InputStream input,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilder​([ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.ConfirmedOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSentOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.StateOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html)*