---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponse.Builder.html
title: ContainerFormats.WatcherHeartbeatResponse.Builder
---

# ContainerFormats.WatcherHeartbeatResponse.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ContainerFormats.WatcherHeartbeatResponse.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")\>
			- - akka.remote.ContainerFormats.WatcherHeartbeatResponse.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ContainerFormats.WatcherHeartbeatResponseOrBuilder](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote")

---

```
public static final class ContainerFormats.WatcherHeartbeatResponse.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>
implements [ContainerFormats.WatcherHeartbeatResponseOrBuilder](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html "interface in akka.remote")
```

Protobuf type `WatcherHeartbeatResponse`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[clearUid](#clearUid())()` | `required uint64 uid = 1;` |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getUid](#getUid())()` | `required uint64 uid = 1;` |
	| `boolean` | `[hasUid](#hasUid())()` | `required uint64 uid = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ContainerFormats.WatcherHeartbeatResponse))​([ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") other)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[setUid](#setUid(long))​(long value)` | `required uint64 uid = 1;` |
	| `[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          int index,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") mergeFrom​([ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                   akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                            throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required uint64 uid = 1;`
		
		Specified by:
		`[hasUid](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html#hasUid())` in interface `[ContainerFormats.WatcherHeartbeatResponseOrBuilder](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public long getUid()
		```
		
		`required uint64 uid = 1;`
		
		Specified by:
		`[getUid](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html#getUid())` in interface `[ContainerFormats.WatcherHeartbeatResponseOrBuilder](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html "interface in akka.remote")`
		Returns:
		The uid.
		- #### setUid
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") setUid​(long value)
		```
		
		`required uint64 uid = 1;`
		
		Parameters:
		`value` \- The uid to set.
		Returns:
		This builder for chaining.
		- #### clearUid
		
		
		
		```
		public [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") clearUid()
		```
		
		`required uint64 uid = 1;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponse.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponseOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponse.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.WatcherHeartbeatResponse.Builder.html)*