---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoin.Builder.html
title: ClusterMessages.InitJoin.Builder
---

# ClusterMessages.InitJoin.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.InitJoin.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.InitJoin.Builder

- All Implemented Interfaces:
`[ClusterMessages.InitJoinOrBuilder](ClusterMessages.InitJoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.InitJoin.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.InitJoinOrBuilder](ClusterMessages.InitJoinOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 InitJoin
 
```

 Protobuf type `InitJoin`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearCurrentConfig](#clearCurrentConfig())()` | `optional string currentConfig = 1;` |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getCurrentConfig](#getCurrentConfig())()` | `optional string currentConfig = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getCurrentConfigBytes](#getCurrentConfigBytes())()` | `optional string currentConfig = 1;` |
	| `[ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[hasCurrentConfig](#hasCurrentConfig())()` | `optional string currentConfig = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.InitJoin))​([ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[setCurrentConfig](#setCurrentConfig(java.lang.String))​(java.lang.String value)` | `optional string currentConfig = 1;` |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[setCurrentConfigBytes](#setCurrentConfigBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string currentConfig = 1;` |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         int index,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.InitJoin](ClusterMessages.InitJoin.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasCurrentConfig
		
		
		
		```
		public boolean hasCurrentConfig()
		```
		
		`optional string currentConfig = 1;`
		
		Specified by:
		`[hasCurrentConfig](ClusterMessages.InitJoinOrBuilder.html#hasCurrentConfig())` in interface `[ClusterMessages.InitJoinOrBuilder](ClusterMessages.InitJoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the currentConfig field is set.
		- #### getCurrentConfig
		
		
		
		```
		public java.lang.String getCurrentConfig()
		```
		
		`optional string currentConfig = 1;`
		
		Specified by:
		`[getCurrentConfig](ClusterMessages.InitJoinOrBuilder.html#getCurrentConfig())` in interface `[ClusterMessages.InitJoinOrBuilder](ClusterMessages.InitJoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The currentConfig.
		- #### getCurrentConfigBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getCurrentConfigBytes()
		```
		
		`optional string currentConfig = 1;`
		
		Specified by:
		`[getCurrentConfigBytes](ClusterMessages.InitJoinOrBuilder.html#getCurrentConfigBytes())` in interface `[ClusterMessages.InitJoinOrBuilder](ClusterMessages.InitJoinOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for currentConfig.
		- #### setCurrentConfig
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") setCurrentConfig​(java.lang.String value)
		```
		
		`optional string currentConfig = 1;`
		
		Parameters:
		`value` \- The currentConfig to set.
		Returns:
		This builder for chaining.
		- #### clearCurrentConfig
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") clearCurrentConfig()
		```
		
		`optional string currentConfig = 1;`
		
		Returns:
		This builder for chaining.
		- #### setCurrentConfigBytes
		
		
		
		```
		public [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") setCurrentConfigBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string currentConfig = 1;`
		
		Parameters:
		`value` \- The bytes for currentConfig to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.InitJoin.Builder](ClusterMessages.InitJoin.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoin.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoin.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoinOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoin.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.InitJoin.Builder.html)*