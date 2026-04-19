---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Join.Builder.html
title: ClusterMessages.Join.Builder
---

# ClusterMessages.Join.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Join.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Join.Builder

- All Implemented Interfaces:
`[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Join.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Join
 
```

 Protobuf type `Join`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllRoles](#addAllRoles(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string roles = 2;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRoles](#addRoles(java.lang.String))​(java.lang.String value)` | `repeated string roles = 2;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRolesBytes](#addRolesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string roles = 2;` |
	| `[ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAppVersion](#clearAppVersion())()` | `optional string appVersion = 3;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearNode](#clearNode())()` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearRoles](#clearRoles())()` | `repeated string roles = 2;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getAppVersion](#getAppVersion())()` | `optional string appVersion = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getAppVersionBytes](#getAppVersionBytes())()` | `optional string appVersion = 3;` |
	| `[ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getNode](#getNode())()` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getNodeBuilder](#getNodeBuilder())()` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .UniqueAddress node = 1;` |
	| `java.lang.String` | `[getRoles](#getRoles(int))​(int index)` | `repeated string roles = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getRolesBytes](#getRolesBytes(int))​(int index)` | `repeated string roles = 2;` |
	| `int` | `[getRolesCount](#getRolesCount())()` | `repeated string roles = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getRolesList](#getRolesList())()` | `repeated string roles = 2;` |
	| `boolean` | `[hasAppVersion](#hasAppVersion())()` | `optional string appVersion = 3;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .UniqueAddress node = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Join))​([ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeNode](#mergeNode(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAppVersion](#setAppVersion(java.lang.String))​(java.lang.String value)` | `optional string appVersion = 3;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAppVersionBytes](#setAppVersionBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string appVersion = 3;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setNode](#setNode(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setNode](#setNode(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .UniqueAddress node = 1;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRoles](#setRoles(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string roles = 2;` |
	| `[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     int index,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Join](ClusterMessages.Join.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required .UniqueAddress node = 1;`
		
		Specified by:
		`[hasNode](ClusterMessages.JoinOrBuilder.html#hasNode())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getNode()
		```
		
		`required .UniqueAddress node = 1;`
		
		Specified by:
		`[getNode](ClusterMessages.JoinOrBuilder.html#getNode())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The node.
		- #### setNode
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setNode​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress node = 1;`
		- #### setNode
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setNode​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .UniqueAddress node = 1;`
		- #### mergeNode
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") mergeNode​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress node = 1;`
		- #### clearNode
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clearNode()
		```
		
		`required .UniqueAddress node = 1;`
		- #### getNodeBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") getNodeBuilder()
		```
		
		`required .UniqueAddress node = 1;`
		- #### getNodeOrBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getNodeOrBuilder()
		```
		
		`required .UniqueAddress node = 1;`
		
		Specified by:
		`[getNodeOrBuilder](ClusterMessages.JoinOrBuilder.html#getNodeOrBuilder())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getRolesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getRolesList()
		```
		
		`repeated string roles = 2;`
		
		Specified by:
		`[getRolesList](ClusterMessages.JoinOrBuilder.html#getRolesList())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the roles.
		- #### getRolesCount
		
		
		
		```
		public int getRolesCount()
		```
		
		`repeated string roles = 2;`
		
		Specified by:
		`[getRolesCount](ClusterMessages.JoinOrBuilder.html#getRolesCount())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of roles.
		- #### getRoles
		
		
		
		```
		public java.lang.String getRoles​(int index)
		```
		
		`repeated string roles = 2;`
		
		Specified by:
		`[getRoles](ClusterMessages.JoinOrBuilder.html#getRoles(int))` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The roles at the given index.
		- #### getRolesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRolesBytes​(int index)
		```
		
		`repeated string roles = 2;`
		
		Specified by:
		`[getRolesBytes](ClusterMessages.JoinOrBuilder.html#getRolesBytes(int))` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the roles at the given index.
		- #### setRoles
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setRoles​(int index,
		                                             java.lang.String value)
		```
		
		`repeated string roles = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The roles to set.
		Returns:
		This builder for chaining.
		- #### addRoles
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") addRoles​(java.lang.String value)
		```
		
		`repeated string roles = 2;`
		
		Parameters:
		`value` \- The roles to add.
		Returns:
		This builder for chaining.
		- #### addAllRoles
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") addAllRoles​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string roles = 2;`
		
		Parameters:
		`values` \- The roles to add.
		Returns:
		This builder for chaining.
		- #### clearRoles
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clearRoles()
		```
		
		`repeated string roles = 2;`
		
		Returns:
		This builder for chaining.
		- #### addRolesBytes
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") addRolesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string roles = 2;`
		
		Parameters:
		`value` \- The bytes of the roles to add.
		Returns:
		This builder for chaining.
		- #### hasAppVersion
		
		
		
		```
		public boolean hasAppVersion()
		```
		
		`optional string appVersion = 3;`
		
		Specified by:
		`[hasAppVersion](ClusterMessages.JoinOrBuilder.html#hasAppVersion())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the appVersion field is set.
		- #### getAppVersion
		
		
		
		```
		public java.lang.String getAppVersion()
		```
		
		`optional string appVersion = 3;`
		
		Specified by:
		`[getAppVersion](ClusterMessages.JoinOrBuilder.html#getAppVersion())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The appVersion.
		- #### getAppVersionBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAppVersionBytes()
		```
		
		`optional string appVersion = 3;`
		
		Specified by:
		`[getAppVersionBytes](ClusterMessages.JoinOrBuilder.html#getAppVersionBytes())` in interface `[ClusterMessages.JoinOrBuilder](ClusterMessages.JoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for appVersion.
		- #### setAppVersion
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setAppVersion​(java.lang.String value)
		```
		
		`optional string appVersion = 3;`
		
		Parameters:
		`value` \- The appVersion to set.
		Returns:
		This builder for chaining.
		- #### clearAppVersion
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") clearAppVersion()
		```
		
		`optional string appVersion = 3;`
		
		Returns:
		This builder for chaining.
		- #### setAppVersionBytes
		
		
		
		```
		public [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setAppVersionBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string appVersion = 3;`
		
		Parameters:
		`value` \- The bytes for appVersion to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Join.Builder](ClusterMessages.Join.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Join.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Join.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.JoinOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Join.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Join.Builder.html)*