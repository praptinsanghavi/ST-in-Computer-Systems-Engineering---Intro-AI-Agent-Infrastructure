---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html
title: WireFormats.ActorRefData.Builder
---

# WireFormats.ActorRefData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.ActorRefData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.ActorRefData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")

---

```
public static final class WireFormats.ActorRefData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>
implements [WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")
```

```

 Defines a remote ActorRef that "remembers" and uses its original Actor instance
 on the original node.
 
```

 Protobuf type `ActorRefData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[clearPath](#clearPath())()` | `required string path = 1;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 1;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") other)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 1;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 1;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         int index,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") mergeFrom​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[hasPath](WireFormats.ActorRefDataOrBuilder.html#hasPath())` in interface `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPath](WireFormats.ActorRefDataOrBuilder.html#getPath())` in interface `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPathBytes](WireFormats.ActorRefDataOrBuilder.html#getPathBytes())` in interface `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") setPath​(java.lang.String value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") clearPath()
		```
		
		`required string path = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html)*