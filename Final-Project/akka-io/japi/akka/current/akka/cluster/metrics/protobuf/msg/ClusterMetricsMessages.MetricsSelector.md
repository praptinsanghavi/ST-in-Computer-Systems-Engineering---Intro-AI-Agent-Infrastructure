---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html
title: ClusterMetricsMessages.MetricsSelector.Builder
---

# ClusterMetricsMessages.MetricsSelector.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.MetricsSelector.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.MetricsSelector.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

```

 couldn't figure out how to import Payload
 
```

 Protobuf type `MetricsSelector`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearData](#clearData())()` | `required bytes data = 3;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearManifest](#clearManifest())()` | `required string manifest = 2;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearSerializerId](#clearSerializerId())()` | `required uint32 serializerId = 1;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getData](#getData())()` | `required bytes data = 3;` |
	| `[ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getManifest](#getManifest())()` | `required string manifest = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getManifestBytes](#getManifestBytes())()` | `required string manifest = 2;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required uint32 serializerId = 1;` |
	| `boolean` | `[hasData](#hasData())()` | `required bytes data = 3;` |
	| `boolean` | `[hasManifest](#hasManifest())()` | `required string manifest = 2;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required uint32 serializerId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setData](#setData(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes data = 3;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setManifest](#setManifest(java.lang.String))​(java.lang.String value)` | `required string manifest = 2;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setManifestBytes](#setManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string manifest = 2;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required uint32 serializerId = 1;` |
	| `[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.MetricsSelector](ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Specified by:
		`[hasSerializerId](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#hasSerializerId())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Specified by:
		`[getSerializerId](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#getSerializerId())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSerializerId​(int value)
		```
		
		`required uint32 serializerId = 1;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasManifest
		
		
		
		```
		public boolean hasManifest()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[hasManifest](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#hasManifest())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the manifest field is set.
		- #### getManifest
		
		
		
		```
		public java.lang.String getManifest()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[getManifest](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#getManifest())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The manifest.
		- #### getManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getManifestBytes()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[getManifestBytes](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#getManifestBytes())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The bytes for manifest.
		- #### setManifest
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setManifest​(java.lang.String value)
		```
		
		`required string manifest = 2;`
		
		Parameters:
		`value` \- The manifest to set.
		Returns:
		This builder for chaining.
		- #### clearManifest
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearManifest()
		```
		
		`required string manifest = 2;`
		
		Returns:
		This builder for chaining.
		- #### setManifestBytes
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string manifest = 2;`
		
		Parameters:
		`value` \- The bytes for manifest to set.
		Returns:
		This builder for chaining.
		- #### hasData
		
		
		
		```
		public boolean hasData()
		```
		
		`required bytes data = 3;`
		
		Specified by:
		`[hasData](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#hasData())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the data field is set.
		- #### getData
		
		
		
		```
		public akka.protobufv3.internal.ByteString getData()
		```
		
		`required bytes data = 3;`
		
		Specified by:
		`[getData](ClusterMetricsMessages.MetricsSelectorOrBuilder.html#getData())` in interface `[ClusterMetricsMessages.MetricsSelectorOrBuilder](ClusterMetricsMessages.MetricsSelectorOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The data.
		- #### setData
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setData​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes data = 3;`
		
		Parameters:
		`value` \- The data to set.
		Returns:
		This builder for chaining.
		- #### clearData
		
		
		
		```
		public [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearData()
		```
		
		`required bytes data = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.MetricsSelector.Builder](ClusterMetricsMessages.MetricsSelector.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelectorOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.Builder.html)*