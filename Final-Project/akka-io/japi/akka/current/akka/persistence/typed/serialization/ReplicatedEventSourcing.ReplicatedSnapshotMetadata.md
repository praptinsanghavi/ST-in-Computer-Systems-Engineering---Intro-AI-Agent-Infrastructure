---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html
title: ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder
---

# ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ReplicatedSnapshotMetadata`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllSeenPerReplica](#addAllSeenPerReplica(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")> values)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplica](#addSeenPerReplica(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen))​(int index,  [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplica](#addSeenPerReplica(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder))​(int index,  [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplica](#addSeenPerReplica(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen))​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplica](#addSeenPerReplica(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder))​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplicaBuilder](#addSeenPerReplicaBuilder())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[addSeenPerReplicaBuilder](#addSeenPerReplicaBuilder(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearSeenPerReplica](#clearSeenPerReplica())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearVersion](#clearVersion())()` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[getSeenPerReplica](#getSeenPerReplica(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[getSeenPerReplicaBuilder](#getSeenPerReplicaBuilder(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaBuilderList](#getSeenPerReplicaBuilderList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `int` | `[getSeenPerReplicaCount](#getSeenPerReplicaCount())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaList](#getSeenPerReplicaList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getSeenPerReplicaOrBuilder](#getSeenPerReplicaOrBuilder(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaOrBuilderList](#getSeenPerReplicaOrBuilderList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVersion](#getVersion())()` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[getVersionBuilder](#getVersionBuilder())()` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVersionOrBuilder](#getVersionOrBuilder())()` | `required .VersionVector version = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required .VersionVector version = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata))​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeVersion](#mergeVersion(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[removeSeenPerReplica](#removeSeenPerReplica(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setSeenPerReplica](#setSeenPerReplica(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen))​(int index,  [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setSeenPerReplica](#setSeenPerReplica(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder))​(int index,  [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersion](#setVersion(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersion](#setVersion(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `required .VersionVector version = 1;` |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3\.Builder
		
		
		`getAllFields, getField, getFieldBuilder, getOneofFieldDescriptor, getParentForChildren, getRepeatedField, getRepeatedFieldBuilder, getRepeatedFieldCount, getUnknownFields, getUnknownFieldSetBuilder, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, internalGetMutableMapField, internalGetMutableMapFieldReflection, isClean, markClean, mergeUnknownLengthDelimitedField, mergeUnknownVarintField, newBuilderForField, onBuilt, onChanged, parseUnknownField, setUnknownFieldSetBuilder, setUnknownFieldsProto3`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage.Builder
		
		
		`findInitializationErrors, getInitializationErrorString, internalMergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, mergeFrom, newUninitializedMessageException, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite.Builder
		
		
		`addAll, addAll, mergeDelimitedFrom, mergeDelimitedFrom, mergeFrom, newUninitializedMessageException`
		- ### Methods inherited from class java.lang.Object
		
		
		`equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.Message.Builder
		
		
		`mergeDelimitedFrom, mergeDelimitedFrom`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite.Builder
		
		
		`mergeFrom`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                   int index,
		                                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
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
		- #### setVersion
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setVersion​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector version = 1;`
		- #### setVersion
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setVersion​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`required .VersionVector version = 1;`
		- #### mergeVersion
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeVersion​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector version = 1;`
		- #### clearVersion
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clearVersion()
		```
		
		`required .VersionVector version = 1;`
		- #### getVersionBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") getVersionBuilder()
		```
		
		`required .VersionVector version = 1;`
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
		- #### setSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setSeenPerReplica​(int index,
		                                                                                    [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### setSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setSeenPerReplica​(int index,
		                                                                                    [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplica​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplica​(int index,
		                                                                                    [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplica​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplica​(int index,
		                                                                                    [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addAllSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") addAllSeenPerReplica​(java.lang.Iterable<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")> values)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### clearSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") clearSeenPerReplica()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### removeSeenPerReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") removeSeenPerReplica​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") getSeenPerReplicaBuilder​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization") getSeenPerReplicaOrBuilder​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaOrBuilder(int))` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getSeenPerReplicaOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")> getSeenPerReplicaOrBuilderList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		
		Specified by:
		`[getSeenPerReplicaOrBuilderList](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html#getSeenPerReplicaOrBuilderList())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### addSeenPerReplicaBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplicaBuilder()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### addSeenPerReplicaBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") addSeenPerReplicaBuilder​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaBuilderList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")> getSeenPerReplicaBuilderList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html)*