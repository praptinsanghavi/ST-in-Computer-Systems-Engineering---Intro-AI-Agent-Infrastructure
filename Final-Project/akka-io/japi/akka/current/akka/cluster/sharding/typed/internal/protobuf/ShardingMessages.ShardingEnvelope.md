---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.Builder.html
title: ShardingMessages.ShardingEnvelope.Builder
---

# ShardingMessages.ShardingEnvelope.Builder

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Class ShardingMessages.ShardingEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")\>
			- - akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ShardingEnvelope.Builder

- All Implemented Interfaces:
`[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static final class ShardingMessages.ShardingEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>
implements [ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")
```

Protobuf type `akka.cluster.sharding.typed.ShardingEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearEntityId](#clearEntityId())()` | `required string entityId = 1;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearMessage](#clearMessage())()` | `required .Payload message = 2;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getEntityId](#getEntityId())()` | `required string entityId = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getEntityIdBytes](#getEntityIdBytes())()` | `required string entityId = 1;` |
	| `[ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .Payload message = 2;` |
	| `[ContainerFormats.Payload.Builder](../../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMessageBuilder](#getMessageBuilder())()` | `required .Payload message = 2;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .Payload message = 2;` |
	| `boolean` | `[hasEntityId](#hasEntityId())()` | `required string entityId = 1;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .Payload message = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ShardingEnvelope))​([ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") other)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeMessage](#mergeMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 2;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setEntityId](#setEntityId(java.lang.String))​(java.lang.String value)` | `required string entityId = 1;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setEntityIdBytes](#setEntityIdBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string entityId = 1;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 2;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload message = 2;` |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​([ShardingMessages.ShardingEnvelope](ShardingMessages.ShardingEnvelope.html "class in akka.cluster.sharding.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasEntityId
		
		
		
		```
		public boolean hasEntityId()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[hasEntityId](ShardingMessages.ShardingEnvelopeOrBuilder.html#hasEntityId())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the entityId field is set.
		- #### getEntityId
		
		
		
		```
		public java.lang.String getEntityId()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[getEntityId](ShardingMessages.ShardingEnvelopeOrBuilder.html#getEntityId())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The entityId.
		- #### getEntityIdBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEntityIdBytes()
		```
		
		`required string entityId = 1;`
		
		Specified by:
		`[getEntityIdBytes](ShardingMessages.ShardingEnvelopeOrBuilder.html#getEntityIdBytes())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The bytes for entityId.
		- #### setEntityId
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setEntityId​(java.lang.String value)
		```
		
		`required string entityId = 1;`
		
		Parameters:
		`value` \- The entityId to set.
		Returns:
		This builder for chaining.
		- #### clearEntityId
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearEntityId()
		```
		
		`required string entityId = 1;`
		
		Returns:
		This builder for chaining.
		- #### setEntityIdBytes
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setEntityIdBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string entityId = 1;`
		
		Parameters:
		`value` \- The bytes for entityId to set.
		Returns:
		This builder for chaining.
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required .Payload message = 2;`
		
		Specified by:
		`[hasMessage](ShardingMessages.ShardingEnvelopeOrBuilder.html#hasMessage())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public [ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMessage()
		```
		
		`required .Payload message = 2;`
		
		Specified by:
		`[getMessage](ShardingMessages.ShardingEnvelopeOrBuilder.html#getMessage())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setMessage​([ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 2;`
		- #### setMessage
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setMessage​([ContainerFormats.Payload.Builder](../../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload message = 2;`
		- #### mergeMessage
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeMessage​([ContainerFormats.Payload](../../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 2;`
		- #### clearMessage
		
		
		
		```
		public [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearMessage()
		```
		
		`required .Payload message = 2;`
		- #### getMessageBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMessageBuilder()
		```
		
		`required .Payload message = 2;`
		- #### getMessageOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .Payload message = 2;`
		
		Specified by:
		`[getMessageOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html#getMessageOrBuilder())` in interface `[ShardingMessages.ShardingEnvelopeOrBuilder](ShardingMessages.ShardingEnvelopeOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		- #### setUnknownFields
		
		
		
		```
		public final [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ShardingEnvelope.Builder](ShardingMessages.ShardingEnvelope.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ShardingEnvelope.Builder.html)*