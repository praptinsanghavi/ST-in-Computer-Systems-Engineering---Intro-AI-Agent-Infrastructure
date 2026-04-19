---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html
title: ClusterMetricsMessages.MetricsGossipEnvelope.Builder
---

# ClusterMetricsMessages.MetricsGossipEnvelope.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.MetricsGossipEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossipEnvelope.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.MetricsGossipEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

```

 Metrics Gossip Envelope
 
```

 Protobuf type `MetricsGossipEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearFrom](#clearFrom())()` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearGossip](#clearGossip())()` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearReply](#clearReply())()` | `required bool reply = 3;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")` | `[getFrom](#getFrom())()` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getFromBuilder](#getFromBuilder())()` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg")` | `[getGossip](#getGossip())()` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getGossipBuilder](#getGossipBuilder())()` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getGossipOrBuilder](#getGossipOrBuilder())()` | `required .MetricsGossip gossip = 2;` |
	| `boolean` | `[getReply](#getReply())()` | `required bool reply = 3;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .Address from = 1;` |
	| `boolean` | `[hasGossip](#hasGossip())()` | `required .MetricsGossip gossip = 2;` |
	| `boolean` | `[hasReply](#hasReply())()` | `required bool reply = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossipEnvelope))​([ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeGossip](#mergeGossip(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip))​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address.Builder))​([ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `required .Address from = 1;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setGossip](#setGossip(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip))​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setGossip](#setGossip(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip.Builder))​([ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `required .MetricsGossip gossip = 2;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setReply](#setReply(boolean))​(boolean value)` | `required bool reply = 3;` |
	| `[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             int index,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.MetricsGossipEnvelope](ClusterMetricsMessages.MetricsGossipEnvelope.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[hasFrom](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#hasFrom())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") getFrom()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[getFrom](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#getFrom())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setFrom​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .Address from = 1;`
		- #### setFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setFrom​([ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`required .Address from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .Address from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearFrom()
		```
		
		`required .Address from = 1;`
		- #### getFromBuilder
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") getFromBuilder()
		```
		
		`required .Address from = 1;`
		- #### getFromOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getFromOrBuilder()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[getFromOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#getFromOrBuilder())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### hasGossip
		
		
		
		```
		public boolean hasGossip()
		```
		
		`required .MetricsGossip gossip = 2;`
		
		Specified by:
		`[hasGossip](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#hasGossip())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the gossip field is set.
		- #### getGossip
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") getGossip()
		```
		
		`required .MetricsGossip gossip = 2;`
		
		Specified by:
		`[getGossip](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#getGossip())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The gossip.
		- #### setGossip
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setGossip​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .MetricsGossip gossip = 2;`
		- #### setGossip
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setGossip​([ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`required .MetricsGossip gossip = 2;`
		- #### mergeGossip
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeGossip​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .MetricsGossip gossip = 2;`
		- #### clearGossip
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearGossip()
		```
		
		`required .MetricsGossip gossip = 2;`
		- #### getGossipBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") getGossipBuilder()
		```
		
		`required .MetricsGossip gossip = 2;`
		- #### getGossipOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getGossipOrBuilder()
		```
		
		`required .MetricsGossip gossip = 2;`
		
		Specified by:
		`[getGossipOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#getGossipOrBuilder())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### hasReply
		
		
		
		```
		public boolean hasReply()
		```
		
		`required bool reply = 3;`
		
		Specified by:
		`[hasReply](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#hasReply())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the reply field is set.
		- #### getReply
		
		
		
		```
		public boolean getReply()
		```
		
		`required bool reply = 3;`
		
		Specified by:
		`[getReply](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html#getReply())` in interface `[ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder](ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The reply.
		- #### setReply
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setReply​(boolean value)
		```
		
		`required bool reply = 3;`
		
		Parameters:
		`value` \- The reply to set.
		Returns:
		This builder for chaining.
		- #### clearReply
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearReply()
		```
		
		`required bool reply = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossipEnvelope.Builder](ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipEnvelope.Builder.html)*