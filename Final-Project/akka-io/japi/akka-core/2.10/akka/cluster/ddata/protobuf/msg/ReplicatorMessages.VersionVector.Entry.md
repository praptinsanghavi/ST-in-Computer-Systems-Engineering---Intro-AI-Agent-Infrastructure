---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.Builder.html
title: ReplicatorMessages.VersionVector.Entry.Builder
---

# ReplicatorMessages.VersionVector.Entry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.VersionVector.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Entry.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.VersionVector.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.VersionVector.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearNode](#clearNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required int64 version = 2;` |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNode](#getNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNodeBuilder](#getNodeBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector.Entry))​([ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeNode](#mergeNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setVersion](#setVersion(long))​(long value)` | `required int64 version = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Specified by:
		`[hasNode](ReplicatorMessages.VersionVector.EntryOrBuilder.html#hasNode())` in interface `[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Specified by:
		`[getNode](ReplicatorMessages.VersionVector.EntryOrBuilder.html#getNode())` in interface `[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The node.
		- #### setNode
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### setNode
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### mergeNode
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### clearNode
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### getNodeBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") getNodeBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### getNodeOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getNodeOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Specified by:
		`[getNodeOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html#getNodeOrBuilder())` in interface `[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[hasVersion](ReplicatorMessages.VersionVector.EntryOrBuilder.html#hasVersion())` in interface `[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public long getVersion()
		```
		
		`required int64 version = 2;`
		
		Specified by:
		`[getVersion](ReplicatorMessages.VersionVector.EntryOrBuilder.html#getVersion())` in interface `[ReplicatorMessages.VersionVector.EntryOrBuilder](ReplicatorMessages.VersionVector.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setVersion​(long value)
		```
		
		`required int64 version = 2;`
		
		Parameters:
		`value` \- The version to set.
		Returns:
		This builder for chaining.
		- #### clearVersion
		
		
		
		```
		public [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.EntryOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.Builder.html)*