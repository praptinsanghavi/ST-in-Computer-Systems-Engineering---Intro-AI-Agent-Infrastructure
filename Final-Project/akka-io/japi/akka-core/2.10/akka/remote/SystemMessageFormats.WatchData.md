---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchData.Builder.html
title: SystemMessageFormats.WatchData.Builder
---

# SystemMessageFormats.WatchData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class SystemMessageFormats.WatchData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")\>
			- - akka.remote.SystemMessageFormats.WatchData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote")

---

```
public static final class SystemMessageFormats.WatchData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>
implements [SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")
```

Protobuf type `WatchData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clearWatchee](#clearWatchee())()` | `required .ActorRef watchee = 1;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clearWatcher](#clearWatcher())()` | `required .ActorRef watcher = 2;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getWatchee](#getWatchee())()` | `required .ActorRef watchee = 1;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getWatcheeBuilder](#getWatcheeBuilder())()` | `required .ActorRef watchee = 1;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getWatcheeOrBuilder](#getWatcheeOrBuilder())()` | `required .ActorRef watchee = 1;` |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getWatcher](#getWatcher())()` | `required .ActorRef watcher = 2;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getWatcherBuilder](#getWatcherBuilder())()` | `required .ActorRef watcher = 2;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getWatcherOrBuilder](#getWatcherOrBuilder())()` | `required .ActorRef watcher = 2;` |
	| `boolean` | `[hasWatchee](#hasWatchee())()` | `required .ActorRef watchee = 1;` |
	| `boolean` | `[hasWatcher](#hasWatcher())()` | `required .ActorRef watcher = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.SystemMessageFormats.WatchData))​([SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") other)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeWatchee](#mergeWatchee(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef watchee = 1;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[mergeWatcher](#mergeWatcher(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef watcher = 2;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setWatchee](#setWatchee(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef watchee = 1;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setWatchee](#setWatchee(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRef watchee = 1;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setWatcher](#setWatcher(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef watcher = 2;` |
	| `[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")` | `[setWatcher](#setWatcher(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRef watcher = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeFrom​([SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasWatchee
		
		
		
		```
		public boolean hasWatchee()
		```
		
		`required .ActorRef watchee = 1;`
		
		Specified by:
		`[hasWatchee](SystemMessageFormats.WatchDataOrBuilder.html#hasWatchee())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the watchee field is set.
		- #### getWatchee
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getWatchee()
		```
		
		`required .ActorRef watchee = 1;`
		
		Specified by:
		`[getWatchee](SystemMessageFormats.WatchDataOrBuilder.html#getWatchee())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The watchee.
		- #### setWatchee
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setWatchee​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef watchee = 1;`
		- #### setWatchee
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setWatchee​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRef watchee = 1;`
		- #### mergeWatchee
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeWatchee​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef watchee = 1;`
		- #### clearWatchee
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clearWatchee()
		```
		
		`required .ActorRef watchee = 1;`
		- #### getWatcheeBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getWatcheeBuilder()
		```
		
		`required .ActorRef watchee = 1;`
		- #### getWatcheeOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getWatcheeOrBuilder()
		```
		
		`required .ActorRef watchee = 1;`
		
		Specified by:
		`[getWatcheeOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html#getWatcheeOrBuilder())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		- #### hasWatcher
		
		
		
		```
		public boolean hasWatcher()
		```
		
		`required .ActorRef watcher = 2;`
		
		Specified by:
		`[hasWatcher](SystemMessageFormats.WatchDataOrBuilder.html#hasWatcher())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the watcher field is set.
		- #### getWatcher
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getWatcher()
		```
		
		`required .ActorRef watcher = 2;`
		
		Specified by:
		`[getWatcher](SystemMessageFormats.WatchDataOrBuilder.html#getWatcher())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The watcher.
		- #### setWatcher
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setWatcher​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef watcher = 2;`
		- #### setWatcher
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setWatcher​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRef watcher = 2;`
		- #### mergeWatcher
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeWatcher​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef watcher = 2;`
		- #### clearWatcher
		
		
		
		```
		public [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") clearWatcher()
		```
		
		`required .ActorRef watcher = 2;`
		- #### getWatcherBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getWatcherBuilder()
		```
		
		`required .ActorRef watcher = 2;`
		- #### getWatcherOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getWatcherOrBuilder()
		```
		
		`required .ActorRef watcher = 2;`
		
		Specified by:
		`[getWatcherOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html#getWatcherOrBuilder())` in interface `[SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchData.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/SystemMessageFormats.WatchData.Builder.html)*