---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.Builder.html
title: ReplicatedDataMessages.GCounter.Entry.Builder
---

# ReplicatedDataMessages.GCounter.Entry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.GCounter.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.GCounter.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.GCounter.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearNode](#clearNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearValue](#clearValue())()` | `required bytes value = 2;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNode](#getNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNodeBuilder](#getNodeBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getValue](#getValue())()` | `required bytes value = 2;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required bytes value = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter.Entry))​([ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeNode](#mergeNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setValue](#setValue(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes value = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      int index,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.GCounter.Entry](ReplicatedDataMessages.GCounter.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Specified by:
		`[hasNode](ReplicatedDataMessages.GCounter.EntryOrBuilder.html#hasNode())` in interface `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Specified by:
		`[getNode](ReplicatedDataMessages.GCounter.EntryOrBuilder.html#getNode())` in interface `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The node.
		- #### setNode
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### setNode
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### mergeNode
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### clearNode
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearNode()
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
		`[getNodeOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html#getNodeOrBuilder())` in interface `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`required bytes value = 2;`
		
		Specified by:
		`[hasValue](ReplicatedDataMessages.GCounter.EntryOrBuilder.html#hasValue())` in interface `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public akka.protobufv3.internal.ByteString getValue()
		```
		
		`required bytes value = 2;`
		
		Specified by:
		`[getValue](ReplicatedDataMessages.GCounter.EntryOrBuilder.html#getValue())` in interface `[ReplicatedDataMessages.GCounter.EntryOrBuilder](ReplicatedDataMessages.GCounter.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setValue​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes value = 2;`
		
		Parameters:
		`value` \- The value to set.
		Returns:
		This builder for chaining.
		- #### clearValue
		
		
		
		```
		public [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearValue()
		```
		
		`required bytes value = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.GCounter.Entry.Builder](ReplicatedDataMessages.GCounter.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.GCounter.Entry.Builder.html)*