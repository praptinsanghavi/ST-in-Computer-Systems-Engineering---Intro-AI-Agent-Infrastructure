---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.Builder.html
title: DistributedPubSubMessages.Send.Builder
---

# DistributedPubSubMessages.Send.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Send.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Send.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Send.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

```

 Send normally local.
 
```

 Protobuf type `Send`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearLocalAffinity](#clearLocalAffinity())()` | `required bool localAffinity = 2;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPath](#clearPath())()` | `required string path = 1;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPayload](#clearPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getLocalAffinity](#getLocalAffinity())()` | `required bool localAffinity = 2;` |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 1;` |
	| `[DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayload](#getPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .Payload payload = 3;` |
	| `boolean` | `[hasLocalAffinity](#hasLocalAffinity())()` | `required bool localAffinity = 2;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 1;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .Payload payload = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Send))​([DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergePayload](#mergePayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setLocalAffinity](#setLocalAffinity(boolean))​(boolean value)` | `required bool localAffinity = 2;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 1;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 1;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload.Builder))​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Send](DistributedPubSubMessages.Send.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[hasPath](DistributedPubSubMessages.SendOrBuilder.html#hasPath())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPath](DistributedPubSubMessages.SendOrBuilder.html#getPath())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPathBytes](DistributedPubSubMessages.SendOrBuilder.html#getPathBytes())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPath​(java.lang.String value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPath()
		```
		
		`required string path = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### hasLocalAffinity
		
		
		
		```
		public boolean hasLocalAffinity()
		```
		
		`required bool localAffinity = 2;`
		
		Specified by:
		`[hasLocalAffinity](DistributedPubSubMessages.SendOrBuilder.html#hasLocalAffinity())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the localAffinity field is set.
		- #### getLocalAffinity
		
		
		
		```
		public boolean getLocalAffinity()
		```
		
		`required bool localAffinity = 2;`
		
		Specified by:
		`[getLocalAffinity](DistributedPubSubMessages.SendOrBuilder.html#getLocalAffinity())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The localAffinity.
		- #### setLocalAffinity
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setLocalAffinity​(boolean value)
		```
		
		`required bool localAffinity = 2;`
		
		Parameters:
		`value` \- The localAffinity to set.
		Returns:
		This builder for chaining.
		- #### clearLocalAffinity
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearLocalAffinity()
		```
		
		`required bool localAffinity = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[hasPayload](DistributedPubSubMessages.SendOrBuilder.html#hasPayload())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") getPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[getPayload](DistributedPubSubMessages.SendOrBuilder.html#getPayload())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`required .Payload payload = 3;`
		- #### mergePayload
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergePayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### clearPayload
		
		
		
		```
		public [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPayload()
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
		`[getPayloadOrBuilder](DistributedPubSubMessages.SendOrBuilder.html#getPayloadOrBuilder())` in interface `[DistributedPubSubMessages.SendOrBuilder](DistributedPubSubMessages.SendOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Send.Builder](DistributedPubSubMessages.Send.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.SendOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Send.Builder.html)*