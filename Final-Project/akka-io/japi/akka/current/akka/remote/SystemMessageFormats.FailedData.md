---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedData.Builder.html
title: SystemMessageFormats.FailedData.Builder
---

# SystemMessageFormats.FailedData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class SystemMessageFormats.FailedData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")\>
			- - akka.remote.SystemMessageFormats.FailedData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote")

---

```
public static final class SystemMessageFormats.FailedData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>
implements [SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")
```

Protobuf type `FailedData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clearChild](#clearChild())()` | `required .ActorRef child = 1;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clearUid](#clearUid())()` | `required uint64 uid = 2;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote")` | `[getChild](#getChild())()` | `required .ActorRef child = 1;` |
	| `[ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote")` | `[getChildBuilder](#getChildBuilder())()` | `required .ActorRef child = 1;` |
	| `[ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote")` | `[getChildOrBuilder](#getChildOrBuilder())()` | `required .ActorRef child = 1;` |
	| `[SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getUid](#getUid())()` | `required uint64 uid = 2;` |
	| `boolean` | `[hasChild](#hasChild())()` | `required .ActorRef child = 1;` |
	| `boolean` | `[hasUid](#hasUid())()` | `required uint64 uid = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[mergeChild](#mergeChild(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef child = 1;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.SystemMessageFormats.FailedData))​([SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") other)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setChild](#setChild(akka.remote.ContainerFormats.ActorRef))​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)` | `required .ActorRef child = 1;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setChild](#setChild(akka.remote.ContainerFormats.ActorRef.Builder))​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRef child = 1;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setUid](#setUid(long))​(long value)` | `required uint64 uid = 2;` |
	| `[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") mergeFrom​([SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasChild
		
		
		
		```
		public boolean hasChild()
		```
		
		`required .ActorRef child = 1;`
		
		Specified by:
		`[hasChild](SystemMessageFormats.FailedDataOrBuilder.html#hasChild())` in interface `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the child field is set.
		- #### getChild
		
		
		
		```
		public [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") getChild()
		```
		
		`required .ActorRef child = 1;`
		
		Specified by:
		`[getChild](SystemMessageFormats.FailedDataOrBuilder.html#getChild())` in interface `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The child.
		- #### setChild
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setChild​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef child = 1;`
		- #### setChild
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setChild​([ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRef child = 1;`
		- #### mergeChild
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") mergeChild​([ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") value)
		```
		
		`required .ActorRef child = 1;`
		- #### clearChild
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clearChild()
		```
		
		`required .ActorRef child = 1;`
		- #### getChildBuilder
		
		
		
		```
		public [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") getChildBuilder()
		```
		
		`required .ActorRef child = 1;`
		- #### getChildOrBuilder
		
		
		
		```
		public [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") getChildOrBuilder()
		```
		
		`required .ActorRef child = 1;`
		
		Specified by:
		`[getChildOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html#getChildOrBuilder())` in interface `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required uint64 uid = 2;`
		
		Specified by:
		`[hasUid](SystemMessageFormats.FailedDataOrBuilder.html#hasUid())` in interface `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public long getUid()
		```
		
		`required uint64 uid = 2;`
		
		Specified by:
		`[getUid](SystemMessageFormats.FailedDataOrBuilder.html#getUid())` in interface `[SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The uid.
		- #### setUid
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setUid​(long value)
		```
		
		`required uint64 uid = 2;`
		
		Parameters:
		`value` \- The uid to set.
		Returns:
		This builder for chaining.
		- #### clearUid
		
		
		
		```
		public [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") clearUid()
		```
		
		`required uint64 uid = 2;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedData.html
- https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedData.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.FailedData.Builder.html)*