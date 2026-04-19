---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html
title: ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder
---

# ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ReplicatedPublishedEventMetaData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clearMetadata](#clearMetadata())()` | `optional .Payload metadata = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clearReplicaId](#clearReplicaId())()` | `optional string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clearVersionVector](#clearVersionVector())()` | `optional .VersionVector versionVector = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMetadata](#getMetadata())()` | `optional .Payload metadata = 3;` |
	| `[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMetadataBuilder](#getMetadataBuilder())()` | `optional .Payload metadata = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMetadataOrBuilder](#getMetadataOrBuilder())()` | `optional .Payload metadata = 3;` |
	| `java.lang.String` | `[getReplicaId](#getReplicaId())()` | `optional string replicaId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getReplicaIdBytes](#getReplicaIdBytes())()` | `optional string replicaId = 1;` |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVersionVector](#getVersionVector())()` | `optional .VersionVector versionVector = 2;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[getVersionVectorBuilder](#getVersionVectorBuilder())()` | `optional .VersionVector versionVector = 2;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVersionVectorOrBuilder](#getVersionVectorOrBuilder())()` | `optional .VersionVector versionVector = 2;` |
	| `boolean` | `[hasMetadata](#hasMetadata())()` | `optional .Payload metadata = 3;` |
	| `boolean` | `[hasReplicaId](#hasReplicaId())()` | `optional string replicaId = 1;` |
	| `boolean` | `[hasVersionVector](#hasVersionVector())()` | `optional .VersionVector versionVector = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedPublishedEventMetaData))​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeMetadata](#mergeMetadata(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload metadata = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeVersionVector](#mergeVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `optional .VersionVector versionVector = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setMetadata](#setMetadata(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload metadata = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setMetadata](#setMetadata(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload metadata = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplicaId](#setReplicaId(java.lang.String))​(java.lang.String value)` | `optional string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplicaIdBytes](#setReplicaIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersionVector](#setVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `optional .VersionVector versionVector = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersionVector](#setVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `optional .VersionVector versionVector = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                         int index,
		                                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ReplicatedPublishedEventMetaData](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasReplicaId
		
		
		
		```
		public boolean hasReplicaId()
		```
		
		`optional string replicaId = 1;`
		
		Specified by:
		`[hasReplicaId](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#hasReplicaId())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the replicaId field is set.
		- #### getReplicaId
		
		
		
		```
		public java.lang.String getReplicaId()
		```
		
		`optional string replicaId = 1;`
		
		Specified by:
		`[getReplicaId](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getReplicaId())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The replicaId.
		- #### getReplicaIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getReplicaIdBytes()
		```
		
		`optional string replicaId = 1;`
		
		Specified by:
		`[getReplicaIdBytes](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getReplicaIdBytes())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for replicaId.
		- #### setReplicaId
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setReplicaId​(java.lang.String value)
		```
		
		`optional string replicaId = 1;`
		
		Parameters:
		`value` \- The replicaId to set.
		Returns:
		This builder for chaining.
		- #### clearReplicaId
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clearReplicaId()
		```
		
		`optional string replicaId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setReplicaIdBytes
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setReplicaIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string replicaId = 1;`
		
		Parameters:
		`value` \- The bytes for replicaId to set.
		Returns:
		This builder for chaining.
		- #### hasVersionVector
		
		
		
		```
		public boolean hasVersionVector()
		```
		
		`optional .VersionVector versionVector = 2;`
		
		Specified by:
		`[hasVersionVector](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#hasVersionVector())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the versionVector field is set.
		- #### getVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getVersionVector()
		```
		
		`optional .VersionVector versionVector = 2;`
		
		Specified by:
		`[getVersionVector](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getVersionVector())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The versionVector.
		- #### setVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setVersionVector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`optional .VersionVector versionVector = 2;`
		- #### setVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setVersionVector​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`optional .VersionVector versionVector = 2;`
		- #### mergeVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeVersionVector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`optional .VersionVector versionVector = 2;`
		- #### clearVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clearVersionVector()
		```
		
		`optional .VersionVector versionVector = 2;`
		- #### getVersionVectorBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") getVersionVectorBuilder()
		```
		
		`optional .VersionVector versionVector = 2;`
		- #### getVersionVectorOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getVersionVectorOrBuilder()
		```
		
		`optional .VersionVector versionVector = 2;`
		
		Specified by:
		`[getVersionVectorOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getVersionVectorOrBuilder())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### hasMetadata
		
		
		
		```
		public boolean hasMetadata()
		```
		
		`optional .Payload metadata = 3;`
		
		Specified by:
		`[hasMetadata](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#hasMetadata())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the metadata field is set.
		- #### getMetadata
		
		
		
		```
		public [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMetadata()
		```
		
		`optional .Payload metadata = 3;`
		
		Specified by:
		`[getMetadata](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getMetadata())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The metadata.
		- #### setMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setMetadata​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload metadata = 3;`
		- #### setMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setMetadata​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload metadata = 3;`
		- #### mergeMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeMetadata​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload metadata = 3;`
		- #### clearMetadata
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") clearMetadata()
		```
		
		`optional .Payload metadata = 3;`
		- #### getMetadataBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMetadataBuilder()
		```
		
		`optional .Payload metadata = 3;`
		- #### getMetadataOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMetadataOrBuilder()
		```
		
		`optional .Payload metadata = 3;`
		
		Specified by:
		`[getMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html#getMetadataOrBuilder())` in interface `[ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder](ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedPublishedEventMetaData.Builder.html)*