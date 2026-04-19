---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.Builder.html
title: MessageFormats.PersistentFSMSnapshot.Builder
---

# MessageFormats.PersistentFSMSnapshot.Builder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.PersistentFSMSnapshot.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")\>
			- - akka.persistence.serialization.MessageFormats.PersistentFSMSnapshot.Builder

- All Implemented Interfaces:
`[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.PersistentFSMSnapshot.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>
implements [MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")
```

Protobuf type `PersistentFSMSnapshot`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization")` | `[build](#build())()` |  |
	| `[MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization")` | `[buildPartial](#buildPartial())()` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clear](#clear())()` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearData](#clearData())()` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearStateIdentifier](#clearStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clearTimeoutNanos](#clearTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[clone](#clone())()` |  |
	| `[MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization")` | `[getData](#getData())()` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization")` | `[getDataBuilder](#getDataBuilder())()` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization")` | `[getDataOrBuilder](#getDataOrBuilder())()` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getStateIdentifier](#getStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStateIdentifierBytes](#getStateIdentifierBytes())()` | `required string stateIdentifier = 1;` |
	| `long` | `[getTimeoutNanos](#getTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `boolean` | `[hasData](#hasData())()` | `required .PersistentPayload data = 2;` |
	| `boolean` | `[hasStateIdentifier](#hasStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `boolean` | `[hasTimeoutNanos](#hasTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeData](#mergeData(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.persistence.serialization.MessageFormats.PersistentFSMSnapshot))​([MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") other)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setData](#setData(akka.persistence.serialization.MessageFormats.PersistentPayload))​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setData](#setData(akka.persistence.serialization.MessageFormats.PersistentPayload.Builder))​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)` | `required .PersistentPayload data = 2;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setStateIdentifier](#setStateIdentifier(java.lang.String))​(java.lang.String value)` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setStateIdentifierBytes](#setStateIdentifierBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string stateIdentifier = 1;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setTimeoutNanos](#setTimeoutNanos(long))​(long value)` | `optional int64 timeoutNanos = 3;` |
	| `[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clear
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### setField
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                             java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clearField
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### clearOneof
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### setRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     int index,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### addRepeatedField
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                     java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​([MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeFrom
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                       throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		Throws:
		`java.io.IOException`
		- #### hasStateIdentifier
		
		
		
		```
		public boolean hasStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[hasStateIdentifier](MessageFormats.PersistentFSMSnapshotOrBuilder.html#hasStateIdentifier())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the stateIdentifier field is set.
		- #### getStateIdentifier
		
		
		
		```
		public java.lang.String getStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[getStateIdentifier](MessageFormats.PersistentFSMSnapshotOrBuilder.html#getStateIdentifier())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The stateIdentifier.
		- #### getStateIdentifierBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getStateIdentifierBytes()
		```
		
		`required string stateIdentifier = 1;`
		
		Specified by:
		`[getStateIdentifierBytes](MessageFormats.PersistentFSMSnapshotOrBuilder.html#getStateIdentifierBytes())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The bytes for stateIdentifier.
		- #### setStateIdentifier
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setStateIdentifier​(java.lang.String value)
		```
		
		`required string stateIdentifier = 1;`
		
		Parameters:
		`value` \- The stateIdentifier to set.
		Returns:
		This builder for chaining.
		- #### clearStateIdentifier
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clearStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Returns:
		This builder for chaining.
		- #### setStateIdentifierBytes
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setStateIdentifierBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string stateIdentifier = 1;`
		
		Parameters:
		`value` \- The bytes for stateIdentifier to set.
		Returns:
		This builder for chaining.
		- #### hasData
		
		
		
		```
		public boolean hasData()
		```
		
		`required .PersistentPayload data = 2;`
		
		Specified by:
		`[hasData](MessageFormats.PersistentFSMSnapshotOrBuilder.html#hasData())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the data field is set.
		- #### getData
		
		
		
		```
		public [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") getData()
		```
		
		`required .PersistentPayload data = 2;`
		
		Specified by:
		`[getData](MessageFormats.PersistentFSMSnapshotOrBuilder.html#getData())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The data.
		- #### setData
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setData​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`required .PersistentPayload data = 2;`
		- #### setData
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setData​([MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") builderForValue)
		```
		
		`required .PersistentPayload data = 2;`
		- #### mergeData
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") mergeData​([MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") value)
		```
		
		`required .PersistentPayload data = 2;`
		- #### clearData
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clearData()
		```
		
		`required .PersistentPayload data = 2;`
		- #### getDataBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") getDataBuilder()
		```
		
		`required .PersistentPayload data = 2;`
		- #### getDataOrBuilder
		
		
		
		```
		public [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") getDataOrBuilder()
		```
		
		`required .PersistentPayload data = 2;`
		
		Specified by:
		`[getDataOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html#getDataOrBuilder())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		- #### hasTimeoutNanos
		
		
		
		```
		public boolean hasTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Specified by:
		`[hasTimeoutNanos](MessageFormats.PersistentFSMSnapshotOrBuilder.html#hasTimeoutNanos())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		Whether the timeoutNanos field is set.
		- #### getTimeoutNanos
		
		
		
		```
		public long getTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Specified by:
		`[getTimeoutNanos](MessageFormats.PersistentFSMSnapshotOrBuilder.html#getTimeoutNanos())` in interface `[MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization")`
		Returns:
		The timeoutNanos.
		- #### setTimeoutNanos
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setTimeoutNanos​(long value)
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Parameters:
		`value` \- The timeoutNanos to set.
		Returns:
		This builder for chaining.
		- #### clearTimeoutNanos
		
		
		
		```
		public [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") clearTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshotOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.Builder.html)*