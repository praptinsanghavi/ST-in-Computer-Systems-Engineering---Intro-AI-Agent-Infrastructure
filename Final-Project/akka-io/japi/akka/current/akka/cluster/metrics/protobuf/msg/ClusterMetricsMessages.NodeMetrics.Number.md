---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.Builder.html
title: ClusterMetricsMessages.NodeMetrics.Number.Builder
---

# ClusterMetricsMessages.NodeMetrics.Number.Builder

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Class ClusterMetricsMessages.NodeMetrics.Number.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")\>
			- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number.Builder

- All Implemented Interfaces:
`[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static final class ClusterMetricsMessages.NodeMetrics.Number.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>
implements [ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")
```

Protobuf type `NodeMetrics.Number`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearSerialized](#clearSerialized())()` | `optional bytes serialized = 4;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearType](#clearType())()` | `required .NodeMetrics.NumberType type = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearValue32](#clearValue32())()` | `optional uint32 value32 = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clearValue64](#clearValue64())()` | `optional uint64 value64 = 3;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getSerialized](#getSerialized())()` | `optional bytes serialized = 4;` |
	| `[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | `[getType](#getType())()` | `required .NodeMetrics.NumberType type = 1;` |
	| `int` | `[getValue32](#getValue32())()` | `optional uint32 value32 = 2;` |
	| `long` | `[getValue64](#getValue64())()` | `optional uint64 value64 = 3;` |
	| `boolean` | `[hasSerialized](#hasSerialized())()` | `optional bytes serialized = 4;` |
	| `boolean` | `[hasType](#hasType())()` | `required .NodeMetrics.NumberType type = 1;` |
	| `boolean` | `[hasValue32](#hasValue32())()` | `optional uint32 value32 = 2;` |
	| `boolean` | `[hasValue64](#hasValue64())()` | `optional uint64 value64 = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.Number))​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setSerialized](#setSerialized(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes serialized = 4;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setType](#setType(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType))​([ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") value)` | `required .NodeMetrics.NumberType type = 1;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setValue32](#setValue32(int))​(int value)` | `optional uint32 value32 = 2;` |
	| `[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")` | `[setValue64](#setValue64(long))​(long value)` | `optional uint64 value64 = 3;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​([ClusterMetricsMessages.NodeMetrics.Number](ClusterMetricsMessages.NodeMetrics.Number.html "class in akka.cluster.metrics.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasType
		
		
		
		```
		public boolean hasType()
		```
		
		`required .NodeMetrics.NumberType type = 1;`
		
		Specified by:
		`[hasType](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#hasType())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the type field is set.
		- #### getType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") getType()
		```
		
		`required .NodeMetrics.NumberType type = 1;`
		
		Specified by:
		`[getType](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#getType())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The type.
		- #### setType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setType​([ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") value)
		```
		
		`required .NodeMetrics.NumberType type = 1;`
		
		Parameters:
		`value` \- The type to set.
		Returns:
		This builder for chaining.
		- #### clearType
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearType()
		```
		
		`required .NodeMetrics.NumberType type = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasValue32
		
		
		
		```
		public boolean hasValue32()
		```
		
		`optional uint32 value32 = 2;`
		
		Specified by:
		`[hasValue32](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#hasValue32())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the value32 field is set.
		- #### getValue32
		
		
		
		```
		public int getValue32()
		```
		
		`optional uint32 value32 = 2;`
		
		Specified by:
		`[getValue32](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#getValue32())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The value32\.
		- #### setValue32
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setValue32​(int value)
		```
		
		`optional uint32 value32 = 2;`
		
		Parameters:
		`value` \- The value32 to set.
		Returns:
		This builder for chaining.
		- #### clearValue32
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearValue32()
		```
		
		`optional uint32 value32 = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasValue64
		
		
		
		```
		public boolean hasValue64()
		```
		
		`optional uint64 value64 = 3;`
		
		Specified by:
		`[hasValue64](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#hasValue64())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the value64 field is set.
		- #### getValue64
		
		
		
		```
		public long getValue64()
		```
		
		`optional uint64 value64 = 3;`
		
		Specified by:
		`[getValue64](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#getValue64())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The value64\.
		- #### setValue64
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setValue64​(long value)
		```
		
		`optional uint64 value64 = 3;`
		
		Parameters:
		`value` \- The value64 to set.
		Returns:
		This builder for chaining.
		- #### clearValue64
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearValue64()
		```
		
		`optional uint64 value64 = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasSerialized
		
		
		
		```
		public boolean hasSerialized()
		```
		
		`optional bytes serialized = 4;`
		
		Specified by:
		`[hasSerialized](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#hasSerialized())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		Whether the serialized field is set.
		- #### getSerialized
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSerialized()
		```
		
		`optional bytes serialized = 4;`
		
		Specified by:
		`[getSerialized](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html#getSerialized())` in interface `[ClusterMetricsMessages.NodeMetrics.NumberOrBuilder](ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html "interface in akka.cluster.metrics.protobuf.msg")`
		Returns:
		The serialized.
		- #### setSerialized
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setSerialized​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes serialized = 4;`
		
		Parameters:
		`value` \- The serialized to set.
		Returns:
		This builder for chaining.
		- #### clearSerialized
		
		
		
		```
		public [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") clearSerialized()
		```
		
		`optional bytes serialized = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMetricsMessages.NodeMetrics.Number.Builder](ClusterMetricsMessages.NodeMetrics.Number.Builder.html "class in akka.cluster.metrics.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.Number.Builder.html)*