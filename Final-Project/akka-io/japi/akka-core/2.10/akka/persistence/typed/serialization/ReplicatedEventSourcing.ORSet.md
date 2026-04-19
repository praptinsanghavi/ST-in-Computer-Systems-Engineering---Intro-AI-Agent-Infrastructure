---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.Builder.html
title: ReplicatedEventSourcing.ORSet.Builder
---

# ReplicatedEventSourcing.ORSet.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.ORSet.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.ORSet.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `ORSet`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllDots](#addAllDots(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")> values)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllIntElements](#addAllIntElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | `repeated sint32 intElements = 5 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllLongElements](#addAllLongElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Long> values)` | `repeated sint64 longElements = 6 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllOtherElements](#addAllOtherElements(java.lang.Iterable))​(java.lang.Iterable<? extends [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")> values)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addAllStringElements](#addAllStringElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addDots](#addDots(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​(int index,  [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addDots](#addDots(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​(int index,  [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addDots](#addDots(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addDots](#addDots(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addDotsBuilder](#addDotsBuilder())()` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[addDotsBuilder](#addDotsBuilder(int))​(int index)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addIntElements](#addIntElements(int))​(int value)` | `repeated sint32 intElements = 5 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addLongElements](#addLongElements(long))​(long value)` | `repeated sint64 longElements = 6 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addOtherElements](#addOtherElements(int,akka.remote.ContainerFormats.Payload))​(int index,  [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addOtherElements](#addOtherElements(int,akka.remote.ContainerFormats.Payload.Builder))​(int index,  [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addOtherElements](#addOtherElements(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addOtherElements](#addOtherElements(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `repeated .Payload otherElements = 7;` |
	| `[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[addOtherElementsBuilder](#addOtherElementsBuilder())()` | `repeated .Payload otherElements = 7;` |
	| `[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[addOtherElementsBuilder](#addOtherElementsBuilder(int))​(int index)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addStringElements](#addStringElements(java.lang.String))​(java.lang.String value)` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[addStringElementsBytes](#addStringElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearDots](#clearDots())()` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearIntElements](#clearIntElements())()` | `repeated sint32 intElements = 5 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearLongElements](#clearLongElements())()` | `repeated sint64 longElements = 6 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOriginDc](#clearOriginDc())()` | `required string originDc = 1;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOtherElements](#clearOtherElements())()` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearStringElements](#clearStringElements())()` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clearVvector](#clearVvector())()` | `required .VersionVector vvector = 2;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getDots](#getDots(int))​(int index)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[getDotsBuilder](#getDotsBuilder(int))​(int index)` | `repeated .VersionVector dots = 3;` |
	| `java.util.List<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")>` | `[getDotsBuilderList](#getDotsBuilderList())()` | `repeated .VersionVector dots = 3;` |
	| `int` | `[getDotsCount](#getDotsCount())()` | `repeated .VersionVector dots = 3;` |
	| `java.util.List<[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")>` | `[getDotsList](#getDotsList())()` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getDotsOrBuilder](#getDotsOrBuilder(int))​(int index)` | `repeated .VersionVector dots = 3;` |
	| `java.util.List<? extends [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")>` | `[getDotsOrBuilderList](#getDotsOrBuilderList())()` | `repeated .VersionVector dots = 3;` |
	| `int` | `[getIntElements](#getIntElements(int))​(int index)` | `repeated sint32 intElements = 5 [packed = true];` |
	| `int` | `[getIntElementsCount](#getIntElementsCount())()` | `repeated sint32 intElements = 5 [packed = true];` |
	| `java.util.List<java.lang.Integer>` | `[getIntElementsList](#getIntElementsList())()` | `repeated sint32 intElements = 5 [packed = true];` |
	| `long` | `[getLongElements](#getLongElements(int))​(int index)` | `repeated sint64 longElements = 6 [packed = true];` |
	| `int` | `[getLongElementsCount](#getLongElementsCount())()` | `repeated sint64 longElements = 6 [packed = true];` |
	| `java.util.List<java.lang.Long>` | `[getLongElementsList](#getLongElementsList())()` | `repeated sint64 longElements = 6 [packed = true];` |
	| `java.lang.String` | `[getOriginDc](#getOriginDc())()` | `required string originDc = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getOriginDcBytes](#getOriginDcBytes())()` | `required string originDc = 1;` |
	| `[ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getOtherElements](#getOtherElements(int))​(int index)` | `repeated .Payload otherElements = 7;` |
	| `[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getOtherElementsBuilder](#getOtherElementsBuilder(int))​(int index)` | `repeated .Payload otherElements = 7;` |
	| `java.util.List<[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")>` | `[getOtherElementsBuilderList](#getOtherElementsBuilderList())()` | `repeated .Payload otherElements = 7;` |
	| `int` | `[getOtherElementsCount](#getOtherElementsCount())()` | `repeated .Payload otherElements = 7;` |
	| `java.util.List<[ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")>` | `[getOtherElementsList](#getOtherElementsList())()` | `repeated .Payload otherElements = 7;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getOtherElementsOrBuilder](#getOtherElementsOrBuilder(int))​(int index)` | `repeated .Payload otherElements = 7;` |
	| `java.util.List<? extends [ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")>` | `[getOtherElementsOrBuilderList](#getOtherElementsOrBuilderList())()` | `repeated .Payload otherElements = 7;` |
	| `java.lang.String` | `[getStringElements](#getStringElements(int))​(int index)` | `repeated string stringElements = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringElementsBytes](#getStringElementsBytes(int))​(int index)` | `repeated string stringElements = 4;` |
	| `int` | `[getStringElementsCount](#getStringElementsCount())()` | `repeated string stringElements = 4;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getStringElementsList](#getStringElementsList())()` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVvector](#getVvector())()` | `required .VersionVector vvector = 2;` |
	| `[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")` | `[getVvectorBuilder](#getVvectorBuilder())()` | `required .VersionVector vvector = 2;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVvectorOrBuilder](#getVvectorOrBuilder())()` | `required .VersionVector vvector = 2;` |
	| `boolean` | `[hasOriginDc](#hasOriginDc())()` | `required string originDc = 1;` |
	| `boolean` | `[hasVvector](#hasVvector())()` | `required .VersionVector vvector = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSet))​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeVvector](#mergeVvector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector vvector = 2;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[removeDots](#removeDots(int))​(int index)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[removeOtherElements](#removeOtherElements(int))​(int index)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setDots](#setDots(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​(int index,  [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setDots](#setDots(int,akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​(int index,  [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `repeated .VersionVector dots = 3;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setIntElements](#setIntElements(int,int))​(int index,  int value)` | `repeated sint32 intElements = 5 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setLongElements](#setLongElements(int,long))​(int index,  long value)` | `repeated sint64 longElements = 6 [packed = true];` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setOriginDc](#setOriginDc(java.lang.String))​(java.lang.String value)` | `required string originDc = 1;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setOriginDcBytes](#setOriginDcBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string originDc = 1;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setOtherElements](#setOtherElements(int,akka.remote.ContainerFormats.Payload))​(int index,  [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setOtherElements](#setOtherElements(int,akka.remote.ContainerFormats.Payload.Builder))​(int index,  [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `repeated .Payload otherElements = 7;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setStringElements](#setStringElements(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string stringElements = 4;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setVvector](#setVvector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector))​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)` | `required .VersionVector vvector = 2;` |
	| `[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")` | `[setVvector](#setVvector(akka.persistence.typed.serialization.ReplicatedEventSourcing.VersionVector.Builder))​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)` | `required .VersionVector vvector = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasOriginDc
		
		
		
		```
		public boolean hasOriginDc()
		```
		
		`required string originDc = 1;`
		
		Specified by:
		`[hasOriginDc](ReplicatedEventSourcing.ORSetOrBuilder.html#hasOriginDc())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the originDc field is set.
		- #### getOriginDc
		
		
		
		```
		public java.lang.String getOriginDc()
		```
		
		`required string originDc = 1;`
		
		Specified by:
		`[getOriginDc](ReplicatedEventSourcing.ORSetOrBuilder.html#getOriginDc())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The originDc.
		- #### getOriginDcBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getOriginDcBytes()
		```
		
		`required string originDc = 1;`
		
		Specified by:
		`[getOriginDcBytes](ReplicatedEventSourcing.ORSetOrBuilder.html#getOriginDcBytes())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The bytes for originDc.
		- #### setOriginDc
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setOriginDc​(java.lang.String value)
		```
		
		`required string originDc = 1;`
		
		Parameters:
		`value` \- The originDc to set.
		Returns:
		This builder for chaining.
		- #### clearOriginDc
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearOriginDc()
		```
		
		`required string originDc = 1;`
		
		Returns:
		This builder for chaining.
		- #### setOriginDcBytes
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setOriginDcBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string originDc = 1;`
		
		Parameters:
		`value` \- The bytes for originDc to set.
		Returns:
		This builder for chaining.
		- #### hasVvector
		
		
		
		```
		public boolean hasVvector()
		```
		
		`required .VersionVector vvector = 2;`
		
		Specified by:
		`[hasVvector](ReplicatedEventSourcing.ORSetOrBuilder.html#hasVvector())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the vvector field is set.
		- #### getVvector
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getVvector()
		```
		
		`required .VersionVector vvector = 2;`
		
		Specified by:
		`[getVvector](ReplicatedEventSourcing.ORSetOrBuilder.html#getVvector())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The vvector.
		- #### setVvector
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setVvector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector vvector = 2;`
		- #### setVvector
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setVvector​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`required .VersionVector vvector = 2;`
		- #### mergeVvector
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") mergeVvector​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`required .VersionVector vvector = 2;`
		- #### clearVvector
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearVvector()
		```
		
		`required .VersionVector vvector = 2;`
		- #### getVvectorBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") getVvectorBuilder()
		```
		
		`required .VersionVector vvector = 2;`
		- #### getVvectorOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getVvectorOrBuilder()
		```
		
		`required .VersionVector vvector = 2;`
		
		Specified by:
		`[getVvectorOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html#getVvectorOrBuilder())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getDotsList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")> getDotsList()
		```
		
		`repeated .VersionVector dots = 3;`
		
		Specified by:
		`[getDotsList](ReplicatedEventSourcing.ORSetOrBuilder.html#getDotsList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getDotsCount
		
		
		
		```
		public int getDotsCount()
		```
		
		`repeated .VersionVector dots = 3;`
		
		Specified by:
		`[getDotsCount](ReplicatedEventSourcing.ORSetOrBuilder.html#getDotsCount())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getDots
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getDots​(int index)
		```
		
		`repeated .VersionVector dots = 3;`
		
		Specified by:
		`[getDots](ReplicatedEventSourcing.ORSetOrBuilder.html#getDots(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### setDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setDots​(int index,
		                                                     [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### setDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setDots​(int index,
		                                                     [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addDots​([ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addDots​(int index,
		                                                     [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") value)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addDots​([ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addDots​(int index,
		                                                     [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") builderForValue)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addAllDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addAllDots​(java.lang.Iterable<? extends [ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")> values)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### clearDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearDots()
		```
		
		`repeated .VersionVector dots = 3;`
		- #### removeDots
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") removeDots​(int index)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### getDotsBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") getDotsBuilder​(int index)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### getDotsOrBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getDotsOrBuilder​(int index)
		```
		
		`repeated .VersionVector dots = 3;`
		
		Specified by:
		`[getDotsOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html#getDotsOrBuilder(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getDotsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")> getDotsOrBuilderList()
		```
		
		`repeated .VersionVector dots = 3;`
		
		Specified by:
		`[getDotsOrBuilderList](ReplicatedEventSourcing.ORSetOrBuilder.html#getDotsOrBuilderList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### addDotsBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addDotsBuilder()
		```
		
		`repeated .VersionVector dots = 3;`
		- #### addDotsBuilder
		
		
		
		```
		public [ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization") addDotsBuilder​(int index)
		```
		
		`repeated .VersionVector dots = 3;`
		- #### getDotsBuilderList
		
		
		
		```
		public java.util.List<[ReplicatedEventSourcing.VersionVector.Builder](ReplicatedEventSourcing.VersionVector.Builder.html "class in akka.persistence.typed.serialization")> getDotsBuilderList()
		```
		
		`repeated .VersionVector dots = 3;`
		- #### getStringElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getStringElementsList()
		```
		
		`repeated string stringElements = 4;`
		
		Specified by:
		`[getStringElementsList](ReplicatedEventSourcing.ORSetOrBuilder.html#getStringElementsList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		A list containing the stringElements.
		- #### getStringElementsCount
		
		
		
		```
		public int getStringElementsCount()
		```
		
		`repeated string stringElements = 4;`
		
		Specified by:
		`[getStringElementsCount](ReplicatedEventSourcing.ORSetOrBuilder.html#getStringElementsCount())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The count of stringElements.
		- #### getStringElements
		
		
		
		```
		public java.lang.String getStringElements​(int index)
		```
		
		`repeated string stringElements = 4;`
		
		Specified by:
		`[getStringElements](ReplicatedEventSourcing.ORSetOrBuilder.html#getStringElements(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The stringElements at the given index.
		- #### getStringElementsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStringElementsBytes​(int index)
		```
		
		`repeated string stringElements = 4;`
		
		Specified by:
		`[getStringElementsBytes](ReplicatedEventSourcing.ORSetOrBuilder.html#getStringElementsBytes(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the stringElements at the given index.
		- #### setStringElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setStringElements​(int index,
		                                                               java.lang.String value)
		```
		
		`repeated string stringElements = 4;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The stringElements to set.
		Returns:
		This builder for chaining.
		- #### addStringElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addStringElements​(java.lang.String value)
		```
		
		`repeated string stringElements = 4;`
		
		Parameters:
		`value` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### addAllStringElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addAllStringElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string stringElements = 4;`
		
		Parameters:
		`values` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### clearStringElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearStringElements()
		```
		
		`repeated string stringElements = 4;`
		
		Returns:
		This builder for chaining.
		- #### addStringElementsBytes
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addStringElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string stringElements = 4;`
		
		Parameters:
		`value` \- The bytes of the stringElements to add.
		Returns:
		This builder for chaining.
		- #### getIntElementsList
		
		
		
		```
		public java.util.List<java.lang.Integer> getIntElementsList()
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Specified by:
		`[getIntElementsList](ReplicatedEventSourcing.ORSetOrBuilder.html#getIntElementsList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		A list containing the intElements.
		- #### getIntElementsCount
		
		
		
		```
		public int getIntElementsCount()
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Specified by:
		`[getIntElementsCount](ReplicatedEventSourcing.ORSetOrBuilder.html#getIntElementsCount())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The count of intElements.
		- #### getIntElements
		
		
		
		```
		public int getIntElements​(int index)
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Specified by:
		`[getIntElements](ReplicatedEventSourcing.ORSetOrBuilder.html#getIntElements(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The intElements at the given index.
		- #### setIntElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setIntElements​(int index,
		                                                            int value)
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The intElements to set.
		Returns:
		This builder for chaining.
		- #### addIntElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addIntElements​(int value)
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Parameters:
		`value` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### addAllIntElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addAllIntElements​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Parameters:
		`values` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### clearIntElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearIntElements()
		```
		
		`repeated sint32 intElements = 5 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getLongElementsList
		
		
		
		```
		public java.util.List<java.lang.Long> getLongElementsList()
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Specified by:
		`[getLongElementsList](ReplicatedEventSourcing.ORSetOrBuilder.html#getLongElementsList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		A list containing the longElements.
		- #### getLongElementsCount
		
		
		
		```
		public int getLongElementsCount()
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Specified by:
		`[getLongElementsCount](ReplicatedEventSourcing.ORSetOrBuilder.html#getLongElementsCount())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The count of longElements.
		- #### getLongElements
		
		
		
		```
		public long getLongElements​(int index)
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Specified by:
		`[getLongElements](ReplicatedEventSourcing.ORSetOrBuilder.html#getLongElements(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The longElements at the given index.
		- #### setLongElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setLongElements​(int index,
		                                                             long value)
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The longElements to set.
		Returns:
		This builder for chaining.
		- #### addLongElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addLongElements​(long value)
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Parameters:
		`value` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### addAllLongElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addAllLongElements​(java.lang.Iterable<? extends java.lang.Long> values)
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Parameters:
		`values` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### clearLongElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearLongElements()
		```
		
		`repeated sint64 longElements = 6 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getOtherElementsList
		
		
		
		```
		public java.util.List<[ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")> getOtherElementsList()
		```
		
		`repeated .Payload otherElements = 7;`
		
		Specified by:
		`[getOtherElementsList](ReplicatedEventSourcing.ORSetOrBuilder.html#getOtherElementsList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getOtherElementsCount
		
		
		
		```
		public int getOtherElementsCount()
		```
		
		`repeated .Payload otherElements = 7;`
		
		Specified by:
		`[getOtherElementsCount](ReplicatedEventSourcing.ORSetOrBuilder.html#getOtherElementsCount())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getOtherElements
		
		
		
		```
		public [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") getOtherElements​(int index)
		```
		
		`repeated .Payload otherElements = 7;`
		
		Specified by:
		`[getOtherElements](ReplicatedEventSourcing.ORSetOrBuilder.html#getOtherElements(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setOtherElements​(int index,
		                                                              [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setOtherElements​(int index,
		                                                              [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addOtherElements​([ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addOtherElements​(int index,
		                                                              [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addOtherElements​([ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addOtherElements​(int index,
		                                                              [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addAllOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") addAllOtherElements​(java.lang.Iterable<? extends [ContainerFormats.Payload](../../../remote/ContainerFormats.Payload.html "class in akka.remote")> values)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### clearOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") clearOtherElements()
		```
		
		`repeated .Payload otherElements = 7;`
		- #### removeOtherElements
		
		
		
		```
		public [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") removeOtherElements​(int index)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### getOtherElementsBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getOtherElementsBuilder​(int index)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### getOtherElementsOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getOtherElementsOrBuilder​(int index)
		```
		
		`repeated .Payload otherElements = 7;`
		
		Specified by:
		`[getOtherElementsOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html#getOtherElementsOrBuilder(int))` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### getOtherElementsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ContainerFormats.PayloadOrBuilder](../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")> getOtherElementsOrBuilderList()
		```
		
		`repeated .Payload otherElements = 7;`
		
		Specified by:
		`[getOtherElementsOrBuilderList](ReplicatedEventSourcing.ORSetOrBuilder.html#getOtherElementsOrBuilderList())` in interface `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") addOtherElementsBuilder()
		```
		
		`repeated .Payload otherElements = 7;`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") addOtherElementsBuilder​(int index)
		```
		
		`repeated .Payload otherElements = 7;`
		- #### getOtherElementsBuilderList
		
		
		
		```
		public java.util.List<[ContainerFormats.Payload.Builder](../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")> getOtherElementsBuilderList()
		```
		
		`repeated .Payload otherElements = 7;`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.ORSet.Builder](ReplicatedEventSourcing.ORSet.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.Builder.html)*