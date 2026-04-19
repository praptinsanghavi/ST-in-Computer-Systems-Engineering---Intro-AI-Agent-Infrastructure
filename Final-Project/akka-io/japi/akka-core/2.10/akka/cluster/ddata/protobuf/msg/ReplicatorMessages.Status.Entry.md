---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.Builder.html
title: ReplicatorMessages.Status.Entry.Builder
---

# ReplicatorMessages.Status.Entry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Status.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Status.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Status.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearDigest](#clearDigest())()` | `required bytes digest = 2;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearKey](#clearKey())()` | `required string key = 1;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearUsedTimestamp](#clearUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getDigest](#getDigest())()` | `required bytes digest = 2;` |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `long` | `[getUsedTimestamp](#getUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `boolean` | `[hasDigest](#hasDigest())()` | `required bytes digest = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasUsedTimestamp](#hasUsedTimestamp())()` | `optional sint64 usedTimestamp = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Status.Entry))​([ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setDigest](#setDigest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes digest = 2;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(java.lang.String))​(java.lang.String value)` | `required string key = 1;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKeyBytes](#setKeyBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string key = 1;` |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUsedTimestamp](#setUsedTimestamp(long))​(long value)` | `optional sint64 usedTimestamp = 3;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.Status.Entry](ReplicatorMessages.Status.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[hasKey](ReplicatorMessages.Status.EntryOrBuilder.html#hasKey())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](ReplicatorMessages.Status.EntryOrBuilder.html#getKey())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](ReplicatorMessages.Status.EntryOrBuilder.html#getKeyBytes())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​(java.lang.String value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The key to set.
		Returns:
		This builder for chaining.
		- #### clearKey
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearKey()
		```
		
		`required string key = 1;`
		
		Returns:
		This builder for chaining.
		- #### setKeyBytes
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKeyBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The bytes for key to set.
		Returns:
		This builder for chaining.
		- #### hasDigest
		
		
		
		```
		public boolean hasDigest()
		```
		
		`required bytes digest = 2;`
		
		Specified by:
		`[hasDigest](ReplicatorMessages.Status.EntryOrBuilder.html#hasDigest())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the digest field is set.
		- #### getDigest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getDigest()
		```
		
		`required bytes digest = 2;`
		
		Specified by:
		`[getDigest](ReplicatorMessages.Status.EntryOrBuilder.html#getDigest())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The digest.
		- #### setDigest
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setDigest​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes digest = 2;`
		
		Parameters:
		`value` \- The digest to set.
		Returns:
		This builder for chaining.
		- #### clearDigest
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearDigest()
		```
		
		`required bytes digest = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasUsedTimestamp
		
		
		
		```
		public boolean hasUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Specified by:
		`[hasUsedTimestamp](ReplicatorMessages.Status.EntryOrBuilder.html#hasUsedTimestamp())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the usedTimestamp field is set.
		- #### getUsedTimestamp
		
		
		
		```
		public long getUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Specified by:
		`[getUsedTimestamp](ReplicatorMessages.Status.EntryOrBuilder.html#getUsedTimestamp())` in interface `[ReplicatorMessages.Status.EntryOrBuilder](ReplicatorMessages.Status.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The usedTimestamp.
		- #### setUsedTimestamp
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUsedTimestamp​(long value)
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Parameters:
		`value` \- The usedTimestamp to set.
		Returns:
		This builder for chaining.
		- #### clearUsedTimestamp
		
		
		
		```
		public [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearUsedTimestamp()
		```
		
		`optional sint64 usedTimestamp = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Status.Entry.Builder](ReplicatorMessages.Status.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Status.Entry.Builder.html)*