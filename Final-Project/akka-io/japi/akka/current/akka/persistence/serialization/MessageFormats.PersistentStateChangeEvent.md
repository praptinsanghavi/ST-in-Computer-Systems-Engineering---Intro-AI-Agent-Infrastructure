---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html
title: MessageFormats.PersistentStateChangeEvent.Builder
---

# MessageFormats.PersistentStateChangeEvent.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.PersistentStateChangeEvent.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent.Builder

- All Implemented Interfaces:
`[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.PersistentStateChangeEvent.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")
```

```

 no longer created but needs to stay for reading persistent FSM events and snapshots
 
```

 Protobuf type `PersistentStateChangeEvent`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clearStateIdentifier](#clearStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clearTimeout](#clearTimeout())()` | not used in new records from 2\.4\.5 |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clearTimeoutNanos](#clearTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getStateIdentifier](#getStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStateIdentifierBytes](#getStateIdentifierBytes())()` | `required string stateIdentifier = 1;` |
	| `java.lang.String` | `[getTimeout](#getTimeout())()` | not used in new records from 2\.4\.5 |
	| `akka.protobufv3.internal.ByteString` | `[getTimeoutBytes](#getTimeoutBytes())()` | not used in new records from 2\.4\.5 |
	| `long` | `[getTimeoutNanos](#getTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `boolean` | `[hasStateIdentifier](#hasStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `boolean` | `[hasTimeout](#hasTimeout())()` | not used in new records from 2\.4\.5 |
	| `boolean` | `[hasTimeoutNanos](#hasTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent))​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setStateIdentifier](#setStateIdentifier(java.lang.String))​(java.lang.String value)` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setStateIdentifierBytes](#setStateIdentifierBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setTimeout](#setTimeout(java.lang.String))​(java.lang.String value)` | not used in new records from 2\.4\.5 |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setTimeoutBytes](#setTimeoutBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | not used in new records from 2\.4\.5 |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setTimeoutNanos](#setTimeoutNanos(long))​(long value)` | `optional int64 timeoutNanos = 3;` |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasStateIdentifier
		
		
		
		```
		public boolean hasStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[hasStateIdentifier](MessageFormats.PersistentStateChangeEventOrBuilder.html#hasStateIdentifier())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the stateIdentifier field is set.
		- #### getStateIdentifier
		
		
		
		```
		public java.lang.String getStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[getStateIdentifier](MessageFormats.PersistentStateChangeEventOrBuilder.html#getStateIdentifier())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The stateIdentifier.
		- #### getStateIdentifierBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStateIdentifierBytes()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[getStateIdentifierBytes](MessageFormats.PersistentStateChangeEventOrBuilder.html#getStateIdentifierBytes())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for stateIdentifier.
		- #### setStateIdentifier
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setStateIdentifier​(java.lang.String value)
		```
		
		`required string stateIdentifier = 1;`
		
		Parameters:
		`value` \- The stateIdentifier to set.
		Returns:
		This builder for chaining.
		- #### clearStateIdentifier
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clearStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Returns:
		This builder for chaining.
		- #### setStateIdentifierBytes
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setStateIdentifierBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string stateIdentifier = 1;`
		
		Parameters:
		`value` \- The bytes for stateIdentifier to set.
		Returns:
		This builder for chaining.
		- #### hasTimeout
		
		
		
		```
		public boolean hasTimeout()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Specified by:
		`[hasTimeout](MessageFormats.PersistentStateChangeEventOrBuilder.html#hasTimeout())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the timeout field is set.
		- #### getTimeout
		
		
		
		```
		public java.lang.String getTimeout()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Specified by:
		`[getTimeout](MessageFormats.PersistentStateChangeEventOrBuilder.html#getTimeout())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The timeout.
		- #### getTimeoutBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getTimeoutBytes()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Specified by:
		`[getTimeoutBytes](MessageFormats.PersistentStateChangeEventOrBuilder.html#getTimeoutBytes())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for timeout.
		- #### setTimeout
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setTimeout​(java.lang.String value)
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Parameters:
		`value` \- The timeout to set.
		Returns:
		This builder for chaining.
		- #### clearTimeout
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clearTimeout()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Returns:
		This builder for chaining.
		- #### setTimeoutBytes
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setTimeoutBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Parameters:
		`value` \- The bytes for timeout to set.
		Returns:
		This builder for chaining.
		- #### hasTimeoutNanos
		
		
		
		```
		public boolean hasTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Specified by:
		`[hasTimeoutNanos](MessageFormats.PersistentStateChangeEventOrBuilder.html#hasTimeoutNanos())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the timeoutNanos field is set.
		- #### getTimeoutNanos
		
		
		
		```
		public long getTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Specified by:
		`[getTimeoutNanos](MessageFormats.PersistentStateChangeEventOrBuilder.html#getTimeoutNanos())` in interface `[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The timeoutNanos.
		- #### setTimeoutNanos
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setTimeoutNanos​(long value)
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Parameters:
		`value` \- The timeoutNanos to set.
		Returns:
		This builder for chaining.
		- #### clearTimeoutNanos
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") clearTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html)*