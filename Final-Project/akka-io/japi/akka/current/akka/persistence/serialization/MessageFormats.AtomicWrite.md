---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.Builder.html
title: MessageFormats.AtomicWrite.Builder
---

# MessageFormats.AtomicWrite.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.AtomicWrite.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.AtomicWrite.Builder

- All Implemented Interfaces:
`[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.AtomicWrite.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `AtomicWrite`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addAllPayload](#addAllPayload(java.lang.Iterable))​(java.lang.Iterable<? extends [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")> values)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addPayload](#addPayload(int,akka.persistence.serialization.MessageFormats.PersistentMessage))​(int index,  [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addPayload](#addPayload(int,akka.persistence.serialization.MessageFormats.PersistentMessage.Builder))​(int index,  [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addPayload](#addPayload(akka.persistence.serialization.MessageFormats.PersistentMessage))​([MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addPayload](#addPayload(akka.persistence.serialization.MessageFormats.PersistentMessage.Builder))​([MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[addPayloadBuilder](#addPayloadBuilder())()` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[addPayloadBuilder](#addPayloadBuilder(int))​(int index)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[clearPayload](#clearPayload())()` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")` | `[getPayload](#getPayload(int))​(int index)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")` | `[getPayloadBuilder](#getPayloadBuilder(int))​(int index)` | `repeated .PersistentMessage payload = 1;` |
	| `java.util.List<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")>` | `[getPayloadBuilderList](#getPayloadBuilderList())()` | `repeated .PersistentMessage payload = 1;` |
	| `int` | `[getPayloadCount](#getPayloadCount())()` | `repeated .PersistentMessage payload = 1;` |
	| `java.util.List<[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")>` | `[getPayloadList](#getPayloadList())()` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")` | `[getPayloadOrBuilder](#getPayloadOrBuilder(int))​(int index)` | `repeated .PersistentMessage payload = 1;` |
	| `java.util.List<? extends [MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")>` | `[getPayloadOrBuilderList](#getPayloadOrBuilderList())()` | `repeated .PersistentMessage payload = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.AtomicWrite))​([MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[removePayload](#removePayload(int))​(int index)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(int,akka.persistence.serialization.MessageFormats.PersistentMessage))​(int index,  [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[setPayload](#setPayload(int,akka.persistence.serialization.MessageFormats.PersistentMessage.Builder))​(int index,  [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)` | `repeated .PersistentMessage payload = 1;` |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### getPayloadList
		
		
		
		```
		public java.util.List<[MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")> getPayloadList()
		```
		
		`repeated .PersistentMessage payload = 1;`
		
		Specified by:
		`[getPayloadList](MessageFormats.AtomicWriteOrBuilder.html#getPayloadList())` in interface `[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayloadCount
		
		
		
		```
		public int getPayloadCount()
		```
		
		`repeated .PersistentMessage payload = 1;`
		
		Specified by:
		`[getPayloadCount](MessageFormats.AtomicWriteOrBuilder.html#getPayloadCount())` in interface `[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayload
		
		
		
		```
		public [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") getPayload​(int index)
		```
		
		`repeated .PersistentMessage payload = 1;`
		
		Specified by:
		`[getPayload](MessageFormats.AtomicWriteOrBuilder.html#getPayload(int))` in interface `[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`
		- #### setPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") setPayload​(int index,
		                                                     [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### setPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") setPayload​(int index,
		                                                     [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addPayload​([MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addPayload​(int index,
		                                                     [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") value)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addPayload​([MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addPayload​(int index,
		                                                     [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addAllPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") addAllPayload​(java.lang.Iterable<? extends [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization")> values)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### clearPayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") clearPayload()
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### removePayload
		
		
		
		```
		public [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") removePayload​(int index)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### getPayloadBuilder
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") getPayloadBuilder​(int index)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### getPayloadOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization") getPayloadOrBuilder​(int index)
		```
		
		`repeated .PersistentMessage payload = 1;`
		
		Specified by:
		`[getPayloadOrBuilder](MessageFormats.AtomicWriteOrBuilder.html#getPayloadOrBuilder(int))` in interface `[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`
		- #### getPayloadOrBuilderList
		
		
		
		```
		public java.util.List<? extends [MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization")> getPayloadOrBuilderList()
		```
		
		`repeated .PersistentMessage payload = 1;`
		
		Specified by:
		`[getPayloadOrBuilderList](MessageFormats.AtomicWriteOrBuilder.html#getPayloadOrBuilderList())` in interface `[MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization")`
		- #### addPayloadBuilder
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") addPayloadBuilder()
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### addPayloadBuilder
		
		
		
		```
		public [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") addPayloadBuilder​(int index)
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### getPayloadBuilderList
		
		
		
		```
		public java.util.List<[MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization")> getPayloadBuilderList()
		```
		
		`repeated .PersistentMessage payload = 1;`
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWriteOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.Builder.html)*