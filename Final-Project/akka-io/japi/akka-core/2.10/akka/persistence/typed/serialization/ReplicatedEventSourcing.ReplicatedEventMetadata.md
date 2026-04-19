---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html
title: ReplicatedEventSourcing.ReplicatedEventMetadata.Builder
---

# ReplicatedEventSourcing.ReplicatedEventMetadata.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ReplicatedEventMetadata.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedEventMetadata.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ReplicatedEventMetadata.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ReplicatedEventMetadata`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearConcurrent](#clearConcurrent())()` | `required bool concurrent = 4;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOriginReplica](#clearOriginReplica())()` | `required string originReplica = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOriginSequenceNr](#clearOriginSequenceNr())()` | `required int64 originSequenceNr = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clearVersionVector](#clearVersionVector())()` | `required .VersionVector versionVector = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `boolean` | `[getConcurrent](#getConcurrent())()` | `required bool concurrent = 4;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getOriginReplica](#getOriginReplica())()` | `required string originReplica = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getOriginReplicaBytes](#getOriginReplicaBytes())()` | `required string originReplica = 1;` |
	| `long` | `[getOriginSequenceNr](#getOriginSequenceNr())()` | `required int64 originSequenceNr = 2;` |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVersionVector](#getVersionVector())()` | `required .VersionVector versionVector = 3;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[getVersionVectorBuilder](#getVersionVectorBuilder())()` | `required .VersionVector versionVector = 3;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVersionVectorOrBuilder](#getVersionVectorOrBuilder())()` | `required .VersionVector versionVector = 3;` |
	| `boolean` | `[hasConcurrent](#hasConcurrent())()` | `required bool concurrent = 4;` |
	| `boolean` | `[hasOriginReplica](#hasOriginReplica())()` | `required string originReplica = 1;` |
	| `boolean` | `[hasOriginSequenceNr](#hasOriginSequenceNr())()` | `required int64 originSequenceNr = 2;` |
	| `boolean` | `[hasVersionVector](#hasVersionVector())()` | `required .VersionVector versionVector = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ReplicatedEventMetadata))​([ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeVersionVector](#mergeVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector versionVector = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setConcurrent](#setConcurrent(boolean))​(boolean value)` | `required bool concurrent = 4;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setOriginReplica](#setOriginReplica(java.lang.String))​(java.lang.String value)` | `required string originReplica = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setOriginReplicaBytes](#setOriginReplicaBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string originReplica = 1;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setOriginSequenceNr](#setOriginSequenceNr(long))​(long value)` | `required int64 originSequenceNr = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersionVector](#setVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector versionVector = 3;` |
	| `[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")` | `[setVersionVector](#setVersionVector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `required .VersionVector versionVector = 3;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                int index,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ReplicatedEventMetadata](ReplicatedEventSourcing.ReplicatedEventMetadata.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasOriginReplica
		
		
		
		```
		public boolean hasOriginReplica()
		```
		
		`required string originReplica = 1;`
		
		Specified by:
		`[hasOriginReplica](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#hasOriginReplica())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the originReplica field is set.
		- #### getOriginReplica
		
		
		
		```
		public java.lang.String getOriginReplica()
		```
		
		`required string originReplica = 1;`
		
		Specified by:
		`[getOriginReplica](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getOriginReplica())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The originReplica.
		- #### getOriginReplicaBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOriginReplicaBytes()
		```
		
		`required string originReplica = 1;`
		
		Specified by:
		`[getOriginReplicaBytes](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getOriginReplicaBytes())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for originReplica.
		- #### setOriginReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setOriginReplica​(java.lang.String value)
		```
		
		`required string originReplica = 1;`
		
		Parameters:
		`value` \- The originReplica to set.
		Returns:
		This builder for chaining.
		- #### clearOriginReplica
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearOriginReplica()
		```
		
		`required string originReplica = 1;`
		
		Returns:
		This builder for chaining.
		- #### setOriginReplicaBytes
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setOriginReplicaBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string originReplica = 1;`
		
		Parameters:
		`value` \- The bytes for originReplica to set.
		Returns:
		This builder for chaining.
		- #### hasOriginSequenceNr
		
		
		
		```
		public boolean hasOriginSequenceNr()
		```
		
		`required int64 originSequenceNr = 2;`
		
		Specified by:
		`[hasOriginSequenceNr](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#hasOriginSequenceNr())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the originSequenceNr field is set.
		- #### getOriginSequenceNr
		
		
		
		```
		public long getOriginSequenceNr()
		```
		
		`required int64 originSequenceNr = 2;`
		
		Specified by:
		`[getOriginSequenceNr](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getOriginSequenceNr())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The originSequenceNr.
		- #### setOriginSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setOriginSequenceNr​(long value)
		```
		
		`required int64 originSequenceNr = 2;`
		
		Parameters:
		`value` \- The originSequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearOriginSequenceNr
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearOriginSequenceNr()
		```
		
		`required int64 originSequenceNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasVersionVector
		
		
		
		```
		public boolean hasVersionVector()
		```
		
		`required .VersionVector versionVector = 3;`
		
		Specified by:
		`[hasVersionVector](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#hasVersionVector())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the versionVector field is set.
		- #### getVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getVersionVector()
		```
		
		`required .VersionVector versionVector = 3;`
		
		Specified by:
		`[getVersionVector](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getVersionVector())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The versionVector.
		- #### setVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setVersionVector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector versionVector = 3;`
		- #### setVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setVersionVector​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`required .VersionVector versionVector = 3;`
		- #### mergeVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeVersionVector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector versionVector = 3;`
		- #### clearVersionVector
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearVersionVector()
		```
		
		`required .VersionVector versionVector = 3;`
		- #### getVersionVectorBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") getVersionVectorBuilder()
		```
		
		`required .VersionVector versionVector = 3;`
		- #### getVersionVectorOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getVersionVectorOrBuilder()
		```
		
		`required .VersionVector versionVector = 3;`
		
		Specified by:
		`[getVersionVectorOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getVersionVectorOrBuilder())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### hasConcurrent
		
		
		
		```
		public boolean hasConcurrent()
		```
		
		`required bool concurrent = 4;`
		
		Specified by:
		`[hasConcurrent](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#hasConcurrent())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the concurrent field is set.
		- #### getConcurrent
		
		
		
		```
		public boolean getConcurrent()
		```
		
		`required bool concurrent = 4;`
		
		Specified by:
		`[getConcurrent](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html#getConcurrent())` in interface `[ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder](ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The concurrent.
		- #### setConcurrent
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setConcurrent​(boolean value)
		```
		
		`required bool concurrent = 4;`
		
		Parameters:
		`value` \- The concurrent to set.
		Returns:
		This builder for chaining.
		- #### clearConcurrent
		
		
		
		```
		public [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") clearConcurrent()
		```
		
		`required bool concurrent = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ReplicatedEventMetadata.Builder](ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedEventMetadata.Builder.html)*