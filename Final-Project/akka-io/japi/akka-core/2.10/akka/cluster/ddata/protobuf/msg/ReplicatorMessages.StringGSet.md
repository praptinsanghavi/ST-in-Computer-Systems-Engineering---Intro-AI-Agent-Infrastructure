---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.Builder.html
title: ReplicatorMessages.StringGSet.Builder
---

# ReplicatorMessages.StringGSet.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.StringGSet.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.StringGSet.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.StringGSet.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.StringGSet`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addAllElements](#addAllElements(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string elements = 1;` |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addElements](#addElements(java.lang.String))​(java.lang.String value)` | `repeated string elements = 1;` |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addElementsBytes](#addElementsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string elements = 1;` |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearElements](#clearElements())()` | `repeated string elements = 1;` |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getElements](#getElements(int))​(int index)` | `repeated string elements = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getElementsBytes](#getElementsBytes(int))​(int index)` | `repeated string elements = 1;` |
	| `int` | `[getElementsCount](#getElementsCount())()` | `repeated string elements = 1;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getElementsList](#getElementsList())()` | `repeated string elements = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.StringGSet))​([ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setElements](#setElements(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string elements = 1;` |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              int index,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                              java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.StringGSet](ReplicatorMessages.StringGSet.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                       akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getElementsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getElementsList()
		```
		
		`repeated string elements = 1;`
		
		Specified by:
		`[getElementsList](ReplicatorMessages.StringGSetOrBuilder.html#getElementsList())` in interface `[ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		A list containing the elements.
		- #### getElementsCount
		
		
		
		```
		public int getElementsCount()
		```
		
		`repeated string elements = 1;`
		
		Specified by:
		`[getElementsCount](ReplicatorMessages.StringGSetOrBuilder.html#getElementsCount())` in interface `[ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The count of elements.
		- #### getElements
		
		
		
		```
		public java.lang.String getElements​(int index)
		```
		
		`repeated string elements = 1;`
		
		Specified by:
		`[getElements](ReplicatorMessages.StringGSetOrBuilder.html#getElements(int))` in interface `[ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The elements at the given index.
		- #### getElementsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getElementsBytes​(int index)
		```
		
		`repeated string elements = 1;`
		
		Specified by:
		`[getElementsBytes](ReplicatorMessages.StringGSetOrBuilder.html#getElementsBytes(int))` in interface `[ReplicatorMessages.StringGSetOrBuilder](ReplicatorMessages.StringGSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the elements at the given index.
		- #### setElements
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setElements​(int index,
		                                                         java.lang.String value)
		```
		
		`repeated string elements = 1;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The elements to set.
		Returns:
		This builder for chaining.
		- #### addElements
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addElements​(java.lang.String value)
		```
		
		`repeated string elements = 1;`
		
		Parameters:
		`value` \- The elements to add.
		Returns:
		This builder for chaining.
		- #### addAllElements
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addAllElements​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string elements = 1;`
		
		Parameters:
		`values` \- The elements to add.
		Returns:
		This builder for chaining.
		- #### clearElements
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearElements()
		```
		
		`repeated string elements = 1;`
		
		Returns:
		This builder for chaining.
		- #### addElementsBytes
		
		
		
		```
		public [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") addElementsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string elements = 1;`
		
		Parameters:
		`value` \- The bytes of the elements to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.StringGSet.Builder](ReplicatorMessages.StringGSet.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.StringGSet.Builder.html)*