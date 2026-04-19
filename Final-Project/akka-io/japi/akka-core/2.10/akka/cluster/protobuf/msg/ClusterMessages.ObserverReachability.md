---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.Builder.html
title: ClusterMessages.ObserverReachability.Builder
---

# ClusterMessages.ObserverReachability.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.ObserverReachability.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability.Builder

- All Implemented Interfaces:
`[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.ObserverReachability.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Reachability
 
```

 Protobuf type `ObserverReachability`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllSubjectReachability](#addAllSubjectReachability(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachability](#addSubjectReachability(int,akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability))​(int index,  [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachability](#addSubjectReachability(int,akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability.Builder))​(int index,  [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachability](#addSubjectReachability(akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability))​([ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachability](#addSubjectReachability(akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability.Builder))​([ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachabilityBuilder](#addSubjectReachabilityBuilder())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSubjectReachabilityBuilder](#addSubjectReachabilityBuilder(int))​(int index)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAddressIndex](#clearAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSubjectReachability](#clearSubjectReachability())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required int64 version = 4;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getAddressIndex](#getAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")` | `[getSubjectReachability](#getSubjectReachability(int))​(int index)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[getSubjectReachabilityBuilder](#getSubjectReachabilityBuilder(int))​(int index)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `java.util.List<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getSubjectReachabilityBuilderList](#getSubjectReachabilityBuilderList())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `int` | `[getSubjectReachabilityCount](#getSubjectReachabilityCount())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `java.util.List<[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")>` | `[getSubjectReachabilityList](#getSubjectReachabilityList())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getSubjectReachabilityOrBuilder](#getSubjectReachabilityOrBuilder(int))​(int index)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `java.util.List<? extends [ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getSubjectReachabilityOrBuilderList](#getSubjectReachabilityOrBuilderList())()` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 4;` |
	| `boolean` | `[hasAddressIndex](#hasAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability))​([ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeSubjectReachability](#removeSubjectReachability(int))​(int index)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddressIndex](#setAddressIndex(int))​(int value)` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSubjectReachability](#setSubjectReachability(int,akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability))​(int index,  [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSubjectReachability](#setSubjectReachability(int,akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability.Builder))​(int index,  [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .SubjectReachability subjectReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(long))​(long value)` | `required int64 version = 4;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     int index,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddressIndex
		
		
		
		```
		public boolean hasAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[hasAddressIndex](ClusterMessages.ObserverReachabilityOrBuilder.html#hasAddressIndex())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the addressIndex field is set.
		- #### getAddressIndex
		
		
		
		```
		public int getAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[getAddressIndex](ClusterMessages.ObserverReachabilityOrBuilder.html#getAddressIndex())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The addressIndex.
		- #### setAddressIndex
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setAddressIndex​(int value)
		```
		
		`required int32 addressIndex = 1;`
		
		Parameters:
		`value` \- The addressIndex to set.
		Returns:
		This builder for chaining.
		- #### clearAddressIndex
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clearAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 4;`
		
		Specified by:
		`[hasVersion](ClusterMessages.ObserverReachabilityOrBuilder.html#hasVersion())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 4;`
		
		Specified by:
		`[getVersion](ClusterMessages.ObserverReachabilityOrBuilder.html#getVersion())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setVersion​(long value)
		```
		
		`required int64 version = 4;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clearVersion()
		```
		
		`required int64 version = 4;`
		
		Returns:
		This builder for chaining.
		- #### getSubjectReachabilityList
		
		
		
		```
		public java.util.List<[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")> getSubjectReachabilityList()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		
		Specified by:
		`[getSubjectReachabilityList](ClusterMessages.ObserverReachabilityOrBuilder.html#getSubjectReachabilityList())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getSubjectReachabilityCount
		
		
		
		```
		public int getSubjectReachabilityCount()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		
		Specified by:
		`[getSubjectReachabilityCount](ClusterMessages.ObserverReachabilityOrBuilder.html#getSubjectReachabilityCount())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getSubjectReachability
		
		
		
		```
		public [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") getSubjectReachability​(int index)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		
		Specified by:
		`[getSubjectReachability](ClusterMessages.ObserverReachabilityOrBuilder.html#getSubjectReachability(int))` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setSubjectReachability​(int index,
		                                                                           [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### setSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setSubjectReachability​(int index,
		                                                                           [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachability​([ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachability​(int index,
		                                                                           [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachability​([ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachability​(int index,
		                                                                           [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addAllSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addAllSubjectReachability​(java.lang.Iterable<? extends [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### clearSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") clearSubjectReachability()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### removeSubjectReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") removeSubjectReachability​(int index)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### getSubjectReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") getSubjectReachabilityBuilder​(int index)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### getSubjectReachabilityOrBuilder
		
		
		
		```
		public [ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg") getSubjectReachabilityOrBuilder​(int index)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		
		Specified by:
		`[getSubjectReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html#getSubjectReachabilityOrBuilder(int))` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getSubjectReachabilityOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")> getSubjectReachabilityOrBuilderList()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		
		Specified by:
		`[getSubjectReachabilityOrBuilderList](ClusterMessages.ObserverReachabilityOrBuilder.html#getSubjectReachabilityOrBuilderList())` in interface `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addSubjectReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachabilityBuilder()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### addSubjectReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") addSubjectReachabilityBuilder​(int index)
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### getSubjectReachabilityBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")> getSubjectReachabilityBuilderList()
		```
		
		`repeated .SubjectReachability subjectReachability = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachabilityOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachabilityOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.Builder.html)*