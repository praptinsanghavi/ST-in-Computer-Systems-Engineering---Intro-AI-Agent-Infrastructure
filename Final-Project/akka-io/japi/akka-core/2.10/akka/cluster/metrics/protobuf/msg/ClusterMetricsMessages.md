---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html
title: ClusterMetricsMessages.MixMetricsSelectorOrBuilder
---

# ClusterMetricsMessages.MixMetricsSelectorOrBuilder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Interface ClusterMetricsMessages.MixMetricsSelectorOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ClusterMetricsMessages.MixMetricsSelector](ClusterMetricsMessages.MixMetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")`, `[ClusterMetricsMessages.MixMetricsSelector.Builder](ClusterMetricsMessages.MixMetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")`

Enclosing class:
[ClusterMetricsMessages](ClusterMetricsMessages.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static interface ClusterMetricsMessages.MixMetricsSelectorOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[getSelectors](#getSelectors(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `int` | `[getSelectorsCount](#getSelectorsCount())()` | `repeated .MetricsSelector selectors = 1;` |
	| `java.util.List<[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")>` | `[getSelectorsList](#getSelectorsList())()` | `repeated .MetricsSelector selectors = 1;` |
	| `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")` | `[getSelectorsOrBuilder](#getSelectorsOrBuilder(int))​(int index)` | `repeated .MetricsSelector selectors = 1;` |
	| `java.util.List<? extends [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")>` | `[getSelectorsOrBuilderList](#getSelectorsOrBuilderList())()` | `repeated .MetricsSelector selectors = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### getSelectorsList
		
		
		
		```
		java.util.List<[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")> getSelectorsList()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectors
		
		
		
		```
		[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") getSelectors​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsCount
		
		
		
		```
		int getSelectorsCount()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsOrBuilderList
		
		
		
		```
		java.util.List<? extends [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")> getSelectorsOrBuilderList()
		```
		
		`repeated .MetricsSelector selectors = 1;`
		- #### getSelectorsOrBuilder
		
		
		
		```
		[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg") getSelectorsOrBuilder​(int index)
		```
		
		`repeated .MetricsSelector selectors = 1;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MixMetricsSelectorOrBuilder.html)*