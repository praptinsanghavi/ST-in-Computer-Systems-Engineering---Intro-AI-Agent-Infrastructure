---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.Builder.html
title: ClusterMessages.ClusterRouterPool.Builder
---

# ClusterMessages.ClusterRouterPool.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.ClusterRouterPool.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPool.Builder

- All Implemented Interfaces:
`[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.ClusterRouterPool.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `ClusterRouterPool`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearPool](#clearPool())()` | `required .Pool pool = 1;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSettings](#clearSettings())()` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg")` | `[getPool](#getPool())()` | `required .Pool pool = 1;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[getPoolBuilder](#getPoolBuilder())()` | `required .Pool pool = 1;` |
	| `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getPoolOrBuilder](#getPoolOrBuilder())()` | `required .Pool pool = 1;` |
	| `[ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg")` | `[getSettings](#getSettings())()` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[getSettingsBuilder](#getSettingsBuilder())()` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getSettingsOrBuilder](#getSettingsOrBuilder())()` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `boolean` | `[hasPool](#hasPool())()` | `required .Pool pool = 1;` |
	| `boolean` | `[hasSettings](#hasSettings())()` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPool))​([ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergePool](#mergePool(akka.cluster.protobuf.msg.ClusterMessages.Pool))​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") value)` | `required .Pool pool = 1;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeSettings](#mergeSettings(akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings))​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") value)` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setPool](#setPool(akka.cluster.protobuf.msg.ClusterMessages.Pool))​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") value)` | `required .Pool pool = 1;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setPool](#setPool(akka.cluster.protobuf.msg.ClusterMessages.Pool.Builder))​([ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .Pool pool = 1;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSettings](#setSettings(akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings))​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") value)` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSettings](#setSettings(akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings.Builder))​([ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .ClusterRouterPoolSettings settings = 2;` |
	| `[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.ClusterRouterPool](ClusterMessages.ClusterRouterPool.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasPool
		
		
		
		```
		public boolean hasPool()
		```
		
		`required .Pool pool = 1;`
		
		Specified by:
		`[hasPool](ClusterMessages.ClusterRouterPoolOrBuilder.html#hasPool())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the pool field is set.
		- #### getPool
		
		
		
		```
		public [ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") getPool()
		```
		
		`required .Pool pool = 1;`
		
		Specified by:
		`[getPool](ClusterMessages.ClusterRouterPoolOrBuilder.html#getPool())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The pool.
		- #### setPool
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setPool​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Pool pool = 1;`
		- #### setPool
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setPool​([ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .Pool pool = 1;`
		- #### mergePool
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergePool​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Pool pool = 1;`
		- #### clearPool
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clearPool()
		```
		
		`required .Pool pool = 1;`
		- #### getPoolBuilder
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") getPoolBuilder()
		```
		
		`required .Pool pool = 1;`
		- #### getPoolOrBuilder
		
		
		
		```
		public [ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg") getPoolOrBuilder()
		```
		
		`required .Pool pool = 1;`
		
		Specified by:
		`[getPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html#getPoolOrBuilder())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasSettings
		
		
		
		```
		public boolean hasSettings()
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		
		Specified by:
		`[hasSettings](ClusterMessages.ClusterRouterPoolOrBuilder.html#hasSettings())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the settings field is set.
		- #### getSettings
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") getSettings()
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		
		Specified by:
		`[getSettings](ClusterMessages.ClusterRouterPoolOrBuilder.html#getSettings())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The settings.
		- #### setSettings
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setSettings​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		- #### setSettings
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setSettings​([ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		- #### mergeSettings
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergeSettings​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		- #### clearSettings
		
		
		
		```
		public [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") clearSettings()
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		- #### getSettingsBuilder
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") getSettingsBuilder()
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		- #### getSettingsOrBuilder
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg") getSettingsOrBuilder()
		```
		
		`required .ClusterRouterPoolSettings settings = 2;`
		
		Specified by:
		`[getSettingsOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html#getSettingsOrBuilder())` in interface `[ClusterMessages.ClusterRouterPoolOrBuilder](ClusterMessages.ClusterRouterPoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPool.Builder](ClusterMessages.ClusterRouterPool.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Pool.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.PoolOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPool.Builder.html)*