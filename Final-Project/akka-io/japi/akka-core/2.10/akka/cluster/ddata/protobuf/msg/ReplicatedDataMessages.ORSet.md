---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html
title: ReplicatedDataMessages.ORSet.Builder
---

# ReplicatedDataMessages.ORSet.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORSet.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORSet.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORSet`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addActorRefElements](#addActorRefElements(java.lang.String))​(java.lang.String value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addActorRefElementsBytes](#addActorRefElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllActorRefElements](#addAllActorRefElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllDots](#addAllDots(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllIntElements](#addAllIntElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | `repeated sint32 intElements = 4 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllLongElements](#addAllLongElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Long> values)` | `repeated sint64 longElements = 5 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllOtherElements](#addAllOtherElements(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllStringElements](#addAllStringElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string stringElements = 3;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDots](#addDots(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​(int index,  [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDots](#addDots(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Builder))​(int index,  [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDots](#addDots(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDots](#addDots(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Builder))​([ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDotsBuilder](#addDotsBuilder())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addDotsBuilder](#addDotsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addIntElements](#addIntElements(int))​(int value)` | `repeated sint32 intElements = 4 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addLongElements](#addLongElements(long))​(long value)` | `repeated sint64 longElements = 5 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​(int index,  [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​(int index,  [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElementsBuilder](#addOtherElementsBuilder())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElementsBuilder](#addOtherElementsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addStringElements](#addStringElements(java.lang.String))​(java.lang.String value)` | `repeated string stringElements = 3;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addStringElementsBytes](#addStringElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string stringElements = 3;` |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearActorRefElements](#clearActorRefElements())()` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearDots](#clearDots())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearIntElements](#clearIntElements())()` | `repeated sint32 intElements = 4 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearLongElements](#clearLongElements())()` | `repeated sint64 longElements = 5 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOtherElements](#clearOtherElements())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearStringElements](#clearStringElements())()` | `repeated string stringElements = 3;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearVvector](#clearVvector())()` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getActorRefElements](#getActorRefElements(int))​(int index)` | added in Akka 2\.5\.14 |
	| `akka.protobufv3.internal.ByteString` | `[getActorRefElementsBytes](#getActorRefElementsBytes(int))​(int index)` | added in Akka 2\.5\.14 |
	| `int` | `[getActorRefElementsCount](#getActorRefElementsCount())()` | added in Akka 2\.5\.14 |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getActorRefElementsList](#getActorRefElementsList())()` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDots](#getDots(int))​(int index)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDotsBuilder](#getDotsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `java.util.List<[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getDotsBuilderList](#getDotsBuilderList())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `int` | `[getDotsCount](#getDotsCount())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `java.util.List<[ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getDotsList](#getDotsList())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getDotsOrBuilder](#getDotsOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `java.util.List<? extends [ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getDotsOrBuilderList](#getDotsOrBuilderList())()` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `int` | `[getIntElements](#getIntElements(int))​(int index)` | `repeated sint32 intElements = 4 [packed = true];` |
	| `int` | `[getIntElementsCount](#getIntElementsCount())()` | `repeated sint32 intElements = 4 [packed = true];` |
	| `java.util.List<java.lang.Integer>` | `[getIntElementsList](#getIntElementsList())()` | `repeated sint32 intElements = 4 [packed = true];` |
	| `long` | `[getLongElements](#getLongElements(int))​(int index)` | `repeated sint64 longElements = 5 [packed = true];` |
	| `int` | `[getLongElementsCount](#getLongElementsCount())()` | `repeated sint64 longElements = 5 [packed = true];` |
	| `java.util.List<java.lang.Long>` | `[getLongElementsList](#getLongElementsList())()` | `repeated sint64 longElements = 5 [packed = true];` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherElements](#getOtherElements(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherElementsBuilder](#getOtherElementsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `java.util.List<[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsBuilderList](#getOtherElementsBuilderList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `int` | `[getOtherElementsCount](#getOtherElementsCount())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `java.util.List<[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsList](#getOtherElementsList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOtherElementsOrBuilder](#getOtherElementsOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `java.util.List<? extends [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsOrBuilderList](#getOtherElementsOrBuilderList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `java.lang.String` | `[getStringElements](#getStringElements(int))​(int index)` | `repeated string stringElements = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringElementsBytes](#getStringElementsBytes(int))​(int index)` | `repeated string stringElements = 3;` |
	| `int` | `[getStringElementsCount](#getStringElementsCount())()` | `repeated string stringElements = 3;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getStringElementsList](#getStringElementsList())()` | `repeated string stringElements = 3;` |
	| `[ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")` | `[getVvector](#getVvector())()` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getVvectorBuilder](#getVvectorBuilder())()` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `[ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getVvectorOrBuilder](#getVvectorOrBuilder())()` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `boolean` | `[hasVvector](#hasVvector())()` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet))​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeVvector](#mergeVvector(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeDots](#removeDots(int))​(int index)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeOtherElements](#removeOtherElements(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setActorRefElements](#setActorRefElements(int,java.lang.String))​(int index,  java.lang.String value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setDots](#setDots(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​(int index,  [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setDots](#setDots(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Builder))​(int index,  [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.VersionVector dots = 2;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setIntElements](#setIntElements(int,int))​(int index,  int value)` | `repeated sint32 intElements = 4 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setLongElements](#setLongElements(int,long))​(int index,  long value)` | `repeated sint64 longElements = 5 [packed = true];` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherElements](#setOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​(int index,  [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherElements](#setOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​(int index,  [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 6;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setStringElements](#setStringElements(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string stringElements = 3;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setVvector](#setVvector(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector))​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	| `[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setVvector](#setVvector(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Builder))​([ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.VersionVector vvector = 1;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasVvector
		
		
		
		```
		public boolean hasVvector()
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		
		Specified by:
		`[hasVvector](ReplicatedDataMessages.ORSetOrBuilder.html#hasVvector())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the vvector field is set.
		- #### getVvector
		
		
		
		```
		public [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") getVvector()
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		
		Specified by:
		`[getVvector](ReplicatedDataMessages.ORSetOrBuilder.html#getVvector())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The vvector.
		- #### setVvector
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setVvector​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		- #### setVvector
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setVvector​([ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		- #### mergeVvector
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeVvector​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		- #### clearVvector
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearVvector()
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		- #### getVvectorBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") getVvectorBuilder()
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		- #### getVvectorOrBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getVvectorOrBuilder()
		```
		
		`required .akka.cluster.ddata.VersionVector vvector = 1;`
		
		Specified by:
		`[getVvectorOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html#getVvectorOrBuilder())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getDotsList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")> getDotsList()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		
		Specified by:
		`[getDotsList](ReplicatedDataMessages.ORSetOrBuilder.html#getDotsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getDotsCount
		
		
		
		```
		public int getDotsCount()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		
		Specified by:
		`[getDotsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getDotsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getDots
		
		
		
		```
		public [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") getDots​(int index)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		
		Specified by:
		`[getDots](ReplicatedDataMessages.ORSetOrBuilder.html#getDots(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setDots​(int index,
		                                                    [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### setDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setDots​(int index,
		                                                    [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDots​([ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDots​(int index,
		                                                    [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDots​([ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDots​(int index,
		                                                    [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addAllDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllDots​(java.lang.Iterable<? extends [ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### clearDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearDots()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### removeDots
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeDots​(int index)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### getDotsBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") getDotsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### getDotsOrBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getDotsOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		
		Specified by:
		`[getDotsOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html#getDotsOrBuilder(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getDotsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.VersionVectorOrBuilder](ReplicatorMessages.VersionVectorOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getDotsOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		
		Specified by:
		`[getDotsOrBuilderList](ReplicatedDataMessages.ORSetOrBuilder.html#getDotsOrBuilderList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addDotsBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDotsBuilder()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### addDotsBuilder
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg") addDotsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### getDotsBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.VersionVector.Builder](ReplicatorMessages.VersionVector.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getDotsBuilderList()
		```
		
		`repeated .akka.cluster.ddata.VersionVector dots = 2;`
		- #### getStringElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getStringElementsList()
		```
		
		`repeated string stringElements = 3;`
		
		Specified by:
		`[getStringElementsList](ReplicatedDataMessages.ORSetOrBuilder.html#getStringElementsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the stringElements.
		- #### getStringElementsCount
		
		
		
		```
		public int getStringElementsCount()
		```
		
		`repeated string stringElements = 3;`
		
		Specified by:
		`[getStringElementsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getStringElementsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of stringElements.
		- #### getStringElements
		
		
		
		```
		public java.lang.String getStringElements​(int index)
		```
		
		`repeated string stringElements = 3;`
		
		Specified by:
		`[getStringElements](ReplicatedDataMessages.ORSetOrBuilder.html#getStringElements(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The stringElements at the given index.
		- #### getStringElementsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStringElementsBytes​(int index)
		```
		
		`repeated string stringElements = 3;`
		
		Specified by:
		`[getStringElementsBytes](ReplicatedDataMessages.ORSetOrBuilder.html#getStringElementsBytes(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the stringElements at the given index.
		- #### setStringElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setStringElements​(int index,
		                                                              java.lang.String value)
		```
		
		`repeated string stringElements = 3;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The stringElements to set.
		Returns:
		This builder for chaining.
		- #### addStringElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addStringElements​(java.lang.String value)
		```
		
		`repeated string stringElements = 3;`
		
		Parameters:
		`value` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### addAllStringElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllStringElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string stringElements = 3;`
		
		Parameters:
		`values` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### clearStringElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearStringElements()
		```
		
		`repeated string stringElements = 3;`
		
		Returns:
		This builder for chaining.
		- #### addStringElementsBytes
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addStringElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string stringElements = 3;`
		
		Parameters:
		`value` \- The bytes of the stringElements to add.
		Returns:
		This builder for chaining.
		- #### getIntElementsList
		
		
		
		```
		public java.util.List<java.lang.Integer> getIntElementsList()
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Specified by:
		`[getIntElementsList](ReplicatedDataMessages.ORSetOrBuilder.html#getIntElementsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the intElements.
		- #### getIntElementsCount
		
		
		
		```
		public int getIntElementsCount()
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Specified by:
		`[getIntElementsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getIntElementsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of intElements.
		- #### getIntElements
		
		
		
		```
		public int getIntElements​(int index)
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Specified by:
		`[getIntElements](ReplicatedDataMessages.ORSetOrBuilder.html#getIntElements(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The intElements at the given index.
		- #### setIntElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setIntElements​(int index,
		                                                           int value)
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The intElements to set.
		Returns:
		This builder for chaining.
		- #### addIntElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addIntElements​(int value)
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Parameters:
		`value` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### addAllIntElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllIntElements​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Parameters:
		`values` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### clearIntElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearIntElements()
		```
		
		`repeated sint32 intElements = 4 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getLongElementsList
		
		
		
		```
		public java.util.List<java.lang.Long> getLongElementsList()
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Specified by:
		`[getLongElementsList](ReplicatedDataMessages.ORSetOrBuilder.html#getLongElementsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the longElements.
		- #### getLongElementsCount
		
		
		
		```
		public int getLongElementsCount()
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Specified by:
		`[getLongElementsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getLongElementsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of longElements.
		- #### getLongElements
		
		
		
		```
		public long getLongElements​(int index)
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Specified by:
		`[getLongElements](ReplicatedDataMessages.ORSetOrBuilder.html#getLongElements(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The longElements at the given index.
		- #### setLongElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setLongElements​(int index,
		                                                            long value)
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The longElements to set.
		Returns:
		This builder for chaining.
		- #### addLongElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addLongElements​(long value)
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Parameters:
		`value` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### addAllLongElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllLongElements​(java.lang.Iterable<? extends java.lang.Long> values)
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Parameters:
		`values` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### clearLongElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearLongElements()
		```
		
		`repeated sint64 longElements = 5 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getOtherElementsList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> getOtherElementsList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		
		Specified by:
		`[getOtherElementsList](ReplicatedDataMessages.ORSetOrBuilder.html#getOtherElementsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElementsCount
		
		
		
		```
		public int getOtherElementsCount()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		
		Specified by:
		`[getOtherElementsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getOtherElementsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElements
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getOtherElements​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		
		Specified by:
		`[getOtherElements](ReplicatedDataMessages.ORSetOrBuilder.html#getOtherElements(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherElements​(int index,
		                                                             [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherElements​(int index,
		                                                             [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​(int index,
		                                                             [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​(int index,
		                                                             [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addAllOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllOtherElements​(java.lang.Iterable<? extends [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### clearOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOtherElements()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### removeOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeOtherElements​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### getOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getOtherElementsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### getOtherElementsOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOtherElementsOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		
		Specified by:
		`[getOtherElementsOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html#getOtherElementsOrBuilder(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElementsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getOtherElementsOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		
		Specified by:
		`[getOtherElementsOrBuilderList](ReplicatedDataMessages.ORSetOrBuilder.html#getOtherElementsOrBuilderList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElementsBuilder()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElementsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### getOtherElementsBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getOtherElementsBuilderList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 6;`
		- #### getActorRefElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getActorRefElementsList()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Specified by:
		`[getActorRefElementsList](ReplicatedDataMessages.ORSetOrBuilder.html#getActorRefElementsList())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the actorRefElements.
		- #### getActorRefElementsCount
		
		
		
		```
		public int getActorRefElementsCount()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Specified by:
		`[getActorRefElementsCount](ReplicatedDataMessages.ORSetOrBuilder.html#getActorRefElementsCount())` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of actorRefElements.
		- #### getActorRefElements
		
		
		
		```
		public java.lang.String getActorRefElements​(int index)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Specified by:
		`[getActorRefElements](ReplicatedDataMessages.ORSetOrBuilder.html#getActorRefElements(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The actorRefElements at the given index.
		- #### getActorRefElementsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getActorRefElementsBytes​(int index)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Specified by:
		`[getActorRefElementsBytes](ReplicatedDataMessages.ORSetOrBuilder.html#getActorRefElementsBytes(int))` in interface `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the actorRefElements at the given index.
		- #### setActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setActorRefElements​(int index,
		                                                                java.lang.String value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The actorRefElements to set.
		Returns:
		This builder for chaining.
		- #### addActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addActorRefElements​(java.lang.String value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Parameters:
		`value` \- The actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### addAllActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllActorRefElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Parameters:
		`values` \- The actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### clearActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearActorRefElements()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Returns:
		This builder for chaining.
		- #### addActorRefElementsBytes
		
		
		
		```
		public [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addActorRefElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 7;`
		
		Parameters:
		`value` \- The bytes of the actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORSet.Builder](ReplicatedDataMessages.ORSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.Builder.html)*