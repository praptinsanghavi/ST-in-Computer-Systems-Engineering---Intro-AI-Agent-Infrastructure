---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.Builder.html
title: ClusterMessages.PubSubMessagePublished.Builder
---

# ClusterMessages.PubSubMessagePublished.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ClusterMessages.PubSubMessagePublished.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ClusterMessages.PubSubMessagePublished.Builder

- All Implemented Interfaces:
`[ClusterMessages.PubSubMessagePublishedOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ClusterMessages.PubSubMessagePublished.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ClusterMessages.PubSubMessagePublishedOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

Protobuf type `akka.cluster.typed.PubSubMessagePublished`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearMessage](#clearMessage())()` | `required .Payload message = 1;` |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote")` | `[getMessage](#getMessage())()` | `required .Payload message = 1;` |
	| `[ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getMessageBuilder](#getMessageBuilder())()` | `required .Payload message = 1;` |
	| `[ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getMessageOrBuilder](#getMessageOrBuilder())()` | `required .Payload message = 1;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required .Payload message = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ClusterMessages.PubSubMessagePublished))​([ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeMessage](#mergeMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 1;` |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload message = 1;` |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setMessage](#setMessage(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload message = 1;` |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       int index,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ClusterMessages.PubSubMessagePublished](ClusterMessages.PubSubMessagePublished.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required .Payload message = 1;`
		
		Specified by:
		`[hasMessage](ClusterMessages.PubSubMessagePublishedOrBuilder.html#hasMessage())` in interface `[ClusterMessages.PubSubMessagePublishedOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public [ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") getMessage()
		```
		
		`required .Payload message = 1;`
		
		Specified by:
		`[getMessage](ClusterMessages.PubSubMessagePublishedOrBuilder.html#getMessage())` in interface `[ClusterMessages.PubSubMessagePublishedOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The message.
		- #### setMessage
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 1;`
		- #### setMessage
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") setMessage​([ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload message = 1;`
		- #### mergeMessage
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeMessage​([ContainerFormats.Payload](../../../../remote/ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload message = 1;`
		- #### clearMessage
		
		
		
		```
		public [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") clearMessage()
		```
		
		`required .Payload message = 1;`
		- #### getMessageBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../../../../remote/ContainerFormats.Payload.Builder.html "class in akka.remote") getMessageBuilder()
		```
		
		`required .Payload message = 1;`
		- #### getMessageOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](../../../../remote/ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getMessageOrBuilder()
		```
		
		`required .Payload message = 1;`
		
		Specified by:
		`[getMessageOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html#getMessageOrBuilder())` in interface `[ClusterMessages.PubSubMessagePublishedOrBuilder](ClusterMessages.PubSubMessagePublishedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.PubSubMessagePublished.Builder](ClusterMessages.PubSubMessagePublished.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublishedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ClusterMessages.PubSubMessagePublished.Builder.html)*