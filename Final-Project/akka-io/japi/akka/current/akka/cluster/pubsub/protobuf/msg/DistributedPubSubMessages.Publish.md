---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.Builder.html
title: DistributedPubSubMessages.Publish.Builder
---

# DistributedPubSubMessages.Publish.Builder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Class DistributedPubSubMessages.Publish.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")\>
			- - akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Publish.Builder

- All Implemented Interfaces:
`[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static final class DistributedPubSubMessages.Publish.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>
implements [DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")
```

```

 Publish normally local.
 
```

 Protobuf type `Publish`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg")` | `[build](#build())()` |  |
	| `[DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearPayload](#clearPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clearTopic](#clearTopic())()` | `required string topic = 1;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayload](#getPayload())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadBuilder](#getPayloadBuilder())()` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.PayloadOrBuilder](DistributedPubSubMessages.PayloadOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getPayloadOrBuilder](#getPayloadOrBuilder())()` | `required .Payload payload = 3;` |
	| `java.lang.String` | `[getTopic](#getTopic())()` | `required string topic = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getTopicBytes](#getTopicBytes())()` | `required string topic = 1;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `required .Payload payload = 3;` |
	| `boolean` | `[hasTopic](#hasTopic())()` | `required string topic = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Publish))​([DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") other)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergePayload](#mergePayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload))​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setPayload](#setPayload(akka.cluster.pubsub.protobuf.msg.DistributedPubSubMessages.Payload.Builder))​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)` | `required .Payload payload = 3;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setTopic](#setTopic(java.lang.String))​(java.lang.String value)` | `required string topic = 1;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setTopicBytes](#setTopicBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string topic = 1;` |
	| `[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​([DistributedPubSubMessages.Publish](DistributedPubSubMessages.Publish.html "class in akka.cluster.pubsub.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasTopic
		
		
		
		```
		public boolean hasTopic()
		```
		
		`required string topic = 1;`
		
		Specified by:
		`[hasTopic](DistributedPubSubMessages.PublishOrBuilder.html#hasTopic())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the topic field is set.
		- #### getTopic
		
		
		
		```
		public java.lang.String getTopic()
		```
		
		`required string topic = 1;`
		
		Specified by:
		`[getTopic](DistributedPubSubMessages.PublishOrBuilder.html#getTopic())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The topic.
		- #### getTopicBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getTopicBytes()
		```
		
		`required string topic = 1;`
		
		Specified by:
		`[getTopicBytes](DistributedPubSubMessages.PublishOrBuilder.html#getTopicBytes())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The bytes for topic.
		- #### setTopic
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setTopic​(java.lang.String value)
		```
		
		`required string topic = 1;`
		
		Parameters:
		`value` \- The topic to set.
		Returns:
		This builder for chaining.
		- #### clearTopic
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearTopic()
		```
		
		`required string topic = 1;`
		
		Returns:
		This builder for chaining.
		- #### setTopicBytes
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setTopicBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string topic = 1;`
		
		Parameters:
		`value` \- The bytes for topic to set.
		Returns:
		This builder for chaining.
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[hasPayload](DistributedPubSubMessages.PublishOrBuilder.html#hasPayload())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public [DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") getPayload()
		```
		
		`required .Payload payload = 3;`
		
		Specified by:
		`[getPayload](DistributedPubSubMessages.PublishOrBuilder.html#getPayload())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### setPayload
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setPayload​([DistributedPubSubMessages.Payload.Builder](DistributedPubSubMessages.Payload.Builder.html "class in akka.cluster.pubsub.protobuf.msg") builderForValue)
		```
		
		`required .Payload payload = 3;`
		- #### mergePayload
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergePayload​([DistributedPubSubMessages.Payload](DistributedPubSubMessages.Payload.html "class in akka.cluster.pubsub.protobuf.msg") value)
		```
		
		`required .Payload payload = 3;`
		- #### clearPayload
		
		
		
		```
		public [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") clearPayload()
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
		`[getPayloadOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html#getPayloadOrBuilder())` in interface `[DistributedPubSubMessages.PublishOrBuilder](DistributedPubSubMessages.PublishOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[DistributedPubSubMessages.Publish.Builder](DistributedPubSubMessages.Publish.Builder.html "class in akka.cluster.pubsub.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Payload.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.PublishOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Publish.Builder.html)*