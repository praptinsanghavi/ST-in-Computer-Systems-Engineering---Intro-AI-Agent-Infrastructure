---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.Builder.html
title: ShardingMessages.ChangeNumberOfProcesses.Builder
---

# ShardingMessages.ChangeNumberOfProcesses.Builder

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Class ShardingMessages.ChangeNumberOfProcesses.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")\>
			- - akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ChangeNumberOfProcesses.Builder

- All Implemented Interfaces:
`[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static final class ShardingMessages.ChangeNumberOfProcesses.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>
implements [ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")
```

Protobuf type `akka.cluster.sharding.typed.ChangeNumberOfProcesses`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearNewNumberOfProcesses](#clearNewNumberOfProcesses())()` | `required int32 newNumberOfProcesses = 1;` |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearReplyTo](#clearReplyTo())()` | `required string replyTo = 2;` |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNewNumberOfProcesses](#getNewNumberOfProcesses())()` | `required int32 newNumberOfProcesses = 1;` |
	| `java.lang.String` | `[getReplyTo](#getReplyTo())()` | `required string replyTo = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getReplyToBytes](#getReplyToBytes())()` | `required string replyTo = 2;` |
	| `boolean` | `[hasNewNumberOfProcesses](#hasNewNumberOfProcesses())()` | `required int32 newNumberOfProcesses = 1;` |
	| `boolean` | `[hasReplyTo](#hasReplyTo())()` | `required string replyTo = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.ChangeNumberOfProcesses))​([ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") other)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setNewNumberOfProcesses](#setNewNumberOfProcesses(int))​(int value)` | `required int32 newNumberOfProcesses = 1;` |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setReplyTo](#setReplyTo(java.lang.String))​(java.lang.String value)` | `required string replyTo = 2;` |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setReplyToBytes](#setReplyToBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string replyTo = 2;` |
	| `[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         int index,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​([ShardingMessages.ChangeNumberOfProcesses](ShardingMessages.ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasNewNumberOfProcesses
		
		
		
		```
		public boolean hasNewNumberOfProcesses()
		```
		
		`required int32 newNumberOfProcesses = 1;`
		
		Specified by:
		`[hasNewNumberOfProcesses](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html#hasNewNumberOfProcesses())` in interface `[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the newNumberOfProcesses field is set.
		- #### getNewNumberOfProcesses
		
		
		
		```
		public int getNewNumberOfProcesses()
		```
		
		`required int32 newNumberOfProcesses = 1;`
		
		Specified by:
		`[getNewNumberOfProcesses](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html#getNewNumberOfProcesses())` in interface `[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The newNumberOfProcesses.
		- #### setNewNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setNewNumberOfProcesses​(int value)
		```
		
		`required int32 newNumberOfProcesses = 1;`
		
		Parameters:
		`value` \- The newNumberOfProcesses to set.
		Returns:
		This builder for chaining.
		- #### clearNewNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearNewNumberOfProcesses()
		```
		
		`required int32 newNumberOfProcesses = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasReplyTo
		
		
		
		```
		public boolean hasReplyTo()
		```
		
		`required string replyTo = 2;`
		
		Specified by:
		`[hasReplyTo](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html#hasReplyTo())` in interface `[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the replyTo field is set.
		- #### getReplyTo
		
		
		
		```
		public java.lang.String getReplyTo()
		```
		
		`required string replyTo = 2;`
		
		Specified by:
		`[getReplyTo](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html#getReplyTo())` in interface `[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The replyTo.
		- #### getReplyToBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getReplyToBytes()
		```
		
		`required string replyTo = 2;`
		
		Specified by:
		`[getReplyToBytes](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html#getReplyToBytes())` in interface `[ShardingMessages.ChangeNumberOfProcessesOrBuilder](ShardingMessages.ChangeNumberOfProcessesOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The bytes for replyTo.
		- #### setReplyTo
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setReplyTo​(java.lang.String value)
		```
		
		`required string replyTo = 2;`
		
		Parameters:
		`value` \- The replyTo to set.
		Returns:
		This builder for chaining.
		- #### clearReplyTo
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearReplyTo()
		```
		
		`required string replyTo = 2;`
		
		Returns:
		This builder for chaining.
		- #### setReplyToBytes
		
		
		
		```
		public [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setReplyToBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string replyTo = 2;`
		
		Parameters:
		`value` \- The bytes for replyTo to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.ChangeNumberOfProcesses.Builder](ShardingMessages.ChangeNumberOfProcesses.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcessesOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.ChangeNumberOfProcesses.Builder.html)*