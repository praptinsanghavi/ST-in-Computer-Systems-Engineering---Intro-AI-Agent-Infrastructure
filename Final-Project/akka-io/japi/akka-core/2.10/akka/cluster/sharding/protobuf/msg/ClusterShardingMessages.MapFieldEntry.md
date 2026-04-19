---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:06:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.Builder.html
title: ClusterShardingMessages.MapFieldEntry.Builder
---

# ClusterShardingMessages.MapFieldEntry.Builder

## Content

Package [akka.cluster.sharding.protobuf.msg](package-summary.html)
## Class ClusterShardingMessages.MapFieldEntry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")\>
			- - akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry.Builder

- All Implemented Interfaces:
`[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")

---

```
public static final class ClusterShardingMessages.MapFieldEntry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>
implements [ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")
```

Protobuf type `MapFieldEntry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearKey](#clearKey())()` | `optional string key = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clearValue](#clearValue())()` | `optional int32 value = 2;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getKey](#getKey())()` | `optional string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `optional string key = 1;` |
	| `int` | `[getValue](#getValue())()` | `optional int32 value = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `optional string key = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `optional int32 value = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.protobuf.msg.ClusterShardingMessages.MapFieldEntry))​([ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") other)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setKey](#setKey(java.lang.String))​(java.lang.String value)` | `optional string key = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setKeyBytes](#setKeyBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string key = 1;` |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")` | `[setValue](#setValue(int))​(int value)` | `optional int32 value = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      int index,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​([ClusterShardingMessages.MapFieldEntry](ClusterShardingMessages.MapFieldEntry.html "class in akka.cluster.sharding.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`optional string key = 1;`
		
		Specified by:
		`[hasKey](ClusterShardingMessages.MapFieldEntryOrBuilder.html#hasKey())` in interface `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`optional string key = 1;`
		
		Specified by:
		`[getKey](ClusterShardingMessages.MapFieldEntryOrBuilder.html#getKey())` in interface `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`optional string key = 1;`
		
		Specified by:
		`[getKeyBytes](ClusterShardingMessages.MapFieldEntryOrBuilder.html#getKeyBytes())` in interface `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### setKey
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setKey​(java.lang.String value)
		```
		
		`optional string key = 1;`
		
		Parameters:
		`value` \- The key to set.
		Returns:
		This builder for chaining.
		- #### clearKey
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearKey()
		```
		
		`optional string key = 1;`
		
		Returns:
		This builder for chaining.
		- #### setKeyBytes
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setKeyBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string key = 1;`
		
		Parameters:
		`value` \- The bytes for key to set.
		Returns:
		This builder for chaining.
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`optional int32 value = 2;`
		
		Specified by:
		`[hasValue](ClusterShardingMessages.MapFieldEntryOrBuilder.html#hasValue())` in interface `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public int getValue()
		```
		
		`optional int32 value = 2;`
		
		Specified by:
		`[getValue](ClusterShardingMessages.MapFieldEntryOrBuilder.html#getValue())` in interface `[ClusterShardingMessages.MapFieldEntryOrBuilder](ClusterShardingMessages.MapFieldEntryOrBuilder.html "interface in akka.cluster.sharding.protobuf.msg")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setValue​(int value)
		```
		
		`optional int32 value = 2;`
		
		Parameters:
		`value` \- The value to set.
		Returns:
		This builder for chaining.
		- #### clearValue
		
		
		
		```
		public [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") clearValue()
		```
		
		`optional int32 value = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterShardingMessages.MapFieldEntry.Builder](ClusterShardingMessages.MapFieldEntry.Builder.html "class in akka.cluster.sharding.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/protobuf/msg/ClusterShardingMessages.MapFieldEntry.Builder.html)*