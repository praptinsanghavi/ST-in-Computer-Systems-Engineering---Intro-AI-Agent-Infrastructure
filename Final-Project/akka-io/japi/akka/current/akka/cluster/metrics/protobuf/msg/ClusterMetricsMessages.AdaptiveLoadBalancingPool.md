---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html
title: ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder
---

# ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

Protobuf type `AdaptiveLoadBalancingPool`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearMetricsSelector](#clearMetricsSelector())()` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearNrOfInstances](#clearNrOfInstances())()` | `required uint32 nrOfInstances = 2;` |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearRouterDispatcher](#clearRouterDispatcher())()` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearUsePoolDispatcher](#clearUsePoolDispatcher())()` | `required bool usePoolDispatcher = 4;` |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[getMetricsSelector](#getMetricsSelector())()` | omitted if default |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getMetricsSelectorBuilder](#getMetricsSelectorBuilder())()` | omitted if default |
	| `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getMetricsSelectorOrBuilder](#getMetricsSelectorOrBuilder())()` | omitted if default |
	| `int` | `[getNrOfInstances](#getNrOfInstances())()` | `required uint32 nrOfInstances = 2;` |
	| `java.lang.String` | `[getRouterDispatcher](#getRouterDispatcher())()` | omitted if default |
	| `akka.protobufv3.internal.ByteString` | `[getRouterDispatcherBytes](#getRouterDispatcherBytes())()` | omitted if default |
	| `boolean` | `[getUsePoolDispatcher](#getUsePoolDispatcher())()` | `required bool usePoolDispatcher = 4;` |
	| `boolean` | `[hasMetricsSelector](#hasMetricsSelector())()` | omitted if default |
	| `boolean` | `[hasNrOfInstances](#hasNrOfInstances())()` | `required uint32 nrOfInstances = 2;` |
	| `boolean` | `[hasRouterDispatcher](#hasRouterDispatcher())()` | omitted if default |
	| `boolean` | `[hasUsePoolDispatcher](#hasUsePoolDispatcher())()` | `required bool usePoolDispatcher = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.AdaptiveLoadBalancingPool))​([ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeMetricsSelector](#mergeMetricsSelector(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setMetricsSelector](#setMetricsSelector(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setMetricsSelector](#setMetricsSelector(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector.Builder))​([ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNrOfInstances](#setNrOfInstances(int))​(int value)` | `required uint32 nrOfInstances = 2;` |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRouterDispatcher](#setRouterDispatcher(java.lang.String))​(java.lang.String value)` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRouterDispatcherBytes](#setRouterDispatcherBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | omitted if default |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUsePoolDispatcher](#setUsePoolDispatcher(boolean))​(boolean value)` | `required bool usePoolDispatcher = 4;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                 int index,
		                                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.AdaptiveLoadBalancingPool](ClusterMetricsMessages.AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                          akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                   throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasMetricsSelector
		
		
		
		```
		public boolean hasMetricsSelector()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		
		Specified by:
		`[hasMetricsSelector](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#hasMetricsSelector())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the metricsSelector field is set.
		- #### getMetricsSelector
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") getMetricsSelector()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		
		Specified by:
		`[getMetricsSelector](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getMetricsSelector())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The metricsSelector.
		- #### setMetricsSelector
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setMetricsSelector​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		- #### setMetricsSelector
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setMetricsSelector​([ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		- #### mergeMetricsSelector
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeMetricsSelector​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		- #### clearMetricsSelector
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearMetricsSelector()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		- #### getMetricsSelectorBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") getMetricsSelectorBuilder()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		- #### getMetricsSelectorOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getMetricsSelectorOrBuilder()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional .MetricsSelector metricsSelector = 1;`
		
		Specified by:
		`[getMetricsSelectorOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getMetricsSelectorOrBuilder())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### hasNrOfInstances
		
		
		
		```
		public boolean hasNrOfInstances()
		```
		
		`required uint32 nrOfInstances = 2;`
		
		Specified by:
		`[hasNrOfInstances](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#hasNrOfInstances())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the nrOfInstances field is set.
		- #### getNrOfInstances
		
		
		
		```
		public int getNrOfInstances()
		```
		
		`required uint32 nrOfInstances = 2;`
		
		Specified by:
		`[getNrOfInstances](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getNrOfInstances())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The nrOfInstances.
		- #### setNrOfInstances
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNrOfInstances​(int value)
		```
		
		`required uint32 nrOfInstances = 2;`
		
		Parameters:
		`value` \- The nrOfInstances to set.
		Returns:
		This builder for chaining.
		- #### clearNrOfInstances
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearNrOfInstances()
		```
		
		`required uint32 nrOfInstances = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasRouterDispatcher
		
		
		
		```
		public boolean hasRouterDispatcher()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Specified by:
		`[hasRouterDispatcher](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#hasRouterDispatcher())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the routerDispatcher field is set.
		- #### getRouterDispatcher
		
		
		
		```
		public java.lang.String getRouterDispatcher()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Specified by:
		`[getRouterDispatcher](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getRouterDispatcher())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The routerDispatcher.
		- #### getRouterDispatcherBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRouterDispatcherBytes()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Specified by:
		`[getRouterDispatcherBytes](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getRouterDispatcherBytes())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The bytes for routerDispatcher.
		- #### setRouterDispatcher
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRouterDispatcher​(java.lang.String value)
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Parameters:
		`value` \- The routerDispatcher to set.
		Returns:
		This builder for chaining.
		- #### clearRouterDispatcher
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearRouterDispatcher()
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Returns:
		This builder for chaining.
		- #### setRouterDispatcherBytes
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRouterDispatcherBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 omitted if default
		 
		```
		
		`optional string routerDispatcher = 3;`
		
		Parameters:
		`value` \- The bytes for routerDispatcher to set.
		Returns:
		This builder for chaining.
		- #### hasUsePoolDispatcher
		
		
		
		```
		public boolean hasUsePoolDispatcher()
		```
		
		`required bool usePoolDispatcher = 4;`
		
		Specified by:
		`[hasUsePoolDispatcher](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#hasUsePoolDispatcher())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the usePoolDispatcher field is set.
		- #### getUsePoolDispatcher
		
		
		
		```
		public boolean getUsePoolDispatcher()
		```
		
		`required bool usePoolDispatcher = 4;`
		
		Specified by:
		`[getUsePoolDispatcher](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html#getUsePoolDispatcher())` in interface `[ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder](ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The usePoolDispatcher.
		- #### setUsePoolDispatcher
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUsePoolDispatcher​(boolean value)
		```
		
		`required bool usePoolDispatcher = 4;`
		
		Parameters:
		`value` \- The usePoolDispatcher to set.
		Returns:
		This builder for chaining.
		- #### clearUsePoolDispatcher
		
		
		
		```
		public [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearUsePoolDispatcher()
		```
		
		`required bool usePoolDispatcher = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder](ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPoolOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelectorOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.AdaptiveLoadBalancingPool.Builder.html)*