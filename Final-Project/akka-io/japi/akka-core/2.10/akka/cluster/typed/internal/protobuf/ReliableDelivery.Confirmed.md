---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.Builder.html
title: ReliableDelivery.Confirmed.Builder
---

# ReliableDelivery.Confirmed.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.Confirmed.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed.Builder

- All Implemented Interfaces:
`[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.Confirmed.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 DurableProducerQueue
 
```

 Protobuf type `akka.cluster.typed.delivery.Confirmed`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearQualifier](#clearQualifier())()` | `required string qualifier = 2;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearSeqNr](#clearSeqNr())()` | `required int64 seqNr = 1;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearTimestamp](#clearTimestamp())()` | `required int64 timestamp = 3;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getQualifier](#getQualifier())()` | `required string qualifier = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getQualifierBytes](#getQualifierBytes())()` | `required string qualifier = 2;` |
	| `long` | `[getSeqNr](#getSeqNr())()` | `required int64 seqNr = 1;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 3;` |
	| `boolean` | `[hasQualifier](#hasQualifier())()` | `required string qualifier = 2;` |
	| `boolean` | `[hasSeqNr](#hasSeqNr())()` | `required int64 seqNr = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ReliableDelivery.Confirmed))​([ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setQualifier](#setQualifier(java.lang.String))​(java.lang.String value)` | `required string qualifier = 2;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setQualifierBytes](#setQualifierBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string qualifier = 2;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setSeqNr](#setSeqNr(long))​(long value)` | `required int64 seqNr = 1;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required int64 timestamp = 3;` |
	| `[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasSeqNr
		
		
		
		```
		public boolean hasSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[hasSeqNr](ReliableDelivery.ConfirmedOrBuilder.html#hasSeqNr())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the seqNr field is set.
		- #### getSeqNr
		
		
		
		```
		public long getSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Specified by:
		`[getSeqNr](ReliableDelivery.ConfirmedOrBuilder.html#getSeqNr())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The seqNr.
		- #### setSeqNr
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setSeqNr​(long value)
		```
		
		`required int64 seqNr = 1;`
		
		Parameters:
		`value` \- The seqNr to set.
		Returns:
		This builder for chaining.
		- #### clearSeqNr
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clearSeqNr()
		```
		
		`required int64 seqNr = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasQualifier
		
		
		
		```
		public boolean hasQualifier()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[hasQualifier](ReliableDelivery.ConfirmedOrBuilder.html#hasQualifier())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the qualifier field is set.
		- #### getQualifier
		
		
		
		```
		public java.lang.String getQualifier()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[getQualifier](ReliableDelivery.ConfirmedOrBuilder.html#getQualifier())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The qualifier.
		- #### getQualifierBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getQualifierBytes()
		```
		
		`required string qualifier = 2;`
		
		Specified by:
		`[getQualifierBytes](ReliableDelivery.ConfirmedOrBuilder.html#getQualifierBytes())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for qualifier.
		- #### setQualifier
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setQualifier​(java.lang.String value)
		```
		
		`required string qualifier = 2;`
		
		Parameters:
		`value` \- The qualifier to set.
		Returns:
		This builder for chaining.
		- #### clearQualifier
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clearQualifier()
		```
		
		`required string qualifier = 2;`
		
		Returns:
		This builder for chaining.
		- #### setQualifierBytes
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setQualifierBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string qualifier = 2;`
		
		Parameters:
		`value` \- The bytes for qualifier to set.
		Returns:
		This builder for chaining.
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required int64 timestamp = 3;`
		
		Specified by:
		`[hasTimestamp](ReliableDelivery.ConfirmedOrBuilder.html#hasTimestamp())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required int64 timestamp = 3;`
		
		Specified by:
		`[getTimestamp](ReliableDelivery.ConfirmedOrBuilder.html#getTimestamp())` in interface `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setTimestamp​(long value)
		```
		
		`required int64 timestamp = 3;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") clearTimestamp()
		```
		
		`required int64 timestamp = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Confirmed.Builder](ReliableDelivery.Confirmed.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.ConfirmedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.Builder.html)*