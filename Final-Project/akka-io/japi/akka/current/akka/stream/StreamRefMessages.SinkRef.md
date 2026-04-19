---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRef.Builder.html
title: StreamRefMessages.SinkRef.Builder
---

# StreamRefMessages.SinkRef.Builder

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.SinkRef.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")\>
			- - akka.stream.StreamRefMessages.SinkRef.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`, `java.lang.Cloneable`

Enclosing class:
[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")

---

```
public static final class StreamRefMessages.SinkRef.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>
implements [StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")
```

Protobuf type `SinkRef`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[build](#build())()` |  |
	| `[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[buildPartial](#buildPartial())()` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[clear](#clear())()` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[clearTargetRef](#clearTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[clone](#clone())()` |  |
	| `[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[getTargetRef](#getTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[getTargetRefBuilder](#getTargetRefBuilder())()` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")` | `[getTargetRefOrBuilder](#getTargetRefOrBuilder())()` | `required .ActorRef targetRef = 1;` |
	| `boolean` | `[hasTargetRef](#hasTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.stream.StreamRefMessages.SinkRef))​([StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") other)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[mergeTargetRef](#mergeTargetRef(akka.stream.StreamRefMessages.ActorRef))​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[setTargetRef](#setTargetRef(akka.stream.StreamRefMessages.ActorRef))​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[setTargetRef](#setTargetRef(akka.stream.StreamRefMessages.ActorRef.Builder))​([StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") builderForValue)` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### clear
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### setField
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### clearField
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### clearOneof
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### setRepeatedField
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          int index,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### addRepeatedField
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") mergeFrom​([StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		Throws:
		`java.io.IOException`
		- #### hasTargetRef
		
		
		
		```
		public boolean hasTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[hasTargetRef](StreamRefMessages.SinkRefOrBuilder.html#hasTargetRef())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the targetRef field is set.
		- #### getTargetRef
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") getTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[getTargetRef](StreamRefMessages.SinkRefOrBuilder.html#getTargetRef())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		Returns:
		The targetRef.
		- #### setTargetRef
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") setTargetRef​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)
		```
		
		`required .ActorRef targetRef = 1;`
		- #### setTargetRef
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") setTargetRef​([StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") builderForValue)
		```
		
		`required .ActorRef targetRef = 1;`
		- #### mergeTargetRef
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") mergeTargetRef​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)
		```
		
		`required .ActorRef targetRef = 1;`
		- #### clearTargetRef
		
		
		
		```
		public [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") clearTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		- #### getTargetRefBuilder
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") getTargetRefBuilder()
		```
		
		`required .ActorRef targetRef = 1;`
		- #### getTargetRefOrBuilder
		
		
		
		```
		public [StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream") getTargetRefOrBuilder()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Specified by:
		`[getTargetRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html#getTargetRefOrBuilder())` in interface `[StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream")`
		- #### setUnknownFields
		
		
		
		```
		public final [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.ActorRef.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRef.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRefOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRef.Builder.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.SinkRef.Builder.html)*