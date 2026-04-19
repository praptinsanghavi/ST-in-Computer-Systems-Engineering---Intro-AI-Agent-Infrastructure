---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationException.Builder.html
title: ContainerFormats.ActorInitializationException.Builder
---

# ContainerFormats.ActorInitializationException.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.ActorInitializationException.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.ActorInitializationException.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote")

---

```
public static final class ContainerFormats.ActorInitializationException.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>
implements [ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")
```

Protobuf type `ActorInitializationException`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clearActor](#clearActor())()` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clearCause](#clearCause())()` | `required .Payload cause = 3;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clearMessage](#clearMessage())()` | `required string message = 2;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getActor](#getActor())()` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getActorBuilder](#getActorBuilder())()` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getActorOrBuilder](#getActorOrBuilder())()` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getCause](#getCause())()` | `required .Payload cause = 3;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getCauseBuilder](#getCauseBuilder())()` | `required .Payload cause = 3;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getCauseOrBuilder](#getCauseOrBuilder())()` | `required .Payload cause = 3;` |
	| `[ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getMessage](#getMessage())()` | `required string message = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getMessageBytes](#getMessageBytes())()` | `required string message = 2;` |
	| `boolean` | `[hasActor](#hasActor())()` | `optional .ActorRef actor = 1;` |
	| `boolean` | `[hasCause](#hasCause())()` | `required .Payload cause = 3;` |
	| `boolean` | `[hasMessage](#hasMessage())()` | `required string message = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeActor](#mergeActor(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeCause](#mergeCause(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload cause = 3;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.ActorInitializationException))​([ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setActor](#setActor(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setActor](#setActor(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `optional .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setCause](#setCause(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload cause = 3;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setCause](#setCause(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload cause = 3;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setMessage](#setMessage(java.lang.String))​(java.lang.String value)` | `required string message = 2;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setMessageBytes](#setMessageBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string message = 2;` |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                              int index,
		                                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasActor
		
		
		
		```
		public boolean hasActor()
		```
		
		`optional .ActorRef actor = 1;`
		
		Specified by:
		`[hasActor](ContainerFormats.ActorInitializationExceptionOrBuilder.html#hasActor())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the actor field is set.
		- #### getActor
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getActor()
		```
		
		`optional .ActorRef actor = 1;`
		
		Specified by:
		`[getActor](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getActor())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		The actor.
		- #### setActor
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setActor​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`optional .ActorRef actor = 1;`
		- #### setActor
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setActor​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .ActorRef actor = 1;`
		- #### mergeActor
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeActor​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`optional .ActorRef actor = 1;`
		- #### clearActor
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clearActor()
		```
		
		`optional .ActorRef actor = 1;`
		- #### getActorBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getActorBuilder()
		```
		
		`optional .ActorRef actor = 1;`
		- #### getActorOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getActorOrBuilder()
		```
		
		`optional .ActorRef actor = 1;`
		
		Specified by:
		`[getActorOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getActorOrBuilder())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		- #### hasMessage
		
		
		
		```
		public boolean hasMessage()
		```
		
		`required string message = 2;`
		
		Specified by:
		`[hasMessage](ContainerFormats.ActorInitializationExceptionOrBuilder.html#hasMessage())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the message field is set.
		- #### getMessage
		
		
		
		```
		public java.lang.String getMessage()
		```
		
		`required string message = 2;`
		
		Specified by:
		`[getMessage](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getMessage())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		The message.
		- #### getMessageBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getMessageBytes()
		```
		
		`required string message = 2;`
		
		Specified by:
		`[getMessageBytes](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getMessageBytes())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for message.
		- #### setMessage
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setMessage​(java.lang.String value)
		```
		
		`required string message = 2;`
		
		Parameters:
		`value` \- The message to set.
		Returns:
		This builder for chaining.
		- #### clearMessage
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clearMessage()
		```
		
		`required string message = 2;`
		
		Returns:
		This builder for chaining.
		- #### setMessageBytes
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setMessageBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string message = 2;`
		
		Parameters:
		`value` \- The bytes for message to set.
		Returns:
		This builder for chaining.
		- #### hasCause
		
		
		
		```
		public boolean hasCause()
		```
		
		`required .Payload cause = 3;`
		
		Specified by:
		`[hasCause](ContainerFormats.ActorInitializationExceptionOrBuilder.html#hasCause())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the cause field is set.
		- #### getCause
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getCause()
		```
		
		`required .Payload cause = 3;`
		
		Specified by:
		`[getCause](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getCause())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		Returns:
		The cause.
		- #### setCause
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setCause​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload cause = 3;`
		- #### setCause
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setCause​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload cause = 3;`
		- #### mergeCause
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeCause​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload cause = 3;`
		- #### clearCause
		
		
		
		```
		public [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") clearCause()
		```
		
		`required .Payload cause = 3;`
		- #### getCauseBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") getCauseBuilder()
		```
		
		`required .Payload cause = 3;`
		- #### getCauseOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getCauseOrBuilder()
		```
		
		`required .Payload cause = 3;`
		
		Specified by:
		`[getCauseOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html#getCauseOrBuilder())` in interface `[ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationException.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationException.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationExceptionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationException.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorInitializationException.Builder.html)*