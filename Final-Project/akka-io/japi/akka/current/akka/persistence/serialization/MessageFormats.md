---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
title: MessageFormats.PersistentStateChangeEvent
---

# MessageFormats.PersistentStateChangeEvent

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageFormats.PersistentStateChangeEvent

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent

- All Implemented Interfaces:
`[MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[MessageFormats](MessageFormats.html "class in akka.persistence.serialization")

---

```
public static final class MessageFormats.PersistentStateChangeEvent
extends akka.protobufv3.internal.GeneratedMessageV3
implements [MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization")
```

```

 no longer created but needs to stay for reading persistent FSM events and snapshots
 
```

 Protobuf type `PersistentStateChangeEvent`

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | no longer created but needs to stay for reading persistent FSM events and snapshots |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[STATEIDENTIFIER_FIELD_NUMBER](#STATEIDENTIFIER_FIELD_NUMBER)` |  |
	| `static int` | `[TIMEOUT_FIELD_NUMBER](#TIMEOUT_FIELD_NUMBER)` |  |
	| `static int` | `[TIMEOUTNANOS_FIELD_NUMBER](#TIMEOUTNANOS_FIELD_NUMBER)` |  |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `java.lang.String` | `[getStateIdentifier](#getStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStateIdentifierBytes](#getStateIdentifierBytes())()` | `required string stateIdentifier = 1;` |
	| `java.lang.String` | `[getTimeout](#getTimeout())()` | not used in new records from 2\.4\.5 |
	| `akka.protobufv3.internal.ByteString` | `[getTimeoutBytes](#getTimeoutBytes())()` | not used in new records from 2\.4\.5 |
	| `long` | `[getTimeoutNanos](#getTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasStateIdentifier](#hasStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `boolean` | `[hasTimeout](#hasTimeout())()` | not used in new records from 2\.4\.5 |
	| `boolean` | `[hasTimeoutNanos](#hasTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[newBuilder](#newBuilder())()` |  |
	| `static [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[newBuilder](#newBuilder(akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent))​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") prototype)` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")>` | `[parser](#parser())()` |  |
	| `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### STATEIDENTIFIER\_FIELD\_NUMBER
		
		
		
		```
		public static final int STATEIDENTIFIER_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent.STATEIDENTIFIER_FIELD_NUMBER)
		- #### TIMEOUT\_FIELD\_NUMBER
		
		
		
		```
		public static final int TIMEOUT_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent.TIMEOUT_FIELD_NUMBER)
		- #### TIMEOUTNANOS\_FIELD\_NUMBER
		
		
		
		```
		public static final int TIMEOUTNANOS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent.TIMEOUTNANOS_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
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
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(java.nio.ByteBuffer data)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(java.nio.ByteBuffer data,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(byte[] data)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(byte[] data,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(java.io.InputStream input)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(java.io.InputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseDelimitedFrom​(java.io.InputStream input)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseDelimitedFrom​(java.io.InputStream input,
		                                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                    throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") newBuilder​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html)*