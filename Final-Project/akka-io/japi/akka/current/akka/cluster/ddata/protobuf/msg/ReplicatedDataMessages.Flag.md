---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.Builder.html
title: ReplicatedDataMessages.Flag.Builder
---

# ReplicatedDataMessages.Flag.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatedDataMessages.Flag.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag.Builder

- All Implemented Interfaces:
`[ReplicatedDataMessages.FlagOrBuilder](ReplicatedDataMessages.FlagOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatedDataMessages.Flag.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatedDataMessages.FlagOrBuilder](ReplicatedDataMessages.FlagOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Flag`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearEnabled](#clearEnabled())()` | `required bool enabled = 1;` |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getEnabled](#getEnabled())()` | `required bool enabled = 1;` |
	| `boolean` | `[hasEnabled](#hasEnabled())()` | `required bool enabled = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag))​([ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setEnabled](#setEnabled(boolean))​(boolean value)` | `required bool enabled = 1;` |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                    java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            int index,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                            java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatedDataMessages.Flag](ReplicatedDataMessages.Flag.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                              throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasEnabled
		
		
		
		```
		public boolean hasEnabled()
		```
		
		`required bool enabled = 1;`
		
		Specified by:
		`[hasEnabled](ReplicatedDataMessages.FlagOrBuilder.html#hasEnabled())` in interface `[ReplicatedDataMessages.FlagOrBuilder](ReplicatedDataMessages.FlagOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the enabled field is set.
		- #### getEnabled
		
		
		
		```
		public boolean getEnabled()
		```
		
		`required bool enabled = 1;`
		
		Specified by:
		`[getEnabled](ReplicatedDataMessages.FlagOrBuilder.html#getEnabled())` in interface `[ReplicatedDataMessages.FlagOrBuilder](ReplicatedDataMessages.FlagOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The enabled.
		- #### setEnabled
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") setEnabled​(boolean value)
		```
		
		`required bool enabled = 1;`
		
		Parameters:
		`value` \- The enabled to set.
		Returns:
		This builder for chaining.
		- #### clearEnabled
		
		
		
		```
		public [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearEnabled()
		```
		
		`required bool enabled = 1;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatedDataMessages.Flag.Builder](ReplicatedDataMessages.Flag.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.FlagOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.Flag.Builder.html)*