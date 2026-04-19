---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.Builder.html
title: ClusterMessages.Member.Builder
---

# ClusterMessages.Member.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Member.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Member.Builder

- All Implemented Interfaces:
`[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Member.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Member
 
```

 Protobuf type `Member`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllRolesIndexes](#addAllRolesIndexes(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRolesIndexes](#addRolesIndexes(int))​(int value)` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAddressIndex](#clearAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAppVersionIndex](#clearAppVersionIndex())()` | `optional int32 appVersionIndex = 5;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearRolesIndexes](#clearRolesIndexes())()` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearStatus](#clearStatus())()` | `required .MemberStatus status = 3;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearUpNumber](#clearUpNumber())()` | `required int32 upNumber = 2;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getAddressIndex](#getAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `int` | `[getAppVersionIndex](#getAppVersionIndex())()` | `optional int32 appVersionIndex = 5;` |
	| `[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getRolesIndexes](#getRolesIndexes(int))​(int index)` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `int` | `[getRolesIndexesCount](#getRolesIndexesCount())()` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `java.util.List<java.lang.Integer>` | `[getRolesIndexesList](#getRolesIndexesList())()` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `[ClusterMessages.MemberStatus](ClusterMessages.MemberStatus.html "enum in akka.cluster.protobuf.msg")` | `[getStatus](#getStatus())()` | `required .MemberStatus status = 3;` |
	| `int` | `[getUpNumber](#getUpNumber())()` | `required int32 upNumber = 2;` |
	| `boolean` | `[hasAddressIndex](#hasAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `boolean` | `[hasAppVersionIndex](#hasAppVersionIndex())()` | `optional int32 appVersionIndex = 5;` |
	| `boolean` | `[hasStatus](#hasStatus())()` | `required .MemberStatus status = 3;` |
	| `boolean` | `[hasUpNumber](#hasUpNumber())()` | `required int32 upNumber = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Member))​([ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddressIndex](#setAddressIndex(int))​(int value)` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAppVersionIndex](#setAppVersionIndex(int))​(int value)` | `optional int32 appVersionIndex = 5;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRolesIndexes](#setRolesIndexes(int,int))​(int index,  int value)` | `repeated int32 rolesIndexes = 4 [packed = true];` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setStatus](#setStatus(akka.cluster.protobuf.msg.ClusterMessages.MemberStatus))​([ClusterMessages.MemberStatus](ClusterMessages.MemberStatus.html "enum in akka.cluster.protobuf.msg") value)` | `required .MemberStatus status = 3;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUpNumber](#setUpNumber(int))​(int value)` | `required int32 upNumber = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddressIndex
		
		
		
		```
		public boolean hasAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[hasAddressIndex](ClusterMessages.MemberOrBuilder.html#hasAddressIndex())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the addressIndex field is set.
		- #### getAddressIndex
		
		
		
		```
		public int getAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[getAddressIndex](ClusterMessages.MemberOrBuilder.html#getAddressIndex())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The addressIndex.
		- #### setAddressIndex
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setAddressIndex​(int value)
		```
		
		`required int32 addressIndex = 1;`
		
		Parameters:
		`value` \- The addressIndex to set.
		Returns:
		This builder for chaining.
		- #### clearAddressIndex
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasUpNumber
		
		
		
		```
		public boolean hasUpNumber()
		```
		
		`required int32 upNumber = 2;`
		
		Specified by:
		`[hasUpNumber](ClusterMessages.MemberOrBuilder.html#hasUpNumber())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the upNumber field is set.
		- #### getUpNumber
		
		
		
		```
		public int getUpNumber()
		```
		
		`required int32 upNumber = 2;`
		
		Specified by:
		`[getUpNumber](ClusterMessages.MemberOrBuilder.html#getUpNumber())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The upNumber.
		- #### setUpNumber
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setUpNumber​(int value)
		```
		
		`required int32 upNumber = 2;`
		
		Parameters:
		`value` \- The upNumber to set.
		Returns:
		This builder for chaining.
		- #### clearUpNumber
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearUpNumber()
		```
		
		`required int32 upNumber = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasStatus
		
		
		
		```
		public boolean hasStatus()
		```
		
		`required .MemberStatus status = 3;`
		
		Specified by:
		`[hasStatus](ClusterMessages.MemberOrBuilder.html#hasStatus())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the status field is set.
		- #### getStatus
		
		
		
		```
		public [ClusterMessages.MemberStatus](ClusterMessages.MemberStatus.html "enum in akka.cluster.protobuf.msg") getStatus()
		```
		
		`required .MemberStatus status = 3;`
		
		Specified by:
		`[getStatus](ClusterMessages.MemberOrBuilder.html#getStatus())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The status.
		- #### setStatus
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setStatus​([ClusterMessages.MemberStatus](ClusterMessages.MemberStatus.html "enum in akka.cluster.protobuf.msg") value)
		```
		
		`required .MemberStatus status = 3;`
		
		Parameters:
		`value` \- The status to set.
		Returns:
		This builder for chaining.
		- #### clearStatus
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearStatus()
		```
		
		`required .MemberStatus status = 3;`
		
		Returns:
		This builder for chaining.
		- #### getRolesIndexesList
		
		
		
		```
		public java.util.List<java.lang.Integer> getRolesIndexesList()
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Specified by:
		`[getRolesIndexesList](ClusterMessages.MemberOrBuilder.html#getRolesIndexesList())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the rolesIndexes.
		- #### getRolesIndexesCount
		
		
		
		```
		public int getRolesIndexesCount()
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Specified by:
		`[getRolesIndexesCount](ClusterMessages.MemberOrBuilder.html#getRolesIndexesCount())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of rolesIndexes.
		- #### getRolesIndexes
		
		
		
		```
		public int getRolesIndexes​(int index)
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Specified by:
		`[getRolesIndexes](ClusterMessages.MemberOrBuilder.html#getRolesIndexes(int))` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The rolesIndexes at the given index.
		- #### setRolesIndexes
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setRolesIndexes​(int index,
		                                                      int value)
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The rolesIndexes to set.
		Returns:
		This builder for chaining.
		- #### addRolesIndexes
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") addRolesIndexes​(int value)
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Parameters:
		`value` \- The rolesIndexes to add.
		Returns:
		This builder for chaining.
		- #### addAllRolesIndexes
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") addAllRolesIndexes​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Parameters:
		`values` \- The rolesIndexes to add.
		Returns:
		This builder for chaining.
		- #### clearRolesIndexes
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearRolesIndexes()
		```
		
		`repeated int32 rolesIndexes = 4 [packed = true];`
		
		Returns:
		This builder for chaining.
		- #### hasAppVersionIndex
		
		
		
		```
		public boolean hasAppVersionIndex()
		```
		
		`optional int32 appVersionIndex = 5;`
		
		Specified by:
		`[hasAppVersionIndex](ClusterMessages.MemberOrBuilder.html#hasAppVersionIndex())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the appVersionIndex field is set.
		- #### getAppVersionIndex
		
		
		
		```
		public int getAppVersionIndex()
		```
		
		`optional int32 appVersionIndex = 5;`
		
		Specified by:
		`[getAppVersionIndex](ClusterMessages.MemberOrBuilder.html#getAppVersionIndex())` in interface `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The appVersionIndex.
		- #### setAppVersionIndex
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setAppVersionIndex​(int value)
		```
		
		`optional int32 appVersionIndex = 5;`
		
		Parameters:
		`value` \- The appVersionIndex to set.
		Returns:
		This builder for chaining.
		- #### clearAppVersionIndex
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") clearAppVersionIndex()
		```
		
		`optional int32 appVersionIndex = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.MemberOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.Builder.html)*