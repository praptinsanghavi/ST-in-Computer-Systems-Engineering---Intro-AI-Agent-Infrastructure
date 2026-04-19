---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Throwable.Builder.html
title: ContainerFormats.Throwable.Builder
---

# ContainerFormats.Throwable.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.Throwable.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.Throwable.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")

---

```
public static final class ContainerFormats.Throwable.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>
implements [ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")
```

Protobuf type `Throwable`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addAllStackTrace](#addAllStackTrace(java.lang.Iterable))​(java.lang.Iterable<? extends [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")> values)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addStackTrace](#addStackTrace(int,akka.remote.ContainerFormats.StackTraceElement))​(int index,  [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addStackTrace](#addStackTrace(int,akka.remote.ContainerFormats.StackTraceElement.Builder))​(int index,  [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addStackTrace](#addStackTrace(akka.remote.ContainerFormats.StackTraceElement))​([ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[addStackTrace](#addStackTrace(akka.remote.ContainerFormats.StackTraceElement.Builder))​([ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[addStackTraceBuilder](#addStackTraceBuilder())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[addStackTraceBuilder](#addStackTraceBuilder(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearCause](#clearCause())()` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearClassName](#clearClassName())()` | `required string className = 1;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearMessage](#clearMessage())()` | `optional string message = 2;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clearStackTrace](#clearStackTrace())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getCause](#getCause())()` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getCauseBuilder](#getCauseBuilder())()` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getCauseOrBuilder](#getCauseOrBuilder())()` | `optional .Payload cause = 3;` |
	| `java.lang.String` | `[getClassName](#getClassName())()` | `required string className = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getClassNameBytes](#getClassNameBytes())()` | `required string className = 1;` |
	| `[ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getMessage](#getMessage())()` | `optional string message = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageBytes](#getMessageBytes())()` | `optional string message = 2;` |
	| `[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")` | `[getStackTrace](#getStackTrace(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[getStackTraceBuilder](#getStackTraceBuilder(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `java.util.List<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>` | `[getStackTraceBuilderList](#getStackTraceBuilderList())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `int` | `[getStackTraceCount](#getStackTraceCount())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `java.util.List<[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")>` | `[getStackTraceList](#getStackTraceList())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")` | `[getStackTraceOrBuilder](#getStackTraceOrBuilder(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `java.util.List<? extends [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")>` | `[getStackTraceOrBuilderList](#getStackTraceOrBuilderList())()` | `repeated .StackTraceElement stackTrace = 4;` |
	| `boolean` | `[hasCause](#hasCause())()` | `optional .Payload cause = 3;` |
	| `boolean` | `[hasClassName](#hasClassName())()` | `required string className = 1;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `optional string message = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[mergeCause](#mergeCause(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.Throwable))​([ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[removeStackTrace](#removeStackTrace(int))​(int index)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setCause](#setCause(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setCause](#setCause(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload cause = 3;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setClassName](#setClassName(java.lang.String))​(java.lang.String value)` | `required string className = 1;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setClassNameBytes](#setClassNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string className = 1;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(java.lang.String))​(java.lang.String value)` | `optional string message = 2;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setMessageBytes](#setMessageBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string message = 2;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setStackTrace](#setStackTrace(int,akka.remote.ContainerFormats.StackTraceElement))​(int index,  [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setStackTrace](#setStackTrace(int,akka.remote.ContainerFormats.StackTraceElement.Builder))​(int index,  [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)` | `repeated .StackTraceElement stackTrace = 4;` |
	| `[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
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
		- #### setClassName
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setClassName​(java.lang.String value)
		```
		
		`required string className = 1;`
		
		Parameters:
		`value` \- The className to set.
		Returns:
		This builder for chaining.
		- #### clearClassName
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearClassName()
		```
		
		`required string className = 1;`
		
		Returns:
		This builder for chaining.
		- #### setClassNameBytes
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setClassNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string className = 1;`
		
		Parameters:
		`value` \- The bytes for className to set.
		Returns:
		This builder for chaining.
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
		- #### setMessage
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setMessage​(java.lang.String value)
		```
		
		`optional string message = 2;`
		
		Parameters:
		`value` \- The message to set.
		Returns:
		This builder for chaining.
		- #### clearMessage
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearMessage()
		```
		
		`optional string message = 2;`
		
		Returns:
		This builder for chaining.
		- #### setMessageBytes
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setMessageBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string message = 2;`
		
		Parameters:
		`value` \- The bytes for message to set.
		Returns:
		This builder for chaining.
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
		- #### setCause
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setCause​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload cause = 3;`
		- #### setCause
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setCause​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload cause = 3;`
		- #### mergeCause
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") mergeCause​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload cause = 3;`
		- #### clearCause
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearCause()
		```
		
		`optional .Payload cause = 3;`
		- #### getCauseBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") getCauseBuilder()
		```
		
		`optional .Payload cause = 3;`
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
		- #### setStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setStackTrace​(int index,
		                                                        [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### setStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setStackTrace​(int index,
		                                                        [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addStackTrace​([ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addStackTrace​(int index,
		                                                        [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") value)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addStackTrace​([ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addStackTrace​(int index,
		                                                        [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addAllStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") addAllStackTrace​(java.lang.Iterable<? extends [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")> values)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### clearStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") clearStackTrace()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### removeStackTrace
		
		
		
		```
		public [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") removeStackTrace​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### getStackTraceBuilder
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") getStackTraceBuilder​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### getStackTraceOrBuilder
		
		
		
		```
		public [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote") getStackTraceOrBuilder​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceOrBuilder](ContainerFormats.ThrowableOrBuilder.html#getStackTraceOrBuilder(int))` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### getStackTraceOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")> getStackTraceOrBuilderList()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		
		Specified by:
		`[getStackTraceOrBuilderList](ContainerFormats.ThrowableOrBuilder.html#getStackTraceOrBuilderList())` in interface `[ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote")`
		- #### addStackTraceBuilder
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") addStackTraceBuilder()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### addStackTraceBuilder
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") addStackTraceBuilder​(int index)
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### getStackTraceBuilderList
		
		
		
		```
		public java.util.List<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")> getStackTraceBuilderList()
		```
		
		`repeated .StackTraceElement stackTrace = 4;`
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElementOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Throwable.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Throwable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ThrowableOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Throwable.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.Throwable.Builder.html)*