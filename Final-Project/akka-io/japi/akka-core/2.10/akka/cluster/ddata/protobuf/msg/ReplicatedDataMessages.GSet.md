---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.Builder.html
title: ReplicatedDataMessages.GSet.Builder
---

# ReplicatedDataMessages.GSet.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.GSet.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.GSet.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.GSet`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addActorRefElements](#addActorRefElements(java.lang.String))​(java.lang.String value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addActorRefElementsBytes](#addActorRefElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllActorRefElements](#addAllActorRefElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllIntElements](#addAllIntElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | `repeated sint32 intElements = 2 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllLongElements](#addAllLongElements(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Long> values)` | `repeated sint64 longElements = 3 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllOtherElements](#addAllOtherElements(java.lang.Iterable))​(java.lang.Iterable<? extends [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> values)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllStringElements](#addAllStringElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string stringElements = 1;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addIntElements](#addIntElements(int))​(int value)` | `repeated sint32 intElements = 2 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addLongElements](#addLongElements(long))​(long value)` | `repeated sint64 longElements = 3 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​(int index,  [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​(int index,  [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElements](#addOtherElements(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElementsBuilder](#addOtherElementsBuilder())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addOtherElementsBuilder](#addOtherElementsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addStringElements](#addStringElements(java.lang.String))​(java.lang.String value)` | `repeated string stringElements = 1;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addStringElementsBytes](#addStringElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string stringElements = 1;` |
	| `[ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearActorRefElements](#clearActorRefElements())()` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearIntElements](#clearIntElements())()` | `repeated sint32 intElements = 2 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearLongElements](#clearLongElements())()` | `repeated sint64 longElements = 3 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOtherElements](#clearOtherElements())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearStringElements](#clearStringElements())()` | `repeated string stringElements = 1;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getActorRefElements](#getActorRefElements(int))​(int index)` | added in Akka 2\.5\.14 |
	| `akka.protobufv3.internal.ByteString` | `[getActorRefElementsBytes](#getActorRefElementsBytes(int))​(int index)` | added in Akka 2\.5\.14 |
	| `int` | `[getActorRefElementsCount](#getActorRefElementsCount())()` | added in Akka 2\.5\.14 |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getActorRefElementsList](#getActorRefElementsList())()` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getIntElements](#getIntElements(int))​(int index)` | `repeated sint32 intElements = 2 [packed = true];` |
	| `int` | `[getIntElementsCount](#getIntElementsCount())()` | `repeated sint32 intElements = 2 [packed = true];` |
	| `java.util.List<java.lang.Integer>` | `[getIntElementsList](#getIntElementsList())()` | `repeated sint32 intElements = 2 [packed = true];` |
	| `long` | `[getLongElements](#getLongElements(int))​(int index)` | `repeated sint64 longElements = 3 [packed = true];` |
	| `int` | `[getLongElementsCount](#getLongElementsCount())()` | `repeated sint64 longElements = 3 [packed = true];` |
	| `java.util.List<java.lang.Long>` | `[getLongElementsList](#getLongElementsList())()` | `repeated sint64 longElements = 3 [packed = true];` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherElements](#getOtherElements(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherElementsBuilder](#getOtherElementsBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `java.util.List<[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsBuilderList](#getOtherElementsBuilderList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `int` | `[getOtherElementsCount](#getOtherElementsCount())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `java.util.List<[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsList](#getOtherElementsList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOtherElementsOrBuilder](#getOtherElementsOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `java.util.List<? extends [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getOtherElementsOrBuilderList](#getOtherElementsOrBuilderList())()` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `java.lang.String` | `[getStringElements](#getStringElements(int))​(int index)` | `repeated string stringElements = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringElementsBytes](#getStringElementsBytes(int))​(int index)` | `repeated string stringElements = 1;` |
	| `int` | `[getStringElementsCount](#getStringElementsCount())()` | `repeated string stringElements = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getStringElementsList](#getStringElementsList())()` | `repeated string stringElements = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet))​([ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[removeOtherElements](#removeOtherElements(int))​(int index)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setActorRefElements](#setActorRefElements(int,java.lang.String))​(int index,  java.lang.String value)` | added in Akka 2\.5\.14 |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setIntElements](#setIntElements(int,int))​(int index,  int value)` | `repeated sint32 intElements = 2 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setLongElements](#setLongElements(int,long))​(int index,  long value)` | `repeated sint64 longElements = 3 [packed = true];` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherElements](#setOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​(int index,  [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherElements](#setOtherElements(int,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​(int index,  [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `repeated .akka.cluster.ddata.OtherMessage otherElements = 4;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setStringElements](#setStringElements(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string stringElements = 1;` |
	| `[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.GSet](ReplicatedDataMessages.GSet.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getStringElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getStringElementsList()
		```
		
		`repeated string stringElements = 1;`
		
		Specified by:
		`[getStringElementsList](ReplicatedDataMessages.GSetOrBuilder.html#getStringElementsList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the stringElements.
		- #### getStringElementsCount
		
		
		
		```
		public int getStringElementsCount()
		```
		
		`repeated string stringElements = 1;`
		
		Specified by:
		`[getStringElementsCount](ReplicatedDataMessages.GSetOrBuilder.html#getStringElementsCount())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of stringElements.
		- #### getStringElements
		
		
		
		```
		public java.lang.String getStringElements​(int index)
		```
		
		`repeated string stringElements = 1;`
		
		Specified by:
		`[getStringElements](ReplicatedDataMessages.GSetOrBuilder.html#getStringElements(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The stringElements at the given index.
		- #### getStringElementsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStringElementsBytes​(int index)
		```
		
		`repeated string stringElements = 1;`
		
		Specified by:
		`[getStringElementsBytes](ReplicatedDataMessages.GSetOrBuilder.html#getStringElementsBytes(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the stringElements at the given index.
		- #### setStringElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setStringElements​(int index,
		                                                             java.lang.String value)
		```
		
		`repeated string stringElements = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The stringElements to set.
		Returns:
		This builder for chaining.
		- #### addStringElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addStringElements​(java.lang.String value)
		```
		
		`repeated string stringElements = 1;`
		
		Parameters:
		`value` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### addAllStringElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllStringElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string stringElements = 1;`
		
		Parameters:
		`values` \- The stringElements to add.
		Returns:
		This builder for chaining.
		- #### clearStringElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearStringElements()
		```
		
		`repeated string stringElements = 1;`
		
		Returns:
		This builder for chaining.
		- #### addStringElementsBytes
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addStringElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string stringElements = 1;`
		
		Parameters:
		`value` \- The bytes of the stringElements to add.
		Returns:
		This builder for chaining.
		- #### getIntElementsList
		
		
		
		```
		public java.util.List<java.lang.Integer> getIntElementsList()
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Specified by:
		`[getIntElementsList](ReplicatedDataMessages.GSetOrBuilder.html#getIntElementsList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the intElements.
		- #### getIntElementsCount
		
		
		
		```
		public int getIntElementsCount()
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Specified by:
		`[getIntElementsCount](ReplicatedDataMessages.GSetOrBuilder.html#getIntElementsCount())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of intElements.
		- #### getIntElements
		
		
		
		```
		public int getIntElements​(int index)
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Specified by:
		`[getIntElements](ReplicatedDataMessages.GSetOrBuilder.html#getIntElements(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The intElements at the given index.
		- #### setIntElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setIntElements​(int index,
		                                                          int value)
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The intElements to set.
		Returns:
		This builder for chaining.
		- #### addIntElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addIntElements​(int value)
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Parameters:
		`value` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### addAllIntElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllIntElements​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Parameters:
		`values` \- The intElements to add.
		Returns:
		This builder for chaining.
		- #### clearIntElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearIntElements()
		```
		
		`repeated sint32 intElements = 2 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getLongElementsList
		
		
		
		```
		public java.util.List<java.lang.Long> getLongElementsList()
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Specified by:
		`[getLongElementsList](ReplicatedDataMessages.GSetOrBuilder.html#getLongElementsList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the longElements.
		- #### getLongElementsCount
		
		
		
		```
		public int getLongElementsCount()
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Specified by:
		`[getLongElementsCount](ReplicatedDataMessages.GSetOrBuilder.html#getLongElementsCount())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of longElements.
		- #### getLongElements
		
		
		
		```
		public long getLongElements​(int index)
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Specified by:
		`[getLongElements](ReplicatedDataMessages.GSetOrBuilder.html#getLongElements(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The longElements at the given index.
		- #### setLongElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setLongElements​(int index,
		                                                           long value)
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The longElements to set.
		Returns:
		This builder for chaining.
		- #### addLongElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addLongElements​(long value)
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Parameters:
		`value` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### addAllLongElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllLongElements​(java.lang.Iterable<? extends java.lang.Long> values)
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Parameters:
		`values` \- The longElements to add.
		Returns:
		This builder for chaining.
		- #### clearLongElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearLongElements()
		```
		
		`repeated sint64 longElements = 3 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### getOtherElementsList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> getOtherElementsList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		
		Specified by:
		`[getOtherElementsList](ReplicatedDataMessages.GSetOrBuilder.html#getOtherElementsList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElementsCount
		
		
		
		```
		public int getOtherElementsCount()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		
		Specified by:
		`[getOtherElementsCount](ReplicatedDataMessages.GSetOrBuilder.html#getOtherElementsCount())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElements
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getOtherElements​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		
		Specified by:
		`[getOtherElements](ReplicatedDataMessages.GSetOrBuilder.html#getOtherElements(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherElements​(int index,
		                                                            [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### setOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherElements​(int index,
		                                                            [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​(int index,
		                                                            [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElements​(int index,
		                                                            [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addAllOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllOtherElements​(java.lang.Iterable<? extends [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")> values)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### clearOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOtherElements()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### removeOtherElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") removeOtherElements​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### getOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getOtherElementsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### getOtherElementsOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOtherElementsOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		
		Specified by:
		`[getOtherElementsOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html#getOtherElementsOrBuilder(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getOtherElementsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getOtherElementsOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		
		Specified by:
		`[getOtherElementsOrBuilderList](ReplicatedDataMessages.GSetOrBuilder.html#getOtherElementsOrBuilderList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElementsBuilder()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### addOtherElementsBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") addOtherElementsBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### getOtherElementsBuilderList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")> getOtherElementsBuilderList()
		```
		
		`repeated .akka.cluster.ddata.OtherMessage otherElements = 4;`
		- #### getActorRefElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getActorRefElementsList()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Specified by:
		`[getActorRefElementsList](ReplicatedDataMessages.GSetOrBuilder.html#getActorRefElementsList())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the actorRefElements.
		- #### getActorRefElementsCount
		
		
		
		```
		public int getActorRefElementsCount()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Specified by:
		`[getActorRefElementsCount](ReplicatedDataMessages.GSetOrBuilder.html#getActorRefElementsCount())` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of actorRefElements.
		- #### getActorRefElements
		
		
		
		```
		public java.lang.String getActorRefElements​(int index)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Specified by:
		`[getActorRefElements](ReplicatedDataMessages.GSetOrBuilder.html#getActorRefElements(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
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
		
		`repeated string actorRefElements = 5;`
		
		Specified by:
		`[getActorRefElementsBytes](ReplicatedDataMessages.GSetOrBuilder.html#getActorRefElementsBytes(int))` in interface `[ReplicatedDataMessages.GSetOrBuilder](ReplicatedDataMessages.GSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the actorRefElements at the given index.
		- #### setActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setActorRefElements​(int index,
		                                                               java.lang.String value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The actorRefElements to set.
		Returns:
		This builder for chaining.
		- #### addActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addActorRefElements​(java.lang.String value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Parameters:
		`value` \- The actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### addAllActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllActorRefElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Parameters:
		`values` \- The actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### clearActorRefElements
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearActorRefElements()
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Returns:
		This builder for chaining.
		- #### addActorRefElementsBytes
		
		
		
		```
		public [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addActorRefElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 added in Akka 2.5.14
		 
		```
		
		`repeated string actorRefElements = 5;`
		
		Parameters:
		`value` \- The bytes of the actorRefElements to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GSet.Builder](ReplicatedDataMessages.GSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GSet.Builder.html)*