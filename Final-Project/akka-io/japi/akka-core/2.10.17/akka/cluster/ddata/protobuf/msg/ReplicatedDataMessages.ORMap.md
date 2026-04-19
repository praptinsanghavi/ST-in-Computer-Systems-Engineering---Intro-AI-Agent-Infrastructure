---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:34:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html
title: ReplicatedDataMessages.ORMap.Entry
---

# ReplicatedDataMessages.ORMap.Entry

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORMap.Entry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORMap.Entry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORMap.Entry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | Protobuf type `akka.cluster.ddata.ORMap.Entry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[INTKEY_FIELD_NUMBER](#INTKEY_FIELD_NUMBER)` |  |
	| `static int` | `[LONGKEY_FIELD_NUMBER](#LONGKEY_FIELD_NUMBER)` |  |
	| `static int` | `[OTHERKEY_FIELD_NUMBER](#OTHERKEY_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[STRINGKEY_FIELD_NUMBER](#STRINGKEY_FIELD_NUMBER)` |  |
	| `static int` | `[VALUE_FIELD_NUMBER](#VALUE_FIELD_NUMBER)` |  |
	
	
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
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `int` | `[getIntKey](#getIntKey())()` | `optional sint32 intKey = 3;` |
	| `long` | `[getLongKey](#getLongKey())()` | `optional sint64 longKey = 4;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherKey](#getOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOtherKeyOrBuilder](#getOtherKeyOrBuilder())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `java.lang.String` | `[getStringKey](#getStringKey())()` | `optional string stringKey = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringKeyBytes](#getStringKeyBytes())()` | `optional string stringKey = 1;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getValue](#getValue())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getValueOrBuilder](#getValueOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasIntKey](#hasIntKey())()` | `optional sint32 intKey = 3;` |
	| `boolean` | `[hasLongKey](#hasLongKey())()` | `optional sint64 longKey = 4;` |
	| `boolean` | `[hasOtherKey](#hasOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `boolean` | `[hasStringKey](#hasStringKey())()` | `optional string stringKey = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry))​([ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)` |  |
	| `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### STRINGKEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int STRINGKEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.STRINGKEY_FIELD_NUMBER)
		- #### VALUE\_FIELD\_NUMBER
		
		
		
		```
		public static final int VALUE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.VALUE_FIELD_NUMBER)
		- #### INTKEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int INTKEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.INTKEY_FIELD_NUMBER)
		- #### LONGKEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int LONGKEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.LONGKEY_FIELD_NUMBER)
		- #### OTHERKEY\_FIELD\_NUMBER
		
		
		
		```
		public static final int OTHERKEY_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap.Entry.OTHERKEY_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> PARSER
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
		- #### hasStringKey
		
		
		
		```
		public boolean hasStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[hasStringKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#hasStringKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the stringKey field is set.
		- #### getStringKey
		
		
		
		```
		public java.lang.String getStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[getStringKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getStringKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The stringKey.
		- #### getStringKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStringKeyBytes()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[getStringKeyBytes](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getStringKeyBytes())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for stringKey.
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[hasValue](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#hasValue())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getValue()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[getValue](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getValue())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The value.
		- #### getValueOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getValueOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[getValueOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getValueOrBuilder())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasIntKey
		
		
		
		```
		public boolean hasIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Specified by:
		`[hasIntKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#hasIntKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the intKey field is set.
		- #### getIntKey
		
		
		
		```
		public int getIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Specified by:
		`[getIntKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getIntKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The intKey.
		- #### hasLongKey
		
		
		
		```
		public boolean hasLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Specified by:
		`[hasLongKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#hasLongKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the longKey field is set.
		- #### getLongKey
		
		
		
		```
		public long getLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Specified by:
		`[getLongKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getLongKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The longKey.
		- #### hasOtherKey
		
		
		
		```
		public boolean hasOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[hasOtherKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#hasOtherKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the otherKey field is set.
		- #### getOtherKey
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[getOtherKey](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getOtherKey())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The otherKey.
		- #### getOtherKeyOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOtherKeyOrBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[getOtherKeyOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html#getOtherKeyOrBuilder())` in interface `[ReplicatedDataMessages.ORMap.EntryOrBuilder](ReplicatedDataMessages.ORMap.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
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
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder​([ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html)*