---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.Builder.html
title: ArteryControlFormats.ArteryHeartbeatRsp.Builder
---

# ArteryControlFormats.ArteryHeartbeatRsp.Builder

## Content

Package [akka.remote](package-summary.html)
## Class ArteryControlFormats.ArteryHeartbeatRsp.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")\>
			- - akka.remote.ArteryControlFormats.ArteryHeartbeatRsp.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote")

---

```
public static final class ArteryControlFormats.ArteryHeartbeatRsp.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>
implements [ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote")
```

```

 RemoteWatcher.ArteryHeartbeat is empty array
 RemoteWatcher.ArteryHeartbeatRsp
 
```

 Protobuf type `ArteryHeartbeatRsp`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[clearUid](#clearUid())()` | `required uint64 uid = 1;` |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getUid](#getUid())()` | `required uint64 uid = 1;` |
	| `boolean` | `[hasUid](#hasUid())()` | `required uint64 uid = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.ArteryControlFormats.ArteryHeartbeatRsp))​([ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") other)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[setUid](#setUid(long))​(long value)` | `required uint64 uid = 1;` |
	| `[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        int index,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") mergeFrom​([ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasUid
		
		
		
		```
		public boolean hasUid()
		```
		
		`required uint64 uid = 1;`
		
		Specified by:
		`[hasUid](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html#hasUid())` in interface `[ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the uid field is set.
		- #### getUid
		
		
		
		```
		public long getUid()
		```
		
		`required uint64 uid = 1;`
		
		Specified by:
		`[getUid](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html#getUid())` in interface `[ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote")`
		Returns:
		The uid.
		- #### setUid
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") setUid​(long value)
		```
		
		`required uint64 uid = 1;`
		
		Parameters:
		`value` \- The uid to set.
		Returns:
		This builder for chaining.
		- #### clearUid
		
		
		
		```
		public [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") clearUid()
		```
		
		`required uint64 uid = 1;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.Builder.html)*