---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.Builder.html
title: ClusterMessages.GossipEnvelope.Builder
---

# ClusterMessages.GossipEnvelope.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.GossipEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.GossipEnvelope.Builder

- All Implemented Interfaces:
`[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.GossipEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Gossip Envelope
 
```

 Protobuf type `GossipEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSerializedGossip](#clearSerializedGossip())()` | `required bytes serializedGossip = 3;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTo](#clearTo())()` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getSerializedGossip](#getSerializedGossip())()` | `required bytes serializedGossip = 3;` |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getTo](#getTo())()` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getToBuilder](#getToBuilder())()` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getToOrBuilder](#getToOrBuilder())()` | `required .UniqueAddress to = 2;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasSerializedGossip](#hasSerializedGossip())()` | `required bytes serializedGossip = 3;` |
	| `boolean` | `[hasTo](#hasTo())()` | `required .UniqueAddress to = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.GossipEnvelope))​([ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeTo](#mergeTo(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSerializedGossip](#setSerializedGossip(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes serializedGossip = 3;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTo](#setTo(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTo](#setTo(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .UniqueAddress to = 2;` |
	| `[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.GossipEnvelope](ClusterMessages.GossipEnvelope.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ClusterMessages.GossipEnvelopeOrBuilder.html#hasFrom())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ClusterMessages.GossipEnvelopeOrBuilder.html#getFrom())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clearFrom()
		```
		
		`required .UniqueAddress from = 1;`
		- #### getFromBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") getFromBuilder()
		```
		
		`required .UniqueAddress from = 1;`
		- #### getFromOrBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getFromOrBuilder()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFromOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html#getFromOrBuilder())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasTo
		
		
		
		```
		public boolean hasTo()
		```
		
		`required .UniqueAddress to = 2;`
		
		Specified by:
		`[hasTo](ClusterMessages.GossipEnvelopeOrBuilder.html#hasTo())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the to field is set.
		- #### getTo
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getTo()
		```
		
		`required .UniqueAddress to = 2;`
		
		Specified by:
		`[getTo](ClusterMessages.GossipEnvelopeOrBuilder.html#getTo())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The to.
		- #### setTo
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setTo​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress to = 2;`
		- #### setTo
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setTo​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .UniqueAddress to = 2;`
		- #### mergeTo
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeTo​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress to = 2;`
		- #### clearTo
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clearTo()
		```
		
		`required .UniqueAddress to = 2;`
		- #### getToBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") getToBuilder()
		```
		
		`required .UniqueAddress to = 2;`
		- #### getToOrBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getToOrBuilder()
		```
		
		`required .UniqueAddress to = 2;`
		
		Specified by:
		`[getToOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html#getToOrBuilder())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasSerializedGossip
		
		
		
		```
		public boolean hasSerializedGossip()
		```
		
		`required bytes serializedGossip = 3;`
		
		Specified by:
		`[hasSerializedGossip](ClusterMessages.GossipEnvelopeOrBuilder.html#hasSerializedGossip())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the serializedGossip field is set.
		- #### getSerializedGossip
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSerializedGossip()
		```
		
		`required bytes serializedGossip = 3;`
		
		Specified by:
		`[getSerializedGossip](ClusterMessages.GossipEnvelopeOrBuilder.html#getSerializedGossip())` in interface `[ClusterMessages.GossipEnvelopeOrBuilder](ClusterMessages.GossipEnvelopeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The serializedGossip.
		- #### setSerializedGossip
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setSerializedGossip​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes serializedGossip = 3;`
		
		Parameters:
		`value` \- The serializedGossip to set.
		Returns:
		This builder for chaining.
		- #### clearSerializedGossip
		
		
		
		```
		public [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") clearSerializedGossip()
		```
		
		`required bytes serializedGossip = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipEnvelope.Builder](ClusterMessages.GossipEnvelope.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipEnvelope.Builder.html)*