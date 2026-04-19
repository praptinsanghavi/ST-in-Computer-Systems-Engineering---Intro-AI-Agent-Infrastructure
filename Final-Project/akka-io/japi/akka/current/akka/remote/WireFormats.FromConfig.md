---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfig.Builder.html
title: WireFormats.FromConfig.Builder
---

# WireFormats.FromConfig.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.FromConfig.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.FromConfig.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote")

---

```
public static final class WireFormats.FromConfig.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>
implements [WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")
```

Protobuf type `FromConfig`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clearResizer](#clearResizer())()` | `optional .Payload resizer = 1;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clearRouterDispatcher](#clearRouterDispatcher())()` | `optional string routerDispatcher = 2;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getResizer](#getResizer())()` | `optional .Payload resizer = 1;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getResizerBuilder](#getResizerBuilder())()` | `optional .Payload resizer = 1;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getResizerOrBuilder](#getResizerOrBuilder())()` | `optional .Payload resizer = 1;` |
	| `java.lang.String` | `[getRouterDispatcher](#getRouterDispatcher())()` | `optional string routerDispatcher = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getRouterDispatcherBytes](#getRouterDispatcherBytes())()` | `optional string routerDispatcher = 2;` |
	| `boolean` | `[hasResizer](#hasResizer())()` | `optional .Payload resizer = 1;` |
	| `boolean` | `[hasRouterDispatcher](#hasRouterDispatcher())()` | `optional string routerDispatcher = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.FromConfig))​([WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") other)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[mergeResizer](#mergeResizer(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload resizer = 1;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setResizer](#setResizer(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `optional .Payload resizer = 1;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setResizer](#setResizer(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `optional .Payload resizer = 1;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setRouterDispatcher](#setRouterDispatcher(java.lang.String))​(java.lang.String value)` | `optional string routerDispatcher = 2;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setRouterDispatcherBytes](#setRouterDispatcherBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string routerDispatcher = 2;` |
	| `[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") mergeFrom​([WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasResizer
		
		
		
		```
		public boolean hasResizer()
		```
		
		`optional .Payload resizer = 1;`
		
		Specified by:
		`[hasResizer](WireFormats.FromConfigOrBuilder.html#hasResizer())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the resizer field is set.
		- #### getResizer
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getResizer()
		```
		
		`optional .Payload resizer = 1;`
		
		Specified by:
		`[getResizer](WireFormats.FromConfigOrBuilder.html#getResizer())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		The resizer.
		- #### setResizer
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setResizer​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload resizer = 1;`
		- #### setResizer
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setResizer​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .Payload resizer = 1;`
		- #### mergeResizer
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") mergeResizer​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`optional .Payload resizer = 1;`
		- #### clearResizer
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clearResizer()
		```
		
		`optional .Payload resizer = 1;`
		- #### getResizerBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") getResizerBuilder()
		```
		
		`optional .Payload resizer = 1;`
		- #### getResizerOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getResizerOrBuilder()
		```
		
		`optional .Payload resizer = 1;`
		
		Specified by:
		`[getResizerOrBuilder](WireFormats.FromConfigOrBuilder.html#getResizerOrBuilder())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		- #### hasRouterDispatcher
		
		
		
		```
		public boolean hasRouterDispatcher()
		```
		
		`optional string routerDispatcher = 2;`
		
		Specified by:
		`[hasRouterDispatcher](WireFormats.FromConfigOrBuilder.html#hasRouterDispatcher())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the routerDispatcher field is set.
		- #### getRouterDispatcher
		
		
		
		```
		public java.lang.String getRouterDispatcher()
		```
		
		`optional string routerDispatcher = 2;`
		
		Specified by:
		`[getRouterDispatcher](WireFormats.FromConfigOrBuilder.html#getRouterDispatcher())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		The routerDispatcher.
		- #### getRouterDispatcherBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRouterDispatcherBytes()
		```
		
		`optional string routerDispatcher = 2;`
		
		Specified by:
		`[getRouterDispatcherBytes](WireFormats.FromConfigOrBuilder.html#getRouterDispatcherBytes())` in interface `[WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for routerDispatcher.
		- #### setRouterDispatcher
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setRouterDispatcher​(java.lang.String value)
		```
		
		`optional string routerDispatcher = 2;`
		
		Parameters:
		`value` \- The routerDispatcher to set.
		Returns:
		This builder for chaining.
		- #### clearRouterDispatcher
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") clearRouterDispatcher()
		```
		
		`optional string routerDispatcher = 2;`
		
		Returns:
		This builder for chaining.
		- #### setRouterDispatcherBytes
		
		
		
		```
		public [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setRouterDispatcherBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string routerDispatcher = 2;`
		
		Parameters:
		`value` \- The bytes for routerDispatcher to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfig.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfig.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfigOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfig.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.FromConfig.Builder.html)*