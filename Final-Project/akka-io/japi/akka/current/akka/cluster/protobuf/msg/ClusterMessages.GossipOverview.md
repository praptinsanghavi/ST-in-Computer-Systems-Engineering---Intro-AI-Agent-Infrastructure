---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.Builder.html
title: ClusterMessages.GossipOverview.Builder
---

# ClusterMessages.GossipOverview.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.GossipOverview.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.GossipOverview.Builder

- All Implemented Interfaces:
`[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.GossipOverview.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Gossip Overview
 
```

 Protobuf type `GossipOverview`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllObserverReachability](#addAllObserverReachability(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllSeen](#addAllSeen(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | This is the address indexes for the nodes that have seen this gossip |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachability](#addObserverReachability(int,akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability))​(int index,  [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachability](#addObserverReachability(int,akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability.Builder))​(int index,  [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachability](#addObserverReachability(akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability))​([ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachability](#addObserverReachability(akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability.Builder))​([ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachabilityBuilder](#addObserverReachabilityBuilder())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[addObserverReachabilityBuilder](#addObserverReachabilityBuilder(int))​(int index)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[addSeen](#addSeen(int))​(int value)` | This is the address indexes for the nodes that have seen this gossip |
	| `[ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearObserverReachability](#clearObserverReachability())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSeen](#clearSeen())()` | This is the address indexes for the nodes that have seen this gossip |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")` | `[getObserverReachability](#getObserverReachability(int))​(int index)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")` | `[getObserverReachabilityBuilder](#getObserverReachabilityBuilder(int))​(int index)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `java.util.List<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getObserverReachabilityBuilderList](#getObserverReachabilityBuilderList())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `int` | `[getObserverReachabilityCount](#getObserverReachabilityCount())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `java.util.List<[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")>` | `[getObserverReachabilityList](#getObserverReachabilityList())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getObserverReachabilityOrBuilder](#getObserverReachabilityOrBuilder(int))​(int index)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `java.util.List<? extends [ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getObserverReachabilityOrBuilderList](#getObserverReachabilityOrBuilderList())()` | `repeated .ObserverReachability observerReachability = 2;` |
	| `int` | `[getSeen](#getSeen(int))​(int index)` | This is the address indexes for the nodes that have seen this gossip |
	| `int` | `[getSeenCount](#getSeenCount())()` | This is the address indexes for the nodes that have seen this gossip |
	| `java.util.List<java.lang.Integer>` | `[getSeenList](#getSeenList())()` | This is the address indexes for the nodes that have seen this gossip |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.GossipOverview))​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeObserverReachability](#removeObserverReachability(int))​(int index)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setObserverReachability](#setObserverReachability(int,akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability))​(int index,  [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setObserverReachability](#setObserverReachability(int,akka.cluster.protobuf.msg.ClusterMessages.ObserverReachability.Builder))​(int index,  [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .ObserverReachability observerReachability = 2;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSeen](#setSeen(int,int))​(int index,  int value)` | This is the address indexes for the nodes that have seen this gossip |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getSeenList
		
		
		
		```
		public java.util.List<java.lang.Integer> getSeenList()
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Specified by:
		`[getSeenList](ClusterMessages.GossipOverviewOrBuilder.html#getSeenList())` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the seen.
		- #### getSeenCount
		
		
		
		```
		public int getSeenCount()
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Specified by:
		`[getSeenCount](ClusterMessages.GossipOverviewOrBuilder.html#getSeenCount())` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of seen.
		- #### getSeen
		
		
		
		```
		public int getSeen​(int index)
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Specified by:
		`[getSeen](ClusterMessages.GossipOverviewOrBuilder.html#getSeen(int))` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The seen at the given index.
		- #### setSeen
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setSeen​(int index,
		                                                      int value)
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The seen to set.
		Returns:
		This builder for chaining.
		- #### addSeen
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addSeen​(int value)
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Parameters:
		`value` \- The seen to add.
		Returns:
		This builder for chaining.
		- #### addAllSeen
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addAllSeen​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Parameters:
		`values` \- The seen to add.
		Returns:
		This builder for chaining.
		- #### clearSeen
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clearSeen()
		```
		
		
		```
		
		 This is the address indexes for the nodes that have seen this gossip 
		 
		```
		
		`repeated int32 seen = 1;`
		
		Returns:
		This builder for chaining.
		- #### getObserverReachabilityList
		
		
		
		```
		public java.util.List<[ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")> getObserverReachabilityList()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		
		Specified by:
		`[getObserverReachabilityList](ClusterMessages.GossipOverviewOrBuilder.html#getObserverReachabilityList())` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getObserverReachabilityCount
		
		
		
		```
		public int getObserverReachabilityCount()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		
		Specified by:
		`[getObserverReachabilityCount](ClusterMessages.GossipOverviewOrBuilder.html#getObserverReachabilityCount())` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getObserverReachability
		
		
		
		```
		public [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") getObserverReachability​(int index)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		
		Specified by:
		`[getObserverReachability](ClusterMessages.GossipOverviewOrBuilder.html#getObserverReachability(int))` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setObserverReachability​(int index,
		                                                                      [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### setObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setObserverReachability​(int index,
		                                                                      [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachability​([ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachability​(int index,
		                                                                      [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachability​([ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachability​(int index,
		                                                                      [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addAllObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") addAllObserverReachability​(java.lang.Iterable<? extends [ClusterMessages.ObserverReachability](ClusterMessages.ObserverReachability.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### clearObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") clearObserverReachability()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### removeObserverReachability
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") removeObserverReachability​(int index)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### getObserverReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") getObserverReachabilityBuilder​(int index)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### getObserverReachabilityOrBuilder
		
		
		
		```
		public [ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg") getObserverReachabilityOrBuilder​(int index)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		
		Specified by:
		`[getObserverReachabilityOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html#getObserverReachabilityOrBuilder(int))` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getObserverReachabilityOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.ObserverReachabilityOrBuilder](ClusterMessages.ObserverReachabilityOrBuilder.html "interface in akka.cluster.protobuf.msg")> getObserverReachabilityOrBuilderList()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		
		Specified by:
		`[getObserverReachabilityOrBuilderList](ClusterMessages.GossipOverviewOrBuilder.html#getObserverReachabilityOrBuilderList())` in interface `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addObserverReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachabilityBuilder()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### addObserverReachabilityBuilder
		
		
		
		```
		public [ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg") addObserverReachabilityBuilder​(int index)
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### getObserverReachabilityBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.ObserverReachability.Builder](ClusterMessages.ObserverReachability.Builder.html "class in akka.cluster.protobuf.msg")> getObserverReachabilityBuilderList()
		```
		
		`repeated .ObserverReachability observerReachability = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverviewOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachability.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ObserverReachabilityOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.Builder.html)*