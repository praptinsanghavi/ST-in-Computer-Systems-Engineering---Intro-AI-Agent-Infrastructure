---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:09:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html
title: ClusterShardingMessages.ClusterShardingStatsEntry.Builder
---

# ClusterShardingMessages.ClusterShardingStatsEntry.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.ClusterShardingStatsEntry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.ClusterShardingStatsEntry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `ClusterShardingStatsEntry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearAddress](#clearAddress())()` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearStats](#clearStats())()` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg")` | `[getAddress](#getAddress())()` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getAddressBuilder](#getAddressBuilder())()` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStats](#getStats())()` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[getStatsBuilder](#getStatsBuilder())()` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")` | `[getStatsOrBuilder](#getStatsOrBuilder())()` | `required .ShardRegionStats stats = 2;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 1;` |
	| `boolean` | `[hasStats](#hasStats())()` | `required .ShardRegionStats stats = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeAddress](#mergeAddress(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ClusterShardingStatsEntry))​([ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeStats](#mergeStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats))​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") value)` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address))​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setAddress](#setAddress(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.Address.Builder))​([ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `required .Address address = 1;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats))​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") value)` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setStats](#setStats(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.ShardRegionStats.Builder))​([ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)` | `required .ShardRegionStats stats = 2;` |
	| `[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                  int index,
		                                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.ClusterShardingStatsEntry](ClusterShardingMessages.ClusterShardingStatsEntry.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddress
		
		
		
		```
		public boolean hasAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[hasAddress](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#hasAddress())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		public [ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") getAddress()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddress](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#getAddress())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The address.
		- #### setAddress
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setAddress​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### setAddress
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setAddress​([ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`required .Address address = 1;`
		- #### mergeAddress
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeAddress​([ClusterShardingMessages.Address](ClusterShardingMessages.Address.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`required .Address address = 1;`
		- #### clearAddress
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearAddress()
		```
		
		`required .Address address = 1;`
		- #### getAddressBuilder
		
		
		
		```
		public [ClusterShardingMessages.Address.Builder](ClusterShardingMessages.Address.Builder.html "class in akka.cluster.sharding.protobuf.msg") getAddressBuilder()
		```
		
		`required .Address address = 1;`
		- #### getAddressOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.AddressOrBuilder](ClusterShardingMessages.AddressOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getAddressOrBuilder()
		```
		
		`required .Address address = 1;`
		
		Specified by:
		`[getAddressOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#getAddressOrBuilder())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### hasStats
		
		
		
		```
		public boolean hasStats()
		```
		
		`required .ShardRegionStats stats = 2;`
		
		Specified by:
		`[hasStats](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#hasStats())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the stats field is set.
		- #### getStats
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") getStats()
		```
		
		`required .ShardRegionStats stats = 2;`
		
		Specified by:
		`[getStats](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#getStats())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The stats.
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`required .ShardRegionStats stats = 2;`
		- #### setStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setStats​([ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") builderForValue)
		```
		
		`required .ShardRegionStats stats = 2;`
		- #### mergeStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeStats​([ClusterShardingMessages.ShardRegionStats](ClusterShardingMessages.ShardRegionStats.html "class in akka.cluster.sharding.protobuf.msg") value)
		```
		
		`required .ShardRegionStats stats = 2;`
		- #### clearStats
		
		
		
		```
		public [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearStats()
		```
		
		`required .ShardRegionStats stats = 2;`
		- #### getStatsBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStats.Builder](ClusterShardingMessages.ShardRegionStats.Builder.html "class in akka.cluster.sharding.protobuf.msg") getStatsBuilder()
		```
		
		`required .ShardRegionStats stats = 2;`
		- #### getStatsOrBuilder
		
		
		
		```
		public [ClusterShardingMessages.ShardRegionStatsOrBuilder](ClusterShardingMessages.ShardRegionStatsOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg") getStatsOrBuilder()
		```
		
		`required .ShardRegionStats stats = 2;`
		
		Specified by:
		`[getStatsOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html#getStatsOrBuilder())` in interface `[ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder](ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.ClusterShardingStatsEntry.Builder](ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStats.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ShardRegionStatsOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.ClusterShardingStatsEntry.Builder.html)*