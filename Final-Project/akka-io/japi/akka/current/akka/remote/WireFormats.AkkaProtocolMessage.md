---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessage.Builder.html
title: WireFormats.AkkaProtocolMessage.Builder
---

# WireFormats.AkkaProtocolMessage.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.AkkaProtocolMessage.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.AkkaProtocolMessage.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote")

---

```
public static final class WireFormats.AkkaProtocolMessage.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>
implements [WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")
```

```

 Message format of Akka Protocol.
 Message contains either a payload or an instruction.
 
```

 Protobuf type `AkkaProtocolMessage`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clearInstruction](#clearInstruction())()` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clearPayload](#clearPayload())()` | `optional bytes payload = 1;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote")` | `[getInstruction](#getInstruction())()` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote")` | `[getInstructionBuilder](#getInstructionBuilder())()` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote")` | `[getInstructionOrBuilder](#getInstructionOrBuilder())()` | `optional .AkkaControlMessage instruction = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getPayload](#getPayload())()` | `optional bytes payload = 1;` |
	| `boolean` | `[hasInstruction](#hasInstruction())()` | `optional .AkkaControlMessage instruction = 2;` |
	| `boolean` | `[hasPayload](#hasPayload())()` | `optional bytes payload = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.AkkaProtocolMessage))​([WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") other)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[mergeInstruction](#mergeInstruction(akka.remote.WireFormats.AkkaControlMessage))​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") value)` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setInstruction](#setInstruction(akka.remote.WireFormats.AkkaControlMessage))​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") value)` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setInstruction](#setInstruction(akka.remote.WireFormats.AkkaControlMessage.Builder))​([WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") builderForValue)` | `optional .AkkaControlMessage instruction = 2;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setPayload](#setPayload(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes payload = 1;` |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") mergeFrom​([WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasPayload
		
		
		
		```
		public boolean hasPayload()
		```
		
		`optional bytes payload = 1;`
		
		Specified by:
		`[hasPayload](WireFormats.AkkaProtocolMessageOrBuilder.html#hasPayload())` in interface `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the payload field is set.
		- #### getPayload
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPayload()
		```
		
		`optional bytes payload = 1;`
		
		Specified by:
		`[getPayload](WireFormats.AkkaProtocolMessageOrBuilder.html#getPayload())` in interface `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The payload.
		- #### setPayload
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setPayload​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes payload = 1;`
		
		Parameters:
		`value` \- The payload to set.
		Returns:
		This builder for chaining.
		- #### clearPayload
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clearPayload()
		```
		
		`optional bytes payload = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasInstruction
		
		
		
		```
		public boolean hasInstruction()
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		
		Specified by:
		`[hasInstruction](WireFormats.AkkaProtocolMessageOrBuilder.html#hasInstruction())` in interface `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the instruction field is set.
		- #### getInstruction
		
		
		
		```
		public [WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") getInstruction()
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		
		Specified by:
		`[getInstruction](WireFormats.AkkaProtocolMessageOrBuilder.html#getInstruction())` in interface `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`
		Returns:
		The instruction.
		- #### setInstruction
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setInstruction​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") value)
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		- #### setInstruction
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setInstruction​([WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		- #### mergeInstruction
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") mergeInstruction​([WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") value)
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		- #### clearInstruction
		
		
		
		```
		public [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") clearInstruction()
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		- #### getInstructionBuilder
		
		
		
		```
		public [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") getInstructionBuilder()
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		- #### getInstructionOrBuilder
		
		
		
		```
		public [WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote") getInstructionOrBuilder()
		```
		
		`optional .AkkaControlMessage instruction = 2;`
		
		Specified by:
		`[getInstructionOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html#getInstructionOrBuilder())` in interface `[WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaControlMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessage.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AkkaProtocolMessage.Builder.html)*