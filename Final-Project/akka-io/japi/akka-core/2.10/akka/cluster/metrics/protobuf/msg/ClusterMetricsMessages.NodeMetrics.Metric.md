---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.Builder.html
title: ClusterMetricsMessages.NodeMetrics.Metric.Builder
---

# ClusterMetricsMessages.NodeMetrics.Metric.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.NodeMetrics.Metric.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Metric.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.NodeMetrics.Metric.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

Protobuf type `NodeMetrics.Metric`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearEwma](#clearEwma())()` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearNameIndex](#clearNameIndex())()` | `required int32 nameIndex = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearNumber](#clearNumber())()` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")` | `[getEwma](#getEwma())()` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getEwmaBuilder](#getEwmaBuilder())()` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getEwmaOrBuilder](#getEwmaOrBuilder())()` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `int` | `[getNameIndex](#getNameIndex())()` | `required int32 nameIndex = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")` | `[getNumber](#getNumber())()` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getNumberBuilder](#getNumberBuilder())()` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getNumberOrBuilder](#getNumberOrBuilder())()` | `required .NodeMetrics.Number number = 2;` |
	| `boolean` | `[hasEwma](#hasEwma())()` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `boolean` | `[hasNameIndex](#hasNameIndex())()` | `required int32 nameIndex = 1;` |
	| `boolean` | `[hasNumber](#hasNumber())()` | `required .NodeMetrics.Number number = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeEwma](#mergeEwma(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA))​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") value)` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Metric))​([ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeNumber](#mergeNumber(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number))​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setEwma](#setEwma(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA))​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") value)` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setEwma](#setEwma(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA.Builder))​([ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `optional .NodeMetrics.EWMA ewma = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNameIndex](#setNameIndex(int))​(int value)` | `required int32 nameIndex = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNumber](#setNumber(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number))​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") value)` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setNumber](#setNumber(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number.Builder))​([ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `required .NodeMetrics.Number number = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasNameIndex
		
		
		
		```
		public boolean hasNameIndex()
		```
		
		`required int32 nameIndex = 1;`
		
		Specified by:
		`[hasNameIndex](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#hasNameIndex())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the nameIndex field is set.
		- #### getNameIndex
		
		
		
		```
		public int getNameIndex()
		```
		
		`required int32 nameIndex = 1;`
		
		Specified by:
		`[getNameIndex](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#getNameIndex())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The nameIndex.
		- #### setNameIndex
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNameIndex​(int value)
		```
		
		`required int32 nameIndex = 1;`
		
		Parameters:
		`value` \- The nameIndex to set.
		Returns:
		This builder for chaining.
		- #### clearNameIndex
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearNameIndex()
		```
		
		`required int32 nameIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasNumber
		
		
		
		```
		public boolean hasNumber()
		```
		
		`required .NodeMetrics.Number number = 2;`
		
		Specified by:
		`[hasNumber](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#hasNumber())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the number field is set.
		- #### getNumber
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") getNumber()
		```
		
		`required .NodeMetrics.Number number = 2;`
		
		Specified by:
		`[getNumber](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#getNumber())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The number.
		- #### setNumber
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNumber​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .NodeMetrics.Number number = 2;`
		- #### setNumber
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setNumber​([ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`required .NodeMetrics.Number number = 2;`
		- #### mergeNumber
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeNumber​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .NodeMetrics.Number number = 2;`
		- #### clearNumber
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearNumber()
		```
		
		`required .NodeMetrics.Number number = 2;`
		- #### getNumberBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") getNumberBuilder()
		```
		
		`required .NodeMetrics.Number number = 2;`
		- #### getNumberOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getNumberOrBuilder()
		```
		
		`required .NodeMetrics.Number number = 2;`
		
		Specified by:
		`[getNumberOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#getNumberOrBuilder())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### hasEwma
		
		
		
		```
		public boolean hasEwma()
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		
		Specified by:
		`[hasEwma](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#hasEwma())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the ewma field is set.
		- #### getEwma
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") getEwma()
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		
		Specified by:
		`[getEwma](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#getEwma())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The ewma.
		- #### setEwma
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setEwma​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		- #### setEwma
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setEwma​([ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		- #### mergeEwma
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeEwma​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		- #### clearEwma
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearEwma()
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		- #### getEwmaBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") getEwmaBuilder()
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		- #### getEwmaOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getEwmaOrBuilder()
		```
		
		`optional .NodeMetrics.EWMA ewma = 3;`
		
		Specified by:
		`[getEwmaOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html#getEwmaOrBuilder())` in interface `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Metric.Builder](ClusterMetricsMessages.NodeMetrics.Metric.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.Builder.html)*