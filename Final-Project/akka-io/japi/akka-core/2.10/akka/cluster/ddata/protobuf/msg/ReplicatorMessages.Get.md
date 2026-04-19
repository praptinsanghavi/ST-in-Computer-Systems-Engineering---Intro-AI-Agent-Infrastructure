---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.Builder.html
title: ReplicatorMessages.Get.Builder
---

# ReplicatorMessages.Get.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Get.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Get.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Get.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Get`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearConsistency](#clearConsistency())()` | `required sint32 consistency = 2;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearConsistencyAdditional](#clearConsistencyAdditional())()` | `optional int32 consistencyAdditional = 6;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearConsistencyMinCap](#clearConsistencyMinCap())()` | `optional int32 consistencyMinCap = 5;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearKey](#clearKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearRequest](#clearRequest())()` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearTimeout](#clearTimeout())()` | `required uint32 timeout = 3;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getConsistency](#getConsistency())()` | `required sint32 consistency = 2;` |
	| `int` | `[getConsistencyAdditional](#getConsistencyAdditional())()` | `optional int32 consistencyAdditional = 6;` |
	| `int` | `[getConsistencyMinCap](#getConsistencyMinCap())()` | `optional int32 consistencyMinCap = 5;` |
	| `[ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKey](#getKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKeyBuilder](#getKeyBuilder())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getKeyOrBuilder](#getKeyOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRequest](#getRequest())()` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRequestBuilder](#getRequestBuilder())()` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getRequestOrBuilder](#getRequestOrBuilder())()` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `int` | `[getTimeout](#getTimeout())()` | `required uint32 timeout = 3;` |
	| `boolean` | `[hasConsistency](#hasConsistency())()` | `required sint32 consistency = 2;` |
	| `boolean` | `[hasConsistencyAdditional](#hasConsistencyAdditional())()` | `optional int32 consistencyAdditional = 6;` |
	| `boolean` | `[hasConsistencyMinCap](#hasConsistencyMinCap())()` | `optional int32 consistencyMinCap = 5;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `boolean` | `[hasRequest](#hasRequest())()` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `boolean` | `[hasTimeout](#hasTimeout())()` | `required uint32 timeout = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Get))​([ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeKey](#mergeKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeRequest](#mergeRequest(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setConsistency](#setConsistency(int))​(int value)` | `required sint32 consistency = 2;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setConsistencyAdditional](#setConsistencyAdditional(int))​(int value)` | `optional int32 consistencyAdditional = 6;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setConsistencyMinCap](#setConsistencyMinCap(int))​(int value)` | `optional int32 consistencyMinCap = 5;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRequest](#setRequest(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRequest](#setRequest(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `optional .akka.cluster.ddata.OtherMessage request = 4;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setTimeout](#setTimeout(int))​(int value)` | `required uint32 timeout = 3;` |
	| `[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.Get](ReplicatorMessages.Get.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[hasKey](ReplicatorMessages.GetOrBuilder.html#hasKey())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[getKey](ReplicatorMessages.GetOrBuilder.html#getKey())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The key.
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### mergeKey
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### clearKey
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### getKeyBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getKeyBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### getKeyOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getKeyOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[getKeyOrBuilder](ReplicatorMessages.GetOrBuilder.html#getKeyOrBuilder())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasConsistency
		
		
		
		```
		public boolean hasConsistency()
		```
		
		`required sint32 consistency = 2;`
		
		Specified by:
		`[hasConsistency](ReplicatorMessages.GetOrBuilder.html#hasConsistency())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the consistency field is set.
		- #### getConsistency
		
		
		
		```
		public int getConsistency()
		```
		
		`required sint32 consistency = 2;`
		
		Specified by:
		`[getConsistency](ReplicatorMessages.GetOrBuilder.html#getConsistency())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The consistency.
		- #### setConsistency
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setConsistency​(int value)
		```
		
		`required sint32 consistency = 2;`
		
		Parameters:
		`value` \- The consistency to set.
		Returns:
		This builder for chaining.
		- #### clearConsistency
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearConsistency()
		```
		
		`required sint32 consistency = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasTimeout
		
		
		
		```
		public boolean hasTimeout()
		```
		
		`required uint32 timeout = 3;`
		
		Specified by:
		`[hasTimeout](ReplicatorMessages.GetOrBuilder.html#hasTimeout())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the timeout field is set.
		- #### getTimeout
		
		
		
		```
		public int getTimeout()
		```
		
		`required uint32 timeout = 3;`
		
		Specified by:
		`[getTimeout](ReplicatorMessages.GetOrBuilder.html#getTimeout())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The timeout.
		- #### setTimeout
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setTimeout​(int value)
		```
		
		`required uint32 timeout = 3;`
		
		Parameters:
		`value` \- The timeout to set.
		Returns:
		This builder for chaining.
		- #### clearTimeout
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearTimeout()
		```
		
		`required uint32 timeout = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasRequest
		
		
		
		```
		public boolean hasRequest()
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		
		Specified by:
		`[hasRequest](ReplicatorMessages.GetOrBuilder.html#hasRequest())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the request field is set.
		- #### getRequest
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getRequest()
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		
		Specified by:
		`[getRequest](ReplicatorMessages.GetOrBuilder.html#getRequest())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The request.
		- #### setRequest
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRequest​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		- #### setRequest
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRequest​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		- #### mergeRequest
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeRequest​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		- #### clearRequest
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearRequest()
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		- #### getRequestBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getRequestBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		- #### getRequestOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getRequestOrBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage request = 4;`
		
		Specified by:
		`[getRequestOrBuilder](ReplicatorMessages.GetOrBuilder.html#getRequestOrBuilder())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasConsistencyMinCap
		
		
		
		```
		public boolean hasConsistencyMinCap()
		```
		
		`optional int32 consistencyMinCap = 5;`
		
		Specified by:
		`[hasConsistencyMinCap](ReplicatorMessages.GetOrBuilder.html#hasConsistencyMinCap())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the consistencyMinCap field is set.
		- #### getConsistencyMinCap
		
		
		
		```
		public int getConsistencyMinCap()
		```
		
		`optional int32 consistencyMinCap = 5;`
		
		Specified by:
		`[getConsistencyMinCap](ReplicatorMessages.GetOrBuilder.html#getConsistencyMinCap())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The consistencyMinCap.
		- #### setConsistencyMinCap
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setConsistencyMinCap​(int value)
		```
		
		`optional int32 consistencyMinCap = 5;`
		
		Parameters:
		`value` \- The consistencyMinCap to set.
		Returns:
		This builder for chaining.
		- #### clearConsistencyMinCap
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearConsistencyMinCap()
		```
		
		`optional int32 consistencyMinCap = 5;`
		
		Returns:
		This builder for chaining.
		- #### hasConsistencyAdditional
		
		
		
		```
		public boolean hasConsistencyAdditional()
		```
		
		`optional int32 consistencyAdditional = 6;`
		
		Specified by:
		`[hasConsistencyAdditional](ReplicatorMessages.GetOrBuilder.html#hasConsistencyAdditional())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the consistencyAdditional field is set.
		- #### getConsistencyAdditional
		
		
		
		```
		public int getConsistencyAdditional()
		```
		
		`optional int32 consistencyAdditional = 6;`
		
		Specified by:
		`[getConsistencyAdditional](ReplicatorMessages.GetOrBuilder.html#getConsistencyAdditional())` in interface `[ReplicatorMessages.GetOrBuilder](ReplicatorMessages.GetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The consistencyAdditional.
		- #### setConsistencyAdditional
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setConsistencyAdditional​(int value)
		```
		
		`optional int32 consistencyAdditional = 6;`
		
		Parameters:
		`value` \- The consistencyAdditional to set.
		Returns:
		This builder for chaining.
		- #### clearConsistencyAdditional
		
		
		
		```
		public [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearConsistencyAdditional()
		```
		
		`optional int32 consistencyAdditional = 6;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Get.Builder](ReplicatorMessages.Get.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.GetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Get.Builder.html)*