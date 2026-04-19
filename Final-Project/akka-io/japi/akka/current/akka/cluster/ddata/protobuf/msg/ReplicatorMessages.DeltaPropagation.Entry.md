---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:58:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.Builder.html
title: ReplicatorMessages.DeltaPropagation.Entry.Builder
---

# ReplicatorMessages.DeltaPropagation.Entry.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.DeltaPropagation.Entry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.DeltaPropagation.Entry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.DeltaPropagation.Entry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEnvelope](#clearEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearFromSeqNr](#clearFromSeqNr())()` | `required int64 fromSeqNr = 3;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearKey](#clearKey())()` | `required string key = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearToSeqNr](#clearToSeqNr())()` | if not set then same as fromSequenceNr |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEnvelope](#getEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DataEnvelope.Builder](ReplicatorMessages.DataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getEnvelopeBuilder](#getEnvelopeBuilder())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getEnvelopeOrBuilder](#getEnvelopeOrBuilder())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `long` | `[getFromSeqNr](#getFromSeqNr())()` | `required int64 fromSeqNr = 3;` |
	| `java.lang.String` | `[getKey](#getKey())()` | `required string key = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getKeyBytes](#getKeyBytes())()` | `required string key = 1;` |
	| `long` | `[getToSeqNr](#getToSeqNr())()` | if not set then same as fromSequenceNr |
	| `boolean` | `[hasEnvelope](#hasEnvelope())()` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `boolean` | `[hasFromSeqNr](#hasFromSeqNr())()` | `required int64 fromSeqNr = 3;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required string key = 1;` |
	| `boolean` | `[hasToSeqNr](#hasToSeqNr())()` | if not set then same as fromSequenceNr |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeEnvelope](#mergeEnvelope(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope))​([ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DeltaPropagation.Entry))​([ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEnvelope](#setEnvelope(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope))​([ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEnvelope](#setEnvelope(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.Builder))​([ReplicatorMessages.DataEnvelope.Builder](ReplicatorMessages.DataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.DataEnvelope envelope = 2;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setFromSeqNr](#setFromSeqNr(long))​(long value)` | `required int64 fromSeqNr = 3;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(java.lang.String))​(java.lang.String value)` | `required string key = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKeyBytes](#setKeyBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string key = 1;` |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setToSeqNr](#setToSeqNr(long))​(long value)` | if not set then same as fromSequenceNr |
	| `[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.DeltaPropagation.Entry](ReplicatorMessages.DeltaPropagation.Entry.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[hasKey](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#hasKey())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public java.lang.String getKey()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKey](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getKey())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The key.
		- #### getKeyBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getKeyBytes()
		```
		
		`required string key = 1;`
		
		Specified by:
		`[getKeyBytes](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getKeyBytes())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for key.
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​(java.lang.String value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The key to set.
		Returns:
		This builder for chaining.
		- #### clearKey
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearKey()
		```
		
		`required string key = 1;`
		
		Returns:
		This builder for chaining.
		- #### setKeyBytes
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKeyBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string key = 1;`
		
		Parameters:
		`value` \- The bytes for key to set.
		Returns:
		This builder for chaining.
		- #### hasEnvelope
		
		
		
		```
		public boolean hasEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[hasEnvelope](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#hasEnvelope())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the envelope field is set.
		- #### getEnvelope
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") getEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelope](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getEnvelope())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The envelope.
		- #### setEnvelope
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEnvelope​([ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### setEnvelope
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEnvelope​([ReplicatorMessages.DataEnvelope.Builder](ReplicatorMessages.DataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### mergeEnvelope
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeEnvelope​([ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### clearEnvelope
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEnvelope()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### getEnvelopeBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.Builder](ReplicatorMessages.DataEnvelope.Builder.html "class in akka.cluster.ddata.protobuf.msg") getEnvelopeBuilder()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		- #### getEnvelopeOrBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelopeOrBuilder](ReplicatorMessages.DataEnvelopeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getEnvelopeOrBuilder()
		```
		
		`required .akka.cluster.ddata.DataEnvelope envelope = 2;`
		
		Specified by:
		`[getEnvelopeOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getEnvelopeOrBuilder())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasFromSeqNr
		
		
		
		```
		public boolean hasFromSeqNr()
		```
		
		`required int64 fromSeqNr = 3;`
		
		Specified by:
		`[hasFromSeqNr](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#hasFromSeqNr())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the fromSeqNr field is set.
		- #### getFromSeqNr
		
		
		
		```
		public long getFromSeqNr()
		```
		
		`required int64 fromSeqNr = 3;`
		
		Specified by:
		`[getFromSeqNr](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getFromSeqNr())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The fromSeqNr.
		- #### setFromSeqNr
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setFromSeqNr​(long value)
		```
		
		`required int64 fromSeqNr = 3;`
		
		Parameters:
		`value` \- The fromSeqNr to set.
		Returns:
		This builder for chaining.
		- #### clearFromSeqNr
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearFromSeqNr()
		```
		
		`required int64 fromSeqNr = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasToSeqNr
		
		
		
		```
		public boolean hasToSeqNr()
		```
		
		
		```
		
		 if not set then same as fromSequenceNr
		 
		```
		
		`optional int64 toSeqNr = 4;`
		
		Specified by:
		`[hasToSeqNr](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#hasToSeqNr())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the toSeqNr field is set.
		- #### getToSeqNr
		
		
		
		```
		public long getToSeqNr()
		```
		
		
		```
		
		 if not set then same as fromSequenceNr
		 
		```
		
		`optional int64 toSeqNr = 4;`
		
		Specified by:
		`[getToSeqNr](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html#getToSeqNr())` in interface `[ReplicatorMessages.DeltaPropagation.EntryOrBuilder](ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The toSeqNr.
		- #### setToSeqNr
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setToSeqNr​(long value)
		```
		
		
		```
		
		 if not set then same as fromSequenceNr
		 
		```
		
		`optional int64 toSeqNr = 4;`
		
		Parameters:
		`value` \- The toSeqNr to set.
		Returns:
		This builder for chaining.
		- #### clearToSeqNr
		
		
		
		```
		public [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearToSeqNr()
		```
		
		
		```
		
		 if not set then same as fromSequenceNr
		 
		```
		
		`optional int64 toSeqNr = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.DeltaPropagation.Entry.Builder](ReplicatorMessages.DeltaPropagation.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.EntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DeltaPropagation.Entry.Builder.html)*