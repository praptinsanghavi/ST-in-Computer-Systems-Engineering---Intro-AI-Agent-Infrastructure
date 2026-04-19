---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html
title: ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder
---

# ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ReplicatedSnapshotMetadata.Seen`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clearReplicaId](#clearReplicaId())()` | `required string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clearSequenceNr](#clearSequenceNr())()` | `required int64 sequenceNr = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getReplicaId](#getReplicaId())()` | `required string replicaId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getReplicaIdBytes](#getReplicaIdBytes())()` | `required string replicaId = 1;` |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `required int64 sequenceNr = 2;` |
	| `boolean` | `[hasReplicaId](#hasReplicaId())()` | `required string replicaId = 1;` |
	| `boolean` | `[hasSequenceNr](#hasSequenceNr())()` | `required int64 sequenceNr = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen))​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplicaId](#setReplicaId(java.lang.String))​(java.lang.String value)` | `required string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setReplicaIdBytes](#setReplicaIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string replicaId = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setSequenceNr](#setSequenceNr(long))​(long value)` | `required int64 sequenceNr = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                        int index,
		                                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasReplicaId
		
		
		
		```
		public boolean hasReplicaId()
		```
		
		`required string replicaId = 1;`
		
		Specified by:
		`[hasReplicaId](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html#hasReplicaId())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the replicaId field is set.
		- #### getReplicaId
		
		
		
		```
		public java.lang.String getReplicaId()
		```
		
		`required string replicaId = 1;`
		
		Specified by:
		`[getReplicaId](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html#getReplicaId())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The replicaId.
		- #### getReplicaIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getReplicaIdBytes()
		```
		
		`required string replicaId = 1;`
		
		Specified by:
		`[getReplicaIdBytes](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html#getReplicaIdBytes())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for replicaId.
		- #### setReplicaId
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setReplicaId​(java.lang.String value)
		```
		
		`required string replicaId = 1;`
		
		Parameters:
		`value` \- The replicaId to set.
		Returns:
		This builder for chaining.
		- #### clearReplicaId
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clearReplicaId()
		```
		
		`required string replicaId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setReplicaIdBytes
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setReplicaIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string replicaId = 1;`
		
		Parameters:
		`value` \- The bytes for replicaId to set.
		Returns:
		This builder for chaining.
		- #### hasSequenceNr
		
		
		
		```
		public boolean hasSequenceNr()
		```
		
		`required int64 sequenceNr = 2;`
		
		Specified by:
		`[hasSequenceNr](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html#hasSequenceNr())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the sequenceNr field is set.
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		
		`required int64 sequenceNr = 2;`
		
		Specified by:
		`[getSequenceNr](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html#getSequenceNr())` in interface `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The sequenceNr.
		- #### setSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setSequenceNr​(long value)
		```
		
		`required int64 sequenceNr = 2;`
		
		Parameters:
		`value` \- The sequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") clearSequenceNr()
		```
		
		`required int64 sequenceNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.Builder.html)*