---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.Builder.html
title: ClusterMessages.SubjectReachability.Builder
---

# ClusterMessages.SubjectReachability.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.SubjectReachability.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability.Builder

- All Implemented Interfaces:
`[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.SubjectReachability.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `SubjectReachability`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAddressIndex](#clearAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearStatus](#clearStatus())()` | `required .ReachabilityStatus status = 3;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required int64 version = 4;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `int` | `[getAddressIndex](#getAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.ReachabilityStatus](ClusterMessages.ReachabilityStatus.html "enum in akka.cluster.protobuf.msg")` | `[getStatus](#getStatus())()` | `required .ReachabilityStatus status = 3;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 4;` |
	| `boolean` | `[hasAddressIndex](#hasAddressIndex())()` | `required int32 addressIndex = 1;` |
	| `boolean` | `[hasStatus](#hasStatus())()` | `required .ReachabilityStatus status = 3;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.SubjectReachability))​([ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAddressIndex](#setAddressIndex(int))​(int value)` | `required int32 addressIndex = 1;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setStatus](#setStatus(akka.cluster.protobuf.msg.ClusterMessages.ReachabilityStatus))​([ClusterMessages.ReachabilityStatus](ClusterMessages.ReachabilityStatus.html "enum in akka.cluster.protobuf.msg") value)` | `required .ReachabilityStatus status = 3;` |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(long))​(long value)` | `required int64 version = 4;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.SubjectReachability](ClusterMessages.SubjectReachability.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasAddressIndex
		
		
		
		```
		public boolean hasAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[hasAddressIndex](ClusterMessages.SubjectReachabilityOrBuilder.html#hasAddressIndex())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the addressIndex field is set.
		- #### getAddressIndex
		
		
		
		```
		public int getAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Specified by:
		`[getAddressIndex](ClusterMessages.SubjectReachabilityOrBuilder.html#getAddressIndex())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The addressIndex.
		- #### setAddressIndex
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setAddressIndex​(int value)
		```
		
		`required int32 addressIndex = 1;`
		
		Parameters:
		`value` \- The addressIndex to set.
		Returns:
		This builder for chaining.
		- #### clearAddressIndex
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clearAddressIndex()
		```
		
		`required int32 addressIndex = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasStatus
		
		
		
		```
		public boolean hasStatus()
		```
		
		`required .ReachabilityStatus status = 3;`
		
		Specified by:
		`[hasStatus](ClusterMessages.SubjectReachabilityOrBuilder.html#hasStatus())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the status field is set.
		- #### getStatus
		
		
		
		```
		public [ClusterMessages.ReachabilityStatus](ClusterMessages.ReachabilityStatus.html "enum in akka.cluster.protobuf.msg") getStatus()
		```
		
		`required .ReachabilityStatus status = 3;`
		
		Specified by:
		`[getStatus](ClusterMessages.SubjectReachabilityOrBuilder.html#getStatus())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The status.
		- #### setStatus
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setStatus​([ClusterMessages.ReachabilityStatus](ClusterMessages.ReachabilityStatus.html "enum in akka.cluster.protobuf.msg") value)
		```
		
		`required .ReachabilityStatus status = 3;`
		
		Parameters:
		`value` \- The status to set.
		Returns:
		This builder for chaining.
		- #### clearStatus
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clearStatus()
		```
		
		`required .ReachabilityStatus status = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 4;`
		
		Specified by:
		`[hasVersion](ClusterMessages.SubjectReachabilityOrBuilder.html#hasVersion())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 4;`
		
		Specified by:
		`[getVersion](ClusterMessages.SubjectReachabilityOrBuilder.html#getVersion())` in interface `[ClusterMessages.SubjectReachabilityOrBuilder](ClusterMessages.SubjectReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setVersion​(long value)
		```
		
		`required int64 version = 4;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") clearVersion()
		```
		
		`required int64 version = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.SubjectReachability.Builder](ClusterMessages.SubjectReachability.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ReachabilityStatus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachabilityOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.SubjectReachability.Builder.html)*