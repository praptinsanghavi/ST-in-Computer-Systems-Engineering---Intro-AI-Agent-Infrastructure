---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Welcome.Builder.html
title: ClusterMessages.Welcome.Builder
---

# ClusterMessages.Welcome.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Welcome.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Welcome.Builder

- All Implemented Interfaces:
`[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Welcome.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Welcome, reply to Join
 
```

 Protobuf type `Welcome`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearGossip](#clearGossip())()` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg")` | `[getGossip](#getGossip())()` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[getGossipBuilder](#getGossipBuilder())()` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getGossipOrBuilder](#getGossipOrBuilder())()` | `required .Gossip gossip = 2;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasGossip](#hasGossip())()` | `required .Gossip gossip = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Welcome))​([ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeGossip](#mergeGossip(akka.cluster.protobuf.msg.ClusterMessages.Gossip))​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") value)` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setGossip](#setGossip(akka.cluster.protobuf.msg.ClusterMessages.Gossip))​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") value)` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setGossip](#setGossip(akka.cluster.protobuf.msg.ClusterMessages.Gossip.Builder))​([ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .Gossip gossip = 2;` |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        int index,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Welcome](ClusterMessages.Welcome.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ClusterMessages.WelcomeOrBuilder.html#hasFrom())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ClusterMessages.WelcomeOrBuilder.html#getFrom())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clearFrom()
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
		`[getFromOrBuilder](ClusterMessages.WelcomeOrBuilder.html#getFromOrBuilder())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasGossip
		
		
		
		```
		public boolean hasGossip()
		```
		
		`required .Gossip gossip = 2;`
		
		Specified by:
		`[hasGossip](ClusterMessages.WelcomeOrBuilder.html#hasGossip())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the gossip field is set.
		- #### getGossip
		
		
		
		```
		public [ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") getGossip()
		```
		
		`required .Gossip gossip = 2;`
		
		Specified by:
		`[getGossip](ClusterMessages.WelcomeOrBuilder.html#getGossip())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The gossip.
		- #### setGossip
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setGossip​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Gossip gossip = 2;`
		- #### setGossip
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setGossip​([ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .Gossip gossip = 2;`
		- #### mergeGossip
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeGossip​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Gossip gossip = 2;`
		- #### clearGossip
		
		
		
		```
		public [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") clearGossip()
		```
		
		`required .Gossip gossip = 2;`
		- #### getGossipBuilder
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") getGossipBuilder()
		```
		
		`required .Gossip gossip = 2;`
		- #### getGossipOrBuilder
		
		
		
		```
		public [ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg") getGossipOrBuilder()
		```
		
		`required .Gossip gossip = 2;`
		
		Specified by:
		`[getGossipOrBuilder](ClusterMessages.WelcomeOrBuilder.html#getGossipOrBuilder())` in interface `[ClusterMessages.WelcomeOrBuilder](ClusterMessages.WelcomeOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Welcome.Builder](ClusterMessages.Welcome.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Welcome.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Welcome.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.WelcomeOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Welcome.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Welcome.Builder.html)*