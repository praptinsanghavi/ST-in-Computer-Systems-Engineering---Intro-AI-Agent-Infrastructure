---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Pool.Builder.html
title: ClusterMessages.Pool.Builder
---

# ClusterMessages.Pool.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Pool.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Pool.Builder

- All Implemented Interfaces:
`[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Pool.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

Protobuf type `Pool`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearData](#clearData())()` | `required bytes data = 3;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearManifest](#clearManifest())()` | `required string manifest = 2;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSerializerId](#clearSerializerId())()` | `required uint32 serializerId = 1;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getData](#getData())()` | `required bytes data = 3;` |
	| `[ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getManifest](#getManifest())()` | `required string manifest = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getManifestBytes](#getManifestBytes())()` | `required string manifest = 2;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required uint32 serializerId = 1;` |
	| `boolean` | `[hasData](#hasData())()` | `required bytes data = 3;` |
	| `boolean` | `[hasManifest](#hasManifest())()` | `required string manifest = 2;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required uint32 serializerId = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Pool))​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setData](#setData(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes data = 3;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setManifest](#setManifest(java.lang.String))​(java.lang.String value)` | `required string manifest = 2;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setManifestBytes](#setManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string manifest = 2;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required uint32 serializerId = 1;` |
	| `[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     int index,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Pool](ClusterMessages.Pool.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Specified by:
		`[hasSerializerId](ClusterMessages.PoolOrBuilder.html#hasSerializerId())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Specified by:
		`[getSerializerId](ClusterMessages.PoolOrBuilder.html#getSerializerId())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setSerializerId​(int value)
		```
		
		`required uint32 serializerId = 1;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clearSerializerId()
		```
		
		`required uint32 serializerId = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasManifest
		
		
		
		```
		public boolean hasManifest()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[hasManifest](ClusterMessages.PoolOrBuilder.html#hasManifest())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the manifest field is set.
		- #### getManifest
		
		
		
		```
		public java.lang.String getManifest()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[getManifest](ClusterMessages.PoolOrBuilder.html#getManifest())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The manifest.
		- #### getManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getManifestBytes()
		```
		
		`required string manifest = 2;`
		
		Specified by:
		`[getManifestBytes](ClusterMessages.PoolOrBuilder.html#getManifestBytes())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The bytes for manifest.
		- #### setManifest
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setManifest​(java.lang.String value)
		```
		
		`required string manifest = 2;`
		
		Parameters:
		`value` \- The manifest to set.
		Returns:
		This builder for chaining.
		- #### clearManifest
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clearManifest()
		```
		
		`required string manifest = 2;`
		
		Returns:
		This builder for chaining.
		- #### setManifestBytes
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string manifest = 2;`
		
		Parameters:
		`value` \- The bytes for manifest to set.
		Returns:
		This builder for chaining.
		- #### hasData
		
		
		
		```
		public boolean hasData()
		```
		
		`required bytes data = 3;`
		
		Specified by:
		`[hasData](ClusterMessages.PoolOrBuilder.html#hasData())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the data field is set.
		- #### getData
		
		
		
		```
		public akka.protobufv3.internal.ByteString getData()
		```
		
		`required bytes data = 3;`
		
		Specified by:
		`[getData](ClusterMessages.PoolOrBuilder.html#getData())` in interface `[ClusterMessages.PoolOrBuilder](ClusterMessages.PoolOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The data.
		- #### setData
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setData​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes data = 3;`
		
		Parameters:
		`value` \- The data to set.
		Returns:
		This builder for chaining.
		- #### clearData
		
		
		
		```
		public [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") clearData()
		```
		
		`required bytes data = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Pool.Builder](ClusterMessages.Pool.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Pool.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Pool.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.PoolOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Pool.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Pool.Builder.html)*