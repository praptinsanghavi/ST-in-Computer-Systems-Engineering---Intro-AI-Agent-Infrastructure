---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.Builder.html
title: ReplicatedEventSourcing.Counter.Builder
---

# ReplicatedEventSourcing.Counter.Builder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Class ReplicatedEventSourcing.Counter.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")\>
			- - akka.persistence.typed.serialization.ReplicatedEventSourcing.Counter.Builder

- All Implemented Interfaces:
`[ReplicatedEventSourcing.CounterOrBuilder](ReplicatedEventSourcing.CounterOrBuilder.html "interface in akka.persistence.typed.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization")

---

```
public static final class ReplicatedEventSourcing.Counter.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>
implements [ReplicatedEventSourcing.CounterOrBuilder](ReplicatedEventSourcing.CounterOrBuilder.html "interface in akka.persistence.typed.serialization")
```

Protobuf type `Counter`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization")` | `[build](#build())()` |  |
	| `[ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[clear](#clear())()` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[clearValue](#clearValue())()` | `required bytes value = 1;` |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[clone](#clone())()` |  |
	| `[ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getValue](#getValue())()` | `required bytes value = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required bytes value = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.typed.serialization.ReplicatedEventSourcing.Counter))​([ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") other)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")` | `[setValue](#setValue(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes value = 1;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clear
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setField
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​([ReplicatedEventSourcing.Counter](ReplicatedEventSourcing.Counter.html "class in akka.persistence.typed.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasValue
		
		
		
		```
		public boolean hasValue()
		```
		
		`required bytes value = 1;`
		
		Specified by:
		`[hasValue](ReplicatedEventSourcing.CounterOrBuilder.html#hasValue())` in interface `[ReplicatedEventSourcing.CounterOrBuilder](ReplicatedEventSourcing.CounterOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		public akka.protobufv3.internal.ByteString getValue()
		```
		
		`required bytes value = 1;`
		
		Specified by:
		`[getValue](ReplicatedEventSourcing.CounterOrBuilder.html#getValue())` in interface `[ReplicatedEventSourcing.CounterOrBuilder](ReplicatedEventSourcing.CounterOrBuilder.html "interface in akka.persistence.typed.serialization")`
		Returns:
		The value.
		- #### setValue
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") setValue​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes value = 1;`
		
		Parameters:
		`value` \- The value to set.
		Returns:
		This builder for chaining.
		- #### clearValue
		
		
		
		```
		public [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") clearValue()
		```
		
		`required bytes value = 1;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedEventSourcing.Counter.Builder](ReplicatedEventSourcing.Counter.Builder.html "class in akka.persistence.typed.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.CounterOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.Counter.Builder.html)*