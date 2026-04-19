---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html
title: ClusterMessages.VectorClock.Version.Builder
---

# ClusterMessages.VectorClock.Version.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.VectorClock.Version.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.Builder

- All Implemented Interfaces:
`[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.VectorClock.Version.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `VectorClock.Version`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearHashIndex](#clearHashIndex())()` | `required int32 hashIndex = 1;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 2;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getHashIndex](#getHashIndex())()` | `required int32 hashIndex = 1;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasHashIndex](#hasHashIndex())()` | `required int32 hashIndex = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version))​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[setHashIndex](#setHashIndex(int))​(int value)` | `required int32 hashIndex = 1;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 2;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasHashIndex
		
		
		
		```
		public boolean hasHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Specified by:
		`[hasHashIndex](ClusterMessages.VectorClock.VersionOrBuilder.html#hasHashIndex())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the hashIndex field is set.
		- #### getHashIndex
		
		
		
		```
		public int getHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Specified by:
		`[getHashIndex](ClusterMessages.VectorClock.VersionOrBuilder.html#getHashIndex())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The hashIndex.
		- #### setHashIndex
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") setHashIndex​(int value)
		```
		
		`required int32 hashIndex = 1;`
		
		Parameters:
		`value` \- The hashIndex to set.
		Returns:
		This builder for chaining.
		- #### clearHashIndex
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clearHashIndex()
		```
		
		`required int32 hashIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[hasTimestamp](ClusterMessages.VectorClock.VersionOrBuilder.html#hasTimestamp())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Specified by:
		`[getTimestamp](ClusterMessages.VectorClock.VersionOrBuilder.html#getTimestamp())` in interface `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 2;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") clearTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html)*