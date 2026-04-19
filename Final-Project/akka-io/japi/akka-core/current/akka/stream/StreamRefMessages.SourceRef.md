---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:03:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRef.Builder.html
title: StreamRefMessages.SourceRef.Builder
---

# StreamRefMessages.SourceRef.Builder

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.SourceRef.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")\>
			- - akka.stream.StreamRefMessages.SourceRef.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream")`, `java.lang.Cloneable`

Enclosing class:
[StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream")

---

```
public static final class StreamRefMessages.SourceRef.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>
implements [StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream")
```

Protobuf type `SourceRef`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream")` | `[build](#build())()` |  |
	| `[StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream")` | `[buildPartial](#buildPartial())()` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[clear](#clear())()` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[clearOriginRef](#clearOriginRef())()` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[clone](#clone())()` |  |
	| `[StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[getOriginRef](#getOriginRef())()` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream")` | `[getOriginRefBuilder](#getOriginRefBuilder())()` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")` | `[getOriginRefOrBuilder](#getOriginRefOrBuilder())()` | `required .ActorRef originRef = 1;` |
	| `boolean` | `[hasOriginRef](#hasOriginRef())()` | `required .ActorRef originRef = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.stream.StreamRefMessages.SourceRef))​([StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") other)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[mergeOriginRef](#mergeOriginRef(akka.stream.StreamRefMessages.ActorRef))​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[setOriginRef](#setOriginRef(akka.stream.StreamRefMessages.ActorRef))​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[setOriginRef](#setOriginRef(akka.stream.StreamRefMessages.ActorRef.Builder))​([StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") builderForValue)` | `required .ActorRef originRef = 1;` |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### clear
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### setField
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### clearField
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### clearOneof
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### setRepeatedField
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### addRepeatedField
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") mergeFrom​([StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		Throws:
		`java.io.IOException`
		- #### hasOriginRef
		
		
		
		```
		public boolean hasOriginRef()
		```
		
		`required .ActorRef originRef = 1;`
		
		Specified by:
		`[hasOriginRef](StreamRefMessages.SourceRefOrBuilder.html#hasOriginRef())` in interface `[StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the originRef field is set.
		- #### getOriginRef
		
		
		
		```
		public [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") getOriginRef()
		```
		
		`required .ActorRef originRef = 1;`
		
		Specified by:
		`[getOriginRef](StreamRefMessages.SourceRefOrBuilder.html#getOriginRef())` in interface `[StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream")`
		Returns:
		The originRef.
		- #### setOriginRef
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") setOriginRef​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)
		```
		
		`required .ActorRef originRef = 1;`
		- #### setOriginRef
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") setOriginRef​([StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") builderForValue)
		```
		
		`required .ActorRef originRef = 1;`
		- #### mergeOriginRef
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") mergeOriginRef​([StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") value)
		```
		
		`required .ActorRef originRef = 1;`
		- #### clearOriginRef
		
		
		
		```
		public [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") clearOriginRef()
		```
		
		`required .ActorRef originRef = 1;`
		- #### getOriginRefBuilder
		
		
		
		```
		public [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") getOriginRefBuilder()
		```
		
		`required .ActorRef originRef = 1;`
		- #### getOriginRefOrBuilder
		
		
		
		```
		public [StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream") getOriginRefOrBuilder()
		```
		
		`required .ActorRef originRef = 1;`
		
		Specified by:
		`[getOriginRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html#getOriginRefOrBuilder())` in interface `[StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream")`
		- #### setUnknownFields
		
		
		
		```
		public final [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.ActorRef.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRef.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRef.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRef.Builder.html](https://doc.akka.io/japi/akka-core/current/akka/stream/StreamRefMessages.SourceRef.Builder.html)*