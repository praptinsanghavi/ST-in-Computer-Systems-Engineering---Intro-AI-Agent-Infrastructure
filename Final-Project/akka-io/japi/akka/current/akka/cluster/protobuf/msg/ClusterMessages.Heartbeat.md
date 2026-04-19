---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.Builder.html
title: ClusterMessages.Heartbeat.Builder
---

# ClusterMessages.Heartbeat.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Heartbeat.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Heartbeat.Builder

- All Implemented Interfaces:
`[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Heartbeat.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Prior to version 2.5.24
 Heartbeat sends an Address
 Version 2.5.24 can deserialize this message but does not send it.
 
```

 Protobuf type `Heartbeat`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearCreationTime](#clearCreationTime())()` | `optional sint64 creationTime = 3;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearFrom](#clearFrom())()` | `required .Address from = 1;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearSequenceNr](#clearSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `long` | `[getCreationTime](#getCreationTime())()` | `optional sint64 creationTime = 3;` |
	| `[ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg")` | `[getFrom](#getFrom())()` | `required .Address from = 1;` |
	| `[ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg")` | `[getFromBuilder](#getFromBuilder())()` | `required .Address from = 1;` |
	| `[ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getFromOrBuilder](#getFromOrBuilder())()` | `required .Address from = 1;` |
	| `long` | `[getSequenceNr](#getSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `boolean` | `[hasCreationTime](#hasCreationTime())()` | `optional sint64 creationTime = 3;` |
	| `boolean` | `[hasFrom](#hasFrom())()` | `required .Address from = 1;` |
	| `boolean` | `[hasSequenceNr](#hasSequenceNr())()` | `optional int64 sequenceNr = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Address))​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)` | `required .Address from = 1;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Heartbeat))​([ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setCreationTime](#setCreationTime(long))​(long value)` | `optional sint64 creationTime = 3;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.Address))​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)` | `required .Address from = 1;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setFrom](#setFrom(akka.cluster.protobuf.msg.ClusterMessages.Address.Builder))​([ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .Address from = 1;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setSequenceNr](#setSequenceNr(long))​(long value)` | `optional int64 sequenceNr = 2;` |
	| `[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Heartbeat](ClusterMessages.Heartbeat.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasFrom
		
		
		
		```
		public boolean hasFrom()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[hasFrom](ClusterMessages.HeartbeatOrBuilder.html#hasFrom())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the from field is set.
		- #### getFrom
		
		
		
		```
		public [ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") getFrom()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[getFrom](ClusterMessages.HeartbeatOrBuilder.html#getFrom())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The from.
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Address from = 1;`
		- #### setFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setFrom​([ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .Address from = 1;`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Address](ClusterMessages.Address.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .Address from = 1;`
		- #### clearFrom
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clearFrom()
		```
		
		`required .Address from = 1;`
		- #### getFromBuilder
		
		
		
		```
		public [ClusterMessages.Address.Builder](ClusterMessages.Address.Builder.html "class in akka.cluster.protobuf.msg") getFromBuilder()
		```
		
		`required .Address from = 1;`
		- #### getFromOrBuilder
		
		
		
		```
		public [ClusterMessages.AddressOrBuilder](ClusterMessages.AddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getFromOrBuilder()
		```
		
		`required .Address from = 1;`
		
		Specified by:
		`[getFromOrBuilder](ClusterMessages.HeartbeatOrBuilder.html#getFromOrBuilder())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasSequenceNr
		
		
		
		```
		public boolean hasSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[hasSequenceNr](ClusterMessages.HeartbeatOrBuilder.html#hasSequenceNr())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the sequenceNr field is set.
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Specified by:
		`[getSequenceNr](ClusterMessages.HeartbeatOrBuilder.html#getSequenceNr())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The sequenceNr.
		- #### setSequenceNr
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setSequenceNr​(long value)
		```
		
		`optional int64 sequenceNr = 2;`
		
		Parameters:
		`value` \- The sequenceNr to set.
		Returns:
		This builder for chaining.
		- #### clearSequenceNr
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clearSequenceNr()
		```
		
		`optional int64 sequenceNr = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasCreationTime
		
		
		
		```
		public boolean hasCreationTime()
		```
		
		`optional sint64 creationTime = 3;`
		
		Specified by:
		`[hasCreationTime](ClusterMessages.HeartbeatOrBuilder.html#hasCreationTime())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the creationTime field is set.
		- #### getCreationTime
		
		
		
		```
		public long getCreationTime()
		```
		
		`optional sint64 creationTime = 3;`
		
		Specified by:
		`[getCreationTime](ClusterMessages.HeartbeatOrBuilder.html#getCreationTime())` in interface `[ClusterMessages.HeartbeatOrBuilder](ClusterMessages.HeartbeatOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The creationTime.
		- #### setCreationTime
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setCreationTime​(long value)
		```
		
		`optional sint64 creationTime = 3;`
		
		Parameters:
		`value` \- The creationTime to set.
		Returns:
		This builder for chaining.
		- #### clearCreationTime
		
		
		
		```
		public [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") clearCreationTime()
		```
		
		`optional sint64 creationTime = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Heartbeat.Builder](ClusterMessages.Heartbeat.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.HeartbeatOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.Heartbeat.Builder.html)*