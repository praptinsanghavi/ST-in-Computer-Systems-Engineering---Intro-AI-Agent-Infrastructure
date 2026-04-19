---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentity.Builder.html
title: ContainerFormats.ActorIdentity.Builder
---

# ContainerFormats.ActorIdentity.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.ActorIdentity.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.ActorIdentity.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote")

---

```
public static final class ContainerFormats.ActorIdentity.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>
implements [ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")
```

Protobuf type `ActorIdentity`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clearCorrelationId](#clearCorrelationId())()` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clearRef](#clearRef())()` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getCorrelationId](#getCorrelationId())()` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getCorrelationIdBuilder](#getCorrelationIdBuilder())()` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getCorrelationIdOrBuilder](#getCorrelationIdOrBuilder())()` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getRef](#getRef())()` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getRefBuilder](#getRefBuilder())()` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getRefOrBuilder](#getRefOrBuilder())()` | `optional .ActorRef ref = 2;` |
	| `boolean` | `[hasCorrelationId](#hasCorrelationId())()` | `required .Payload correlationId = 1;` |
	| `boolean` | `[hasRef](#hasRef())()` | `optional .ActorRef ref = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeCorrelationId](#mergeCorrelationId(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.ActorIdentity))​([ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeRef](#mergeRef(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setCorrelationId](#setCorrelationId(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setCorrelationId](#setCorrelationId(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload correlationId = 1;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setRef](#setRef(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setRef](#setRef(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `optional .ActorRef ref = 2;` |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasCorrelationId
		
		
		
		```
		public boolean hasCorrelationId()
		```
		
		`required .Payload correlationId = 1;`
		
		Specified by:
		`[hasCorrelationId](ContainerFormats.ActorIdentityOrBuilder.html#hasCorrelationId())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the correlationId field is set.
		- #### getCorrelationId
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getCorrelationId()
		```
		
		`required .Payload correlationId = 1;`
		
		Specified by:
		`[getCorrelationId](ContainerFormats.ActorIdentityOrBuilder.html#getCorrelationId())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		Returns:
		The correlationId.
		- #### setCorrelationId
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setCorrelationId​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload correlationId = 1;`
		- #### setCorrelationId
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setCorrelationId​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload correlationId = 1;`
		- #### mergeCorrelationId
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeCorrelationId​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload correlationId = 1;`
		- #### clearCorrelationId
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clearCorrelationId()
		```
		
		`required .Payload correlationId = 1;`
		- #### getCorrelationIdBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") getCorrelationIdBuilder()
		```
		
		`required .Payload correlationId = 1;`
		- #### getCorrelationIdOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getCorrelationIdOrBuilder()
		```
		
		`required .Payload correlationId = 1;`
		
		Specified by:
		`[getCorrelationIdOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html#getCorrelationIdOrBuilder())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		- #### hasRef
		
		
		
		```
		public boolean hasRef()
		```
		
		`optional .ActorRef ref = 2;`
		
		Specified by:
		`[hasRef](ContainerFormats.ActorIdentityOrBuilder.html#hasRef())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the ref field is set.
		- #### getRef
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getRef()
		```
		
		`optional .ActorRef ref = 2;`
		
		Specified by:
		`[getRef](ContainerFormats.ActorIdentityOrBuilder.html#getRef())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		Returns:
		The ref.
		- #### setRef
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setRef​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`optional .ActorRef ref = 2;`
		- #### setRef
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setRef​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`optional .ActorRef ref = 2;`
		- #### mergeRef
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeRef​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`optional .ActorRef ref = 2;`
		- #### clearRef
		
		
		
		```
		public [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") clearRef()
		```
		
		`optional .ActorRef ref = 2;`
		- #### getRefBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getRefBuilder()
		```
		
		`optional .ActorRef ref = 2;`
		- #### getRefOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getRefOrBuilder()
		```
		
		`optional .ActorRef ref = 2;`
		
		Specified by:
		`[getRefOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html#getRefOrBuilder())` in interface `[ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentity.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentity.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentityOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentity.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorIdentity.Builder.html)*