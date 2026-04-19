---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.Builder.html
title: ContainerFormats.StackTraceElement.Builder
---

# ContainerFormats.StackTraceElement.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.StackTraceElement.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.StackTraceElement.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")

---

```
public static final class ContainerFormats.StackTraceElement.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>
implements [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")
```

Protobuf type `StackTraceElement`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearClassName](#clearClassName())()` | `required string className = 1;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearFileName](#clearFileName())()` | `required string fileName = 3;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearLineNumber](#clearLineNumber())()` | `required int32 lineNumber = 4;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearMethodName](#clearMethodName())()` | `required string methodName = 2;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getClassName](#getClassName())()` | `required string className = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getClassNameBytes](#getClassNameBytes())()` | `required string className = 1;` |
	| `[ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getFileName](#getFileName())()` | `required string fileName = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getFileNameBytes](#getFileNameBytes())()` | `required string fileName = 3;` |
	| `int` | `[getLineNumber](#getLineNumber())()` | `required int32 lineNumber = 4;` |
	| `java.lang.String` | `[getMethodName](#getMethodName())()` | `required string methodName = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getMethodNameBytes](#getMethodNameBytes())()` | `required string methodName = 2;` |
	| `boolean` | `[hasClassName](#hasClassName())()` | `required string className = 1;` |
	| `boolean` | `[hasFileName](#hasFileName())()` | `required string fileName = 3;` |
	| `boolean` | `[hasLineNumber](#hasLineNumber())()` | `required int32 lineNumber = 4;` |
	| `boolean` | `[hasMethodName](#hasMethodName())()` | `required string methodName = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.StackTraceElement))​([ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setClassName](#setClassName(java.lang.String))​(java.lang.String value)` | `required string className = 1;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setClassNameBytes](#setClassNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string className = 1;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setFileName](#setFileName(java.lang.String))​(java.lang.String value)` | `required string fileName = 3;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setFileNameBytes](#setFileNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string fileName = 3;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setLineNumber](#setLineNumber(int))​(int value)` | `required int32 lineNumber = 4;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setMethodName](#setMethodName(java.lang.String))​(java.lang.String value)` | `required string methodName = 2;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setMethodNameBytes](#setMethodNameBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string methodName = 2;` |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasClassName
		
		
		
		```
		public boolean hasClassName()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[hasClassName](ContainerFormats.StackTraceElementOrBuilder.html#hasClassName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the className field is set.
		- #### getClassName
		
		
		
		```
		public java.lang.String getClassName()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[getClassName](ContainerFormats.StackTraceElementOrBuilder.html#getClassName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The className.
		- #### getClassNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getClassNameBytes()
		```
		
		`required string className = 1;`
		
		Specified by:
		`[getClassNameBytes](ContainerFormats.StackTraceElementOrBuilder.html#getClassNameBytes())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for className.
		- #### setClassName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setClassName​(java.lang.String value)
		```
		
		`required string className = 1;`
		
		Parameters:
		`value` \- The className to set.
		Returns:
		This builder for chaining.
		- #### clearClassName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearClassName()
		```
		
		`required string className = 1;`
		
		Returns:
		This builder for chaining.
		- #### setClassNameBytes
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setClassNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string className = 1;`
		
		Parameters:
		`value` \- The bytes for className to set.
		Returns:
		This builder for chaining.
		- #### hasMethodName
		
		
		
		```
		public boolean hasMethodName()
		```
		
		`required string methodName = 2;`
		
		Specified by:
		`[hasMethodName](ContainerFormats.StackTraceElementOrBuilder.html#hasMethodName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the methodName field is set.
		- #### getMethodName
		
		
		
		```
		public java.lang.String getMethodName()
		```
		
		`required string methodName = 2;`
		
		Specified by:
		`[getMethodName](ContainerFormats.StackTraceElementOrBuilder.html#getMethodName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The methodName.
		- #### getMethodNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMethodNameBytes()
		```
		
		`required string methodName = 2;`
		
		Specified by:
		`[getMethodNameBytes](ContainerFormats.StackTraceElementOrBuilder.html#getMethodNameBytes())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for methodName.
		- #### setMethodName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setMethodName​(java.lang.String value)
		```
		
		`required string methodName = 2;`
		
		Parameters:
		`value` \- The methodName to set.
		Returns:
		This builder for chaining.
		- #### clearMethodName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearMethodName()
		```
		
		`required string methodName = 2;`
		
		Returns:
		This builder for chaining.
		- #### setMethodNameBytes
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setMethodNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string methodName = 2;`
		
		Parameters:
		`value` \- The bytes for methodName to set.
		Returns:
		This builder for chaining.
		- #### hasFileName
		
		
		
		```
		public boolean hasFileName()
		```
		
		`required string fileName = 3;`
		
		Specified by:
		`[hasFileName](ContainerFormats.StackTraceElementOrBuilder.html#hasFileName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the fileName field is set.
		- #### getFileName
		
		
		
		```
		public java.lang.String getFileName()
		```
		
		`required string fileName = 3;`
		
		Specified by:
		`[getFileName](ContainerFormats.StackTraceElementOrBuilder.html#getFileName())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The fileName.
		- #### getFileNameBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getFileNameBytes()
		```
		
		`required string fileName = 3;`
		
		Specified by:
		`[getFileNameBytes](ContainerFormats.StackTraceElementOrBuilder.html#getFileNameBytes())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for fileName.
		- #### setFileName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setFileName​(java.lang.String value)
		```
		
		`required string fileName = 3;`
		
		Parameters:
		`value` \- The fileName to set.
		Returns:
		This builder for chaining.
		- #### clearFileName
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearFileName()
		```
		
		`required string fileName = 3;`
		
		Returns:
		This builder for chaining.
		- #### setFileNameBytes
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setFileNameBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string fileName = 3;`
		
		Parameters:
		`value` \- The bytes for fileName to set.
		Returns:
		This builder for chaining.
		- #### hasLineNumber
		
		
		
		```
		public boolean hasLineNumber()
		```
		
		`required int32 lineNumber = 4;`
		
		Specified by:
		`[hasLineNumber](ContainerFormats.StackTraceElementOrBuilder.html#hasLineNumber())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the lineNumber field is set.
		- #### getLineNumber
		
		
		
		```
		public int getLineNumber()
		```
		
		`required int32 lineNumber = 4;`
		
		Specified by:
		`[getLineNumber](ContainerFormats.StackTraceElementOrBuilder.html#getLineNumber())` in interface `[ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote")`
		Returns:
		The lineNumber.
		- #### setLineNumber
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setLineNumber​(int value)
		```
		
		`required int32 lineNumber = 4;`
		
		Parameters:
		`value` \- The lineNumber to set.
		Returns:
		This builder for chaining.
		- #### clearLineNumber
		
		
		
		```
		public [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") clearLineNumber()
		```
		
		`required int32 lineNumber = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElementOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.StackTraceElement.Builder.html)*