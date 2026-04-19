---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.Builder.html
title: ShardingMessages.DaemonProcessScaleState.Builder
---

# ShardingMessages.DaemonProcessScaleState.Builder

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Class ShardingMessages.DaemonProcessScaleState.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")\>
			- - akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.DaemonProcessScaleState.Builder

- All Implemented Interfaces:
`[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static final class ShardingMessages.DaemonProcessScaleState.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>
implements [ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")
```

Protobuf type `akka.cluster.sharding.typed.DaemonProcessScaleState`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearCompleted](#clearCompleted())()` | `required bool completed = 3;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearNumberOfProcesses](#clearNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearRevision](#clearRevision())()` | `required int64 revision = 1;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearStartedTimestampMillis](#clearStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `boolean` | `[getCompleted](#getCompleted())()` | `required bool completed = 3;` |
	| `[ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumberOfProcesses](#getNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `long` | `[getRevision](#getRevision())()` | `required int64 revision = 1;` |
	| `long` | `[getStartedTimestampMillis](#getStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `boolean` | `[hasCompleted](#hasCompleted())()` | `required bool completed = 3;` |
	| `boolean` | `[hasNumberOfProcesses](#hasNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `boolean` | `[hasRevision](#hasRevision())()` | `required int64 revision = 1;` |
	| `boolean` | `[hasStartedTimestampMillis](#hasStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.DaemonProcessScaleState))​([ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") other)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setCompleted](#setCompleted(boolean))​(boolean value)` | `required bool completed = 3;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setNumberOfProcesses](#setNumberOfProcesses(int))​(int value)` | `required int32 numberOfProcesses = 2;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRevision](#setRevision(long))​(long value)` | `required int64 revision = 1;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setStartedTimestampMillis](#setStartedTimestampMillis(long))​(long value)` | `required int64 startedTimestampMillis = 4;` |
	| `[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                 java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         int index,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                         java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​([ShardingMessages.DaemonProcessScaleState](ShardingMessages.DaemonProcessScaleState.html "class in akka.cluster.sharding.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                           throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasRevision
		
		
		
		```
		public boolean hasRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[hasRevision](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#hasRevision())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the revision field is set.
		- #### getRevision
		
		
		
		```
		public long getRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[getRevision](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#getRevision())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The revision.
		- #### setRevision
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRevision​(long value)
		```
		
		`required int64 revision = 1;`
		
		Parameters:
		`value` \- The revision to set.
		Returns:
		This builder for chaining.
		- #### clearRevision
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearRevision()
		```
		
		`required int64 revision = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasNumberOfProcesses
		
		
		
		```
		public boolean hasNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Specified by:
		`[hasNumberOfProcesses](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#hasNumberOfProcesses())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the numberOfProcesses field is set.
		- #### getNumberOfProcesses
		
		
		
		```
		public int getNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Specified by:
		`[getNumberOfProcesses](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#getNumberOfProcesses())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The numberOfProcesses.
		- #### setNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setNumberOfProcesses​(int value)
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Parameters:
		`value` \- The numberOfProcesses to set.
		Returns:
		This builder for chaining.
		- #### clearNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasCompleted
		
		
		
		```
		public boolean hasCompleted()
		```
		
		`required bool completed = 3;`
		
		Specified by:
		`[hasCompleted](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#hasCompleted())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the completed field is set.
		- #### getCompleted
		
		
		
		```
		public boolean getCompleted()
		```
		
		`required bool completed = 3;`
		
		Specified by:
		`[getCompleted](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#getCompleted())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The completed.
		- #### setCompleted
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setCompleted​(boolean value)
		```
		
		`required bool completed = 3;`
		
		Parameters:
		`value` \- The completed to set.
		Returns:
		This builder for chaining.
		- #### clearCompleted
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearCompleted()
		```
		
		`required bool completed = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasStartedTimestampMillis
		
		
		
		```
		public boolean hasStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[hasStartedTimestampMillis](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#hasStartedTimestampMillis())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the startedTimestampMillis field is set.
		- #### getStartedTimestampMillis
		
		
		
		```
		public long getStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[getStartedTimestampMillis](ShardingMessages.DaemonProcessScaleStateOrBuilder.html#getStartedTimestampMillis())` in interface `[ShardingMessages.DaemonProcessScaleStateOrBuilder](ShardingMessages.DaemonProcessScaleStateOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The startedTimestampMillis.
		- #### setStartedTimestampMillis
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setStartedTimestampMillis​(long value)
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Parameters:
		`value` \- The startedTimestampMillis to set.
		Returns:
		This builder for chaining.
		- #### clearStartedTimestampMillis
		
		
		
		```
		public [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.DaemonProcessScaleState.Builder](ShardingMessages.DaemonProcessScaleState.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleStateOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.DaemonProcessScaleState.Builder.html)*