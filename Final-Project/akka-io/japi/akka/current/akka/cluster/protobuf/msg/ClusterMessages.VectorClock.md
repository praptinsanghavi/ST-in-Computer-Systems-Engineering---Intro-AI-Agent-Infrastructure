---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html
title: ClusterMessages.VectorClock.Builder
---

# ClusterMessages.VectorClock.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.VectorClock.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Builder

- All Implemented Interfaces:
`[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.VectorClock.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Vector Clock
 
```

 Protobuf type `VectorClock`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllVersions](#addAllVersions(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersions](#addVersions(int,akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version))​(int index,  [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersions](#addVersions(int,akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.Builder))​(int index,  [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersions](#addVersions(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version))​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersions](#addVersions(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.Builder))​([ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersionsBuilder](#addVersionsBuilder())()` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[addVersionsBuilder](#addVersionsBuilder(int))​(int index)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTimestamp](#clearTimestamp())()` | the timestamp could be removed but left for test data compatibility |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearVersions](#clearVersions())()` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` | the timestamp could be removed but left for test data compatibility |
	| `[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")` | `[getVersions](#getVersions(int))​(int index)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")` | `[getVersionsBuilder](#getVersionsBuilder(int))​(int index)` | `repeated .VectorClock.Version versions = 2;` |
	| `java.util.List<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getVersionsBuilderList](#getVersionsBuilderList())()` | `repeated .VectorClock.Version versions = 2;` |
	| `int` | `[getVersionsCount](#getVersionsCount())()` | `repeated .VectorClock.Version versions = 2;` |
	| `java.util.List<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")>` | `[getVersionsList](#getVersionsList())()` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getVersionsOrBuilder](#getVersionsOrBuilder(int))​(int index)` | `repeated .VectorClock.Version versions = 2;` |
	| `java.util.List<? extends [ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getVersionsOrBuilderList](#getVersionsOrBuilderList())()` | `repeated .VectorClock.Version versions = 2;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | the timestamp could be removed but left for test data compatibility |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.VectorClock))​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeVersions](#removeVersions(int))​(int index)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTimestamp](#setTimestamp(long))​(long value)` | the timestamp could be removed but left for test data compatibility |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersions](#setVersions(int,akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version))​(int index,  [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)` | `repeated .VectorClock.Version versions = 2;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersions](#setVersions(int,akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Version.Builder))​(int index,  [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .VectorClock.Version versions = 2;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		
		```
		
		 the timestamp could be removed but left for test data compatibility
		 
		```
		
		`optional int64 timestamp = 1;`
		
		Specified by:
		`[hasTimestamp](ClusterMessages.VectorClockOrBuilder.html#hasTimestamp())` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		
		```
		
		 the timestamp could be removed but left for test data compatibility
		 
		```
		
		`optional int64 timestamp = 1;`
		
		Specified by:
		`[getTimestamp](ClusterMessages.VectorClockOrBuilder.html#getTimestamp())` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setTimestamp​(long value)
		```
		
		
		```
		
		 the timestamp could be removed but left for test data compatibility
		 
		```
		
		`optional int64 timestamp = 1;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clearTimestamp()
		```
		
		
		```
		
		 the timestamp could be removed but left for test data compatibility
		 
		```
		
		`optional int64 timestamp = 1;`
		
		Returns:
		This builder for chaining.
		- #### getVersionsList
		
		
		
		```
		public java.util.List<[ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> getVersionsList()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		
		Specified by:
		`[getVersionsList](ClusterMessages.VectorClockOrBuilder.html#getVersionsList())` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getVersionsCount
		
		
		
		```
		public int getVersionsCount()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		
		Specified by:
		`[getVersionsCount](ClusterMessages.VectorClockOrBuilder.html#getVersionsCount())` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") getVersions​(int index)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		
		Specified by:
		`[getVersions](ClusterMessages.VectorClockOrBuilder.html#getVersions(int))` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setVersions​(int index,
		                                                       [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### setVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setVersions​(int index,
		                                                       [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addVersions​([ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addVersions​(int index,
		                                                       [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addVersions​([ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addVersions​(int index,
		                                                       [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addAllVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") addAllVersions​(java.lang.Iterable<? extends [ClusterMessages.VectorClock.Version](ClusterMessages.VectorClock.Version.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### clearVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") clearVersions()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### removeVersions
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") removeVersions​(int index)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### getVersionsBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") getVersionsBuilder​(int index)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### getVersionsOrBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg") getVersionsOrBuilder​(int index)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		
		Specified by:
		`[getVersionsOrBuilder](ClusterMessages.VectorClockOrBuilder.html#getVersionsOrBuilder(int))` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getVersionsOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.VectorClock.VersionOrBuilder](ClusterMessages.VectorClock.VersionOrBuilder.html "interface in akka.cluster.protobuf.msg")> getVersionsOrBuilderList()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		
		Specified by:
		`[getVersionsOrBuilderList](ClusterMessages.VectorClockOrBuilder.html#getVersionsOrBuilderList())` in interface `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addVersionsBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") addVersionsBuilder()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### addVersionsBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg") addVersionsBuilder​(int index)
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### getVersionsBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.VectorClock.Version.Builder](ClusterMessages.VectorClock.Version.Builder.html "class in akka.cluster.protobuf.msg")> getVersionsBuilderList()
		```
		
		`repeated .VectorClock.Version versions = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Version.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.VersionOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClockOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html)*