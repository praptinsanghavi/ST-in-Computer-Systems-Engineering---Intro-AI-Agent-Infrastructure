---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.Builder.html
title: ReplicatedDataMessages.LWWRegister.Builder
---

# ReplicatedDataMessages.LWWRegister.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.LWWRegister.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.LWWRegister.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.LWWRegister`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearNode](#clearNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearState](#clearState())()` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearTimestamp](#clearTimestamp())()` | `required sint64 timestamp = 1;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNode](#getNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNodeBuilder](#getNodeBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getState](#getState())()` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getStateBuilder](#getStateBuilder())()` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getStateOrBuilder](#getStateOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required sint64 timestamp = 1;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `boolean` | `[hasState](#hasState())()` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required sint64 timestamp = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister))​([ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeNode](#mergeNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeState](#mergeState(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress))​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setNode](#setNode(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder))​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.UniqueAddress node = 2;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setState](#setState(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setState](#setState(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.OtherMessage state = 3;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setTimestamp](#setTimestamp(long))​(long value)` | `required sint64 timestamp = 1;` |
	| `[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                           java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   int index,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                   java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.LWWRegister](ReplicatedDataMessages.LWWRegister.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                            akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                     throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasTimestamp
		
		
		
		```
		public boolean hasTimestamp()
		```
		
		`required sint64 timestamp = 1;`
		
		Specified by:
		`[hasTimestamp](ReplicatedDataMessages.LWWRegisterOrBuilder.html#hasTimestamp())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		
		`required sint64 timestamp = 1;`
		
		Specified by:
		`[getTimestamp](ReplicatedDataMessages.LWWRegisterOrBuilder.html#getTimestamp())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The timestamp.
		- #### setTimestamp
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setTimestamp​(long value)
		```
		
		`required sint64 timestamp = 1;`
		
		Parameters:
		`value` \- The timestamp to set.
		Returns:
		This builder for chaining.
		- #### clearTimestamp
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearTimestamp()
		```
		
		`required sint64 timestamp = 1;`
		
		Returns:
		This builder for chaining.
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		
		Specified by:
		`[hasNode](ReplicatedDataMessages.LWWRegisterOrBuilder.html#hasNode())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		
		Specified by:
		`[getNode](ReplicatedDataMessages.LWWRegisterOrBuilder.html#getNode())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The node.
		- #### setNode
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		- #### setNode
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setNode​([ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		- #### mergeNode
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeNode​([ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		- #### clearNode
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		- #### getNodeBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress.Builder](ReplicatorMessages.UniqueAddress.Builder.html "class in akka.cluster.ddata.protobuf.msg") getNodeBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		- #### getNodeOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getNodeOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 2;`
		
		Specified by:
		`[getNodeOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html#getNodeOrBuilder())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasState
		
		
		
		```
		public boolean hasState()
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		
		Specified by:
		`[hasState](ReplicatedDataMessages.LWWRegisterOrBuilder.html#hasState())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the state field is set.
		- #### getState
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getState()
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		
		Specified by:
		`[getState](ReplicatedDataMessages.LWWRegisterOrBuilder.html#getState())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The state.
		- #### setState
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setState​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		- #### setState
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setState​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		- #### mergeState
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeState​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		- #### clearState
		
		
		
		```
		public [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearState()
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		- #### getStateBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getStateBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		- #### getStateOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getStateOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage state = 3;`
		
		Specified by:
		`[getStateOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html#getStateOrBuilder())` in interface `[ReplicatedDataMessages.LWWRegisterOrBuilder](ReplicatedDataMessages.LWWRegisterOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.LWWRegister.Builder](ReplicatedDataMessages.LWWRegister.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegisterOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.LWWRegister.Builder.html)*