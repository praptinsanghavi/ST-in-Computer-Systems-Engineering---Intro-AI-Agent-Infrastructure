---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.Builder.html
title: DistributedPubSubMessages.SendToAll.Builder
---

# DistributedPubSubMessages.SendToAll.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.SendToAll.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToAll.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.SendToAll.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

```

 SendToAll normally local.
 
```

 Protobuf type `SendToAll`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearAllButSelf](#clearAllButSelf())()` | `required bool allButSelf = 2;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPath](#clearPath())()` | `required string path = 1;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPayload](#clearPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `boolean` | `[getAllButSelf](#getAllButSelf())()` | `required bool allButSelf = 2;` |
	| `[DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 1;` |
	| `[DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayload](#getPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .Payload payload = 3;` |
	| `boolean` | `[hasAllButSelf](#hasAllButSelf())()` | `required bool allButSelf = 2;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 1;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .Payload payload = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.SendToAll))​([DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergePayload](#mergePayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setAllButSelf](#setAllButSelf(boolean))​(boolean value)` | `required bool allButSelf = 2;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 1;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 1;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload.Builder))​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    int index,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.SendToAll](DistributedPubSubMessages.SendToAll.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                             akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                      throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[hasPath](DistributedPubSubMessages.SendToAllOrBuilder.html#hasPath())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPath](DistributedPubSubMessages.SendToAllOrBuilder.html#getPath())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPathBytes](DistributedPubSubMessages.SendToAllOrBuilder.html#getPathBytes())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPath​(java.lang.String value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPath()
		```
		
		`required string path = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### hasAllButSelf
		
		
		
		```
		public boolean hasAllButSelf()
		```
		
		`required bool allButSelf = 2;`
		
		Specified by:
		`[hasAllButSelf](DistributedPubSubMessages.SendToAllOrBuilder.html#hasAllButSelf())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the allButSelf field is set.
		- #### getAllButSelf
		
		
		
		```
		public boolean getAllButSelf()
		```
		
		`required bool allButSelf = 2;`
		
		Specified by:
		`[getAllButSelf](DistributedPubSubMessages.SendToAllOrBuilder.html#getAllButSelf())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The allButSelf.
		- #### setAllButSelf
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setAllButSelf​(boolean value)
		```
		
		`required bool allButSelf = 2;`
		
		Parameters:
		`value` \- The allButSelf to set.
		Returns:
		This builder for chaining.
		- #### clearAllButSelf
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearAllButSelf()
		```
		
		`required bool allButSelf = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[hasPayload](DistributedPubSubMessages.SendToAllOrBuilder.html#hasPayload())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") getPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[getPayload](DistributedPubSubMessages.SendToAllOrBuilder.html#getPayload())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`required .Payload payload = 3;`
		- #### mergePayload
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergePayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### clearPayload
		
		
		
		```
		public [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPayload()
		```
		
		`required .Payload payload = 3;`
		- #### getPayloadBuilder
		
		
		
		```
		public [DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") getPayloadBuilder()
		```
		
		`required .Payload payload = 3;`
		- #### getPayloadOrBuilder
		
		
		
		```
		public [DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getPayloadOrBuilder()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[getPayloadOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html#getPayloadOrBuilder())` in interface `[DistributedPubSubMessages.SendToAllOrBuilder](DistributedPubSubMessages.SendToAllOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.SendToAll.Builder](DistributedPubSubMessages.SendToAll.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAllOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendToAll.Builder.html)*