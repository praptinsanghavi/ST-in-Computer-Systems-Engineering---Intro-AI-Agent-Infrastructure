---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.Builder.html
title: ClusterMessages.Tombstone.Builder
---

# ClusterMessages.Tombstone.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Tombstone.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Tombstone.Builder

- All Implemented Interfaces:
`[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Tombstone.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `Tombstone`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAddressIndex](#clearAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 2;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getAddressIndex](#getAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasAddressIndex](#hasAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Tombstone))​([ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddressIndex](#setAddressIndex(int))​(int value)` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 2;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddressIndex
		
		
		
		```
		public boolean hasAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[hasAddressIndex](ClusterMessages.TombstoneOrBuilder.html#hasAddressIndex())` in interface `[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the addressIndex field is set.
		- #### getAddressIndex
		
		
		
		```
		public int getAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[getAddressIndex](ClusterMessages.TombstoneOrBuilder.html#getAddressIndex())` in interface `[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The addressIndex.
		- #### setAddressIndex
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") setAddressIndex​(int value)
		```
		
		`required int32 addressIndex = 1;`
		
		Parameters:
		`value` \- The addressIndex to set.
		Returns:
		This builder for chaining.
		- #### clearAddressIndex
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clearAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[hasTimestamp](ClusterMessages.TombstoneOrBuilder.html#hasTimestamp())` in interface `[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[getTimestamp](ClusterMessages.TombstoneOrBuilder.html#getTimestamp())` in interface `[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 2;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") clearTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.TombstoneOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.Builder.html)*