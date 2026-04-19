---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:59:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.Builder.html
title: ReplicatorMessages.Unsubscribe.Builder
---

# ReplicatorMessages.Unsubscribe.Builder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.Unsubscribe.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")\>
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Unsubscribe.Builder

- All Implemented Interfaces:
`[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.Unsubscribe.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>
implements [ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.Unsubscribe`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg")` | `[build](#build())()` |  |
	| `[ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearKey](#clearKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clearRef](#clearRef())()` | `required string ref = 2;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKey](#getKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[getKeyBuilder](#getKeyBuilder())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getKeyOrBuilder](#getKeyOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `java.lang.String` | `[getRef](#getRef())()` | `required string ref = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getRefBytes](#getRefBytes())()` | `required string ref = 2;` |
	| `boolean` | `[hasKey](#hasKey())()` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `boolean` | `[hasRef](#hasRef())()` | `required string ref = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Unsubscribe))​([ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") other)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeKey](#mergeKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setKey](#setKey(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage.Builder))​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)` | `required .akka.cluster.ddata.OtherMessage key = 1;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRef](#setRef(java.lang.String))​(java.lang.String value)` | `required string ref = 2;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRefBytes](#setRefBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string ref = 2;` |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​([ReplicatorMessages.Unsubscribe](ReplicatorMessages.Unsubscribe.html "class in akka.cluster.ddata.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### hasKey
		
		
		
		```
		public boolean hasKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[hasKey](ReplicatorMessages.UnsubscribeOrBuilder.html#hasKey())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the key field is set.
		- #### getKey
		
		
		
		```
		public [ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[getKey](ReplicatorMessages.UnsubscribeOrBuilder.html#getKey())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The key.
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### setKey
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setKey​([ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") builderForValue)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### mergeKey
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeKey​([ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") value)
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### clearKey
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearKey()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### getKeyBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessage.Builder](ReplicatorMessages.OtherMessage.Builder.html "class in akka.cluster.ddata.protobuf.msg") getKeyBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		- #### getKeyOrBuilder
		
		
		
		```
		public [ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getKeyOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage key = 1;`
		
		Specified by:
		`[getKeyOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html#getKeyOrBuilder())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasRef
		
		
		
		```
		public boolean hasRef()
		```
		
		`required string ref = 2;`
		
		Specified by:
		`[hasRef](ReplicatorMessages.UnsubscribeOrBuilder.html#hasRef())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the ref field is set.
		- #### getRef
		
		
		
		```
		public java.lang.String getRef()
		```
		
		`required string ref = 2;`
		
		Specified by:
		`[getRef](ReplicatorMessages.UnsubscribeOrBuilder.html#getRef())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The ref.
		- #### getRefBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRefBytes()
		```
		
		`required string ref = 2;`
		
		Specified by:
		`[getRefBytes](ReplicatorMessages.UnsubscribeOrBuilder.html#getRefBytes())` in interface `[ReplicatorMessages.UnsubscribeOrBuilder](ReplicatorMessages.UnsubscribeOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The bytes for ref.
		- #### setRef
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRef​(java.lang.String value)
		```
		
		`required string ref = 2;`
		
		Parameters:
		`value` \- The ref to set.
		Returns:
		This builder for chaining.
		- #### clearRef
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") clearRef()
		```
		
		`required string ref = 2;`
		
		Returns:
		This builder for chaining.
		- #### setRefBytes
		
		
		
		```
		public [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setRefBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string ref = 2;`
		
		Parameters:
		`value` \- The bytes for ref to set.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ReplicatorMessages.Unsubscribe.Builder](ReplicatorMessages.Unsubscribe.Builder.html "class in akka.cluster.ddata.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UnsubscribeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.Builder.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Unsubscribe.Builder.html)*