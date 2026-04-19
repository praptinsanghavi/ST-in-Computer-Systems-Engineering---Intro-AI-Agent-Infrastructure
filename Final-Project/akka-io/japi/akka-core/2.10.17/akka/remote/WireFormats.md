---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPool.html
title: WireFormats.TailChoppingPool
---

# WireFormats.TailChoppingPool

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.TailChoppingPool

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.WireFormats.TailChoppingPool

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`, `java.io.Serializable`

Enclosing class:
[WireFormats](WireFormats.html "class in akka.remote")

---

```
public static final class WireFormats.TailChoppingPool
extends akka.protobufv3.internal.GeneratedMessageV3
implements [WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")
```

Protobuf type `TailChoppingPool`

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.WireFormats.TailChoppingPool)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | Protobuf type `TailChoppingPool` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[GENERIC_FIELD_NUMBER](#GENERIC_FIELD_NUMBER)` |  |
	| `static int` | `[INTERVAL_FIELD_NUMBER](#INTERVAL_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[WITHIN_FIELD_NUMBER](#WITHIN_FIELD_NUMBER)` |  |
	
	
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
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote")` | `[getGeneric](#getGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote")` | `[getGenericOrBuilder](#getGenericOrBuilder())()` | `required .GenericRoutingPool generic = 1;` |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getInterval](#getInterval())()` | `required .FiniteDuration interval = 3;` |
	| `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")` | `[getIntervalOrBuilder](#getIntervalOrBuilder())()` | `required .FiniteDuration interval = 3;` |
	| `akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote")` | `[getWithin](#getWithin())()` | `required .FiniteDuration within = 2;` |
	| `[WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote")` | `[getWithinOrBuilder](#getWithinOrBuilder())()` | `required .FiniteDuration within = 2;` |
	| `boolean` | `[hasGeneric](#hasGeneric())()` | `required .GenericRoutingPool generic = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasInterval](#hasInterval())()` | `required .FiniteDuration interval = 3;` |
	| `boolean` | `[hasWithin](#hasWithin())()` | `required .FiniteDuration within = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder())()` |  |
	| `static [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder(akka.remote.WireFormats.TailChoppingPool))​([WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") prototype)` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")>` | `[parser](#parser())()` |  |
	| `[WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### GENERIC\_FIELD\_NUMBER
		
		
		
		```
		public static final int GENERIC_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TailChoppingPool.GENERIC_FIELD_NUMBER)
		- #### WITHIN\_FIELD\_NUMBER
		
		
		
		```
		public static final int WITHIN_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TailChoppingPool.WITHIN_FIELD_NUMBER)
		- #### INTERVAL\_FIELD\_NUMBER
		
		
		
		```
		public static final int INTERVAL_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TailChoppingPool.INTERVAL_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")> PARSER
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
		- #### hasGeneric
		
		
		
		```
		public boolean hasGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[hasGeneric](WireFormats.TailChoppingPoolOrBuilder.html#hasGeneric())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the generic field is set.
		- #### getGeneric
		
		
		
		```
		public [WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") getGeneric()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[getGeneric](WireFormats.TailChoppingPoolOrBuilder.html#getGeneric())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The generic.
		- #### getGenericOrBuilder
		
		
		
		```
		public [WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote") getGenericOrBuilder()
		```
		
		`required .GenericRoutingPool generic = 1;`
		
		Specified by:
		`[getGenericOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getGenericOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		- #### hasWithin
		
		
		
		```
		public boolean hasWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[hasWithin](WireFormats.TailChoppingPoolOrBuilder.html#hasWithin())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the within field is set.
		- #### getWithin
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getWithin()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[getWithin](WireFormats.TailChoppingPoolOrBuilder.html#getWithin())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The within.
		- #### getWithinOrBuilder
		
		
		
		```
		public [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote") getWithinOrBuilder()
		```
		
		`required .FiniteDuration within = 2;`
		
		Specified by:
		`[getWithinOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getWithinOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		- #### hasInterval
		
		
		
		```
		public boolean hasInterval()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[hasInterval](WireFormats.TailChoppingPoolOrBuilder.html#hasInterval())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the interval field is set.
		- #### getInterval
		
		
		
		```
		public [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") getInterval()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[getInterval](WireFormats.TailChoppingPoolOrBuilder.html#getInterval())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
		Returns:
		The interval.
		- #### getIntervalOrBuilder
		
		
		
		```
		public [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote") getIntervalOrBuilder()
		```
		
		`required .FiniteDuration interval = 3;`
		
		Specified by:
		`[getIntervalOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html#getIntervalOrBuilder())` in interface `[WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote")`
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
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(byte[] data)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(byte[] data,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(java.io.InputStream input)
		                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(java.io.InputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") newBuilder​([WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.FiniteDuration.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.FiniteDurationOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.GenericRoutingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.GenericRoutingPoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPool.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPool.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/WireFormats.TailChoppingPool.html)*