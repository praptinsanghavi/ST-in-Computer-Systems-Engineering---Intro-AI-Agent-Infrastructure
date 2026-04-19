---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html
title: ClusterMetricsMessages.NodeMetrics.EWMA.Builder
---

# ClusterMetricsMessages.NodeMetrics.EWMA.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.NodeMetrics.EWMA.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.NodeMetrics.EWMA.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

Protobuf type `NodeMetrics.EWMA`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearAlpha](#clearAlpha())()` | `required double alpha = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearValue](#clearValue())()` | `required double value = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `double` | `[getAlpha](#getAlpha())()` | `required double alpha = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `double` | `[getValue](#getValue())()` | `required double value = 1;` |
	| `boolean` | `[hasAlpha](#hasAlpha())()` | `required double alpha = 2;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required double value = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.EWMA))​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setAlpha](#setAlpha(double))​(double value)` | `required double alpha = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setValue](#setValue(double))​(double value)` | `required double value = 1;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        int index,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.NodeMetrics.EWMA](ClusterMetricsMessages.NodeMetrics.EWMA.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`required double value = 1;`
		
		Specified by:
		`[hasValue](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html#hasValue())` in interface `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public double getValue()
		```
		
		`required double value = 1;`
		
		Specified by:
		`[getValue](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html#getValue())` in interface `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") setValue​(double value)
		```
		
		`required double value = 1;`
		
		Parameters:
		`value` \- The value to set.
		Returns:
		This builder for chaining.
		- #### clearValue
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearValue()
		```
		
		`required double value = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasAlpha
		
		
		
		```
		public boolean hasAlpha()
		```
		
		`required double alpha = 2;`
		
		Specified by:
		`[hasAlpha](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html#hasAlpha())` in interface `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the alpha field is set.
		- #### getAlpha
		
		
		
		```
		public double getAlpha()
		```
		
		`required double alpha = 2;`
		
		Specified by:
		`[getAlpha](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html#getAlpha())` in interface `[ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder](ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The alpha.
		- #### setAlpha
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") setAlpha​(double value)
		```
		
		`required double alpha = 2;`
		
		Parameters:
		`value` \- The alpha to set.
		Returns:
		This builder for chaining.
		- #### clearAlpha
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearAlpha()
		```
		
		`required double alpha = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.EWMA.Builder](ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMAOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.EWMA.Builder.html)*