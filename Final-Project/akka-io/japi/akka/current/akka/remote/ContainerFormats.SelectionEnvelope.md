---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelope.Builder.html
title: ContainerFormats.SelectionEnvelope.Builder
---

# ContainerFormats.SelectionEnvelope.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.SelectionEnvelope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.SelectionEnvelope.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote")

---

```
public static final class ContainerFormats.SelectionEnvelope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>
implements [ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")
```

Protobuf type `SelectionEnvelope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addAllPattern](#addAllPattern(java.lang.Iterable))​(java.lang.Iterable<? extends [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")> values)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addPattern](#addPattern(int,akka.remote.ContainerFormats.Selection))​(int index,  [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addPattern](#addPattern(int,akka.remote.ContainerFormats.Selection.Builder))​(int index,  [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addPattern](#addPattern(akka.remote.ContainerFormats.Selection))​([ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addPattern](#addPattern(akka.remote.ContainerFormats.Selection.Builder))​([ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[addPatternBuilder](#addPatternBuilder())()` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[addPatternBuilder](#addPatternBuilder(int))​(int index)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearEnclosedMessage](#clearEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearMessageManifest](#clearMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearPattern](#clearPattern())()` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearSerializerId](#clearSerializerId())()` | `required int32 serializerId = 2;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clearWildcardFanOut](#clearWildcardFanOut())()` | optional for pre 2\.3\.4 compatibility |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getEnclosedMessage](#getEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageManifest](#getMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")` | `[getPattern](#getPattern(int))​(int index)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[getPatternBuilder](#getPatternBuilder(int))​(int index)` | `repeated .Selection pattern = 3;` |
	| `java.util.List<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>` | `[getPatternBuilderList](#getPatternBuilderList())()` | `repeated .Selection pattern = 3;` |
	| `int` | `[getPatternCount](#getPatternCount())()` | `repeated .Selection pattern = 3;` |
	| `java.util.List<[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")>` | `[getPatternList](#getPatternList())()` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")` | `[getPatternOrBuilder](#getPatternOrBuilder(int))​(int index)` | `repeated .Selection pattern = 3;` |
	| `java.util.List<? extends [ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")>` | `[getPatternOrBuilderList](#getPatternOrBuilderList())()` | `repeated .Selection pattern = 3;` |
	| `int` | `[getSerializerId](#getSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[getWildcardFanOut](#getWildcardFanOut())()` | optional for pre 2\.3\.4 compatibility |
	| `boolean` | `[hasEnclosedMessage](#hasEnclosedMessage())()` | `required bytes enclosedMessage = 1;` |
	| `boolean` | `[hasMessageManifest](#hasMessageManifest())()` | `optional bytes messageManifest = 4;` |
	| `boolean` | `[hasSerializerId](#hasSerializerId())()` | `required int32 serializerId = 2;` |
	| `boolean` | `[hasWildcardFanOut](#hasWildcardFanOut())()` | optional for pre 2\.3\.4 compatibility |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.SelectionEnvelope))​([ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[removePattern](#removePattern(int))​(int index)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setEnclosedMessage](#setEnclosedMessage(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required bytes enclosedMessage = 1;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setMessageManifest](#setMessageManifest(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes messageManifest = 4;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setPattern](#setPattern(int,akka.remote.ContainerFormats.Selection))​(int index,  [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setPattern](#setPattern(int,akka.remote.ContainerFormats.Selection.Builder))​(int index,  [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)` | `repeated .Selection pattern = 3;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setSerializerId](#setSerializerId(int))​(int value)` | `required int32 serializerId = 2;` |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")` | `[setWildcardFanOut](#setWildcardFanOut(boolean))​(boolean value)` | optional for pre 2\.3\.4 compatibility |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasEnclosedMessage
		
		
		
		```
		public boolean hasEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[hasEnclosedMessage](ContainerFormats.SelectionEnvelopeOrBuilder.html#hasEnclosedMessage())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the enclosedMessage field is set.
		- #### getEnclosedMessage
		
		
		
		```
		public akka.protobufv3.internal.ByteString getEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Specified by:
		`[getEnclosedMessage](ContainerFormats.SelectionEnvelopeOrBuilder.html#getEnclosedMessage())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The enclosedMessage.
		- #### setEnclosedMessage
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setEnclosedMessage​(akka.protobufv3.internal.ByteString value)
		```
		
		`required bytes enclosedMessage = 1;`
		
		Parameters:
		`value` \- The enclosedMessage to set.
		Returns:
		This builder for chaining.
		- #### clearEnclosedMessage
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearEnclosedMessage()
		```
		
		`required bytes enclosedMessage = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasSerializerId
		
		
		
		```
		public boolean hasSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[hasSerializerId](ContainerFormats.SelectionEnvelopeOrBuilder.html#hasSerializerId())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the serializerId field is set.
		- #### getSerializerId
		
		
		
		```
		public int getSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Specified by:
		`[getSerializerId](ContainerFormats.SelectionEnvelopeOrBuilder.html#getSerializerId())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The serializerId.
		- #### setSerializerId
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setSerializerId​(int value)
		```
		
		`required int32 serializerId = 2;`
		
		Parameters:
		`value` \- The serializerId to set.
		Returns:
		This builder for chaining.
		- #### clearSerializerId
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearSerializerId()
		```
		
		`required int32 serializerId = 2;`
		
		Returns:
		This builder for chaining.
		- #### getPatternList
		
		
		
		```
		public java.util.List<[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")> getPatternList()
		```
		
		`repeated .Selection pattern = 3;`
		
		Specified by:
		`[getPatternList](ContainerFormats.SelectionEnvelopeOrBuilder.html#getPatternList())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### getPatternCount
		
		
		
		```
		public int getPatternCount()
		```
		
		`repeated .Selection pattern = 3;`
		
		Specified by:
		`[getPatternCount](ContainerFormats.SelectionEnvelopeOrBuilder.html#getPatternCount())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### getPattern
		
		
		
		```
		public [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") getPattern​(int index)
		```
		
		`repeated .Selection pattern = 3;`
		
		Specified by:
		`[getPattern](ContainerFormats.SelectionEnvelopeOrBuilder.html#getPattern(int))` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### setPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setPattern​(int index,
		                                                             [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)
		```
		
		`repeated .Selection pattern = 3;`
		- #### setPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setPattern​(int index,
		                                                             [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Selection pattern = 3;`
		- #### addPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addPattern​([ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)
		```
		
		`repeated .Selection pattern = 3;`
		- #### addPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addPattern​(int index,
		                                                             [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") value)
		```
		
		`repeated .Selection pattern = 3;`
		- #### addPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addPattern​([ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Selection pattern = 3;`
		- #### addPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addPattern​(int index,
		                                                             [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .Selection pattern = 3;`
		- #### addAllPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") addAllPattern​(java.lang.Iterable<? extends [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")> values)
		```
		
		`repeated .Selection pattern = 3;`
		- #### clearPattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearPattern()
		```
		
		`repeated .Selection pattern = 3;`
		- #### removePattern
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") removePattern​(int index)
		```
		
		`repeated .Selection pattern = 3;`
		- #### getPatternBuilder
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") getPatternBuilder​(int index)
		```
		
		`repeated .Selection pattern = 3;`
		- #### getPatternOrBuilder
		
		
		
		```
		public [ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote") getPatternOrBuilder​(int index)
		```
		
		`repeated .Selection pattern = 3;`
		
		Specified by:
		`[getPatternOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html#getPatternOrBuilder(int))` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### getPatternOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")> getPatternOrBuilderList()
		```
		
		`repeated .Selection pattern = 3;`
		
		Specified by:
		`[getPatternOrBuilderList](ContainerFormats.SelectionEnvelopeOrBuilder.html#getPatternOrBuilderList())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		- #### addPatternBuilder
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") addPatternBuilder()
		```
		
		`repeated .Selection pattern = 3;`
		- #### addPatternBuilder
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") addPatternBuilder​(int index)
		```
		
		`repeated .Selection pattern = 3;`
		- #### getPatternBuilderList
		
		
		
		```
		public java.util.List<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")> getPatternBuilderList()
		```
		
		`repeated .Selection pattern = 3;`
		- #### hasMessageManifest
		
		
		
		```
		public boolean hasMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Specified by:
		`[hasMessageManifest](ContainerFormats.SelectionEnvelopeOrBuilder.html#hasMessageManifest())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the messageManifest field is set.
		- #### getMessageManifest
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Specified by:
		`[getMessageManifest](ContainerFormats.SelectionEnvelopeOrBuilder.html#getMessageManifest())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The messageManifest.
		- #### setMessageManifest
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setMessageManifest​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes messageManifest = 4;`
		
		Parameters:
		`value` \- The messageManifest to set.
		Returns:
		This builder for chaining.
		- #### clearMessageManifest
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearMessageManifest()
		```
		
		`optional bytes messageManifest = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasWildcardFanOut
		
		
		
		```
		public boolean hasWildcardFanOut()
		```
		
		
		```
		
		 optional for pre 2.3.4 compatibility 
		 
		```
		
		`optional bool wildcardFanOut = 5;`
		
		Specified by:
		`[hasWildcardFanOut](ContainerFormats.SelectionEnvelopeOrBuilder.html#hasWildcardFanOut())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the wildcardFanOut field is set.
		- #### getWildcardFanOut
		
		
		
		```
		public boolean getWildcardFanOut()
		```
		
		
		```
		
		 optional for pre 2.3.4 compatibility 
		 
		```
		
		`optional bool wildcardFanOut = 5;`
		
		Specified by:
		`[getWildcardFanOut](ContainerFormats.SelectionEnvelopeOrBuilder.html#getWildcardFanOut())` in interface `[ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The wildcardFanOut.
		- #### setWildcardFanOut
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setWildcardFanOut​(boolean value)
		```
		
		
		```
		
		 optional for pre 2.3.4 compatibility 
		 
		```
		
		`optional bool wildcardFanOut = 5;`
		
		Parameters:
		`value` \- The wildcardFanOut to set.
		Returns:
		This builder for chaining.
		- #### clearWildcardFanOut
		
		
		
		```
		public [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") clearWildcardFanOut()
		```
		
		
		```
		
		 optional for pre 2.3.4 compatibility 
		 
		```
		
		`optional bool wildcardFanOut = 5;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelope.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionEnvelope.Builder.html)*