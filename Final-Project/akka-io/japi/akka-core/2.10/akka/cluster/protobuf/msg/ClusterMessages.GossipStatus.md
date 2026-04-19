---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.Builder.html
title: ClusterMessages.GossipStatus.Builder
---

# ClusterMessages.GossipStatus.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.GossipStatus.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.GossipStatus.Builder

- All Implemented Interfaces:
`[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.GossipStatus.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Gossip Status
 
```

 Protobuf type `GossipStatus`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAllHashes](#addAllAllHashes(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllHashes](#addAllHashes(java.lang.String))​(java.lang.String value)` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllHashesBytes](#addAllHashesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllHashes](#clearAllHashes())()` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearFrom](#clearFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSeenDigest](#clearSeenDigest())()` | `optional bytes seenDigest = 4;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required .VectorClock version = 3;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getAllHashes](#getAllHashes(int))​(int index)` | `repeated string allHashes = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getAllHashesBytes](#getAllHashesBytes(int))​(int index)` | `repeated string allHashes = 2;` |
	| `int` | `[getAllHashesCount](#getAllHashesCount())()` | `repeated string allHashes = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getAllHashesList](#getAllHashesList())()` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getFrom](#getFrom())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getFromBuilder](#getFromBuilder())()` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .UniqueAddress from = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getSeenDigest](#getSeenDigest())()` | `optional bytes seenDigest = 4;` |
	| `[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")` | `[getVersion](#getVersion())()` | `required .VectorClock version = 3;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[getVersionBuilder](#getVersionBuilder())()` | `required .VectorClock version = 3;` |
	| `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getVersionOrBuilder](#getVersionOrBuilder())()` | `required .VectorClock version = 3;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .UniqueAddress from = 1;` |
	| `boolean` | `[hasSeenDigest](#hasSeenDigest())()` | `optional bytes seenDigest = 4;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required .VectorClock version = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.GossipStatus))​([ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeVersion](#mergeVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock))​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)` | `required .VectorClock version = 3;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllHashes](#setAllHashes(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string allHashes = 2;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .UniqueAddress from = 1;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSeenDigest](#setSeenDigest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes seenDigest = 4;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock))​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)` | `required .VectorClock version = 3;` |
	| `[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Builder))​([ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .VectorClock version = 3;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             int index,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.GossipStatus](ClusterMessages.GossipStatus.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[hasFrom](ClusterMessages.GossipStatusOrBuilder.html#hasFrom())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getFrom()
		```
		
		`required .UniqueAddress from = 1;`
		
		Specified by:
		`[getFrom](ClusterMessages.GossipStatusOrBuilder.html#getFrom())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .UniqueAddress from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .UniqueAddress from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearFrom()
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
		`[getFromOrBuilder](ClusterMessages.GossipStatusOrBuilder.html#getFromOrBuilder())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getAllHashesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getAllHashesList()
		```
		
		`repeated string allHashes = 2;`
		
		Specified by:
		`[getAllHashesList](ClusterMessages.GossipStatusOrBuilder.html#getAllHashesList())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the allHashes.
		- #### getAllHashesCount
		
		
		
		```
		public int getAllHashesCount()
		```
		
		`repeated string allHashes = 2;`
		
		Specified by:
		`[getAllHashesCount](ClusterMessages.GossipStatusOrBuilder.html#getAllHashesCount())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of allHashes.
		- #### getAllHashes
		
		
		
		```
		public java.lang.String getAllHashes​(int index)
		```
		
		`repeated string allHashes = 2;`
		
		Specified by:
		`[getAllHashes](ClusterMessages.GossipStatusOrBuilder.html#getAllHashes(int))` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The allHashes at the given index.
		- #### getAllHashesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAllHashesBytes​(int index)
		```
		
		`repeated string allHashes = 2;`
		
		Specified by:
		`[getAllHashesBytes](ClusterMessages.GossipStatusOrBuilder.html#getAllHashesBytes(int))` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the allHashes at the given index.
		- #### setAllHashes
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setAllHashes​(int index,
		                                                         java.lang.String value)
		```
		
		`repeated string allHashes = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The allHashes to set.
		Returns:
		This builder for chaining.
		- #### addAllHashes
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") addAllHashes​(java.lang.String value)
		```
		
		`repeated string allHashes = 2;`
		
		Parameters:
		`value` \- The allHashes to add.
		Returns:
		This builder for chaining.
		- #### addAllAllHashes
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") addAllAllHashes​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string allHashes = 2;`
		
		Parameters:
		`values` \- The allHashes to add.
		Returns:
		This builder for chaining.
		- #### clearAllHashes
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearAllHashes()
		```
		
		`repeated string allHashes = 2;`
		
		Returns:
		This builder for chaining.
		- #### addAllHashesBytes
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") addAllHashesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string allHashes = 2;`
		
		Parameters:
		`value` \- The bytes of the allHashes to add.
		Returns:
		This builder for chaining.
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required .VectorClock version = 3;`
		
		Specified by:
		`[hasVersion](ClusterMessages.GossipStatusOrBuilder.html#hasVersion())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public [ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") getVersion()
		```
		
		`required .VectorClock version = 3;`
		
		Specified by:
		`[getVersion](ClusterMessages.GossipStatusOrBuilder.html#getVersion())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setVersion​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .VectorClock version = 3;`
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setVersion​([ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .VectorClock version = 3;`
		- #### mergeVersion
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeVersion​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .VectorClock version = 3;`
		- #### clearVersion
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearVersion()
		```
		
		`required .VectorClock version = 3;`
		- #### getVersionBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") getVersionBuilder()
		```
		
		`required .VectorClock version = 3;`
		- #### getVersionOrBuilder
		
		
		
		```
		public [ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg") getVersionOrBuilder()
		```
		
		`required .VectorClock version = 3;`
		
		Specified by:
		`[getVersionOrBuilder](ClusterMessages.GossipStatusOrBuilder.html#getVersionOrBuilder())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasSeenDigest
		
		
		
		```
		public boolean hasSeenDigest()
		```
		
		`optional bytes seenDigest = 4;`
		
		Specified by:
		`[hasSeenDigest](ClusterMessages.GossipStatusOrBuilder.html#hasSeenDigest())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the seenDigest field is set.
		- #### getSeenDigest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getSeenDigest()
		```
		
		`optional bytes seenDigest = 4;`
		
		Specified by:
		`[getSeenDigest](ClusterMessages.GossipStatusOrBuilder.html#getSeenDigest())` in interface `[ClusterMessages.GossipStatusOrBuilder](ClusterMessages.GossipStatusOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The seenDigest.
		- #### setSeenDigest
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setSeenDigest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes seenDigest = 4;`
		
		Parameters:
		`value` \- The seenDigest to set.
		Returns:
		This builder for chaining.
		- #### clearSeenDigest
		
		
		
		```
		public [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") clearSeenDigest()
		```
		
		`optional bytes seenDigest = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.GossipStatus.Builder](ClusterMessages.GossipStatus.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatusOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClockOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipStatus.Builder.html)*