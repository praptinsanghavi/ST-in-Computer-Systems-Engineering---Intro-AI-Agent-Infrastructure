---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html
title: ClusterMessages.ReceptionistEntry.Builder
---

# ClusterMessages.ReceptionistEntry.Builder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Class ClusterMessages.ReceptionistEntry.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")\>
			- - akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry.Builder

- All Implemented Interfaces:
`[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static final class ClusterMessages.ReceptionistEntry.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>
implements [ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")
```

Protobuf type `akka.cluster.typed.ReceptionistEntry`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearActorRef](#clearActorRef())()` | `required string actorRef = 1;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearCreatedTimestamp](#clearCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clearSystemUid](#clearSystemUid())()` | `required uint64 systemUid = 2;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `java.lang.String` | `[getActorRef](#getActorRef())()` | `required string actorRef = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getActorRefBytes](#getActorRefBytes())()` | `required string actorRef = 1;` |
	| `long` | `[getCreatedTimestamp](#getCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `[ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getSystemUid](#getSystemUid())()` | `required uint64 systemUid = 2;` |
	| `boolean` | `[hasActorRef](#hasActorRef())()` | `required string actorRef = 1;` |
	| `boolean` | `[hasCreatedTimestamp](#hasCreatedTimestamp())()` | `optional int64 createdTimestamp = 3;` |
	| `boolean` | `[hasSystemUid](#hasSystemUid())()` | `required uint64 systemUid = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.typed.internal.protobuf.ClusterMessages.ReceptionistEntry))​([ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") other)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setActorRef](#setActorRef(java.lang.String))​(java.lang.String value)` | `required string actorRef = 1;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setActorRefBytes](#setActorRefBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string actorRef = 1;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setCreatedTimestamp](#setCreatedTimestamp(long))​(long value)` | `optional int64 createdTimestamp = 3;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setSystemUid](#setSystemUid(long))​(long value)` | `required uint64 systemUid = 2;` |
	| `[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                          java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  int index,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                  java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​([ClusterMessages.ReceptionistEntry](ClusterMessages.ReceptionistEntry.html "class in akka.cluster.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                           akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                    throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasActorRef
		
		
		
		```
		public boolean hasActorRef()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[hasActorRef](ClusterMessages.ReceptionistEntryOrBuilder.html#hasActorRef())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the actorRef field is set.
		- #### getActorRef
		
		
		
		```
		public java.lang.String getActorRef()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[getActorRef](ClusterMessages.ReceptionistEntryOrBuilder.html#getActorRef())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The actorRef.
		- #### getActorRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getActorRefBytes()
		```
		
		`required string actorRef = 1;`
		
		Specified by:
		`[getActorRefBytes](ClusterMessages.ReceptionistEntryOrBuilder.html#getActorRefBytes())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The bytes for actorRef.
		- #### setActorRef
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setActorRef​(java.lang.String value)
		```
		
		`required string actorRef = 1;`
		
		Parameters:
		`value` \- The actorRef to set.
		Returns:
		This builder for chaining.
		- #### clearActorRef
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clearActorRef()
		```
		
		`required string actorRef = 1;`
		
		Returns:
		This builder for chaining.
		- #### setActorRefBytes
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setActorRefBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string actorRef = 1;`
		
		Parameters:
		`value` \- The bytes for actorRef to set.
		Returns:
		This builder for chaining.
		- #### hasSystemUid
		
		
		
		```
		public boolean hasSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Specified by:
		`[hasSystemUid](ClusterMessages.ReceptionistEntryOrBuilder.html#hasSystemUid())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the systemUid field is set.
		- #### getSystemUid
		
		
		
		```
		public long getSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Specified by:
		`[getSystemUid](ClusterMessages.ReceptionistEntryOrBuilder.html#getSystemUid())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The systemUid.
		- #### setSystemUid
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setSystemUid​(long value)
		```
		
		`required uint64 systemUid = 2;`
		
		Parameters:
		`value` \- The systemUid to set.
		Returns:
		This builder for chaining.
		- #### clearSystemUid
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clearSystemUid()
		```
		
		`required uint64 systemUid = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasCreatedTimestamp
		
		
		
		```
		public boolean hasCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Specified by:
		`[hasCreatedTimestamp](ClusterMessages.ReceptionistEntryOrBuilder.html#hasCreatedTimestamp())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		Whether the createdTimestamp field is set.
		- #### getCreatedTimestamp
		
		
		
		```
		public long getCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Specified by:
		`[getCreatedTimestamp](ClusterMessages.ReceptionistEntryOrBuilder.html#getCreatedTimestamp())` in interface `[ClusterMessages.ReceptionistEntryOrBuilder](ClusterMessages.ReceptionistEntryOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")`
		Returns:
		The createdTimestamp.
		- #### setCreatedTimestamp
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setCreatedTimestamp​(long value)
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Parameters:
		`value` \- The createdTimestamp to set.
		Returns:
		This builder for chaining.
		- #### clearCreatedTimestamp
		
		
		
		```
		public [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") clearCreatedTimestamp()
		```
		
		`optional int64 createdTimestamp = 3;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.ReceptionistEntry.Builder](ClusterMessages.ReceptionistEntry.Builder.html "class in akka.cluster.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/protobuf/ClusterMessages.ReceptionistEntry.Builder.html)*