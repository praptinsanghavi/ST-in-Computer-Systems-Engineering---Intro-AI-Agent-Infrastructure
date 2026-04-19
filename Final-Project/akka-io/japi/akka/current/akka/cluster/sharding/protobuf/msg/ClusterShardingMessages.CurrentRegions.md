---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.Builder.html
title: ClusterShardingMessages.CurrentRegions.Builder
---

# ClusterShardingMessages.CurrentRegions.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.CurrentRegions.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentRegions.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.CurrentRegions.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `CurrentRegions`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addAllRegions](#addAllRegions(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")> values)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegions](#addRegions(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​(int index,  [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegions](#addRegions(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address.Builder))​(int index,  [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegions](#addRegions(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegions](#addRegions(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address.Builder))​([ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegionsBuilder](#addRegionsBuilder())()` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRegionsBuilder](#addRegionsBuilder(int))​(int index)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearRegions](#clearRegions())()` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")` | `[getRegions](#getRegions(int))​(int index)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getRegionsBuilder](#getRegionsBuilder(int))​(int index)` | `repeated .Address regions = 1;` |
	| `java.util.List<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getRegionsBuilderList](#getRegionsBuilderList())()` | `repeated .Address regions = 1;` |
	| `int` | `[getRegionsCount](#getRegionsCount())()` | `repeated .Address regions = 1;` |
	| `java.util.List<[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")>` | `[getRegionsList](#getRegionsList())()` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getRegionsOrBuilder](#getRegionsOrBuilder(int))​(int index)` | `repeated .Address regions = 1;` |
	| `java.util.List<? extends [ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")>` | `[getRegionsOrBuilderList](#getRegionsOrBuilderList())()` | `repeated .Address regions = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.CurrentRegions))​([ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[removeRegions](#removeRegions(int))​(int index)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRegions](#setRegions(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​(int index,  [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRegions](#setRegions(int,akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address.Builder))​(int index,  [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `repeated .Address regions = 1;` |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.CurrentRegions](ClusterShardingMessages.CurrentRegions.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getRegionsList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")> getRegionsList()
		```
		
		`repeated .Address regions = 1;`
		
		Specified by:
		`[getRegionsList](ClusterShardingMessages.CurrentRegionsOrBuilder.html#getRegionsList())` in interface `[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getRegionsCount
		
		
		
		```
		public int getRegionsCount()
		```
		
		`repeated .Address regions = 1;`
		
		Specified by:
		`[getRegionsCount](ClusterShardingMessages.CurrentRegionsOrBuilder.html#getRegionsCount())` in interface `[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getRegions
		
		
		
		```
		public [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") getRegions​(int index)
		```
		
		`repeated .Address regions = 1;`
		
		Specified by:
		`[getRegions](ClusterShardingMessages.CurrentRegionsOrBuilder.html#getRegions(int))` in interface `[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRegions​(int index,
		                                                                 [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .Address regions = 1;`
		- #### setRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRegions​(int index,
		                                                                 [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .Address regions = 1;`
		- #### addRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegions​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .Address regions = 1;`
		- #### addRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegions​(int index,
		                                                                 [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`repeated .Address regions = 1;`
		- #### addRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegions​([ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .Address regions = 1;`
		- #### addRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegions​(int index,
		                                                                 [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`repeated .Address regions = 1;`
		- #### addAllRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") addAllRegions​(java.lang.Iterable<? extends [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")> values)
		```
		
		`repeated .Address regions = 1;`
		- #### clearRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearRegions()
		```
		
		`repeated .Address regions = 1;`
		- #### removeRegions
		
		
		
		```
		public [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") removeRegions​(int index)
		```
		
		`repeated .Address regions = 1;`
		- #### getRegionsBuilder
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") getRegionsBuilder​(int index)
		```
		
		`repeated .Address regions = 1;`
		- #### getRegionsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getRegionsOrBuilder​(int index)
		```
		
		`repeated .Address regions = 1;`
		
		Specified by:
		`[getRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html#getRegionsOrBuilder(int))` in interface `[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### getRegionsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")> getRegionsOrBuilderList()
		```
		
		`repeated .Address regions = 1;`
		
		Specified by:
		`[getRegionsOrBuilderList](ClusterShardingMessages.CurrentRegionsOrBuilder.html#getRegionsOrBuilderList())` in interface `[ClusterShardingMessages.CurrentRegionsOrBuilder](ClusterShardingMessages.CurrentRegionsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### addRegionsBuilder
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegionsBuilder()
		```
		
		`repeated .Address regions = 1;`
		- #### addRegionsBuilder
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRegionsBuilder​(int index)
		```
		
		`repeated .Address regions = 1;`
		- #### getRegionsBuilderList
		
		
		
		```
		public java.util.List<[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")> getRegionsBuilderList()
		```
		
		`repeated .Address regions = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.CurrentRegions.Builder](ClusterShardingMessages.CurrentRegions.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegionsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.CurrentRegions.Builder.html)*