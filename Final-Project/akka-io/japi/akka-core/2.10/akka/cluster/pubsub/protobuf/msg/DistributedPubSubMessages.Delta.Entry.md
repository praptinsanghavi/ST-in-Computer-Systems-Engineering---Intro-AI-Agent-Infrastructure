---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html
title: DistributedPubSubMessages.Delta.Entry.Builder
---

# DistributedPubSubMessages.Delta.Entry.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Delta.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Delta.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Delta.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearKey](#clearKey())()` | `required string key = 1;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearRef](#clearRef())()` | `optional string ref = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required int64 version = 2;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `java.lang.String` | `[getRef](#getRef())()` | `optional string ref = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getRefBytes](#getRefBytes())()` | `optional string ref = 3;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasRef](#hasRef())()` | `optional string ref = 3;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry))​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setKey](#setKey(java.lang.String))​(java.lang.String value)` | `required string key = 1;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setKeyBytes](#setKeyBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string key = 1;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRef](#setRef(java.lang.String))​(java.lang.String value)` | `optional string ref = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRefBytes](#setRefBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string ref = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setVersion](#setVersion(long))​(long value)` | `required int64 version = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      int index,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[hasKey](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasKey())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getKey())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getKeyBytes())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### setKey
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setKey​(java.lang.String value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The key to set.
		Returns:
		This builder for chaining.
		- #### clearKey
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearKey()
		```
		
		`required string key = 1;`
		
		Returns:
		This builder for chaining.
		- #### setKeyBytes
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setKeyBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The bytes for key to set.
		Returns:
		This builder for chaining.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[hasVersion](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasVersion())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[getVersion](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getVersion())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setVersion​(long value)
		```
		
		`required int64 version = 2;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasRef
		
		
		
		```
		public boolean hasRef()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[hasRef](DistributedPubSubMessages.Delta.EntryOrBuilder.html#hasRef())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the ref field is set.
		- #### getRef
		
		
		
		```
		public java.lang.String getRef()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[getRef](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getRef())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The ref.
		- #### getRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRefBytes()
		```
		
		`optional string ref = 3;`
		
		Specified by:
		`[getRefBytes](DistributedPubSubMessages.Delta.EntryOrBuilder.html#getRefBytes())` in interface `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for ref.
		- #### setRef
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRef​(java.lang.String value)
		```
		
		`optional string ref = 3;`
		
		Parameters:
		`value` \- The ref to set.
		Returns:
		This builder for chaining.
		- #### clearRef
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearRef()
		```
		
		`optional string ref = 3;`
		
		Returns:
		This builder for chaining.
		- #### setRefBytes
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRefBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string ref = 3;`
		
		Parameters:
		`value` \- The bytes for ref to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html)*