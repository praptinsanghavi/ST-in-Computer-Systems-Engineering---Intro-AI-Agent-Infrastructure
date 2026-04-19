---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.Builder.html
title: ClusterMetricsMessages.MixMetricsSelector.Builder
---

# ClusterMetricsMessages.MixMetricsSelector.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.MixMetricsSelector.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MixMetricsSelector.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.MixMetricsSelector.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

Protobuf type `MixMetricsSelector`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addAllSelectors](#addAllSelectors(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")> values)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectors](#addSelectors(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​(int index,  [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectors](#addSelectors(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector.Builder))​(int index,  [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectors](#addSelectors(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectors](#addSelectors(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector.Builder))​([ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectorsBuilder](#addSelectorsBuilder())()` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addSelectorsBuilder](#addSelectorsBuilder(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearSelectors](#clearSelectors())()` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[getSelectors](#getSelectors(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[getSelectorsBuilder](#getSelectorsBuilder(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `java.util.List<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getSelectorsBuilderList](#getSelectorsBuilderList())()` | `repeated .MetricsSelector selectors = 1;` |
	| `int` | `[getSelectorsCount](#getSelectorsCount())()` | `repeated .MetricsSelector selectors = 1;` |
	| `java.util.List<[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getSelectorsList](#getSelectorsList())()` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getSelectorsOrBuilder](#getSelectorsOrBuilder(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `java.util.List<? extends [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")>` | `[getSelectorsOrBuilderList](#getSelectorsOrBuilderList())()` | `repeated .MetricsSelector selectors = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MixMetricsSelector))​([ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[removeSelectors](#removeSelectors(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSelectors](#setSelectors(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​(int index,  [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSelectors](#setSelectors(int,akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector.Builder))​(int index,  [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getSelectorsList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")> getSelectorsList()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		
		Specified by:
		`[getSelectorsList](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html#getSelectorsList())` in interface `[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getSelectorsCount
		
		
		
		```
		public int getSelectorsCount()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		
		Specified by:
		`[getSelectorsCount](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html#getSelectorsCount())` in interface `[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") getSelectors​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		
		Specified by:
		`[getSelectors](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html#getSelectors(int))` in interface `[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### setSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSelectors​(int index,
		                                                                      [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### setSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSelectors​(int index,
		                                                                      [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectors​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectors​(int index,
		                                                                      [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectors​([ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectors​(int index,
		                                                                      [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") builderForValue)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addAllSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addAllSelectors​(java.lang.Iterable<? extends [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")> values)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### clearSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearSelectors()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### removeSelectors
		
		
		
		```
		public [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") removeSelectors​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") getSelectorsBuilder​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsOrBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getSelectorsOrBuilder​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		
		Specified by:
		`[getSelectorsOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html#getSelectorsOrBuilder(int))` in interface `[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### getSelectorsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")> getSelectorsOrBuilderList()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		
		Specified by:
		`[getSelectorsOrBuilderList](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html#getSelectorsOrBuilderList())` in interface `[ClusterMetricsMessages.MixMetricsSelectorOrBuilder](ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		- #### addSelectorsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectorsBuilder()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### addSelectorsBuilder
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addSelectorsBuilder​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsBuilderList
		
		
		
		```
		public java.util.List<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")> getSelectorsBuilderList()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.Builder.html)*