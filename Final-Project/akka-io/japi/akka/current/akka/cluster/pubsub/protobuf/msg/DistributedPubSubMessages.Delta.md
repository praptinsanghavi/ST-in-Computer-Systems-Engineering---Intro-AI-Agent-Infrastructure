---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Builder.html
title: DistributedPubSubMessages.Delta.Builder
---

# DistributedPubSubMessages.Delta.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Delta.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Delta.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

Protobuf type `Delta`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addAllBuckets](#addAllBuckets(java.lang.Iterable))​(java.lang.Iterable<? extends [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")> values)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBuckets](#addBuckets(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket))​(int index,  [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBuckets](#addBuckets(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket.Builder))​(int index,  [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBuckets](#addBuckets(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket))​([DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBuckets](#addBuckets(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket.Builder))​([DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBucketsBuilder](#addBucketsBuilder())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addBucketsBuilder](#addBucketsBuilder(int))​(int index)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearBuckets](#clearBuckets())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getBuckets](#getBuckets(int))​(int index)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getBucketsBuilder](#getBucketsBuilder(int))​(int index)` | `repeated .Delta.Bucket buckets = 1;` |
	| `java.util.List<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getBucketsBuilderList](#getBucketsBuilderList())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `int` | `[getBucketsCount](#getBucketsCount())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `java.util.List<[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getBucketsList](#getBucketsList())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getBucketsOrBuilder](#getBucketsOrBuilder(int))​(int index)` | `repeated .Delta.Bucket buckets = 1;` |
	| `java.util.List<? extends [DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")>` | `[getBucketsOrBuilderList](#getBucketsOrBuilderList())()` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta))​([DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[removeBuckets](#removeBuckets(int))​(int index)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setBuckets](#setBuckets(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket))​(int index,  [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setBuckets](#setBuckets(int,akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Delta.Bucket.Builder))​(int index,  [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `repeated .Delta.Bucket buckets = 1;` |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Delta](DistributedPubSubMessages.Delta.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getBucketsList
		
		
		
		```
		public java.util.List<[DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")> getBucketsList()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		
		Specified by:
		`[getBucketsList](DistributedPubSubMessages.DeltaOrBuilder.html#getBucketsList())` in interface `[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getBucketsCount
		
		
		
		```
		public int getBucketsCount()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		
		Specified by:
		`[getBucketsCount](DistributedPubSubMessages.DeltaOrBuilder.html#getBucketsCount())` in interface `[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") getBuckets​(int index)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		
		Specified by:
		`[getBuckets](DistributedPubSubMessages.DeltaOrBuilder.html#getBuckets(int))` in interface `[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### setBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setBuckets​(int index,
		                                                          [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### setBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setBuckets​(int index,
		                                                          [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBuckets​([DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBuckets​(int index,
		                                                          [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBuckets​([DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBuckets​(int index,
		                                                          [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addAllBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addAllBuckets​(java.lang.Iterable<? extends [DistributedPubSubMessages.Delta.Bucket](DistributedPubSubMessages.Delta.Bucket.html "class in akka.cluster.pubsub.protobuf.msg")> values)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### clearBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearBuckets()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### removeBuckets
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") removeBuckets​(int index)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### getBucketsBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") getBucketsBuilder​(int index)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### getBucketsOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getBucketsOrBuilder​(int index)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		
		Specified by:
		`[getBucketsOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html#getBucketsOrBuilder(int))` in interface `[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### getBucketsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [DistributedPubSubMessages.Delta.BucketOrBuilder](DistributedPubSubMessages.Delta.BucketOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")> getBucketsOrBuilderList()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		
		Specified by:
		`[getBucketsOrBuilderList](DistributedPubSubMessages.DeltaOrBuilder.html#getBucketsOrBuilderList())` in interface `[DistributedPubSubMessages.DeltaOrBuilder](DistributedPubSubMessages.DeltaOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### addBucketsBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBucketsBuilder()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### addBucketsBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addBucketsBuilder​(int index)
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### getBucketsBuilderList
		
		
		
		```
		public java.util.List<[DistributedPubSubMessages.Delta.Bucket.Builder](DistributedPubSubMessages.Delta.Bucket.Builder.html "class in akka.cluster.pubsub.protobuf.msg")> getBucketsBuilderList()
		```
		
		`repeated .Delta.Bucket buckets = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Delta.Builder](DistributedPubSubMessages.Delta.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Bucket.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.BucketOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.DeltaOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Delta.Builder.html)*