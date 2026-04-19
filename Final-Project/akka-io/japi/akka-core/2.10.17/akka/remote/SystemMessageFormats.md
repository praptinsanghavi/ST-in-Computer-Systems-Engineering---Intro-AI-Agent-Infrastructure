---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.html
title: SystemMessageFormats.SystemMessage
---

# SystemMessageFormats.SystemMessage

## Content

Package [akka.remote](package-summary.html)
## Class SystemMessageFormats.SystemMessage

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.SystemMessageFormats.SystemMessage

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`, `java.io.Serializable`

Enclosing class:
[SystemMessageFormats](SystemMessageFormats.html "class in akka.remote")

---

```
public static final class SystemMessageFormats.SystemMessage
extends akka.protobufv3.internal.GeneratedMessageV3
implements [SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")
```

Protobuf type `SystemMessage`

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.SystemMessageFormats.SystemMessage)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | Protobuf type `SystemMessage` |
	| `static class` | `[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | Protobuf enum `SystemMessage.Type` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CAUSEDATA_FIELD_NUMBER](#CAUSEDATA_FIELD_NUMBER)` |  |
	| `static int` | `[DWNOTIFICATIONDATA_FIELD_NUMBER](#DWNOTIFICATIONDATA_FIELD_NUMBER)` |  |
	| `static int` | `[FAILEDDATA_FIELD_NUMBER](#FAILEDDATA_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[SUPERVISEDATA_FIELD_NUMBER](#SUPERVISEDATA_FIELD_NUMBER)` |  |
	| `static int` | `[TYPE_FIELD_NUMBER](#TYPE_FIELD_NUMBER)` |  |
	| `static int` | `[WATCHDATA_FIELD_NUMBER](#WATCHDATA_FIELD_NUMBER)` |  |
	
	
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
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getCauseData](#getCauseData())()` | `optional .Payload causeData = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getCauseDataOrBuilder](#getCauseDataOrBuilder())()` | `optional .Payload causeData = 3;` |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote")` | `[getDwNotificationData](#getDwNotificationData())()` | `optional .DeathWatchNotificationData dwNotificationData = 7;` |
	| `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")` | `[getDwNotificationDataOrBuilder](#getDwNotificationDataOrBuilder())()` | `optional .DeathWatchNotificationData dwNotificationData = 7;` |
	| `[SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote")` | `[getFailedData](#getFailedData())()` | `optional .FailedData failedData = 6;` |
	| `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")` | `[getFailedDataOrBuilder](#getFailedDataOrBuilder())()` | `optional .FailedData failedData = 6;` |
	| `akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[SystemMessageFormats.SuperviseData](SystemMessageFormats.SuperviseData.html "class in akka.remote")` | `[getSuperviseData](#getSuperviseData())()` | `optional .SuperviseData superviseData = 5;` |
	| `[SystemMessageFormats.SuperviseDataOrBuilder](SystemMessageFormats.SuperviseDataOrBuilder.html "interface in akka.remote")` | `[getSuperviseDataOrBuilder](#getSuperviseDataOrBuilder())()` | `optional .SuperviseData superviseData = 5;` |
	| `[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | `[getType](#getType())()` | `required .SystemMessage.Type type = 1;` |
	| `[SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote")` | `[getWatchData](#getWatchData())()` | `optional .WatchData watchData = 2;` |
	| `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")` | `[getWatchDataOrBuilder](#getWatchDataOrBuilder())()` | `optional .WatchData watchData = 2;` |
	| `boolean` | `[hasCauseData](#hasCauseData())()` | `optional .Payload causeData = 3;` |
	| `boolean` | `[hasDwNotificationData](#hasDwNotificationData())()` | `optional .DeathWatchNotificationData dwNotificationData = 7;` |
	| `boolean` | `[hasFailedData](#hasFailedData())()` | `optional .FailedData failedData = 6;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasSuperviseData](#hasSuperviseData())()` | `optional .SuperviseData superviseData = 5;` |
	| `boolean` | `[hasType](#hasType())()` | `required .SystemMessage.Type type = 1;` |
	| `boolean` | `[hasWatchData](#hasWatchData())()` | `optional .WatchData watchData = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder())()` |  |
	| `static [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder(akka.remote.SystemMessageFormats.SystemMessage))​([SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") prototype)` |  |
	| `[SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")>` | `[parser](#parser())()` |  |
	| `[SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### TYPE\_FIELD\_NUMBER
		
		
		
		```
		public static final int TYPE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.TYPE_FIELD_NUMBER)
		- #### WATCHDATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int WATCHDATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.WATCHDATA_FIELD_NUMBER)
		- #### CAUSEDATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int CAUSEDATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.CAUSEDATA_FIELD_NUMBER)
		- #### SUPERVISEDATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int SUPERVISEDATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.SUPERVISEDATA_FIELD_NUMBER)
		- #### FAILEDDATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int FAILEDDATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.FAILEDDATA_FIELD_NUMBER)
		- #### DWNOTIFICATIONDATA\_FIELD\_NUMBER
		
		
		
		```
		public static final int DWNOTIFICATIONDATA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.DWNOTIFICATIONDATA_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")> PARSER
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
		- #### hasType
		
		
		
		```
		public boolean hasType()
		```
		
		`required .SystemMessage.Type type = 1;`
		
		Specified by:
		`[hasType](SystemMessageFormats.SystemMessageOrBuilder.html#hasType())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the type field is set.
		- #### getType
		
		
		
		```
		public [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") getType()
		```
		
		`required .SystemMessage.Type type = 1;`
		
		Specified by:
		`[getType](SystemMessageFormats.SystemMessageOrBuilder.html#getType())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The type.
		- #### hasWatchData
		
		
		
		```
		public boolean hasWatchData()
		```
		
		`optional .WatchData watchData = 2;`
		
		Specified by:
		`[hasWatchData](SystemMessageFormats.SystemMessageOrBuilder.html#hasWatchData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the watchData field is set.
		- #### getWatchData
		
		
		
		```
		public [SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") getWatchData()
		```
		
		`optional .WatchData watchData = 2;`
		
		Specified by:
		`[getWatchData](SystemMessageFormats.SystemMessageOrBuilder.html#getWatchData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The watchData.
		- #### getWatchDataOrBuilder
		
		
		
		```
		public [SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote") getWatchDataOrBuilder()
		```
		
		`optional .WatchData watchData = 2;`
		
		Specified by:
		`[getWatchDataOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html#getWatchDataOrBuilder())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		- #### hasCauseData
		
		
		
		```
		public boolean hasCauseData()
		```
		
		`optional .Payload causeData = 3;`
		
		Specified by:
		`[hasCauseData](SystemMessageFormats.SystemMessageOrBuilder.html#hasCauseData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the causeData field is set.
		- #### getCauseData
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getCauseData()
		```
		
		`optional .Payload causeData = 3;`
		
		Specified by:
		`[getCauseData](SystemMessageFormats.SystemMessageOrBuilder.html#getCauseData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The causeData.
		- #### getCauseDataOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getCauseDataOrBuilder()
		```
		
		`optional .Payload causeData = 3;`
		
		Specified by:
		`[getCauseDataOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html#getCauseDataOrBuilder())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		- #### hasSuperviseData
		
		
		
		```
		public boolean hasSuperviseData()
		```
		
		`optional .SuperviseData superviseData = 5;`
		
		Specified by:
		`[hasSuperviseData](SystemMessageFormats.SystemMessageOrBuilder.html#hasSuperviseData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the superviseData field is set.
		- #### getSuperviseData
		
		
		
		```
		public [SystemMessageFormats.SuperviseData](SystemMessageFormats.SuperviseData.html "class in akka.remote") getSuperviseData()
		```
		
		`optional .SuperviseData superviseData = 5;`
		
		Specified by:
		`[getSuperviseData](SystemMessageFormats.SystemMessageOrBuilder.html#getSuperviseData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The superviseData.
		- #### getSuperviseDataOrBuilder
		
		
		
		```
		public [SystemMessageFormats.SuperviseDataOrBuilder](SystemMessageFormats.SuperviseDataOrBuilder.html "interface in akka.remote") getSuperviseDataOrBuilder()
		```
		
		`optional .SuperviseData superviseData = 5;`
		
		Specified by:
		`[getSuperviseDataOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html#getSuperviseDataOrBuilder())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		- #### hasFailedData
		
		
		
		```
		public boolean hasFailedData()
		```
		
		`optional .FailedData failedData = 6;`
		
		Specified by:
		`[hasFailedData](SystemMessageFormats.SystemMessageOrBuilder.html#hasFailedData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the failedData field is set.
		- #### getFailedData
		
		
		
		```
		public [SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") getFailedData()
		```
		
		`optional .FailedData failedData = 6;`
		
		Specified by:
		`[getFailedData](SystemMessageFormats.SystemMessageOrBuilder.html#getFailedData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The failedData.
		- #### getFailedDataOrBuilder
		
		
		
		```
		public [SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote") getFailedDataOrBuilder()
		```
		
		`optional .FailedData failedData = 6;`
		
		Specified by:
		`[getFailedDataOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html#getFailedDataOrBuilder())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		- #### hasDwNotificationData
		
		
		
		```
		public boolean hasDwNotificationData()
		```
		
		`optional .DeathWatchNotificationData dwNotificationData = 7;`
		
		Specified by:
		`[hasDwNotificationData](SystemMessageFormats.SystemMessageOrBuilder.html#hasDwNotificationData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the dwNotificationData field is set.
		- #### getDwNotificationData
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") getDwNotificationData()
		```
		
		`optional .DeathWatchNotificationData dwNotificationData = 7;`
		
		Specified by:
		`[getDwNotificationData](SystemMessageFormats.SystemMessageOrBuilder.html#getDwNotificationData())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The dwNotificationData.
		- #### getDwNotificationDataOrBuilder
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote") getDwNotificationDataOrBuilder()
		```
		
		`optional .DeathWatchNotificationData dwNotificationData = 7;`
		
		Specified by:
		`[getDwNotificationDataOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html#getDwNotificationDataOrBuilder())` in interface `[SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote")`
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
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(byte[] data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(byte[] data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") newBuilder​([SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.DeathWatchNotificationData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.FailedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.FailedDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SuperviseData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SuperviseDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.Type.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.WatchData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.WatchDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/SystemMessageFormats.SystemMessage.html)*