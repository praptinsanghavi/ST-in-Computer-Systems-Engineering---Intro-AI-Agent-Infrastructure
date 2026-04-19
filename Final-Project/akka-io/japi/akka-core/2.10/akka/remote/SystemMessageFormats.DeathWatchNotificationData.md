---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationData.Builder.html
title: SystemMessageFormats.DeathWatchNotificationData.Builder
---

# SystemMessageFormats.DeathWatchNotificationData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class SystemMessageFormats.DeathWatchNotificationData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")\>
			- - akka.remote.SystemMessageFormats.DeathWatchNotificationData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote")

---

```
public static final class SystemMessageFormats.DeathWatchNotificationData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>
implements [SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")
```

Protobuf type `DeathWatchNotificationData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clearActor](#clearActor())()` | `required .ActorRef actor = 1;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clearAddressTerminated](#clearAddressTerminated())()` | `required bool addressTerminated = 3;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clearExistenceConfirmed](#clearExistenceConfirmed())()` | `required bool existenceConfirmed = 2;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getActor](#getActor())()` | `required .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getActorBuilder](#getActorBuilder())()` | `required .ActorRef actor = 1;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getActorOrBuilder](#getActorOrBuilder())()` | `required .ActorRef actor = 1;` |
	| `boolean` | `[getAddressTerminated](#getAddressTerminated())()` | `required bool addressTerminated = 3;` |
	| `[SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getExistenceConfirmed](#getExistenceConfirmed())()` | `required bool existenceConfirmed = 2;` |
	| `boolean` | `[hasActor](#hasActor())()` | `required .ActorRef actor = 1;` |
	| `boolean` | `[hasAddressTerminated](#hasAddressTerminated())()` | `required bool addressTerminated = 3;` |
	| `boolean` | `[hasExistenceConfirmed](#hasExistenceConfirmed())()` | `required bool existenceConfirmed = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[mergeActor](#mergeActor(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef actor = 1;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.SystemMessageFormats.DeathWatchNotificationData))​([SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") other)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setActor](#setActor(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef actor = 1;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setActor](#setActor(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRef actor = 1;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setAddressTerminated](#setAddressTerminated(boolean))​(boolean value)` | `required bool addressTerminated = 3;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setExistenceConfirmed](#setExistenceConfirmed(boolean))​(boolean value)` | `required bool existenceConfirmed = 2;` |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                int index,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") mergeFrom​([SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasActor
		
		
		
		```
		public boolean hasActor()
		```
		
		`required .ActorRef actor = 1;`
		
		Specified by:
		`[hasActor](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#hasActor())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the actor field is set.
		- #### getActor
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getActor()
		```
		
		`required .ActorRef actor = 1;`
		
		Specified by:
		`[getActor](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#getActor())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The actor.
		- #### setActor
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setActor​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef actor = 1;`
		- #### setActor
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setActor​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRef actor = 1;`
		- #### mergeActor
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") mergeActor​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef actor = 1;`
		- #### clearActor
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clearActor()
		```
		
		`required .ActorRef actor = 1;`
		- #### getActorBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getActorBuilder()
		```
		
		`required .ActorRef actor = 1;`
		- #### getActorOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getActorOrBuilder()
		```
		
		`required .ActorRef actor = 1;`
		
		Specified by:
		`[getActorOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#getActorOrBuilder())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		- #### hasExistenceConfirmed
		
		
		
		```
		public boolean hasExistenceConfirmed()
		```
		
		`required bool existenceConfirmed = 2;`
		
		Specified by:
		`[hasExistenceConfirmed](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#hasExistenceConfirmed())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the existenceConfirmed field is set.
		- #### getExistenceConfirmed
		
		
		
		```
		public boolean getExistenceConfirmed()
		```
		
		`required bool existenceConfirmed = 2;`
		
		Specified by:
		`[getExistenceConfirmed](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#getExistenceConfirmed())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The existenceConfirmed.
		- #### setExistenceConfirmed
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setExistenceConfirmed​(boolean value)
		```
		
		`required bool existenceConfirmed = 2;`
		
		Parameters:
		`value` \- The existenceConfirmed to set.
		Returns:
		This builder for chaining.
		- #### clearExistenceConfirmed
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clearExistenceConfirmed()
		```
		
		`required bool existenceConfirmed = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasAddressTerminated
		
		
		
		```
		public boolean hasAddressTerminated()
		```
		
		`required bool addressTerminated = 3;`
		
		Specified by:
		`[hasAddressTerminated](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#hasAddressTerminated())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the addressTerminated field is set.
		- #### getAddressTerminated
		
		
		
		```
		public boolean getAddressTerminated()
		```
		
		`required bool addressTerminated = 3;`
		
		Specified by:
		`[getAddressTerminated](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html#getAddressTerminated())` in interface `[SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The addressTerminated.
		- #### setAddressTerminated
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setAddressTerminated​(boolean value)
		```
		
		`required bool addressTerminated = 3;`
		
		Parameters:
		`value` \- The addressTerminated to set.
		Returns:
		This builder for chaining.
		- #### clearAddressTerminated
		
		
		
		```
		public [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") clearAddressTerminated()
		```
		
		`required bool addressTerminated = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationData.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.DeathWatchNotificationData.Builder.html)*