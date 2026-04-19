---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html
title: ShardingMessages.GetNumberOfProcessesReply
---

# ShardingMessages.GetNumberOfProcessesReply

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Class ShardingMessages.GetNumberOfProcessesReply

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply

- All Implemented Interfaces:
`[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ShardingMessages](ShardingMessages.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static final class ShardingMessages.GetNumberOfProcessesReply
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")
```

Protobuf type `akka.cluster.sharding.typed.GetNumberOfProcessesReply`

See Also:
[Serialized Form](../../../../../../serialized-form.html#akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | Protobuf type `akka.cluster.sharding.typed.GetNumberOfProcessesReply` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[NUMBEROFPROCESSES_FIELD_NUMBER](#NUMBEROFPROCESSES_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[RESCALEINPROGRESS_FIELD_NUMBER](#RESCALEINPROGRESS_FIELD_NUMBER)` |  |
	| `static int` | `[REVISION_FIELD_NUMBER](#REVISION_FIELD_NUMBER)` |  |
	| `static int` | `[STARTEDTIMESTAMPMILLIS_FIELD_NUMBER](#STARTEDTIMESTAMPMILLIS_FIELD_NUMBER)` |  |
	
	
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
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `int` | `[getNumberOfProcesses](#getNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")>` | `[getParserForType](#getParserForType())()` |  |
	| `boolean` | `[getRescaleInProgress](#getRescaleInProgress())()` | `required bool rescaleInProgress = 3;` |
	| `long` | `[getRevision](#getRevision())()` | `required int64 revision = 1;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getStartedTimestampMillis](#getStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasNumberOfProcesses](#hasNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `boolean` | `[hasRescaleInProgress](#hasRescaleInProgress())()` | `required bool rescaleInProgress = 3;` |
	| `boolean` | `[hasRevision](#hasRevision())()` | `required int64 revision = 1;` |
	| `boolean` | `[hasStartedTimestampMillis](#hasStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[newBuilder](#newBuilder(akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply))​([ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") prototype)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")>` | `[parser](#parser())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### REVISION\_FIELD\_NUMBER
		
		
		
		```
		public static final int REVISION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../../constant-values.html#akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply.REVISION_FIELD_NUMBER)
		- #### NUMBEROFPROCESSES\_FIELD\_NUMBER
		
		
		
		```
		public static final int NUMBEROFPROCESSES_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../../constant-values.html#akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply.NUMBEROFPROCESSES_FIELD_NUMBER)
		- #### RESCALEINPROGRESS\_FIELD\_NUMBER
		
		
		
		```
		public static final int RESCALEINPROGRESS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../../constant-values.html#akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply.RESCALEINPROGRESS_FIELD_NUMBER)
		- #### STARTEDTIMESTAMPMILLIS\_FIELD\_NUMBER
		
		
		
		```
		public static final int STARTEDTIMESTAMPMILLIS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../../constant-values.html#akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply.STARTEDTIMESTAMPMILLIS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")> PARSER
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
		- #### hasRevision
		
		
		
		```
		public boolean hasRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[hasRevision](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasRevision())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the revision field is set.
		- #### getRevision
		
		
		
		```
		public long getRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[getRevision](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getRevision())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The revision.
		- #### hasNumberOfProcesses
		
		
		
		```
		public boolean hasNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Specified by:
		`[hasNumberOfProcesses](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasNumberOfProcesses())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the numberOfProcesses field is set.
		- #### getNumberOfProcesses
		
		
		
		```
		public int getNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Specified by:
		`[getNumberOfProcesses](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getNumberOfProcesses())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The numberOfProcesses.
		- #### hasRescaleInProgress
		
		
		
		```
		public boolean hasRescaleInProgress()
		```
		
		`required bool rescaleInProgress = 3;`
		
		Specified by:
		`[hasRescaleInProgress](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasRescaleInProgress())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the rescaleInProgress field is set.
		- #### getRescaleInProgress
		
		
		
		```
		public boolean getRescaleInProgress()
		```
		
		`required bool rescaleInProgress = 3;`
		
		Specified by:
		`[getRescaleInProgress](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getRescaleInProgress())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The rescaleInProgress.
		- #### hasStartedTimestampMillis
		
		
		
		```
		public boolean hasStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[hasStartedTimestampMillis](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasStartedTimestampMillis())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the startedTimestampMillis field is set.
		- #### getStartedTimestampMillis
		
		
		
		```
		public long getStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[getStartedTimestampMillis](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getStartedTimestampMillis())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The startedTimestampMillis.
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
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(java.nio.ByteBuffer data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(byte[] data)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(byte[] data,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(java.io.InputStream input)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(java.io.InputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseDelimitedFrom​(java.io.InputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") newBuilder​([ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html)*