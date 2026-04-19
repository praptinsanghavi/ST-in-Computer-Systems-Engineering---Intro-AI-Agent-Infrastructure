---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Builder.html
title: ClusterMessages.ConfigCheck.Builder
---

# ClusterMessages.ConfigCheck.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.ConfigCheck.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Builder

- All Implemented Interfaces:
`[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.ConfigCheck.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `ConfigCheck`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearClusterConfig](#clearClusterConfig())()` | `optional string clusterConfig = 2;` |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearType](#clearType())()` | `required .ConfigCheck.Type type = 1;` |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getClusterConfig](#getClusterConfig())()` | `optional string clusterConfig = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getClusterConfigBytes](#getClusterConfigBytes())()` | `optional string clusterConfig = 2;` |
	| `[ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")` | `[getType](#getType())()` | `required .ConfigCheck.Type type = 1;` |
	| `boolean` | `[hasClusterConfig](#hasClusterConfig())()` | `optional string clusterConfig = 2;` |
	| `boolean` | `[hasType](#hasType())()` | `required .ConfigCheck.Type type = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck))​([ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setClusterConfig](#setClusterConfig(java.lang.String))​(java.lang.String value)` | `optional string clusterConfig = 2;` |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setClusterConfigBytes](#setClusterConfigBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string clusterConfig = 2;` |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setType](#setType(akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Type))​([ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") value)` | `required .ConfigCheck.Type type = 1;` |
	| `[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasType
		
		
		
		```
		public boolean hasType()
		```
		
		`required .ConfigCheck.Type type = 1;`
		
		Specified by:
		`[hasType](ClusterMessages.ConfigCheckOrBuilder.html#hasType())` in interface `[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the type field is set.
		- #### getType
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") getType()
		```
		
		`required .ConfigCheck.Type type = 1;`
		
		Specified by:
		`[getType](ClusterMessages.ConfigCheckOrBuilder.html#getType())` in interface `[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The type.
		- #### setType
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setType​([ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") value)
		```
		
		`required .ConfigCheck.Type type = 1;`
		
		Parameters:
		`value` \- The type to set.
		Returns:
		This builder for chaining.
		- #### clearType
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clearType()
		```
		
		`required .ConfigCheck.Type type = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasClusterConfig
		
		
		
		```
		public boolean hasClusterConfig()
		```
		
		`optional string clusterConfig = 2;`
		
		Specified by:
		`[hasClusterConfig](ClusterMessages.ConfigCheckOrBuilder.html#hasClusterConfig())` in interface `[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the clusterConfig field is set.
		- #### getClusterConfig
		
		
		
		```
		public java.lang.String getClusterConfig()
		```
		
		`optional string clusterConfig = 2;`
		
		Specified by:
		`[getClusterConfig](ClusterMessages.ConfigCheckOrBuilder.html#getClusterConfig())` in interface `[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The clusterConfig.
		- #### getClusterConfigBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getClusterConfigBytes()
		```
		
		`optional string clusterConfig = 2;`
		
		Specified by:
		`[getClusterConfigBytes](ClusterMessages.ConfigCheckOrBuilder.html#getClusterConfigBytes())` in interface `[ClusterMessages.ConfigCheckOrBuilder](ClusterMessages.ConfigCheckOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for clusterConfig.
		- #### setClusterConfig
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setClusterConfig​(java.lang.String value)
		```
		
		`optional string clusterConfig = 2;`
		
		Parameters:
		`value` \- The clusterConfig to set.
		Returns:
		This builder for chaining.
		- #### clearClusterConfig
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") clearClusterConfig()
		```
		
		`optional string clusterConfig = 2;`
		
		Returns:
		This builder for chaining.
		- #### setClusterConfigBytes
		
		
		
		```
		public [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setClusterConfigBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string clusterConfig = 2;`
		
		Parameters:
		`value` \- The bytes for clusterConfig to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ConfigCheck.Builder](ClusterMessages.ConfigCheck.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Type.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheckOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Builder.html)*