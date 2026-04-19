---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:58:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html
title: ReplicatorMessages.DataEnvelope.PruningEntry
---

# ReplicatorMessages.DataEnvelope.PruningEntry

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Class ReplicatorMessages.DataEnvelope.PruningEntry

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry

- All Implemented Interfaces:
`[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`, `akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.io.Serializable`

Enclosing class:
[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static final class ReplicatorMessages.DataEnvelope.PruningEntry
extends akka.protobufv3.internal.GeneratedMessageV3
implements [ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")
```

Protobuf type `akka.cluster.ddata.DataEnvelope.PruningEntry`

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | Protobuf type `akka.cluster.ddata.DataEnvelope.PruningEntry` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[OBSOLETETIME_FIELD_NUMBER](#OBSOLETETIME_FIELD_NUMBER)` |  |
	| `static int` | `[OWNERADDRESS_FIELD_NUMBER](#OWNERADDRESS_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[PARSER](#PARSER)` | Deprecated. |
	| `static int` | `[PERFORMED_FIELD_NUMBER](#PERFORMED_FIELD_NUMBER)` |  |
	| `static int` | `[REMOVEDADDRESS_FIELD_NUMBER](#REMOVEDADDRESS_FIELD_NUMBER)` |  |
	| `static int` | `[SEEN_FIELD_NUMBER](#SEEN_FIELD_NUMBER)` |  |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `long` | `[getObsoleteTime](#getObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddress](#getOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddressOrBuilder](#getOwnerAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getParserForType](#getParserForType())()` |  |
	| `boolean` | `[getPerformed](#getPerformed())()` | `required bool performed = 3;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddress](#getRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddressOrBuilder](#getRemovedAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")` | `[getSeen](#getSeen(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `int` | `[getSeenCount](#getSeenCount())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getSeenList](#getSeenList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getSeenOrBuilder](#getSeenOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getSeenOrBuilderList](#getSeenOrBuilderList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasObsoleteTime](#hasObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `boolean` | `[hasOwnerAddress](#hasOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `boolean` | `[hasPerformed](#hasPerformed())()` | `required bool performed = 3;` |
	| `boolean` | `[hasRemovedAddress](#hasRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder())()` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilder](#newBuilder(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry))​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") prototype)` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")>` | `[parser](#parser())()` |  |
	| `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### REMOVEDADDRESS\_FIELD\_NUMBER
		
		
		
		```
		public static final int REMOVEDADDRESS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.REMOVEDADDRESS_FIELD_NUMBER)
		- #### OWNERADDRESS\_FIELD\_NUMBER
		
		
		
		```
		public static final int OWNERADDRESS_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.OWNERADDRESS_FIELD_NUMBER)
		- #### PERFORMED\_FIELD\_NUMBER
		
		
		
		```
		public static final int PERFORMED_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.PERFORMED_FIELD_NUMBER)
		- #### SEEN\_FIELD\_NUMBER
		
		
		
		```
		public static final int SEEN_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.SEEN_FIELD_NUMBER)
		- #### OBSOLETETIME\_FIELD\_NUMBER
		
		
		
		```
		public static final int OBSOLETETIME_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatorMessages.DataEnvelope.PruningEntry.OBSOLETETIME_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### hasRemovedAddress
		
		
		
		```
		public boolean hasRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[hasRemovedAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasRemovedAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the removedAddress field is set.
		- #### getRemovedAddress
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[getRemovedAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getRemovedAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The removedAddress.
		- #### getRemovedAddressOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getRemovedAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Specified by:
		`[getRemovedAddressOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getRemovedAddressOrBuilder())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasOwnerAddress
		
		
		
		```
		public boolean hasOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[hasOwnerAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasOwnerAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the ownerAddress field is set.
		- #### getOwnerAddress
		
		
		
		```
		public [ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[getOwnerAddress](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getOwnerAddress())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The ownerAddress.
		- #### getOwnerAddressOrBuilder
		
		
		
		```
		public [ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOwnerAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Specified by:
		`[getOwnerAddressOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getOwnerAddressOrBuilder())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasPerformed
		
		
		
		```
		public boolean hasPerformed()
		```
		
		`required bool performed = 3;`
		
		Specified by:
		`[hasPerformed](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasPerformed())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the performed field is set.
		- #### getPerformed
		
		
		
		```
		public boolean getPerformed()
		```
		
		`required bool performed = 3;`
		
		Specified by:
		`[getPerformed](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getPerformed())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The performed.
		- #### getSeenList
		
		
		
		```
		public java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> getSeenList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenList](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenList())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeenOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getSeenOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenOrBuilderList](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenOrBuilderList())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeenCount
		
		
		
		```
		public int getSeenCount()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenCount](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenCount())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeen
		
		
		
		```
		public [ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") getSeen​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeen](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeen(int))` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### getSeenOrBuilder
		
		
		
		```
		public [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getSeenOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		
		Specified by:
		`[getSeenOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getSeenOrBuilder(int))` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		- #### hasObsoleteTime
		
		
		
		```
		public boolean hasObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Specified by:
		`[hasObsoleteTime](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#hasObsoleteTime())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		Whether the obsoleteTime field is set.
		- #### getObsoleteTime
		
		
		
		```
		public long getObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Specified by:
		`[getObsoleteTime](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html#getObsoleteTime())` in interface `[ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder](ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")`
		Returns:
		The obsoleteTime.
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.nio.ByteBuffer data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(byte[] data,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(java.io.InputStream input,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input)
		                                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseDelimitedFrom​(java.io.InputStream input,
		                                                                              akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                                       throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                                     akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                              throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilder​([ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html)*