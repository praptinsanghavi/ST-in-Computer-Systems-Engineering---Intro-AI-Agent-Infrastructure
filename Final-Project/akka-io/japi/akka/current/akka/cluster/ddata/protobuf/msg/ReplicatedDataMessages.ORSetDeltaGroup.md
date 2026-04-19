---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:58:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html
title: ReplicatedDataMessages.ORSetDeltaGroup.Entry
---

# ReplicatedDataMessages.ORSetDeltaGroup.Entry

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORSetDeltaGroup.Entry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatedDataMessages.ORSetDeltaGroup](ReplicatedDataMessages.ORSetDeltaGroup.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORSetDeltaGroup.Entry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORSetDeltaGroup.Entry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | Protobuf type `akka.cluster.ddata.ORSetDeltaGroup.Entry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[OPERATION_FIELD_NUMBER](#OPERATION_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[UNDERLYING_FIELD_NUMBER](#UNDERLYING_FIELD_NUMBER)` |  |
	
	
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
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[getOperation](#getOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getUnderlying](#getUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getUnderlyingOrBuilder](#getUnderlyingOrBuilder())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasOperation](#hasOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `boolean` | `[hasUnderlying](#hasUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry))​([ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### OPERATION\_FIELD\_NUMBER
		
		
		
		```
		public static final int OPERATION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry.OPERATION_FIELD_NUMBER)
		- #### UNDERLYING\_FIELD\_NUMBER
		
		
		
		```
		public static final int UNDERLYING_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaGroup.Entry.UNDERLYING_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")> PARSER
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
		- #### hasOperation
		
		
		
		```
		public boolean hasOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[hasOperation](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#hasOperation())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the operation field is set.
		- #### getOperation
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") getOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Specified by:
		`[getOperation](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getOperation())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The operation.
		- #### hasUnderlying
		
		
		
		```
		public boolean hasUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[hasUnderlying](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#hasUnderlying())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the underlying field is set.
		- #### getUnderlying
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") getUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlying](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlying())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The underlying.
		- #### getUnderlyingOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getUnderlyingOrBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Specified by:
		`[getUnderlyingOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html#getUnderlyingOrBuilder())` in interface `[ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder](ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
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
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder​([ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html)*