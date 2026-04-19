---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.Builder.html
title: ReliableDelivery.Cleanup.Builder
---

# ReliableDelivery.Cleanup.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ReliableDelivery.Cleanup.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ReliableDelivery.Cleanup.Builder

- All Implemented Interfaces:
`[ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ReliableDelivery.Cleanup.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

```

 DurableProducerQueue
 
```

 Protobuf type `akka.cluster.typed.delivery.Cleanup`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addAllQualifiers](#addAllQualifiers(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string qualifiers = 1;` |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addQualifiers](#addQualifiers(java.lang.String))​(java.lang.String value)` | `repeated string qualifiers = 1;` |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addQualifiersBytes](#addQualifiersBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string qualifiers = 1;` |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearQualifiers](#clearQualifiers())()` | `repeated string qualifiers = 1;` |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getQualifiers](#getQualifiers(int))​(int index)` | `repeated string qualifiers = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getQualifiersBytes](#getQualifiersBytes(int))​(int index)` | `repeated string qualifiers = 1;` |
	| `int` | `[getQualifiersCount](#getQualifiersCount())()` | `repeated string qualifiers = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getQualifiersList](#getQualifiersList())()` | `repeated string qualifiers = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ReliableDelivery.Cleanup))​([ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setQualifiers](#setQualifiers(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string qualifiers = 1;` |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         int index,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ReliableDelivery.Cleanup](ReliableDelivery.Cleanup.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### getQualifiersList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getQualifiersList()
		```
		
		`repeated string qualifiers = 1;`
		
		Specified by:
		`[getQualifiersList](ReliableDelivery.CleanupOrBuilder.html#getQualifiersList())` in interface `[ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		A list containing the qualifiers.
		- #### getQualifiersCount
		
		
		
		```
		public int getQualifiersCount()
		```
		
		`repeated string qualifiers = 1;`
		
		Specified by:
		`[getQualifiersCount](ReliableDelivery.CleanupOrBuilder.html#getQualifiersCount())` in interface `[ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The count of qualifiers.
		- #### getQualifiers
		
		
		
		```
		public java.lang.String getQualifiers​(int index)
		```
		
		`repeated string qualifiers = 1;`
		
		Specified by:
		`[getQualifiers](ReliableDelivery.CleanupOrBuilder.html#getQualifiers(int))` in interface `[ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The qualifiers at the given index.
		- #### getQualifiersBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getQualifiersBytes​(int index)
		```
		
		`repeated string qualifiers = 1;`
		
		Specified by:
		`[getQualifiersBytes](ReliableDelivery.CleanupOrBuilder.html#getQualifiersBytes(int))` in interface `[ReliableDelivery.CleanupOrBuilder](ReliableDelivery.CleanupOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the qualifiers at the given index.
		- #### setQualifiers
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") setQualifiers​(int index,
		                                                      java.lang.String value)
		```
		
		`repeated string qualifiers = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The qualifiers to set.
		Returns:
		This builder for chaining.
		- #### addQualifiers
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") addQualifiers​(java.lang.String value)
		```
		
		`repeated string qualifiers = 1;`
		
		Parameters:
		`value` \- The qualifiers to add.
		Returns:
		This builder for chaining.
		- #### addAllQualifiers
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") addAllQualifiers​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string qualifiers = 1;`
		
		Parameters:
		`values` \- The qualifiers to add.
		Returns:
		This builder for chaining.
		- #### clearQualifiers
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") clearQualifiers()
		```
		
		`repeated string qualifiers = 1;`
		
		Returns:
		This builder for chaining.
		- #### addQualifiersBytes
		
		
		
		```
		public [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") addQualifiersBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string qualifiers = 1;`
		
		Parameters:
		`value` \- The bytes of the qualifiers to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReliableDelivery.Cleanup.Builder](ReliableDelivery.Cleanup.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.CleanupOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Cleanup.Builder.html)*