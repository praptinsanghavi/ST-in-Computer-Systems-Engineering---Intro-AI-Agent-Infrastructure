---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html
title: ClusterMetricsMessages.NodeMetrics
---

# ClusterMetricsMessages.NodeMetrics

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.NodeMetrics

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics

- All Implemented Interfaces:
`[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ClusterMetricsMessages](ClusterMetricsMessages.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.NodeMetrics
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

```

 Node Metrics
 
```

 Protobuf type `NodeMetrics`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | Node Metrics |
	| `static class` | `[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")` | Protobuf type `NodeMetrics.EWMA` |
	| `static interface` | `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` |  |
	| `static class` | `[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")` | Protobuf type `NodeMetrics.Metric` |
	| `static interface` | `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` |  |
	| `static class` | `[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")` | Protobuf type `NodeMetrics.Number` |
	| `static interface` | `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` |  |
	| `static class` | `[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | Protobuf enum `NodeMetrics.NumberType` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ADDRESSINDEX_FIELD_NUMBER](#ADDRESSINDEX_FIELD_NUMBER)` |  |
	| `static int` | `[METRICS_FIELD_NUMBER](#METRICS_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[TIMESTAMP_FIELD_NUMBER](#TIMESTAMP_FIELD_NUMBER)` |  |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `int` | `[getAddressIndex](#getAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")` | `[getMetrics](#getMetrics(int))​(int index)` | `repeated .NodeMetrics.Metric metrics = 3;` |
	| `int` | `[getMetricsCount](#getMetricsCount())()` | `repeated .NodeMetrics.Metric metrics = 3;` |
	| `java.util.List<[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getMetricsList](#getMetricsList())()` | `repeated .NodeMetrics.Metric metrics = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getMetricsOrBuilder](#getMetricsOrBuilder(int))​(int index)` | `repeated .NodeMetrics.Metric metrics = 3;` |
	| `java.util.List<? extends [ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")>` | `[getMetricsOrBuilderList](#getMetricsOrBuilderList())()` | `repeated .NodeMetrics.Metric metrics = 3;` |
	| `akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasAddressIndex](#hasAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics))​([ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") prototype)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### ADDRESSINDEX\_FIELD\_NUMBER
		
		
		
		```
		public static final int ADDRESSINDEX_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.ADDRESSINDEX_FIELD_NUMBER)
		- #### TIMESTAMP\_FIELD\_NUMBER
		
		
		
		```
		public static final int TIMESTAMP_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.TIMESTAMP_FIELD_NUMBER)
		- #### METRICS\_FIELD\_NUMBER
		
		
		
		```
		public static final int METRICS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.METRICS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### hasAddressIndex
		
		
		
		```
		public boolean hasAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[hasAddressIndex](ClusterMetricsMessages.NodeMetricsOrBuilder.html#hasAddressIndex())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the addressIndex field is set.
		- #### getAddressIndex
		
		
		
		```
		public int getAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[getAddressIndex](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getAddressIndex())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The addressIndex.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[hasTimestamp](ClusterMetricsMessages.NodeMetricsOrBuilder.html#hasTimestamp())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[getTimestamp](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getTimestamp())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The timestamp.
		- #### getMetricsList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg")> getMetricsList()
		```
		
		`repeated .NodeMetrics.Metric metrics = 3;`
		
		Specified by:
		`[getMetricsList](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getMetricsList())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getMetricsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")> getMetricsOrBuilderList()
		```
		
		`repeated .NodeMetrics.Metric metrics = 3;`
		
		Specified by:
		`[getMetricsOrBuilderList](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getMetricsOrBuilderList())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getMetricsCount
		
		
		
		```
		public int getMetricsCount()
		```
		
		`repeated .NodeMetrics.Metric metrics = 3;`
		
		Specified by:
		`[getMetricsCount](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getMetricsCount())` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getMetrics
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Metric](ClusterMetricsMessages.NodeMetrics.Metric.html "class in akka.cluster.metrics.protobuf.msg") getMetrics​(int index)
		```
		
		`repeated .NodeMetrics.Metric metrics = 3;`
		
		Specified by:
		`[getMetrics](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getMetrics(int))` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getMetricsOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.MetricOrBuilder](ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getMetricsOrBuilder​(int index)
		```
		
		`repeated .NodeMetrics.Metric metrics = 3;`
		
		Specified by:
		`[getMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html#getMetricsOrBuilder(int))` in interface `[ClusterMetricsMessages.NodeMetricsOrBuilder](ClusterMetricsMessages.NodeMetricsOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(byte[] data)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(byte[] data,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") newBuilder​([ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ClusterMetricsMessages.NodeMetrics.Builder](ClusterMetricsMessages.NodeMetrics.Builder.html "class in akka.cluster.metrics.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Metric.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.MetricOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetricsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html)*