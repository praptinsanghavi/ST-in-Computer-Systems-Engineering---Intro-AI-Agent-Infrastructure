---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:34:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html
title: ReplicatedDataMessages.PNCounter
---

# ReplicatedDataMessages.PNCounter

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.PNCounter

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter

- All Implemented Interfaces:
`[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatedDataMessages](ReplicatedDataMessages.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.PNCounter
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.PNCounter`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | Protobuf type `akka.cluster.ddata.PNCounter` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[DECREMENTS_FIELD_NUMBER](#DECREMENTS_FIELD_NUMBER)` |  |
	| `static int` | `[INCREMENTS_FIELD_NUMBER](#INCREMENTS_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	
	
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
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDecrements](#getDecrements())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getDecrementsOrBuilder](#getDecrementsOrBuilder())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[getIncrements](#getIncrements())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `[ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getIncrementsOrBuilder](#getIncrementsOrBuilder())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `boolean` | `[hasDecrements](#hasDecrements())()` | `required .akka.cluster.ddata.GCounter decrements = 2;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasIncrements](#hasIncrements())()` | `required .akka.cluster.ddata.GCounter increments = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter))​([ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") prototype)` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### INCREMENTS\_FIELD\_NUMBER
		
		
		
		```
		public static final int INCREMENTS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter.INCREMENTS_FIELD_NUMBER)
		- #### DECREMENTS\_FIELD\_NUMBER
		
		
		
		```
		public static final int DECREMENTS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter.DECREMENTS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")> PARSER
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
		- #### hasIncrements
		
		
		
		```
		public boolean hasIncrements()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[hasIncrements](ReplicatedDataMessages.PNCounterOrBuilder.html#hasIncrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the increments field is set.
		- #### getIncrements
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") getIncrements()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[getIncrements](ReplicatedDataMessages.PNCounterOrBuilder.html#getIncrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The increments.
		- #### getIncrementsOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getIncrementsOrBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter increments = 1;`
		
		Specified by:
		`[getIncrementsOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html#getIncrementsOrBuilder())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasDecrements
		
		
		
		```
		public boolean hasDecrements()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[hasDecrements](ReplicatedDataMessages.PNCounterOrBuilder.html#hasDecrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the decrements field is set.
		- #### getDecrements
		
		
		
		```
		public [ReplicatedDataMessages.GCounter](ReplicatedDataMessages.GCounter.html "class in akka.cluster.ddata.protobuf.msg") getDecrements()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[getDecrements](ReplicatedDataMessages.PNCounterOrBuilder.html#getDecrements())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The decrements.
		- #### getDecrementsOrBuilder
		
		
		
		```
		public [ReplicatedDataMessages.GCounterOrBuilder](ReplicatedDataMessages.GCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getDecrementsOrBuilder()
		```
		
		`required .akka.cluster.ddata.GCounter decrements = 2;`
		
		Specified by:
		`[getDecrementsOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html#getDecrementsOrBuilder())` in interface `[ReplicatedDataMessages.PNCounterOrBuilder](ReplicatedDataMessages.PNCounterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
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
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder​([ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatedDataMessages.PNCounter.Builder](ReplicatedDataMessages.PNCounter.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.PNCounter](ReplicatedDataMessages.PNCounter.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.PNCounter.html)*