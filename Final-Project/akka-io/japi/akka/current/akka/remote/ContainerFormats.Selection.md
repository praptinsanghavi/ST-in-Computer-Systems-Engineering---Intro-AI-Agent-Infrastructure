---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.Builder.html
title: ContainerFormats.Selection.Builder
---

# ContainerFormats.Selection.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.Selection.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.Selection.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")

---

```
public static final class ContainerFormats.Selection.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>
implements [ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")
```

Protobuf type `Selection`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clearMatcher](#clearMatcher())()` | `optional string matcher = 2;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clearType](#clearType())()` | `required .PatternType type = 1;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getMatcher](#getMatcher())()` | `optional string matcher = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getMatcherBytes](#getMatcherBytes())()` | `optional string matcher = 2;` |
	| `[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")` | `[getType](#getType())()` | `required .PatternType type = 1;` |
	| `boolean` | `[hasMatcher](#hasMatcher())()` | `optional string matcher = 2;` |
	| `boolean` | `[hasType](#hasType())()` | `required .PatternType type = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.Selection))​([ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setMatcher](#setMatcher(java.lang.String))​(java.lang.String value)` | `optional string matcher = 2;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setMatcherBytes](#setMatcherBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string matcher = 2;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setType](#setType(akka.remote.ContainerFormats.PatternType))​([ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") value)` | `required .PatternType type = 1;` |
	| `[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           int index,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasType
		
		
		
		```
		public boolean hasType()
		```
		
		`required .PatternType type = 1;`
		
		Specified by:
		`[hasType](ContainerFormats.SelectionOrBuilder.html#hasType())` in interface `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the type field is set.
		- #### getType
		
		
		
		```
		public [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") getType()
		```
		
		`required .PatternType type = 1;`
		
		Specified by:
		`[getType](ContainerFormats.SelectionOrBuilder.html#getType())` in interface `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`
		Returns:
		The type.
		- #### setType
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setType​([ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") value)
		```
		
		`required .PatternType type = 1;`
		
		Parameters:
		`value` \- The type to set.
		Returns:
		This builder for chaining.
		- #### clearType
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clearType()
		```
		
		`required .PatternType type = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasMatcher
		
		
		
		```
		public boolean hasMatcher()
		```
		
		`optional string matcher = 2;`
		
		Specified by:
		`[hasMatcher](ContainerFormats.SelectionOrBuilder.html#hasMatcher())` in interface `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the matcher field is set.
		- #### getMatcher
		
		
		
		```
		public java.lang.String getMatcher()
		```
		
		`optional string matcher = 2;`
		
		Specified by:
		`[getMatcher](ContainerFormats.SelectionOrBuilder.html#getMatcher())` in interface `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`
		Returns:
		The matcher.
		- #### getMatcherBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMatcherBytes()
		```
		
		`optional string matcher = 2;`
		
		Specified by:
		`[getMatcherBytes](ContainerFormats.SelectionOrBuilder.html#getMatcherBytes())` in interface `[ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for matcher.
		- #### setMatcher
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setMatcher​(java.lang.String value)
		```
		
		`optional string matcher = 2;`
		
		Parameters:
		`value` \- The matcher to set.
		Returns:
		This builder for chaining.
		- #### clearMatcher
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") clearMatcher()
		```
		
		`optional string matcher = 2;`
		
		Returns:
		This builder for chaining.
		- #### setMatcherBytes
		
		
		
		```
		public [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setMatcherBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string matcher = 2;`
		
		Parameters:
		`value` \- The bytes for matcher to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PatternType.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.SelectionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Selection.Builder.html)*