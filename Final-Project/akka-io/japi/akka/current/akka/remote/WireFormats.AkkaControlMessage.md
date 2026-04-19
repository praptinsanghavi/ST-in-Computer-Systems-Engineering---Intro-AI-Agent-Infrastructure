---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.Builder.html
title: WireFormats.AkkaControlMessage.Builder
---

# WireFormats.AkkaControlMessage.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AkkaControlMessage.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AkkaControlMessage.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote")

---

```
public static final class WireFormats.AkkaControlMessage.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>
implements [WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")
```

```

 Defines some control messages for the remoting
 
```

 Protobuf type `AkkaControlMessage`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clearCommandType](#clearCommandType())()` | `required .CommandType commandType = 1;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clearHandshakeInfo](#clearHandshakeInfo())()` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.CommandType](WireFormats.CommandType.html "enum in akka.remote")` | `[getCommandType](#getCommandType())()` | `required .CommandType commandType = 1;` |
	| `[WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote")` | `[getHandshakeInfo](#getHandshakeInfo())()` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote")` | `[getHandshakeInfoBuilder](#getHandshakeInfoBuilder())()` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote")` | `[getHandshakeInfoOrBuilder](#getHandshakeInfoOrBuilder())()` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `boolean` | `[hasCommandType](#hasCommandType())()` | `required .CommandType commandType = 1;` |
	| `boolean` | `[hasHandshakeInfo](#hasHandshakeInfo())()` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AkkaControlMessage))​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") other)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[mergeHandshakeInfo](#mergeHandshakeInfo(akka.remote.WireFormats.AkkaHandshakeInfo))​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") value)` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setCommandType](#setCommandType(akka.remote.WireFormats.CommandType))​([WireFormats.CommandType](WireFormats.CommandType.html "enum in akka.remote") value)` | `required .CommandType commandType = 1;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setHandshakeInfo](#setHandshakeInfo(akka.remote.WireFormats.AkkaHandshakeInfo))​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") value)` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setHandshakeInfo](#setHandshakeInfo(akka.remote.WireFormats.AkkaHandshakeInfo.Builder))​([WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") builderForValue)` | `optional .AkkaHandshakeInfo handshakeInfo = 2;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasCommandType
		
		
		
		```
		public boolean hasCommandType()
		```
		
		`required .CommandType commandType = 1;`
		
		Specified by:
		`[hasCommandType](WireFormats.AkkaControlMessageOrBuilder.html#hasCommandType())` in interface `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the commandType field is set.
		- #### getCommandType
		
		
		
		```
		public [WireFormats.CommandType](WireFormats.CommandType.html "enum in akka.remote") getCommandType()
		```
		
		`required .CommandType commandType = 1;`
		
		Specified by:
		`[getCommandType](WireFormats.AkkaControlMessageOrBuilder.html#getCommandType())` in interface `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The commandType.
		- #### setCommandType
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setCommandType​([WireFormats.CommandType](WireFormats.CommandType.html "enum in akka.remote") value)
		```
		
		`required .CommandType commandType = 1;`
		
		Parameters:
		`value` \- The commandType to set.
		Returns:
		This builder for chaining.
		- #### clearCommandType
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clearCommandType()
		```
		
		`required .CommandType commandType = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasHandshakeInfo
		
		
		
		```
		public boolean hasHandshakeInfo()
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		
		Specified by:
		`[hasHandshakeInfo](WireFormats.AkkaControlMessageOrBuilder.html#hasHandshakeInfo())` in interface `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the handshakeInfo field is set.
		- #### getHandshakeInfo
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") getHandshakeInfo()
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		
		Specified by:
		`[getHandshakeInfo](WireFormats.AkkaControlMessageOrBuilder.html#getHandshakeInfo())` in interface `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The handshakeInfo.
		- #### setHandshakeInfo
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setHandshakeInfo​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") value)
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		- #### setHandshakeInfo
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setHandshakeInfo​([WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		- #### mergeHandshakeInfo
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") mergeHandshakeInfo​([WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") value)
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		- #### clearHandshakeInfo
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") clearHandshakeInfo()
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		- #### getHandshakeInfoBuilder
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") getHandshakeInfoBuilder()
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		- #### getHandshakeInfoOrBuilder
		
		
		
		```
		public [WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote") getHandshakeInfoOrBuilder()
		```
		
		`optional .AkkaHandshakeInfo handshakeInfo = 2;`
		
		Specified by:
		`[getHandshakeInfoOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html#getHandshakeInfoOrBuilder())` in interface `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaHandshakeInfo.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaHandshakeInfo.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaHandshakeInfoOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.CommandType.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.Builder.html)*