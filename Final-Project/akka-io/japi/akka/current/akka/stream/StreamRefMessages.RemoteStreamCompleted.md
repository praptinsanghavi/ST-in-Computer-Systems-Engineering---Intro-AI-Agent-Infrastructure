---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompleted.Builder.html
title: StreamRefMessages.RemoteStreamCompleted.Builder
---

# StreamRefMessages.RemoteStreamCompleted.Builder

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefMessages.RemoteStreamCompleted.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")\>
			- - akka.stream.StreamRefMessages.RemoteStreamCompleted.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[StreamRefMessages.RemoteStreamCompletedOrBuilder](StreamRefMessages.RemoteStreamCompletedOrBuilder.html "interface in akka.stream")`, `java.lang.Cloneable`

Enclosing class:
[StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream")

---

```
public static final class StreamRefMessages.RemoteStreamCompleted.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>
implements [StreamRefMessages.RemoteStreamCompletedOrBuilder](StreamRefMessages.RemoteStreamCompletedOrBuilder.html "interface in akka.stream")
```

Protobuf type `RemoteStreamCompleted`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream")` | `[build](#build())()` |  |
	| `[StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream")` | `[buildPartial](#buildPartial())()` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[clear](#clear())()` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[clearSeqNr](#clearSeqNr())()` | `required int64 seqNr = 1;` |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[clone](#clone())()` |  |
	| `[StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getSeqNr](#getSeqNr())()` | `required int64 seqNr = 1;` |
	| `boolean` | `[hasSeqNr](#hasSeqNr())()` | `required int64 seqNr = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[mergeFrom](#mergeFrom(akka.stream.StreamRefMessages.RemoteStreamCompleted))​([StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") other)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[setSeqNr](#setSeqNr(long))​(long value)` | `required int64 seqNr = 1;` |
	| `[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### clear
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### setField
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### clearField
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### clearOneof
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### setRepeatedField
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        int index,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### addRepeatedField
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") mergeFrom​([StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### mergeFrom
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		Throws:
		`java.io.IOException`
		- #### hasSeqNr
		
		
		
		```
		public boolean hasSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[hasSeqNr](StreamRefMessages.RemoteStreamCompletedOrBuilder.html#hasSeqNr())` in interface `[StreamRefMessages.RemoteStreamCompletedOrBuilder](StreamRefMessages.RemoteStreamCompletedOrBuilder.html "interface in akka.stream")`
		Returns:
		Whether the seqNr field is set.
		- #### getSeqNr
		
		
		
		```
		public long getSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[getSeqNr](StreamRefMessages.RemoteStreamCompletedOrBuilder.html#getSeqNr())` in interface `[StreamRefMessages.RemoteStreamCompletedOrBuilder](StreamRefMessages.RemoteStreamCompletedOrBuilder.html "interface in akka.stream")`
		Returns:
		The seqNr.
		- #### setSeqNr
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") setSeqNr​(long value)
		```
		
		`required int64 seqNr = 1;`
		
		Parameters:
		`value` \- The seqNr to set.
		Returns:
		This builder for chaining.
		- #### clearSeqNr
		
		
		
		```
		public [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") clearSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompleted.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompleted.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompletedOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompleted.Builder.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefMessages.RemoteStreamCompleted.Builder.html)*