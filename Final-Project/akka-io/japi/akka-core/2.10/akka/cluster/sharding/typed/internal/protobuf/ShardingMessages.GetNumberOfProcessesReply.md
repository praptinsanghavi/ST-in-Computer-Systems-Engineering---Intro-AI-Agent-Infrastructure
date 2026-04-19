---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.Builder.html
title: ShardingMessages.GetNumberOfProcessesReply.Builder
---

# ShardingMessages.GetNumberOfProcessesReply.Builder

## Content

Package [akka.cluster.sharding.typed.internal.protobuf](package-summary.html)
## Class ShardingMessages.GetNumberOfProcessesReply.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")\>
			- - akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply.Builder

- All Implemented Interfaces:
`[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")

---

```
public static final class ShardingMessages.GetNumberOfProcessesReply.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>
implements [ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")
```

Protobuf type `akka.cluster.sharding.typed.GetNumberOfProcessesReply`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[build](#build())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[buildPartial](#buildPartial())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clear](#clear())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearNumberOfProcesses](#clearNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearRescaleInProgress](#clearRescaleInProgress())()` | `required bool rescaleInProgress = 3;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearRevision](#clearRevision())()` | `required int64 revision = 1;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clearStartedTimestampMillis](#clearStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[clone](#clone())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumberOfProcesses](#getNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `boolean` | `[getRescaleInProgress](#getRescaleInProgress())()` | `required bool rescaleInProgress = 3;` |
	| `long` | `[getRevision](#getRevision())()` | `required int64 revision = 1;` |
	| `long` | `[getStartedTimestampMillis](#getStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `boolean` | `[hasNumberOfProcesses](#hasNumberOfProcesses())()` | `required int32 numberOfProcesses = 2;` |
	| `boolean` | `[hasRescaleInProgress](#hasRescaleInProgress())()` | `required bool rescaleInProgress = 3;` |
	| `boolean` | `[hasRevision](#hasRevision())()` | `required int64 revision = 1;` |
	| `boolean` | `[hasStartedTimestampMillis](#hasStartedTimestampMillis())()` | `required int64 startedTimestampMillis = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.cluster.sharding.typed.internal.protobuf.ShardingMessages.GetNumberOfProcessesReply))​([ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") other)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setNumberOfProcesses](#setNumberOfProcesses(int))​(int value)` | `required int32 numberOfProcesses = 2;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRescaleInProgress](#setRescaleInProgress(boolean))​(boolean value)` | `required bool rescaleInProgress = 3;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setRevision](#setRevision(long))​(long value)` | `required int64 revision = 1;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setStartedTimestampMillis](#setStartedTimestampMillis(long))​(long value)` | `required int64 startedTimestampMillis = 4;` |
	| `[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clear
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setField
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearField
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### clearOneof
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### setRepeatedField
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           int index,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### addRepeatedField
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​([ShardingMessages.GetNumberOfProcessesReply](ShardingMessages.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal.protobuf") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeFrom
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                    akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                             throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		Throws:
		`java.io.IOException`
		- #### hasRevision
		
		
		
		```
		public boolean hasRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[hasRevision](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasRevision())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the revision field is set.
		- #### getRevision
		
		
		
		```
		public long getRevision()
		```
		
		`required int64 revision = 1;`
		
		Specified by:
		`[getRevision](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getRevision())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The revision.
		- #### setRevision
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRevision​(long value)
		```
		
		`required int64 revision = 1;`
		
		Parameters:
		`value` \- The revision to set.
		Returns:
		This builder for chaining.
		- #### clearRevision
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearRevision()
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
		`[hasNumberOfProcesses](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasNumberOfProcesses())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the numberOfProcesses field is set.
		- #### getNumberOfProcesses
		
		
		
		```
		public int getNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Specified by:
		`[getNumberOfProcesses](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getNumberOfProcesses())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The numberOfProcesses.
		- #### setNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setNumberOfProcesses​(int value)
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Parameters:
		`value` \- The numberOfProcesses to set.
		Returns:
		This builder for chaining.
		- #### clearNumberOfProcesses
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearNumberOfProcesses()
		```
		
		`required int32 numberOfProcesses = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasRescaleInProgress
		
		
		
		```
		public boolean hasRescaleInProgress()
		```
		
		`required bool rescaleInProgress = 3;`
		
		Specified by:
		`[hasRescaleInProgress](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasRescaleInProgress())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the rescaleInProgress field is set.
		- #### getRescaleInProgress
		
		
		
		```
		public boolean getRescaleInProgress()
		```
		
		`required bool rescaleInProgress = 3;`
		
		Specified by:
		`[getRescaleInProgress](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getRescaleInProgress())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The rescaleInProgress.
		- #### setRescaleInProgress
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setRescaleInProgress​(boolean value)
		```
		
		`required bool rescaleInProgress = 3;`
		
		Parameters:
		`value` \- The rescaleInProgress to set.
		Returns:
		This builder for chaining.
		- #### clearRescaleInProgress
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearRescaleInProgress()
		```
		
		`required bool rescaleInProgress = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasStartedTimestampMillis
		
		
		
		```
		public boolean hasStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[hasStartedTimestampMillis](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#hasStartedTimestampMillis())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		Whether the startedTimestampMillis field is set.
		- #### getStartedTimestampMillis
		
		
		
		```
		public long getStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Specified by:
		`[getStartedTimestampMillis](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html#getStartedTimestampMillis())` in interface `[ShardingMessages.GetNumberOfProcessesReplyOrBuilder](ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html "interface in akka.cluster.sharding.typed.internal.protobuf")`
		Returns:
		The startedTimestampMillis.
		- #### setStartedTimestampMillis
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setStartedTimestampMillis​(long value)
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Parameters:
		`value` \- The startedTimestampMillis to set.
		Returns:
		This builder for chaining.
		- #### clearStartedTimestampMillis
		
		
		
		```
		public [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") clearStartedTimestampMillis()
		```
		
		`required int64 startedTimestampMillis = 4;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ShardingMessages.GetNumberOfProcessesReply.Builder](ShardingMessages.GetNumberOfProcessesReply.Builder.html "class in akka.cluster.sharding.typed.internal.protobuf")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReplyOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/protobuf/ShardingMessages.GetNumberOfProcessesReply.Builder.html)*