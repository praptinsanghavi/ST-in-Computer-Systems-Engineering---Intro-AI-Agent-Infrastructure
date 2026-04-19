---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.Builder.html
title: ClusterMessages.ClusterRouterPoolSettings.Builder
---

# ClusterMessages.ClusterRouterPoolSettings.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.ClusterRouterPoolSettings.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings.Builder

- All Implemented Interfaces:
`[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.ClusterRouterPoolSettings.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `ClusterRouterPoolSettings`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllUseRoles](#addAllUseRoles(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string useRoles = 5;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[addUseRoles](#addUseRoles(java.lang.String))​(java.lang.String value)` | `repeated string useRoles = 5;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[addUseRolesBytes](#addUseRolesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string useRoles = 5;` |
	| `[ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllowLocalRoutees](#clearAllowLocalRoutees())()` | `required bool allowLocalRoutees = 3;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearMaxInstancesPerNode](#clearMaxInstancesPerNode())()` | `required uint32 maxInstancesPerNode = 2;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTotalInstances](#clearTotalInstances())()` | `required uint32 totalInstances = 1;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearUseRole](#clearUseRole())()` | `optional string useRole = 4;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearUseRoles](#clearUseRoles())()` | `repeated string useRoles = 5;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `boolean` | `[getAllowLocalRoutees](#getAllowLocalRoutees())()` | `required bool allowLocalRoutees = 3;` |
	| `[ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getMaxInstancesPerNode](#getMaxInstancesPerNode())()` | `required uint32 maxInstancesPerNode = 2;` |
	| `int` | `[getTotalInstances](#getTotalInstances())()` | `required uint32 totalInstances = 1;` |
	| `java.lang.String` | `[getUseRole](#getUseRole())()` | `optional string useRole = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getUseRoleBytes](#getUseRoleBytes())()` | `optional string useRole = 4;` |
	| `java.lang.String` | `[getUseRoles](#getUseRoles(int))​(int index)` | `repeated string useRoles = 5;` |
	| `akka.protobufv3.internal.ByteString` | `[getUseRolesBytes](#getUseRolesBytes(int))​(int index)` | `repeated string useRoles = 5;` |
	| `int` | `[getUseRolesCount](#getUseRolesCount())()` | `repeated string useRoles = 5;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getUseRolesList](#getUseRolesList())()` | `repeated string useRoles = 5;` |
	| `boolean` | `[hasAllowLocalRoutees](#hasAllowLocalRoutees())()` | `required bool allowLocalRoutees = 3;` |
	| `boolean` | `[hasMaxInstancesPerNode](#hasMaxInstancesPerNode())()` | `required uint32 maxInstancesPerNode = 2;` |
	| `boolean` | `[hasTotalInstances](#hasTotalInstances())()` | `required uint32 totalInstances = 1;` |
	| `boolean` | `[hasUseRole](#hasUseRole())()` | `optional string useRole = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.ClusterRouterPoolSettings))​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllowLocalRoutees](#setAllowLocalRoutees(boolean))​(boolean value)` | `required bool allowLocalRoutees = 3;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setMaxInstancesPerNode](#setMaxInstancesPerNode(int))​(int value)` | `required uint32 maxInstancesPerNode = 2;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTotalInstances](#setTotalInstances(int))​(int value)` | `required uint32 totalInstances = 1;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUseRole](#setUseRole(java.lang.String))​(java.lang.String value)` | `optional string useRole = 4;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUseRoleBytes](#setUseRoleBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string useRole = 4;` |
	| `[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUseRoles](#setUseRoles(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string useRoles = 5;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.ClusterRouterPoolSettings](ClusterMessages.ClusterRouterPoolSettings.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasTotalInstances
		
		
		
		```
		public boolean hasTotalInstances()
		```
		
		`required uint32 totalInstances = 1;`
		
		Specified by:
		`[hasTotalInstances](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#hasTotalInstances())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the totalInstances field is set.
		- #### getTotalInstances
		
		
		
		```
		public int getTotalInstances()
		```
		
		`required uint32 totalInstances = 1;`
		
		Specified by:
		`[getTotalInstances](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getTotalInstances())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The totalInstances.
		- #### setTotalInstances
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setTotalInstances​(int value)
		```
		
		`required uint32 totalInstances = 1;`
		
		Parameters:
		`value` \- The totalInstances to set.
		Returns:
		This builder for chaining.
		- #### clearTotalInstances
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearTotalInstances()
		```
		
		`required uint32 totalInstances = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasMaxInstancesPerNode
		
		
		
		```
		public boolean hasMaxInstancesPerNode()
		```
		
		`required uint32 maxInstancesPerNode = 2;`
		
		Specified by:
		`[hasMaxInstancesPerNode](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#hasMaxInstancesPerNode())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the maxInstancesPerNode field is set.
		- #### getMaxInstancesPerNode
		
		
		
		```
		public int getMaxInstancesPerNode()
		```
		
		`required uint32 maxInstancesPerNode = 2;`
		
		Specified by:
		`[getMaxInstancesPerNode](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getMaxInstancesPerNode())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The maxInstancesPerNode.
		- #### setMaxInstancesPerNode
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setMaxInstancesPerNode​(int value)
		```
		
		`required uint32 maxInstancesPerNode = 2;`
		
		Parameters:
		`value` \- The maxInstancesPerNode to set.
		Returns:
		This builder for chaining.
		- #### clearMaxInstancesPerNode
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearMaxInstancesPerNode()
		```
		
		`required uint32 maxInstancesPerNode = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasAllowLocalRoutees
		
		
		
		```
		public boolean hasAllowLocalRoutees()
		```
		
		`required bool allowLocalRoutees = 3;`
		
		Specified by:
		`[hasAllowLocalRoutees](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#hasAllowLocalRoutees())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the allowLocalRoutees field is set.
		- #### getAllowLocalRoutees
		
		
		
		```
		public boolean getAllowLocalRoutees()
		```
		
		`required bool allowLocalRoutees = 3;`
		
		Specified by:
		`[getAllowLocalRoutees](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getAllowLocalRoutees())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The allowLocalRoutees.
		- #### setAllowLocalRoutees
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setAllowLocalRoutees​(boolean value)
		```
		
		`required bool allowLocalRoutees = 3;`
		
		Parameters:
		`value` \- The allowLocalRoutees to set.
		Returns:
		This builder for chaining.
		- #### clearAllowLocalRoutees
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearAllowLocalRoutees()
		```
		
		`required bool allowLocalRoutees = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasUseRole
		
		
		
		```
		public boolean hasUseRole()
		```
		
		`optional string useRole = 4;`
		
		Specified by:
		`[hasUseRole](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#hasUseRole())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the useRole field is set.
		- #### getUseRole
		
		
		
		```
		public java.lang.String getUseRole()
		```
		
		`optional string useRole = 4;`
		
		Specified by:
		`[getUseRole](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRole())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The useRole.
		- #### getUseRoleBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getUseRoleBytes()
		```
		
		`optional string useRole = 4;`
		
		Specified by:
		`[getUseRoleBytes](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRoleBytes())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for useRole.
		- #### setUseRole
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setUseRole​(java.lang.String value)
		```
		
		`optional string useRole = 4;`
		
		Parameters:
		`value` \- The useRole to set.
		Returns:
		This builder for chaining.
		- #### clearUseRole
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearUseRole()
		```
		
		`optional string useRole = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUseRoleBytes
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setUseRoleBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string useRole = 4;`
		
		Parameters:
		`value` \- The bytes for useRole to set.
		Returns:
		This builder for chaining.
		- #### getUseRolesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getUseRolesList()
		```
		
		`repeated string useRoles = 5;`
		
		Specified by:
		`[getUseRolesList](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRolesList())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the useRoles.
		- #### getUseRolesCount
		
		
		
		```
		public int getUseRolesCount()
		```
		
		`repeated string useRoles = 5;`
		
		Specified by:
		`[getUseRolesCount](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRolesCount())` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of useRoles.
		- #### getUseRoles
		
		
		
		```
		public java.lang.String getUseRoles​(int index)
		```
		
		`repeated string useRoles = 5;`
		
		Specified by:
		`[getUseRoles](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRoles(int))` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The useRoles at the given index.
		- #### getUseRolesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getUseRolesBytes​(int index)
		```
		
		`repeated string useRoles = 5;`
		
		Specified by:
		`[getUseRolesBytes](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html#getUseRolesBytes(int))` in interface `[ClusterMessages.ClusterRouterPoolSettingsOrBuilder](ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the useRoles at the given index.
		- #### setUseRoles
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setUseRoles​(int index,
		                                                                     java.lang.String value)
		```
		
		`repeated string useRoles = 5;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The useRoles to set.
		Returns:
		This builder for chaining.
		- #### addUseRoles
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") addUseRoles​(java.lang.String value)
		```
		
		`repeated string useRoles = 5;`
		
		Parameters:
		`value` \- The useRoles to add.
		Returns:
		This builder for chaining.
		- #### addAllUseRoles
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") addAllUseRoles​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string useRoles = 5;`
		
		Parameters:
		`values` \- The useRoles to add.
		Returns:
		This builder for chaining.
		- #### clearUseRoles
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") clearUseRoles()
		```
		
		`repeated string useRoles = 5;`
		
		Returns:
		This builder for chaining.
		- #### addUseRolesBytes
		
		
		
		```
		public [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") addUseRolesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string useRoles = 5;`
		
		Parameters:
		`value` \- The bytes of the useRoles to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ClusterRouterPoolSettings.Builder](ClusterMessages.ClusterRouterPoolSettings.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettingsOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ClusterRouterPoolSettings.Builder.html)*