---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html
title: ReplicatedEventSourcing.ReplicatedSnapshotMetadata
---

# ReplicatedEventSourcing.ReplicatedSnapshotMetadata

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ReplicatedSnapshotMetadata

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatedEventSourcing](ReplicatedEventSourcing.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ReplicatedSnapshotMetadata
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ReplicatedSnapshotMetadata`

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | Protobuf type `ReplicatedSnapshotMetadata` |
	| `static class` | `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | Protobuf type `ReplicatedSnapshotMetadata.Seen` |
	| `static interface` | `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[SEENPERREPLICA_FIELD_NUMBER](#SEENPERREPLICA_FIELD_NUMBER)` |  |
	| `static int` | `[VERSION_FIELD_NUMBER](#VERSION_FIELD_NUMBER)` |  |
	
	
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
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")>` | `[getParserForType](#getParserForType())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[getSeenPerReplica](#getSeenPerReplica(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `int` | `[getSeenPerReplicaCount](#getSeenPerReplicaCount())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaList](#getSeenPerReplicaList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getSeenPerReplicaOrBuilder](#getSeenPerReplicaOrBuilder(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaOrBuilderList](#getSeenPerReplicaOrBuilderList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVersion](#getVersion())()` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVersionOrBuilder](#getVersionOrBuilder())()` | `required .VersionVector version = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required .VersionVector version = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilder](#newBuilder(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata))​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") prototype)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")>` | `[parser](#parser())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### VERSION\_FIELD\_NUMBER
		
		
		
		```
		public static final int VERSION_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.VERSION_FIELD_NUMBER)
		- #### SEENPERREPLICA\_FIELD\_NUMBER
		
		
		
		```
		public static final int SEENPERREPLICA_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SEENPERREPLICA_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")> PARSER
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
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required .VersionVector version = 1;`
		
		Specified by:
		`[hasVersion](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#hasVersion())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getVersion()
		```
		
		`required .VersionVector version = 1;`
		
		Specified by:
		`[getVersion](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getVersion())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The version.
		- #### getVersionOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getVersionOrBuilder()
		```
		
		`required .VersionVector version = 1;`
		
		Specified by:
		`[getVersionOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getVersionOrBuilder())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplicaList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")> getSeenPerReplicaList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaList](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaList())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplicaOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")> getSeenPerReplicaOrBuilderList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaOrBuilderList](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaOrBuilderList())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplicaCount
		
		
		
		```
		public int getSeenPerReplicaCount()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaCount](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaCount())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") getSeenPerReplica​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplica](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplica(int))` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplicaOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization") getSeenPerReplicaOrBuilder​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaOrBuilder(int))` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
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
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(java.nio.ByteBuffer data)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(java.nio.ByteBuffer data,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(byte[] data)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(byte[] data,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(java.io.InputStream input)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(java.io.InputStream input,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseDelimitedFrom​(java.io.InputStream input)
		                                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseDelimitedFrom​(java.io.InputStream input,
		                                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") newBuilder​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html)*