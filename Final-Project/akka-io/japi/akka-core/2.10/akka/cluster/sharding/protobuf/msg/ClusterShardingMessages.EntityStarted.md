---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.Builder.html
title: ClusterShardingMessages.EntityStarted.Builder
---

# ClusterShardingMessages.EntityStarted.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.EntityStarted.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityStarted.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.EntityStartedOrBuilder](ClusterShardingMessages.EntityStartedOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.EntityStarted.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.EntityStartedOrBuilder](ClusterShardingMessages.EntityStartedOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

```

 not written anymore but kept for backwards compatibility
 
```

 Protobuf type `EntityStarted`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearEntityId](#clearEntityId())()` | `required string entityId = 1;` |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getEntityId](#getEntityId())()` | `required string entityId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityIdBytes](#getEntityIdBytes())()` | `required string entityId = 1;` |
	| `boolean` | `[hasEntityId](#hasEntityId())()` | `required string entityId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.EntityStarted))​([ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setEntityId](#setEntityId(java.lang.String))​(java.lang.String value)` | `required string entityId = 1;` |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setEntityIdBytes](#setEntityIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string entityId = 1;` |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      int index,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.EntityStarted](ClusterShardingMessages.EntityStarted.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasEntityId
		
		
		
		```
		public boolean hasEntityId()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[hasEntityId](ClusterShardingMessages.EntityStartedOrBuilder.html#hasEntityId())` in interface `[ClusterShardingMessages.EntityStartedOrBuilder](ClusterShardingMessages.EntityStartedOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the entityId field is set.
		- #### getEntityId
		
		
		
		```
		public java.lang.String getEntityId()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[getEntityId](ClusterShardingMessages.EntityStartedOrBuilder.html#getEntityId())` in interface `[ClusterShardingMessages.EntityStartedOrBuilder](ClusterShardingMessages.EntityStartedOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The entityId.
		- #### getEntityIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEntityIdBytes()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[getEntityIdBytes](ClusterShardingMessages.EntityStartedOrBuilder.html#getEntityIdBytes())` in interface `[ClusterShardingMessages.EntityStartedOrBuilder](ClusterShardingMessages.EntityStartedOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for entityId.
		- #### setEntityId
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") setEntityId​(java.lang.String value)
		```
		
		`required string entityId = 1;`
		
		Parameters:
		`value` \- The entityId to set.
		Returns:
		This builder for chaining.
		- #### clearEntityId
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearEntityId()
		```
		
		`required string entityId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setEntityIdBytes
		
		
		
		```
		public [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") setEntityIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string entityId = 1;`
		
		Parameters:
		`value` \- The bytes for entityId to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.EntityStarted.Builder](ClusterShardingMessages.EntityStarted.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStartedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.EntityStarted.Builder.html)*