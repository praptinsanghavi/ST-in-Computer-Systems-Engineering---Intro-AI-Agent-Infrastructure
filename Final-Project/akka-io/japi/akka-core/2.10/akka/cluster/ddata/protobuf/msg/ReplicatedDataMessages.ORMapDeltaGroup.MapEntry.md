---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html
title: ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder
---

# ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.ORMapDeltaGroup.MapEntry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearIntKey](#clearIntKey())()` | `optional sint32 intKey = 3;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearLongKey](#clearLongKey())()` | `optional sint64 longKey = 4;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOtherKey](#clearOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearStringKey](#clearStringKey())()` | `optional string stringKey = 1;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearValue](#clearValue())()` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getIntKey](#getIntKey())()` | `optional sint32 intKey = 3;` |
	| `long` | `[getLongKey](#getLongKey())()` | `optional sint64 longKey = 4;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherKey](#getOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherKeyBuilder](#getOtherKeyBuilder())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOtherKeyOrBuilder](#getOtherKeyOrBuilder())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `java.lang.String` | `[getStringKey](#getStringKey())()` | `optional string stringKey = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringKeyBytes](#getStringKeyBytes())()` | `optional string stringKey = 1;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getValue](#getValue())()` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getValueBuilder](#getValueBuilder())()` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getValueOrBuilder](#getValueOrBuilder())()` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `boolean` | `[hasIntKey](#hasIntKey())()` | `optional sint32 intKey = 3;` |
	| `boolean` | `[hasLongKey](#hasLongKey())()` | `optional sint64 longKey = 4;` |
	| `boolean` | `[hasOtherKey](#hasOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `boolean` | `[hasStringKey](#hasStringKey())()` | `optional string stringKey = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMapDeltaGroup.MapEntry))​([ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeOtherKey](#mergeOtherKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeValue](#mergeValue(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setIntKey](#setIntKey(int))​(int value)` | `optional sint32 intKey = 3;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setLongKey](#setLongKey(long))​(long value)` | `optional sint64 longKey = 4;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherKey](#setOtherKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setOtherKey](#setOtherKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setStringKey](#setStringKey(java.lang.String))​(java.lang.String value)` | `optional string stringKey = 1;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setStringKeyBytes](#setStringKeyBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string stringKey = 1;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setValue](#setValue(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setValue](#setValue(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `optional .akka.cluster.ddata.OtherMessage value = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                int index,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.ORMapDeltaGroup.MapEntry](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasStringKey
		
		
		
		```
		public boolean hasStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[hasStringKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#hasStringKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the stringKey field is set.
		- #### getStringKey
		
		
		
		```
		public java.lang.String getStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[getStringKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getStringKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The stringKey.
		- #### getStringKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStringKeyBytes()
		```
		
		`optional string stringKey = 1;`
		
		Specified by:
		`[getStringKeyBytes](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getStringKeyBytes())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for stringKey.
		- #### setStringKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setStringKey​(java.lang.String value)
		```
		
		`optional string stringKey = 1;`
		
		Parameters:
		`value` \- The stringKey to set.
		Returns:
		This builder for chaining.
		- #### clearStringKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Returns:
		This builder for chaining.
		- #### setStringKeyBytes
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setStringKeyBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string stringKey = 1;`
		
		Parameters:
		`value` \- The bytes for stringKey to set.
		Returns:
		This builder for chaining.
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[hasValue](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#hasValue())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getValue()
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[getValue](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getValue())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setValue​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		- #### setValue
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setValue​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		- #### mergeValue
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeValue​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		- #### clearValue
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearValue()
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		- #### getValueBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getValueBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		- #### getValueOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getValueOrBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage value = 2;`
		
		Specified by:
		`[getValueOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getValueOrBuilder())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasIntKey
		
		
		
		```
		public boolean hasIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Specified by:
		`[hasIntKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#hasIntKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the intKey field is set.
		- #### getIntKey
		
		
		
		```
		public int getIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Specified by:
		`[getIntKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getIntKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The intKey.
		- #### setIntKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setIntKey​(int value)
		```
		
		`optional sint32 intKey = 3;`
		
		Parameters:
		`value` \- The intKey to set.
		Returns:
		This builder for chaining.
		- #### clearIntKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasLongKey
		
		
		
		```
		public boolean hasLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Specified by:
		`[hasLongKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#hasLongKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the longKey field is set.
		- #### getLongKey
		
		
		
		```
		public long getLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Specified by:
		`[getLongKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getLongKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The longKey.
		- #### setLongKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setLongKey​(long value)
		```
		
		`optional sint64 longKey = 4;`
		
		Parameters:
		`value` \- The longKey to set.
		Returns:
		This builder for chaining.
		- #### clearLongKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasOtherKey
		
		
		
		```
		public boolean hasOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[hasOtherKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#hasOtherKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the otherKey field is set.
		- #### getOtherKey
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[getOtherKey](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getOtherKey())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The otherKey.
		- #### setOtherKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		- #### setOtherKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setOtherKey​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		- #### mergeOtherKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeOtherKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		- #### clearOtherKey
		
		
		
		```
		public [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		- #### getOtherKeyBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getOtherKeyBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		- #### getOtherKeyOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOtherKeyOrBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Specified by:
		`[getOtherKeyOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html#getOtherKeyOrBuilder())` in interface `[ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder](ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMapDeltaGroup.MapEntry.Builder.html)*