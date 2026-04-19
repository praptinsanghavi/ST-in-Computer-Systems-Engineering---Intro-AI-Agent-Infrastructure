---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.Builder.html
title: ClusterMetricsMessages.MetricsGossip.Builder
---

# ClusterMetricsMessages.MetricsGossip.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.MetricsGossip.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.MetricsGossip.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

```

 Metrics Gossip
 
```

 Protobuf type `MetricsGossip`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​(int index,  [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address.Builder))​(int index,  [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address.Builder))​([ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddressesBuilder](#addAllAddressesBuilder())()` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAddressesBuilder](#addAllAddressesBuilder(int))​(int index)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAllAddresses](#addAllAllAddresses(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")> values)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllAllMetricNames](#addAllAllMetricNames(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllMetricNames](#addAllMetricNames(java.lang.String))​(java.lang.String value)` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllMetricNamesBytes](#addAllMetricNamesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllNodeMetrics](#addAllNodeMetrics(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> values)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetrics](#addNodeMetrics(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics))​(int index,  [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetrics](#addNodeMetrics(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Builder))​(int index,  [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetrics](#addNodeMetrics(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics))​([ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetrics](#addNodeMetrics(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Builder))​([ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetricsBuilder](#addNodeMetricsBuilder())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addNodeMetricsBuilder](#addNodeMetricsBuilder(int))​(int index)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearAllAddresses](#clearAllAddresses())()` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearAllMetricNames](#clearAllMetricNames())()` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearNodeMetrics](#clearNodeMetrics())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")` | `[getAllAddresses](#getAllAddresses(int))​(int index)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getAllAddressesBuilder](#getAllAddressesBuilder(int))​(int index)` | `repeated .Address allAddresses = 1;` |
	| `java.util.List<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getAllAddressesBuilderList](#getAllAddressesBuilderList())()` | `repeated .Address allAddresses = 1;` |
	| `int` | `[getAllAddressesCount](#getAllAddressesCount())()` | `repeated .Address allAddresses = 1;` |
	| `java.util.List<[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getAllAddressesList](#getAllAddressesList())()` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getAllAddressesOrBuilder](#getAllAddressesOrBuilder(int))​(int index)` | `repeated .Address allAddresses = 1;` |
	| `java.util.List<? extends [ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")>` | `[getAllAddressesOrBuilderList](#getAllAddressesOrBuilderList())()` | `repeated .Address allAddresses = 1;` |
	| `java.lang.String` | `[getAllMetricNames](#getAllMetricNames(int))​(int index)` | `repeated string allMetricNames = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getAllMetricNamesBytes](#getAllMetricNamesBytes(int))​(int index)` | `repeated string allMetricNames = 2;` |
	| `int` | `[getAllMetricNamesCount](#getAllMetricNamesCount())()` | `repeated string allMetricNames = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getAllMetricNamesList](#getAllMetricNamesList())()` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[getNodeMetrics](#getNodeMetrics(int))​(int index)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getNodeMetricsBuilder](#getNodeMetricsBuilder(int))​(int index)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `java.util.List<[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getNodeMetricsBuilderList](#getNodeMetricsBuilderList())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `int` | `[getNodeMetricsCount](#getNodeMetricsCount())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `java.util.List<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getNodeMetricsList](#getNodeMetricsList())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getNodeMetricsOrBuilder](#getNodeMetricsOrBuilder(int))​(int index)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `java.util.List<? extends [ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")>` | `[getNodeMetricsOrBuilderList](#getNodeMetricsOrBuilderList())()` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsGossip))​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[removeAllAddresses](#removeAllAddresses(int))​(int index)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[removeNodeMetrics](#removeNodeMetrics(int))​(int index)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setAllAddresses](#setAllAddresses(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address))​(int index,  [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setAllAddresses](#setAllAddresses(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.Address.Builder))​(int index,  [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .Address allAddresses = 1;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setAllMetricNames](#setAllMetricNames(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string allMetricNames = 2;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNodeMetrics](#setNodeMetrics(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics))​(int index,  [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNodeMetrics](#setNodeMetrics(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Builder))​(int index,  [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .NodeMetrics nodeMetrics = 3;` |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     int index,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.MetricsGossip](ClusterMetricsMessages.MetricsGossip.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getAllAddressesList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")> getAllAddressesList()
		```
		
		`repeated .Address allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesList](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllAddressesList())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getAllAddressesCount
		
		
		
		```
		public int getAllAddressesCount()
		```
		
		`repeated .Address allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesCount](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllAddressesCount())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") getAllAddresses​(int index)
		```
		
		`repeated .Address allAddresses = 1;`
		
		Specified by:
		`[getAllAddresses](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllAddresses(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### setAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setAllAddresses​(int index,
		                                                                    [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### setAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setAllAddresses​(int index,
		                                                                    [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddresses​([ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddresses​(int index,
		                                                                    [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddresses​([ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddresses​(int index,
		                                                                    [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAllAddresses​(java.lang.Iterable<? extends [ClusterMetricsMessages.Address](ClusterMetricsMessages.Address.html "class in akka.cluster.metrics.protobuf.msg")> values)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### clearAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearAllAddresses()
		```
		
		`repeated .Address allAddresses = 1;`
		- #### removeAllAddresses
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") removeAllAddresses​(int index)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### getAllAddressesBuilder
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") getAllAddressesBuilder​(int index)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### getAllAddressesOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getAllAddressesOrBuilder​(int index)
		```
		
		`repeated .Address allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllAddressesOrBuilder(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getAllAddressesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMetricsMessages.AddressOrBuilder](ClusterMetricsMessages.AddressOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")> getAllAddressesOrBuilderList()
		```
		
		`repeated .Address allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesOrBuilderList](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllAddressesOrBuilderList())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### addAllAddressesBuilder
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddressesBuilder()
		```
		
		`repeated .Address allAddresses = 1;`
		- #### addAllAddressesBuilder
		
		
		
		```
		public [ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAddressesBuilder​(int index)
		```
		
		`repeated .Address allAddresses = 1;`
		- #### getAllAddressesBuilderList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.Address.Builder](ClusterMetricsMessages.Address.Builder.html "class in akka.cluster.metrics.protobuf.msg")> getAllAddressesBuilderList()
		```
		
		`repeated .Address allAddresses = 1;`
		- #### getAllMetricNamesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getAllMetricNamesList()
		```
		
		`repeated string allMetricNames = 2;`
		
		Specified by:
		`[getAllMetricNamesList](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllMetricNamesList())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		A list containing the allMetricNames.
		- #### getAllMetricNamesCount
		
		
		
		```
		public int getAllMetricNamesCount()
		```
		
		`repeated string allMetricNames = 2;`
		
		Specified by:
		`[getAllMetricNamesCount](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllMetricNamesCount())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The count of allMetricNames.
		- #### getAllMetricNames
		
		
		
		```
		public java.lang.String getAllMetricNames​(int index)
		```
		
		`repeated string allMetricNames = 2;`
		
		Specified by:
		`[getAllMetricNames](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllMetricNames(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The allMetricNames at the given index.
		- #### getAllMetricNamesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAllMetricNamesBytes​(int index)
		```
		
		`repeated string allMetricNames = 2;`
		
		Specified by:
		`[getAllMetricNamesBytes](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getAllMetricNamesBytes(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the allMetricNames at the given index.
		- #### setAllMetricNames
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setAllMetricNames​(int index,
		                                                                      java.lang.String value)
		```
		
		`repeated string allMetricNames = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The allMetricNames to set.
		Returns:
		This builder for chaining.
		- #### addAllMetricNames
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllMetricNames​(java.lang.String value)
		```
		
		`repeated string allMetricNames = 2;`
		
		Parameters:
		`value` \- The allMetricNames to add.
		Returns:
		This builder for chaining.
		- #### addAllAllMetricNames
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllAllMetricNames​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string allMetricNames = 2;`
		
		Parameters:
		`values` \- The allMetricNames to add.
		Returns:
		This builder for chaining.
		- #### clearAllMetricNames
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearAllMetricNames()
		```
		
		`repeated string allMetricNames = 2;`
		
		Returns:
		This builder for chaining.
		- #### addAllMetricNamesBytes
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllMetricNamesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string allMetricNames = 2;`
		
		Parameters:
		`value` \- The bytes of the allMetricNames to add.
		Returns:
		This builder for chaining.
		- #### getNodeMetricsList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> getNodeMetricsList()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		
		Specified by:
		`[getNodeMetricsList](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getNodeMetricsList())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getNodeMetricsCount
		
		
		
		```
		public int getNodeMetricsCount()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		
		Specified by:
		`[getNodeMetricsCount](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getNodeMetricsCount())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") getNodeMetrics​(int index)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		
		Specified by:
		`[getNodeMetrics](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getNodeMetrics(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### setNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNodeMetrics​(int index,
		                                                                   [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### setNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNodeMetrics​(int index,
		                                                                   [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetrics​([ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetrics​(int index,
		                                                                   [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetrics​([ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetrics​(int index,
		                                                                   [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addAllNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllNodeMetrics​(java.lang.Iterable<? extends [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> values)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### clearNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearNodeMetrics()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### removeNodeMetrics
		
		
		
		```
		public [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") removeNodeMetrics​(int index)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### getNodeMetricsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") getNodeMetricsBuilder​(int index)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### getNodeMetricsOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getNodeMetricsOrBuilder​(int index)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		
		Specified by:
		`[getNodeMetricsOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getNodeMetricsOrBuilder(int))` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getNodeMetricsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")> getNodeMetricsOrBuilderList()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		
		Specified by:
		`[getNodeMetricsOrBuilderList](ClusterMetricsMessages.MetricsGossipOrBuilder.html#getNodeMetricsOrBuilderList())` in interface `[ClusterMetricsMessages.MetricsGossipOrBuilder](ClusterMetricsMessages.MetricsGossipOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### addNodeMetricsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetricsBuilder()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### addNodeMetricsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") addNodeMetricsBuilder​(int index)
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### getNodeMetricsBuilderList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")> getNodeMetricsBuilderList()
		```
		
		`repeated .NodeMetrics nodeMetrics = 3;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsGossip.Builder](ClusterMetricsMessages.MetricsGossip.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossipOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetricsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsGossip.Builder.html)*