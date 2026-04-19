---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:50:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Throwable.html
title: ContainerFormats.Throwable
---

# ContainerFormats.Throwable

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.Throwable

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.ContainerFormats.Throwable

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`, `java.io.Serializable`

Enclosing class:
[ContainerFormats](ContainerFormats.html "class in akka.remote")

---

```
public static final class ContainerFormats.Throwable
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")
```

Protobuf type `Throwable`

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.ContainerFormats.Throwable)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | Protobuf type `Throwable` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CAUSE_FIELD_NUMBER](#CAUSE_FIELD_NUMBER)` |  |
	| `static int` | `[CLASSNAME_FIELD_NUMBER](#CLASSNAME_FIELD_NUMBER)` |  |
	| `static int` | `[MESSAGE_FIELD_NUMBER](#MESSAGE_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[STACKTRACE_FIELD_NUMBER](#STACKTRACE_FIELD_NUMBER)` |  |
	
	
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
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getCause](#getCause())()` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getCauseOrBuilder](#getCauseOrBuilder())()` | `optional .Payload cause = 3;` |
	| `java.lang.String` | `[getClassName](#getClassName())()` | `required string className = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getClassNameBytes](#getClassNameBytes())()` | `required string className = 1;` |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getMessage](#getMessage())()` | `optional string message = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageBytes](#getMessageBytes())()` | `optional string message = 2;` |
	| `akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")` | `[getStackTrace](#getStackTrace(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `int` | `[getStackTraceCount](#getStackTraceCount())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `java.util.List<[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")>` | `[getStackTraceList](#getStackTraceList())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")` | `[getStackTraceOrBuilder](#getStackTraceOrBuilder(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `java.util.List<? extends [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")>` | `[getStackTraceOrBuilderList](#getStackTraceOrBuilderList())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `boolean` | `[hasCause](#hasCause())()` | `optional .Payload cause = 3;` |
	| `boolean` | `[hasClassName](#hasClassName())()` | `required string className = 1;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasMessage](#hasMessage())()` | `optional string message = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[newBuilder](#newBuilder(akka.remote.ContainerFormats.Throwable))​([ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") prototype)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")>` | `[parser](#parser())()` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[toBuilder](#toBuilder())()` |  |
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
	
	
	
		- #### CLASSNAME\_FIELD\_NUMBER
		
		
		
		```
		public static final int CLASSNAME_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.Throwable.CLASSNAME_FIELD_NUMBER)
		- #### MESSAGE\_FIELD\_NUMBER
		
		
		
		```
		public static final int MESSAGE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.Throwable.MESSAGE_FIELD_NUMBER)
		- #### CAUSE\_FIELD\_NUMBER
		
		
		
		```
		public static final int CAUSE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.Throwable.CAUSE_FIELD_NUMBER)
		- #### STACKTRACE\_FIELD\_NUMBER
		
		
		
		```
		public static final int STACKTRACE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.Throwable.STACKTRACE_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")> PARSER
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
		- #### hasClassName
		
		
		
		```
		public boolean hasClassName()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[hasClassName](ContainerFormats.ThrowableOrBuilder.html#hasClassName())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the className field is set.
		- #### getClassName
		
		
		
		```
		public java.lang.String getClassName()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[getClassName](ContainerFormats.ThrowableOrBuilder.html#getClassName())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		The className.
		- #### getClassNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getClassNameBytes()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[getClassNameBytes](ContainerFormats.ThrowableOrBuilder.html#getClassNameBytes())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for className.
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`optional string message = 2;`
		
		Specified by:
		`[hasMessage](ContainerFormats.ThrowableOrBuilder.html#hasMessage())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public java.lang.String getMessage()
		```
		
		`optional string message = 2;`
		
		Specified by:
		`[getMessage](ContainerFormats.ThrowableOrBuilder.html#getMessage())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### getMessageBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageBytes()
		```
		
		`optional string message = 2;`
		
		Specified by:
		`[getMessageBytes](ContainerFormats.ThrowableOrBuilder.html#getMessageBytes())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for message.
		- #### hasCause
		
		
		
		```
		public boolean hasCause()
		```
		
		`optional .Payload cause = 3;`
		
		Specified by:
		`[hasCause](ContainerFormats.ThrowableOrBuilder.html#hasCause())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the cause field is set.
		- #### getCause
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getCause()
		```
		
		`optional .Payload cause = 3;`
		
		Specified by:
		`[getCause](ContainerFormats.ThrowableOrBuilder.html#getCause())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		Returns:
		The cause.
		- #### getCauseOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getCauseOrBuilder()
		```
		
		`optional .Payload cause = 3;`
		
		Specified by:
		`[getCauseOrBuilder](ContainerFormats.ThrowableOrBuilder.html#getCauseOrBuilder())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTraceList
		
		
		
		```
		public java.util.List<[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")> getStackTraceList()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceList](ContainerFormats.ThrowableOrBuilder.html#getStackTraceList())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTraceOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")> getStackTraceOrBuilderList()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceOrBuilderList](ContainerFormats.ThrowableOrBuilder.html#getStackTraceOrBuilderList())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTraceCount
		
		
		
		```
		public int getStackTraceCount()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceCount](ContainerFormats.ThrowableOrBuilder.html#getStackTraceCount())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTrace
		
		
		
		```
		public [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") getStackTrace​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTrace](ContainerFormats.ThrowableOrBuilder.html#getStackTrace(int))` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTraceOrBuilder
		
		
		
		```
		public [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote") getStackTraceOrBuilder​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceOrBuilder](ContainerFormats.ThrowableOrBuilder.html#getStackTraceOrBuilder(int))` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
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
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(java.nio.ByteBuffer data,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(byte[] data)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(byte[] data,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(java.io.InputStream input)
		                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(java.io.InputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseDelimitedFrom​(java.io.InputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                            throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") newBuilder​([ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.StackTraceElement.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.StackTraceElementOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Throwable.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Throwable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.ThrowableOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Throwable.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/ContainerFormats.Throwable.html)*