---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.Builder.html
title: DistributedPubSubMessages.Delta.Bucket.Builder
---

# DistributedPubSubMessages.Delta.Bucket.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Delta.Bucket.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Delta.Bucket.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Delta.Bucket`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addAllContent](#addAllContent(java.lang.Iterable))​(java.lang.Iterable<? extends [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> values)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContent](#addContent(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry))​(int index,  [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContent](#addContent(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.Builder))​(int index,  [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContent](#addContent(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry))​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContent](#addContent(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.Builder))​([DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContentBuilder](#addContentBuilder())()` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addContentBuilder](#addContentBuilder(int))​(int index)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearContent](#clearContent())()` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOwner](#clearOwner())()` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required int64 version = 2;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getContent](#getContent(int))​(int index)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getContentBuilder](#getContentBuilder(int))​(int index)` | `repeated .Delta.Entry content = 3;` |
	| `java.util.List<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getContentBuilderList](#getContentBuilderList())()` | `repeated .Delta.Entry content = 3;` |
	| `int` | `[getContentCount](#getContentCount())()` | `repeated .Delta.Entry content = 3;` |
	| `java.util.List<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getContentList](#getContentList())()` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getContentOrBuilder](#getContentOrBuilder(int))​(int index)` | `repeated .Delta.Entry content = 3;` |
	| `java.util.List<? extends [DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")>` | `[getContentOrBuilderList](#getContentOrBuilderList())()` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getOwner](#getOwner())()` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getOwnerBuilder](#getOwnerBuilder())()` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getOwnerOrBuilder](#getOwnerOrBuilder())()` | `required .Address owner = 1;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `boolean` | `[hasOwner](#hasOwner())()` | `required .Address owner = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket))​([DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeOwner](#mergeOwner(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address))​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[removeContent](#removeContent(int))​(int index)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setContent](#setContent(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry))​(int index,  [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setContent](#setContent(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Entry.Builder))​(int index,  [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Entry content = 3;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setOwner](#setOwner(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address))​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setOwner](#setOwner(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Address.Builder))​([DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `required .Address owner = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setVersion](#setVersion(long))​(long value)` | `required int64 version = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasOwner
		
		
		
		```
		public boolean hasOwner()
		```
		
		`required .Address owner = 1;`
		
		Specified by:
		`[hasOwner](DistributedPubSubMessages.Delta.BucketOrBuilder.html#hasOwner())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the owner field is set.
		- #### getOwner
		
		
		
		```
		public [DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") getOwner()
		```
		
		`required .Address owner = 1;`
		
		Specified by:
		`[getOwner](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getOwner())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The owner.
		- #### setOwner
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setOwner​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Address owner = 1;`
		- #### setOwner
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setOwner​([DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`required .Address owner = 1;`
		- #### mergeOwner
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeOwner​([DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Address owner = 1;`
		- #### clearOwner
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOwner()
		```
		
		`required .Address owner = 1;`
		- #### getOwnerBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Address.Builder](DistributedPubSubMessages.Address.Builder.html "class in akka.cluster.pubsub.protobuf.msg") getOwnerBuilder()
		```
		
		`required .Address owner = 1;`
		- #### getOwnerOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getOwnerOrBuilder()
		```
		
		`required .Address owner = 1;`
		
		Specified by:
		`[getOwnerOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getOwnerOrBuilder())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[hasVersion](DistributedPubSubMessages.Delta.BucketOrBuilder.html#hasVersion())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[getVersion](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getVersion())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setVersion​(long value)
		```
		
		`required int64 version = 2;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		This builder for chaining.
		- #### getContentList
		
		
		
		```
		public java.util.List<[DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> getContentList()
		```
		
		`repeated .Delta.Entry content = 3;`
		
		Specified by:
		`[getContentList](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getContentList())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getContentCount
		
		
		
		```
		public int getContentCount()
		```
		
		`repeated .Delta.Entry content = 3;`
		
		Specified by:
		`[getContentCount](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getContentCount())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") getContent​(int index)
		```
		
		`repeated .Delta.Entry content = 3;`
		
		Specified by:
		`[getContent](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getContent(int))` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### setContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setContent​(int index,
		                                                                 [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### setContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setContent​(int index,
		                                                                 [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContent​([DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContent​(int index,
		                                                                 [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContent​([DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContent​(int index,
		                                                                 [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addAllContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addAllContent​(java.lang.Iterable<? extends [DistributedPubSubMessages.Delta.Entry](DistributedPubSubMessages.Delta.Entry.html "class in akka.cluster.pubsub.protobuf.msg")> values)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### clearContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearContent()
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### removeContent
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") removeContent​(int index)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### getContentBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") getContentBuilder​(int index)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### getContentOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getContentOrBuilder​(int index)
		```
		
		`repeated .Delta.Entry content = 3;`
		
		Specified by:
		`[getContentOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getContentOrBuilder(int))` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getContentOrBuilderList
		
		
		
		```
		public java.util.List<? extends [DistributedPubSubMessages.Delta.EntryOrBuilder](DistributedPubSubMessages.Delta.EntryOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")> getContentOrBuilderList()
		```
		
		`repeated .Delta.Entry content = 3;`
		
		Specified by:
		`[getContentOrBuilderList](DistributedPubSubMessages.Delta.BucketOrBuilder.html#getContentOrBuilderList())` in interface `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### addContentBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContentBuilder()
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### addContentBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addContentBuilder​(int index)
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### getContentBuilderList
		
		
		
		```
		public java.util.List<[DistributedPubSubMessages.Delta.Entry.Builder](DistributedPubSubMessages.Delta.Entry.Builder.html "class in akka.cluster.pubsub.protobuf.msg")> getContentBuilderList()
		```
		
		`repeated .Delta.Entry content = 3;`
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.BucketOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.Builder.html)*